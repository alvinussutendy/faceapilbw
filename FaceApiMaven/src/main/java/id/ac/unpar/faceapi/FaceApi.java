/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unpar.faceapi;

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
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.highgui.Highgui;

/**
 * import org.opencv.core.Core; import org.opencv.core.Mat; import static org.opencv.highgui.Highgui.imread;
 */

/**
 *
 * @author ASUS
 */
public class FaceApi {

    private String imageAddress;

    // Replace <Subscription Key> with your valid subscription key.
    private static final String subscriptionKey = "85d799141b4746d6827f4ffd52db6375";

    private static final String uriBase
            = "https://pascalfaceapisandbox.cognitiveservices.azure.com/face/v1.0/detect";

    private static final String faceAttributes
            = "gender,headPose,smile,emotion,occlusion,blur,exposure,noise";
    
    Engine e;
    byte[] data;

    /**
     * @param args the command line arguments
     */
    public FaceApi(String imageAddress) throws IOException {
        this.imageAddress = imageAddress;
        
        BufferedImage bImage = ImageIO.read(new File(imageAddress));
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ImageIO.write(bImage, "jpg", bos);
        this.data = bos.toByteArray();
    }
    
    public FaceApi(Mat img){
        MatOfByte matOfByte = new MatOfByte();
        Highgui.imencode(".jpg", img, matOfByte);
//        Imgcodecs.imencode(".jpg", img, matOfByte);
        this.data = matOfByte.toArray(); //data = byte[]
    }

    public void processImage() throws URISyntaxException, IOException {
        HttpClient httpclient = HttpClientBuilder.create().build();

        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Link Gambar dan Format(ex:.jpg):");

        String link = "https://media.licdn.com/dms/image/C5103AQG90gfFL_TeEQ/profile-displayphoto-shrink_200_200/0?e=1577318400&v=beta&t=xu_EfmtL1GO1b8gVMTt7bjVu1u89eK4YbLnhNjkScic";

        String depan = "{\"url\":\"";
        String tutup = "\"}";
        String imageWithFaces = depan + link + tutup;

        //Preparing content
        ByteArrayEntity content = new ByteArrayEntity(this.data);
        System.out.println(content);

        try {
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
            if (entity != null) {
                // Format and display the JSON response.
                System.out.println("REST Response:\n");

                String jsonString = EntityUtils.toString(entity).trim();
                jsonString = jsonString.replace('[', ' ');
                jsonString = jsonString.replace(']', ' ');
                jsonString = jsonString.trim();
                if (jsonString.charAt(0) == '[') {
                    JSONArray jsonArray = new JSONArray(jsonString);
                    System.out.println(jsonArray.toString(2));

                    //Proses disini
//                    System.out.println(jsonArray.get(0).toString());
                } else if (jsonString.charAt(0) == '{') {
                    JSONObject jsonObject = new JSONObject(jsonString);
                    System.out.println(jsonObject.toString(2));

                    //Proses disini
                    this.e = new Engine(jsonObject);

                    //Testing 2
                    System.out.println("Testing 2");
                    System.out.println(e.faceRectangle.toString());
                    System.out.println(e.faceAttributes.toString());
                    System.out.println(e.emotion.toString());
                    System.out.println(e.gender);
                    System.out.println(e.exposure.toString());
                    System.out.println(e.occlusion.toString());
                    System.out.println(e.noise.toString());
                    System.out.println(e.blur.toString());
                    System.out.println(e.headPose.toString());
                    System.out.println(e.smile);
                } else {
                    System.out.println(jsonString);
                }
            }
        } catch (Exception e) {
            // Display error message.
            System.out.println(e.getMessage());
        }
    }
    
    public Engine getEngine(){
        return this.e;
    }
}
