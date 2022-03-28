package com.basicsstrong.structuraldesignpattern.compositePattern;

import java.util.ArrayList;
import java.util.List;

//Component object
interface Data{
    public void doubleClick();
}
//Leaf object
class File implements Data{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void doubleClick() {
      System.out.println(this.getName() + " file is Opened in a Program ");
    }
}

class Folder implements Data{

    public String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private List<Data> folder = new ArrayList<Data>();

    @Override
    public void doubleClick() {
        System.out.println(this.getName() + " folder is Opened");
        for (Data data: folder){
            data.doubleClick();
        }
    }

    public void add(Data data){
        folder.add(data);
    }

    public void remove(Data data){
        folder.remove(data);
    }
}

public class CompositePattern {

    public static void main( String[] args )
    {
        //Composite Objects
       Folder folder1 = new Folder();
       folder1.setName("Folder 1");
       Folder folder2 = new Folder();
       folder2.setName("Folder 2");

       //Leaf objects
        File file1 = new File();
        file1.setName("File 1");
        File file2 = new File();
        file2.setName("File 2");

        folder1.add(file1);
        folder2.add(file2);
        folder1.doubleClick();

        File file3 = new File();
        file3.setName("File 3");
        File file4 = new File();
        file4.setName("File 4");

        folder2.add(file3);
        folder2.add(file4);
        folder2.doubleClick();
    }

}
