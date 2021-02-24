package com.github.yeecode.easyrpc.client;

/**
 * @Author didi
 * @Date 2021/2/23
 */
public class Student implements Person{

    @Override public void say() {
        System.out.println("I'm student");
    }

    @Override public void run() {
        System.out.println("Student can run");
    }
}
    