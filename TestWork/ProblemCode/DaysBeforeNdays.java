package ProblemCode;

public class DaysBeforeNdays {
	public static void main(String[] args) {
        // Predefined values for current day and number of days to go back
        int d = 3; // Example: 0 represents sunday and so one so 6 will be Saturday
        int n = 11; // Number of days to go back

        // Find the remainder of n divided by 7 and answe is 4
        int x = n % 7;

        // Calculate the day before n days
        int ans = d - x;

        // Adjust for negative values
        if (ans < 0) {
            System.out.print(ans + 7);
        } else {
            System.out.print(ans);
        }
        
        int a=3;
        System.out.println((a++)+""+(a--));
    }

}
