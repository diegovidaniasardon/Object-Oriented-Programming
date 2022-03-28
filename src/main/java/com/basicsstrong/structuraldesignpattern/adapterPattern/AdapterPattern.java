package com.basicsstrong.structuraldesignpattern.adapterPattern;

interface ISpeakFrench{
    public void speakFrench();
}
class FrenchPerson implements ISpeakFrench{

    @Override
    public void speakFrench() {
        System.out.println("French French");
    }
}
interface ISpeakEnglish{
    public void speakEnglish();
}
class EnglishPerson implements ISpeakEnglish{

    @Override
    public void speakEnglish() {
        System.out.println("English English");
    }
}

class FrenchToEnglishAdapter implements ISpeakEnglish{

    ISpeakFrench french;
    public FrenchToEnglishAdapter(ISpeakFrench french){
        this.french = french;
    }

    @Override
    public void speakEnglish() {
        this.french.speakFrench();
        //Most of the people miss this conversion step while explaning this pattern
        System.out.println("Converting into the Brain..");
        System.out.println("English English");
    }
}

public class AdapterPattern {

    public static void main( String[] args )
    {
        FrenchToEnglishAdapter translator = new FrenchToEnglishAdapter(new FrenchPerson());
        translator.speakEnglish();
    }
}
