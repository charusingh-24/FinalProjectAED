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
public class Neurologist extends DoctorEmployee {


    public Neurologist(String doctorDepartment) {
        super(doctorDepartment);
        System.out.println("Neurologist constructor");    }

    @Override
    void speciality() {
        System.out.println("I am a Neurologist");
    }

}
