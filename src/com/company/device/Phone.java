package com.company.device;

import com.company.Human;
import com.company.Salable;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Random;

public class Phone extends Device implements Rechargeable, Salable {
    private static final String DEFAULT_SERVER_ADDRESS = "appserver.com";
    private static final String DEFAULT_VERSION = "latest";
    private static final String DEFAULT_PROTOCOL = "https";

    final Double screenSize;
    final String operatingSystem;

    public Phone(String producer, String model, Double screenSize, String operatingSystem) {
        super(model, producer, 2021);
        this.screenSize = screenSize;
        this.operatingSystem = operatingSystem;
    }

    @Override
    public void turnOn() {
        System.out.println("wciskam przycisk i mogę dzwonić");
    }

    @Override
    public void recharge() {
        System.out.println("podłączam do gniazdka");
    }

    @Override
    public double getChargeLevel() {
        Double level = new Random().nextDouble();
        System.out.println("poziom naładowania: " + level);
        return level;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.mobilePhone != this) {
            System.out.println("ERROR: sorry nie możesz sprzedawać kradzionych telefonów");
        } else if (buyer.cash < price) {
            System.out.println("ERROR: sorry, kupujący nie ma dość hajsów");
        } else if (seller == buyer) {
            System.out.println("ERROR: nie możesz sprzedawać samemu sobie");
        } else {
            buyer.cash -= price;
            seller.cash += price;
            buyer.mobilePhone = seller.mobilePhone;
            seller.mobilePhone = null;
            System.out.println("udało się sprzedać telefon za " + price);
        }
    }

    //Do klasy Phone dodaj kilka wersji metody installAnApp, które powinny różnić się przyjmowanymi parametrami,
    //poszczególne wersje powinny przyjmować
    //nazwę aplikacji do zainstalowanie
    //nazwę i wersję
    //nazwę, wersję i adres serwera, z którego należy zainstalować aplikację
    //listę nazw aplikacji do zainstalowania
    //obiekt kasy URL, który powinien odwoływać się do konkretnej aplikacji w konkretnej wersji na konkretnym
    //serwerze
    //2. W klasie Phone dodaj stałe (static

    public void installAnApp(String appName) {
        this.installAnApp(appName, DEFAULT_VERSION);
    }

    public void installAnApp(String appName, String version) {
        this.installAnApp(appName, version, DEFAULT_SERVER_ADDRESS);
    }

    public void installAnApp(String appName, String version, String address) {
        try {
            URL url = new URL(DEFAULT_PROTOCOL, address, appName + "_" + version);
            this.installAnApp(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public void installAnApp(URL url) {
        System.out.println("pobieram aplikację " + url.getFile() + " z adresu " + url.getHost());
        System.out.println("sprawdzam czy jest płatna");
        System.out.println("jeżeli płatna sprawdzam czy masz hajs");
        System.out.println("sprawdzam czy jest miejsce");
        System.out.println("jeżeli zapłacisz albo jest bezpłatna rozpakowuję aplikację");
        System.out.println("instaluję aplikację " + url.getFile());
    }

    public void installAnApp(List<String> appNames) {
        for (String appName : appNames) {
            this.installAnApp(appName);
        }
    }

    public void installAnApp(String[] appNames) {
        for (String appName : appNames) {
            this.installAnApp(appName);
        }
    }

}
