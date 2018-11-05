package org.raja.project.REST.messagesender;

import java.util.ArrayList;
import java.util.List;

import org.raja.project.REST.xmlresponse.response;

public class messenger {
	
	public List<response> getmessages()
	{
		response r1= new response("Raja", 20, 300);
		List<response> list=new ArrayList<>();
		list.add(r1);
		return list;
	}

}
