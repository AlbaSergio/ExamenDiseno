package org.utl.examen.gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import org.utl.examen.core.OperacionesBasicas;

/**
 *
 * @author zende
 */
public class MainWindowController implements Initializable {
    
    OperacionesBasicas ob;
    @FXML
    TextField txtNumero1;
    @FXML
    TextField txtNumero2;
    @FXML
    TextField txtResultado;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ob = new OperacionesBasicas();
        
    }
    
    public void realizarOperacion(int operacion) {
        
        double numero1 = Double.parseDouble(txtNumero1.getText());
        double numero2 = Double.parseDouble(txtNumero2.getText());
        double resultado = 0;
        
        switch (operacion) {
            case 1:                
                resultado = ob.sumar(numero1, numero2);
                break;
            case 2:
                resultado = ob.restar(numero1, numero2);
                break;
            case 3:
                resultado = ob.multiplicar(numero1, numero2);
                break;
            case 4:                
                resultado = ob.dividir(numero1, numero2);
                break;
        }
        
        txtResultado.setText(" " + resultado);
    }
    
    @FXML
    public void HandleActionEventSumar(ActionEvent event)
    {
        realizarOperacion(1);        
    }
    public void HandleActionEventRestar(ActionEvent event)
    {
        realizarOperacion(2);        
    }
    public void HandleActionEventMultiplicar(ActionEvent event)
    {
        realizarOperacion(3);        
    }
    public void HandleActionEventDivir(ActionEvent event)
    {
        realizarOperacion(4);        
    }
}
