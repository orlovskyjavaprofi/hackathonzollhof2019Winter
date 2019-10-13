package tests.model.custommodeltests;

import model.domainModels.VisitorAppointmentPrivateMeetup;
import model.domainModels.VisitorCollectionOfPrivateMeetupsWithExhibitors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;

public class VisitorCollectionOfPrivateMeetupsWithExhibitorsTest {
    private VisitorCollectionOfPrivateMeetupsWithExhibitors visitorPrivateMeetup;
    
    @Before
    public void setUp() throws Exception {
        visitorPrivateMeetup = new VisitorCollectionOfPrivateMeetupsWithExhibitors();
    }
    
    @Test
    public void checkIfACollectionOfPrivateMetupsWithExhibitorCanBeSetUp() {
       assertNotNull(visitorPrivateMeetup);
    }
    
    @Test
    public void checkIfPrivateMeetupWithExhibitorCanBeInsertedToSet() {
        Boolean expectedResult = true;
        VisitorAppointmentPrivateMeetup privateMeetupVisitorExhibitor = 
            new VisitorAppointmentPrivateMeetup("John","16:00", "I would like to know more about your xyz product!", "Inc", "Halle 8 / 8-414", "Biofach"  );
        
        assertEquals("Insert into set of collection of private Appointments failed!", expectedResult,
                     visitorPrivateMeetup.insertVisitorPrivateAppointmentToSet(privateMeetupVisitorExhibitor));
    }
    
    @Test
    public void checkIfPrivateMeetupsWithExhibitorsCanbeInsertedToSet(){
        visitorPrivateAppointmentsInit();

        assertNotNull("cant add a Visitor private appointments to a Set", visitorPrivateMeetup.getSetOfVisitorExhibitorsForPrivateMeetups());
    }

    private void visitorPrivateAppointmentsInit() {
        VisitorAppointmentPrivateMeetup privateMeetupVisitorExhibitor1 =
            new VisitorAppointmentPrivateMeetup("John", "16:00", "I would like to know more about your xyz2 product!",
                                                "Inc1", "Halle 8 / 8-414", "Biofach");
        VisitorAppointmentPrivateMeetup privateMeetupVisitorExhibitor2 =
            new VisitorAppointmentPrivateMeetup("John", "17:00", "I would like to know more about your xyz3 product!",
                                                "Inc2", "Halle 8 / 8-414", "Biofach");
        VisitorAppointmentPrivateMeetup privateMeetupVisitorExhibitor3 =
            new VisitorAppointmentPrivateMeetup("John", "18:00", "I would like to know more about your xyz4 product!",
                                                "Inc3", "Halle 8 / 8-414", "Biofach");
        VisitorAppointmentPrivateMeetup privateMeetupVisitorExhibitor4 =
            new VisitorAppointmentPrivateMeetup("John", "19:00", "I would like to know more about your xyz5 product!",
                                                "Inc4", "Halle 8 / 8-414", "Biofach");
        VisitorAppointmentPrivateMeetup privateMeetupVisitorExhibitor5 =
            new VisitorAppointmentPrivateMeetup("John", "20:00", "I would like to know more about your xyz6 product!",
                                                "Inc5", "Halle 8 / 8-414", "Biofach");
    }
}
