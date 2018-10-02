package com.example.copsboot.infrastructure.security.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by deep20jain on 02-10-2018.
 */
@Component
@ConfigurationProperties(prefix = "copsboot-security")
public class SecurityConfiguration {
    private String mobileAppClientId;
    private String mobileAppClientSecret;

    public String getMobileAppClientId() {
        return mobileAppClientId;
    }

    public void setMobileAppClientId(String mobileAppClientId) {
        this.mobileAppClientId = mobileAppClientId;
    }

    public String getMobileAppClientSecret() {
        return mobileAppClientSecret;
    }

    public void setMobileAppClientSecret(String mobileAppClientSecret) {
        this.mobileAppClientSecret = mobileAppClientSecret;
    }
}
