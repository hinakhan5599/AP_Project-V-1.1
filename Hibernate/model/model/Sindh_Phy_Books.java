package model;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;

import javax.persistence.*;

import org.infinispan.commons.util.Base64.InputStream;
@Entity  
@Table(name="sindhphybooks")  
@PrimaryKeyJoinColumn(name="bid")
public class Sindh_Phy_Books extends boards{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)  
		
	@Column(name = "spid")  
	private int spid;

	@Column(name="title")    
	private String title;  

	@Column(name="path")    
	private String path; 
	//setters and getters  

	public String getTitle() {return title;}
	public void setTitle(String ftitle) {this.title = ftitle;}
	
	public String getPath(){ return path;}
	public void setPath(String fpath){
		this.path = fpath;
	}
	public byte[] toByteArray(Blob fromDocBlob) {
	    ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    try {
	      return toByteArrayImpl(fromDocBlob, baos);
	    } catch (Exception e) {
	    }
	    return null;
	  }



	public byte[] toByteArrayImpl(Blob fromdocBlob, 
	      ByteArrayOutputStream baos) throws SQLException, IOException {
	    byte buf[] = new byte[4000];
	    int dataSize;
	    java.io.InputStream is = fromdocBlob.getBinaryStream(); 

	    try {
	      while((dataSize = is.read(buf)) != -1) {
	        baos.write(buf, 0, dataSize);
	      }    
	    } finally {
	      if(is != null) {
	        is.close();
	      }
	    }
	    return baos.toByteArray();
	  }

}
