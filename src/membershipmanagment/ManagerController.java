/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package membershipmanagment;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pepo
 */
public class ManagerController {
    ArrayList list = new ArrayList();
    MemberFactory mem = new MemberFactory();
        public ArrayList getMember(){
            return list;
        }
         public void  setMember(ArrayList aList){
            list = aList;
        }/*
          public createMember getObjMemb(){
            return memb;
        }
         public void  setObjMemb(createMember aMemb){
            memb = aMemb;
        }*/


	public void register(String title, String name,String last_name,String email,String phone_num,String Address_1,String Address_2,String Post_code,String dob,String Gender,int Booking,String Status) {
            createMember Member = mem.inputType(Status);
            Member.setStatus(Status);
            Member.setTitle(title);
            Member.setName(name);
            Member.setLast(last_name);
            Member.setEmail(email);
            Member.setPhone(phone_num);
            Member.setAddr1(Address_1);
            Member.setAddr2(Address_2);
            Member.setPostCode(Post_code);
            Member.setDOB(dob);
            Member.setGender(Gender);
            Member.setBooking(Booking);
            list.add(Member);
		// TODO - implement ManagerController.ManagerController
	}
        public String retriveInf(ArrayList list1){
           String data = "";
            for(int i = 0; i<list1.size(); i++){
                createMember temp = (createMember)list1.get(i);
                String str = "Invoice: \n"  
                                                   +"Title: "+ temp.getTitle()
                                                   + "\n Name: " + temp.getName()
                                                   + "\n Last name " + temp.getLast() 
                                                   + "\n Email: " + temp.getEmail()
                                                   + "\n Phone number: " + temp.getPhone()
                                                   + "\n Address line 1: " + temp.getAddr1()
                                                   + "\n Address line 2: " + temp.getAddr2()
                                                   + "\n Post code: " + temp.getPostCode()
                                                   + "\n Date of Birth: " + temp.getDOB()
                                                   + "\n Gender: "+ temp.getGender()
                                                   + "\n Bookings: " + temp.getBooking()
                                                   + "\n Membership: " + temp.getStatus()
                                                   + "\n";
                data = data + str;
            }
            return data;
            }
        public void deleteMember(String target){
        try {
            MemberRepoImpl membRepo1 = new MemberRepoImpl();
            ManagerController control = new ManagerController();
            Connection conn1;
            String connectionURL = "jdbc:derby://localhost:1527/SPvillage";
            String uName = "petar";
            String uPass= "petar";
            
            
            conn1 = DriverManager.getConnection(connectionURL, uName, uPass);
            membRepo1.delete(conn1, target);
        } catch (SQLException ex) {
            Logger.getLogger(ManagerController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
        public void  updateInf(String title, String name,String last_name,String email,String phone_num,String Address_1,String Address_2,String Post_code,String dob,String Gender){
         //        System.out.print(temp.getAddr1());
            createMember Member =  mem.inputType("Silver Membership");
            Member.setTitle(title);
            Member.setName(name);
            Member.setLast(last_name);
            Member.setEmail(email);
            Member.setPhone(phone_num);
            Member.setAddr1(Address_1);
            Member.setAddr2(Address_2);
            Member.setPostCode(Post_code);
            Member.setDOB(dob);
            Member.setGender(Gender);
            list.add(Member);
            }
        public void  upgradeInf(String title, String name,String last_name,String email,String phone_num,String status,int booking){
         //        System.out.print(temp.getAddr1());
            createMember Member =  mem.inputType("Silver Membership");
            Member.setTitle(title);
            Member.setName(name);
            Member.setLast(last_name);
            Member.setEmail(email);
            Member.setPhone(phone_num);
            Member.setStatus(status);
            Member.setBooking(booking);
            list.add(Member);
            }

   
            
}
            