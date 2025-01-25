package gr.aueb.cf.projects;

/**
 * Ο αλγόριθμος διασχίζει τον πίνακα και διατηρεί δύο μεταβλητές,
 * @currentSum & @maxSum.
 * To @currentSum δείχνει το μέγιστο άθροισμα που μπορεί να επιτευχθεί αν συμπεριλάβουμε το τρέχον στοιχείο.
 * Το maxSum ενημερώνεται συνεχώς με τη μεγαλύτερη τιμή του currentSum.
 * Επομένως, εάν το @currentSum πέσει κάτω από το τρέχον στοιχείο (nums[i]), τότε ξεκινάμε νέο υποπίνακα από το σημείο αυτό και
 * στο τέλος της επανάληψης, το maxSum περιέχει το μέγιστο άθροισμα.
 *
 */




public class MaximumSumSubArray {

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Sum Subarray: " + maxSubArray(nums));
    }

    // Yπολογίζει το μέγιστο άθροισμα υποπίνακα
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        for(int i=1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);

    // Ενημερώνεται το maxSum αν το currentSum είναι μεγαλύτερο
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
