/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unpar.faceapi;

import org.opencv.highgui.VideoCapture;
import org.opencv.*;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.highgui.Highgui;

/**
 *
 * @author ASUS
 */
public class CobaWebcam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        VideoCapture cap  = new VideoCapture(0);
        
        if(!cap.isOpened()){
            System.out.println("Cant connect to camera");
        }
        else{
            System.out.println("Found webcam : "+cap.toString());
            Mat frame = new Mat();
            cap.retrieve(frame);
            
            Highgui.imwrite("Testing.jpg",frame);
            cap.release();
        }
    }
    
}
