/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package membershipmanagment;

/**
 *
 * @author Pepo
 */
public class PlatinumMembership extends createMember {
   private String status;
   @Override

    public void setStatus(String type){
        status = type;
 
    }
   @Override
     public String getStatus(){
        return status;
 
    }
}