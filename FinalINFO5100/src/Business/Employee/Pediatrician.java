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
public class Pediatrician extends DoctorEmployee {


    public Pediatrician(String doctorDepartment) {
        super(doctorDepartment);
        System.out.println("Pediatrician constructor");
    }

    @Override
    void speciality() {
        System.out.println("I am a Pediatrician");
    }

}
