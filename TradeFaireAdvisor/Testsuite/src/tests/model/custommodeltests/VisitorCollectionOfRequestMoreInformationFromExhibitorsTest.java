package tests.model.custommodeltests;

import model.domainModels.VisitorCollectionOfRequestMoreInformationFromExhibitors;
import model.domainModels.VisitorRequestMoreInformationAboutExhibitor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;

public class VisitorCollectionOfRequestMoreInformationFromExhibitorsTest {
    private VisitorCollectionOfRequestMoreInformationFromExhibitors visitorRequestToExhibitorsObj;

    @Before
    public void setUp() throws Exception {
        visitorRequestToExhibitorsObj = new VisitorCollectionOfRequestMoreInformationFromExhibitors();
    }

    @Test
    public void checkIfSetOfVisitorRequestCollectionInit() {
        assertNotNull(visitorRequestToExhibitorsObj);
    }

    @Test
    public void checkIfVisitorRequestCanBeInsertedToSet() {
        Boolean expectedResult = true;
        VisitorRequestMoreInformationAboutExhibitor visitorRequest;

        visitorRequest =
            new VisitorRequestMoreInformationAboutExhibitor("Inc1", "I would like to now more about your products!",
                                                            "test@test.com");
        assertEquals("Insert into set of collection of Appointments failed!", expectedResult,
                     visitorRequestToExhibitorsObj.insertVisitorRequestToSet(visitorRequest));
    }
    
    @Test
    public void checkIfManyVisitorRequestsCanBeAddedToASet() {

        initSetofVisitorRequests();

        assertNotNull("cant add a Visitorrequest to a Set", visitorRequestToExhibitorsObj.getSetOfVisitorRequest());
    }

    private void initSetofVisitorRequests() {
        VisitorRequestMoreInformationAboutExhibitor visitorRequest1 =
            new VisitorRequestMoreInformationAboutExhibitor("Inc1", "I would like to now more about your products!",
                                                            "test@test.com");
        VisitorRequestMoreInformationAboutExhibitor visitorRequest2 =
            new VisitorRequestMoreInformationAboutExhibitor("Inc2", "I would like to now more about your products!",
                                                            "test@test.com");
        VisitorRequestMoreInformationAboutExhibitor visitorRequest3 =
            new VisitorRequestMoreInformationAboutExhibitor("Inc3", "I would like to now more about your products!",
                                                            "test@test.com");
        VisitorRequestMoreInformationAboutExhibitor visitorRequest4 =
            new VisitorRequestMoreInformationAboutExhibitor("Inc4", "I would like to now more about your products!",
                                                            "test@test.com");
        VisitorRequestMoreInformationAboutExhibitor visitorRequest5 =
            new VisitorRequestMoreInformationAboutExhibitor("Inc5", "I would like to now more about your products!",
                                                            "test@test.com");

        visitorRequestToExhibitorsObj.insertVisitorRequestToSet(visitorRequest1);
        visitorRequestToExhibitorsObj.insertVisitorRequestToSet(visitorRequest2);
        visitorRequestToExhibitorsObj.insertVisitorRequestToSet(visitorRequest3);
        visitorRequestToExhibitorsObj.insertVisitorRequestToSet(visitorRequest4);
        visitorRequestToExhibitorsObj.insertVisitorRequestToSet(visitorRequest5);
    }
}
