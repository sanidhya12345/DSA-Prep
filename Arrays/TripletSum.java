package Arrays;

public class TripletSum {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    int tripletSum = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        for (int k = j + 1; k < arr.length; k++) {
          tripletSum += arr[i] + arr[j] + arr[k];
        }
      }
    }
    System.out.println(tripletSum);
  }
}
