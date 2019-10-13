package model.domainModels;

import java.util.HashSet;
import java.util.Set;

import oracle.jbo.Transaction;
import oracle.jbo.domain.DomainInterface;
import oracle.jbo.domain.DomainOwnerInterface;


public class VisitorCollectionOfPrivateMeetupsWithExhibitors implements DomainInterface {
    private Set<VisitorAppointmentPrivateMeetup> setOfVisitorExhibitorsForPrivateMeetups;

    public VisitorCollectionOfPrivateMeetupsWithExhibitors() {
        setOfVisitorExhibitorsForPrivateMeetups = new HashSet<VisitorAppointmentPrivateMeetup>();
    }

    public Boolean insertVisitorPrivateAppointmentToSet(VisitorAppointmentPrivateMeetup inputPrivateAppointmentWithExhibitor) {
        Boolean result = false;

        if (inputPrivateAppointmentWithExhibitor != null) {
            this.getSetOfVisitorExhibitorsForPrivateMeetups().add(inputPrivateAppointmentWithExhibitor);
            result = true;
        }

        return result;
    }

    public void setSetOfVisitorExhibitorsForPrivateMeetups(Set<VisitorAppointmentPrivateMeetup> setOfVisitorExhibitorsForPrivateMeetups) {
        this.setOfVisitorExhibitorsForPrivateMeetups = setOfVisitorExhibitorsForPrivateMeetups;
    }

    public Set<VisitorAppointmentPrivateMeetup> getSetOfVisitorExhibitorsForPrivateMeetups() {
        return setOfVisitorExhibitorsForPrivateMeetups;
    }

    @Override
    public Object getData() {
        // TODO Implement this method
        return setOfVisitorExhibitorsForPrivateMeetups;
    }

    /**<b>Internal:</b> <em>Applications should not use this method.</em>
     */
    @Override
    public void setContext(DomainOwnerInterface domainOwnerInterface, Transaction transaction, Object object) {
        // TODO Implement this method

    }
}
