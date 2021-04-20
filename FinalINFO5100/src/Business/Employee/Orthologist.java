/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

/**
 *
 * @author arpita
 */
public class Orthologist extends DoctorEmployee {


    public Orthologist(String doctorDepartment) {
        super(doctorDepartment);
        System.out.println("I am an Orthologist");
    }

    @Override
    void speciality() {
        System.out.println("I am an Orthologist");
    }

}
