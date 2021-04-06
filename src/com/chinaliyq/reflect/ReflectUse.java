package com.chinaliyq.reflect;

import com.chinaliyq.game.Hero;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 李亚奇
 * @version 1.0
 * @desc TODO
 * @date 2021/2/26 20:46
 * @copyright liyq
 * @address 成都西部国际金融中心2栋2201
 **/
public class ReflectUse {
    public static void main(String[] args) {
        Class<Hero> heroClass = Hero.class;
        String s = heroClass.getConstructors().toString();
        System.out.println(s);
        Method[] methods = heroClass.getMethods();
        List<Method> methods1 = Arrays.asList(methods);
        ArrayList<String> arrayList = new ArrayList();
//        for (Method m:methods
//             ) {
//            System.out.println(m);
//        }
    }
}
