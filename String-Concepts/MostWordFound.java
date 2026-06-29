
class MostWordFound {
    public int mostWordsFound(String[] sentences) {
        int count = 0;
        for (String S : sentences) {
            String[] Str = S.split(" ");
            count = Math.max(count, Str.length);
        }
        return count; 
    }

    // Main function to run and test your code
    public static void main(String[] args) {
        MostWordFound tester = new MostWordFound();
        
        // Test array with sentences of varying lengths
        String[] sampleSentences = {
            "alice and bob love leetcode", 
            "i think so too", 
            "this is great thanks very much"
        };
        
        int result = tester.mostWordsFound(sampleSentences);
        
        // Prints the maximum words found (Expected output: 6)
        System.out.println("Maximum words found in a single sentence: " + result);
    }
}
