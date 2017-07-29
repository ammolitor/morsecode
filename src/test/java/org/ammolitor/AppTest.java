package org.ammolitor;

import junit.framework.TestCase;
import junit.framework.TestResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {


    @Test
    public void convertTo() throws Exception {
        assertEquals("∙∙∙ ∙- ∙∙∙- ∙ | --- ∙∙- ∙-∙ | ∙∙∙ ∙∙∙∙ ∙∙ ∙--∙ | ", App.run("to", "Save Our Ship!"));
    }

    @Test
    public void convertFrom() throws Exception {
        assertEquals("SAVE OUR SHIP ", App.run("from", "∙∙∙ ∙- ∙∙∙- ∙ | --- ∙∙- ∙-∙ | ∙∙∙ ∙∙∙∙ ∙∙ ∙--∙ | "));
    }
}
