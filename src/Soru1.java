import java.util.Arrays;

public class Soru1 {
    public static void main(String[] args) {
        String[] pist = new String[20];
        KontrolSinifi kontrol = new KontrolSinifi();
        int kaplumbagaSondurum = 0;
        int tavsanSonDurum = 0;


        do {
            int adim = (int) (Math.random() * 10 + 1);
            if (adim <= 2 && adim >= 1) {
                kaplumbagaSondurum += 3;
                tavsanSonDurum += 0;
                if (kaplumbagaSondurum > 20) {
                    kaplumbagaSondurum = 20;
                }
                if (tavsanSonDurum > 20) {
                    tavsanSonDurum = 20;
                }
                if (tavsanSonDurum <= 0) {
                    tavsanSonDurum = 1;
                }
                if (kaplumbagaSondurum <= 0) {
                    kaplumbagaSondurum = 1;
                }

                pist = kontrol.olustur();
                kontrol.kontrol(pist, kaplumbagaSondurum, tavsanSonDurum);
                kontrol.ekranaYaz(pist, kaplumbagaSondurum, tavsanSonDurum);

                System.out.println("Tavsan: " + tavsanSonDurum);
                System.out.println("Kaplumbaga: " + kaplumbagaSondurum);

                if (pist[19].equals("K")) {
                    return;
                } else if (pist[19].equals("T")) {
                    return;
                }


            } else if (adim <= 4 && adim >= 3) {
                kaplumbagaSondurum += 3;
                tavsanSonDurum += 9;
                if (kaplumbagaSondurum > 20) {
                    kaplumbagaSondurum = 20;
                }
                if (tavsanSonDurum > 20) {
                    tavsanSonDurum = 20;
                }
                if (tavsanSonDurum <= 0) {
                    tavsanSonDurum = 1;
                }
                if (kaplumbagaSondurum <= 0) {
                    kaplumbagaSondurum = 1;
                }
                pist = kontrol.olustur();
                kontrol.kontrol(pist, kaplumbagaSondurum, tavsanSonDurum);
                kontrol.ekranaYaz(pist, kaplumbagaSondurum, tavsanSonDurum);
                System.out.println("Tavsan: " + tavsanSonDurum);
                System.out.println("Kaplumbaga: " + kaplumbagaSondurum);

                if (pist[19].equals("K")) {
                    return;
                } else if (pist[19].equals("T")) {
                    return;
                }


            } else if (adim == 5) {

                kaplumbagaSondurum += 3;
                tavsanSonDurum -= 12;
                if (kaplumbagaSondurum > 20) {
                    kaplumbagaSondurum = 20;
                }
                if (tavsanSonDurum > 20) {
                    tavsanSonDurum = 20;
                }
                if (tavsanSonDurum <= 0) {
                    tavsanSonDurum = 1;
                }
                if (kaplumbagaSondurum <= 0) {
                    kaplumbagaSondurum = 1;
                }
                pist = kontrol.olustur();
                kontrol.kontrol(pist, kaplumbagaSondurum, tavsanSonDurum);
                kontrol.ekranaYaz(pist, kaplumbagaSondurum, tavsanSonDurum);
                System.out.println("Tavsan: " + tavsanSonDurum);
                System.out.println("Kaplumbaga: " + kaplumbagaSondurum);

                if (pist[19].equals("K")) {
                    return;
                } else if (pist[19].equals("T")) {
                    return;
                }


            } else if (adim <= 7 && adim >= 6) {

                kaplumbagaSondurum -= 6;
                tavsanSonDurum += 1;
                if (kaplumbagaSondurum > 20) {
                    kaplumbagaSondurum = 20;
                }
                if (tavsanSonDurum > 20) {
                    tavsanSonDurum = 20;
                }
                if (tavsanSonDurum <= 0) {
                    tavsanSonDurum = 1;
                }
                if (kaplumbagaSondurum <= 0) {
                    kaplumbagaSondurum = 1;
                }
                pist = kontrol.olustur();
                kontrol.kontrol(pist, kaplumbagaSondurum, tavsanSonDurum);
                kontrol.ekranaYaz(pist, kaplumbagaSondurum, tavsanSonDurum);
                System.out.println("Tavsan: " + tavsanSonDurum);
                System.out.println("Kaplumbaga: " + kaplumbagaSondurum);

                if (pist[19].equals("K")) {
                    return;
                } else if (pist[19].equals("T")) {
                    return;
                }


            } else if (adim == 8) {
                tavsanSonDurum += 1;
                kaplumbagaSondurum += 1;
                if (kaplumbagaSondurum > 20) {
                    kaplumbagaSondurum = 20;
                }
                if (tavsanSonDurum > 20) {
                    tavsanSonDurum = 20;
                }
                if (tavsanSonDurum <= 0) {
                    tavsanSonDurum = 1;
                }
                if (kaplumbagaSondurum <= 0) {
                    kaplumbagaSondurum = 1;
                }
                pist = kontrol.olustur();
                kontrol.kontrol(pist, kaplumbagaSondurum, tavsanSonDurum);
                kontrol.ekranaYaz(pist, kaplumbagaSondurum, tavsanSonDurum);
                System.out.println("Tavsan: " + tavsanSonDurum);
                System.out.println("Kaplumbaga: " + kaplumbagaSondurum);

                if (pist[19].equals("K")) {
                    return;
                } else if (pist[19].equals("T")) {
                    return;
                }
            } else if (adim >= 9 && adim <= 10) {
                kaplumbagaSondurum += 1;
                tavsanSonDurum -= 2;
                if (kaplumbagaSondurum > 20) {
                    kaplumbagaSondurum = 20;
                }
                if (tavsanSonDurum > 20) {
                    tavsanSonDurum = 20;
                }
                if (tavsanSonDurum <= 0) {
                    tavsanSonDurum = 1;
                }
                if (kaplumbagaSondurum <= 0) {
                    kaplumbagaSondurum = 1;
                }

                pist = kontrol.olustur();
                kontrol.kontrol(pist, kaplumbagaSondurum, tavsanSonDurum);
                kontrol.ekranaYaz(pist, kaplumbagaSondurum, tavsanSonDurum);
                System.out.println("Tavsan: " + tavsanSonDurum);
                System.out.println("Kaplumbaga: " + kaplumbagaSondurum);

                if (pist[19].equals("K")) {
                    return;
                } else if (pist[19].equals("T")) {
                    return;
                }

            }
        } while (kaplumbagaSondurum < 20 && tavsanSonDurum < 20);
    }
}

class PistOlusturVeEkranaYaz {
    public String[] olustur() {
        String[] pist = new String[20];
        Arrays.fill(pist, "_");
        return pist;
    }

    public void ekranaYaz(String[] pist, int kaplumbagaSondurum, int tavsanSonDurum) {
        for (String s : pist) {
            System.out.print(s + " ");
        }
        System.out.println("");
        if (kaplumbagaSondurum >= 20 && tavsanSonDurum < 20) {
            System.out.println("Kaplumbaga kazandi!!! OLEY!!!");
        } else if (tavsanSonDurum >= 20 && kaplumbagaSondurum < 20) {
            System.out.println("Tavsan kazandi.Yuh!!");

        } else if (kaplumbagaSondurum == 20 && tavsanSonDurum == 20) {
            System.out.println("Berabere");
        }

    }
}

class KontrolSinifi extends PistOlusturVeEkranaYaz {
    public void kontrol(String[] pist, int kaplumbagaSondurum, int tavsanSonDurum) {
        if (kaplumbagaSondurum == 20 && tavsanSonDurum > 0 && tavsanSonDurum < 20) {
            pist[19] = "K";
            pist[tavsanSonDurum - 1] = "T";

        } else if (tavsanSonDurum == 20 && kaplumbagaSondurum > 0 && kaplumbagaSondurum < 20) {
            pist[19] = "T";
            pist[kaplumbagaSondurum - 1] = "K";

        } else if (kaplumbagaSondurum == tavsanSonDurum && kaplumbagaSondurum == 20) {
            pist[tavsanSonDurum - 1] = "OUCH";

        } else if (kaplumbagaSondurum == tavsanSonDurum && kaplumbagaSondurum > 0 && kaplumbagaSondurum < 20) {
            pist[tavsanSonDurum - 1] = "OUCH";

        } else if (kaplumbagaSondurum > 0 && kaplumbagaSondurum < 20 && tavsanSonDurum > 0 && tavsanSonDurum < 20) {
            pist[kaplumbagaSondurum - 1] = "K";
            pist[tavsanSonDurum - 1] = "T";

        } else if (kaplumbagaSondurum <= 0 && tavsanSonDurum != kaplumbagaSondurum && tavsanSonDurum > 0 && tavsanSonDurum < 20) {
            pist[0] = "K";
            pist[tavsanSonDurum - 1] = "T";

        } else if (tavsanSonDurum <= 0 && kaplumbagaSondurum != tavsanSonDurum && kaplumbagaSondurum > 0 && kaplumbagaSondurum < 20) {
            pist[0] = "T";
            pist[kaplumbagaSondurum - 1] = "K";

        } else if (kaplumbagaSondurum > 20 && kaplumbagaSondurum != tavsanSonDurum && tavsanSonDurum > 0 && tavsanSonDurum < 20) {
            pist[19] = "K";
            pist[tavsanSonDurum - 1] = "T";


        } else if (tavsanSonDurum > 20 && kaplumbagaSondurum != tavsanSonDurum && kaplumbagaSondurum > 0 && kaplumbagaSondurum < 20) {
            pist[19] = "T";
            pist[kaplumbagaSondurum - 1] = "K";

        }
    }
}
