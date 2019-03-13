package com.ljs.singleton;

/**
 * 线程A和线程B同时调用getJava3y()方法，他们同时判断java==null，
 * 得出的结果都是为null，所以进入了if代码块了
 * 此时线程A得到CPU的控制权-->进入同步代码块-->创建对象-->返回对象
 * 线程A完成了以后，此时线程B得到了CPU的控制权。
 * 同样是-->进入同步代码块-->创建对象-->返回对象
 * 很明显的是：Java3y类返回了不止一个实例！所以上面的代码是不行的！
 */
public class TestSingleton4 {
    public static void main(String[] args) {
        //线程A
        new Thread(new Runnable() {
            @Override
            public void run() {
                //创建单例对象
                Singleton4 singleton4 = Singleton4.getSingleton4();
                System.out.println(singleton4);
            }
        }).start();

        //线程B
        new Thread(new Runnable() {
            @Override
            public void run() {
                //创建单例对象
                Singleton4 singleton4 = Singleton4.getSingleton4();
                System.out.println(singleton4);
            }
        }).start();

        //线程C
        new Thread(new Runnable() {
            @Override
            public void run() {
                //创建单例对象
                Singleton4 singleton4 = Singleton4.getSingleton4();
                System.out.println(singleton4);
            }
        }).start();
    }

}
