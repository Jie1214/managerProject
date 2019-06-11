package com.czj.mianshi;

import java.util.Scanner;

/**
 * Created by Jie on 2019/4/23.
 *
 * @AUTHOR JIE
 * @date 2019/4/23
 */
public class wangyi {

    public static void main(String[] args) {
        System.out.println("请输入一个正整数n(1 ≤ n ≤ 10^9)");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long l = System.currentTimeMillis();
        System.out.println("结果是：" + new wangyi().magicMachineSelection(num));
        System.out.println("所用时间：" + (System.currentTimeMillis() - l));


//        System.out.println("相反数是" + new wangyi().oppositeNumber(10));
    }

    /**
     *
     * 一 获得特定数量硬币问题
     *
     * 小易准备去魔法王国采购魔法神器,购买魔法神器需要使用魔法币,但是小易现在一枚魔法币都没有,
     *
     * 但是小易有两台魔法机器可以通过投入x(x可以为0)个魔法币产生更多的魔法币。
     * 
     * 魔法机器1:如果投入x个魔法币,魔法机器会将其变为2x+1个魔法币
     * 
     * 魔法机器2:如果投入x个魔法币,魔法机器会将其变为2x+2个魔法币
     * 
     * 小易采购魔法神器总共需要n个魔法币,所以小易只能通过两台魔法机器产生恰好n个魔法币,小易需要你帮他设计一个投入方案使他最后恰好拥有n个魔法币。
     * 
     * 输入描述: 输入包括一行,包括一个正整数n(1 ≤ n ≤ 10^9),表示小易需要的魔法币数量。
     * 
     * 输出描述: 输出一个字符串,每个字符表示该次小易选取投入的魔法机器。其中只包含字符'1'和'2'。
     * 
     * 输入例子1: 10
     * 
     * 输出例子1: 122
     *
     * @param machNum
     * @return
     */
    public String magicMachineSelection(int machNum) {
        String result = "";
        int i = 0;
        if (machNum % 2 == 0) {
            i = (machNum - 2) / 2;
            result = "2";
        } else {
            i = (machNum - 1) / 2;
            result = "1";
        }
        if (i != 0) {
            String magicStr = magicMachineSelection(i);
            result = magicStr + result;
        }
        return result;
    }

    /**
     * 二 求“相反数”问题
     * 为了得到一个数的"相反数",我们将这个数的数字顺序颠倒,然后再加上原先的数得到"相反数"。例如,为了得到1325的"相反数",首先我们将该数的数字顺序颠倒,我们得到5231,之后再加上原先的数,我们得到5231+1325=6556.如果颠倒之后的数字有前缀零,前缀零将会被忽略。例如n = 100, 颠倒之后是1.
     * <p>
     * 输入描述: 输入包括一个整数n,(1 ≤ n ≤ 10^5)
     * <p>
     * 输出描述: 输出一个整数,表示n的相反数
     * <p>
     * 输入例子1: 1325
     * <p>
     * 输出例子1: 6556
     *
     * @param num
     * @return
     */
    public int oppositeNumber(int num) {
        int numCopy = num;
        String content = "";
        while (num != 0) {
            content += num % 10;
            num /= 10;
        }
        int result = new Integer(content);
        return numCopy + result;
    }
}
