package com.example;

public class PropertiesManager {
  private int height;
  private int width;

  private int fileSize;
  private String camera;
  private String location;
  
  public int getHeight() {
    return height;
  }
  public void setHeight(int d) {
    this.height = d;
  }
  public int getWidth() {
    return width;
  }
  public void setWidth(int d) {
    this.width = d;
  }
  public int getFileSize() {
    return fileSize;
  }
  public void setFileSize(int fileSize) {
    this.fileSize = fileSize;
  }
  public String getCamera() {
    return camera;
  }
  public void setCamera(String camera) {
    this.camera = camera;
  }
  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
  }



}
