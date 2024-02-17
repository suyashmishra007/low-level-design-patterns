package org.example.composite.fileSystem;

public class Main {
    public static void main(String[] args) {
        Directory movieDirectory =  new Directory("Movie");
        FileSystem border = new File("Border");
        movieDirectory.add(border);

        Directory comedyMovieDirectory =  new Directory("Comedy Movie");
        FileSystem dostana = new File("Dostana");
        comedyMovieDirectory.add(dostana);

        movieDirectory.add(comedyMovieDirectory);
        movieDirectory.ls();
    }
}
