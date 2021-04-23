/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

/**
 *
 * @author Divya Sharma
 */
public enum OrderStatus {
    
    AWAITING_APPROVAL("Awaiting Approval"),
    VACCINE_APPROVED("Vaccine Approved"),
    VACCINE_ASSIGNED("Vaccine Assigned"),
    PATIENT_VACCINATED("Patient vaccinated");
    
    private String orderStatus; 
    
    OrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
    
    public String getValue() {
        return orderStatus;
    }
}
