/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Enums.UserType;

/**
 *
 * @author Amesh M Jayaweera
 */
public class User {
    
    private String Id_number;
    private UserType User_type;
    private String Last_name;
    private String First_name;
    private String password;
    
    public User(){
        
    }

    public User(String Id_number, UserType User_type, String Last_name, String First_name, String password) {
        this.Id_number = Id_number;
        this.User_type = User_type;
        this.Last_name = Last_name;
        this.First_name = First_name;
        this.password = password;
    }
    
    

    public String getId_number() {
        return Id_number;
    }

    public void setId_number(String Id_number) {
        this.Id_number = Id_number;
    }

    public UserType getUser_type() {
        return User_type;
    }

    public void setUser_type(UserType User_type) {
        this.User_type = User_type;
    }

    public String getLast_name() {
        return Last_name;
    }

    public void setLast_name(String Last_name) {
        this.Last_name = Last_name;
    }

    public String getFirst_name() {
        return First_name;
    }

    public void setFirst_name(String First_name) {
        this.First_name = First_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
