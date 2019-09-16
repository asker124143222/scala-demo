/**
 * @Author: xu.dm
 * @Date: 2019/9/10 11:03
 * @Version: 1.0
 * @Description: TODO
 **/
public class JavaHello {
    public static void main(String args[]) throws Exception{
        short s = 10;
        byte b = 10;

//        s = s+s; //错误
//        b = b+b; //错误
//        s = s +b; //错误
        //指令库里只有int类型加指令，没有short和byte的，因为指令库是char，只有255个字符（指令）
        //所以s+b涉及到s和b的类型提升，返回结果是int，上面三个语句才是错误的。
        s = (short)( s +b); //强制把加结果的int类型转换成short类型

        long l1 = 100;

        b++; //b隐私转换成int类型
        System.out.println(b);


        int sLength = 18;
        for (int i = 1; i < sLength; i = i + 2) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            for (int k = (sLength-i)/2; k > 0; k--) {
                sb2.append(" ");
            }
            sb.append(sb2.toString());
            for (int j = 1; j < i + 1; j++) {
                sb.append("*");
            }
            sb.append(sb2.toString());
            System.out.println(sb.toString());
        }

    }
}
