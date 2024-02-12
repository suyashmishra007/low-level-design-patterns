package org.example.MementoDesign;

public class ConfigurationOriginator {
    private int height , width;

    public ConfigurationOriginator(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public ConfigurationMemento createMemento(){
        return new ConfigurationMemento(this.height,this.width);
    }

    public void restoreMemento(ConfigurationMemento menentoToBeRestored){
        this.height = menentoToBeRestored.getHeight();
        this.width = menentoToBeRestored.getWidth();
    }
}
