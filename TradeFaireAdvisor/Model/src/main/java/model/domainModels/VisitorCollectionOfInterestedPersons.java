package model.domainModels;

import java.util.HashSet;
import java.util.Set;

import oracle.jbo.Transaction;
import oracle.jbo.domain.DomainInterface;
import oracle.jbo.domain.DomainOwnerInterface;

public class VisitorCollectionOfInterestedPersons implements DomainInterface  {
    private Set<PersonOfInterest> setOfInterestingPersons;
    
    public VisitorCollectionOfInterestedPersons(){
        setOfInterestingPersons = new HashSet<PersonOfInterest>();
    }

    public Boolean insertPersonToSetOfInterestingPersons(PersonOfInterest inputPerson){
        Boolean result = false;
        
        if(inputPerson != null){
            this.getSetOfInterestingPersons().add(inputPerson);
            result= true;
        }
     
      return result;   
    }

    public void setSetOfInterestingPersons(Set<PersonOfInterest> setOfInterestingPersons) {
        this.setOfInterestingPersons = setOfInterestingPersons;
    }

    public Set<PersonOfInterest> getSetOfInterestingPersons() {
        return setOfInterestingPersons;
    }

    @Override
    public Object getData() {
        // TODO Implement this method
        return setOfInterestingPersons;
    }
    
    /**<b>Internal:</b> <em>Applications should not use this method.</em>
     */
    @Override
    public void setContext(DomainOwnerInterface domainOwnerInterface, Transaction transaction, Object object) {
        // TODO Implement this method

    }
}
