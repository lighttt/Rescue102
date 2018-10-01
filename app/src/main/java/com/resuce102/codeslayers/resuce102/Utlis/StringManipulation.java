package com.resuce102.codeslayers.resuce102.Utlis;

public class StringManipulation {

    public static String expandUsername(String username)
    {
        return username.replace(".", " ");
    }

    public static String condenseUsername(String username)
    {
        return username.replace(" ", ".");
    }

}


