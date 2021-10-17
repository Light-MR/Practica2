package fciencias.edatos.doubleLinkList;
import java.util.Iterator;

import fciencias.edatos.doubleLinkList.DoubleLinkedList;
public class Main {
public static void main(String[] args) {
    //System.out.println("WTF! (._.)/");
    DoubleLinkedList<String> list = new DoubleLinkedList<>();
    list.add(0, "Esto");
    list.add(1, "Funciona");
    list.add(2, "?");

    //System.out.print(list);

    System.out.println("****");
    list.add(2, "(x_x)");
    list.add(4, "(W_x)");
    System.out.print(list);
    String v ="(._,)";
    //ntSystem.out.println("Get:"+ list.get(3));
    
    System.out.println("Elimina 0:"+ list.remove(3)+ "\n"+ list);
    ;

}
}
