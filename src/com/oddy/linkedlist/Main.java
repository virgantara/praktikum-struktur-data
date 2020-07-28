package com.oddy.linkedlist;


import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oddy
 */
public class Main {
     public static void main(String[] args) {
        
        LinkedListku linkedList = new LinkedListku();

        linkedList.add("Budi");
        linkedList.add("Fulan");
        linkedList.add("Slamet");
        
        
        List<String> listLabel = linkedList.traverse();
        
        for (String lbl: listLabel){
            System.out.println(lbl);
        }
        
    }
}
