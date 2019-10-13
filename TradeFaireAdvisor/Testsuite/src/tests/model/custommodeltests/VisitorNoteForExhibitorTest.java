package tests.model.custommodeltests;

import model.domainModels.VisitorNoteForExhibitor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;

public class VisitorNoteForExhibitorTest {
 
 private VisitorNoteForExhibitor visitorNoteObj;

    @Before
    public void setUp() throws Exception {
        visitorNoteObj = new VisitorNoteForExhibitor();
    }
    
    @Test
    public void checkIfVisitorNoteCanBeCreated(){
        assertNotNull("Visitor note on Exhibitor can be created!", visitorNoteObj);
    }
    
    @Test
    public void checkIfATextCanBeSetInVisitorNote(){
        String expectedNote = "cool exhibitor!";
        visitorNoteObj.setVisitorNote(expectedNote);
        assertEquals("Seting of visitor note wasnt successeful!", expectedNote, visitorNoteObj.getVisitorNote());
    }
    
    @Test
    public void checkIfAExibitorNameCanBeSet(){
        String exhibitorName = "CompanyInc";
        visitorNoteObj.setExhibitorName(exhibitorName);
        assertEquals("Seting of visitor exhibitor name wasnt successeful!", exhibitorName, visitorNoteObj.getExhibitorName());
    }
    
  
}
