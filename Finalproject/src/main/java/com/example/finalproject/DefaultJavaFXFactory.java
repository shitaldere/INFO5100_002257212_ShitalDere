package com.example.finalproject;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class DefaultJavaFXFactory implements JavaFXFactory{

    // create javafx image
    @Override
    public Image createImage(String path) {
        return new Image(path);
    }

    // create javafx imageview
    @Override
    public ImageView createImageView(Image image) {
        return new ImageView(image);
    }
}
