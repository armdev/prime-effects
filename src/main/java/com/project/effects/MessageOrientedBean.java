package com.project.effects;

import java.util.Random;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author armdev
 */
@ManagedBean
@AllArgsConstructor
@NoArgsConstructor
public class MessageOrientedBean {

    private final String[] effects = {"blind", "clip", "drop", "explode", "fold", "puff", "slide", "scale", "bounce", "pulsate", "shake", "size"};
    private final int idx = new Random().nextInt(effects.length);    
    @Setter
    @Getter
    private String secretMessage;   

    @Setter
    @Getter
    private String effectName = (effects[idx]);

    public void sendMessage() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Received message:'" + secretMessage + "'"));
    }


}
