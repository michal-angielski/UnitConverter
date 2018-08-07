package sample;

import javafx.scene.control.TextField;

public class Controller {

    //Text fields variables
    public TextField temp_celsius;
    public TextField temp_fahrenheit;
    public TextField temp_kelvin;

    public TextField currency_pln;
    public TextField currency_usd;
    public TextField currency_eur;
    public TextField currency_gbp;

    public TextField volume_ml;
    public TextField volume_cl;
    public TextField volume_dl;
    public TextField volume_l;

    public TextField mass_mg;
    public TextField mass_g;
    public TextField mass_dkg;
    public TextField mass_kg;
    public TextField mass_t;

    public TextField power_w;
    public TextField power_kw;
    public TextField power_km;

    public TextField time_ns;
    public TextField time_us;
    public TextField time_ms;
    public TextField time_s;
    public TextField time_min;
    public TextField time_h;
    public TextField time_days;

    public TextField speed_kmh;
    public TextField speed_mph;
    public TextField speed_kms;
    public TextField speed_mps;

    public TextField data_b;
    public TextField data_kb;
    public TextField data_mb;
    public TextField data_gb;
    public TextField data_tb;

    public void temperature() {
        double FahrToCelsius = ((Integer.parseInt(temp_fahrenheit.getText()) - 32) / 1.8); //from Fahrenheit
        double KelvinToCelsius = ((Integer.parseInt(temp_kelvin.getText()) - 273.15)); //from Kelvin

        //error occuring when value for fahrenheit is not written
        //works ok, when fahrenheit and kalvin values are provided
        //throwing the end value to the same textfield - temp_celsius
        temp_celsius.setText(Double.toString(FahrToCelsius));
        temp_celsius.setText(Double.toString(KelvinToCelsius));
    }
}
