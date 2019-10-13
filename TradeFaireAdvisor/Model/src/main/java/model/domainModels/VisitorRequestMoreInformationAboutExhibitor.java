package model.domainModels;


public class VisitorRequestMoreInformationAboutExhibitor {
  private String exhibitorName;
  private String visitorRequestMessage;
  private String visitorEmail;
  
  public VisitorRequestMoreInformationAboutExhibitor(String inputExhibitorName,String inputVisitorRequestMessage , String inputVisitorEmail){
      this.setExhibitorName(inputExhibitorName);
      this.setVisitorRequestMessage(inputVisitorRequestMessage);
      this.setVisitorEmail(inputVisitorEmail);
  }
  
  public VisitorRequestMoreInformationAboutExhibitor(){
      
  }
  
    public void setExhibitorName(String exhibitorName) {
        this.exhibitorName = exhibitorName;
    }

    public String getExhibitorName() {
        return exhibitorName;
    }

    public void setVisitorRequestMessage(String visitorRequestMessage) {
        this.visitorRequestMessage = visitorRequestMessage;
    }

    public String getVisitorRequestMessage() {
        return visitorRequestMessage;
    }

    public void setVisitorEmail(String visitorEmail) {
        this.visitorEmail = visitorEmail;
    }

    public String getVisitorEmail() {
        return visitorEmail;
    }
}
