package com.example;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


public class Main extends Application {
  private ImageView imageView = new ImageView();
  private Label propertyLabel = new Label();
  private File selectedFile;
  private String imagePath;

  public static void main(String[] args) {
      launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {

    primaryStage.setTitle("Image Converter");

    // Create a GridPane to hold the UI elements
    GridPane gridPane = new GridPane();
    gridPane.setAlignment(Pos.TOP_CENTER);
    gridPane.setHgap(10);
    gridPane.setVgap(10);

    // Create a Label to display the selected image
    Label label = new Label("Selected Image:");
    gridPane.add(label, 0, 0);
    gridPane.setPadding(new Insets(20));

    ImageManager imageManager = new ImageManager();
    ErrorHandling errorHandling = new ErrorHandling();

    // Create a Button to select an image file
    HBox selectImgBox = new HBox(10);
    Button selectButton = new Button("Select Image");
    Button cancelButton = new Button("Cancel");
    selectImgBox.getChildren().addAll(selectButton,cancelButton);

    selectButton.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {

            // Show a file chooser dialog to select an image file
            FileChooser fileChooser = new FileChooser();
            fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("All Images", "*.jpg", "*.jpeg", "*.png", "*.bmp", "*.gif"));
            selectedFile = fileChooser.showOpenDialog(primaryStage);
            imagePath = selectedFile.getPath();

            // Load the selected image into the ImageView
            if (selectedFile != null) {
                try {
                    BufferedImage image = ImageIO.read(selectedFile);
                    Image thumbImage = imageManager.getThumbnailImage(image);
                    String properties = imageManager.getProperties(image, imagePath);
                    propertyLabel.setText(properties);

                    imageView.setImage(thumbImage);
                } catch (IOException e) {
                    errorHandling.showErrorDialog(e.getMessage());
                }
            }
        }
    });

    cancelButton.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            imageView.setImage(null);
            selectedFile = null;
            propertyLabel.setText("");
        }
    });

    gridPane.add(selectImgBox, 0, 1);
    gridPane.add(imageView, 0, 2);
    gridPane.add(propertyLabel, 0, 4);

    // Create HBox to hold the buttons
    HBox buttonBox = new HBox();
    buttonBox.setSpacing(10);

    // Create a Button to convert the selected image to PNG format
    Button pngButton = new Button("Convert to PNG");
    pngButton.setOnAction(event -> ImageManager.convertImg("png", selectedFile));
    buttonBox.getChildren().add(pngButton);
    
    // Create a Button to convert the selected image to JPG format
    Button jpgButton = new Button("Convert to JPG");
    jpgButton.setOnAction(event -> ImageManager.convertImg("jpg", selectedFile));
    buttonBox.getChildren().add(jpgButton);
    
    // Create a Button to convert the selected image to gif format
    Button gifButton = new Button("Convert to GIF");
    gifButton.setOnAction(event -> ImageManager.convertImg("gif", selectedFile));
    buttonBox.getChildren().add(gifButton);
    
    // Create a Button to convert the selected image to gif format
    Button bmpButton = new Button("Convert to BMP");
    bmpButton.setOnAction(event -> ImageManager.convertImg("bmp", selectedFile));
    buttonBox.getChildren().add(bmpButton);

    gridPane.add(buttonBox, 0, 10);
    
    Scene scene = new Scene(gridPane, 500, 400);
    primaryStage.setScene(scene);
    primaryStage.show();
    
    
  }

}
  
