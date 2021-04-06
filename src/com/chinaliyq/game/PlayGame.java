package com.chinaliyq.game;

/**
 * @author 李亚奇
 * @version 1.0
 * @desc TODO
 * @date 2021/2/20 19:18
 * @copyright liyq
 * @address 成都西部国际金融中心2栋2201
 **/
public class PlayGame implements Runnable{
    private static Role1 role1;
    private static Boss boss;
    private static int count = 0;
    public static void main(String[] args) {
        role1 = new Role1(1000, 50);
        boss = new Boss(1000, 50);
        new Thread(new PlayGame()).start();

    }

    @Override
    public void run() {
        while (role1.getHp()>0&& boss.getHp()>0){

            System.out.println("\n第"+(++count)+"回合");
            role1.PK(boss);
            boss.PK(role1);
            System.out.println("角色1状态："+role1);
            System.out.println("boss状态："+boss+"\n");
        }
    }
}
