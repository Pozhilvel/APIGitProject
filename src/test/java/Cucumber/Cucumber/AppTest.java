package Cucumber.Cucumber;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );        
        
    }
    
    @Test
    public void jiraLogin()
    {
    	System.out.println("Successfully login into Jira1");
    	System.out.println("Successfully login into Jira2");
    	System.out.println("Successfully login into Jira3");   	
    	
    }
    
    @Test
    public void jiraLogOut()
    {
    	System.out.println("Successfully logout from Jira1");
    	System.out.println("Successfully logout from Jira2");
    	System.out.println("Successfully logout from Jira3");
    }
}
