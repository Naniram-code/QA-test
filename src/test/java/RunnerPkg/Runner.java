
  package RunnerPkg;
  
  
  import io.cucumber.junit.Cucumber; import org.junit.runner.RunWith;import io.cucumber.junit.CucumberOptions;
  
  // 1. define running with cucumber class -> @RunWith
  
  @RunWith(Cucumber.class) //import from junit
  
  // 2. Cucumber options to use multiple options -> @CucumberOptions
  
 @CucumberOptions(features="/Users/nanirambhujel/eclipse-workspace/NewCuCumber/src/test/java/Features",
                       
 //@CucumberOptions(features="/Users/nanirambhujel/eclipse-workspace/NewCuCumber/src/test/java/Features/Search.feature",
 //@CucumberOptions(features="/Users/nanirambhujel/eclipse-workspace/NewCuCumber/src/test/java/Features/Account&List.feature",
  glue="stepDefenations",monochrome=true,
                            plugin={"pretty","html:target/ExecutionReport"})         //, tags="@Release1.0")
  
  // 1. Continue working in TDD POM framework - same application // 2. Build
  //BDD POM framework - same application
  
  public class Runner {
  
  }
  
 
