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
        long bd = 999999999999999L;
        System.out.println(bd);
    }
}
