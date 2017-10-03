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
        MyList<String> a = new MyList(12);
        Node b = null;
        a.insertFirst("21");
        a.insertFirst("25");
        a.insertLast("9");
        a.insertFirst("24");
        a.showList();
        a.deleteNode("9");
        a.showList();
    }
    
}
