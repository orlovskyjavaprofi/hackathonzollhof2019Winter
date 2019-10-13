package tests.model.custommodeltests;

import model.domainModels.VisitorAppointmentWithExhibitor;
import model.domainModels.VisitorCollectionOfAppointmentsWithExhibitor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;

public class VisitorCollectionOfAppointmentsWithExhibitorTest {
    private VisitorCollectionOfAppointmentsWithExhibitor visitorCollectionOfAppointments;

    @Before
    public void setUp() throws Exception {
        visitorCollectionOfAppointments = new VisitorCollectionOfAppointmentsWithExhibitor();
    }

    @Test
    public void checkIfSetOfVisitorCollectionOfAppointmentsWithExhibitorInit() {
        assertNotNull(visitorCollectionOfAppointments);
    }

    @Test
    public void checkIfAppointmentCanBeInsertedToSet() {
        VisitorAppointmentWithExhibitor visitorAppointment =
            new VisitorAppointmentWithExhibitor("UEE Inc", "Halle 8 / 8-414", "BIOFACH");
        Boolean expectedResult = true;
        assertEquals("Insert into set of collection of Appointments failed!", expectedResult,
                     visitorCollectionOfAppointments.insertVisitorAppointmentToSet(visitorAppointment));
    }

    @Test
    public void checkIfManyAppoitnmentsCanBeAddedToASet() {
        initSetofVisitorAppointments();

        assertNotNull("cant add a VisitorAppointments to a Set", visitorCollectionOfAppointments.getSetOfVisitorAppointments());
    }

    private void initSetofVisitorAppointments() {
        VisitorAppointmentWithExhibitor visitorAppointment1 =
            new VisitorAppointmentWithExhibitor("UEE Inc", "Halle 8 / 8-414", "BIOFACH");
        VisitorAppointmentWithExhibitor visitorAppointment2 =
            new VisitorAppointmentWithExhibitor("Inc2", "Halle 8 / 8-314", "BIOFACH");
        VisitorAppointmentWithExhibitor visitorAppointment3 =
            new VisitorAppointmentWithExhibitor("Inc3", "Halle 8 / 8-214", "BIOFACH");
        VisitorAppointmentWithExhibitor visitorAppointment4 =
            new VisitorAppointmentWithExhibitor("Inc4", "Halle 8 / 8-114", "BIOFACH");
        VisitorAppointmentWithExhibitor visitorAppointment5 =
            new VisitorAppointmentWithExhibitor("Inc5", "Halle 8 / 8-514", "BIOFACH");
        visitorCollectionOfAppointments.insertVisitorAppointmentToSet(visitorAppointment1);
        visitorCollectionOfAppointments.insertVisitorAppointmentToSet(visitorAppointment2);
        visitorCollectionOfAppointments.insertVisitorAppointmentToSet(visitorAppointment3);
        visitorCollectionOfAppointments.insertVisitorAppointmentToSet(visitorAppointment4);
        visitorCollectionOfAppointments.insertVisitorAppointmentToSet(visitorAppointment5);
    }
}
