import javax.swing.JOptionPane;

class just {
    public static void main(String[] args) {
        int i;
        int j;

        //increasing triangle
        for (i = 0; i < 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n\n");

        for (i = 0; i < 3; i ++) {
            for (j = 0; j < 2; j++) {
                System.out.print(i + "   " + j);
            }
            System.out.println("");
        }
        System.out.println("\n\n");

        // multiplication table 
        for (i = 1; i <= 10; i++) {
            for (j = 1; j <=10; j++) {
                System.out.print(i * j + "  ");
            }
            System.out.println();
        }
        System.out.println("\n\n");

        //super square
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("\n\n");

        //decreasing triangle
        for (i = 0; i < 5; i++) {
            for (j = i; j <= 5; j++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
        System.out.println("\n\n");

        // Right sided triangle 
        for (i = 0; i < 5; i++) {
            for (j = i; j <= 5; j++) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("\n\n");

        // decreasing right sided triangle
        for (i = 0; i > 5; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (j = i; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n\n");
    }
}
