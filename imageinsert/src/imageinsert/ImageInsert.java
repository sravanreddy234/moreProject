package imageinsert;

import java.sql.*;  
import java.io.*;  
public class ImageInsert {  
public static void main(String[] args) {  
try{  
	Class.forName("org.h2.Driver");
	Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/prjct", "sa", "");
              
/*PreparedStatement ps=con.prepareStatement("insert into imgtable values(?,?)");  
ps.setString(1,"sonoo");  
  
FileInputStream fin=new FileInputStream("D:\\images\\del1.jpg");  
ps.setBinaryStream(2,fin,fin.available());  
int i=ps.executeUpdate();  
System.out.println(i+" records affected");  */
	
	PreparedStatement ps=con.prepareStatement("select * from imgtable");  
	ResultSet rs=ps.executeQuery();  
	if(rs.next()){//now on 1st row  
	              
	Blob b=rs.getBlob(2);//2 means 2nd column data  
	byte barr[]=b.getBytes(1,(int)b.length());//1 means first image  
	              
	FileOutputStream fout=new FileOutputStream("d:\\sonoo.jpg");  
	fout.write(barr);  
	              
	fout.close();  
	}//end of if  
	System.out.println("ok");  
	              
	con.close();  
	}catch (Exception e) {e.printStackTrace();  }  
	}  
	}  