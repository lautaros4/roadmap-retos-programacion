public class lautaros4 {

    static int X = 24;
    public static void noParametersNeitherReturn(){
        System.out.println("This functions does not receive parameters and doesn't have return");
    }

    public static int ParametersAndReturn(int a, int b){
        return a + b;
    }

    public static void test(){
        int Variablelocal=89;
        System.out.println(ParametersAndReturn(X, 78) + Variablelocal);
    }

    public static int HarderExercise(String a, String b){
        int j=0;
        for(int i=1; i<=100; i++){
            if(i%3==0 && i%5==0){
                System.out.println(a+b);
            } else if (i%3 == 0) {
                System.out.println(a);
            } else if (i%5==0) {
                System.out.println(b);
            }else{
                System.out.println(i);
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        noParametersNeitherReturn();
        System.out.println(ParametersAndReturn(8,9));
        test();
        System.out.println("Number of numbers instead of text: " + HarderExercise("Harry Potter", "Agatha Christie"));
    }
}
