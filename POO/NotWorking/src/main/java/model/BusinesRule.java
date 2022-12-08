package model;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

import model.Problema;


public interface BusinesRule extends EventListener {
	
	public void novaAcao(Problema event);	
    
}
