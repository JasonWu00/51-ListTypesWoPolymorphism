public class Element {
  private int integerValue = 2;
  private double doubleValue = 2.0;
  private String stringValue = "two";
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
