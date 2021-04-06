package com.chinaliyq.game;

import java.util.Arrays;

/**
 * @author 李亚奇
 * @version 1.0
 * @desc TODO
 * @date 2021/2/20 19:04
 * @copyright liyq
 * @address 成都西部国际金融中心2栋2201
 **/
public abstract class Hero {

    private String[] name;
    private String sex;
    private int hp;
    private int attack;

    public abstract boolean canFightByDistance(Hero hero);



    public abstract void fight(Hero hero);
    @Override
    public String toString() {
        return "Hero{" +
                "name=" + Arrays.toString(name) +
                ", sex='" + sex + '\'' +
                ", hp=" + hp +
                ", attack=" + attack +
                '}';
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public Hero(String[] name, String sex, int hp, int attack) {
        this.name = name;
        this.sex = sex;
        this.hp = hp;
        this.attack = attack;
    }

    public void PK(Hero hero){
        if (canFightByDistance(hero)&& hp > 0 && hero.hp > 0){
            fight(hero);
        }
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Hero(int hp, int attack) {
        this.hp = hp;
        this.attack = attack;
    }

    public Hero() {
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

}
