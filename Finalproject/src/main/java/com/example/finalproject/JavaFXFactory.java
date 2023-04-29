package com.example.finalproject;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

// interface to create factory to get image and imageview
public interface JavaFXFactory {

    Image createImage(String path);
    ImageView createImageView(Image image);

}
