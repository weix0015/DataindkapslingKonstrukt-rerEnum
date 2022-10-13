package demo1dataindkapsling;

public class Person {
  private String name;
  private boolean isAlive;

  public void isAlive(boolean isAlive) {

    this.isAlive = isAlive;
  }

  public boolean isAlive() {

    return isAlive;
  }

  public void setName(String name) {
    if (name.equals(""))
      this.name = "[Unknown]";
    else
      this.name = name;
  }

  public String getName() {

    return name;
  }
}

class Test {
  public static void main(String[] args) {
    Person p = new Person();
    p.setName("");
    System.out.println(p.getName());

    p.isAlive(true);
    System.out.println(p.isAlive());
  }
}