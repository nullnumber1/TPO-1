package com.nullnumber1.task3.model.entities;

import com.nullnumber1.task3.model.Entity;

public class Neznayka implements Entity {
    private boolean hasSeen;
    private boolean hasRemembered;
    private boolean hasFeltCold;
    private boolean hasSlipped;
    private boolean hasRunBack;
    private boolean hasShouted;
    private boolean hasGrabbed;

    public void see(String object) {
        hasSeen = true;
        System.out.println("Neznayka sees the " + object + ".");
    }

    public void remember(String memory) {
        hasRemembered = true;
        System.out.println("Neznayka remembers " + memory + ".");
    }

    public void feelCold() {
        hasFeltCold = true;
        System.out.println("A chill runs down Neznayka's spine.");
    }

    public void slip(String fromWhere) {
        hasSlipped = true;
        System.out.println("Neznayka slips off the " + fromWhere + ".");
    }

    public void runBack() {
        hasRunBack = true;
        System.out.println("Neznayka runs back to warn the gnomes.");
    }

    public void shout() {
        hasShouted = true;
        System.out.println("Neznayka shouts at the gnomes to stop riding the carousel and run away.");
    }

    public void grab(String target) {
        hasGrabbed = true;
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

    public boolean isHasSeen() {
        return hasSeen;
    }

    public boolean isHasRemembered() {
        return hasRemembered;
    }

    public boolean isHasFeltCold() {
        return hasFeltCold;
    }

    public boolean isHasSlipped() {
        return hasSlipped;
    }

    public boolean isHasRunBack() {
        return hasRunBack;
    }

    public boolean isHasShouted() {
        return hasShouted;
    }

    public boolean isHasGrabbed() {
        return hasGrabbed;
    }
}
