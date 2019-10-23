package lv.javaguru.lesson4;

public class PhraseAnalyser {

    public String analyse(String text) {

        final String FIRST = "Make";
        final String LAST = "great again";

        final String REZ1 = "It stands no chance";
        final String REZ2 = "It could be worse";
        final String REZ3 = "It is fine, really";

        boolean startsWithFIRST = text.startsWith(FIRST);
        boolean endsWithLAST = text.endsWith(LAST);

        if (startsWithFIRST && endsWithLAST) {
            return REZ1;
        } else if (startsWithFIRST ^ endsWithLAST) {
            return REZ2;
        } else {
            return REZ3;
        }
    }

}
