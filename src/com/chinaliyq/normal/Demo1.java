package com.chinaliyq.normal;

import com.chinaliyq.game.Boss;
import com.chinaliyq.game.Hero;
import com.chinaliyq.normal.SingleDemo;

import java.io.*;
import java.util.*;

/**
 * @author 李亚奇
 * @version 1.0
 * @desc TODO
 * @date 2021/2/19 22:10
 * @copyright liyq
 * @address 成都西部国际金融中心2栋2201
 **/
public class Demo1 {
    public static final String STRINGA = "";
    /*private static final */


    public static void main(String[] args) {

//        validateDigit();
//        stringConstantPool();
//        StringBuilder sbl = new StringBuilder();
//        StringBuffer sbf = new StringBuffer();
//        SingleDemo demo1 = SingleDemo.getInstance();
//        SingleDemo demo2 = SingleDemo.getInstance();
//        System.out.println(demo1==demo2);
//        Random random = new Random();
//        int i = random.nextInt(4);
//        System.out.println(i);
//        writeFiction(5000,8000);
//            readerFiction();
//        writerHero();
        readerHero();
        int a = 7;
        System.out.println(a);
        System.out.println(a);
        System.out.println("a = " + a);
        System.out.println("Demo1.main");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("args = " + Arrays.deepToString(args));
        if (args == null) {

        }
        if (args != null) {

        }

    }

    /**
     *
     */
    private static void writerHero(){
        String str = "src/com/chinaliyq/normal/hero.txt";
         Hero hero1 = new Boss(new String[]{"中间件1","55","666"}, "男1", 10, 61);
         Hero hero2 = new Boss(new String[]{"中间件2","55","666"}, "男2", 20, 62);
         Hero hero3 = new Boss(new String[]{"中间件3","55","666"}, "女1", 30, 63);
         Hero hero4 = new Boss(new String[]{"中间件4","55","666"}, "女2", 40, 64);
         List<Hero> heros = Arrays.asList(hero1,hero2,hero3,hero4);
        System.out.println(heros);
        try(PrintWriter printWriter = new PrintWriter(new FileWriter(str))){
            for (Hero hero :
                    heros) {
                printWriter.printf("%s\t%s\t%d\t%d",Arrays.toString(hero.getName()),hero.getSex(),hero.getHp(),hero.getAttack());
                printWriter.println();
            }
            printWriter.flush();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private static void changFormate(String[] strs){
        for (int i = 0; i < strs.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.get

        }
    }

    private static void readerHero(){
        String str = "src/com/chinaliyq/normal/hero.txt";
        List<Hero> heros = new ArrayList<>();
        try(Scanner in = new Scanner(new FileReader(str))){
            while(in.hasNext()){
                Boss boss = new Boss();
                String strs =in.nextLine();
                System.out.println(strs);
                boss.setName(strs.replaceAll("[\\[\\]]","").split(","));
                boss.setSex(in.next());
                boss.setHp(Integer.valueOf(in.next()));
                boss.setAttack(Integer.valueOf(in.next()));
                heros.add(boss);
                if(in.nextLine()!=null){
                    in.nextLine();
                }
            }
            System.out.println(heros);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void writeFiction(Integer min,Integer max){
        String path = "src/com/chinaliyq/normal/fiction.txt";
        Random rand = new Random();
        int length = rand.nextInt(max-min)+min;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char ch = (char)(rand.nextInt(0x9fa5-0x4e00)+0x4e00);
            stringBuilder.append(ch);
            if (i>0 && (i+1) % 20==0){
                stringBuilder.append("\n");
            }
        }
        try (
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))
                ){
            bufferedWriter.newLine();
            bufferedWriter.write(stringBuilder.toString());
            bufferedWriter.flush();
            System.out.println("小说成功！");
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    private static void readerFiction(){
        String path2 = "src/com/chinaliyq/normal/fiction.txt";
        String str = "";
        try(BufferedReader bufReader = new BufferedReader(new FileReader(path2));){
            while((null != (str = bufReader.readLine()))){
                System.out.println(str);
            }

        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
//    static class SingleDemo{
//        private static SingleDemo singleDemo;
//        private static Integer count = 0;
//
//        public static SingleDemo getInstance(){
//            System.out.println(++count);
//            if (null == singleDemo){
//                singleDemo = new SingleDemo();
//            }
//            return singleDemo;
//        }
//    }

    /**
     * 常量池使用
     */
    private static void stringConstantPool(){
        String text1 = "天地一色";
        String text2 = "天地一色";
        String card1 = "88";
        String card2 = "88";
        System.out.println(text1 == text2);
        System.out.println(card1 == card2);
        String word1 = new String("天地一色T");
        String word2 = new String("天地一色T");
        System.out.println(word1 == word2);

    }

    /**
     * 验证数值
     */
    private static void validateDigit() {
        System.out.println("Holle Wrold");
        System.out.println("请输入一个字符来判断是否是纯数字：jkkk");
        Scanner input = new Scanner(System.in);
        String s = input.next();
        boolean isDigit = true;
        for (int i = 0; i < s.length(); i++) {
            if (!isDigit(s.charAt(i))){
                isDigit = false;
                break;
            }
        }
        if (isDigit){
            System.out.println("此时是一个纯数字");

        }else {
            System.out.println("不是一个纯数字");
        }
    }

    /**
     * 验证
     * @param ch
     * @return
     */
    public static boolean isDigit(char ch){
        return ch >= '0' && ch <= '9';
    }
}
