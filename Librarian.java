

class Librarian {
    public static void main(String[] args) {
        Student student = new Student();
        LibraryCard card1 = new LibraryCard();
        LibraryCard card2 = new LibraryCard();

        student.setName("Cyber Venom");
        student.setEmail("cy.venom.11@gmail.com");

        card1.setOwnerName(student);
        card1.CheckOut(4);

        card2.setOwnerName(student);

        System.out.println("Card1 Info::");
        System.out.println(card1.toString());

        System.out.println("Card1 Info");
        System.out.println(card2.toString());
    }    
}
