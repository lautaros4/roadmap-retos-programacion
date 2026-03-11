import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class lautaros4 {

    public static class Contact{
        private String name;
        private Long phone;

        public Contact(String name, Long phone){
            this.name = name;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public Long getPhone() {
            return phone;
        }

        public void setPhone(Long phone) {
            this.phone = phone;
        }
    }

    public static class Planner{
        private HashMap<String, Contact> contactList;

        public Planner(){
            this.contactList = new HashMap<String, Contact>();
        }

        public void insert(Contact contact){
            contactList.putIfAbsent(contact.getName(), contact);
        }

        public void delete(String name){
            contactList.remove(name);
        }

        public void update_phone(String name, Long phone){
            Contact contact = contactList.get(name);
            contact.setPhone(phone);
        }

        public void search(String name){
            Contact contact = contactList.get(name);
            System.out.println("The phone number of " + contact.getName() + " is " + contact.getPhone());
        }

    }

    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);
        Planner planner = new Planner();

        boolean exit = false;

        while(!exit){
            System.out.println("-------Options-------");
            System.out.println("1-- Insert Contact");
            System.out.println("2-- Delete Contact");
            System.out.println("3-- Update Contact");
            System.out.println("4-- Search Contact");
            System.out.println("5-- Exit");
            System.out.println("Insert choice: ");
            String option = terminal.nextLine();

            switch (option){
                case "1": {
                    System.out.println("Insert name: ");
                    String name = terminal.nextLine();
                    System.out.println("Insert phone: ");
                    String phone = terminal.nextLine();
                    var contact = new Contact(name, Long.parseLong(phone));
                    planner.insert(contact);
                    break;
                }
                case "2": {
                    System.out.println("Insert contact to be deleted: ");
                    String name = terminal.nextLine();
                    planner.delete(name);
                    break;
                }
                case "3": {
                    System.out.println("Insert contact to be updated: ");
                    String name = terminal.nextLine();
                    System.out.println("Insert new phone number: ");
                    String phone = terminal.nextLine();
                    planner.update_phone(name, Long.parseLong(phone));
                    break;
                }
                case "4": {
                    System.out.println("Insert contact to be searched");
                    String name = terminal.nextLine();
                    planner.search(name);
                    break;
                }
                case "5":
                    exit = true;
                    break;
            }
        }
    }
}
