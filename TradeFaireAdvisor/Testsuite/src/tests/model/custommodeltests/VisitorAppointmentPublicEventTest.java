package tests.model.custommodeltests;

import model.domainModels.VisitorAppointmentPublicEvent;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;

public class VisitorAppointmentPublicEventTest {
    private VisitorAppointmentPublicEvent visitorAtPublicEventObj;

    @Before
    public void setUp() throws Exception {
        visitorAtPublicEventObj = new VisitorAppointmentPublicEvent();
    }

    @Test
    public void checkIfVisitorAtPublicEvenCanBeInit() {
        assertNotNull(visitorAtPublicEventObj);
    }

    @Test
    public void checkIfVisitorNameCanBeSetUp() {
        String expectedVisitorName = "Tom";
        visitorAtPublicEventObj.setVisitorName(expectedVisitorName);

        assertEquals("Seting of visitor name wasnt successeful!", expectedVisitorName,
                     visitorAtPublicEventObj.getVisitorName());
    }

    @Test
    public void checkIfVisitorTimeAppointmentCanBeSetUp() {
        String expectedVisitorAppointmentTime = "12:45";

        assertEquals("Seting of visitor appointment time wasnt successeful!", expectedVisitorAppointmentTime,
                     visitorAtPublicEventObj.setVisitorAppointmentTime(expectedVisitorAppointmentTime));
    }

    @Test
    public void checkIfAExibitorCompanyNameCanBeSet() {
        String expectedCompanyName = "Corp Inc";
        visitorAtPublicEventObj.setExhibitorCompanyName(expectedCompanyName);
        assertEquals("Seting of exhibitor company name wasnt successeful!", expectedCompanyName,
                     visitorAtPublicEventObj.getExhibitorCompanyName());
    }

    @Test
    public void checkIfAExibitorHallNameCanBeSet() {
        String expectedHallName = "Halle 8 / 8-414";
        visitorAtPublicEventObj.setExhibitorHallName(expectedHallName);
        assertEquals("Seting of exhibitor hall name wasnt successeful!", expectedHallName,
                     visitorAtPublicEventObj.getExhibitorHallName());
    }

    @Test
    public void checkIfAExibitorTradeShowNameCanBeSet() {
        String expectedTradeShowName = "Biofach";
        visitorAtPublicEventObj.setExhibitorTradeShowName(expectedTradeShowName);
        assertEquals("Seting of exhibitor trade show name wasnt successeful!", expectedTradeShowName,
                     visitorAtPublicEventObj.getExhibitorTradeShowName());
    }
}
