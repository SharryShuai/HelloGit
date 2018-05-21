package main.com.github.sharry;

public class HelloGit {

    public void greet(String name) {
        System.out.println("Hello, this is " + name);
    }
    
    public static void main(String[] args) {
        new HelloGit().greet("my first git project");
    }

}
