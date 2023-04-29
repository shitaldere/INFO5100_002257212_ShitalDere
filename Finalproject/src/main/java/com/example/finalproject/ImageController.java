package com.example.finalproject;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.Consumer;


public class ImageController implements Initializable {


    @FXML
    private TilePane fullImageTilePane;

    @FXML
    private Label label;

    @FXML
    private ComboBox comboBox;


    @FXML
    private Button save;
    private String selectedFormat;

    private File ourSelectedFile;
    private String filepath;

    @FXML
    private Button rotate;

    @FXML
    public Slider slider;

    private int degree=0;

    public ImageView imageRotate;


    // select image format from combo box for conversion
    public void comboBoxselect(ActionEvent event) throws IOException {

        selectedFormat =comboBox.getSelectionModel().getSelectedItem().toString();
        System.out.println(selectedFormat);
    }

    @Override// set the options for image format conversion
    public void initialize(URL url, ResourceBundle resourceBundle) {

        comboBox.setPromptText("Choose Format");
        comboBox.getItems().add("jpeg");
        comboBox.getItems().add("png");
        comboBox.getItems().add("jpg");
        comboBox.getItems().add("bmp");


        //get the black and white color using coloradjust instance and slider
        ColorAdjust colorAdjust = new ColorAdjust();
        slider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {

            double saturationValue = slider.getValue();
            Consumer<Double> hueConsumer = (value) ->
            colorAdjust.saturationProperty().set(value);
            colorAdjust.setSaturation(saturationValue);
            imageRotate.setEffect(colorAdjust);

            }
        });
    }
    public void saveButton(ActionEvent event) throws IOException {

        // upload selected image on window and get the path
        BufferedImage bufferedImage = ImageIO.read(ourSelectedFile);
        String directoryOfFile = ourSelectedFile.getParentFile().getAbsolutePath();

        // convert the image into  another image format
        ImageIO.write(bufferedImage, selectedFormat, new File(directoryOfFile + "\\"
                +ourSelectedFile.getName() + "-Converted."+ selectedFormat));


    }


    // Image can be converted using following rotate method
    public void rotateClockwise(ActionEvent e) {

        if (e.getSource() == rotate){
            degree = degree+90;
            imageRotate.setRotate(degree);
        }
    }

    public TilePane getFullImageTilePane() {
        return fullImageTilePane;
    }

    public Label getLabel() {
        return label;
    }
    
    public void setOurSelectedFile(File ourSelectedFile) {
        this.ourSelectedFile = ourSelectedFile;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

}