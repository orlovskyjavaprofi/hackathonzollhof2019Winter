package tests.model.custommodeltests;

import model.domainModels.VisitorAppointmentPublicEvent;
import model.domainModels.VisitorCollectionOfPublicExhibitorEvents;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;

public class VisitorCollectionOfPublicExhibitorEventsTest {
    private VisitorCollectionOfPublicExhibitorEvents visitorCollectionOfPublicEvents;

    @Before
    public void setUp() throws Exception {
        visitorCollectionOfPublicEvents = new VisitorCollectionOfPublicExhibitorEvents();
    }

    @Test
    public void checkIfACollectionOfPublicExhibitorEventsCanBeSetUp() {
        assertNotNull(visitorCollectionOfPublicEvents);
    }
    
    @Test
    public void checkIfPublicEventAppointmentCanBeInsertedToSet() {
        VisitorAppointmentPublicEvent visitorAtPublicEventObj;
        visitorAtPublicEventObj = new VisitorAppointmentPublicEvent("Tom", "12:45", "Corp Inc", "Halle 8 / 8-414", "Biofach" );
        Boolean expectedResult = true;
        
        assertEquals("Insert into set of collection of public Appointments failed!", expectedResult,
                     visitorCollectionOfPublicEvents.insertVisitorPublicAppointmentToSet(visitorAtPublicEventObj));
    }
    
    @Test
    public void checkIfManyPublicAppoitnmentsCanBeAddedToASet() {

        initInsertOfPublicVisitorAppointments();

       assertNotNull("cant add a Visitor public appointments to a Set", visitorCollectionOfPublicEvents.getSetOfVisitorExhibitorsForPublicEvents());
        
    }

    private void initInsertOfPublicVisitorAppointments() {
        VisitorAppointmentPublicEvent visitorAtPublicEventObj1;
        VisitorAppointmentPublicEvent visitorAtPublicEventObj2;
        VisitorAppointmentPublicEvent visitorAtPublicEventObj3;
        VisitorAppointmentPublicEvent visitorAtPublicEventObj4;
        VisitorAppointmentPublicEvent visitorAtPublicEventObj5;
        visitorAtPublicEventObj1 =
            new VisitorAppointmentPublicEvent("Tom", "12:45", "Corp Inc1", "Halle 8 / 8-414", "Biofach");
        visitorAtPublicEventObj2 =
            new VisitorAppointmentPublicEvent("Bob", "13:45", "Corp Inc2", "Halle 8 / 8-414", "Biofach");
        visitorAtPublicEventObj3 =
            new VisitorAppointmentPublicEvent("John", "20:45", "Corp Inc3", "Halle 8 / 8-414", "Biofach");
        visitorAtPublicEventObj4 =
            new VisitorAppointmentPublicEvent("Lot", "21:45", "Corp Inc4", "Halle 8 / 8-414", "Biofach");
        visitorAtPublicEventObj5 =
            new VisitorAppointmentPublicEvent("Jol", "22:45", "Corp Inc5", "Halle 8 / 8-414", "Biofach");

        visitorCollectionOfPublicEvents.insertVisitorPublicAppointmentToSet(visitorAtPublicEventObj1);
        visitorCollectionOfPublicEvents.insertVisitorPublicAppointmentToSet(visitorAtPublicEventObj2);
        visitorCollectionOfPublicEvents.insertVisitorPublicAppointmentToSet(visitorAtPublicEventObj3);
        visitorCollectionOfPublicEvents.insertVisitorPublicAppointmentToSet(visitorAtPublicEventObj4);
        visitorCollectionOfPublicEvents.insertVisitorPublicAppointmentToSet(visitorAtPublicEventObj5);
    }
}
