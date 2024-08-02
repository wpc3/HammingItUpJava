package zipcode;

public class Hamming {
    String s;
    String s1;
    public Hamming(String s, String s1) {
        if (s.length() != s1.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");

        }
            this.s = s;
        this.s1 = s1;



        }

        public int hammingCounter(String s, String s1){
            int counter = 0;
            for (int i = 0; i < s.length(); i++){

                if(s.charAt(i) != s1.charAt(i)){
                    counter++;
                }
            }
        return counter;
        }



    public int getHammingDistance() {

        Hamming hamming = new Hamming(s,s1);


        return hamming.hammingCounter(s,s1);

}
}