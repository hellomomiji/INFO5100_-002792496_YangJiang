package com.example;

import java.awt.image.BufferedImage;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;

public class ThumbnailGenerator {

  public ImageView getThumbnailView(BufferedImage img) {
    double thumbnailSize = 100;
    
    ImageView thumbnailView = new ImageView();
    thumbnailView.setPreserveRatio(true);
    thumbnailView.setFitWidth(thumbnailSize);
    thumbnailView.setFitHeight(thumbnailSize);
    thumbnailView.setSmooth(true);

    WritableImage writableImage = new WritableImage(img.getWidth(), img.getHeight());
    PixelWriter pixelWriter = writableImage.getPixelWriter();
    for (int x = 0; x < img.getWidth(); x++) {
      for (int y = 0; y < img.getHeight(); y++) {
          pixelWriter.setArgb(x, y, img.getRGB(x, y));
      }
  }

    thumbnailView.setImage(writableImage);
    return thumbnailView;
  }

  public Image getThumbnail(BufferedImage img) {
    ImageView thumbView = getThumbnailView(img);
    Image thubImage = thumbView.snapshot(null, null);
    return thubImage;
  }
  
  

}
