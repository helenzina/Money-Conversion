package com.example.moneyconversion;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private ComboBox<String> FromCurrMenu;
    @FXML
    private ComboBox<String> ToCurrMenu;
    @FXML
    private TextField FromCurrText;
    @FXML
    private TextField ToCurrText;
    @FXML
    private Button BtnConvert;
    private double amount;
    private String fromCode;
    private String toCode;
    private double rate;

    @FXML
    public void initialize() {
        String filePath = "currency_codes.txt";
        List<String> currencies = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                currencies.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        FromCurrMenu.getItems().addAll(currencies);
        ToCurrMenu.getItems().addAll(currencies);
        ToCurrText.setEditable(false);
        FromCurrMenu.setEditable(true);
        ToCurrMenu.setEditable(true);

    }

    public void BtnConvert(ActionEvent e) throws IOException {
        fromCode = FromCurrMenu.getValue();
        toCode = ToCurrMenu.getValue();
        String amountString = FromCurrText.getText();
        if (isValid(amountString) && isValid(fromCode) && isValid(toCode)) {
            amount = Double.parseDouble(amountString);
            try {
                rate = sendHttpGETRequest(fromCode, toCode, amount);
                DecimalFormat df = new DecimalFormat("#.##");
                String resultString = df.format(amount * rate);
                ToCurrText.setText(resultString);
            } catch (IOException ex) {
                System.out.println("An error occurred while converting currency. Please try again later.");
            }
        } else {
            System.out.println("Please enter a valid amount and select both unit codes.");
        }
        amount = Double.parseDouble(FromCurrText.getText()); // Assume 1 unit for simplicity
        rate = sendHttpGETRequest(fromCode, toCode, amount);
        ToCurrText.setText(Double.toString(amount * rate));

    }

    public boolean isValid(String str) {
        return (str != null && !str.isEmpty());
    }

    public double sendHttpGETRequest(String fromCode, String toCode, double amount) throws IOException {
        String GET_URL = "https://www.alphavantage.co/query?function=CURRENCY_EXCHANGE_RATE&from_currency=" + fromCode
                + "&to_currency=" + toCode + "&apikey=LPYNAN4P26VTCTY0";
        URL url = new URL(GET_URL);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod("GET");
        int responseCode = httpURLConnection.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_OK) { // GREAT SUCCESS
            BufferedReader in = new BufferedReader(new InputStreamReader((httpURLConnection.getInputStream())));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            JSONObject obj = new JSONObject(response.toString());
            JSONObject exchangeRateObj = obj.getJSONObject("Realtime Currency Exchange Rate");
            String exchangeRateString = exchangeRateObj.getString("5. Exchange Rate");
            double exchangeRate = Double.parseDouble(exchangeRateString);
            return exchangeRate;
        }
        return amount;
    }
}