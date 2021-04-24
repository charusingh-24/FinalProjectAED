/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

/**
 *
 * @author charusingh
 */
public enum OrderStatus {

    Vaccine_Requested("Vaccine Requested"),
    Awaiting_Approval("Awaiting Approval"),
    Vaccine_Approved("Vaccine Approved"),
    Vaccine_Assigned("Assigned to Pharmacy"),
    Vaccine_InProgress("In Progress at Pharmacy"),
    Vaccinated("Vaccination Complete");
    private String orderStatus;

    OrderStatus(String orderStatus){
    
        this.orderStatus = orderStatus;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public String getValue(){
    return orderStatus;
    }

}
