package kontrolltoo2;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TestAnalytics{
    @Test
    public void testIfInputIsNotNull(){
        Analytics text = new Analytics();
        String input = text.input;
        assertNotNull(input);
    }

    
}