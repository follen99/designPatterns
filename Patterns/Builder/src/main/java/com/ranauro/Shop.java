/**
 * @author giuliano ranauro
 * Date: 18/07/2021 12:07
 * Ide: Intellij
 * JDK: 1.8
 * @version 1.0
 */
package com.ranauro;

public class Shop {
    private int code;
    private String owner;
    private String address;
    private boolean inMall;

    /**
     * il primo step per usare il patter builder,
     * è quello di impedire la creazione di oggetti
     *
     * */
    private Shop() {}



    /**
     * inner class statica caratteristica
     * */
    public static class Builder{
        /**tutte le varaibili di istanza della classe shop sono anche nella classe builder*/
        private int code;
        private String owner;
        private String address;
        private boolean inMall;

        /**
         * solo il codice viene reso obbligatorio
         *
         * voglio che la classe builder mi metta a disposizione un insieme di SETTER
         *
         * @param code il codice del negozio
         */
        public Builder(int code) {
            this.code = code;

            this.owner = "";
            this.address =  "";
            this.inMall = false;
        }

        /**
         * utilizzo il metodo build per creare l'oggetto negozio
         * @return the newly created shop
         */
        public Shop build(){
            Shop shop = new Shop();
            shop.code = this.code;
            shop.owner = this.owner;
            shop.address = this.address;
            shop.inMall = this.inMall;

            return shop;
        }



        public String getOwner() {
            return owner;
        }

        public Builder setOwner(String owner) {
            this.owner = owner;
            return this;
        }

        public String getAddress() {
            return address;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public boolean isInMall() {
            return inMall;
        }

        public Builder setInMall(boolean inMall) {
            this.inMall = inMall;
            return this;
        }
    }
}
