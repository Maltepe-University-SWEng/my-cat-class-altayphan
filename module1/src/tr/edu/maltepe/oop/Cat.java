package tr.edu.maltepe.oop;


import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Cat {
    // Attributes
    private String name;
    private int age;
    private String color;

    // Constructor
    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    // Method to make the cat meow (with sound effect)
    public void meow() {
        System.out.println(name + " says: Meow!");

        try {
            // Load the sound file
            File soundFile = new File("C:\\Users\\altay\\Downloads\\cat-meow-6226.wav"); // Make sure meow.wav exists in the same directory
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);

            // Get a sound clip resource
            Clip clip = AudioSystem.getClip();

            // Open audio clip and load samples from the audio input stream
            clip.open(audioStream);

            // Play the sound
            clip.start();

            // Optional: wait for the sound to finish playing
            Thread.sleep(clip.getMicrosecondLength() / 1000);

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
            System.out.println("Error playing sound: " + e.getMessage());
        }
    }

    // Method to display cat information
    public void displayInfo() {
        System.out.println("Cat Name: " + name);
        System.out.println("Age: " + age + " years old");
        System.out.println("Color: " + color);
    }

    // Main method to test

}
