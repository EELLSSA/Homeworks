package com.elif;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Adınızı girin: ");
        String ad = scanner.nextLine();

        System.out.print("Yaşınızı girin: ");
        int yas = scanner.nextInt();
        scanner.nextLine(); // nextInt() sonrası yeni satırı temizlemek için

        System.out.print("Cinsiyetinizi girin (erkek/kadın): ");
        String cinsiyet = scanner.nextLine().toLowerCase(); // Cinsiyeti küçük harfe çevir


        boolean ikiAdVar = ad.trim().contains(" ");

        // Ödül kazanma koşulları
        if (ikiAdVar || yas >= 50 || cinsiyet.equals("kadın")) {
            System.out.println("Tebrikler! 100 TL ödül kazandınız.");
        } else {
            System.out.println("Üzgünüz, ödül kazanamadınız.");
        }

        scanner.close();
    }
}