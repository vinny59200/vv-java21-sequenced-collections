import java.util.ArrayList;
import java.util.List;

public class SequencedCollectionTest {
    public static void main( String[] args ) {
        List<String> championsImmutable = List.of( "Josh", "Venkat", "Ixchel", "Rafa", "Ben", "Lukas", "Nicolai", "Jeanne" );
        List<String> champions = new ArrayList<>( championsImmutable );

        champions.addFirst( "Andres" );
        champions.addLast( "Ken" );

        champions = champions.reversed();

        champions.removeFirst();
        champions.removeLast();

        System.out.println( champions.getFirst() );
        System.out.println( champions.getLast() );

    }
}
