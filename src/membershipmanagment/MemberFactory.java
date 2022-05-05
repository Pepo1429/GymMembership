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
public class MemberFactory {
    public createMember inputType(String Membership){
        if(Membership == null){
            return null;
        }
        createMember memb;
        if(Membership.equalsIgnoreCase("Silver Membership")){
        memb = new SilverMembership();
        memb.setStatus("Silver");
        return memb;
        }
        else if(Membership.equalsIgnoreCase("Platinum Membership")){
            memb = new PlatinumMembership();
            memb.setStatus("Platinum");
            return memb;
        }
        else if(Membership.equalsIgnoreCase("Gold Membership")){
            memb = new GoldMembership();
            memb.setStatus("Gold");
            return memb;
        }
        return null;
   }
}
