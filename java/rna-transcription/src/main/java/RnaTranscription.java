class RnaTranscription {

    String transcribe(String dnaStrand) {
        if(dnaStrand.length() == 0) return dnaStrand;

        String[] dnArray = dnaStrand.split("");
        String[] rnArray = new char[dnaStrand.length()];
        for(char nuc: dnArray){
            switch(nuc){
                case("A"):
                    rnArray.push("U");
                    break;
                case("C"):
                    rnArray.push("G");
                    break;
                case("G"):
                    rnArray.push("C");
                    break;
                case("T"):
                    rnArray.push("A");
                    break;
                default:
            }
        }
    }

}
