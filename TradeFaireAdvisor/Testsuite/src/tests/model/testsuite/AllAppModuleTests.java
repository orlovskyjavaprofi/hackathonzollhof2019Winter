package tests.model.testsuite;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import tests.model.custommodeltests.PersonOfInterestTest;
import tests.model.custommodeltests.VisitorAppointmentPrivateMeetupTest;
import tests.model.custommodeltests.VisitorAppointmentPublicEventTest;
import tests.model.custommodeltests.VisitorAppointmentWithExhibitorTest;
import tests.model.custommodeltests.VisitorCollectionOfAppointmentsWithExhibitorTest;
import tests.model.custommodeltests.VisitorCollectionOfInterestedPersonsTest;
import tests.model.custommodeltests.VisitorCollectionOfNotesForExhibitorsTest;
import tests.model.custommodeltests.VisitorCollectionOfPrivateMeetupsWithExhibitorsTest;
import tests.model.custommodeltests.VisitorCollectionOfRequestMoreInformationFromExhibitorsTest;
import tests.model.custommodeltests.VisitorNoteForExhibitorTest;
import tests.model.custommodeltests.VisitorRequestMoreInformationAboutExhibitorTest;
import tests.model.mainfixture.AppModuleAMFixture;
import tests.model.viewtests.TradeFaireVisitorVO1VOTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ TradeFaireVisitorVO1VOTest.class, PersonOfInterestTest.class,
                      VisitorAppointmentWithExhibitorTest.class, VisitorCollectionOfAppointmentsWithExhibitorTest.class,
                      VisitorCollectionOfInterestedPersonsTest.class, VisitorCollectionOfNotesForExhibitorsTest.class,
                      VisitorNoteForExhibitorTest.class, VisitorAppointmentPublicEventTest.class, VisitorCollectionOfAppointmentsWithExhibitorTest.class,
                      VisitorAppointmentPrivateMeetupTest.class, VisitorCollectionOfPrivateMeetupsWithExhibitorsTest.class, VisitorRequestMoreInformationAboutExhibitorTest.class
                      , VisitorRequestMoreInformationAboutExhibitorTest.class, VisitorCollectionOfRequestMoreInformationFromExhibitorsTest.class
    })

public class AllAppModuleTests {
    @BeforeClass
    public static void setUp() {
    }

    @AfterClass
    public static void tearDown() throws Exception {
        AppModuleAMFixture.getInstance().release();
    }
}
