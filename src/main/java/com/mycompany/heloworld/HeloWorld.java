/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.heloworld;

import java.util.Scanner;

/**
 *
 * @author jotal
 */
public class HeloWorld {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Olá, qual seu nome: ");
        String nome = ler.nextLine();

        System.out.println("Olá " + nome + "bem vindo!!");
        System.out.println("Você sabia que todo programador deve escrever no seu primeiro código" +
                "um simples HELLO WORLD, e assim será um grande programador?");

        System.out.println("Escreva o seu agora, BOA SORTE!! ");

    }
}
