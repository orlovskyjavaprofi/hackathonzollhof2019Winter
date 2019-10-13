package tests.model.custommodeltests;

import model.domainModels.PersonOfInterest;
import model.domainModels.VisitorCollectionOfInterestedPersons;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;

public class VisitorCollectionOfInterestedPersonsTest {

    private VisitorCollectionOfInterestedPersons setOfInterestedPersons;

    @Before
    public void setUp() throws Exception {
        setOfInterestedPersons = new VisitorCollectionOfInterestedPersons();
    }

    @Test
    public void checkIfSetOfInterestedPersonsCanBeInit() {
        assertNotNull(setOfInterestedPersons);
    }

    @Test
    public void checkIfAPersonCanBeInsertedToASet() {
        PersonOfInterest personObj1;
        Boolean expectedResult = true;
        String personFirstName = "John";
        String personLastName = "Smith";
        String personPersonEmail = "muster@muster.com";
        String personTelNumber = "9495602234";
        String personCompanyName = "Muster Inc";
        String personCompanyRole = "Manager of Sells";
        personObj1 =
            new PersonOfInterest(personFirstName, personLastName, personPersonEmail, personTelNumber, personCompanyName,
                                 personCompanyRole);

        assertEquals("Insert into set of interesting persons failed!", expectedResult,
                     setOfInterestedPersons.insertPersonToSetOfInterestingPersons(personObj1));
    }

    @Test
    public void checkIfInterstingPersonsCanBeAddedToASet() {

        PersonOfInterest personObj1;
        PersonOfInterest personObj2;
        PersonOfInterest personObj3;
        PersonOfInterest personObj4;
        PersonOfInterest personObj5;

        personObj1 = new PersonOfInterest("John", "Smith", "muster@muster.com", "9495602234", "Muster Inc", "Manager of Sells");
        personObj2 = new PersonOfInterest("Bob", "b", "muster@mufster.com", "94905602234", "Muster3 Inc", "Mana of Sells");
        personObj3 = new PersonOfInterest("Hob", "Smfith", "mufster@muster.com", "943395602234", "Mfuster Inc", "Mafnager of Sells");
        personObj4 = new PersonOfInterest("ku", "bgn", "muster@mus2ter.com", "94956000002234", "Muster Inc3", "Managerp of Sells");
        personObj5 = new PersonOfInterest("lol", "sd", "muster223@muster.com", "9495602234", "Muster Inc", "Manager of Sells");
        
        setOfInterestedPersons.insertPersonToSetOfInterestingPersons(personObj1);
        setOfInterestedPersons.insertPersonToSetOfInterestingPersons(personObj2);
        setOfInterestedPersons.insertPersonToSetOfInterestingPersons(personObj3);
        setOfInterestedPersons.insertPersonToSetOfInterestingPersons(personObj4);
        setOfInterestedPersons.insertPersonToSetOfInterestingPersons(personObj5);

        assertNotNull("cant add a Person to a Set", setOfInterestedPersons.getSetOfInterestingPersons());
    }
}
