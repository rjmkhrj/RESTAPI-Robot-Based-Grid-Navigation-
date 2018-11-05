package org.raja.project.REST.xmlresponse;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class response {
	
	private String name;
	private int id;
	private long DOB;
	
	public response()
	{
	}
	public response(String name, int id, long DOB){
		
		this.name=name;
		this.id=id;
		this.DOB=DOB;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getDOB() {
		return DOB;
	}
	public void setDOB(long dOB) {
		DOB = dOB;
	}

}
