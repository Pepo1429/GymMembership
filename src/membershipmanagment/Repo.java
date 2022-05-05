/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package membershipmanagment;

import java.sql.*;
import java.util.ArrayList;

public interface Repo {

	/**
	 * 
     * @param conn
     * @param check
     * @return 
	 */
	public ArrayList read(Connection conn,String check);
         void write(Connection conn, ArrayList list);
   //     public ArrayList search(Connection conn,ArrayList list,String search);
        void delete(Connection conn,String check);
        public String update(Connection conn,ArrayList updateMemb);
        public String upgrade(Connection conn,ArrayList upgradeMemb);


}