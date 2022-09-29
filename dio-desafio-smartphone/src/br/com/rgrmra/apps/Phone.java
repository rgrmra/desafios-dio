package br.com.rgrmra.apps;

import org.w3c.dom.ls.LSOutput;

public class Phone {
    protected void doCall(String number) {
        System.out.println("Calling to number: " + number);
    }

    protected void acceptCall() {
        System.out.println("Call accepted");
    }

    protected void rejectCall() {
        System.out.println("Call rejected");
    }

    protected void callVoiceMail() {
        System.out.println("Calling voicemail...");
    }
}
