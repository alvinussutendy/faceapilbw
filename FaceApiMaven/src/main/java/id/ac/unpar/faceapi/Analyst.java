/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unpar.faceapi;

/**
 *
 * @author ASUS
 */
public class Analyst {

    private static final double MIN_ROLL_MALE = 1.0625;
    private static final double MAX_ROLL_MALE = 8.6975;
    private static final double MIN_PITCH_MALE = 0.8056;
    private static final double MAX_PITCH_MALE = 10.8844;
    private static final double MIN_YAW_MALE = 1.1999;
    private static final double MAX_YAW_MALE = 20.7101;
    private static final double MIN_SMILE_MALE = 0.7182;
    private static final double MAX_SMILE_MALE = 1.1432;
    private static final double MIN_CONTEMPT_MALE = 0;
    private static final double MAX_CONTEMPT_MALE = 0.0007;
    private static final double MIN_SURPRISE_MALE = 0;
    private static final double MAX_SURPRISE_MALE = 0;
    private static final double MIN_NEUTRAL_MALE = 0;
    private static final double MAX_NEUTRAL_MALE = 0.2811;
    private static final double MIN_SADNESS_MALE = 0;
    private static final double MAX_SADNESS_MALE = 0;
    private static final double MIN_DISGUST_MALE = 0;
    private static final double MAX_DISGUST_MALE = 0;
    private static final double MIN_ANGER_MALE = 0;
    private static final double MAX_ANGER_MALE = 0;
    private static final double MIN_FEAR_MALE = 0;
    private static final double MAX_FEAR_MALE = 0;
    private static final double MIN_EXPOSURE_MALE = 0.6458;
    private static final double MAX_EXPOSURE_MALE = 0.8082;
    private static final double MIN_NOISE_MALE = 0;
    private static final double MAX_NOISE_MALE = 0.3444;

    private static final double MIN_ROLL_FEMALE = 3.6573;
    private static final double MAX_ROLL_FEMALE = 12.1765;
    private static final double MIN_PITCH_FEMALE = 3.9543;
    private static final double MAX_PITCH_FEMALE = 13.6956;
    private static final double MIN_YAW_FEMALE = 3.8863;
    private static final double MAX_YAW_FEMALE = 25.3537;
    private static final double MIN_SMILE_FEMALE = 0.8675;
    private static final double MAX_SMILE_FEMALE = 1.0510;
    private static final double MIN_CONTEMPT_FEMALE = 0;
    private static final double MAX_CONTEMPT_FEMALE = 0.0010;
    private static final double MIN_SURPRISE_FEMALE = 0;
    private static final double MAX_SURPRISE_FEMALE = 0.0003;
    private static final double MIN_NEUTRAL_FEMALE = 0;
    private static final double MAX_NEUTRAL_FEMALE = 0.1315;
    private static final double MIN_SADNESS_FEMALE = 0;
    private static final double MAX_SADNESS_FEMALE = 0;
    private static final double MIN_DISGUST_FEMALE = 0;
    private static final double MAX_DISGUST_FEMALE = 0;
    private static final double MIN_ANGER_FEMALE = 0;
    private static final double MAX_ANGER_FEMALE = 0;
    private static final double MIN_FEAR_FEMALE = 0;
    private static final double MAX_FEAR_FEMALE = 0;
    private static final double MIN_EXPOSURE_FEMALE = 0.5010;
    private static final double MAX_EXPOSURE_FEMALE = 0.8590;
    private static final double MIN_NOISE_FEMALE = 0;
    private static final double MAX_NOISE_FEMALE = 0.5157;

    private Engine engine;

    public Analyst(Engine engine) {
        this.engine = engine;
    }

    public void analysisFace() {
        System.out.println("\nAnalysing Face...");
        if (engine.getGender().equals("male")) {
            if (Math.abs(engine.getRoll()) < MIN_ROLL_MALE) {
                if (engine.getRoll() < 0) {
                    System.out.println("Kurang gideuk kiri");
                } else {
                    System.out.println("Kurang gideuk kanan");
                }
            } else if (Math.abs(engine.getRoll()) > MAX_ROLL_MALE) {
                if (engine.getRoll() < 0) {
                    System.out.println("Kurang gideuk kanan");
                } else {
                    System.out.println("Kurang gideuk kiri");
                }
            }
            if (Math.abs(engine.getPitch()) < MIN_PITCH_MALE) {
                System.out.println("27");
                if (engine.getPitch() < 0) {
                    System.out.println("Kurang tunduk");
                } else {
                    System.out.println("Kurang tanggah");
                }
            } else if (Math.abs(engine.getPitch()) > MAX_PITCH_MALE) {
                if (engine.getPitch() < 0) {
                    System.out.println("Kurang tanggah");
                } else {
                    System.out.println("Kurang tunduk");
                }
            }

            if (Math.abs(engine.getYaw()) < MIN_YAW_MALE) {
                System.out.println("27");
                if (engine.getYaw() < 0) {
                    System.out.println("Kurang noleh ke kiri");
                } else {
                    System.out.println("Kurang noleh ke kanan");
                }
            } else if (Math.abs(engine.getYaw()) > MAX_YAW_MALE) {
                if (engine.getYaw() < 0) {
                    System.out.println("Kurang noleh ke kanan");
                } else {
                    System.out.println("Kurang noleh ke kiri");
                }
            }

            if (engine.getSmile() < MIN_SMILE_MALE) {
                System.out.println("Kurang senyum");
            } else {
                System.out.println("Terlalu senyum");
            }

            if (engine.getContempt() < MIN_CONTEMPT_MALE) {
                System.out.println("kurang belagu");
            } else {
                System.out.println("terlalu belagu");
            }

            if (engine.getSurprise() < MIN_SURPRISE_MALE) {
                System.out.println("kurang heboh");
            } else {
                System.out.println("terlalu heboh");
            }

            if (engine.getNeutral() < MIN_NEUTRAL_MALE) {
                System.out.println("kurang netral");
            } else {
                System.out.println("terlalu netral");
            }

            if (engine.getSadness() < MIN_SADNESS_MALE) {
                System.out.println("kurang sedih");
            } else {
                System.out.println("terlalu sedih");
            }

            if (engine.getDisgust() < MIN_DISGUST_MALE) {
                System.out.println("kurang jijik");
            } else {
                System.out.println("terlalu jijik");
            }

            if (engine.getAnger() < MIN_ANGER_MALE) {
                System.out.println("kurang marah");
            } else {
                System.out.println("terlalu marah");
            }

            if (engine.getFear() < MIN_FEAR_MALE) {
                System.out.println("kurang takut");
            } else {
                System.out.println("terlalu takut");
            }

            if (engine.getExposure() < MIN_EXPOSURE_MALE) {
                System.out.println("gambar kurang cerah");
            } else {
                System.out.println("gambar terlalu cerah");
            }

             if (engine.getNoise() > MIN_NOISE_MALE){
                System.out.println("gambar terlalu kotor");
            }

        } else if (engine.getGender().equals("female")) {

            if (Math.abs(engine.getRoll()) < MIN_ROLL_FEMALE) {
                if (engine.getRoll() < 0) {
                    System.out.println("Kurang gideuk kiri");
                } else {
                    System.out.println("Kurang gideuk kanan");
                }
            } else if (Math.abs(engine.getRoll()) > MAX_ROLL_FEMALE) {
                if (engine.getRoll() < 0) {
                    System.out.println("Kurang gideuk kanan");
                } else {
                    System.out.println("Kurang gideuk kiri");
                }
            }

            if (Math.abs(engine.getPitch()) < MIN_PITCH_FEMALE) {
                if (engine.getPitch() < 0) {
                    System.out.println("Kurang tunduk");
                } else {
                    System.out.println("Kurang tanggah");
                }
            } else if (Math.abs(engine.getPitch()) > MAX_PITCH_FEMALE) {
                if (engine.getPitch() < 0) {
                    System.out.println("Kurang tanggah");
                } else {
                    System.out.println("Kurang tunduk");
                }
            }

            if (Math.abs(engine.getYaw()) < MIN_YAW_FEMALE) {
                if (engine.getYaw() < 0) {
                    System.out.println("Kurang noleh kiri");
                } else {
                    System.out.println("Kurang noleh kanan");
                }
            } else if (Math.abs(engine.getYaw()) > MAX_YAW_FEMALE) {
                if (engine.getYaw() < 0) {
                    System.out.println("Kurang noleh kanan");
                } else {
                    System.out.println("Kurang noleh kiri");
                }
            }

            if (engine.getSmile() < MIN_SMILE_FEMALE) {
                System.out.println("Kurang senyum");
            } else if (engine.getSmile() > MAX_SMILE_FEMALE) {
                System.out.println("Terlalu senyum");
            }

            if (engine.getContempt() < MIN_CONTEMPT_FEMALE) {
                System.out.println("Kurang belagu");
            } else if (engine.getContempt() > MAX_CONTEMPT_FEMALE) {
                System.out.println("Terlalu belagu");
            }

            if (engine.getSurprise() < MIN_SURPRISE_FEMALE) {
                System.out.println("Kurang heboh");
            } else if (engine.getSurprise() > MAX_SURPRISE_FEMALE) {
                System.out.println("Terlalu heboh");
            }

            if (engine.getNeutral() < MIN_NEUTRAL_FEMALE) {
                System.out.println("Kurang netral");
            } else if (engine.getNeutral() > MAX_NEUTRAL_FEMALE) {
                System.out.println("Terlalu netral");
            }

            if (engine.getSadness() < MIN_SADNESS_FEMALE) {
                System.out.println("Kurang sedih");
            } else if (engine.getSadness() > MAX_SADNESS_FEMALE) {
                System.out.println("Terlalu sedih");
            }

            if (engine.getDisgust() < MIN_DISGUST_FEMALE) {
                System.out.println("Kurang jijik");
            } else if (engine.getDisgust() > MAX_DISGUST_FEMALE) {
                System.out.println("Terlalu jijik");
            }

            if (engine.getAnger() < MIN_ANGER_FEMALE) {
                System.out.println("Kurang marah");
            } else if (engine.getAnger() > MAX_ANGER_FEMALE) {
                System.out.println("Terlalu marah");
            }

            if (engine.getFear() < MIN_FEAR_FEMALE) {
                System.out.println("Kurang takut");
            } else if (engine.getFear() > MAX_FEAR_FEMALE) {
                System.out.println("Terlalu takut");
            }

            if (engine.getExposure() < MIN_EXPOSURE_FEMALE) {
                System.out.println("Kurang terang");
            } else if (engine.getExposure() > MAX_EXPOSURE_FEMALE) {
                System.out.println("Terlalu terang");
            }

            if (engine.getNoise() < MIN_NOISE_FEMALE) {
                System.out.println("Kurang kotor");
            } else if (engine.getNoise() > MAX_NOISE_FEMALE) {
                System.out.println("Terlalu kotor");
            }
        }
    }
}
