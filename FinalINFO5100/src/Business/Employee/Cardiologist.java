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
public class Cardiologist extends DoctorEmployee {

    


    public Cardiologist(String doctorDepartment) {
        super(doctorDepartment);
        System.out.println("Cardiologist constructor");
    }

    @Override
    void speciality() {
        System.out.println("I am a Cardiologist");
    }

}
