package tests.model.custommodeltests;

import model.domainModels.VisitorAppointmentPrivateMeetup;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;

public class VisitorAppointmentPrivateMeetupTest {

private VisitorAppointmentPrivateMeetup visitorAppointmentPrivateMeetupObj;

    @Before
    public void setUp() throws Exception {
        visitorAppointmentPrivateMeetupObj = new VisitorAppointmentPrivateMeetup();
    }
    
    @Test
    public void checkIfVisitorAtPublicEvenCanBeInit(){
        assertNotNull(visitorAppointmentPrivateMeetupObj);
    }
    
    @Test
    public void checkIfVisitorNameCanBeSetUp(){
        String expectedVisitorName = "Bob";
        visitorAppointmentPrivateMeetupObj.setVisitorNameForPrivateEvent(expectedVisitorName);
        
        assertEquals("Seting of visitor name wasnt successeful!", expectedVisitorName, visitorAppointmentPrivateMeetupObj.getVisitorNameForPrivateEvent() );
    }
    
    @Test
    public void checkIfVisitorTimeAppointmentCanBeSetUp(){
        String expectedVisitorAppointmentTime = "12:45";
                
        assertEquals("Seting of visitor appointment time wasnt successeful!",
                     expectedVisitorAppointmentTime, visitorAppointmentPrivateMeetupObj.setVisitorAppointmentTimeForPrivateEvent(expectedVisitorAppointmentTime) );
    }
    
    @Test
    public void checkIfVisitorMessageToExhibitorCanBeSetUp(){
        String expectedMessageToExhibitor = "Hello i would love to know more about your products!";
        visitorAppointmentPrivateMeetupObj.setVisitorMessageToAExhibitorBeforeTalkingToExhibitor(expectedMessageToExhibitor);
        
        assertEquals("Seting of visitor appointment time wasnt successeful!",
                     expectedMessageToExhibitor, visitorAppointmentPrivateMeetupObj.getVisitorMessageToAExhibitorBeforeTalkingToExhibitor() );
    }
    
    @Test
    public void checkIfAExibitorCompanyNameCanBeSet() {
        String expectedCompanyName = "Corp Inc";
        visitorAppointmentPrivateMeetupObj.setExhibitorCompanyName(expectedCompanyName);
        assertEquals("Seting of exhibitor company name wasnt successeful!", expectedCompanyName,
                     visitorAppointmentPrivateMeetupObj.getExhibitorCompanyName());
    }

    @Test
    public void checkIfAExibitorHallNameCanBeSet() {
        String expectedHallName = "Halle 8 / 8-414";
        visitorAppointmentPrivateMeetupObj.setExhibitorHallName(expectedHallName);
        assertEquals("Seting of exhibitor hall name wasnt successeful!", expectedHallName,
                     visitorAppointmentPrivateMeetupObj.getExhibitorHallName());
    }

    @Test
    public void checkIfAExibitorTradeShowNameCanBeSet() {
        String expectedTradeShowName = "Biofach";
        visitorAppointmentPrivateMeetupObj.setExhibitorTradeShowName(expectedTradeShowName);
        assertEquals("Seting of exhibitor trade show name wasnt successeful!", expectedTradeShowName,
                     visitorAppointmentPrivateMeetupObj.getExhibitorTradeShowName());
    }
    
}
