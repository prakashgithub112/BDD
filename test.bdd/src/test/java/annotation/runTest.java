package annotation;



import org.junit.runner.RunWith; 
import cucumber.junit.Cucumber; 

@RunWith(Cucumber.class) 
@Cucumber.Options(format = {"pretty", "html:target/cucumber"},
				  features={"src/test/java/annotation/"}) 

public class runTest { }