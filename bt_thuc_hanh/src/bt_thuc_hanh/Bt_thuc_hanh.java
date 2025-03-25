/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bt_thuc_hanh;

import Models.Person;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author bibau
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Bt_thuc_hanh {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Person> Alist = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        readFile();
        while (true) {
            System.out.println("Vui long chon tac vu");
            menu();
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    add();
                    save();
                    break;

                case 2:
                    remove();
                    save();
                    break;

                case 3:
                    fix();
                    save();
                    break;
                case 4:
                    print();
                    break;
                case 5:
                    System.exit(0);

            }
        }

    }

    public static void readFile() {
        try {
            BufferedReader rd = new BufferedReader(new FileReader("emduy.txt"));
            String line;
            while ((line = rd.readLine()) != null) {
                String[] data = line.split(",");
                Person person = new Person(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2]), data[3]);
                Alist.add(person);
            }
            rd.close();
        } catch (IOException ex) {
            Logger.getLogger(Bt_thuc_hanh.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void menu() {
        System.out.println("1. add");
        System.out.println("2. remove");
        System.out.println("3. fix");
        System.out.println("4. print");
        System.out.println("5. exit");

    }

    public static void add() {
        System.out.println("Nhap id");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten");
        String name = sc.nextLine();
        System.out.println("Nhap tuoi");
        int age = sc.nextInt();
        System.out.println("Nhap dia chi");
        sc.nextLine();
        String city = sc.nextLine();
        Person p = new Person(id, name, age, city);
        Alist.add(p);

    }

    public static void remove() {
        System.out.println("Chon ng muon xoa");
        int choice = sc.nextInt();
        Alist.remove(choice - 1);
    }

    public static void fix() {
        System.out.println("Chon nv muon sua");
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten");
        String name = sc.nextLine();
        System.out.println("Nhap tuoi");
        int age = sc.nextInt();
        System.out.println("Nhap dia chi");
        sc.nextLine();
        String city = sc.nextLine();
        Alist.get(choice - 1).setName(name);
        Alist.get(choice - 1).setAge(age);
        Alist.get(choice - 1).setCity(city);

    }

    public static void print() {

        for (Person person : Alist) {
            System.out.print("id:" + person.getId());
            System.out.print(" Ten:" + person.getName());
            System.out.print(" Tuoi:" + person.getAge());
            System.out.println(" Dia chi:" + person.getCity());
        }

    }

    public static void save() {
        try {
            FileWriter fw = new FileWriter("emduy.txt");
            for (Person p : Alist) {
                fw.write(p.getId() + "," + p.getName() + "," + p.getAge() + "," + p.getCity()+"\n");
            }
            fw.close();
        } catch (Exception e) {
            System.out.println("Loi file");
        }
    }

}
