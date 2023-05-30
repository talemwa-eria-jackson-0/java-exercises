/*
 * this class contains info about the student's library info
 */

class LibraryCard {
    private String cardOwner;           //which student owns the card
    private int borrowedBooks;          //number of books borrowed by the card owner

    public void LibraryCard() {
        cardOwner = "unassigned";
        borrowedBooks = 0;
    }

    //how many books were checked out
    public void CheckOut(int numOfBooks) {
        borrowedBooks = numOfBooks;
    }

    //results the number of books borrowed
    public int getNumberOfBooks() {
        return borrowedBooks;
    }

    //results name of he card owner
    public String getOwnerName() {
        return cardOwner;
    }

    //sets name of the card owner
    public void setOwnerName(Student student) {
        cardOwner = student.getName();
    }

    //outputs info in an organisation manner
    public String toString(Student student) {
        return "Owner Name:\t\t" + student.getName() + 
                "Owner Email:\t\t" + student.getEmail() +
                "Borrowed books:\t" + borrowedBooks;
    }
    
}
