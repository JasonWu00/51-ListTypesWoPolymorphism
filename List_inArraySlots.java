/**
  Implement a list of diverse types, including
  integers, double-precision floating point numbers,
  and Strings.
 */

public class List_inArraySlots {

    private int[]    intElements;
    private double[] doubleElements;
    private String[] stringElements;
    private int filledElements = 0; // the number of elements in this list

    /* type identifier for each element
       That is, typeOfElements[i] == 0 means element i is an integer;
                                     1 means element i is a double;
                                     2 means element i is a String.
        Optional extra education in programming (not comp sci):
            replace these "magic numbers" with an "enumerated type".
     */
    private int[] typeOfElements;

    private static final int INITIAL_CAPACITY = 10;

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
      intElements = new int[INITIAL_CAPACITY];
      doubleElements = new double[INITIAL_CAPACITY];
      stringElements = new String[INITIAL_CAPACITY];
      typeOfElements = new int[INITIAL_CAPACITY * 3];
    }


    /**
      @return the number of elements in this list
     */
    public int size() {
      return filledElements;
    }


     /**
       @return a string representation of this list,
       in [a,b,c,] format
      */
    // public String toString() {
    // }
    // Mr. Holmes says to leave this alone as of now.

    /**
      Appends @value to the end of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean add( int type   // same meaning as in typeOfElements
                       , int    intValue
                       , double doubleValue
                       , String stringValue
                       ) {
      //temporarily placed "1" in place of variables to be added later
      if (type == 0){
        intElements[filledElements] = intValue;
				doubleElements[filledElements] = 0.0;
				stringElements[filledElements] = "";
        typeOfElements[filledElements] = 0;
      }
      if (type == 1){
        doubleElements[filledElements] = doubleValue;
				intElements[filledElements] = 0;
				stringElements[filledElements] = "";
        typeOfElements[filledElements] = 1;
      }
      if (type == 2){
        stringElements[filledElements] = stringValue;
				doubleElements[filledElements] = 0.0;
				intElements[filledElements] = 0;
        typeOfElements[filledElements] = 2;
      }
			filledElements++;
      return true;
     }


    /**
      Double the capacity of the List_inArraySlots,
      preserving existing data.
     */
     private void expand() {
        System.out.println( "expand... (for debugging)");
           // /* S.O.P. rules for debugging:
              // Working methods should be silent. But during
              // development, the programmer must verify that
              // this method is called when that is appropriate.
              // So test using the println(), then comment it out.
              // */
     }
}
