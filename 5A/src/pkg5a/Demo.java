/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5a;

/**
 *
 * @author lenovo
 */

public class Demo {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        System.out.println("SuperClass:");
        superOb.x = 10;
        superOb.y = 20;
        superOb.tampilkanNilaiXY();

        System.out.println("SubClass:");
        subOb.x = 5;
        subOb.y = 4;
        subOb.tampilkanNilaiXY();

        // Menambahkan nilai yang hanya ada pada subclass
        subOb.z = 50;
        subOb.tampilkanJumlah();
    }
}