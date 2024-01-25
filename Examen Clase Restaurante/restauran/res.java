package restauran;

public class res {

        private int numDocenasHuevos;
        private double numKilosChorizo;

        public res(int numDocenasHuevos, double numKilosChorizo) {
            this.numDocenasHuevos = numDocenasHuevos;
            this.numKilosChorizo = numKilosChorizo;
        }

        public void addHuevos(int numDocenas) {
            this.numDocenasHuevos += numDocenas;
        }

        public void addChorizo(double numKilos) {
            this.numKilosChorizo += numKilos;
        }

        public int getNumPlatos() {
            int platosPosiblesPorHuevos = numDocenasHuevos * 6;
            int platosPosiblesPorChorizo = (int) (numKilosChorizo / 0.2);
            return Math.min(platosPosiblesPorHuevos, platosPosiblesPorChorizo);
        }

        public void sirvePlato() {
            if (getNumPlatos() > 0) {
                numDocenasHuevos -= 1 / 6;
                numKilosChorizo -= 0.2;
            }
        }

        public int getHuevos() {
            return numDocenasHuevos * 12;
        }

        public double getChorizo() {
            return numKilosChorizo;
        }
}
