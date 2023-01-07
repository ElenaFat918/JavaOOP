public abstract class Family {
    
    private String children;
    private String wife;
    private String husband;

    public Family(String husband, String wife,  String children) {
        this.husband = husband;
        this.wife = wife;
        this.children = children;
    }

    public String getHusband() {
        return husband;
    }

    public void setHusband(String fullName) {
        this.fullName = fullName;
    }

}
