package com.project.effects;

import java.util.Random;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author armdev
 */
@ManagedBean
public class MessageOrientedBean {

    private final String[] effects = {"blind", "clip", "drop", "explode", "fold", "puff", "slide", "scale", "bounce", "pulsate", "shake", "size"};

    private String secretMessage;

    private final int idx = new Random().nextInt(effects.length);
    private String effectName = (effects[idx]);

    public void sendMessage() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Received message:'" + secretMessage + "'"));
    }

    public String getEffectName() {
        return effectName;
    }

    public void setEffectName(String effectName) {
        this.effectName = effectName;
    }
    

    public void setSecretMessage(String secretMessage) {
        this.secretMessage = secretMessage;
    }

    public String getSecretMessage() {
        return secretMessage;
    }

}
