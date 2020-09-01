public class Main {

    public static void main(String[] args) {

        /*
            Ord,som udelukkende er skrevet med store bogstaver,skal ikke ændres.
            Ord på mere end 3 bogstaver skal skrives med småt, dog med stort begyndelses bogstav.
            Ord på max.3 bogstaver skal skrives med småt.
        */

        String s = "HEJ med TEST";

        ProperCase(s);

    }

    public static void ProperCase (String s) {


        if ( s.length() < 3 ) {
            System.out.println(s.toLowerCase());
            return;

        } else if ( s.equals(s.toUpperCase())) {
            System.out.println(s);
            return;

        } else if ( s.length() > 3 ) {
            System.out.println( s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase() );
            return;

        }
    }
}
