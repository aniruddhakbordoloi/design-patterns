package com.codesmack.designpatterns.mamu_1;

/**
 * Created by Aniruddha on 13-03-2018.
 */
public class Child1 extends Parent {

    public static void print(){
        System.out.println("printing child");
    }

    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.print();

        Child1 child = new Child1();
        child.print();
    }

}
