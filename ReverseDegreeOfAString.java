public class ReverseDegreeOfAString {
    public int reverseDegree(String s) {
        int totalDegree = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int reverseAlphabetPos = 26 - (c - 'a');
            int stringPos = i + 1;
            
            totalDegree += reverseAlphabetPos * stringPos;
        }
        
        return totalDegree;
    }

    public static void main(String[] args) {
        ReverseDegreeOfAString solver = new ReverseDegreeOfAString();
        System.out.println(solver.reverseDegree("abc"));
        System.out.println(solver.reverseDegree("zaza"));
    }
}