import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VenueCatalogueTest {

    @Test
    void qualityVenues() {
        Venue v1 = new Restaurant("San Marco", "City Centre", 4, true);
        Venue v2 = new Bar("Doerak", "City Centre", 5, 3.0, 50);
        Venue v3 = new Restaurant("Dominos", "De Hoven", 2, true);
        Venue v4 = new Restaurant("KFC", "Delft North", 1, false);
        Venue v5 = new Bar("/Pub", "Campus", 3, 1.10, 5);

        VenueCatalogue catalogue = new VenueCatalogue();
        catalogue.addVenue(v1);
        catalogue.addVenue(v2);
        catalogue.addVenue(v3);
        catalogue.addVenue(v4);
        catalogue.addVenue(v5);

        assertEquals(List.of(v1, v2, v5), catalogue.qualityVenues());
    }

    @Test
    void veganRestaurantNames() {
        Venue v1 = new Restaurant("San Marco", "City Centre", 4, true);
        Venue v2 = new Bar("Doerak", "City Centre", 5, 3.0, 50);
        Venue v3 = new Restaurant("Dominos", "De Hoven", 2, true);
        Venue v4 = new Restaurant("KFC", "Delft North", 1, false);
        Venue v5 = new Bar("/Pub", "Campus", 3, 1.10, 5);

        VenueCatalogue catalogue = new VenueCatalogue();
        catalogue.addVenue(v1);
        catalogue.addVenue(v2);
        catalogue.addVenue(v3);
        catalogue.addVenue(v4);
        catalogue.addVenue(v5);

        assertEquals(List.of("San Marco", "Dominos"), catalogue.veganRestaurantNames());
    }

    @Test
    void cheapDrinkingLocations() {
        Venue v1 = new Restaurant("San Marco", "City Centre", 4, true);
        Venue v2 = new Bar("Doerak", "City Centre", 5, 3.0, 50);
        Venue v3 = new Restaurant("Dominos", "De Hoven", 2, true);
        Venue v4 = new Restaurant("KFC", "Delft North", 1, false);
        Venue v5 = new Bar("/Pub", "Campus", 3, 1.10, 5);

        VenueCatalogue catalogue = new VenueCatalogue();
        catalogue.addVenue(v1);
        catalogue.addVenue(v2);
        catalogue.addVenue(v3);
        catalogue.addVenue(v4);
        catalogue.addVenue(v5);

        assertEquals(List.of("Campus"), catalogue.cheapDrinkingLocations());
    }

}
