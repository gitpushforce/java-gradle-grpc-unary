package com.study.server;

import com.study.models.Credentials;
import com.study.models.EmailCredentials;
import com.study.models.PhoneOTP;

public class OneOfDemo {

    public static void main(String[] args) {
        EmailCredentials emailCredentials = EmailCredentials.newBuilder()
                                            .setEmail("abc@abc.com")
                                            .setPassword("admin123")
                                            .build();

        PhoneOTP phoneOTP = PhoneOTP.newBuilder()
                            .setNumber(1231231234)
                            .setCode(456)
                            .build();

        // set only 1: emailmode or phonemode
        Credentials credentials = Credentials.newBuilder()
                                  .setEmailMode(emailCredentials)
                                  //.setPhoneMode(phoneOTP)
                                  .build();

        login(credentials);
    }

    private static void login (Credentials credentials) {

        switch (credentials.getModeCase()) {
            case EMAILMODE:
                System.out.println(credentials.getEmailMode());
                break;
            case PHONEMODE:
                System.out.println(credentials.getPhoneMode());
                break;
        }
    }
}
