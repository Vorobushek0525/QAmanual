package examples.oop;

public class Cat {
    String name;
    String color;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }

    }

    // полиморфизм (содержит метод "конструктор")
    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public Cat() {}

    String meow () {
        return "Meow! I am " + name + " with " + color + " color. And I'm " +
                + age + " years old ";
    }

    void eat (String food, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(" I'm eating " + food + " ... ");
        }
    }

}
