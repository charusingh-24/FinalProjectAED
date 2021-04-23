package Business.Employee;

import Business.Employee.Employee;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Name
 */
public abstract class DoctorEmployee extends Employee{


    public DoctorEmployee(String doctorsDepartment) {
        super(doctorsDepartment);
    }

    public enum MedicalDepartment {

        Cardiologist("Cardiology"),
        Orthologist("Orthology"),
        Neurologist("Neurology"),
        Pediatrician("Pediatrician");

        private String value;

        private MedicalDepartment(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    
 abstract void speciality(); 
 
}
