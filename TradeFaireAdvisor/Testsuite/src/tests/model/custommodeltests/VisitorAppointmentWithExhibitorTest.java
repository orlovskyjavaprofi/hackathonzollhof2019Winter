package tests.model.custommodeltests;

import model.domainModels.VisitorAppointmentWithExhibitor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;

public class VisitorAppointmentWithExhibitorTest {

    private VisitorAppointmentWithExhibitor visitorAppointmentObj;

    @Before
    public void setUp() throws Exception {
        visitorAppointmentObj = new VisitorAppointmentWithExhibitor();
    }
    
    @Test
    public void checkIfAVisitorAppointmentCanBeCreated(){
        assertNotNull(visitorAppointmentObj);
    }
    
    @Test
    public void checkIfAExibitorCompanyNameCanBeSet(){
        String expectedCompanyName ="Corp Inc";
        visitorAppointmentObj.setExhibitorCompanyName(expectedCompanyName);
        assertEquals("Seting of exhibitor company name wasnt successeful!", expectedCompanyName, visitorAppointmentObj.getExhibitorCompanyName());
    }
    
    @Test
    public void checkIfAExibitorHallNameCanBeSet(){
        String expectedHallName = "Halle 8 / 8-414";
        visitorAppointmentObj.setExhibitorHallName(expectedHallName);
        assertEquals("Seting of exhibitor hall name wasnt successeful!", expectedHallName, visitorAppointmentObj.getExhibitorHallName());
    }
    
    @Test
    public void checkIfAExibitorTradeShowNameCanBeSet(){
        String expectedTradeShowName = "Biofach";
        visitorAppointmentObj.setExhibitorTradeShowName(expectedTradeShowName);
        assertEquals("Seting of exhibitor trade show name wasnt successeful!", expectedTradeShowName, visitorAppointmentObj.getExhibitorTradeShowName());
    }
}
