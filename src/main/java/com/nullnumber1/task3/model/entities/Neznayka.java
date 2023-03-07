package com.nullnumber1.task3.model.entities;

import com.nullnumber1.task3.model.Entity;

public class Neznayka implements Entity {
    public void see(String object) {
        System.out.println("Neznayka sees the " + object + ".");
    }

    public void remember(String memory) {
        System.out.println("Neznayka remembers " + memory + ".");
    }

    public void feelCold() {
        System.out.println("A chill runs down Neznayka's spine.");
    }

    public void slip(String fromWhere) {
        System.out.println("Neznayka slips off the " + fromWhere + ".");
    }

    public void runBack() {
        System.out.println("Neznayka runs back to warn the gnomes.");
    }

    public void shout() {
        System.out.println("Neznayka shouts at the gnomes to stop riding the carousel and run away.");
    }

    public void grab(String target) {
        System.out.println("Neznayka grabs " + target + " by the collar and pulls him off the carousel.");
    }

    @Override
    public void performAction() {
        see("truck");
        feelCold();
        remember("all the stories about what happens to the gnomes on Fool's Island.");
        slip("fence");
        runBack();
        shout();
        grab("Kozlik");
    }
}
