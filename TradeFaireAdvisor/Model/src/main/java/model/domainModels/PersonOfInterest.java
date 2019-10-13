package model.domainModels;


public class PersonOfInterest {
    private String personFirstName;
    private String personLastName;
    private String personEmail;
    private String personTelNumber;
    private String personCompanyName;
    private String personRoleAtCompany;
    
    public PersonOfInterest(){
        
    }
    
    public PersonOfInterest(String inputPersonFirstName, String inputPersonLastName, String inputPersonEmail, String inputPersonTelNumber, 
                     String inputPersonCompanyName, String inputPersonRoleAtCompany){

        populatePersonWithInputData(inputPersonFirstName, inputPersonLastName, inputPersonEmail, inputPersonTelNumber,
                                    inputPersonCompanyName, inputPersonRoleAtCompany);

    }
    
    public void setPersonFirstName(String personFirstName) {
        this.personFirstName = personFirstName;
    }

    public String getPersonFirstName() {
        return personFirstName;
    }

    public void setPersonLastName(String personLastName) {
        this.personLastName = personLastName;
    }

    public String getPersonLastName() {
        return personLastName;
    }


    public void setPersonEmail(String personEmail) {
        this.personEmail = personEmail;
    }

    public String getPersonEmail() {
        return personEmail;
    }

    public void setPersonTelNumber(String personTelNumber) {
        this.personTelNumber = personTelNumber;
    }

    public String getPersonTelNumber() {
        return personTelNumber;
    }

    public void setPersonCompanyName(String personCompanyName) {
        this.personCompanyName = personCompanyName;
    }

    public String getPersonCompanyName() {
        return personCompanyName;
    }
    
    public void setPersonRoleAtCompany(String personRoleAtCompany) {
        this.personRoleAtCompany = personRoleAtCompany;
    }

    public String getPersonRoleAtCompany() {
        return personRoleAtCompany;
    }

    private void populatePersonWithInputData(String inputPersonFirstName, String inputPersonLastName,
                                             String inputPersonEmail, String inputPersonTelNumber,
                                             String inputPersonCompanyName, String inputPersonRoleAtCompany) {
        this.setPersonFirstName(inputPersonFirstName);
        this.setPersonLastName(inputPersonLastName);
        this.setPersonEmail(inputPersonEmail);
        this.setPersonTelNumber(inputPersonTelNumber);
        this.setPersonCompanyName(inputPersonCompanyName);
        this.setPersonRoleAtCompany(inputPersonRoleAtCompany);
    }
    
    public String toString() {
        return this.getPersonFirstName()+" "+this.getPersonLastName()+"\n"+this.getPersonEmail()+"\n"+this.getPersonTelNumber()+"\n"+this.getPersonRoleAtCompany()+"\n"+
        this.getPersonCompanyName();
    }
}
