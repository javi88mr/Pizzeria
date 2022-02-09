/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Principal;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author Javier
 */
public class PedidosController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML private Button btnAñadir;
    @FXML private TextField textFieldNombre;
    @FXML private TextField textFieldDireccion;
    @FXML private TextField textFieldTelefono;
    @FXML private RadioButton radioMargarita;
    @FXML private RadioButton radioDiavola;
    @FXML private RadioButton radioEstaciones;
    @FXML private RadioButton radioPlacer;
    @FXML private AnchorPane root;
    @FXML private CheckBox ChTomate;
    @FXML private CheckBox ChPicante;
    @FXML private CheckBox ChBarbacoa;
    @FXML private CheckBox ChCarbonara;
    @FXML private CheckBox ChMozzarella;
    @FXML private CheckBox ChJamon;
    @FXML private CheckBox ChSetas;
    @FXML private CheckBox ChAlcachofas;
    @FXML private CheckBox ChAtun;
    @FXML private CheckBox ChBacon;
    @FXML private CheckBox ChPeperoni;
    @FXML private CheckBox ChPimiento;
    @FXML private CheckBox ChChampinon;
    @FXML private CheckBox ChAnchoa;
    @FXML private CheckBox ChCebolla;
    @FXML private CheckBox Chpina;
    @FXML private CheckBox ChCarne;
    @FXML private CheckBox ChPollo;
    @FXML private CheckBox ChExtra;
    @FXML private CheckBox ChAceitunas;    
    @FXML private Label labelPrecio;
    @FXML private Label labelHora;
    @FXML private Label labelPrecioTotal;
    @FXML private ToggleGroup GroupButton;
    
    
    //ToggleGroup GroupButton = new ToggleGroup();
    //radioMargarita.setToggleGroup(GroupButton);
    //radioDiavola.setToggleGroup(GroupButton);
    //radioEstaciones.setToggleGroup(GroupButton);
    //radioPlacer.setToggleGroup(GroupButton);
    
    
    double precio,precioTotal;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        
    }    
    
    
    
    public PedidosController () throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Pedidos.fxml"));
        
        loader.setController(this);
        loader.load();
    }

    public void onActionPlacer() throws IOException {
        labelPrecio.setText(labelPrecio.getText() + "7");
        
        ChTomate.setSelected (false);
        ChPicante.setSelected (false);
        ChBarbacoa.setSelected (false);
        ChCarbonara.setSelected (false);
        ChMozzarella.setSelected (false);
        ChJamon.setSelected (false);
        ChSetas.setSelected (false);
        ChAlcachofas.setSelected (false);
        ChAtun.setSelected (false);
        ChBacon.setSelected (false);
        ChPeperoni.setSelected (true);
        ChPimiento.setSelected (false);
        ChChampinon.setSelected (false);
        ChAnchoa.setSelected (false);
        ChCebolla.setSelected (false);
        Chpina.setSelected (false);
        ChCarne.setSelected (false);
        ChPollo.setSelected (false);
        ChExtra.setSelected (false);
        ChAceitunas.setSelected (false);
    }
    
    public void onActionMargarita() throws IOException{
        labelPrecio.setText(labelPrecio.getText() + "8");
        
        ChTomate.setSelected (true);
        ChPicante.setSelected (false);
        ChBarbacoa.setSelected (false);
        ChCarbonara.setSelected (false);
        ChMozzarella.setSelected (true);
        ChJamon.setSelected (false);
        ChSetas.setSelected (false);
        ChAlcachofas.setSelected (false);
        ChAtun.setSelected (false);
        ChBacon.setSelected (false);
        ChPeperoni.setSelected (false);
        ChPimiento.setSelected (false);
        ChChampinon.setSelected (false);
        ChAnchoa.setSelected (false);
        ChCebolla.setSelected (false);
        Chpina.setSelected (false);
        ChCarne.setSelected (false);
        ChPollo.setSelected (false);
        ChExtra.setSelected (false);
        ChAceitunas.setSelected (false);
    }
    
    public void onActionQuatro() throws IOException{
        labelPrecio.setText(labelPrecio.getText() + "10");
        
        ChTomate.setSelected (true);
        ChPicante.setSelected (false);
        ChBarbacoa.setSelected (false);
        ChCarbonara.setSelected (false);
        ChMozzarella.setSelected (true);
        ChJamon.setSelected (true);
        ChSetas.setSelected (true);
        ChAlcachofas.setSelected (true);
        ChAtun.setSelected (false);
        ChBacon.setSelected (false);
        ChPeperoni.setSelected (false);
        ChPimiento.setSelected (false);
        ChChampinon.setSelected (false);
        ChAnchoa.setSelected (false);
        ChCebolla.setSelected (false);
        Chpina.setSelected (false);
        ChCarne.setSelected (false);
        ChPollo.setSelected (false);
        ChExtra.setSelected (false);
        ChAceitunas.setSelected (true);
    }
    
    public void onActionDiavola() throws IOException{
        labelPrecio.setText(labelPrecio.getText() + "9");
        
        ChTomate.setSelected (false);
        ChPicante.setSelected (true);
        ChBarbacoa.setSelected (false);
        ChCarbonara.setSelected (false);
        ChMozzarella.setSelected (true);
        ChJamon.setSelected (false);
        ChSetas.setSelected (false);
        ChAlcachofas.setSelected (false);
        ChAtun.setSelected (false);
        ChBacon.setSelected (false);
        ChPeperoni.setSelected (true);
        ChPimiento.setSelected (false);
        ChChampinon.setSelected (false);
        ChAnchoa.setSelected (false);
        ChCebolla.setSelected (false);
        Chpina.setSelected (false);
        ChCarne.setSelected (false);
        ChPollo.setSelected (false);
        ChExtra.setSelected (false);
        ChAceitunas.setSelected (false);
    }
    
    public void actionAnadirExtra() throws IOException{        
        precio=Double.parseDouble(labelPrecio.getText());
        precio+=0.70;
        labelPrecio.setText(String.valueOf(precio));
    }
    
    public void handlebtnAnadir() throws IOException{
        precio=Double.parseDouble(labelPrecio.getText());
        precioTotal=Double.parseDouble(labelPrecioTotal.getText());
        
        precioTotal+=precio;
        labelPrecioTotal.setText(String.valueOf(precioTotal));
        
        //El label del precio se limpia
        labelPrecio.setText("");
        
        //se desmarca todos los checkBox
        ChTomate.setSelected (false);
        ChPicante.setSelected (false);
        ChBarbacoa.setSelected (false);
        ChCarbonara.setSelected (false);
        ChMozzarella.setSelected (false);
        ChJamon.setSelected (false);
        ChSetas.setSelected (false);
        ChAlcachofas.setSelected (false);
        ChAtun.setSelected (false);
        ChBacon.setSelected (false);
        ChPeperoni.setSelected (true);
        ChPimiento.setSelected (false);
        ChChampinon.setSelected (false);
        ChAnchoa.setSelected (false);
        ChCebolla.setSelected (false);
        Chpina.setSelected (false);
        ChCarne.setSelected (false);
        ChPollo.setSelected (false);
        ChExtra.setSelected (false);
        ChAceitunas.setSelected (false);
        
        
    }
    
}
