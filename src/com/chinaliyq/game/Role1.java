package com.chinaliyq.game;

/**
 * @author 李亚奇
 * @version 1.0
 * @desc TODO
 * @date 2021/2/20 19:09
 * @copyright liyq
 * @address 成都西部国际金融中心2栋2201
 **/
public class Role1 extends Hero {
    @Override
    public boolean canFightByDistance(Hero hero) {
        return hero.getHp()>0 && this.getHp()>0;
    }

    @Override
    public void fight(Hero hero) {
        int lastBLood =hero.getHp()-this.getAttack();
        if (lastBLood > 0){
            hero.setHp(lastBLood);
            System.out.println("角色1攻击Boss,伤害为"+this.getAttack()
                    +"BoSS剩余血量为："+lastBLood);
        }else {
            hero.setHp(0);
            System.out.println("角色1攻击Boss,伤害为"+this.getAttack()
                    +"BoSS剩余血量为：0");
            System.out.println("********* **** *******");
            System.out.println("****** *玩家胜利* *****");
            System.out.println("******** ***** *******");
        }
    }

    public Role1(int hp, int attack) {
        super(hp, attack);
    }

    public Role1() {
    }
}
