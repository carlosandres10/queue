package com.upechiapas.queue;
import java.security.SecureRandom;
import java.util.*;

import com.upechiapas.queue.models.Pizza;

import java.util.Queue;

public class Main {
    public static void main(String[] args) {
         /*
                String[] catalogo = {"Hawaiana", "peperoni","4 quesos","Mexicana"};
                Random random = new Random(System.nanoTime());
                Queue<Pizza> listaPizza = new LinkedList<Pizza>();
                for (int i = 0; i < 10; i++) {
                    listaPizza.add(new Pizza((short) (i + 1), catalogo[random.nextInt(catalogo.length)], random.nextFloat()));

                    while (listaPizza.size() > 0)
                        System.out.println(listaPizza.poll());

                 */
        Scanner teclado = new Scanner(System.in);
        byte menu;
        System.out.println("1.-elija una opcion");
        System.out.println("4.-Salir");

        menu = teclado.nextByte();

        switch (menu) {
            case 1:
                String[] catalogo = {"Hawaiana", "peperoni", "4 quesos", "Mexicana"};
                Random random = new Random(System.nanoTime());
                Queue<Pizza> listaPizza = new LinkedList<Pizza>();
                for (int i = 0; i < 10; i++) {
                    listaPizza.add(new Pizza((short) (i + 1), catalogo[random.nextInt(catalogo.length)], random.nextFloat()));

                    while (listaPizza.size() > 0)
                        System.out.println(listaPizza.poll());
                }

                break;
            case 4:

        }

    }
}


