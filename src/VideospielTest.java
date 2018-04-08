import static org.junit.Assert.*;

import org.junit.Test;

public class VideospielTest 
{
	private static final String KOMMENTAR = "Kommentar";
    private static final String TITEL = "Titel";
    private static final String BEZEICHNUNG = "Videospiel";
    private static final String KONSOLE = "Konsole";
   
    private Videospiel _game1;
    private Videospiel _game2;

    public VideospielTest()
    {
        _game1 = getMedium();
        _game2 = getMedium();
    }

    @Test
    public void testGetMedienBezeichnung()
    {
        String gameBezeichnung = BEZEICHNUNG;
        assertEquals(gameBezeichnung, _game1.getMedienBezeichnung());
    }

    @Test
    public void testKonstruktor()
    {
        assertEquals(TITEL, _game1.getTitel());
        assertEquals(KOMMENTAR, _game1.getKommentar());
        assertEquals(KONSOLE, _game1.getKonsole());
        
    }

    @Test
    /*
     * Von ein und der selben Vdiespiel kann es mehrere Exemplare geben, die von
     * unterschiedlichen Personen ausgeliehen werden können.
     */
    public void testEquals()
    {
        assertFalse("Mehrere Exemplare des gleichen Videospiels sind gleich",
                _game1.equals(_game2));
        assertTrue("Mehrere Exemplare des gleichen Videospiels sind ungleich",
                _game1.equals(_game1));
    }

    protected Videospiel getMedium()
    {
        return new Videospiel(TITEL, KOMMENTAR, KONSOLE);
    }

}
