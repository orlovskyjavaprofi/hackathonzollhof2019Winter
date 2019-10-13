package model.domainModels;

import java.util.HashSet;
import java.util.Set;

import oracle.jbo.Transaction;
import oracle.jbo.domain.DomainInterface;
import oracle.jbo.domain.DomainOwnerInterface;


public class VisitorCollectionOfPublicExhibitorEvents implements DomainInterface{

    private Set<VisitorAppointmentPublicEvent> setOfVisitorExhibitorsForPublicEvents;

    public VisitorCollectionOfPublicExhibitorEvents(){
        setOfVisitorExhibitorsForPublicEvents = new HashSet<VisitorAppointmentPublicEvent>();
    }

    public Boolean insertVisitorPublicAppointmentToSet(VisitorAppointmentPublicEvent inputPublicExhibitorEvent){
        Boolean result = false;
        
        if(inputPublicExhibitorEvent != null){
            this.getSetOfVisitorExhibitorsForPublicEvents().add(inputPublicExhibitorEvent);
            result = true;
        }
        
        return result;
    }

    public void setSetOfVisitorExhibitorsForPublicEvents(Set<VisitorAppointmentPublicEvent> setOfVisitorExhibitorsForPublicEvents) {
        this.setOfVisitorExhibitorsForPublicEvents = setOfVisitorExhibitorsForPublicEvents;
    }

    public Set<VisitorAppointmentPublicEvent> getSetOfVisitorExhibitorsForPublicEvents() {
        return setOfVisitorExhibitorsForPublicEvents;
    }

    @Override
    public Object getData() {
        // TODO Implement this method
        return setOfVisitorExhibitorsForPublicEvents;
    }

    /**<b>Internal:</b> <em>Applications should not use this method.</em>
     */
    @Override
    public void setContext(DomainOwnerInterface domainOwnerInterface, Transaction transaction, Object object) {
        // TODO Implement this method

    }
}
