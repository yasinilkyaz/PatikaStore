package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneFunction {
    Scanner scan = new Scanner(System.in);

    List<CellPhone> Telefon = new ArrayList<>();

    void run () {

        Telefon.add(new CellPhone(7000.0, 20, 21, "IPhone", "Apple", 64, 6.1, 4000, 8, "Siyah"));
        System.out.println("Ne yapmak istiyorsun ?\n1-Telefon ürünlerini listele\n2-Telefon türünde ürün ekle\n3-Telefon türünde ürün sil");
        int  chooser1 = scan.nextInt();
        if(chooser1 == 1) {
            printCellPhone();
        }else if(chooser1 == 2) {
            addCellPhone();
        }else if(chooser1 == 3) {
            deleteCellPhone();
        }
        else {
            System.out.println("Geçersiz bir değer girdiniz.");
        }
    }

    public void addCellPhone() {
        Telefon.add(new CellPhone(7000.0, 20, 21, "IPhone", "Apple", 64, 6.1, 4000, 8, "Siyah"));
        int i = Telefon.size() - 1;
        System.out.println("Ekleyeceğiniz ürünün özelliklerini giriniz.");
        System.out.println("Ürünün Markası : ");
        String brand = scan.next();
        Telefon.get(i).setBrand(brand);
        System.out.println("Ürünün Adı : ");
        String name = scan.next();
        Telefon.get(i).setName(name);
        System.out.println("Ürünün Ekran Boyutu : ");
        double screenSize = scan.nextDouble();
        Telefon.get(i).setScreenSize(screenSize);
        System.out.println("Ürünün RAM boyutu : ");
        int ram = scan.nextInt();
        Telefon.get(i).setRam(ram);;
        System.out.println("Ürünün Fiyatı : ");
        double price = scan.nextDouble();
        Telefon.get(i).setPrice(price);
        System.out.println("Ürünün Adedi : ");
        int stock = scan.nextInt();
        Telefon.get(i).setStock(stock);
        System.out.println("---------------------------------");
    }

    public void printCellPhone() {
        System.out.println("1-Tümünü listele\n2-ID aralığına göre listele\n3-Markaya göre listele");
        int chooser1o1 = scan.nextInt();
        if(chooser1o1 == 1) {
            System.out.println("Notebook Listesi");
            System.out.println("----------------------------------------------------------------------------------------------------");
            System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Ekran     | RAM         |");
            System.out.println("----------------------------------------------------------------------------------------------------");
            for(int i = 0; i < Telefon.size(); i++) {
                System.out.printf("| %d  | %s                      | %.5g TL | %s     | %d           | %d          |", i, Telefon.get(i).name,  Telefon.get(i).price, Telefon.get(i).brand, Telefon.get(i).screenSize, Telefon.get(i).ram);
                System.out.println();
            }
            System.out.println("----------------------------------------------------------------------------------------------------");

        }else if(chooser1o1 == 2) {
            System.out.println("ID aralığı belirleyiniz.");
            System.out.println("Başlangıç ID");
            int chooser1o1o2n1 = scan.nextInt();
            System.out.println("Bitiş ID");
            int chooser1o1o2n2 = scan.nextInt();
            System.out.println("Notebook Listesi");
            System.out.println("----------------------------------------------------------------------------------------------------");
            System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Ekran     | RAM         |");
            System.out.println("----------------------------------------------------------------------------------------------------");
            for(int i = chooser1o1o2n1; i<=chooser1o1o2n2; i++) {
                System.out.printf("| %d  | %s                      | %.5g TL | %s     | %d           | %d          |", i, Telefon.get(i).name,  Telefon.get(i).price, Telefon.get(i).brand, Telefon.get(i).screenSize, Telefon.get(i).ram);				System.out.println();
            }
            System.out.println("----------------------------------------------------------------------------------------------------");

            //  ----------------------
            // |	------------	  |
            // |   | TEKRAR DÖN |	  |
            // |	------------	  |
            //  ----------------------
        }else if(chooser1o1 == 3) {
            System.out.println("Marka belirleyiniz => ");
            String chooser1o1o3 = scan.next();
            System.out.println("Telefon Listesi");
            System.out.println("----------------------------------------------------------------------------------------------------");
            System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Ekran     | RAM         |");
            System.out.println("----------------------------------------------------------------------------------------------------");
            for(int i = 0; i < Telefon.size(); i++) {
                if(chooser1o1o3 == Telefon.get(i).brand) {
                    System.out.printf("| %d  | %s                      | %.5g TL | %s     | %d           | %d          |", i, Telefon.get(i).name,  Telefon.get(i).price, Telefon.get(i).brand, Telefon.get(i).screenSize, Telefon.get(i).ram);					System.out.println();
                }
            }
            System.out.println("----------------------------------------------------------------------------------------------------");
        }
        else {
            System.out.println("Geçersiz bir değer girdiniz.");
        }
    }

    public void deleteCellPhone() {
        System.out.println("Silinmesini istediğiniz ürünün ID'sini giriniz =>");
        int chooser1o3 = scan.nextInt();
        if(chooser1o3 < Telefon.size() && chooser1o3 >= 0 ) {
            Telefon.remove(chooser1o3);
            System.out.println("Silme işlemi başarıyla gerçekleşti.\nSilinen ürünün ID'si : " + chooser1o3);
            System.out.println("--------------------------------");
        }else {
            System.out.println("Geçersiz değer girdiniz.");
        }
    }

}
