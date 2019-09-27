/**
 * @Author: xu.dm
 * @Date: 2019/9/26 17:02
 * @Version: 1.0
 * @Description: TODO   多态的成员特点:
 *                     成员变量  编译时看的是左边，运行时看的左边
 *                     成员方法  编译时看的是左边，运行时看右边
 *                     静态方法  编译时看的是左边，运行时看的也是左边
 **/
public class PoymorphicDemo {
    public static void main(String args[]){
        Dad d = new Kid();
        //只有成员方法实现动态绑定，成员变量多态情况下引用的是父类
        System.out.println(d.num);

        d.method();
        d.function();//使用变量去调用静态方法，其实相当于用变量类型的类名去调用
    }
}


class Dad {
    int num = 20;

    public void method() {
        System.out.println("我是父类方法");
    }

    public static void function() {
        System.out.println("我是父类静态方法");
    }
}

class Kid extends Dad {
    int num = 10;

    public void method() {
        System.out.println("我是子类方法");
    }

    public static void function() {
        System.out.println("我是子类静态方法");
    }
}