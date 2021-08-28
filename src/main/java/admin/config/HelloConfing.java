package admin.config;


@configuration
public class HelloConfing {
	@Been(Hello)
   public Hello getHello() {
	   return new Hello
   }
}
