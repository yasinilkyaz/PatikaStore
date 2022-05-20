package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NotebookFunction {
    List<Notebook> notebook = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    void run (ArrayList<Brand> brandList) {
        notebook.add(new Notebook(7000.0, 25.0, 14, "Macbook ", "Apple", 16, 512, 16.1));
        notebook.add(new Notebook(7000.0, 25.0, 14, "Macbook ", "Apple", 16, 512, 16.1));
        notebook.add(new Notebook(7000.0, 25.0, 14, "Macbook ", "Apple", 16, 512, 16.1));
        notebook.add(new Notebook(7000.0, 25.0, 14, "Macbook ", "Apple", 16, 512, 16.1));
        System.out.println("Ne yapmak istiyorsun ?\n1-Notebook ürünlerini listele\n2-Notebook türünde ürün ekle\n3-Notebook türünde ürün sil");
        int  chooser1 = scan.nextInt();
        if(chooser1 == 1) {
            printNotebookList();
        }else if(chooser1 == 2) {
            addNotebook(brandList);
        }else if(chooser1 == 3) {
            deleteNotebook(brandList);
        }
        else {
            System.out.println("Geçersiz bir değer girdiniz.");
        }
    }

    public void addNotebook(ArrayList<Brand> brandList) {

        notebook.add(new Notebook(7000.0, 25.0, 14, "Macbook ", "Apple", 16, 512, 16.1));
        int a = notebook.size() - 1;
        System.out.println("Lütfen ürün özelliklerini giriniz");
        System.out.println("Markasını giriniz");
        String brand = scan.next();
        notebook.get(a).setBrand(brand);
        System.out.println("Ürün adı giriniz");
        String name = scan.next();
        notebook.get(a).setName(name);
        System.out.println("Ekran boyutunu giriniz");
        double screen = scan.nextDouble();
        notebook.get(a).setScreenSize(screen);
        System.out.println("Rem alanı giriniz");
        int ram = scan.nextInt();
        notebook.get(a).setRam(ram);
        System.out.println("Depolama alanı giriniz");
        int storage = scan.nextInt();
        notebook.get(a).setStorage(storage);
        System.out.println("Fiyatını giriniz");
        double price = scan.nextDouble();
        notebook.get(a).setPrice(price);
        System.out.println("İndirim oranını giriniz");
        double discountRate = scan.nextDouble();
        notebook.get(a).setDiscountRate(discountRate);
        System.out.println("Stok adeti giriniz");
        int stock = scan.nextInt();
        notebook.get(a).setStock(stock);
        System.out.println("--------------");

    }

    public void printNotebookList() {

        System.out.println(" 1 - Hepsini listele \n 2 - Id ye göre listele \n 3 - Markaya göre listele");
        int choose1v1 = scan.nextInt();

        if (choose1v1 == 1) {
            System.out.println("Notebook listesi");
            System.out.println("----------------------------------------------------------------------------------------------------");
            System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |");
            System.out.println("----------------------------------------------------------------------------------------------------");
            for (int i = 0; i < notebook.size(); i++) {

                System.out.printf("| %d  | %s                      | %.5g TL | %s     | %d       | %.3g      | %d          |", i, notebook.get(i).name, notebook.get(i).price, notebook.get(i).brand, notebook.get(i).storage, notebook.get(i).screenSize, notebook.get(i).ram);
                System.out.println();
            }
            System.out.println("----------------------------------------------------------------------------------------------------");
        } else if (choose1v1 == 2) {
            System.out.println("Id aralığını giriniz");
            System.out.println("Başlangıç id giriniz");
            int choose1v1v2n1 = scan.nextInt();
            System.out.println("Bitiş id giriniz");
            int choose1v1v2n2 = scan.nextInt();
            System.out.println("Notebook listesi");
            System.out.println("----------------------------------------------------------------------------------------------------");
            System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |");
            System.out.println("----------------------------------------------------------------------------------------------------");
            for (int a = choose1v1v2n1; a <= 2; a++) {
                System.out.printf("| %d  | %s                      | %.5g TL | %s     | %d       | %.3g      | %d          |", a, notebook.get(a).name, notebook.get(a).price, notebook.get(a).brand, notebook.get(a).storage, notebook.get(a).screenSize, notebook.get(a).ram);
                System.out.println();
            }
            System.out.println("----------------------------------------------------------------------------------------------------");
        }else if(choose1v1==3){
            System.out.println("Marka giriniz");
            String brand=scan.next();
            System.out.println("Notebook listesi");
            System.out.println("----------------------------------------------------------------------------------------------------");
            System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |");
            System.out.println("----------------------------------------------------------------------------------------------------");

            for(int i=0;i< notebook.size();i++){
                if(brand==notebook.get(i).brand){
                    System.out.printf("| %d  | %s                      | %.5g TL | %s     | %d       | %.3g      | %d          |", i, notebook.get(i).name,  notebook.get(i).price, notebook.get(i).brand, notebook.get(i).storage, notebook.get(i).screenSize, notebook.get(i).ram);
                    System.out.println();
                }
            }
        }else {
            System.out.println("Geçersiz değer girdiniz!");
        }
    }

    public void deleteNotebook(ArrayList<Brand>brandList){
        System.out.println("Silmek istediğiniz ürünün id sini giriniz");
        int delete=scan.nextInt();
        if(delete< notebook.size()&&delete>=0){
            notebook.remove(delete);
            System.out.println("Ürün başarıyla silinmiştir");
            System.out.println("-----------------------------------------");
        }else {
            System.out.println("Geçersiz değer girdiniz");
        }

    }

}

