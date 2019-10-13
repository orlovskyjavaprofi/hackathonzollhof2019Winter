package model.domainModels;

import java.util.HashSet;
import java.util.Set;

import oracle.jbo.Transaction;
import oracle.jbo.domain.DomainInterface;
import oracle.jbo.domain.DomainOwnerInterface;


public class VisitorCollectionOfAppointmentsWithExhibitor implements DomainInterface {
    private Set<VisitorAppointmentWithExhibitor> setOfVisitorAppointments;
    
    public VisitorCollectionOfAppointmentsWithExhibitor(){
        setOfVisitorAppointments = new HashSet<VisitorAppointmentWithExhibitor>();
    }
    

    public Boolean insertVisitorAppointmentToSet(VisitorAppointmentWithExhibitor visitorAppointment){
      Boolean result = false;
      if( visitorAppointment != null){
          setOfVisitorAppointments.add(visitorAppointment);
          result = true;  
      }
      
      return result;
    }

    public void setSetOfVisitorAppointments(Set<VisitorAppointmentWithExhibitor> setOfVisitorAppointments) {
        this.setOfVisitorAppointments = setOfVisitorAppointments;
    }

    public Set<VisitorAppointmentWithExhibitor> getSetOfVisitorAppointments() {
        return setOfVisitorAppointments;
    }

    @Override
    public Object getData() {     
        return setOfVisitorAppointments;
    }

    /**<b>Internal:</b> <em>Applications should not use this method.</em>
     */
    @Override
    public void setContext(DomainOwnerInterface domainOwnerInterface, Transaction transaction, Object object) {
        // TODO Implement this method

    }
}
