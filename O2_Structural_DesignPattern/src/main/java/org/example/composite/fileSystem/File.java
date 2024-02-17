package org.example.composite.fileSystem;

public class File implements FileSystem{
    String fileName;
    public File(String file){this.fileName = file;}
    @Override
    public void ls() {
        System.out.println("filename : " + fileName);
    }
}
