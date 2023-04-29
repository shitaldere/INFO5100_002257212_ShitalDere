package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.TilePane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.nio.file.InvalidPathException;


public class GalleryController {
    @FXML
    private TilePane tilePane;

    private JavaFXFactory javaFXFactory = new DefaultJavaFXFactory();


    public void chooseFile(ActionEvent e) throws InvalidPathException {

       // creates a file chooser system, which allows the user to select a file or directory from their file system.
        FileChooser fileChooser = new FileChooser();
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();

        //creates imageview to store image
        File selectedFile = fileChooser.showOpenDialog(stage);
        ImageView imageView = null;
        String path = selectedFile.getAbsolutePath();

        //set image in imageview
        if (selectedFile != null) {

            // use of factory design pattern
            Image image = javaFXFactory.createImage(selectedFile.toURI().toString());
            imageView = javaFXFactory.createImageView(image);
        }

        // calling method to set imageview properties
        setImageViewProperty(imageView);

        // Adding image thumbnails in tile pane
        addThumbnailInTilePane(imageView);



        //mouse click process on thumbnail imageview 100*100
        imageView.setPickOnBounds(true);
        imageView.setOnMouseClicked((MouseEvent) -> {
            ImageView thumbnailImageView = (ImageView) MouseEvent.getSource();
            String imagePath = thumbnailImageView.getImage().getUrl();

            getImageController(imagePath,selectedFile,path);

        });

    }

    //This ImageView properties display an image thumbnail on the screen.
    private void setImageViewProperty(ImageView imageView) {

        // thumbnail size can be adjusted by changing the
        // width and height properties of the ImageView.
        imageView.setFitHeight(100);
        imageView.setFitWidth(100);

        //imageview 100*100 effects
        DropShadow dropShadow = new DropShadow();
        dropShadow.setRadius(6.0);
        dropShadow.setOffsetX(4.0);
        dropShadow.setOffsetY(4.0);
        imageView.setEffect(dropShadow);

    }
     //The ImageView will be displayed on the TilePane
     // and can be positioned using the TilePane
    private void addThumbnailInTilePane(ImageView imageView) {

        tilePane.getChildren().add(imageView);
        tilePane.setPadding(new Insets(10));
        tilePane.setHgap(20); // gap in imageview
        tilePane.setVgap(20);
    }

    public void getImageController(String imagePath,File selectedFile, String path){


        //create a new FXML file for the gallery controller.
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("fxml/image-window.fxml"));
        try {
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage1 = new Stage();
            stage1.setTitle("Second window");
            stage1.setScene(new Scene(root1));
            stage1.setResizable(false);

            // The instance of the second controller can be accessed using the
            // getController() method of the FXMLLoader.
            ImageController imageController = fxmlLoader.getController();

            // fullImage is showing on new window
            Image fullImage = new Image(imagePath);
            ImageView fullImageView = new ImageView();
            fullImageView.setImage(fullImage);

            // set the fitWidth and fitHeight properties
            fullImageView.setFitHeight(430);
            fullImageView.setFitWidth(430);

            // show 430*430 image effects using dropshadow instance.
             DropShadow dropShadow1 = new DropShadow();
            dropShadow1.setRadius(15);
            dropShadow1.setOffsetX(10);
            dropShadow1.setOffsetY(10);
            fullImageView.setEffect(dropShadow1);


            // show full image on tile pane
            imageController.getFullImageTilePane().getChildren().add(fullImageView);

            // get the image height and width for showing dimension of image on tilepane
            double height = fullImage.getHeight();
            double width = fullImage.getWidth();
            String location = fullImage.getUrl();


            // fit the image properties in label
            imageController.getLabel().setText( " Image Height   : " + height +" pixel "+ "\n"
                    + " Image Width    : " + width + " pixel " +"\n"
                    + " Image Location : " + location + "\n"
                    + " Dimension      : " + height + "x" + width);


            imageController.setOurSelectedFile(selectedFile);
            imageController.setFilepath(path);
            imageController.imageRotate = fullImageView;

            //assign path to file
            String file = path;

            //show the image controller stage
            stage1.show();

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

    }
}




