package com.example.finalproject;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.FileInputStream;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.css.converter.PaintConverter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ContextMenu;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.layout.TilePane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.util.Duration;
import org.w3c.dom.NodeList;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.ResourceBundle;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.metadata.IIOMetadataNode;
import javax.imageio.stream.ImageInputStream;


public class HelloController {

    private int x ;
    private int y ;
    private File selectedFile;


    private Image image;
    @FXML
    private TilePane tilePane;


    @FXML
    private ImageView uI;



        public void chooseFile(ActionEvent e) throws IOException, InvalidPathException {


        // File choosing process
        FileChooser fileChooser = new FileChooser();
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        File selectedFile = fileChooser.showOpenDialog(stage);
        ImageView imageView = new ImageView();
        String path =selectedFile.getAbsolutePath();
        //file selection
        if (selectedFile != null) {
            Image image = new Image(selectedFile.toURI().toString());
            imageView.setImage(image);
        }
            DropShadow dropShadow = new DropShadow();
            dropShadow.setRadius(6.0);
            dropShadow.setOffsetX(4.0);
            dropShadow.setOffsetY(4.0);
            imageView.setEffect(dropShadow);


           tilePane.setPadding(new Insets(10));
            tilePane.setHgap(20); // add horizontal gap between each ImageView
            tilePane.setVgap(20);



        //mouse click process
        imageView.setPickOnBounds(true);
        imageView.setOnMouseClicked((MouseEvent) -> {
            ImageView imageView1 = (ImageView) MouseEvent.getSource();
            String imagePath = imageView1.getImage().getUrl();



            // get image path from click
            Image img = new Image(imagePath);
            ImageView imageView2 = new ImageView();
            imageView2.setImage(img);


            // autofix

            img.getRequestedHeight();
            img.getRequestedWidth();


            // imageView2.autosize();
            imageView2.setFitHeight(430);
            imageView2.setFitWidth(430);

            DropShadow dropShadow1 = new DropShadow();
            dropShadow1.setRadius(15);
            dropShadow1.setOffsetX(10);
            dropShadow1.setOffsetY(10);
            imageView2.setEffect(dropShadow1);


            //new window
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SecondWindow.fxml"));
            try {
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage1 = new Stage();
                stage1.setTitle("Second window");
                stage1.setScene(new Scene(root1));
                stage1.setResizable(true);
                // get controller
                SecondController secondController = fxmlLoader.getController();
                secondController.sagar.getChildren().add(imageView2);

                double h=img.getHeight();
                double w=img.getWidth();
                String size = img.getUrl();


                secondController.label.setText("Image height : "+h + "\n " + "width :"+ w +"\n "+ "Image Location :"+size + "\n Dimension: " + h + "x" + w);

                secondController.ourSelectedFile=selectedFile;
                secondController.filepath=path;
                secondController.imgrotate=imageView2;

                secondController.comboBox.setPromptText("Choose Format");
                secondController.comboBox.getItems().add("jpeg");
                secondController.comboBox.getItems().add("png");
                secondController.comboBox.getItems().add("jpe");
                secondController.comboBox.getItems().add("jpg");
                secondController.comboBox.getItems().add("jxr");
                secondController.comboBox.getItems().add("tif");
                secondController.comboBox.getItems().add("bmp");



               // ColorAdjust colorAdjust = new ColorAdjust();
               // colorAdjust.setBrightness(2.2);
               // colorAdjust.setSaturation(2);
               // colorAdjust
               // imageView2.setEffect(colorAdjust);

                String file = path;

                //   BufferedImage image8 = ImageIO.read(new File(file));

                // String output = file.replace( ".bmp");

                // ImageIO.write(image8,"bmp",new File(output));








                // ImageIO.write((RenderedImage) image8, "bmp", output);

             /*   File file = new File(path);
              //  System.out.println(path);
                BufferedImage bufferedImage = ImageIO.read(file);
               // ImageIO.write(bufferedImage,"jpg",new File("C:\\Users\\sagar\\Pictures.jpg"));
                ImageIO.write(bufferedImage,"png",new File("C:/Users/sagar/Pictures/ssss.png"));
                ImageIO.write(bufferedImage,"bmp",new File("C:/Users/sagar/Pictures/xxx.bmp"));*/

                stage1.show();

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }


        });


        imageView.setFitHeight(100);
        imageView.setFitWidth(100);
        imageView.setX(x);
        imageView.setY(y);
        tilePane.getChildren().add(imageView);
    }

 //   @Override
  //  public void initialize(URL url, ResourceBundle resourceBundle) {
    //    Image imgUI = new Image(getClass().getResourceAsStream("fin.gif"));
      //  uI.setImage(imgUI);
    //}

    private static String getMetadataValue(IIOMetadataNode rootNode, String formatName, String tagName) {
        String value = null;
        NodeList nodes = rootNode.getElementsByTagName(formatName + ":" + tagName);
        if (nodes.getLength() > 0) {
            value = nodes.item(0).getFirstChild().getNodeValue();
        }
        return value;
    }

    private static int getMetadataValueAsInt(IIOMetadataNode rootNode, String formatName, String tagName) {
        String valueStr = getMetadataValue(rootNode, formatName, tagName);
        return valueStr != null ? Integer.parseInt(valueStr) : 0;
    }

    //root.getChildren().addAll(button, imageView);
        //Scene scene = new Scene(root, 800, 800, Color.LIGHTPINK);
        //stage.setScene(scene);
        //stage.setTitle("Photo Viewer");
        // stage.show();

        //   Label label = new Label();
        //   label.setText(String.valueOf(hh + ww));


        //   double H=
        //  double W=
        // double hh=(double) imageView2.getBoundsInParent().getHeight();
        //double ww=(double) imageView2.getBoundsInParent().getWidth();
      //  double aspectRatio = img.getWidth();
       // double realWidth = Math.min(imageView1.getFitWidth(), imageView1.getFitHeight() * aspectRatio);

    }




