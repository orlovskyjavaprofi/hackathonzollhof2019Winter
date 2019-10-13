package model.domainModels;


public class VisitorAppointmentWithExhibitor {
    private String exhibitorCompanyName;
    private String exhibitorHallName;
    private String exhibitorTradeShowName;
    
   public VisitorAppointmentWithExhibitor(){
        
    }
    
   public VisitorAppointmentWithExhibitor(String inputCompanyName, String inputHallName, String inputTradeShowName){
        this.setExhibitorCompanyName(inputCompanyName);
        this.setExhibitorHallName(inputHallName);
        this.setExhibitorTradeShowName(inputTradeShowName);
    }
    
    public void setExhibitorCompanyName(String exhibitorCompanyName) {
        this.exhibitorCompanyName = exhibitorCompanyName;
    }

    public String getExhibitorCompanyName() {
        return exhibitorCompanyName;
    }

    public void setExhibitorHallName(String exhibitorHallName) {
        this.exhibitorHallName = exhibitorHallName;
    }

    public String getExhibitorHallName() {
        return exhibitorHallName;
    }
    
    public void setExhibitorTradeShowName(String exhibitorTradeShowName) {
        this.exhibitorTradeShowName = exhibitorTradeShowName;
    }

    public String getExhibitorTradeShowName() {
        return exhibitorTradeShowName;
    }
}
