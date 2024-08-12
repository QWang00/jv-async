package org.northcoders;

import java.util.concurrent.CompletableFuture;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

        public static void main(String[] args) {

            CompletableFuture<Void> future = CompletableFuture.runAsync(()->{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
                System.out.println("Hello World!");
            });
            future.join();

            CompletableFuture<Void> future1 = CompletableFuture.runAsync(()->{
        try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
        System.out.println("Hello...");
    });

            CompletableFuture<Void> future2 = CompletableFuture.runAsync(()->{
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
                System.out.println("...World!");
            });

            CompletableFuture<Void> joinFutures = CompletableFuture.allOf(future1, future2);
            joinFutures.join();
        }
}

