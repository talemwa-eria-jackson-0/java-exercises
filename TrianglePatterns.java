/*
 * program to display the triangle patterns
 * ie right angled triangle on the right and left side
 * also for south and north
 */

class TrianglePatterns {
    public static void main(String[] args) {
        int width, length;
        System.out.print("        5         10        15        20       25");
        System.out.println("\n");
        for (width = 11; width <= 20; width++) {
            for (length = 5; length<=25; length += 5 ) {
                int price = width * length * 19;
                System.out.print(width + "    " + price);
            }
            System.out.println();
        }

    }
}
