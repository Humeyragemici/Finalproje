public class Proje19 {
    public class Pazaryeri {
        private String isim;
        private String renk;
        private String sahiplik;

        private Pazaryeri(String isim, String renk, String sahiplik) {
            this.isim = isim;
            this.renk = renk;
            this.sahiplik = sahiplik;
        }

        private void setPazaryeri(String isim, String renk, String sahiplik) {
            this.isim = isim;
            this.renk = renk;
            this.sahiplik = sahiplik;
        }

        private void setIsimRenk(String isim, String renk) {
            this.isim = isim;
            this.renk = renk;
        }

        private String getIsim() {
            return isim;
        }

        private String getRenk() {
            return renk;
        }

        private String getSahiplik() {
            return sahiplik;
        }

        public String PazaryeriTuru() {
            return "belirsiz";
        }

        public static void main(String[] args) {
        }
    }

}
