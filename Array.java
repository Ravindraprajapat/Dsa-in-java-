/*
 * import java.util.Arrays;
 * 
 * public class Array {
 * 
 * // public static int Occourunce(int[] A, int key) {
 * // int lastIndex = 0;
 * // for (int i = 0; i < A.length; i++) {
 * // if (A[i] > key) {
 * // lastIndex++;
 * // }
 * // }
 * // return lastIndex;
 * // }
 * 
 * // static boolean issotr(int[] D) {
 * // boolean check = true;
 * // for (int i = 1; i < D.length; i++) {
 * // if (D[i] < D[i - 1]) {
 * // check = false;
 * // break;
 * // }
 * // }
 * // return check;
 * // }
 * 
 * static int[] SmallestLargestele(int[] E) {
 * Arrays.sort(E);
 * int res[] = { E[0], E[E.length - 1] };
 * return res;
 * }
 * 
 * public static void main(String[] args) {
 * int[] B = { 5, 7, 3, 4, 1, 10, 6, 9 };
 * for (int i = 0; i < B.length; i++) {
 * System.out.println(B[i]);
 * }
 * 
 * // System.out.println("the index of key" + Occourunce(B, 5));
 * // System.out.println("the array is storted" + issotr(B));
 * int[] R = SmallestLargestele(B);
 * System.out.println("the Smallest ele " + R[0]);
 * System.out.println("the Largest ele " + R[R.length - 1]);
 * 
 * }
 * }
 */

// public class Array {

/*
 * static int Targetsum(int[] R, int target) {
 * int Ans = 0;
 * int n = 7;
 * for (int i = 0; i < n; i++) {
 * for (int j = i + 1; j < n; j++) {
 * 
 * if (R[i] + R[j] == target) {
 * Ans++;
 * }
 * }
 * }
 * return Ans;
 * }
 */

/*
 * static int Triplet(int A[], int t) {
 * int Ans = 0;
 * int n = A.length;
 * for (int i = 0; i < n; i++) {
 * for (int j = i + 1; j < n; j++) {
 * for (int k = j + 1; k < n; k++) {
 * if (A[i] + A[j] + A[k] == t) {
 * Ans++;
 * }
 * }
 * 
 * }
 * }
 * return Ans;
 * }
 * 
 * static void Arrayrev(int[] A) {
 * 
 * System.out.println("reverse Array");
 * for (int i = A.length - 1; i > 0; i--) {
 * System.out.print(A[i] + " ");
 * }
 * 
 * }
 * 
 * public static void main(String[] args) {
 * 
 * int[] Ar = { 6, 5, 4, 9, 3, 0 };
 * for (int i = 0; i < Ar.length; i++) {
 * System.out.print(Ar[i] + " ");
 * }
 * Arrayrev(Ar);
 * }
 * }
 * 
 * 
 * public class Array {
 * 
 * // static void swap(int[] A2, int index, int index2) {
 * // int temp = A2[index];
 * // A2[index] = A2[index2];
 * // A2[index2] = temp;
 * // }
 * 
 * static void PrintArray(int[] A) {
 * 
 * for (int i = 0; i < A.length; i++) {
 * System.out.print(A[i] + " ");
 * }
 * }
 * 
 * // static void reverseAr(int[] A3) {
 * // int Strat = 0;
 * // int end = A3.length - 1;
 * // while (end > Strat) {
 * 
 * // swap(A3, Strat, end);
 * // Strat++;
 * // end--;
 * // }
 * // }
 * 
 * static int LinearSearch(int[] A4, int key) {
 * 
 * for (int i = 0; i < A4.length; i++) {
 * int ele = A4[i];
 * if (ele == key) {
 * return i;
 * 
 * }
 * }
 * return -1;
 * }
 * 
 * public static void main(String[] args) {
 * 
 * int[] A = { 19, 4, 3, 6, 2, 5, 8 };
 * PrintArray(A);
 * System.out.println("");
 * // swap(A, 0, A.length - 1);
 * // PrintArray(A);
 * // System.out.println(" reverse");
 * // reverseAr(A);
 * // PrintArray(A);
 * 
 * System.out.println(" the the keyn " + LinearSearch(A, 8));
 * 
 * }
 * }
 */
/*
 * find the ,maximum minimum number in a Array
 * public class Array {
 * 
 * static int Min(int[] Arrr) {
 * int res = Arrr[0];
 * for (int i = 1; i < Arrr.length; i++) {
 * if (res > Arrr[i]) {
 * res = Arrr[i];
 * }
 * }
 * return res;
 * }
 * 
 * static int Max(int[] Arrr) {
 * int res = Arrr[0];
 * for (int i = 1; i < Arrr.length; i++) {
 * if (res > Arrr[i]) {
 * res = Arrr[i];
 * }
 * }
 * return res;
 * }
 * 
 * static void PrintArray(int[] Ar) {
 * 
 * for (int i = 0; i < Ar.length; i++) {
 * System.out.print(Ar[i] + " ");
 * }
 * }
 * 
 * public static void main(String[] args) {
 * int[] Az = { 19, 4, 3, 6, 2, 5, 8 };
 * PrintArray(Az);
 * System.out.println(Min(Az));
 * 
 * System.out.println(Max(Az));
 * }
 * 
 * }
 * 
 * import java.util.Arrays;
 * 
 * public class Array {
 * 
 * static int[] Search(int[][] b, int target) {
 * 
 * for (int row = 0; row < b.length; row++) {
 * for (int col = 0; col < 3; col++) {
 * if (b[row][col] == target) {
 * return new int[] { row, col };
 * }
 * }
 * }
 * return new int[] { -1 };
 * }
 * 
 * public static void main(String[] args) {
 * int[][] a = {
 * { 1, 5, 4 },
 * { 9, 6, 1 },
 * { 3, 2, 8 },
 * { 7, 12, 31 },
 * };
 * int[] res = Search(a, 12);
 * System.out.println(Arrays.toString(res));
 * }
 * }
 */