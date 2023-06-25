package qa.guru.config;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

public class WebDriverConfigOld {

    public String getBaseUrl(){
        //зачитываем значение из настроек
        String baseUrl = System.getProperty("baseUrl");
        //проверяем дефолтное значение
        if(Objects.isNull(baseUrl)){
            baseUrl = "CHROME";
        }
        //возвращаем результат
        return baseUrl;
    }
    public Browser getBrowser(){
        //зачитываем значение из настроек
        String browser = System.getProperty("browser");
        //проверяем дефолтное значение
        if(Objects.isNull(browser)){
            browser = "CHROME";
        }
        //возвращаем результат
        return Browser.valueOf(browser);
    }

    public URL getRemoteURL(){
        //зачитываем значение из настроек
        String remoteUrl = System.getProperty("remoteUrl");
        //проверяем дефолтное значение
        if(Objects.isNull(remoteUrl)){
            remoteUrl = "http://localhost:4444";
        }
        //возвращаем результат
        try {
            return new URL(remoteUrl);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }


}
