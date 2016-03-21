package org.adani.spring.examples.aop;

import java.util.List;

public class ActionPerformer {

    public void doAction(List<String> someArgs) throws InterruptedException {
        System.out.println("Performing Some Action...\n");
        while(true){
            System.out.println("Still doing some action...\n");
            Thread.sleep(3000);
            break;
        }
        System.out.println("Completed Some Action.");
    }

    public void doFailedAction(List<String> someArgs) throws InterruptedException{
        System.out.println("Performing Some Action...\n");
        while(true) {
            System.out.println("Still doing some action...\n");
            Thread.sleep(3000);
            throw new RuntimeException("Failed Performing Some Action!");
        }
    }
}
