package chapter1;

/**
 * 第一章节的引论。主要一些引言、是针对于数学公式的复习与推论、解释。
 * @author ForteScarlet <[email]ForteScarlet@163.com>
 * @since JDK1.8
 **/
public class 引论 {

    /*
     * 1.2 数学知识复习
     * 1.2.1 指数
     * 1.2.2 对数
     * 1.2.3 级数
     * 1.2.4 模运算
     *
     * 1.3 递归简论
     *
     *
     */


    public static void main(String[] args) {
        fun_1_2_4_mod1();
    }

    /**
     * 1.2.4 模运算
     */
    public static void fun_1_2_4_mod1(){
        // 如果N 整除 A - B, 则说A与B模N同余
        double N = 10;
        double A = 13;
        double B = 3;
        System.out.println(N / (A - B));
        System.out.println(A % N);
        System.out.println(B % N);

        // a % b, if a > b, 取余。if a < b, return a

        System.out.println(1 % 100);
        System.out.println(2 % 100);
        System.out.println(3 % 100);
        System.out.println(4 % 100);
        System.out.println(5 % 100);
        System.out.println(6 % 100);

        // A / 13 == B / 13 (mod 10)
        System.out.println(N / ((A / 13) - (B / 13)));

    }

    /**
     * 1.3的例子，华氏度转摄氏度
     */
    public static void fun_1_3_fahrenheit_to_celsius(){
        // C = 5(F - 32)/9
    }



}
