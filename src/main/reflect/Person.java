package main.reflect;

public class Person {

  public String name;
  public int age;
  public String[] subject;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String[] getSubject() {
    return subject;
  }

  public void setSubject(String[] subject) {
    this.subject = subject;
  }

  public Person() {}

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void printString() {
    System.out.println("打印了一条字符串");
  }
}
