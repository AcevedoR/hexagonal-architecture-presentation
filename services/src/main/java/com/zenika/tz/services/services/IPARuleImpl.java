package com.zenika.tz.services.services;

import org.springframework.stereotype.Component;

@Component
public class IPARuleImpl implements IPARule {

    @Override
    public String determineIPA(final Double alcool, final Integer ibu) {
        if (alcool >= 10 && (ibu >= 100)) {
            return "Triple IPA";
        }
        if (alcool < 7 && ibu <= 80) {
            return "IPA";
        }
        return "Double IPA";
    }
}
