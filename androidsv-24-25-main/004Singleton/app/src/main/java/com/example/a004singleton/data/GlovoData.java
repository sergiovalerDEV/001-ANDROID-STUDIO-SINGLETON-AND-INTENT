package com.example.a004singleton.data;

public class GlovoData {
    public static String email;//Ver qué es static
    //private static User user;



    public static String getEmail() {
        return email;
    }
    public static void setEmail(String email) {
        GlovoData.email = email;
    }
}