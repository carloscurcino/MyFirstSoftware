package model;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;


public interface BusinesRule<Problema> extends EventListener {
	
	public void novaAcao(Problema event);	
    
}
