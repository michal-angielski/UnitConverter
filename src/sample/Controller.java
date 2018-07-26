package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    //Text fields variables
    @FXML
    public TextField temp_celsius;
    public TextField temp_fahrenheit;
    public TextField temp_kelvin;

    @FXML
    public TextField currency_pln;
    public TextField currency_usd;
    public TextField currency_eur;
    public TextField currency_gbp;

    @FXML
    public TextField volume_ml;
    public TextField volume_cl;
    public TextField volume_dl;
    public TextField volume_l;

    @FXML
    public TextField mass_mg;
    public TextField mass_g;
    public TextField mass_dkg;
    public TextField mass_kg;
    public TextField mass_t;

    @FXML
    public TextField power_w;
    public TextField power_kw;
    public TextField power_km;

    @FXML
    public TextField time_ns;
    public TextField time_us;
    public TextField time_ms;
    public TextField time_s;
    public TextField time_min;
    public TextField time_h;
    public TextField time_days;

    @FXML
    public TextField speed_kmh;
    public TextField speed_mph;
    public TextField speed_kms;
    public TextField speed_mps;

    @FXML
    public TextField data_b;
    public TextField data_kb;
    public TextField data_mb;
    public TextField data_gb;
    public TextField data_tb;

//    public void temperature(){
//        double FahrToCelsius = ((Integer.parseInt(temp_fahrenheit.getText())-32)/1.8); //from Fahrenheit
//        double KelvinToCelsius = ((Integer.parseInt(temp_kelvin.getText())- 273.15)); //from Kelvin
//        System.out.println(FahrToCelsius);
//        System.out.println(KelvinToCelsius);
//        //temp_celsius.setText(ToString.FahrToCelsius);
//    }
}
