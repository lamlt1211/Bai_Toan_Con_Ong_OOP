package com.company.java.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * JavaCore
 *
 * @author Tung lam
 * @created_at 15/05/2020 - 16:31
 * @created_by Tung lam
 * @since 15/05/2020
 */
public class Main {
    public static void main(String[] args) {
        List<Bee> list = new ArrayList<Bee>();
        Boolean exit = false;

        System.out.println("------Menu-----");
        System.out.println("1: nhap");
        System.out.println("2: in");
        System.out.println("3 : exit");

        while (!exit) {
            Scanner input = new Scanner(System.in);
            System.out.println("Nhap: ");
            int n = input.nextInt();
            switch (n) {
                case 1:
                    for (int i = 0; i < 10; i++) {
                        list.add(new Worker());
                        list.add(new Drone());
                        list.add(new Queen());
                    }
                    int i = 1;
                    for (Bee b : list) {
                        System.out.println((i++) + ": " + b.Type + "\talive = " + b.Alive() + "\thealth = " + b.Health);
                    }
                    break;
                case 2:
                    Random random = new Random();
                    int j = 1;
                    for (Bee b : list) {
                        int damage = random.nextInt(80);
                        b.Damage(damage);
                        System.out.println((j++) + ": " + b.Type + "\talive = " + b.Alive() + "\thealth = " + b.Health);
                    }
                    break;
                case 3:
                    System.out.println("Tam biet");
                    break;
                default:
                    break;
            }
        }

    }
}

