class Animal {
    public void eat() {
        System.out.println("动物正在吃东西");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("狗正在叫");
    }
}

public class HelloWorld {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
        final int a = 10;
        System.out.println(a);
        try {
            int x = 10 / 0;  // 抛出异常
        } catch (Exception e) {
            System.out.println("发生了异常：" + e.getMessage());
        } finally {
            System.out.println("finally 块被执行");
        }
    }
}