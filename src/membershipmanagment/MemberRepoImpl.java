/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package membershipmanagment;
import java.lang.reflect.Member;
import java.sql.*;


import java.util.ArrayList;

/**
 *
 * @author Pepo
 */
public class MemberRepoImpl implements Repo {
    private ArrayList<Member> members;
    MemberFactory mem = new MemberFactory();
          public ArrayList read(Connection conn,String check){
                            System.out.println(check);

            System.out.println("Reading from the database...");
            ArrayList list = new ArrayList();
            try{
                   PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM MEMBER WHERE EMAIL = ?");
                    pstmt.setString(1,check);
                   Statement st = conn.createStatement();
                   ResultSet rs = pstmt.executeQuery();   
                    
                    while(rs.next()){
                        createMember Member = mem.inputType("Silver Membership");
                        Member.setTitle(rs.getString("TITLE"));
                        Member.setName(rs.getString("NAME"));
                        Member.setLast(rs.getString("LAST_NAME"));
                        Member.setEmail(rs.getString("EMAIL"));
                        Member.setPhone(rs.getString("PHONE_NUMBER"));
                        Member.setAddr1(rs.getString("ADDRESS_1"));
                        Member.setAddr2(rs.getString("ADDRESS_2"));
                        Member.setPostCode(rs.getString("POST_CODE"));
                        Member.setDOB(rs.getString("DOB"));
                        Member.setGender(rs.getString("GENDER"));
                        Member.setBooking(rs.getInt("BOOKING"));
                        Member.setStatus(rs.getString("STATUS"));
                        list.add(Member);
                    }
                    rs.close();
                    st.close();
                }
            
            catch(SQLException ex){
      //          System.out.println("SQL falied1");
        //         printSQLException(ex);
            }
            members = list;
            return members;
        }

    @Override
        public void write (Connection conn, ArrayList members){
            System.out.println("writing to the data base");
            System.out.println("record size" + members.size());
            Statement st;
            
            for(int i = 0; i < members.size(); i++){
                createMember Member = (createMember)members.get(i);
                try {
                    st = conn.createStatement();
                   String sql = "INSERT INTO MEMBER VALUES ('" +         Member.getEmail()+"','" /*Member.getTitle() + "','" + Member.getName() + */
                                                                       + Member.getName()+ "','"
                                                                       + Member.getLast()+ "','"
                                                                       + Member.getTitle()+ "','"
                                                                       + Member.getPhone()+ "','"
                                                                       + Member.getAddr2()+ "','"
                                                                       + Member.getAddr2()+ "','"
                                                                       + Member.getPostCode()+ "','"
                                                                       + Member.getDOB()+ "','"
                                                                       + Member.getGender()+ "',"
                                                                       + Member.getBooking() + ",'"
                                                                       + Member.getStatus() + "')";
                   
                   st.executeUpdate(sql);
                    
                   st.close();
                }
                catch (SQLException ex ){
                    System.out.println("Error1");
                }
            }
        }
    /*     public ArrayList search(Connection conn,ArrayList Member,String search){
            ArrayList list = new ArrayList();
            try{
                  
                    Statement st = conn.createStatement();
                    ResultSet rs = null;
                    String sql = "SELECT * FROM MEMBER";
                    rs = st.executeQuery(sql);
                    
                    while(rs.next()){
                        createMember temp = mem.inputType(rs.getString("STATUS"));
                        temp.setTitle(rs.getString("TITLE"));
                        temp.setName(rs.getString("NAME"));
                        temp.setLast(rs.getString("LAST_NAME"));
                        temp.setEmail(rs.getString("EMAIL"));
                        temp.setPhone(rs.getString("PHONE_NUMBER"));
                        temp.setAddr1(rs.getString("ADDRESS_1"));
                        temp.setAddr2(rs.getString("ADDRESS_2"));
                        temp.setPostCode(rs.getString("POST_CODE"));
                        temp.setDOB(rs.getString("DOB"));
                        temp.setGender(rs.getString("GENDER"));
                        temp.setBooking(rs.getInt("BOOKING"));
                        list.add(Member);
                                
                    }
                    rs.close();
                    st.close();
                }
            
            catch(SQLException ex){
                System.out.println("SQL falied1");
                printSQLException(ex);
                        ex.printStackTrace();
            }
            members = list;
            return members;
        
         
         }*/
         public static void printSQLException(SQLException ex) {

    for (Throwable e : ex) {
        if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " +
                    ((SQLException)e).getSQLState());

                System.err.println("Error Code: " +
                    ((SQLException)e).getErrorCode());

                System.err.println("Message: " + e.getMessage());

                Throwable t = ex.getCause();
                while(t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
         
         public void delete(Connection conn,String target){
                            System.out.println(target);

            System.out.println("deleting from the database...");
            ArrayList list = new ArrayList();
            try{
                   PreparedStatement pstmt = conn.prepareStatement("DELETE FROM MEMBER WHERE EMAIL = ?");
                    pstmt.setString(1,target);
                   Statement st = conn.createStatement();
                   pstmt.executeUpdate();   
                   
                    st.close();
                }
            
            catch(SQLException ex){
   //             System.out.println("SQL falied1");
     //            printSQLException(ex);
       //                 ex.printStackTrace();
            }
            
        }
          public String update(Connection conn,ArrayList updateMemb){

            ArrayList list = new ArrayList();
            
            for(int i = 0; i < updateMemb.size(); i++){
                createMember Member = (createMember)updateMemb.get(i);
            try{
                   PreparedStatement pstmt = conn.prepareStatement("UPDATE MEMBER SET NAME = ?,LAST_NAME = ?,TITLE = ?,PHONE_NUMBER = ?,ADDRESS_1 = ?,ADDRESS_2=?,POST_CODE=?,DOB=?,GENDER=? WHERE EMAIL = ?");
                    pstmt.setString(1,Member.getName());
                    pstmt.setString(2,Member.getLast());
                    pstmt.setString(3,Member.getTitle());
                    pstmt.setString(4,Member.getPhone());
                    pstmt.setString(5,Member.getAddr1());
                    pstmt.setString(6,Member.getAddr2());
                    pstmt.setString(7,Member.getPostCode());
                    pstmt.setString(8,Member.getDOB());
                    pstmt.setString(9,Member.getGender());
                    pstmt.setString(10,Member.getEmail());
            


                   Statement st = conn.createStatement();
                   pstmt.executeUpdate();   
                   
                    st.close();
                }
            
            
            catch(SQLException ex){
      //          System.out.println("SQL falied1");
      //           printSQLException(ex);
      //                  ex.printStackTrace();
            }
            }
            return "done";
            
          }
             public String upgrade(Connection conn,ArrayList upgradeMemb){

   //         ArrayList list = new ArrayList();
            
            for(int i = 0; i < upgradeMemb.size(); i++){
                createMember Member = (createMember)upgradeMemb.get(i);
            try{
                   PreparedStatement pstmt = conn.prepareStatement("UPDATE MEMBER SET STATUS = ? WHERE EMAIL = ?");
                    pstmt.setString(1,Member.getStatus());
                    pstmt.setString(2,Member.getEmail());
            


                   Statement st = conn.createStatement();
                   pstmt.executeUpdate();   
                   
                    st.close();
                }
            
            
            catch(SQLException ex){
        //        System.out.println("SQL falied1");
      //           printSQLException(ex);
          //              ex.printStackTrace();
            }
            }
            return "done";
            
          }
         
}
            

            
 
