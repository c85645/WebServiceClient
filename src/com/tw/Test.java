package com.tw;

public class Test {
    public static void main(String[] args) throws Exception{
        try {
            WebService service = new WebServiceProxy();
            System.out.println(service.helloWorld());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
