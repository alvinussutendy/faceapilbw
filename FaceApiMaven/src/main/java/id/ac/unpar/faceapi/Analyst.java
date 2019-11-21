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
            if (engine.getRoll() < MIN_ROLL_MALE || engine.getRoll() > MAX_ROLL_MALE) {
                if (engine.getRoll() < MIN_ROLL_MALE) {
                    System.out.println("1");
                } else {
                    System.out.println("2");
                }
            }
            if (engine.getPitch() < MIN_PITCH_MALE || engine.getPitch() > MAX_PITCH_MALE) {
                if (engine.getPitch() < MIN_PITCH_MALE) {
                    System.out.println("3");
                } else {
                    System.out.println("4");
                }
            }
            if (engine.getYaw() < MIN_YAW_MALE || engine.getYaw() > MAX_YAW_MALE) {
                if (engine.getYaw() < MIN_YAW_MALE) {
                    System.out.println("5");
                } else {
                    System.out.println("6");
                }
            }
            if (engine.getSmile() < MIN_SMILE_MALE || engine.getSmile() > MAX_SMILE_MALE) {
                if (engine.getSmile() < MIN_SMILE_MALE) {
                    System.out.println("7");
                } else {
                    System.out.println("8");
                }
            }
            if (engine.getContempt() < MIN_CONTEMPT_MALE || engine.getContempt() > MAX_CONTEMPT_MALE) {
                if (engine.getContempt() < MIN_CONTEMPT_MALE) {
                    System.out.println("9");
                } else {
                    System.out.println("10");
                }
            }
            if (engine.getSurprise() < MIN_SURPRISE_MALE || engine.getSurprise() > MAX_SURPRISE_MALE) {
                if (engine.getSurprise() < MIN_SURPRISE_MALE) {
                    System.out.println("11");
                } else {
                    System.out.println("12");
                }
            }
            if (engine.getNeutral() < MIN_NEUTRAL_MALE || engine.getNeutral() > MAX_NEUTRAL_MALE) {
                if (engine.getNeutral() < MIN_NEUTRAL_MALE) {
                    System.out.println("13");
                } else {
                    System.out.println("14");
                }
            }
            if (engine.getSadness() < MIN_SADNESS_MALE || engine.getSadness() > MAX_SADNESS_MALE) {
                if (engine.getSadness() < MIN_SADNESS_MALE) {
                    System.out.println("15");
                } else {
                    System.out.println("16");
                }
            }
            if (engine.getDisgust() < MIN_DISGUST_MALE || engine.getDisgust() > MAX_DISGUST_MALE) {
                if (engine.getDisgust() < MIN_DISGUST_MALE) {
                    System.out.println("17");
                } else {
                    System.out.println("18");
                }
            }
            if (engine.getAnger() < MIN_ANGER_MALE || engine.getAnger() > MAX_ANGER_MALE) {
                if (engine.getAnger() < MIN_ANGER_MALE) {
                    System.out.println("19");
                } else {
                    System.out.println("20");
                }
            }
            if (engine.getFear() < MIN_FEAR_MALE || engine.getFear() > MAX_FEAR_MALE) {
                if (engine.getFear() < MIN_FEAR_MALE) {
                    System.out.println("21");
                } else {
                    System.out.println("22");
                }
            }
            if (engine.getExposure() < MIN_EXPOSURE_MALE || engine.getExposure() > MAX_EXPOSURE_MALE) {
                if (engine.getExposure() < MIN_EXPOSURE_MALE) {
                    System.out.println("23");
                } else {
                    System.out.println("24");
                }
            }
            if (engine.getNoise() < MIN_NOISE_MALE || engine.getNoise() > MAX_NOISE_MALE) {
                if (engine.getNoise() < MIN_NOISE_MALE) {
                    System.out.println("25");
                } else {
                    System.out.println("26");
                }
            }
        } else if (engine.getGender().equals("female")) {

            if (Math.abs(engine.getRoll()) < MIN_ROLL_FEMALE) {
                if (engine.getRoll() < 0) {
                    System.out.println("Kurang tunduk");
                } else {
                    System.out.println("Kurang tanggah");
                }
            } else if (Math.abs(engine.getRoll()) > MAX_ROLL_FEMALE) {
                if (engine.getRoll() < 0) {
                    System.out.println("Kurang tanggah");
                } else {
                    System.out.println("Kurang tunduk");
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
                    System.out.println("Kurang tunduk");
                } else {
                    System.out.println("Kurang tanggah");
                }
            }

            if (Math.abs(engine.getYaw()) < MIN_YAW_FEMALE) {
                if (engine.getYaw() < 0) {
                    System.out.println("31A");
                } else {
                    System.out.println("32B");
                }
            } else if (Math.abs(engine.getYaw()) > MAX_YAW_FEMALE) {
                if (engine.getYaw() < 0) {
                    System.out.println("31C");
                } else {
                    System.out.println("32D");
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
                System.out.println("Kurang noise");
            } else if (engine.getNoise() > MAX_NOISE_FEMALE) {
                System.out.println("Terlalu banyak noise");
            }
        }
    }
}
