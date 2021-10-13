/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jose.dida.playasGaliAstur;

import javafx.fxml.FXML;
import java.io.IOException;
import javafx.scene.image.ImageView;

/**
 *
 * @author jose
 */
public class PrincipalControler {
    
    @FXML private ImageView imageInfo;
    @FXML private ImageView imageAñadir;
    @FXML private ImageView imageEliminar;
   
    
    @FXML
    public void initialize() {
       /* imageInfo.setFitHeight(25.0);
        imageAñadir.setFitHeight(25.0);
        imageEliminar.setFitHeight(25.0);
        imageInfo.setPreserveRatio(true);
        imageAñadir.setPreserveRatio(true);
        imageEliminar.setPreserveRatio(true);*/
    }
    
    @FXML 
    public void añadirOla() throws IOException {
       App.setRoot("FormularioOla");
               
    }
   
    @FXML
    public void verInformacion() throws IOException {
        App.setRoot("ListaOlas");
   }
   
    @FXML
   public void eliminar() throws IOException {
        App.setRoot("ListaOlas");
   }
    
 
}
