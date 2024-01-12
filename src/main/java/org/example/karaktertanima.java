package org.example;

import java.util.HashSet;
import java.util.Set;
public class karaktertanima {

    public static void main(String[] args) {
        String[] metinDizisi = {"Test", "Otomasyon", "Eğitimi", "Test", "Robot", "Dreams", "Test"};

        HashSet<Character> benzersizKarakterler = new HashSet<>();

        for (String metin : metinDizisi) {
            for (char karakter : metin.toCharArray()) {
                if (benzersizKarakterler.contains(karakter)) {
                    System.out.println("İki kelime bulundu.");
                    System.out.println("Benzersiz karakterler " + benzersizKarakterler);
                    System.exit(0);
                } else {
                    benzersizKarakterler.add(karakter);
                }
            }
        }
        System.out.println("İki kelime bulunamadı.");
    }
}