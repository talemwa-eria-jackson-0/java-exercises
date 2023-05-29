
class Bicycle {
    private String ownerName, tagNo;
    
    //constructor
    public Bicycle() {
        ownerName = "unassigned";
        tagNo = "unassigned";
    }

    //setting name for a bicycle owner
    public void setOwnerName(String name) {
        ownerName = name;
    }

    //getting name for bicycle owner
    public String getOwnerName() {
        return ownerName;
    }

    //getting a tag number for a bicycle
    public String getTagNo(String tag) {
        tagNo = tag;
        return tagNo;
    }
}
