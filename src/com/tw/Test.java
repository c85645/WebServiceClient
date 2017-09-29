/*
 * Copyright (c) 2000-2017 Asgard System, Inc. 
 * Taipei, Taiwan. All rights reserved. 
 * 
 * This software is the confidential and proprietary information of  
 * Asgard System, Inc. ("Confidential Information").  You shall not 
 * disclose such Confidential Information and shall use it only in 
 * accordance with the terms of the license agreement you entered into 
 * with Asgard. 
 * 
 */
package com.tw;

/**
 * <!-- 在此加入類別說明 -->
 * 
 * <pre>
 * 存放路徑	：$Header: $  
 * 建立日期	：Sep 29, 2017 4:30:54 PM
 * 異動註記	： 
 * </pre>
 * 
 * @author ：Jeff_Chang
 * @version ：$Revision: $ $Date: $
 * 
 */
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
