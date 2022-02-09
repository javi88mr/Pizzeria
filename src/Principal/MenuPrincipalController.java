/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Principal;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Javier
 */
public class MenuPrincipalController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML private MenuItem menuRealPedido;
    @FXML private MenuItem menuSalir;
    @FXML private Button btnSalir;
    @FXML private Button btnPedido;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
            
    public void handlerbtnPedido(ActionEvent event) throws IOException{ //mostrar reservas habitacion
        Stage stage =(Stage) btnPedido.getScene().getWindow(); 
        Parent root = FXMLLoader.load(getClass().getResource("MenuPrincipal.fxml"));
        if(event.getSource()==btnPedido){        
            stage=(Stage) btnPedido.getScene().getWindow();       
            root = FXMLLoader.load(getClass().getResource("Pedidos.fxml"));
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }  
}
