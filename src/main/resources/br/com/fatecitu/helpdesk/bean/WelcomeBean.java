package br.com.fatecitu.helpdesk.bean;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Erick
 */
@ManagedBean(name = "welcomeBean", eager = true)
public class WelcomeBean {
    public WelcomeBean() {
      System.out.println("HelloWorld started!");
   }
	
   public String getMessage() {
      return "Hello World!";
   }
}
