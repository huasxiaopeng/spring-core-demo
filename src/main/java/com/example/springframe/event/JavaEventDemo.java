package com.example.springframe.event;

import java.util.EventListener;
import java.util.EventObject;
import java.util.Observable;
import java.util.Observer;

/**
 * @Description java 级事件
 * @Author lktbz
 * @Date 2021/07/19
 */
public class JavaEventDemo {

//    public static void main(String[] args) {
//        /**
//         * 事件发出者
//         */
//        Observable obs=new Observable();
//        /**
//         * 建立联系
//         */
//        obs.addObserver(new Observer());
//
//        obs.notifyObservers("发送事件");
//        /**
//         *  执行后发现不起作用，还需要改changed 的状态为true
//         */
//    }
public static void main(String[] args) {
  MyObAble myObAble=new MyObAble();
   myObAble.addObserver(new Observer());
   myObAble.notifyObservers("lala");
}
    /**
     * 继承父类修改其行为
     */
     static class MyObAble extends Observable{
        @Override
        public void notifyObservers(Object arg) {
            setChanged();
            super.notifyObservers(new EventObject(arg));
            clearChanged();
        }
    }
    /**
     *  定义接受消息的对象
     */
    static class Observer implements java.util.Observer, EventListener {
        @Override
        public void update(Observable o, Object arg) {
            EventObject object=(EventObject) arg;
            System.out.println("接受到消息："+object);
        }
    }
}
