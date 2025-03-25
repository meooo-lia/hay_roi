/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package new_project_2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author bibau
 */
public class New_project_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //bieu thuc cchinh quy
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        String emailRegex_2 ="^[A-Za-z0-9+_.-]+@(gmail|yahoo)\\.com$";
        String number ="^(0[3-9])[0-9]{8}[0-9]?$";
        // mau email can kt 
        Scanner scnr = new Scanner(System.in);
       // String email = scnr.nextLine();//
        String phnum = scnr.nextLine();
        // tao doi tuong Pattern tu bieu thuc chinh quy 
        Pattern pt = Pattern.compile(number);
        // so sanh bieu thuc chinh quy voi email nguoi dung 
        Matcher mt = pt.matcher(phnum);
        // thuc hien kiem tra
        if (mt.matches()) {
            System.out.println("email hop le");
        } else {
            System.out.println("Khong hop le");
        }
    }

}

