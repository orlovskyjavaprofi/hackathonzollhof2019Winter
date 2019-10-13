package model.domainModels;

import java.util.HashSet;
import java.util.Set;

import oracle.jbo.Transaction;
import oracle.jbo.domain.DomainInterface;
import oracle.jbo.domain.DomainOwnerInterface;

public class VisitorCollectionOfNotesForExhibitors implements DomainInterface {

    private Set<VisitorNoteForExhibitor> setOfVisitorNotesAboutExhibitors;

    public VisitorCollectionOfNotesForExhibitors() {
        setOfVisitorNotesAboutExhibitors = new HashSet<VisitorNoteForExhibitor>();
    }

    public Boolean insertVisitorNote(VisitorNoteForExhibitor inputVisitorNote) {
        Boolean result = false;

        if (inputVisitorNote != null) {
            this.getSetOfVisitorNotesAboutExhibitors().add(inputVisitorNote);
            result = true;
        }

        return result;
    }

    public void setSetOfVisitorNotesAboutExhibitors(Set<VisitorNoteForExhibitor> setOfVisitorNotesAboutExhibitors) {
        this.setOfVisitorNotesAboutExhibitors = setOfVisitorNotesAboutExhibitors;
    }

    public Set<VisitorNoteForExhibitor> getSetOfVisitorNotesAboutExhibitors() {
        return setOfVisitorNotesAboutExhibitors;
    }

    @Override //Oracle specific stuff
    public Object getData() {
        
        return setOfVisitorNotesAboutExhibitors;
    }
    
    /**<b>Internal:</b> <em>Applications should not use this method.</em>
     */
    @Override //Oracle specific stuff
    public void setContext(DomainOwnerInterface domainOwnerInterface, Transaction transaction, Object object) {
        // TODO Implement this method

    }
}
