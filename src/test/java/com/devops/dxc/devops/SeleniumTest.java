package com.devops.dxc.devops;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class SeleniumTest {

//    private WebDriver driver;
//    private String randMail;

//    protected String getSaltString() {
//        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
//        StringBuilder salt = new StringBuilder();
//        Random rnd = new Random();
//        while (salt.length() < 10) { // length of the random string.
//            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
//            salt.append(SALTCHARS.charAt(index));
//        }
//        String saltStr = salt.toString();
//        return saltStr;
//
//    }

//    @Before
//    public void setUp(){
//        System.out.println("Iniciando configuración...");
//        System.setProperty("webdriver.chrome.driver",System.getenv("WEBDRIVER"));
//        driver = new ChromeDriver();
//        randMail = getSaltString()+"@diplousach.com";
//    }

    @Test
    public void dummieTest() {
        int valor = 0;
        assertEquals(valor, 0);
    }
}
