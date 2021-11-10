import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class VenueCatalogue {

    private List<Venue> venues;

    /**
     * Creates a venue catalogue.
     */
    public VenueCatalogue() {
        this.venues = new ArrayList<>();
    }

    /**
     * Gets the list of quality venues.
     *
     * @return The list of venues with 3 stars or more
     */
    public List<Venue> qualityVenues() {
        return venues.stream().filter(x -> x.getStars() >= 3)
                .collect(Collectors.toList());
    }

    /**
     * Gets the list of vegan restaurants names.
     *
     * @return The list of names of restaurants that have vegan menu options
     */
    public List<String> veganRestaurantNames() {
        return venues.stream().filter( x -> x instanceof Restaurant && ((Restaurant)x).hasVeganFood())
                .map(x -> x.getName())
                .collect(Collectors.toList());
    }

    /**
     * Gets the list of cheap drinking locations.
     *
     * @return The list of locations of bars where a beer costs less than 2 euros
     */
    public List<String> cheapDrinkingLocations() {
        return venues.stream().filter( x -> x instanceof Bar && ((Bar)x).getCostOfOneBeer() < 2)
                .map(x -> x.getLocation())
                .collect(Collectors.toList());
    }

    /**
     * Adds a venue to the catalogue.
     *
     * @param venue The venue to add
     */
    public void addVenue(Venue venue) {
        this.venues.add(venue);
    }

    /**
     * Gets the list of venues.
     *
     * @return The list of venues in this catalogue
     */
    public List<Venue> getVenues() {
        return venues;
    }

}
