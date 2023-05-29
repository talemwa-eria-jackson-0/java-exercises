class BicycleRegistration {
    public static void main(String[] args) {
        //from Bicycle class
        Bicycle bike1, bike2, bike;
        bike1 = new Bicycle();
        bike2 = new Bicycle();
        bike = new Bicycle();

        //using Bicycle() methods to set and get names of bicycle owners
        bike1.setOwnerName("Cyber Venom");
        bike2.setOwnerName("Talemwa Eria Jackson");

        System.out.println(bike1.getOwnerName() + " owns a bicyle");
        System.out.println(bike2.getOwnerName() + " also owns a bicycle");
        System.out.println(bike.getTagNo("2004-134R") + " is the bicycle's tag");
    }    
}
