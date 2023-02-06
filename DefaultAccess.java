class DefaultAccess {
  void message() {
    System.out.println("This is a message");
  }

  public static void main(String[] args) {
    DefaultAccess df = new DefaultAccess();
    df.message();
  }
}