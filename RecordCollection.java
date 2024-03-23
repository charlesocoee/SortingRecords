//Charles Owens
//CSCI 2010/2011
//W1
package csci2011.owenslab2;
/**
 * @author Charles Owens
 */
public class RecordCollection {
    //private variables
    private int numRecords;
    private Record[] records;

    //constructor with 1 param
    public RecordCollection(int maxRecords) {
        numRecords = 0;
        records = new Record[maxRecords];
    }

    //public getter to return numRecords variable
    public int getNumRecords() {
        return numRecords;
    }

    //public method to print each record in records array
    //using display method from Record class
    public void display() {
        if (numRecords == 0) {
            System.out.println("No records in the collection");
        } else {
            for (int i = 0; i < numRecords; i++) {
                records[i].display();
            }
        }
    }

    //method to add a record to the records array
    public boolean addRecord(Record record) {
        if (record == null || numRecords == records.length) {
            return false;
        }
        records[numRecords] = record;
        numRecords++;
        return true;
    }

    //method to see if title/artist passed in the params matched any records 
    //already set on the records array
    public Record findRecord(String title, String artist) {
        for (int i = 0; i < numRecords; i++) {
            if (records[i].getTitle().equals(title) && records[i].getArtist().equals(artist)) {
                return records[i];
            }
        }
        return null;
    }

    //method to sort the records using the comesBefore method from the Record class
    public void sortRecords() {
        for (int i = 0; i < numRecords - 1; i++) {
            int min = i;
            for (int x = i + 1; x < numRecords; x++) {
                if (records[x].comesBefore(records[min])) {
                    min = x;
                }
            }
            if (min != i) {
                Record y = records[i];
                records[i] = records[min];
                records[min] = y;
            }
        }
    }   
}
