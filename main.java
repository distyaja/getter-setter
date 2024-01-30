/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.user;

/**
 *
 * @author asus
 */
public class main {
    public static void main(String[] args) {
    User koi = new User();

    // menggunakan method setter
    koi.setUsername("KOI");
    koi.setPassword("kopiJava");

    // menggunakan method getter
    System.out.println("Username: " + koi.getUsername());
    System.out.println("Password: " + koi.getPassword());  
    }
   
}
