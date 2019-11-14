/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faceapi;

import org.json.JSONObject;

/**
 *
 * @author ASUS
 */
public class Engine {
    String gender,smile;
    JSONObject jsonObject, faceRectangle, faceAttributes, emotion, exposure, occlusion, noise, blur, headPose;
    String top,left,width,height;
    String contempt,surprise,happiness,neutral,sadness,disgust,anger,fear;
    String exposureValue, exposureLevel;
    String eyeOccluded,mouthOccluded,foreheadOccluded;
    String noiseLevel, noiseValue;
    String blurLevel, blurValue;
    String roll,pitch,yaw;
    
    Engine(JSONObject input){
        this.jsonObject = input;
        this.initializeVariable();
    }
    
    public void initializeVariable(){
        //toString(2) = di convert ke string dalam format json
        faceRectangle = new JSONObject(jsonObject.getJSONObject("faceRectangle").toString(2));
        faceAttributes = new JSONObject(jsonObject.getJSONObject("faceAttributes").toString(2));
        emotion = new JSONObject(faceAttributes.getJSONObject("emotion").toString(2));
        gender = faceAttributes.get("gender").toString();
        exposure = new JSONObject(faceAttributes.getJSONObject("exposure").toString(2)); 
        occlusion = new JSONObject(faceAttributes.getJSONObject("occlusion").toString(2));
        noise = new JSONObject(faceAttributes.getJSONObject("noise").toString(2));
        blur = new JSONObject(faceAttributes.getJSONObject("blur").toString(2));
        headPose = new JSONObject(faceAttributes.getJSONObject("headPose").toString(2));
        smile = faceAttributes.get("smile").toString();
        
        initializeStringVariable();
    }
    
    public void initializeStringVariable(){
        top = faceRectangle.get("top").toString(); left = faceRectangle.get("left").toString();
        width = faceRectangle.get("width").toString(); height = faceRectangle.get("height").toString();
        
        contempt = emotion.get("contempt").toString(); surprise = emotion.get("surprise").toString();
        happiness = emotion.get("happiness").toString(); neutral = emotion.get("neutral").toString();
        sadness = emotion.get("sadness").toString(); disgust = emotion.get("disgust").toString();
        anger = emotion.get("anger").toString(); fear = emotion.get("fear").toString();
        
        exposureLevel = exposure.get("exposureLevel").toString(); exposureValue = exposure.get("value").toString();
        
        eyeOccluded = occlusion.get("eyeOccluded").toString(); 
        mouthOccluded = occlusion.get("mouthOccluded").toString(); 
        foreheadOccluded = occlusion.get("foreheadOccluded").toString(); 
        
        noiseLevel = noise.get("noiseLevel").toString(); noiseValue = noise.get("value").toString();
        
        blurLevel = blur.get("blurLevel").toString(); blurValue = blur.get("value").toString();
        
        roll = headPose.get("roll").toString();
        pitch = headPose.get("pitch").toString();
        yaw = headPose.get("yaw").toString();
    }
}
