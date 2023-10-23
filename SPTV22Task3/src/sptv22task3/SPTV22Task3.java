/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv22task3;

import java.util.Scanner;


/**
 *
 * @author admin
 */
public class SPTV22Task3 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Создаем сканнер для считывания ввода пользователя
        Scanner scanner = new Scanner(System.in);
        
        // Спрашиваем у пользователя его имя
        System.out.print("Введите имя: ");
        String firstName = scanner.nextLine();
        
        // Спрашиваем у пользователя его фамилию
        System.out.print("Введите фамилию: ");
        String lastName = scanner.nextLine();
        
        // Спрашиваем у пользователя его личный код
        System.out.print("Введите личный код: ");
        String personalCode = scanner.nextLine();
        
        // Выводим информацию о пользователе
        System.out.println("Имя: " + firstName);
        System.out.println("Фамилия: " + lastName);
        System.out.println("Личный код: " + personalCode);
    }
}
        // TODO code application logic here
    
    
