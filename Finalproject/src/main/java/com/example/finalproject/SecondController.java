package com.example.finalproject;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.TilePane;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.Consumer;


public class SecondController implements Initializable {


    @FXML
    public TilePane sagar;

    @FXML
    public Label label;

    @FXML
    public ComboBox comboBox;

    @FXML
    public Button save;
    public String selectedFormat;

    public File ourSelectedFile;
    public String filepath;

    @FXML
    public Button rotate;

    @FXML
    public Slider slider;


    public int degree=0;
    public ImageView imgrotate;






    /*public void selectionCombobox(ActionEvent event){

      System.out.println("vvsfd");
      selectedFormat =comboBox.getSelectionModel().getSelectedItem().toString();
      System.out.println(selectedFormat);

    }*/


    public void saveButton(ActionEvent event) throws IOException {

        // Load the JPEG image
        BufferedImage bufferedImage = ImageIO.read(ourSelectedFile);

        String directoryOfFile = ourSelectedFile.getParentFile().getAbsolutePath();

        System.out.println("dsdas :" + directoryOfFile);

        System.out.println("final path:" + directoryOfFile + "\\"+ourSelectedFile.getName() + "-Converted."+ selectedFormat);
        // Save the BMP image to a file
        ImageIO.write(bufferedImage, selectedFormat, new File(directoryOfFile + "\\"+ourSelectedFile.getName()));

        //javaxt.io.Image image = new javaxt.io.Image("/photo.jpg");



    }


      //  FileInputStream inputStream = new FileInputStream(filepath);
       // FileOutputStream outputStream = new FileOutputStream("C:\\Users\\sagar\\Pictures.png");

        // reads input image from file
       // BufferedImage inputImage = ImageIO.read(inputStream);

        // writes to the output image in specified format
        //boolean result = ImageIO.write(inputImage, selectedFormat, outputStream);


      //  File file = new File("C:\\Users\\sagar\\Pictures\\background.jpg");
       // System.out.println(filepath);
       // BufferedImage bufferedImage = ImageIO.read(file);
        //ImageIO.write(bufferedImage,selectedFormat,new File("C:\\Users\\sagar\\Pictures.png"));

      //  ImageIO.write(bufferedImage,selectedFormat,new File(filepath+ ".abs"));




       // File file = new File(filepath);
        //BufferedImage bufferedImage =ImageIO.read(file);

       // ImageIO.write(bufferedImage,)


      //  System.out.println("spath: " + ourSelectedFile);
       // System.out.println("sagar monkey");
       // System.out.println("formated to be converted to " + selectedFormat);

       // Scene sc = ((Node) event.getSource()).getScene();
       // ImageView imageViewTimepass = new ImageView();
        //imageViewTimepass.setImage(new Image("C:\\Users\\sagar\\Pictures\\fall-leaves-forest-Shairaa-SS.jpeg"));

        // File file = new File(ourSelectedFile.toURI());
        //System.out.println(file);
        //BufferedImage bufferedImage = ImageIO.read(file);
        // ImageIO.write(bufferedImage,selectedFormat,);
      //
        // WritableImage writableImage = new WritableImage(
           //     200,
             //   200);


//        FileChooser fileChooser = new FileChooser();
  //      fileChooser.setTitle("Save Image");


    //    File file = fileChooser.showSaveDialog(sc.getWindow());




    public void rotateClockwise(ActionEvent e) {
      if (e.getSource()== rotate){
          degree = degree+90;
          imgrotate.setRotate(degree);

      }
    }

    /*public void intialize (ActionEvent event){


        slider.valueProperty().addListener((observable, oldValue, newValue) -> {
            ColorAdjust colorAdjust = new ColorAdjust();
            slider.setMin(-1.0);
            slider.setMax(1.0);
            slider.setValue(0.0);
            slider.setBlockIncrement(0.1);
            slider.isValueChanging();
            double brightnessValue = slider.getValue();
            Consumer<Double> hueConsumer = (value) ->
            colorAdjust.hueProperty().set(value);
            colorAdjust.setBrightness(brightnessValue);
            imgrotate.setEffect(colorAdjust);
        });

    }*/


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        ColorAdjust colorAdjust = new ColorAdjust();
        slider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {

               // color=slider.getValue();
               //
                double saturationValue = slider.getValue();
                Consumer<Double> hueConsumer = (value) ->
                        colorAdjust.saturationProperty().set(value);
                colorAdjust.setSaturation(saturationValue);
                imgrotate.setEffect(colorAdjust);

            }
        });

       /* double brightnessValue = slider.getValue();
        Consumer<Double> hueConsumer = (value) ->
                colorAdjust.saturationProperty().set(value);
        colorAdjust.setBrightness(brightnessValue);
        imgrotate.setEffect(colorAdjust);*/
    }

    public void comboBoxselect(ActionEvent event) throws IOException {

        selectedFormat =comboBox.getSelectionModel().getSelectedItem().toString();
        System.out.println(selectedFormat);


      /*  File file = new File(filepath);
        BufferedImage bufferedImage = ImageIO.read(file);

        // Convert the image to  format in memory
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(bufferedImage,selectedFormat,baos);

        // Get the converted image data as a byte array
        byte[] imageData = baos.toByteArray();

        ByteArrayInputStream bis = new ByteArrayInputStream(imageData);
        BufferedImage bImage2 = ImageIO.read(bis);
        ImageIO.write(bImage2, selectedFormat, new File("output.jpg") );

*/

    }

}