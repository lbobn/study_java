package background;

import hero.Gongben;
import hero.Yase;

public class Game {
    public static void main(String[] args) {
        Yase yase=new Yase("亚瑟","男",200.0,100.0,2000);
        Gongben gongben=new Gongben("宫本","男",200.0,100.0,2000);

        //写剧本
        //亚瑟发动一技能攻击宫本
        yase.firstAction();
        System.out.println("宫本被打");
        gongben.kouXue(yase.getGjl());
        //宫本生气，发动三技能
        gongben.thirdAction();
        yase.kouXue(gongben.getGjl());
        //宫本发动二技能
        gongben.secondAction();
        yase.kouXue(gongben.getGjl());
        //亚瑟被动
        yase.beiDongAction();
        boolean open=true;
        while(open){
            gongben.norAction();
            yase.kouXue(gongben.getGjl()-yase.getFyl());
            if(yase.getBloodNum()<0){
                System.out.println("宫本息怒");
                System.out.println("亚瑟被KILL");
                open=false;
            }
        }












    }
}
