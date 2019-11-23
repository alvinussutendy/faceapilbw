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

    private String sugestionResult;
    private Engine engine;

    public Analyst(Engine engine) {
        this.engine = engine;
        this.sugestionResult = "";
    }

    public void analysisFace() {
        System.out.println("\nAnalysing Face...");
        if (engine.getGender().equals("male")) {
            if (Math.abs(engine.getRoll()) < MIN_ROLL_MALE) {
                if (engine.getRoll() < 0) {
                    sugestionResult += "Kurang gideuk ke kiri" + "\n";
                    System.out.println("Kurang gideuk ke kiri");
                } else {
                    sugestionResult += "Kurang gideuk kanan" + "\n";
                    System.out.println("Kurang gideuk ke kanan");
                }
            } else if (Math.abs(engine.getRoll()) > MAX_ROLL_MALE) {
                if (engine.getRoll() < 0) {
                    sugestionResult += "Kurang gideuk ke kanan" + "\n";
                    System.out.println("Kurang gideuk ke kanan");
                } else {
                    sugestionResult += "Kurang gideuk ke kiri" + "\n";
                    System.out.println("Kurang gideuk ke kiri");
                }
            }
            if (Math.abs(engine.getPitch()) < MIN_PITCH_MALE) {
                System.out.println("27");
                if (engine.getPitch() < 0) {
                    sugestionResult += "Kurang tunduk" + "\n";
                    System.out.println("Kurang tunduk");
                } else {
                    sugestionResult += "Kurang tengadah" + "\n";
                    System.out.println("Kurang tengadah");
                }
            } else if (Math.abs(engine.getPitch()) > MAX_PITCH_MALE) {
                if (engine.getPitch() < 0) {
                    sugestionResult += "Kurang gideuk tengadah" + "\n";
                    System.out.println("Kurang tengadah");
                } else {
                    sugestionResult += "Kurang tunduk" + "\n";
                    System.out.println("Kurang tunduk");
                }
            }

            if (Math.abs(engine.getYaw()) < MIN_YAW_MALE) {
                if (engine.getYaw() < 0) {
                    sugestionResult += "Kurang noleh ke kiri" + "\n";
                    System.out.println("Kurang noleh ke kiri");
                } else {
                    sugestionResult += "Kurang noleh ke kanan" + "\n";
                    System.out.println("Kurang noleh ke kanan");
                }
            } else if (Math.abs(engine.getYaw()) > MAX_YAW_MALE) {
                if (engine.getYaw() < 0) {
                    sugestionResult += "Kurang noleh ke kanan" + "\n";
                    System.out.println("Kurang noleh ke kanan");
                } else {
                    sugestionResult += "Kurang noleh ke kiri" + "\n";
                    System.out.println("Kurang noleh ke kiri");
                }
            }

            if (engine.getSmile() < MIN_SMILE_MALE) {
                sugestionResult += "Kurang senyum" + "\n";
                System.out.println("Kurang senyum");
            } else {
                sugestionResult += "Terlalu senyum" + "\n";
                System.out.println("Terlalu senyum");
            }

            if (engine.getContempt() < MIN_CONTEMPT_MALE) {
                sugestionResult += "Kurang belagu" + "\n";
                System.out.println("kurang belagu");
            } else {
                sugestionResult += "Terlalu belagu" + "\n";
                System.out.println("Terlalu belagu");
            }

            if (engine.getSurprise() < MIN_SURPRISE_MALE) {
                sugestionResult += "Kurang heboh" + "\n";
                System.out.println("Kurang heboh");
            } else {
                sugestionResult += "Terlalu heboh" + "\n";
                System.out.println("Terlalu heboh");
            }

            if (engine.getNeutral() < MIN_NEUTRAL_MALE) {
                sugestionResult += "Kurang netral" + "\n";
                System.out.println("Kurang netral");
            } else {
                sugestionResult += "Terlalu netral" + "\n";
                System.out.println("Terlalu netral");
            }

            if (engine.getSadness() < MIN_SADNESS_MALE) {
                sugestionResult += "Kurang sedih" + "\n";
                System.out.println("Kurang sedih");
            } else {
                sugestionResult += "Terlalu sedih" + "\n";
                System.out.println("Terlalu sedih");
            }

            if (engine.getDisgust() < MIN_DISGUST_MALE) {
                sugestionResult += "Kurang jijik" + "\n";
                System.out.println("Kurang jijik");
            } else {
                sugestionResult += "Terlalu jijik" + "\n";
                System.out.println("Terlalu jijik");
            }

            if (engine.getAnger() < MIN_ANGER_MALE) {
                sugestionResult += "Kurang marah" + "\n";
                System.out.println("Kurang marah");
            } else {
                sugestionResult += "Terlalu marah" + "\n";
                System.out.println("Terlalu marah");
            }

            if (engine.getFear() < MIN_FEAR_MALE) {
                sugestionResult += "Kurang takut" + "\n";
                System.out.println("Kurang takut");
            } else {
                sugestionResult += "Terlalu takut" + "\n";
                System.out.println("Terlalu takut");
            }

            if (engine.getExposure() < MIN_EXPOSURE_MALE) {
                sugestionResult += "Gambar kurang cerah" + "\n";
                System.out.println("Gambar kurang cerah");
            } else {
                sugestionResult += "Gambar terlalu cerah" + "\n";
                System.out.println("Gambar terlalu cerah");
            }

            if (engine.getNoise() > MIN_NOISE_MALE) {
                sugestionResult += "Gambar terlalu kotor" + "\n";
                System.out.println("Gambar terlalu kotor");
            }

        } else if (engine.getGender().equals("female")) {

            if (Math.abs(engine.getRoll()) < MIN_ROLL_FEMALE) {
                if (engine.getRoll() < 0) {
                    sugestionResult += "Kurang gideuk ke kiri" + "\n";
                    System.out.println("Kurang gideuk ke kiri");
                } else {
                    sugestionResult += "Kurang gideuk kanan" + "\n";
                    System.out.println("Kurang gideuk ke kanan");
                }
            } else if (Math.abs(engine.getRoll()) > MAX_ROLL_FEMALE) {
                if (engine.getRoll() < 0) {
                    sugestionResult += "Kurang gideuk ke kanan" + "\n";
                    System.out.println("Kurang gideuk ke kanan");
                } else {
                    sugestionResult += "Kurang gideuk ke kiri" + "\n";
                    System.out.println("Kurang gideuk ke kiri");
                }
            }
            if (Math.abs(engine.getPitch()) < MIN_PITCH_FEMALE) {
                System.out.println("27");
                if (engine.getPitch() < 0) {
                    sugestionResult += "Kurang tunduk" + "\n";
                    System.out.println("Kurang tunduk");
                } else {
                    sugestionResult += "Kurang tengadah" + "\n";
                    System.out.println("Kurang tengadah");
                }
            } else if (Math.abs(engine.getPitch()) > MAX_PITCH_FEMALE) {
                if (engine.getPitch() < 0) {
                    sugestionResult += "Kurang gideuk tengadah" + "\n";
                    System.out.println("Kurang tengadah");
                } else {
                    sugestionResult += "Kurang tunduk" + "\n";
                    System.out.println("Kurang tunduk");
                }
            }

            if (Math.abs(engine.getYaw()) < MIN_YAW_FEMALE) {
                if (engine.getYaw() < 0) {
                    sugestionResult += "Kurang noleh ke kiri" + "\n";
                    System.out.println("Kurang noleh ke kiri");
                } else {
                    sugestionResult += "Kurang noleh ke kanan" + "\n";
                    System.out.println("Kurang noleh ke kanan");
                }
            } else if (Math.abs(engine.getYaw()) > MAX_YAW_FEMALE) {
                if (engine.getYaw() < 0) {
                    sugestionResult += "Kurang noleh ke kanan" + "\n";
                    System.out.println("Kurang noleh ke kanan");
                } else {
                    sugestionResult += "Kurang noleh ke kiri" + "\n";
                    System.out.println("Kurang noleh ke kiri");
                }
            }

            if (engine.getSmile() < MIN_SMILE_FEMALE) {
                sugestionResult += "Kurang senyum" + "\n";
                System.out.println("Kurang senyum");
            } else {
                sugestionResult += "Terlalu senyum" + "\n";
                System.out.println("Terlalu senyum");
            }

            if (engine.getContempt() < MIN_CONTEMPT_FEMALE) {
                sugestionResult += "Kurang belagu" + "\n";
                System.out.println("kurang belagu");
            } else {
                sugestionResult += "Terlalu belagu" + "\n";
                System.out.println("Terlalu belagu");
            }

            if (engine.getSurprise() < MIN_SURPRISE_FEMALE) {
                sugestionResult += "Kurang heboh" + "\n";
                System.out.println("Kurang heboh");
            } else {
                sugestionResult += "Terlalu heboh" + "\n";
                System.out.println("Terlalu heboh");
            }

            if (engine.getNeutral() < MIN_NEUTRAL_FEMALE) {
                sugestionResult += "Kurang netral" + "\n";
                System.out.println("Kurang netral");
            } else {
                sugestionResult += "Terlalu netral" + "\n";
                System.out.println("Terlalu netral");
            }

            if (engine.getSadness() < MIN_SADNESS_FEMALE) {
                sugestionResult += "Kurang sedih" + "\n";
                System.out.println("Kurang sedih");
            } else {
                sugestionResult += "Terlalu sedih" + "\n";
                System.out.println("Terlalu sedih");
            }

            if (engine.getDisgust() < MIN_DISGUST_FEMALE) {
                sugestionResult += "Kurang jijik" + "\n";
                System.out.println("Kurang jijik");
            } else {
                sugestionResult += "Terlalu jijik" + "\n";
                System.out.println("Terlalu jijik");
            }

            if (engine.getAnger() < MIN_ANGER_FEMALE) {
                sugestionResult += "Kurang marah" + "\n";
                System.out.println("Kurang marah");
            } else {
                sugestionResult += "Terlalu marah" + "\n";
                System.out.println("Terlalu marah");
            }

            if (engine.getFear() < MIN_FEAR_FEMALE) {
                sugestionResult += "Kurang takut" + "\n";
                System.out.println("Kurang takut");
            } else {
                sugestionResult += "Terlalu takut" + "\n";
                System.out.println("Terlalu takut");
            }

            if (engine.getExposure() < MIN_EXPOSURE_FEMALE) {
                sugestionResult += "Gambar kurang cerah" + "\n";
                System.out.println("Gambar kurang cerah");
            } else {
                sugestionResult += "Gambar terlalu cerah" + "\n";
                System.out.println("Gambar terlalu cerah");
            }

            if (engine.getNoise() > MIN_NOISE_FEMALE) {
                sugestionResult += "Gambar terlalu kotor" + "\n";
                System.out.println("Gambar terlalu kotor");
            }
        }
    }

    public String getSugestionResult() {
        return this.sugestionResult;
    }
}
