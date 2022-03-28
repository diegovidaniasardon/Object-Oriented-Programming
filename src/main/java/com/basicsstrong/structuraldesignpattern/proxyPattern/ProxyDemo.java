package com.basicsstrong.structuraldesignpattern.proxyPattern;

interface Image{
    public void displayImage();
}

class ActualImage implements Image{
    @Override
    public void displayImage() {
        System.out.println("This is a real Image..");
    }
}
//protection proxy
class ProxyImage implements Image{

    ActualImage realImage;

    @Override
    public void displayImage() {
        System.out.println("Checking the access rights...");
        System.out.println("Everything is good");
        realImage = new ActualImage();
        realImage.displayImage();
    }
}
//remote proxy
class ProxyImageCache implements Image{
    ActualImage realImage;

    @Override
    public void displayImage() {
        //Check if object is there in cache...else fetch the new object and send
        System.out.println("Object is not there in cache");
        realImage = new ActualImage();
        realImage.displayImage();
    }
}

public class ProxyDemo {
    public static void main( String[] args )
    {
       ProxyImage proxyImage = new ProxyImage();
       proxyImage.displayImage();

       ProxyImageCache proxyImageCache = new ProxyImageCache();
       proxyImageCache.displayImage();
    }
}
