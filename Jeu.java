import java.util.Random;
import java.util.Scanner;

public class Jeu {

    private static boolean verifierVictoire(Victime[] victimes) {
        // S'il ne reste que des sorciers, on arrete le jeu
        // S'il ne reste que des GnomeJardin, on arrete le jeu
        // S'il ne reste que des NainsJardin, on arrete le jeu
        // S'il ne reste que des NainsJardin et des GnomeJardin, on arrete le jeu
        // S'il ne reste que des NainsJardin et des Sorciers, on arrete le jeu
        // S'il ne reste que des GnomeJardin et des Sorciers, on arrete le jeu
        // S'il ne reste que des NainsJardin, des GnomeJardin et des Sorciers, on arrete le jeu


        int nbSorcier = 0;
        int nbGnomeJardin = 0;
        int nbNainJardin = 0;
        int nbPersosVivants = 0;

        for (Victime v : victimes) {
            if (!v.etreMort()) {
                nbPersosVivants++;
                if (v instanceof Sorcier) {
                    nbSorcier++;
                }
                if (v instanceof GnomeJardin) {
                    nbGnomeJardin++;
                }
                if (v instanceof NainJardin) {
                    nbNainJardin++;
                }
            }
        }

        if (nbSorcier == nbPersosVivants) {
            return true;
        }
        if (nbGnomeJardin == nbPersosVivants) {
            return true;
        }
        if (nbNainJardin == nbPersosVivants) {
            return true;
        }

        if ( nbNainJardin + nbGnomeJardin + nbSorcier == nbPersosVivants) {
            return true;
        }
        if (nbNainJardin + nbGnomeJardin == nbPersosVivants) {
            return true;
        }
        if (nbNainJardin + nbSorcier == nbPersosVivants) {
            return true;
        }
        if (nbGnomeJardin + nbSorcier == nbPersosVivants) {
            return true;
        }



        return false;
    }

    private static boolean verifierMonstre(Victime[] victimes) {
        for (Victime v : victimes) {
            if (!v.etreMort() && v instanceof Monstre) {
                return true;
            }

        }
        return false;
    }

    private static boolean verifierMagicien(Victime[] victimes) {
        for (Victime v : victimes) {
            if (!v.etreMort() && v instanceof Magicien) {
                return true;
            }

        }
        return false;
    }

    private static boolean verifierSorcier(Victime[] victimes) {
        for (Victime v : victimes) {
            if (!v.etreMort() && v instanceof Sorcier) {
                return true;
            }

        }
        return false;
    }

    private static boolean verifierNain(Victime[] victimes) {
        for (Victime v : victimes) {
            if (!v.etreMort() && v instanceof NainJardin) {
                return true;
            }

        }
        return false;
    }

    private static boolean verifierGnome(Victime[] victimes) {
        for (Victime v : victimes) {
            if (!v.etreMort() && v instanceof GnomeJardin) {
                return true;
            }

        }
        return false;
    }

    private static boolean vverifierVictoire(Victime[] victimes) {
        // S'il ne reste que des sorciers, on arrete le jeu
        // S'il ne reste que des magiciens, on arrete le jeu
        // S'il ne reste que des Gnome de jardin, on arrete le jeu
        // S'il ne reste que des Nains de jardin, on arrete le jeu
        // S'il ne reste que des NainsJardin et des Gnome de jardin, on arrete le jeu
        // S'il ne reste que des NainsJardin et des Magiciens, on arrete le jeu
        // S'il ne reste que des NainsJardin et des Sorciers, on arrete le jeu
        // S'il ne reste que des GnomeJardin et des Magiciens, on arrete le jeu
        // S'il ne reste que des GnomeJardin et des Sorciers, on arrete le jeu
        // S'il ne reste que des Magiciens et des Sorciers, on arrete le jeu
        // S'il ne reste que des NainsJardin, des GnomeJardin et des Sorciers, on arrete le jeu
        // S'il ne reste que des NainsJardin, des GnomeJardin et des Magiciens, on arrete le jeu
        // S'il ne reste que des NainsJardin, des Magiciens et des Sorciers, on arrete le jeu
        // S'il ne reste que des GnomeJardin, des Magiciens et des Sorciers, on arrete le jeu
        // S'il ne reste que des NainsJardin, des GnomeJardin, des Magiciens et des Sorciers, on arrete le jeu

        int nbSorcier = 0;
        int nbMagicien = 0;
        int nbNainJardin = 0;
        int nbGnomeJardin = 0;
        int nbPersosVivants = 0;
        for (Victime v : victimes) {
            if (!v.etreMort()) {
                nbPersosVivants++;
                if (v instanceof Sorcier) {
                    nbSorcier++;
                } else if (v instanceof Magicien) {
                    nbMagicien++;
                } else if (v instanceof NainJardin) {
                    nbNainJardin++;
                } else if (v instanceof GnomeJardin) {
                    nbGnomeJardin++;
                }
            }

        }

        if (nbSorcier == nbPersosVivants) {
            return true;
        }
        if (nbMagicien == nbPersosVivants) {
            return true;
        }
        if (nbNainJardin == nbPersosVivants) {
            return true;
        }
        if (nbGnomeJardin == nbPersosVivants) {
            return true;
        }
        if (nbNainJardin == nbPersosVivants && nbGnomeJardin == nbPersosVivants) {
            return true;
        }
        if (nbNainJardin == nbPersosVivants && nbMagicien == nbPersosVivants) {
            return true;
        }
        if (nbNainJardin == nbPersosVivants && nbSorcier == nbPersosVivants) {
            return true;
        }
        if (nbGnomeJardin == nbPersosVivants && nbMagicien == nbPersosVivants) {
            return true;
        }
        if (nbGnomeJardin == nbPersosVivants && nbSorcier == nbPersosVivants) {
            return true;
        }
        if (nbMagicien == nbPersosVivants && nbSorcier == nbPersosVivants) {
            return true;
        }
        if (nbNainJardin == nbPersosVivants && nbGnomeJardin == nbPersosVivants && nbSorcier == nbPersosVivants) {
            return true;
        }
        if (nbNainJardin == nbPersosVivants && nbGnomeJardin == nbPersosVivants && nbMagicien == nbPersosVivants) {
            return true;
        }
        if (nbNainJardin == nbPersosVivants && nbMagicien == nbPersosVivants && nbSorcier == nbPersosVivants) {
            return true;
        }
        if (nbGnomeJardin == nbPersosVivants && nbMagicien == nbPersosVivants && nbSorcier == nbPersosVivants) {
            return true;
        }
        if (nbNainJardin == nbPersosVivants && nbGnomeJardin == nbPersosVivants && nbMagicien == nbPersosVivants && nbSorcier == nbPersosVivants) {
            return true;
        }

        if (nbMagicien + nbSorcier == nbPersosVivants) {
            return true;
        }
        if (nbNainJardin + nbGnomeJardin == nbPersosVivants) {
            return true;
        }
        if (nbNainJardin + nbMagicien == nbPersosVivants) {
            return true;
        }
        if (nbNainJardin + nbSorcier == nbPersosVivants) {
            return true;
        }
        if (nbGnomeJardin + nbMagicien == nbPersosVivants) {
            return true;
        }
        if (nbGnomeJardin + nbSorcier == nbPersosVivants) {
            return true;
        }
        if (nbNainJardin + nbGnomeJardin + nbMagicien == nbPersosVivants) {
            return true;
        }
        if (nbNainJardin + nbGnomeJardin + nbSorcier == nbPersosVivants) {
            return true;
        }
        if (nbNainJardin + nbMagicien + nbSorcier == nbPersosVivants) {
            return true;
        }
        if (nbGnomeJardin + nbMagicien + nbSorcier == nbPersosVivants) {
            return true;
        }
        if (nbNainJardin + nbGnomeJardin + nbMagicien + nbSorcier == nbPersosVivants) {
            return true;
        }

        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Victime[] v = new Victime[13];
        Random ran = new Random();
        int vict1 = 0;
        int vict2 = 0;
        boolean end = false;

        String[] noms = {"Voldemort", "Malfoy", "Crabbe", "Goyle", "McNaire", "Rocade", "Bellatrix", "Parkinson", "Harry", "Ron", "Hermione", "Dumbledore", "Rogue"};
        // Il y aura 5 monstres, 4 sorciers, 1 magicien, 2 nains et 1 gnome
        int i = 0;
        for (int j = 0; j < 5; j++) {
            v[i] = new Monstre(noms[i], ran.nextInt(100));
            i++;
        }
        for (int j = 0; j < 4; j++) {
            v[i] = new Sorcier(noms[i], ran.nextInt(100));
            i++;
        }
        v[i] = new Magicien(noms[i], ran.nextInt(100));
        i++;
        for (int j = 0; j < 2; j++) {
            v[i] = new NainJardin(ran.nextInt(50));
            i++;
        }
        v[i] = new GnomeJardin(ran.nextInt(50));
        i++;

        System.out.println("// INITIALISATION DU JEU \\\\");
        System.out.println("Les victimes sont :");
        for (Victime victime : v) {
            switch (victime.getClass().getSimpleName()) {
                case "Monstre":
                    System.out.println("Monstre " + victime.getNom());
                    break;
                case "Sorcier":
                    System.out.println("Sorcier " + victime.getNom());
                    break;
                case "Magicien":
                    System.out.println("Magicien " + victime.getNom());
                    break;
                case "NainJardin":
                    System.out.println("Nain de jardin");
                    break;
                case "GnomeJardin":
                    System.out.println("Gnome de jardin");
                    break;
            }
        }

        while (!end) {
            vict1 = ran.nextInt(v.length);
            vict2 = ran.nextInt(v.length);

            while (v[vict1].etreMort()) {
                vict1 = ran.nextInt(v.length);
            }
            while (v[vict2].etreMort() || vict1 == vict2) {
                vict2 = ran.nextInt(v.length);
            }

            if (verifierVictoire(v)) {
                end = true;
                if (verifierMonstre(v)) {
                    end = false;
                }
                if (verifierMagicien(v)) {
                    end = false;
                }
            } else {
                System.out.println("// ACTION DU JEU \\\\");
                System.out.println(v[vict1].toString());
                System.out.println(v[vict2].toString());
                System.out.println("Le " + v[vict1].getClass().getSimpleName() + " " + v[vict1].getNom() + " attaque le " + v[vict2].getClass().getSimpleName() + " " + v[vict2].getNom());
                v[vict1].attaque(v[vict2]);
                if (v[vict2].etreMort()) {
                    System.out.println("Le " + v[vict2].getClass().getSimpleName() + " " + v[vict2].getNom() + " est mort");
                } else {
                    System.out.println(v[vict2].toString());
                }
                if (v[vict1] instanceof Sorcier && v[vict2] instanceof Sorcier) {
                    System.out.println("Le charme contre un autre sorcier n'est pas tres efficace");
                } else if (v[vict1] instanceof Sorcier && v[vict2] instanceof Magicien) {
                    System.out.println("Le charme contre un magicien n'est pas tres efficace");
                }

                if (v[vict1] instanceof Magicien && v[vict2] instanceof Magicien) {
                    System.out.println("Le sortilège contre un autre magicien n'est pas tres efficace");
                } else if (v[vict1] instanceof Magicien && v[vict2] instanceof Sorcier) {
                    System.out.println("Le sortilège contre un sorcier n'est pas tres efficace");
                }

                // FIN DE L'ACTION DU JEU

                // VERIFICATION DE CONTINUITE DU JEU
                boolean ping = false;
                while (!ping) {
                    System.out.println("Voulez-vous continuer ? (O/N)");
                    String reponse = sc.nextLine();
                    if (reponse.equalsIgnoreCase("o")) {
                        ping = true;
                    } else if (reponse.equalsIgnoreCase("n")) {
                        end = true;
                        ping = true;
                    } else {
                        System.out.println("Veuillez entrer une réponse valide");
                    }
                }


            }


        }

        System.out.println("// FIN DU JEU \\\\");
        System.out.println("Les survivants sont :");
        for (Victime victime : v) {
            if (!victime.etreMort()) {
                switch (victime.getClass().getSimpleName()) {
                    case "Monstre":
                        Monstre m = (Monstre) victime;
                        System.out.println("Monstre " + m.getNom() + " avec " + m.getVie() + " points de vie");
                        break;
                    case "Sorcier":
                        Sorcier s = (Sorcier) victime;
                        System.out.println("Sorcier " + s.getNom() + " avec " + s.getVie() + " points de vie");
                        break;
                    case "Magicien":
                        Magicien ma = (Magicien) victime;
                        System.out.println("Magicien " + ma.getNom() + " avec " + ma.getVie() + " points de vie");
                        break;
                    case "NainJardin":
                        NainJardin n = (NainJardin) victime;
                        System.out.println("Nain de jardin avec " + n.getSolidite() + " points de solidité");
                        break;
                    case "GnomeJardin":
                        GnomeJardin g = (GnomeJardin) victime;
                        System.out.println("Gnome de jardin avec " + g.getSolidite() + " points de solidité");
                        break;
                }
            }
        }

sc.close();
    }
}
