public class PracticeProblem {

	public static void main(String args[]) {

	}

  
    public static String[] addString(String[] arr, String str, int index) {
        String[] result = new String[arr.length + 1];

        for (int i = 0, j = 0; i < result.length; i++) {
            if (i == index) {
                result[i] = str;
            } else {
                result[i] = arr[j];
                j++;
            }
        }

        return result;
    }

  
    public static char[] removeChars(char[] arr, char ch) {
        int count = 0;

        for (char c : arr) {
            if (c != ch) {
                count++;
            }
        }

        char[] result = new char[count];

        int i = 0;
        for (char c : arr) {
            if (c != ch) {
                result[i++] = c;
            }
        }

        return result;
    }
}
