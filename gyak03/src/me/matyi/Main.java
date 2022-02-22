package me.matyi;

import jdk.jshell.spi.ExecutionControl;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        IContact contact = new Contact();

        IContact2 contact2 = (IContact2) contact;
    }
}

interface IContact {
    void printMails();
}
interface IContact2 {
    void printAllMails();
}

class Contact implements IContact, IContact2 {
    String firstName;
    List<String> mails;

    public void printMails(){

    }
    public void printAllMails(){

    }
}
class OtherContact implements IContact {
    String displayName;
    OtherContact(String displayName){
        this.displayName = displayName;
    }

    public void printMails(){
        System.out.println("Animal type changed to: ");
    }
    public void printMails5(){
        System.out.println("Animal type changed to: ");
    }
    public void printMails7(){
        System.out.println("Animal type changed to: ");
    }
}
