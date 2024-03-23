//Charles Owens
//CSCI 2010/2011
//W1
package csci2011.owenslab2;
/**
 * @author Charles Owens
 */
public class OwensLab2 {

    //Test to validate the results of the comesBefore method in the Record class
    public static void testComesBefore(Record record1, Record record2) {
        System.out.println("Testing comesBefore:");
        boolean result = record1.comesBefore(record2);
        if(result == true)
           System.out.println(record1.getTitle()+ " comes before " + record2.getTitle());
        else
           System.out.println(record1.getTitle() + " does NOT come before " + record2.getTitle()); 
    }
    
    //Test to display the number of records in the RecordCollection (before adding any records)
    static void testRCDisplay(RecordCollection recordCollection) {
        System.out.println("Testing display:");
        recordCollection.display();
        int numRecords = recordCollection.getNumRecords();
        System.out.println("Number of records: " + numRecords);
    }
    
    //Test to add records, display each record info, and total number of records it has added up to that point
    static void testAddRecord(RecordCollection recordCollection, Record record) {
        System.out.println("Testing addRecord");
        System.out.println("Adding " + record.getTitle() + " - " + record.getArtist() + " (" + record.getYearReleased() + ")");
        recordCollection.addRecord(record);
        System.out.println("Collection:");
        recordCollection.display();
        int numRecords = recordCollection.getNumRecords();
        System.out.println("Number of records: " + numRecords);
        System.out.println();
    }
    
    //Test see if it can find a record that was added to the RecordCollection, and if it can find a record not added to that collection yet
    public static void testFindRecord(RecordCollection collection, String title, String artist) {
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);

        Record foundRecord = collection.findRecord(title, artist);
        if (foundRecord != null) {
            System.out.println("Found: " + foundRecord.getTitle() + " - " + foundRecord.getArtist() + " (" + foundRecord.getYearReleased() + ")");
        } else {
            System.out.println("Record not found");
        }
    }
    
    //Test uses the sort records method to sort the records added to the RecordCollection
    public static void testSortRecords(RecordCollection collection) {
        System.out.println("Testing sortRecords:");
        collection.sortRecords();
        collection.display(); // Display the sorted collection
    }
    
    public static void main(String[] args) {
        //System.out.println("PLEASE UNCOMMENT EACH SECTION YOU WISH TO TEST (REMOVE THE /* AND */), AND RUN PROJECT 5 SEPARATE TIMES.");
        
        ///////////TEST 1/////////////
        //Test that adds 4 records, and then uses the testComesBefore method to compare 2 records 
        /*Record record1 = new Record("Unknown Pleasures", "Joy Division", 1979); 
        Record record2 = new Record("Closer", "Joy Division", 1980);
        Record record3 = new Record("New Day Rising", "Husker Du", 1985);
        Record record4 = new Record( "Disintegration", "Cure, the", 1989);
        testComesBefore(record1, record2);
        System.out.println();
        testComesBefore(record3, record1);
        System.out.println();
        testComesBefore(record2, record4);*/
        
        
        ///////////TEST 2/////////////
        //Test instantiates RecordCollection class with 10 records, and then uses the testRCDisplay to display that there are 0 records 
        /*RecordCollection recordCollection = new RecordCollection(10);
        testRCDisplay(recordCollection);*/

        
        ///////////TEST 3/////////////
        //Instantiates RecordCollection and adds records to its array by using Record class.  This test adds 4 records and displays number of records as it adds them.
        /* RecordCollection recordCollection = new RecordCollection(10);
        Record record1 = new Record("Unknown Pleasures", "Joy Division", 1979);
        testAddRecord(recordCollection, record1);
        Record record2 = new Record("Closer", "Joy Division", 1980);
        testAddRecord(recordCollection, record2);
        Record record3 = new Record("Disintegration", "Cure, the", 1989);
        testAddRecord(recordCollection, record3);
        Record record4 = new Record("New Day Rising", "Husker Du", 1985);
        testAddRecord(recordCollection, record4);  */
        
        
        ///////////TEST 4/////////////
        //Adds a record to RecordCollection manually. The testFindRecord validates it can find the record added, but cannot find a record that wasn't added.
        /*Record record1 = new Record("New Day Rising", "Husker Du", 1985);
        RecordCollection recordCollection = new RecordCollection(10);
        recordCollection.addRecord(record1) ;
        // Case 1: Title / Artist are inside the collection, so the record should be found
        System.out.println("Testing findRecord:");
        testFindRecord(recordCollection, "New Day Rising", "Husker Du");
        // Case 2: Title / Artist NOT in the collection, so the record should not be found
        System.out.println();
        System.out.println("Testing findRecord:");
        testFindRecord(recordCollection, "Nevermind", "Nirvana");*/
        
        
        ///////////TEST 5/////////////
        //Creates & adds 4 records to record collection.  Tests the sortRecords method in RecordCollection class to validate if records are sorted.
        RecordCollection recordCollection = new RecordCollection(10);
        Record record1 = new Record("Unknown Pleasures", "Joy Division", 1979); 
        Record record2 = new Record("Closer", "Joy Division", 1980);
        Record record3 = new Record("New Day Rising", "Husker Du", 1985);
        Record record4 = new Record( "Disintegration", "Cure, the", 1989);
        recordCollection.addRecord(record1);
        recordCollection.addRecord(record2);
        recordCollection.addRecord(record3);
        recordCollection.addRecord(record4);
        testSortRecords(recordCollection);
    }
}
