/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package new_project_2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author bibau
 */
public class work_string {
    public static void main(String[] args) {
    String listName = "Trung/Duc;Duy,Hai.long";
    String [] ch_name = listName.split("[/;.,]");
        for (String s : ch_name) {
            System.out.print(s+ " cd");
        }
    }
    
}
