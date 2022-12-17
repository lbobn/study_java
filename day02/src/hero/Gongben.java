package hero;

public class Gongben {
    String name;
    String sex;
    double gjl;
    double fyl;
    int bloodNum;
    boolean isopen = true;

    public Gongben(String name, String sex, double gjl, double fyl, int bloodNum) {
        this.name = name;
        this.sex = sex;
        this.gjl = gjl;
        this.fyl = fyl;
        this.bloodNum = bloodNum;
    }

    public double getGjl() {
        return gjl;
    }

    public double getFyl() {
        return fyl;
    }

    public int getBloodNum() {
        return bloodNum;
    }

    public void firstAction() {
        System.out.println("===================================");
        System.out.println(this.name + "发动了一技能");
        this.gjl = this.gjl + 100.0;
        this.fyl = this.fyl + 200.0;
        System.out.println("当前" + this.name + "的攻击力" + this.gjl);
        System.out.println("当前" + this.name + "的防御力" + this.fyl);
        System.out.println("===================================");
    }

    public void secondAction() {
        System.out.println("===================================");
        System.out.println(this.name + "发动了二技能");
        this.gjl = this.gjl + 500.0;
        this.fyl = this.fyl + 200.0;
        System.out.println("当前" + this.name + "的攻击力" + this.gjl);
        System.out.println("当前" + this.name + "的防御力" + this.fyl);
        System.out.println("===================================");
    }

    public void thirdAction() {
        System.out.println("===================================");
        System.out.println(this.name + "发动了三技能");
        this.gjl = this.gjl + 800.0;
        this.fyl = this.fyl + 300.0;
        System.out.println("当前" + this.name + "的攻击力" + this.gjl);
        System.out.println("当前" + this.name + "的防御力" + this.fyl);
        System.out.println("===================================");
    }

    public void norAction(){
        System.out.println(this.name+"平A");
    }

    public void beiDongAction() {
        while (this.isopen) {
            if (this.bloodNum < 1000) {
                System.out.println(this.name + "触发被动");
                this.bloodNum = this.bloodNum + 1000;
                this.isopen = false;
                System.out.println(this.name+"当前血量"+this.bloodNum);
            } else {
                System.out.println(this.name + "满血");
            }
        }
    }

    public void kouXue(double num) {
        System.out.println(this.name+"被打");
        this.bloodNum = this.bloodNum - (int) num / 2;
        if (this.bloodNum < 0) {
            System.out.println(this.name + "死亡，游戏结束");
        }
        System.out.println(this.name+"当前血量"+this.bloodNum);
    }


}
