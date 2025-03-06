/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg5a;

/**
 *
 * @author lenovo
 */

public class B extends A {
    int z;

    void tampilkanJumlah() {
        // subclass dapat mengakses member dari superclass
        System.out.println("Jumlah: " + (x + y + z));
    }
}