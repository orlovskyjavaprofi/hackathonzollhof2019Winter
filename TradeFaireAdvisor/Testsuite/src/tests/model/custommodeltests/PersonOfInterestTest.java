package tests.model.custommodeltests;

import model.domainModels.PersonOfInterest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;

public class PersonOfInterestTest {

private PersonOfInterest personObj;

    @Before
    public void setUp() throws Exception {
        personObj = new PersonOfInterest();
    }
    
    @Test
    public void checkIfPersonCanBeInstatiated(){
        assertNotNull(personObj);
    }
    
    @Test
    public void checkIfPersonFirstNameCanBeInsered(){
        String expectedFirstName= "John";
        personObj.setPersonFirstName(expectedFirstName);
        assertEquals("Seting of person first name wasnt successeful!", expectedFirstName, personObj.getPersonFirstName() );
    }
    
    @Test
    public void checkIfPersonLastNameCanBeInserted(){
        String expectedLastName= "Smith";
        personObj.setPersonLastName(expectedLastName);
        assertEquals("Seting of person last name wasnt successeful!", expectedLastName, personObj.getPersonLastName() );
    }
    
    @Test
    public void checkIfAEmailPersonCanBeInserted(){
        String expectedPersonEmail= "muster@muster.com";
        personObj.setPersonEmail(expectedPersonEmail);
        assertEquals("Seting of person email wasnt successeful!", expectedPersonEmail, personObj.getPersonEmail() );
    }
    
    @Test
    public void checkIfTelephoneNumberCanBeInserted(){
        String expectedTelNumber = "9495602234";
        personObj.setPersonTelNumber(expectedTelNumber);
        assertEquals("Seting of person tel number wasnt successeful!", expectedTelNumber, personObj.getPersonTelNumber() );
    }
    
    @Test
    public void checkIfPersonCompanyNameCanBeSet(){
        String expectedCompanyName ="Muster Inc";
        personObj.setPersonCompanyName(expectedCompanyName);
        assertEquals("Seting of person company name wasnt successeful!", expectedCompanyName, personObj.getPersonCompanyName() );
    }
    
    @Test
    public void checkIfPersonRoleAtCompanyCanBeSet(){
        String expectedCompanyRole = "Manager of Sells";
        personObj.setPersonRoleAtCompany(expectedCompanyRole);
        assertEquals("Seting of person role at company wasnt successeful!", expectedCompanyRole, personObj.getPersonRoleAtCompany() );
    }
    
    @Test
    public void checkIfAPersonCanBePopulatedWithData(){
        String personFirstName= "John";
        String personLastName= "Smith";
        String personPersonEmail= "muster@muster.com";
        String personTelNumber = "9495602234";
        String personCompanyName ="Muster Inc";
        String personCompanyRole = "Manager of Sells";
        personObj = new PersonOfInterest(personFirstName,personLastName,personPersonEmail, personTelNumber, personCompanyName, personCompanyRole );
         assertNotNull(personObj);
        System.out.println(personObj.toString());
    }
}
