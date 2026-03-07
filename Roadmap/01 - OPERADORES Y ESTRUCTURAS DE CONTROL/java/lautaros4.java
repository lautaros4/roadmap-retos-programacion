public class lautaros4 {

    static void main(String[] args) {
        int x = 10;
        int y = 7;

        System.out.println("Operadores a nivel de bits: operan con cada bit del operando, ofreciendo un control más granular sobre los datos.");

        System.out.println();

        System.out.println("x : " + Integer.toBinaryString(x));
        System.out.println("y : " + Integer.toBinaryString(y));

        System.out.println();

        System.out.println("X AND y : " + Integer.toBinaryString(x & y));
        System.out.println("x OR y : " + Integer.toBinaryString(x | y));
        System.out.println("x XOR y : " + Integer.toBinaryString(x ^ y));
        System.out.println("Complemento de x = " + Integer.toBinaryString(~x));
        System.out.println("Complemento de y = " + Integer.toBinaryString(~y));
        System.out.println("Desplazamiento de bits de x a la izquierda de y: " + Integer.toBinaryString(x<<y));
        System.out.println("Desplazamiento de bits de x a la derecha de y: " + Integer.toBinaryString(x>>y));
        System.out.println("Desplazamiento de bits de x a la derecha de y (sin signo): " + Integer.toBinaryString(x>>>y));

        for (int i = 10; i <= 55; i++) {
            if (i%2==0 && i!=16 && i%3!=0){
                System.out.println(i);
            }
        }

    }
}
