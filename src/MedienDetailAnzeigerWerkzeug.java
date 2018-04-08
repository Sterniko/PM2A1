

import java.util.List;

import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;

/**
 * Ein MedienDetailAnzeigerWerkzeug ist ein Werkzeug um die Details von Medien
 * anzuzeigen.
 * 
 * @author SE2-Team, PM2-Team
 * @version SoSe 2018
 */
class MedienDetailAnzeigerWerkzeug
{
    private MedienDetailAnzeigerUI _ui;

    /**
     * Initialisiert ein neues MedienDetailAnzeigerWerkzeug.
     */
    public MedienDetailAnzeigerWerkzeug()
    {
        _ui = new MedienDetailAnzeigerUI();
    }

    /**
     * Setzt die Liste der Medien deren Details angezeigt werden sollen.
     * 
     * @param medien Eine Liste von Medien.
     * 
     * @require (medien != null)
     */
	public void setMedien(List<Medium> medien) {
		assert medien != null : "Vorbedingung verletzt: (medien != null)";
		boolean praktikum = true;
		String text = "";

		for (Medium m : medien) {
			if (praktikum) {
				text += m.getMedienBezeichnung() + "|" + m.getTitel() + "|";
				String add = "";

				if (m instanceof CD) {
					CD c = (CD) m;
					add = String.format(c.getInterpret() + "|" + c.getKommentar() + "|" + c.getSpiellaenge() + "min");
				} else if (m instanceof DVD) {

					DVD d = (DVD) m;
					add = String.format(d.getKommentar() + "|" + d.getRegisseur() + "|" + d.getLaufzeit() + "min");
				} else if (m instanceof Videospiel) {

					Videospiel v = (Videospiel) m;
					add = String.format(v.getKommentar() + "|" + v.getKonsole());
				}
				text += add + "\n";
			} else {
				text += m.getFormatiertenString() + "\n";
			}

		}
		TextArea selectedMedienTextArea = _ui.getMedienAnzeigerTextArea();
		selectedMedienTextArea.setText(text);
	}

    /**
     * Gibt das Panel dieses Subwerkzeugs zurück.
     * 
     * @ensure result != null
     */
    public Pane getUIPane()
    {
        return _ui.getUIPane();
    }
}
