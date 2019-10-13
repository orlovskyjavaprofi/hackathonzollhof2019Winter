package tests.model.custommodeltests;

import model.domainModels.VisitorCollectionOfNotesForExhibitors;
import model.domainModels.VisitorNoteForExhibitor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;

public class VisitorCollectionOfNotesForExhibitorsTest {
    private VisitorCollectionOfNotesForExhibitors collectionOfNotesForVisitorExhibitors;

    @Before
    public void setUp() throws Exception {
        collectionOfNotesForVisitorExhibitors = new VisitorCollectionOfNotesForExhibitors();
    }
    
    @Test
    public void checkIfCollectionOfNotesCanBeCreated(){
        assertNotNull("Collection of visitor notes for exhibitors objects can't be created", collectionOfNotesForVisitorExhibitors);
    }
    
    @Test
    public void checkIfVisitorNoteCanBeInserted(){
        Boolean expectedResult = true;
        VisitorNoteForExhibitor visitorNoteObj1 = new VisitorNoteForExhibitor("cool company", "Company inc1");
        assertEquals("Inserting of visitor note wasnt successeful!", expectedResult, collectionOfNotesForVisitorExhibitors.insertVisitorNote(visitorNoteObj1) );
    }
    
    @Test
    public void checkIfVisitorNotesCanBeInserted(){
        createASetOfVisitorNotes();

        assertNotNull("Collection of visitor notes for exhibitors objects is null", collectionOfNotesForVisitorExhibitors.getSetOfVisitorNotesAboutExhibitors());
    }


    private void createASetOfVisitorNotes() {
        VisitorNoteForExhibitor visitorNoteObj1 = new VisitorNoteForExhibitor("cool company", "Company inc1");
        VisitorNoteForExhibitor visitorNoteObj2 = new VisitorNoteForExhibitor("cool company", "Company inc2");
        VisitorNoteForExhibitor visitorNoteObj3 = new VisitorNoteForExhibitor("cool company", "Company inc3");
        VisitorNoteForExhibitor visitorNoteObj4 = new VisitorNoteForExhibitor("cool company", "Company inc4");
        VisitorNoteForExhibitor visitorNoteObj5 = new VisitorNoteForExhibitor("cool company", "Company inc5");
        collectionOfNotesForVisitorExhibitors.insertVisitorNote(visitorNoteObj1);
        collectionOfNotesForVisitorExhibitors.insertVisitorNote(visitorNoteObj2);
        collectionOfNotesForVisitorExhibitors.insertVisitorNote(visitorNoteObj3);
        collectionOfNotesForVisitorExhibitors.insertVisitorNote(visitorNoteObj4);
        collectionOfNotesForVisitorExhibitors.insertVisitorNote(visitorNoteObj5);
    }
}
