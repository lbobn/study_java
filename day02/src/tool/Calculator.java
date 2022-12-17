package tool;

public class Calculator {
    int num1;
    int num2;
    int num3;
    int num4;


    public Calculator(int num1, int num2, int num3, int num4) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
    }

    public void add() {
        System.out.println("加法");
        int total = this.num1 + this.num2 + this.num3 + this.num4;
        System.out.println("加得结果为：" + total);
    }

    public void jianfa() {
        System.out.println("减法");
        int total = this.num3 - this.num4;
        System.out.println("减得结果为：" + total);
    }

    public void chengfa() {
        System.out.println("乘法");
        int total = this.num3 * this.num4;
        System.out.println("乘得结果为：" + total);
    }

    public void chufa() {
        System.out.println("除法");
        double total = (double) this.num3 / (double) this.num4;
        System.out.println("除得结果为：" + total);
    }

    /*public void useCalculator(){
        Calculator a=new Calculator(1,2,3,4);
        a.add();
    }*/


}
