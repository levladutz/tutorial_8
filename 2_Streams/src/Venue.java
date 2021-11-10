import java.util.Objects;

public class Venue {

    private String name;
    private String location;
    private int stars;

    /**
     * Creates a venue.
     *
     * @param name The name of the venue
     * @param location The location of the venue
     * @param stars The amount of stars the venue has
     */
    public Venue(String name, String location, int stars) {
        this.name = name;
        this.location = location;
        this.stars = stars;
    }

    /**
     * Gets the name of the venue.
     *
     * @return This venue's name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the location of the venue.
     *
     * @return This venue's location
     */
    public String getLocation() {
        return location;
    }

    /**
     * Gets the amount of stars the venue has.
     *
     * @return The amount of starts this venue has
     */
    public int getStars() {
        return stars;
    }

    /**
     * Checks whether an object is equal to this venue.
     *
     * @param other The other object
     * @return True iff the object is an identical venue
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Venue)) return false;
        Venue that = (Venue) other;
        return this.name.equals(that.name) && this.location.equals(that.location) && this.stars == that.stars;
    }

}
