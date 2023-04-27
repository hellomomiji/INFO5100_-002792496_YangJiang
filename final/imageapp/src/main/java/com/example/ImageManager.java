package com.example;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.stage.DirectoryChooser;

public class ImageManager {

  public Image getThumbnailImage(BufferedImage img) {
    ThumbnailGenerator tg = new ThumbnailGenerator();
    Image thumbImage = tg.getThumbnail(img);
    return thumbImage;
  }


  public String getProperties(BufferedImage img, String imgPath) {
    PropertiesManager pm = new PropertiesManager();
    String extension = imgPath.substring(imgPath.lastIndexOf(".")+1);

    // set height and width
    pm.setHeight(img.getHeight());
    pm.setWidth(img.getWidth());

    // set location and camera
    ByteArrayOutputStream bStream = new ByteArrayOutputStream();
    try {
      ImageIO.write(img,extension,bStream);
      int fileSize = bStream.size();
      bStream.close();
      pm.setFileSize(fileSize);
      } 
    catch (Exception e) {
      e.printStackTrace();
    }
    return propertiesToString(pm);
  }

  public String propertiesToString(PropertiesManager pm) {
   double fileSize = (double) pm.getFileSize() / 1048576;
   String text = String.format(
    "Width: %d\nHeight: %d\nFile size: %.2f MB\nCamera: %s\nLocation: %s",
    pm.getWidth(),
    pm.getHeight(),
    fileSize,
    pm.getCamera() != null ? pm.getCamera() : "N/A",
    pm.getLocation() != null ? pm.getLocation() : "N/A");

    return text;
  }

  public static void convertImg(String targetFormat, File selectedFile) {
    ErrorHandling errorHandling = new ErrorHandling();
    if (selectedFile == null) {
      errorHandling.showErrorDialog("No image to convert. Please upload images first.");
    }

    if (selectedFile != null) {
      try {
        //choose output directory
        DirectoryChooser dirChooser = new DirectoryChooser();
        dirChooser.setTitle("Choose Output Directory");
        File outputDir = dirChooser.showDialog(null);
    
        // Save the converted image to the selected output directory
        if (outputDir != null) {
          // convert img
          File outputFile = new File(selectedFile.getParent(), "output." + targetFormat);
          ImageIO.write(ImageIO.read(selectedFile), targetFormat, outputFile);
          System.out.println("Image converted to" + targetFormat +"format.");
          Alert alert = new Alert(AlertType.INFORMATION,"Image converted to " + targetFormat +" format and successfully");
          alert.showAndWait();
        }
      } catch (IOException e) {
        errorHandling.showErrorDialog(e.getMessage());
      }
    } 
  }

}
