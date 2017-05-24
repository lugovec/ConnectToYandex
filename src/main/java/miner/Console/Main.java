package main.java.miner.Console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by andrey on 23.05.17.
 */
public class Main
{
    public static void main(String[] args) throws IOException {
        String site = "https://yandex.ru";

        URL url = new URL(site);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

        int responseCode = httpURLConnection.getResponseCode();
        System.out.println(responseCode);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));

        StringBuilder stringBuilder = new StringBuilder();
        String input;

        while ((input = bufferedReader.readLine()) != null)
        {
            stringBuilder.append(input + "\n");

        }
        System.out.println(stringBuilder);

    }


}
