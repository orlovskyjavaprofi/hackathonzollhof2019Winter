package tests.model.custommodeltests;

import model.domainModels.VisitorRequestMoreInformationAboutExhibitor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;

public class VisitorRequestMoreInformationAboutExhibitorTest {
private VisitorRequestMoreInformationAboutExhibitor visitorRequestObj;

    @Before
    public void setUp() throws Exception {
        visitorRequestObj = new VisitorRequestMoreInformationAboutExhibitor();          
    }

    @Test
    public void checkIfPersonCanBeInstatiated(){
        assertNotNull(visitorRequestObj);
    }
    
    @Test
    public void checkIfExhibitorNameCanBeSet(){
        String expectedCompanyName ="Inc";
        visitorRequestObj.setExhibitorName(expectedCompanyName);
        assertEquals("Seting of exhibitor name wasnt successeful!", expectedCompanyName, visitorRequestObj.getExhibitorName() );
    }
    
    @Test
    public void checkIfVisitorMessageCanBeSet(){
        String expectedVisitorMessage ="I would like to know more about your product xyz";
        visitorRequestObj.setVisitorRequestMessage(expectedVisitorMessage);
        assertEquals("Seting of visitor message wasnt successeful!", expectedVisitorMessage, visitorRequestObj.getVisitorRequestMessage() );
    }
    
    @Test
    public void checkIfVisitorEmailCanBeSet(){
        String expectedVisitorEmail ="test@test.com";
        visitorRequestObj.setVisitorEmail(expectedVisitorEmail);
        assertEquals("Seting of visitor email wasnt successeful!", expectedVisitorEmail, visitorRequestObj.getVisitorEmail() );
    }
    
}
