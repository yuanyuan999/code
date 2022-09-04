import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println("world hello!");
        //定义一个变量
        int a = 10;
        System.out.println(a);
        //定义一个常量
        final int two = 10;
        //two = 20; 报错！
        System.out.println(two);
        //byte字节型
        byte by = 123;
        System.out.println(by);
        //short短整型
        short ba = 12333;
        System.out.println(ba);
        //int 整数型
        int bb = 2100000;
        System.out.println(bb);
        //long 长整型
        long bc = 2000000000;
        System.out.println(bc);
        //超长比42亿以上还要大，数字末尾要加小写l或者大写L
        long bd = 99999_99999_99999L;  //java过长的数字可以用下划线来隔开
        System.out.println(bd);
        //超出byte值
        BigInteger be = new BigInteger("18230918309128390183091283");   //BigInteger不可以用下划线来隔开
        System.out.println(be);
        //字符，单个字符
        char bf = '中';
        System.out.println(bf);
        String bg = "我是一段字符串";
        System.out.println(bg);
        System.out.println("ni hao ");
        char bh = 'a';
        System.out.println((short) bh);
        //单精度浮点型
        float bj = (float) 1.2;
        System.out.println(bj);
        //双精度浮点型
        double bk = 3.14159265358979;
        System.out.println(bk);
        //巨长的浮点型
        BigDecimal bi = new BigDecimal("31231.1231231231");
        System.out.println(bi);
        //隐式类型转换，输出9.0
        byte c1 = 9;
        short c2 = c1;
        int c3 = c2;
        long c4 = c3;
        float c5 = c4;
        double c6 = c5;
        System.out.println(c6);
        //显示类型转换，输出-128
        int c7 = 128;
        byte c8 = (byte) c7;
        System.out.println(c8);
        //数据类型被自动提升，需要定义一下数据类型
        byte c9 = 105;
        c9 = (byte) (c9 + 1);
        System.out.println(c9);
        int a1 = 2;
        int a2 = 3;
        int a3 = a1 + a2;
        System.out.println(a3);
        String b1 = "你好";
        String b2 = "世界";
        System.out.println(b1 + b2);
        int d1 = 1;
        int d2 = 3;
        System.out.println(d1 + d2 + b1);   //正常输出整数相加结果
        System.out.println(b2 + (d1 + d2)); //正常输出整数相加结果
        System.out.println(b2 + d1 + d2);   //无法正常输出整数相加的结果
        int a4 = 10;
        int a5 = 4;
        boolean a6 = a4 > a5;
        System.out.println(a6);             //算数运算符
        int a7 = 10;
        int a8 = 3;
        boolean x1 = a7 > a8 && a8 < a7;
        System.out.println(x1);
        boolean x2 = a7 > a8 && a8 > a7;
        System.out.println(x2);
        boolean x3 = a7 > a8 || a8 > a7;
        System.out.println(x3);
        boolean x4 = a7 < a8 || a8 > a7;
        System.out.println(x4);
        boolean x5 = !(a7 > a8);
        System.out.println(x5);
        boolean x6 = !(a8 > a7);
        System.out.println(x6);
        int a10 = 7 , b3 = 14;
        System.out.println(a10 | b3);
        int q1 = 4, q2 = 3;
        String str = q1 > q2 ? "行" : "不行";
        System.out.println("汉堡做的行不行？" + str);
    }
}