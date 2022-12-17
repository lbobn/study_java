public class Goad {
    public static void main(String[] args) {
        Student lbb =new Student();
        lbb.setName("lubobin");
        lbb.setHeight(185L);
        lbb.setAge(20);
        lbb.setClass_id(2);
        lbb.setId("66112626");
        lbb.setSex("男");
        lbb.setIs_girlorboy(true);
        lbb.setStu_num(2183489157L);
        lbb.playGame();
        Student.eat();
        Student.sleep();

        System.out.println(lbb.getName());
        System.out.println(lbb.getHeight() );
    }
}
