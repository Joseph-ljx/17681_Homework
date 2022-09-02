/**
 * This java file is for calculating the 12th digit for UPC
 *
 * @author liaojianxiang
 */
public class CheckDigit {
  // Compute.
  public void compute(int[] input) {
    int result =
        (10
                - (3 * input[0]
                        + input[1]
                        + 3 * input[2]
                        + input[3]
                        + 3 * input[4]
                        + input[5]
                        + 3 * input[6]
                        + input[7]
                        + 3 * input[8]
                        + input[9]
                        + 3 * input[10])
                    % 10)
            % 10;
    for (int i : input) {
      System.out.print(i);
    }
    System.out.println();
    System.out.println(result);
  }

  // Main function.
  public static void main(String[] args) {
    // input.
    int[] input = new int[11];
    // String.length().
    for (int i = 0; i < args[0].length(); i++) {
      // 1. Solution 1: First from Character to String by using String.ValueOf().
      // Then from String to int.
      /* int val = Integer.parseInt(String.valueOf(args[0].charAt(i)));
      input[i] = val;*/

      // 2. Solution 2: ASCII minus
      int val = args[0].charAt(i) - '0';
      input[i] = val;
    }
    // Call the function.
    CheckDigit cd = new CheckDigit();
    cd.compute(input);
  }
}
