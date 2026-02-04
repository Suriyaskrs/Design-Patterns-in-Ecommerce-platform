/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author HP
 */
public class AuthSystem {
 public boolean verifyCredentials(String username, String password) {
   return username.equals("admin") && password.equals("admin");
 }
 public boolean checkSessionToken() {
   return true;
 }
}

