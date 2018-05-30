/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nuklindo.beta.model;

/**
 *
 * @author albi dwi
 * email:alber9193@gmail.co
 */

import lombok.Getter;
import lombok.Setter;

        
public class perusahaan {
@Getter @Setter
private int id;

@Getter @Setter
private String kd_inst;

@Getter @Setter
private String nm_inst;

@Getter @Setter
private String cabang;

@Getter @Setter
private String alamat;

public static void main(String[] args) {
    // TODO Auto-generated method stub
    Student s = new Student();
    System.out.println(s);


}

}
