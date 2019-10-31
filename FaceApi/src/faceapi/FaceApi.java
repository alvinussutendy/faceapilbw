/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faceapi;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;
import javax.imageio.ImageIO;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;
/**
import org.opencv.core.Core;
import org.opencv.core.Mat;
import static org.opencv.highgui.Highgui.imread;*/

/**
 *
 * @author ASUS
 */
public class FaceApi {

    // Replace <Subscription Key> with your valid subscription key.
    private static final String subscriptionKey = "85d799141b4746d6827f4ffd52db6375";

    private static final String uriBase =
        "https://pascalfaceapisandbox.cognitiveservices.azure.com/face/v1.0/detect";
    
    

    private static final String faceAttributes =
        "gender,headPose,smile,emotion,occlusion,blur,exposure,noise";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws URISyntaxException, IOException {
        HttpClient httpclient = HttpClientBuilder.create().build();

        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Link Gambar:");
        
        String link = "https://media.licdn.com/dms/image/C5103AQG90gfFL_TeEQ/profile-displayphoto-shrink_200_200/0?e=1577318400&v=beta&t=xu_EfmtL1GO1b8gVMTt7bjVu1u89eK4YbLnhNjkScic";

        String depan = "{\"url\":\"";
        String tutup = "\"}";
        String imageWithFaces = depan+link+tutup;
       
        /**
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        Mat src = imread("camera.jpg");*/
//        String imageWithFaces = src.toString(); 
        //BufferedImage bImage = ImageIO.read(new File("Foto training\\cowo\\Agil-Widana.jpg"));
        BufferedImage bImage = ImageIO.read(new File("cewe\\"+sc.next()));
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ImageIO.write(bImage, "jpg", bos );
        byte [] data = bos.toByteArray();
//        ByteArrayContent byteContent = new ByteArrayContent(data);
        ByteArrayEntity content = new ByteArrayEntity(data); System.out.println(content);
    
        try
        {
            URIBuilder builder = new URIBuilder(uriBase);

            // Request parameters. All of them are optional.
            builder.setParameter("returnFaceId", "true");
            builder.setParameter("returnFaceLandmarks", "false");
            builder.setParameter("returnFaceAttributes", faceAttributes);

            // Prepare the URI for the REST API call.
            URI uri = builder.build();
            HttpPost request = new HttpPost(uri);

            // Request headers.
            request.setHeader("Content-Type", "application/octet-stream"); //application/json
            request.setHeader("Ocp-Apim-Subscription-Key", subscriptionKey);

            // Request body.
//            StringEntity reqEntity = new StringEntity(imageWithFaces);
            request.setEntity(content); 
//            request.setEntity(reqEntity);

            // Execute the REST API call and get the response entity.
            HttpResponse response = httpclient.execute(request);
            HttpEntity entity = response.getEntity();
            if (entity != null)
            {
                // Format and display the JSON response.
                System.out.println("REST Response:\n");

                String jsonString = EntityUtils.toString(entity).trim();
                if (jsonString.charAt(0) == '[') {
                    JSONArray jsonArray = new JSONArray(jsonString);
                    System.out.println(jsonArray.toString(2));
                }
                else if (jsonString.charAt(0) == '{') {
                    JSONObject jsonObject = new JSONObject(jsonString);
                    System.out.println(jsonObject.toString(2));
                } else {
                    System.out.println(jsonString);
                }
            }
        }
        catch (Exception e)
        {
            // Display error message.
            System.out.println(e.getMessage());
        }
    }
    
}
