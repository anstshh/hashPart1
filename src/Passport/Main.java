package Passport;

import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Map<Integer, Passport> map = new HashMap<>();
    public static void main(String [] args){
        Passport passport = new Passport(252513458,"Maria","Popova","Sergeevna",1978);
        addPassport(passport);

    }
    public static void addPassport(Passport passport){
        map.put(passport.getNumberID(),passport);
    }
    public static Passport getPassportByNumber( int numberID){
        return map.get(numberID);

    }
}