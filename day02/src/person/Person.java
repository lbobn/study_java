package person;

import tool.Calculator;

public class Person {
    String name;
    String sex;
    int age;

    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    //与生俱来
    static void eat() {
        System.out.println("吃饭");
    }

    //与生俱来
    static void sleep() {
        System.out.println("睡觉");
    }

    //后天得到或学到的
    public void playGame() {
        System.out.println("打游戏");
    }

    public void useCalculator() {
        Calculator a = new Calculator(1, 2, 3, 4);
        a.add();
        a.jianfa();
        a.chengfa();
        a.chufa();
    }
}
