/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package membershipmanagment;

import java.util.Date;

/**
 *
 * @author Pepo
 */
abstract class createMember {
      
	private String title;
	private String name;
	private String last_name;
	private String email;
	private String phone_num;
	private String address_1;
	private String address_2;
	private String postCode;
	private String dob;
	private String gender;
        private int booking;
        String membership = "";
        
        abstract void setStatus(String type);
        abstract String getStatus();
        
	public createMember() {
		// TODO - implement createMember.createMember
		
	}

	public String getTitle() {
		return title;
	}

	public String getName() {
		return name;
	}

	public String getLast() {
		// TODO - implement createMember.getLast
		return last_name;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		// TODO - implement createMember.getPhone
		return phone_num;
	}

	public String getAddr1() {
		// TODO - implement createMember.getAddr1
		return address_1;
	}

	public String getAddr2() {
		// TODO - implement createMember.getAddr2
		return address_2;
	}

	public String getPostCode() {
		// TODO - implement createMember.getPostCode
		return postCode;
	}

	public String getDOB() {
		// TODO - implement createMember.getDOB
                    return dob;
        }

	public String getGender() {
		return gender;
	}
        public int getBooking(){
            return booking;
        }

	

	public void  setTitle(String aTitle) {
		// TODO - implement createMember.setTitle
		 title = aTitle;
	}

	public void  setName(String aName) {
		// TODO - implement createMember.setName
                name = aName;
	}

	public void setLast(String aLast) {
		// TODO - implement createMember.setLast
                last_name = aLast;
	}

	public void setEmail(String aEmail) {
		// TODO - implement createMember.setEmail
                email = aEmail;
	}

	public void setPhone(String aPhone) {
		// TODO - implement createMember.setPhone
                phone_num = aPhone;
	}

	public void setAddr1(String aAddress_1) {
		// TODO - implement createMember.setAddr1
                address_1 = aAddress_1;
	}

	public void setAddr2(String aAddress_2) {
		// TODO - implement createMember.setAddr2
                address_2 = aAddress_2;
        }

	public void setPostCode(String aPostCode) {
		// TODO - implement createMember.setPostCode
                postCode = aPostCode;
	}

	public void setDOB(String aDOB) {
		// TODO - implement createMember.setDOB
                dob = aDOB;
        }

	public void setGender(String aGender) {
		// TODO - implement createMember.setGender
                gender = aGender;
	}
        public void setBooking(int aBooking){
            if(aBooking > 0){
              booking = aBooking;
            }
            else
                booking = 0;
        }

	

}
