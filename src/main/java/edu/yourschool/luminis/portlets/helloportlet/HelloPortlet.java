package edu.yourschool.luminis.portlets.helloportlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

public class HelloPortlet extends GenericPortlet {

	@Override
	protected void doView(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<b>Hello, World!</b><br/>This is a great thing!");
		
	
	}
	
}
