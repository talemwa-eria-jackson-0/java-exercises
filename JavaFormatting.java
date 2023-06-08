/*
 * class demonstrating how to format data in java ie
 * %s for string, %d for integers and %f for doubles and floats
 * indicating the number of decimal places within float, we add it between % and f ie to display a nmber with 4 decimal places ==> %.4f
 * indicating the number of blank spaces before or after the number, we also add it between % and d or f ie
 * for blank spaces before the number ie 5 blank spaces,  ==> %+5.2f, represnts the nmber will have a width of 5 and 2 decimal places but blank spaces are put before the number. ==> %-8.3f, means the number will have a width of 8 and 3 decimal places but the blank spaces are placed after the number
 */

class JavaFormatting {
    public static void main(String[] args) {
        int num = 3467;
        double number = 3456.7633737;
        String str = "cyber";

        
        System.out.printf("My lucky number is: %d", num);
        System.out.printf("\nMy lucky number with decimal places: %.2f", number);
        System.out.printf("\nMy name with front blank spaces: %10s", str);
        System.out.printf("\nMy name with trailing blank spces is %-15s and my age with front blank spaces is %8.4f", str, number);
    }
}
