package oop.polymorphism.mathodoverridding;

import com.sun.tools.javac.Main;

public class Test {

    public static void main(String[] args) {
        BMW obj = new BMW();
        obj.carStart();
        System.out.println("======== ******* +=======");
        obj.carStop();
        System.out.println("====== ***** =====");
        obj.carEngine("VVT");
        obj.gps();
        obj.flyingFeature();
    }
}
