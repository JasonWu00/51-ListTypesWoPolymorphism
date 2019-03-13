public class Element {
  private int integerValue;
  private double doubleValue;
  private String stringValue;
  private int typeValue;

  public String toString() {
    return "" + integerValue + doubleValue + stringValue;
  }

  public void setValues(int type, int intInput,
                        double doubleInput, String stringInput) {
    typeValue = type;
    if (type == 0) {
      integerValue = intInput;
    }
    if (type == 1) {
      doubleValue = doubleInput;
    }
    if (type == 2) {
      stringValue = stringInput;
    }
  }

}
