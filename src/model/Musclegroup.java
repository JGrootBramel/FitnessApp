package model;

public class Musclegroup {

    private String[] mGroups = {"Rücken", "Schultern", "Brust", "Beine", "Bauch", "Beine"};

    private String name;

    public Musclegroup(String name, String[] muscles) {
        this.name = name;
        this.muscles = muscles;
    }

    private String[] muscles;


    public String getName() {
        return name;
    }
    public String[] getMuscles() {
        return muscles;
    }
    public void ausgabe() {
        System.out.println("Muskelgruppe: " + name);
        for (int i = 0; i <muscles.length; i++) {
            System.out.print(muscles[i] + " ");
        }
        System.out.println();
    }

    public void ausgabeMGroups() {
        for (int i = 0; i < mGroups.length; i++) {
            System.out.println(mGroups[i]);
        }
    }


}

//Quellen
//https://stackoverflow.com/questions/1128723/how-can-i-test-if-an-array-contains-a-certain-value
// arrayList: https://javabeginners.de/Arrays_und_Verwandtes/variables_Array.php
//Muskelgruppen: https://www.muskelaufbau.de/grundlagen/dein-koerper/muskelgruppen/
// Rücken Brust Arme Schultern Beine