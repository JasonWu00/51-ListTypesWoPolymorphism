public class Element {
  private int integerValue;
  private double doubleValue;
  private String stringValue;
  private int typeValue;

  public String toString() {
    String output = "";
    if (typeValue == 0)
      return output + integerValue;
    if (typeValue == 1)
      return output + doubleValue;
    else
      return output + stringValue;
  }

  public void setValues(int type, int intInput,
                        double doubleInput, String stringInput) {
    typeValue = type;
    integerValue = intInput;
    doubleValue = doubleInput;
    stringValue = stringInput;
  }
}
