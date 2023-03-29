package com.nullnumber1.task3;

import com.nullnumber1.task3.exception.OutOfCapacityException;
import com.nullnumber1.task3.model.Entity;
import com.nullnumber1.task3.model.entities.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Entity tests")
public class DomainModelTest {
    private static Stream<Entity> provideEntities() {
        return Stream.of(
                new Motor(),
                new Truck(400),
                new Gnome(),
                new Neznayka(),
                new Kozlik()
        );
    }

    @DisplayName("Test performAction()")
    @ParameterizedTest(name = "{index} => entity={0}")
    @MethodSource("provideEntities")
    void testPerformAction(Entity entity) {
        assertDoesNotThrow(entity::performAction);
    }

    @DisplayName("Test Neznayka's slip()")
    @Test
    void testSlip() {
        Neznayka neznayka = new Neznayka();
        neznayka.slip("fence");
        assertTrue(neznayka.isHasSlipped());
    }

    @DisplayName("Test loading wool from Gnome to Truck and warning Gnomes by Neznayka")
    @ParameterizedTest(name = "Gnome tries to load {0} wool to the truck, but fails due to {1}")
    @CsvSource({
            "1000, OutOfCapacityException",
            "400, ''"
    })
    void testLoadWool(int woolAmount, String exceptionType) {
        Gnome gnome = new Gnome();
        Truck truck = new Truck(500);
        Neznayka neznayka = new Neznayka();

        if (exceptionType.equals("OutOfCapacityException")) {
            assertThrows(OutOfCapacityException.class, () -> truck.load("wool", woolAmount));
        } else {
            assertDoesNotThrow(() -> truck.load("wool", woolAmount));
            assertEquals(woolAmount, truck.getAmountLoaded());
            gnome.performAction();
            assertTrue(gnome.isRunning());
            neznayka.performAction();
            assertTrue(neznayka.isHasShouted());
        }
    }
}
