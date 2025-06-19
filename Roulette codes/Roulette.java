import java.util.Scanner;
import java.util.Random;

public class Roulette {
    static int randNumber;
    static boolean singleNumber = false;
    static int money = 1000;
    static int iii = 0;
    static String userInputMain;
    static Scanner userInputScanner = new Scanner(System.in);
    static String userInput;
    static int highscore;


    public static final String RESET = "\033[0m";
    public static final String BOLD = "\033[1m";
    public static final String UNDERLINE = "\033[4m";
    public static final String REVERSED = "\033[7m";

    //Farbwerte für hintergrund und text
    public static final String BLACK = "\033[0;30m";
    public static final String RED = "\033[0;31m";
    public static final String GREEN = "\033[0;32m";
    public static final String YELLOW = "\033[0;33m";
    public static final String BLUE = "\033[0;34m";
    public static final String PURPLE = "\033[0;35m";
    public static final String CYAN = "\033[0;36m";
    public static final String WHITE = "\033[0;37m";

    public static final String BLACK_BACKGROUND = "\033[40m";
    public static final String RED_BACKGROUND = "\033[41m";
    public static final String GREEN_BACKGROUND = "\033[42m";
    public static final String YELLOW_BACKGROUND = "\033[43m";
    public static final String BLUE_BACKGROUND = "\033[44m";
    public static final String PURPLE_BACKGROUND = "\033[45m";
    public static final String CYAN_BACKGROUND = "\033[46m";
    public static final String WHITE_BACKGROUND = "\033[47m";

    public static void start() {
        System.out.println("/--------------------------\\");
        System.out.println("|Lets Gamble!(Schreib 'go')| ");
        System.out.println("|--------------------------|");
        System.out.println("|Anleitug (Schreib 'info' )| ");
        System.out.println("\\--------------------------/ ");
        String startInput = userInputScanner.nextLine();
        if (startInput.equals("go")) {
            // main methode ausführen
        } else if (startInput.equals("info")) {
            info();            
        } 
        else {
            exit();
        }
    }

    public static int generateRandom() {
        Random rand = new Random();
        return rand.nextInt(37);
    }

    public static void pauseMethod() {
        try {
            Thread.sleep(25);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void pauseMethod2() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void info() {
        System.out.println();
        System.out.println("    Regeln: ");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Das Spiel ist relativ simpel. Du sezt auf einen der Felder. Danach wird die Zahl zufällig auf das Rad angezeigt. Falls deine Zahl der Ausgewählte Eigenschaft entspricht- Gewinnst du einen Geldbetrag, falls du verlierst, verlierst du dein gesetztes geld");
        System.out.println("Die Optionen im Überblick: \n ");
        System.out.println("Rot oder Schwarz: Mann wettet auf die Farbe der erhaltenen Zahl. Die Null ist Grün, heisst, falls diese kommt,\nwährend man auf Rot oder Schwarz wettet, verliert man. Das gewettete Geld wird bei Gewinn verdoppelt \n" );
        System.out.println("Gerade oder Ungerade: Mann wettet ob die Zahl gerade oder ungerade ist.Falls man gewinnt, erhält man das Doppelte des gewetteten Geldes.\n");
        System.out.println("1-18 und 19-36: Man wettet darauf, ob die Zahl in den ersten 18 oder in den letzten 18 leigt. gewinnt man, erhält man das Doppelte des eingegebenen Geldes \n" );
        System.out.println("Reihe 1, 2 und 3: Wettet, ob die Zahl sich in den markierten Reihen befindet. Null gehört in keiner Reihe. Gewinnt man, so erhält man das Dreifache des gewetteten Betrages. \n " );
        System.out.println("Erste (1 bis 12 ), Zweite (13 bis 24) und Dritte 12 (25 bis 36), Falls deine Zahl auf der Richtigen Reihe landet, erhält man das Dreifche des gewetteten Betrages \n");
        System.out.println("Mann kann auch auf einer Zahl auf den Board Wetten, erhält man die Zahl auf die man gewettet hat, so erhält man das 36 fache des Gewetteten Betrages! \n");
        System.out.println("Viel Spass und setzen sie das Geld weise ein! \n");
    }

    public static String userInput() {
        System.out.println("-------------------------|" + GREEN_BACKGROUND + " 0 " + RESET + "|----------------------------");
        System.out.println("|" + RED_BACKGROUND + " 3 " + RESET + "|" + BLACK_BACKGROUND + " 6 " + RESET + "|"+ RED_BACKGROUND + " 9 " + RESET + "|" + RED_BACKGROUND + " 12 " + RESET + "|" + BLACK_BACKGROUND+ " 15 " + RESET + "|" + RED_BACKGROUND + " 18 " + RESET + "|" + RED_BACKGROUND + " 21 " + RESET + "|"+ BLACK_BACKGROUND + " 24 " + RESET + "|" + RED_BACKGROUND + " 27 " + RESET + "|" + RED_BACKGROUND+ " 30 " + RESET + "|" + BLACK_BACKGROUND + " 33 " + RESET + "|" + RED_BACKGROUND + " 36 " + RESET+ "| <- Reihe 3");
        System.out.println("|" + BLACK_BACKGROUND + " 2 " + RESET + "|" + RED_BACKGROUND + " 5 " + RESET + "|"+ BLACK_BACKGROUND + " 8 " + RESET + "|" + BLACK_BACKGROUND + " 11 " + RESET + "|" + RED_BACKGROUND+ " 14 " + RESET + "|" + BLACK_BACKGROUND + " 17 " + RESET + "|" + BLACK_BACKGROUND + " 20 " + RESET+ "|" + RED_BACKGROUND + " 23 " + RESET + "|" + BLACK_BACKGROUND + " 26 " + RESET + "|"+ BLACK_BACKGROUND + " 29 " + RESET + "|" + RED_BACKGROUND + " 32 " + RESET + "|" + BLACK_BACKGROUND+ " 35 " + RESET + "| <- Reihe 2");
        System.out.println("|" + RED_BACKGROUND + " 1 " + RESET + "|" + BLACK_BACKGROUND + " 4 " + RESET + "|"+ RED_BACKGROUND + " 7 " + RESET + "|" + BLACK_BACKGROUND + " 10 " + RESET + "|" + BLACK_BACKGROUND+ " 13 " + RESET + "|" + RED_BACKGROUND + " 16 " + RESET + "|" + RED_BACKGROUND + " 19 " + RESET + "|"+ BLACK_BACKGROUND + " 22 " + RESET + "|" + RED_BACKGROUND + " 25 " + RESET + "|" + BLACK_BACKGROUND+ " 28 " + RESET + "|" + BLACK_BACKGROUND + " 31 " + RESET + "|" + RED_BACKGROUND + " 34 " + RESET+ "| <- Reihe 1");
        System.out.println("----------------------------------------------------------");
        System.out.println("|    Erste 12    |     Zweite 12     |     Dritte 12     |");
        System.out.println("----------------------------------------------------------");
        System.out.println("| 1-18  | Gerade |" + RED_BACKGROUND + "   Rot   " + RESET + "|" + BLACK_BACKGROUND+ " Schwarz " + RESET + "|Ungerade|  19-36   |");
        System.out.println("----------------------------------------------------------");
        System.out.println("|                   Belibige Zahl ('z')                  |");
        System.out.println("----------------------------------------------------------");
        System.out.println("Auf was wollen sie wetten? ");
        userInput = userInputScanner.nextLine();
        if (userInput.contentEquals("z")) {
            System.out.println("Welche Zahl genau? ");
            userInput = userInputScanner.nextLine();
                if (Integer.valueOf(userInput) > 36) {
                    System.out.println("Invalid Input");
                    pauseMethod2();
                    userInput();
                } 
        }
        System.out.println("Sie haben " + YELLOW + money + "CHF" + RESET);
        return userInput;
    }

    public static int wettMenge() {
        System.out.println("Wie viel wollen sie auf " + userInput + " setzten?");
        String preWettMenge = userInputScanner.nextLine();
        int wettMenge = Integer.valueOf(preWettMenge);
        if (wettMenge - money == -1) {
            System.out.println("Invalid Input");
            pauseMethod2();
            wettMenge();
        }
        return wettMenge;
    }

    public static void exit() {
        System.out.println("/------------------------------------------------------------\\");
        System.out.println("|Geben sie an ob sie weiter spielen wollen: ('j'/'n')|");
        System.out.println("\\-----------------------------------------------------------/");
        String exitInput = userInputScanner.nextLine();
        if (exitInput.contains("j")) {
            main(null);}
        else if (exitInput.contains("n")) {
            System.exit(0);
        }
    }

    public static void score() {
        int score = money;
        iii = (iii + 1);
        if (score > highscore) {
            highscore = score;
        }               
        System.out.println("Deine Score ist: " + score + " Ihre Highscore ist: " + highscore);
    }

    public static void animation() {
        int i = 0;
        String texture1 = "   ";                    
        String texture2 = "" + WHITE_BACKGROUND + " o " + RESET + "";
        while (i <= (randNumber + 111)) {
            String aa;String ab;String ac;String ad;String ae;String af;String ag;String ah;String ai;String aj;String ak;
            String al;String am;String an;String ao;String ap;String aq;String ar;String as;String at;String au;String av;
            String aw;String ax;String ay;String az;String ba;String bb;String bc;String bd;String be;String bf;String bg;
            String bh;String bi;String bj;String bk;
            if (i == 0 || i == 37 || i == 74 || i == 111) {aa = texture2;} else {aa = texture1;}
            if (i == 1 || i == 38 || i == 75 || i == 112) {ab = texture2;} else {ab = texture1;}
            if (i == 2 || i == 39 || i == 76 || i == 113) {ac = texture2;} else {ac = texture1;}
            if (i == 3 || i == 40 || i == 77 || i == 114) {ad = texture2;} else {ad = texture1;}
            if (i == 4 || i == 41 || i == 78 || i == 115) {ae = texture2;} else {ae = texture1;}
            if (i == 5 || i == 42 || i == 79 || i == 116) {af = texture2;} else {af = texture1;}
            if (i == 6 || i == 43 || i == 80 || i == 117) {ag = texture2;} else {ag = texture1;}
            if (i == 7 || i == 44 || i == 81 || i == 118) {ah = texture2;} else {ah = texture1;}
            if (i == 8 || i == 45 || i == 82 || i == 119) {ai = texture2;} else {ai = texture1;}
            if (i == 9 || i == 46 || i == 83 || i == 120) {aj = texture2;} else {aj = texture1;}
            if (i == 10 || i == 47 || i == 84 || i == 121) {ak = texture2;} else {ak = texture1;}
            if (i == 11 || i == 48 || i == 85 || i == 122) {al = texture2;} else {al = texture1;}
            if (i == 12 || i == 49 || i == 86 || i == 123) {am = texture2;} else {am = texture1;}
            if (i == 13 || i == 50 || i == 87 || i == 124) {an = texture2;} else {an = texture1;}
            if (i == 14 || i == 51 || i == 88 || i == 125) {ao = texture2;} else {ao = texture1;}
            if (i == 15 || i == 52 || i == 89 || i == 126) {ap = texture2;} else {ap = texture1;}
            if (i == 16 || i == 53 || i == 90 || i == 127) {aq = texture2;} else {aq = texture1;}
            if (i == 17 || i == 54 || i == 91 || i == 128) {ar = texture2;} else {ar = texture1;}
            if (i == 18 || i == 55 || i == 92 || i == 129) {as = texture2;} else {as = texture1;}
            if (i == 19 || i == 56 || i == 93 || i == 130) {at = texture2;} else {at = texture1;}
            if (i == 20 || i == 57 || i == 94 || i == 131) {au = texture2;} else {au = texture1;}
            if (i == 21 || i == 58 || i == 95 || i == 132) {av = texture2;} else {av = texture1;}
            if (i == 22 || i == 59 || i == 96 || i == 133) {aw = texture2;} else {aw = texture1;}
            if (i == 23 || i == 60 || i == 97 || i == 134) {ax = texture2;} else {ax = texture1;}                     
            if (i == 24 || i == 61 || i == 98 || i == 135) {ay = texture2;} else {ay = texture1;}
            if (i == 25 || i == 62 || i == 99 || i == 136) {az = texture2;} else {az = texture1;}
            if (i == 26 || i == 63 || i == 100 || i == 137) {ba = texture2;} else {ba = texture1;}
            if (i == 27 || i == 64 || i == 101 || i == 138) {bb = texture2;} else {bb = texture1;}
            if (i == 28 || i == 65 || i == 102 || i == 139) {bc = texture2;} else {bc = texture1;}
            if (i == 29 || i == 66 || i == 103 || i == 140) {bd = texture2;} else {bd = texture1;}
            if (i == 30 || i == 67 || i == 104 || i == 141) {be = texture2;} else {be = texture1;}
            if (i == 31 || i == 68 || i == 105 || i == 142) {bf = texture2;} else {bf = texture1;}
            if (i == 32 || i == 69 || i == 106 || i == 143) {bg = texture2;} else {bg = texture1;}
            if (i == 33 || i == 70 || i == 107 || i == 144) {bh = texture2;} else {bh = texture1;}
            if (i == 34 || i == 71 || i == 108 || i == 145) {bi = texture2;} else {bi = texture1;}
            if (i == 35 || i == 72 || i == 109 || i == 146) {bj = texture2;} else {bj = texture1;}
            if (i == 36 || i == 73 || i == 110 || i == 147) {bk = texture2;} else {bk = texture1;}
            System.out.println("                                 ________________________________                       ");
            System.out.println("                               /      " + bk + "" + RED_BACKGROUND + " 36 " + RESET+ "    " + GREEN_BACKGROUND + " 0 " + RESET + "" + aa + "  " + RED_BACKGROUND + " 1 " + RESET + ""+ ab + "   \\                      ");// 2
            System.out.println("                            / " + bj + "" + BLACK_BACKGROUND + " 35 " + RESET+ "                           " + BLACK_BACKGROUND + " 2 " + RESET + "" + ac+ " \\                    ");// 3
            System.out.println("                        /  " + bi + "" + RED_BACKGROUND + " 34 " + RESET+ "                                 " + RED_BACKGROUND + " 3 " + RESET + "" + ad+ "  \\                  ");// 4
            System.out.println("                    /   " + bh + "" + BLACK_BACKGROUND + " 33 " + RESET+ "                                       " + BLACK_BACKGROUND + " 4 " + RESET + "" + ae+ "  \\               ");// 5
            System.out.println("                   /   " + bg + "" + RED_BACKGROUND + " 32 " + RESET+ "                                         " + RED_BACKGROUND + " 5 " + RESET + "" + af+ "   \\             ");// 6
            System.out.println("                /   " + bf + "" + BLACK_BACKGROUND + " 31 " + RESET+ "                                              " + BLACK_BACKGROUND + " 6 " + RESET + "" + ag+ "  \\            ");// 7
            System.out.println("               /  " + be + "" + RED_BACKGROUND + " 30 " + RESET+ "                                                 " + RED_BACKGROUND + " 7 " + RESET + "" + ah+ "  \\           ");// 8
            System.out.println("              /  " + bd + "" + BLACK_BACKGROUND + " 29 " + RESET+ "                                                   " + BLACK_BACKGROUND + " 8 " + RESET + "" + ai+ "  \\          ");// 9
            System.out.println("              |  " + bc + "" + BLACK_BACKGROUND + " 28 " + RESET+ "                                                   " + RED_BACKGROUND + " 9 " + RESET + "" + aj+ "  |           ");// 10
            System.out.println("              \\  " + bb + "" + RED_BACKGROUND + " 27 " + RESET+ "                                                  " + BLACK_BACKGROUND + " 10 " + RESET + "" + ak+ " /           ");// 11
            System.out.println("               \\  " + ba + "" + BLACK_BACKGROUND + " 26 " + RESET+ "                                                " + BLACK_BACKGROUND + " 11 " + RESET + "" + al+ " /            ");// 12
            System.out.println("                \\  " + az + "" + RED_BACKGROUND + " 25 " + RESET+ "                                              " + RED_BACKGROUND + " 12 " + RESET + "" + am+ " /             ");// 13
            System.out.println("                  \\  " + ay + "" + BLACK_BACKGROUND + " 24 " + RESET+ "                                          " + BLACK_BACKGROUND + " 13 " + RESET + "" + an+ " /               ");// 14
            System.out.println("                   \\  " + ax + "" + RED_BACKGROUND + " 23 " + RESET+ "                                        " + RED_BACKGROUND + " 14 " + RESET + "" + ao+ " /                ");// 15
            System.out.println("                      \\  " + aw + "" + BLACK_BACKGROUND + " 22 " + RESET+ "                                  " + BLACK_BACKGROUND + " 15 " + RESET + "" + ap+ "  /                  ");// 16
            System.out.println("                          \\ " + av + "" + RED_BACKGROUND + " 21 " + RESET+ "                            " + RED_BACKGROUND + " 16 " + RESET + "" + aq+ "  /                     ");// 17
            System.out.println("                             \\  " + au + "" + BLACK_BACKGROUND + " 20 " + RESET+ "                     " + BLACK_BACKGROUND + " 17 " + RESET + "" + ar+ " /                         ");// 18
            System.out.println("                                    \\   " + at + "" + RED_BACKGROUND + " 19 " + RESET+ "     " + RED_BACKGROUND + " 18 " + RESET + "" + as + "       /                           ");// 19
            System.out.println("                                     -----------------------------                             ");// 20
            i++;
            pauseMethod();
            
        }
    }

    public static void clearScreen(){

        final String ANSI_HOME = "\u001b[H";
        System.out.print(ANSI_HOME);
        System.out.flush();
    }

    public static void main(String[] args) {
        if (iii == 0) {
            start();
        } else {
        }
        int multiplyer = 0;
        String userInputMain = userInput();
        int wettMenge = wettMenge();
        if (money - wettMenge <= -1) {
            System.out.println("Du hast nicht genug Geld");
            wettMenge();
        }

        money = (money - wettMenge);
        randNumber = generateRandom();
        animation();
        pauseMethod2();
        System.out.println("Der Zahl war: " + randNumber);
        int[] redNumbers = { 1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36 };
        int[] blackNumbers = { 2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35 };
        int[] oddNumbers = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35 };
        int[] evenNumbers = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36 };
        int[] firstTwelve = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        int[] secondTwelve = { 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24 };
        int[] thirdTwelve = { 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36 };
        int[] firstColumn = { 1, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34 };
        int[] secondColumn = { 2, 5, 8, 11, 14, 17, 20, 23, 26, 29, 32, 35 };
        int[] thridColumn = { 3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36 };


        if (userInputMain.contentEquals("Rot")) {
            boolean redNumbersFound = false;
            for (int i : redNumbers) {
                if (i == randNumber) {
                    redNumbersFound = true;
                    break;}}
            if (redNumbersFound == true) {
                multiplyer = (multiplyer + 1);
                money = money + (wettMenge * multiplyer);
                System.out.println("Du hast + " + (wettMenge * multiplyer) + GREEN + " gewonnen" + RESET + " \\^o^/");}
            else {
                System.out.println("Du hast deine Wette " + RED + "verloren" + RESET + " :/ ");
                multiplyer = (multiplyer + 0);}}

        if (userInputMain.contentEquals("Schwarz")) {
            boolean blackNumbersFound = false;
            for (int i : blackNumbers) {
                if (i == randNumber) {
                    blackNumbersFound = true;
                    break;}}
            if (blackNumbersFound == true) {
                multiplyer = (multiplyer + 1);
                money = money + (wettMenge * multiplyer);
                System.out.println("Du hast + " + (wettMenge * multiplyer) + GREEN + " gewonnen" + RESET + " \\^o^/");} 
            else {
                System.out.println("Du hast deine Wette " + RED + "verloren" + RESET + " :/ ");
                multiplyer = (multiplyer + 0);}}

        if (userInputMain.contentEquals("Ungerade")) {
            boolean oddNumbersFound = false;
            for (int i : oddNumbers) {
                if (i == randNumber) {
                    oddNumbersFound = true;
                    break;}}
            if (oddNumbersFound == true) {
                multiplyer = (multiplyer + 1);
                money = money + (wettMenge * multiplyer);
                System.out.println("Du hast + " + (wettMenge * multiplyer) + GREEN + " gewonnen" + RESET + " \\^o^/");}
            else {
                System.out.println("Du hast deine Wette " + RED + "verloren" + RESET + " :/ ");
                multiplyer = (multiplyer + 0);}}

        if (userInputMain.contentEquals("Gerade")) {
            boolean evenNumbersFound = false;
            for (int i : evenNumbers) {
                if (i == randNumber) {
                    evenNumbersFound = true;
                    break;}}

            if (evenNumbersFound == true) {
                multiplyer = (multiplyer + 1);
                money = money + (wettMenge * multiplyer);
                System.out.println("Du hast + " + (wettMenge * multiplyer) + GREEN + " gewonnen" + RESET + " \\^o^/");}
            else {
                System.out.println("Du hast deine Wette " + RED + "verloren" + RESET + " :/ ");
                multiplyer = (multiplyer + 0);}}

        if (userInputMain.contentEquals("Erste 12")) {
            boolean firstTwelveFound = false;
            for (int i : firstTwelve) {
                if (i == randNumber) {
                    firstTwelveFound = true;
                    break;}}

            if (firstTwelveFound == true) {
                multiplyer = (multiplyer + 2);
                money = money + (wettMenge * multiplyer);
                System.out.println("Du hast +" + (wettMenge * multiplyer) + GREEN + " gewonnen" + RESET + " \\^o^/");}
            else {
                System.out.println("Du hast deine Wette " + RED + "verloren" + RESET + " :/ ");
                multiplyer = (multiplyer + 0);}}

        if (userInputMain.contentEquals("Zweite 12")) {
            boolean secondTwelveFound = false;
            for (int i : secondTwelve) {
                if (i == randNumber) {
                    secondTwelveFound = true;
                    break;}}

            if (secondTwelveFound == true) {
                multiplyer = (multiplyer + 2);
                money = money + (wettMenge * multiplyer);
                System.out.println("Du hast +" + (wettMenge * multiplyer) + GREEN + " gewonnen" + RESET + " \\^o^/");}
            else {
                System.out.println("Du hast deine Wette" + RED + "verloren" + RESET + " :/ ");
                multiplyer = (multiplyer + 0);}}

        if (userInputMain.contentEquals("Dritte 12")) {
            boolean thirdTwelveFound = false;
            for (int i : thirdTwelve) {
                if (i == randNumber) {
                    thirdTwelveFound = true;
                    break;}}

            if (thirdTwelveFound == true) {
                multiplyer = (multiplyer + 2);
                money = money + (wettMenge * multiplyer);
                System.out.println("Du hast + " + (wettMenge * multiplyer) + GREEN + " gewonnen" + RESET + " \\^o^/");}
            else {
                System.out.println("Du hast deine Wette " + RED + "verloren" + RESET + " :/ ");
                multiplyer = (multiplyer + 0);}}

        if (userInputMain.contentEquals("Reihe 1")) {
            boolean firstColumnFound = false;
            for (int i : firstColumn) {
                if (i == randNumber) {
                    firstColumnFound = true;
                    break;}}

            if (firstColumnFound == true) {
                multiplyer = (multiplyer + 2);
                money = money + (wettMenge * multiplyer);
                System.out.println("Du hast + " + (wettMenge * multiplyer) + GREEN + " gewonnen" + RESET + " \\^o^/");}
            else {
                System.out.println("Du hast deine Wette " + RED + "verloren" + RESET + " :/ ");
                multiplyer = (multiplyer + 0);}}

        if (userInputMain.contentEquals("Reihe 2")) {
            boolean secondColumnFound = false;
            for (int i : secondColumn) {
                if (i == randNumber) {
                    secondColumnFound = true;
                    break;}}

            if (secondColumnFound == true) {
                multiplyer = (multiplyer + 2);
                money = money + (wettMenge * multiplyer);
                System.out.println("Du hast + " + (wettMenge * multiplyer) + GREEN + " gewonnen" + RESET + " \\^o^/");}
            else {
                System.out.println("Du hast deine Wette " + RED + "verloren" + RESET + " :/ ");
                multiplyer = (multiplyer + 0);}}

        if (userInputMain.contentEquals("Reihe 3")) {
            boolean thridColumnFound = false;
            for (int i : thridColumn) {
                if (i == randNumber) {
                    thridColumnFound = true;
                    break;}}
            if (thridColumnFound == true) {
                multiplyer = (multiplyer + 2);
                money = money + (wettMenge * multiplyer);
                System.out.println("Du hast + " + (wettMenge * multiplyer) + GREEN + " gewonnen" + RESET + " \\^o^/");}
            else {
                System.out.println("Du hast deine Wette " + RED + "verloren" + RESET + " :/ ");
                multiplyer = (multiplyer + 0);}}

        try{
        if ((Integer.valueOf(userInputMain) == (randNumber))) { 
            singleNumber = true;   
            if (singleNumber == true) {
            multiplyer = (multiplyer + 36);
            System.out.println("Du hast + " + (wettMenge * multiplyer) + GREEN + " gewonnen" + RESET + " \\^o^/");}} 
            else{
                System.out.println("Du hast deine Wette " + RED + "verloren" + RESET + " :/ ");
                multiplyer = (multiplyer + 0);}} 
        catch(Exception e){}

        wettMenge = (wettMenge * multiplyer);
        money = (money + wettMenge);
        score();
        if (money == 0) {
            System.out.println("Du hast 0 CHF, du hast"+RED+ " verloren"+RESET);
            pauseMethod2();
        }
        exit();
        userInputScanner.close();
    }
}