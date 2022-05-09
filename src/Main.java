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
        float c5 =c4;
        double c6 = c5;
        System.out.println(c6);
        //显示类型转换，输出-128
        int c7 = 128;
        byte c8 = (byte) c7;
        System.out.println(c8);
    }
}