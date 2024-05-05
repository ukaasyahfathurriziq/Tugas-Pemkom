/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
/**
 *
 * @author Ukaasyah
 */
public class GenericProgramming {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
    //List listV = new ArrayList();
        List<Mahasiswa> listV = new ArrayList();
        for (int i = 1; i <=100; i++) {
            Mahasiswa m = new Mahasiswa();
            m.setNim(123);
            m.setName("Goku");
            m.setEmail("goku@a.com");
            listV.add(m);
        }
        for (Mahasiswa mhs : listV) {
            var nim = mhs.getNim();
            var nama = mhs.getName();
            var email = mhs.getEmail();
            System.out.println("nim="+nim);
            System.out.println("nama="+nama);
            System.out.println("email="+email);
            System.out.println("=========");
        }
    }
}
