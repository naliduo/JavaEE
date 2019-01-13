package main.reflect;

import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

public class Reflect {
  public static void main(String[] args) {
    try {
      // 1.泛型类型擦除
      // fanxingDemo();
      // 2.用反射去创建一个对象，有两种方式，尽量用代码体现
      // newObject1();
      // newObject2();
      // 3.编写一个类，增加一个实例方法用于打印一条字符串。并使用反射手段创建该类的对象，并调用该对象中的方法(两种实现方式)
      // callMethod1();
      // callMethod2();
      // 4.编写一个类A，增加一个实例方法printString,用于打印一条字符串，再编写一个类TestA，作为客户端，用键盘输入一个字符串，
      // 该字符串就是类A的全名，使用反射机制创建该类的对象，并调用该对象中的方法printString
      // dynamicCallMethod();
      // 5.写一个方法，此方法可将obj对象中名为propertyName的属性的值设置为value.
      // changePropertValue("name", "小明");
      // changePropertValue("age",11);
      // changePropertValue("subject", new String[] {"11"});
      // 6.定义一个标准的JavaBean，名叫Person，包含属性name、age。使用反射的方式创建一个实例、调用构造函数初始化name、age，
      // 使用反射方式调用setName方法对名称进行设置，不使用setAge方法直接使用反射方式对age赋值。
      // processShuXing();
      // 7.(1)写一个Properties格式的配置文件，配置类的完整名称。
      // (2) 写一个程序，读取这个Properties配置文件，获得类的完整名称并加载这个类，
      // (3)用反射 的方式运行配置的方法。
      // run();
      // 8. 写一个方法，此方法可以获取obj对象中名为propertyName的属性的值
      // getObjectProperty1();
      getObjectProperty2(new Person("小明", 11), "age");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  // region 1.泛型类型擦除
  private static void fanxingDemo() throws Exception {
    ArrayList<String> strings = new ArrayList<>();
    strings.add("begin");
    Class c = Class.forName("java.util.ArrayList");
    Method method = c.getMethod("add", Object.class);
    method.invoke(strings, 20);
    Method remove = c.getMethod("remove", Object.class);
    remove.invoke(strings, 20);

    for (Object obj : strings) {
      System.out.println(obj);
    }
  }
  // endregion

  // region 2.用反射去创建一个对象，有两种方式，尽量用代码体现
  private static void newObject1() throws Exception {
    Class c = Class.forName("main.reflect.Person");
    Constructor constructor = c.getConstructor(String.class, int.class);
    Object instance = constructor.newInstance("小明", 20);
    System.out.println(instance);
    System.out.println(((Person) instance).age + ((Person) instance).name);
  }

  private static void newObject2() throws Exception {
    Class c = Class.forName("main.reflect.Person");
    Object instance = c.newInstance();
    System.out.println(instance);
    System.out.println(((Person) instance).age + ((Person) instance).name);
  }

  // endregion

  // region 3.编写一个类，增加一个实例方法用于打印一条字符串。并使用反射手段创建该类的对象，并调用该对象中的方法
  private static void callMethod1() throws Exception {
    Class c = Class.forName("main.reflect.Person");
    Object instance = c.newInstance();
    ((Person) instance).printString();
  }

  private static void callMethod2() throws Exception {
    Class c = Class.forName("main.reflect.Person");
    Object instance = c.newInstance();
    Method method = c.getMethod("printString");
    method.invoke(instance);
  }

  // endregion

  // region 4.编写一个类A，增加一个实例方法printString,用于打印一条字符串，再编写一个类TestA，作为客户端，用键盘输入一个字符串，
  // 该字符串就是类A的全名，使用反射机制创建该类的对象，并调用该对象中的方法printString
  private static void dynamicCallMethod() throws Exception {
    Scanner s = new Scanner(System.in);
    System.out.println("输入一个类的全名：");
    Class c = Class.forName(s.nextLine());
    Object instance = c.newInstance();
    Method method = c.getMethod("printString");
    method.invoke(instance);
  }
  // endregion

  // region 5.写一个方法，此方法可将obj对象中名为propertyName的属性的值设置为value.
  private static void changePropertValue(String propertyName, String[] value) throws Exception {
    Class c = Class.forName("main.reflect.Person");
    Object instance = c.newInstance();
    Field field = c.getDeclaredField(propertyName);// 获得包括私有和公有的属性
    field.setAccessible(true);// 必须配合它属性才能被修改
    field.set(instance, value);
    System.out.println(((Person) instance).subject[0]);
  }
  // endregion

  // region 6.定义一个标准的JavaBean，名叫Person，包含属性name、age。使用反射的方式创建一个实例、调用构造函数初始化name、age，
  // 使用反射方式调用setName方法对名称进行设置，不使用setAge方法直接使用反射方式对age赋值。
  private static void processShuXing() throws Exception {
    Class c = Class.forName("main.reflect.Person");
    Constructor constructor = c.getConstructor(String.class, int.class);
    Object instance = constructor.newInstance("小明", 11);
    System.out.println(((Person) instance).age + ((Person) instance).name);
    Method setName = c.getMethod("setName", String.class);
    setName.invoke(instance, "小黑");
    System.out.println(((Person) instance).name);
    ((Person) instance).age = 12;
    System.out.println(((Person) instance).age);
  }

  // endregion

  // region 7.(1)写一个Properties格式的配置文件，配置类的完整名称。
  // (2) 写一个程序，读取这个Properties配置文件，获得类的完整名称并加载这个类，
  // (3)用反射 的方式运行配置的方法。
  private static void run() throws Exception {
    Properties pro = new Properties();
    FileReader fileReader = new FileReader("config.properties");
    pro.load(fileReader);
    fileReader.close();

    String className = pro.getProperty("ClassName");
    String methodName = pro.getProperty("MethodName");
    Class c = Class.forName(className);
    Method method = c.getMethod(methodName);
    Object instance = c.newInstance();
    method.invoke(instance);
  }
  // endregion

  // region 8. 写一个方法，此方法可以获取obj对象中名为propertyName的属性的值
  private static void getObjectProperty1() throws Exception {
    Class c = Class.forName("main.reflect.Person");
    Constructor constructor = c.getConstructor(String.class, int.class);
    Object instance = constructor.newInstance("小明", 11);
    System.out.println(((Person) instance).name);
  }

  private static void getObjectProperty2(Object obj, String propertyName) throws Exception {
    Class c = obj.getClass();
    // Field[] fields = c.getDeclaredFields();
    Field declaredField = c.getDeclaredField(propertyName);
    declaredField.setAccessible(true);
    Object o = declaredField.get(obj);
    System.out.println(o);
  }
  // endregion
}
