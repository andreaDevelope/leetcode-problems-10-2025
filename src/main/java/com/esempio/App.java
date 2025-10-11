package com.esempio;

import com.esempio.leetcode.LeetCodeTestRunner;

/**
 * Classe principale dell'applicazione Java.
 * 
 * Questa applicazione contiene implementazioni di problemi LeetCode
 * con soluzioni ottimizzate e test completi.
 * 
 * Problemi implementati:
 * - Two Sum (LeetCode #1)
 * - Longest Substring Without Repeating Characters (LeetCode #3)
 * 
 * @author Esempio
 * @version 2.0
 * @since 1.0
 */
public class App {

    /**
     * Metodo principale dell'applicazione.
     * 
     * Esegue i test LeetCode e mostra le statistiche delle soluzioni.
     * 
     * @param args argomenti passati dalla riga di comando
     */
    public static void main(String[] args) {
        System.out.println("🎯 LEETCODE SOLUTIONS - JAVA PROJECT");
        System.out.println("=".repeat(50));

        // Mostra le statistiche delle soluzioni
        LeetCodeTestRunner.showStatistics();

        // Esegui tutti i test LeetCode
        LeetCodeTestRunner.runAllTests();

        System.out.println("\n🏁 Applicazione terminata con successo!");
    }
}
