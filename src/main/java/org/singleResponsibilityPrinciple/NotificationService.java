package org.singleResponsibilityPrinciple;

public class NotificationService {

    public void sendOTP(String source){

        if(source.equalsIgnoreCase("email")){
            //use JavaMailSender
        }
        if(source.equalsIgnoreCase("mobile")){
            //use twilio api
        }
    }
}
