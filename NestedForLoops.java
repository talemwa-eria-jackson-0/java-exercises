/*
 * program to demonstrate a simple example of nested for loops
 */

class NestedForLoops {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=0; i<5; i++) {
            sum = sum + i;
            for (int j=5; i>0; i--) {
                sum = sum + j;
            }
        }
        System.out.println(sum);
    }
}
