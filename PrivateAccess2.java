class PingAccessBean {
    private String name;

    // getter method
    public String getName() {
        return this.name;
    }
    // setter method
    public void setName(String name) {
        this.name= name;
    }
}

class PingAccess2 {
    public static void main(String[] main){
        PingAccessBean d = new PingAccessBean();

        // access the private variable using the getter and setter
        d.setName("Programiz");
        System.out.println(d.getName());
    }
}