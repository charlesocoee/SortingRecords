//Charles Owens
//CSCI 2010/2011
//W1
package csci2011.owenslab2;
/**
 * @author Charles Owens
 */
public class Record {
    //private variables
    private String title;
    private String artist;
    private int yearReleased;

    //constructor with 3 params
    public Record(String title, String artist, int yearReleased) {
        this.title = title;
        this.artist = artist;
        this.yearReleased = yearReleased;
    }

    //public getter to retrieve title variable
    public String getTitle() {
        return title;
    }

    //public getter to retrieve artist variable
    public String getArtist() {
        return artist;
    }
    
    //public getter to retrieve yearReleased variable
    public int getYearReleased() {
        return yearReleased;
    }

    //method to print title, artist, and yearReleased variables
    public void display() {
        System.out.println(title + " - " + artist + " (" + yearReleased + ")");
    }

    //method to compare if a record param comes before this object's record
    //by reviewing the artist, then the year variables
    public boolean comesBefore(Record record) {
        if (artist.compareToIgnoreCase(record.getArtist()) < 0) {
            return true;
        } else if (artist.compareToIgnoreCase(record.getArtist()) == 0) {
            return yearReleased < record.getYearReleased();
        }
        return false;
    }
}
