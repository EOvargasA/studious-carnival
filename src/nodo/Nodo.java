/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodo;

/**
 *
 * @author Osiris
 */
public class Nodo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyList a = new MyList(12);
        Node b;
        a.insertFirst(21);
        a.insertFirst(25);
        a.insertLast(9);
        a.insertLast(15);
        b = a.fetch(12);
        System.out.println(b.data);
    }
    
}
