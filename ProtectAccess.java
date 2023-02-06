class Anim {
    // protected method
    protected void display() {
        System.out.println("I am an animal");
    }
}

class ProtectAccess extends Anim {
    public static void main(String[] args) {

        // create an object of Dog class
        ProtectAccess dog = new ProtectAccess();
         // access protected method
        dog.display();
    }
}