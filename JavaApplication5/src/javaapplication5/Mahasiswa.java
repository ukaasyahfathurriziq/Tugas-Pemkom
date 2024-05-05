/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author Ukaasyah
 */
public class Mahasiswa {
    private int nim;
    private String name;
    String email;

    @Override
    public String toString() {
        return "" + "nim=" + nim + ", name=" + name + ", email=" + email + '}';
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
