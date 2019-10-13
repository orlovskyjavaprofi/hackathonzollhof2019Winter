package model.domainModels;


public class VisitorNoteForExhibitor {
    private String visitorNote;
    private String exhibitorName;

    public VisitorNoteForExhibitor(String inputVisitorNote, String inputExhibitorName ){
        this.setVisitorNote(inputVisitorNote); 
        this.setExhibitorName(inputExhibitorName);
    }
    public VisitorNoteForExhibitor(){
        
    }
    
    public void setVisitorNote(String visitorNote) {
        this.visitorNote = visitorNote;
    }

    public String getVisitorNote() {
        return visitorNote;
    }

    public void setExhibitorName(String exhibitorName) {
        this.exhibitorName = exhibitorName;
    }

    public String getExhibitorName() {
        return exhibitorName;
    }
}
