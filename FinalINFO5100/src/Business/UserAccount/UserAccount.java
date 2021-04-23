package Business.UserAccount;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raunak
 */
public class UserAccount {
    
    private String userName;
    private String userPassword;

    public UserAccount(String userName, String userPassword) {
       this.userName = userName;
       this.userPassword = userPassword;
    }

    public UserAccount() {
   }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    
}