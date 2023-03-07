package com.nullnumber1.task3;

import com.nullnumber1.task3.model.*;
import com.nullnumber1.task3.model.entities.*;

public class Application {
    public static void main(String[] args) {
        Entity[] entities = {
                new Motor(),
                new Truck(500),
                new Gnome(),
                new Neznayka(),
                new Kozlik()
        };

        for (Entity entity : entities) {
            entity.performAction();
        }
    }
}
