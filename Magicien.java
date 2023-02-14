class Magicien extends Sorcier implements SuperPouvoir {

    Magicien(String n, int pv) {
        super(n, pv);
    }


    /**
     * methode retournant l'attribut pouvoir
     *
     * @return pouvoir * le superPouvoir du magicien
     */
    @Override
    public double getPouvoir() {
        return super.getPouvoir() * SuperPouvoir.EXTRA;
    }

    /**
     * methode pour lancer un sort
     *
     * @return le pouvoir du magicien * un bonus (nombre aleatoire entre 0 et 1)
     */
    public double lancerSort() {
        return Math.random() * getPouvoir();
    }


    /**
     * methode d'attaque :
     * Si le magicien est mort, il ne fait rien.
     * Sinon, il charme l�autre personnage avec une force egale  a la moitie de ses points de vie
     *
     * @param p le personnage adverse
     */
    public void attaque(Victime v) {
        if (!etreMort())
            addVie(v.subitCharme((int) (getVie() * getPouvoir() / 2)));
    }

    /**
     * methode executee par un magicien lorsqu'il est charme
     * son super-pouvoir le protege du charme et il inflige
     * un sort et une valeur bonus
     *
     * @param coup la force du charme
     * @return Math.random()*sort()
     */
    public int subitCharme(int coup) {
        return (int) (Math.random() * lancerSort());
    }

    public String toString() {
        return this.etreMort() ? "Magicien " + this.getNom() + " est mort" : "Je m'appelle " + this.getNom() + " (Magicien) et j'ai " + this.getVie() + " points de vie";
    }

///**
//     * methode executee par un magicien lorsqu'il est frappe
//     * son super-pouvoir le protege de la frappe et il inflige
//     * un sort et une valeur bonus
//     *
//     * @param coup la force de la frappe
//     * @return Math.random()*sort()
//     */
//    public int subitFrappe(int coup) {
//        return (int) (Math.random() * lancerSort());
//    }

}