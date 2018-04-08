
public class Videospiel implements Medium {

    

    /**
     * Ein Kommentar zum Medium
     */
    private String _kommentar;

    /**
     * Der Titel des Mediums
     * 
     */ 
    private String _titel;
    
    /**
     * Die Konsole auf der das Videospiel läuft
     */
    private String _konsole;
    
    /**
     * Initialisiert ein neues Videospiel mit den gegebenen Daten.
     * 
     * @param titel Der Titel des Videospiels.
     * @param kommentar Ein Kommentar zu dem Videospiel.
     * @param hersteller Der Hersteller des Inhalts des Videospiels.
     * @param konsole Die Konsole auf dem das Spiel lauffähig ist.
     * 
     * @require titel != null
     * @require kommentar != null
     
     * @require konsole != null
     * 
     * @ensure getTitel() == titel
     * @ensure getKommentar() == kommentar
   
     * @ensure getKonsole() == konsole
     */
	public Videospiel(String titel, String kommentar, String konsole) 
	{	
		assert titel != null : "Vorbedingung verletzt: titel != null";
        assert kommentar != null : "Vorbedingung verletzt: kommentar != null";
        assert konsole != null : "Vorbedingung verletzt: konsole != null";
       
        _titel = titel.replaceAll("%", "%%");
        _kommentar = kommentar.replaceAll("%", "%%");
      
        _konsole = konsole.replaceAll("%", "%%");   
	}

	@Override
	public String getKommentar() 
	{
		return _kommentar;
	}

	@Override
	public String getMedienBezeichnung()
	{
		return "Videospiel";
	}

	@Override
	public String getTitel() 
	{
		return _titel;
	}
	
	/**
     * Gibt die Konsole auf dem das Spiel lauffähig ist zurück.
     * 
     * @return Die Konsole auf dem das Spiel lauffähig ist.
     * 
     * @ensure konsole != null
     */
	public String getKonsole() 
	{

		return _konsole;
	}

	@Override
	public String getFormatiertenString() {
		return String.format("Videospiel" + "|" + _titel + "|"+ _kommentar + "|" + _konsole);
	}

	


}
