package model.domainModels;

import java.util.HashSet;
import java.util.Set;

import oracle.jbo.Transaction;
import oracle.jbo.domain.DomainInterface;
import oracle.jbo.domain.DomainOwnerInterface;


public class VisitorCollectionOfRequestMoreInformationFromExhibitors implements DomainInterface {
    private Set<VisitorRequestMoreInformationAboutExhibitor> setOfVisitorRequest;

    public VisitorCollectionOfRequestMoreInformationFromExhibitors() {
        setOfVisitorRequest = new HashSet<VisitorRequestMoreInformationAboutExhibitor>();
    }

    public Boolean insertVisitorRequestToSet(VisitorRequestMoreInformationAboutExhibitor inputVisitorRequest) {
        Boolean result = false;
        if (inputVisitorRequest != null) {
            setOfVisitorRequest.add(inputVisitorRequest);
            result = true;
        }

        return result;
    }

    public void setSetOfVisitorRequest(Set<VisitorRequestMoreInformationAboutExhibitor> setOfVisitorRequest) {
        this.setOfVisitorRequest = setOfVisitorRequest;
    }

    public Set<VisitorRequestMoreInformationAboutExhibitor> getSetOfVisitorRequest() {
        return setOfVisitorRequest;
    }

    @Override
    public Object getData() {
        
        return setOfVisitorRequest;
    }
    
    /**<b>Internal:</b> <em>Applications should not use this method.</em>
     */
    @Override
    public void setContext(DomainOwnerInterface domainOwnerInterface, Transaction transaction, Object object) {
        // TODO Implement this method

    }
}
