package com.elaachiq.exam.aspect;

public class AppContext {
    private static String username="";
    private static String password="";
    private static String[] roles={};
    public static void authenticateUser(String u,String p,String[] inputRoles){
        if((u.equals("admin"))&&(p.equals("admin")) ){
            username= u;password=p;
            roles=inputRoles;
        }
        else throw new RuntimeException("Invalid Credentials..");
    }
    public static boolean hasRole(String role){
        for (String r:roles) {
            if(r.equals(role))return true;
        }
        return false;
    }
}
