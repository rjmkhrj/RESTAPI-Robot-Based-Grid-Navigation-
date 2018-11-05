package org.raja.project.REST.messages;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.raja.project.REST.messagesender.messenger;
import org.raja.project.REST.xmlresponse.response;

@Path("/messages")
public class message {
	
	messenger m=new messenger();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<response> getmessages()
	{
		return m.getmessages();
	}

}
