package com.github.yeecode.easyrpc.client;

/**
 * @Author didi
 * @Date 2021/2/23
 */
public class ProxyTest {

    public static void main(String[] args) {
        Person person =  (Person)new ProxyStudent(new Student()).getProxy();
        person.run();
        person.say();
    }

}
    