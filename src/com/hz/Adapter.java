package com.hz;

public class Adapter extends ConsoleReader {

    private final String[] values = new String[] {"true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"};

    public String[] getValues() {
        return values;
    }


    @Override
    public String readLine() {

        return super.readLine();

    }


}
