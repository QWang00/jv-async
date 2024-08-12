package org.northcoders;

import java.util.concurrent.CompletableFuture;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

        public static void main(String[] args) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            CompletableFuture<Void> future = CompletableFuture.runAsync(()->{
                System.out.println("Hello World!");
            });
            future.join();
        }
    }
