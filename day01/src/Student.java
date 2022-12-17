public class Student {
    String name;
    String sex;
    Long height;
    Long Stu_num;
    String Id;
    int age;
    Boolean is_girlorboy;
    int class_id;


    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
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

    public Long getHeight() {
        return height;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public Long getStu_num() {
        return Stu_num;
    }

    public void setStu_num(Long stu_num) {
        Stu_num = stu_num;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getIs_girlorboy() {
        return is_girlorboy;
    }

    public void setIs_girlorboy(Boolean is_girlorboy) {
        this.is_girlorboy = is_girlorboy;
    }


    //与生俱来
    static  void eat(){
        System.out.println("吃饭");
    }
    //与生俱来
    static  void sleep(){
        System.out.println("睡觉");
    }
    //后天得到或学到的
     public void playGame(){
        System.out.println("打游戏");
    }
}
