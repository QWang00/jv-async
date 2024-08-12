package org.northcoders;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

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

//            System.out.println("Futures for step 3, in 5 seconds it will show: ");
//            CompletableFuture<String> future3 = CompletableFuture.supplyAsync(()->{
//                try {
//                    Thread.sleep(3000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                return "Hello...";
//            });
//
//            CompletableFuture<String> future4 = CompletableFuture.supplyAsync(()->{
//                try {
//                    Thread.sleep(5000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                return "...World!";
//            });
//
//            CompletableFuture<String> combined = future3.thenCombine(future4, (f3, f4)-> f3 + " " + f4);
//            String result = combined.join();
//            System.out.println(result);

            System.out.println("Futures for step 4, within 10 seconds it will show otherwise throw error: ");
            long startTime = System.nanoTime();
            int min = 1000 ;
            int max = 10000;
            int random1 = min + (int) (Math.random() * ((max - min)) + 1);
            int random2 = min + (int) (Math.random() * ((max - min)) + 1);

                        CompletableFuture<String> future5 = CompletableFuture.supplyAsync(()->{
                try {
                    System.out.println(random1);
                    Thread.sleep(random1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                return "Hello...";
            });

            CompletableFuture<String> future6 = CompletableFuture.supplyAsync(()->{
                try {
                    System.out.println(random2);
                    Thread.sleep(random2);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                return "...World!";
            });


                CompletableFuture<String> combined = future5.thenCombine(future6, (f5, f6)-> f5 + " " + f6);

                String result = combined.join();
                System.out.println(result);

                long endTime = System.nanoTime();
                long totalTime = endTime-startTime;
                System.out.println(totalTime);
                if(totalTime > 1000000000) throw new RuntimeException("Exceeds 10 Seconds");

            }

        }


