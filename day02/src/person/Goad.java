package person;

public class Goad {
    public static void main(String[] args) {
        Person lbb = new Person("卢博斌", "男", 19);
        System.out.println(lbb.getName());
        System.out.println(lbb.sex);
        System.out.println(lbb.age);
        lbb.playGame();
        Person.eat();
        Person.sleep();

        //使用计算器
        lbb.useCalculator();


    }
}
