package model.domainModels;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import java.util.Locale;

public class VisitorAppointmentPublicEvent {
    
    private String visitorName;
    private LocalTime visitorTimeForPublicEvent;
    private String exhibitorCompanyName;
    private String exhibitorHallName;
    private String exhibitorTradeShowName;
    
    public VisitorAppointmentPublicEvent(){
        
    }
    
    public VisitorAppointmentPublicEvent(String inputVisitorName, String inputTimeOfVisit, String inputCompanyName, 
                                         String inputHallName, String inputTradeShowName){
        this.setVisitorName(inputVisitorName);
        this.setVisitorAppointmentTime(inputTimeOfVisit);
        this.setExhibitorCompanyName(inputCompanyName);
        this.setExhibitorHallName(inputHallName);
        this.setExhibitorTradeShowName(inputTradeShowName);
    }
    
    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }

    public String getVisitorName() {
        return visitorName;
    }

    public String setVisitorAppointmentTime(String inputTimeForAppointment){
        String resultTime;
        DateTimeFormatter germanFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).withLocale(Locale.GERMAN);
        this.setVisitorTimeForPublicEvent(LocalTime.parse(inputTimeForAppointment,germanFormatter));
        resultTime = this.getVisitorTimeForPublicEvent().format(germanFormatter).toString();

        return resultTime;
    }


    public void setVisitorTimeForPublicEvent(LocalTime visitorTimeForPublicEvent) {
        this.visitorTimeForPublicEvent = visitorTimeForPublicEvent;
    }

    public LocalTime getVisitorTimeForPublicEvent() {
        return visitorTimeForPublicEvent;
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
