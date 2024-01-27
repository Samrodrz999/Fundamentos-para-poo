package temp;

public class temperatura {

    double temperatura;

    public temperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public temperatura(){
        temperatura = 0;
    }

    public double celsiusToFahrenheit(double valor){
        temperatura = ((1.8) * valor) + 32;
        return temperatura;
    }

    public  double fahrenheitToCelsius(double valor){
        temperatura = ((valor - 32) / 1.8);
        return temperatura;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
}
