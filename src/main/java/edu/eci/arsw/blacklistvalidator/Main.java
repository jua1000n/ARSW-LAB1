/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.blacklistvalidator;


import edu.eci.arsw.threads.CountThread;

import java.util.List;

/**
 *
 * @author hcadavid
 */
public class Main {
    
    public static void main(String a[]){
        HostBlackListsValidator hblv=new HostBlackListsValidator();
        List<Integer> blackListOcurrences=hblv.checkHost("200.24.34.55");
        System.out.println("The host was found in the following blacklists:"+blackListOcurrences);

        //Parte 1.1
        //CountThread countThread = new CountThread(0, 99);

        //Parte 1.2.1
        //CountThread countThread1 = new CountThread(0, 99);
        //CountThread countThread2 = new CountThread(99, 199);
        //CountThread countThread3 = new CountThread(200, 299);

        //Parte 1.2.2
        
    }
    
}
