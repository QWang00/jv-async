package org.northcoders;

import java.util.concurrent.CompletableFuture;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

        public static void main(String[] args) {
//            System.out.println("Future for step 1: " );
//            CompletableFuture<Void> step1Future = CompletableFuture.runAsync(()->{
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                System.out.println("Hello World!");
//            });
//            step1Future.join();
//
//            System.out.println("Futures for step 2: ");
//            CompletableFuture<Void> future1 = CompletableFuture.runAsync(()->{
//                try {
//                    Thread.sleep(3000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                System.out.println("Hello...");
//            });
//
//            CompletableFuture<Void> future2 = CompletableFuture.runAsync(()->{
//                try {
//                    Thread.sleep(5000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                System.out.println("...World!");
//            });
//
//            CompletableFuture<Void> joinFutures = CompletableFuture.allOf(future1, future2);
//            joinFutures.join();

            System.out.println("Futures for step 3, in 5 seconds it will show: ");
            CompletableFuture<String> future3 = CompletableFuture.supplyAsync(()->{
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                return "Hello...";
            });

            CompletableFuture<String> future4 = CompletableFuture.supplyAsync(()->{
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                return "...World!";
            });

            CompletableFuture<String> combined = future3.thenCombine(future4, (f3, f4)-> f3 + " " + f4);
            String result = combined.join();
            System.out.println(result);




        }
}

