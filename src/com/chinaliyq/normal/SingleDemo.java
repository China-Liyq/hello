package com.chinaliyq.normal;

/**
 * @author 李亚奇
 * @version 1.0
 * @desc TODO
 * @date 2021/2/20 19:01
 * @copyright liyq
 * @address 成都西部国际金融中心2栋2201
 **/
public class SingleDemo {
    private static SingleDemo singleDemo;
    private static Integer count = 0;

    public static SingleDemo getInstance(){
        System.out.println(++count);
        if (singleDemo == null){
            singleDemo = new SingleDemo();
        }
        return singleDemo;
    }
}
