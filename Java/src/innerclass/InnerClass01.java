package innerclass;

public class InnerClass01 {
    public static void main(String[] args) {

    }
}

class Outer { //外部类
    private int n1 = 100;
    public void m1(){
        System.out.println("m1");
    }

    {
        System.out.println("代码块");

    }

    class Inner{


    }
}
