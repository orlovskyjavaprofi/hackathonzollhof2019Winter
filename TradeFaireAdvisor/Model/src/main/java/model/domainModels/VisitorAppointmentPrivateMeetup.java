package model.domainModels;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import java.util.Locale;


public class VisitorAppointmentPrivateMeetup {
    private String visitorNameForPrivateEvent;
    private LocalTime visitorTimeForPrivateMeetup;
    private String visitorMessageToAExhibitorBeforeTalkingToExhibitor;
    private String exhibitorCompanyName;
    private String exhibitorHallName;
    private String exhibitorTradeShowName;
    
    public VisitorAppointmentPrivateMeetup(){
        
    }
    
    public VisitorAppointmentPrivateMeetup(String inputvisitorNameForPrivateEvent, String inputVisitorTimeForPrivateMeetup,
                                           String inputvisitorMessageToAExhibitorBeforeTalkingToExhibitor,
                                           String inputeforVisitxhibitorCompanyName, String inputforVisitexhibitorHallName,
                                           String inputforVisitexhibitorTradeShowName){
        
        this.setVisitorNameForPrivateEvent(inputvisitorNameForPrivateEvent);
        this.setVisitorAppointmentTimeForPrivateEvent(inputVisitorTimeForPrivateMeetup);
        this.setVisitorMessageToAExhibitorBeforeTalkingToExhibitor(inputvisitorMessageToAExhibitorBeforeTalkingToExhibitor);
        this.setExhibitorCompanyName(inputeforVisitxhibitorCompanyName);
        this.setExhibitorHallName(inputforVisitexhibitorHallName);
        this.setExhibitorTradeShowName(inputforVisitexhibitorTradeShowName);
        
    }

    public String setVisitorAppointmentTimeForPrivateEvent(String inputTimeForAppointment){
        String resultTime;
        
        DateTimeFormatter germanFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).withLocale(Locale.GERMAN);
        this.setVisitorTimeForPrivateMeetup(LocalTime.parse(inputTimeForAppointment,germanFormatter));
        resultTime = this.getVisitorTimeForPrivateMeetup().format(germanFormatter).toString();
        
        return  resultTime;
    }

    public void setVisitorMessageToAExhibitorBeforeTalkingToExhibitor(String visitorMessageToAExhibitorBeforeTalkingToExhibitor) {
        this.visitorMessageToAExhibitorBeforeTalkingToExhibitor = visitorMessageToAExhibitorBeforeTalkingToExhibitor;
    }

    public String getVisitorMessageToAExhibitorBeforeTalkingToExhibitor() {
        return visitorMessageToAExhibitorBeforeTalkingToExhibitor;
    }

    public void setVisitorNameForPrivateEvent(String visitorNameForPrivateEvent) {
        this.visitorNameForPrivateEvent = visitorNameForPrivateEvent;
    }

    public String getVisitorNameForPrivateEvent() {
        return visitorNameForPrivateEvent;
    }

    public void setVisitorTimeForPrivateMeetup(LocalTime visitorTimeForPrivateMeetup) {
        this.visitorTimeForPrivateMeetup = visitorTimeForPrivateMeetup;
    }

    public LocalTime getVisitorTimeForPrivateMeetup() {
        return visitorTimeForPrivateMeetup;
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
