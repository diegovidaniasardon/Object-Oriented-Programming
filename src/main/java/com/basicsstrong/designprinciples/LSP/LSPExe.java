package com.basicsstrong.designprinciples.LSP;

class Bird{

    //base functionality related to Bird
    public void info(){
        System.out.println("I am a Bird");
    }
}

class FlyBird extends Bird{
    public void info(){
        System.out.println("I am a flying Bird");
    }
}


class Sparrow extends FlyBird{

}

class Ostrich extends Bird{

}

public class LSPExe {

    public static void main(String[] args) {
            Ostrich ostrich = new Ostrich();
            ostrich.info();

            Sparrow sparrow = new Sparrow();
            sparrow.info();
    }
}
