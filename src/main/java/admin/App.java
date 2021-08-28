package admin;



public class App {
  public static vois main(String[] args) {
	  ApplicationContext context = new AnnotationConfigApplicationContext(HelloConfig.class);
	  Hello hello = (Hello)context.getBean("Hello")
  }
}
