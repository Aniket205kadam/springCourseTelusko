package com.aniket.ServletExample1;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App 
{
    public static void main( String[] args ) throws LifecycleException
    {
        System.out.println("Servlet App");
        
        //run the tomcat
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8086);
        
        
        //1st para is application we keep it is default because 
        //we are working on the same project
        //2nd para is the directory sturctured
        Context context = tomcat.addContext("", null);
        
		/*you take name of servlet any thing 
		 * it not this name is same for the servlet name
		 * Tomcat.addServlet(context, "h1", new MyServlet());
		 * context.addServletMappingDecoded("/my", "h1");
		 */
        
        Tomcat.addServlet(context, "MyServlet", new MyServlet());
        context.addServletMappingDecoded("/my", "MyServlet");
        
        tomcat.start();
        tomcat.getServer().await();
    }
}
