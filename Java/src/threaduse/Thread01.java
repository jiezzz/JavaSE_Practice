package threaduse;

public class Thread01 {
    public static void main(String[] args){
        Cat cat = new Cat();

//        启动线程, .start(）会调用run方法
        cat.start();



        }
    }

// 写一个线程需要继承Thread类或实现Runnable接口,重写run方法

class Cat extends Thread{
    int times = 0;
    @Override
    public void run(){
        while(true) {
            System.out.println("miao"+ (++times));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(times == 8)
                break;
        }
    }

}
