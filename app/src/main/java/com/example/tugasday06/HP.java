package com.example.tugasday06;

public class HP {
    private String name;
    private int image;
    private String androidVersion;
    private String screenSize;
    private String resolution;
    private String processor;
    private String ramStorage;
    private String camera;
    private String usb;
    private String nfc;
    private String battery;
    private String price;

    public HP(String name, int image, String androidVersion, String screenSize, String resolution, String processor, String ramStorage, String camera, String usb, String nfc, String battery, String price) {
        this.name = name;
        this.image = image;
        this.androidVersion = androidVersion;
        this.screenSize = screenSize;
        this.resolution = resolution;
        this.processor = processor;
        this.ramStorage = ramStorage;
        this.camera = camera;
        this.usb = usb;
        this.nfc = nfc;
        this.battery = battery;
        this.price = price;
    }

    // Buat getter untuk semua atribut

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public String getAndroidVersion() {
        return androidVersion;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public String getResolution() {
        return resolution;
    }

    public String getProcessor() {
        return processor;
    }

    public String getRamStorage() {
        return ramStorage;
    }

    public String getCamera() {
        return camera;
    }

    public String getUsb() {
        return usb;
    }

    public String getNfc() {
        return nfc;
    }

    public String getBattery() {
        return battery;
    }

    public String getPrice() {
        return price;
    }


    public int getImageResource() {
        return image;
    }
}
