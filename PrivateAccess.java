class Data {
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

class PrivateAccess {
    // private variable
    private String name;

    public static void main(String[] main){

        // create an object of Data
        Data d = new Data();

        // access private variable and field from another class
      // d.name = "Programiz";
      
    }
}
// how to resolve it.
// using setters and get method.
