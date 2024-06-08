package org.openClosedPrinciple;

public interface NotificationService {

    public void sendOTP(String source);
    public void sendTransactionReport(String source);
}
