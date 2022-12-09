package controller;

import java.awt.event.ActionEvent;    
import java.awt.event.ActionListener;

import model.Problema;


public class ProblemaController implements ActionListener {
	
	 private Problema problema;
	    
	    public ProblemaController (Problema problema){
	        this.problema = problema;
	    }

	    public void actionPerformed(ActionEvent event) {
	        problema.enviar(event.getActionCommand());
	    }
	}

   

