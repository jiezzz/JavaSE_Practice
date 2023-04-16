package innerclass;

/**
 * 局部内部类*
 */
public class LocalInnerClass {
    public static void main(String[] args) {
//        Outer02 outer = new Outer02();
//        outer.m1();
//        float [][]f=new float[][6]; 这是错误的写法，用new的时候声明的时候需要前面的维度有数字
    }
}

class Outer02{
    private int n1 = 100;
    public void m2(){

        System.out.println("m2");
    }
    public void m1(){
        //局部内部类定义在外部类的局部位置
        //不能被访问修饰符修饰，但是可以使用final修饰（用final修饰的作用是不能被继承）
        //作用域仅在定义它的方法或代码块中
        class Inner02{
            //可以直接访问外部类的所有成员，包含私有的
            public void f1(){
                //可以访问外部类的所有成员，包括私有的
                System.out.println("n1=" + n1);
                m2();
            }


        }


//        class Inner03 extends Inner02{
//
//
//        }
        //6.外部类使用内部类的方法：外部内可以在方法中创建Inner02对象，然后调用方法即可
        Inner02 inner02 = new Inner02();
        inner02.f1();
    }


    //这个代码块中定义的类也是局部内部类
    {


    }

}
