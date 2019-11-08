class RnaTranscription {

    String transcribe(String dnaStrand) {
        if(dnaStrand.length() == 0) return dnaStrand;

        String[] dnArray = dnaStrand.split("");
        String[] rnArray = new String[dnaStrand.length()];
        int i = 0;
        for(String nuc: dnArray){
            switch(nuc){
                case("A"):
                    rnArray[i] = "U";
                    i++;
                    break;
                case("C"):
                    rnArray[i] = "G";
                    i++;
                    break;
                case("G"):
                    rnArray[i] = "C";
                    i++;
                    break;
                case("T"):
                    rnArray[i] = "A";
                    i++;
                    break;
                default:
            }
        }
        return String.join("", rnArray);
    }

}
