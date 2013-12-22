import javax.swing.JOptionPane;


public class joptionPane {

	private static String BOITE_ERREUR = "Bo�te d'erreur";
	private static String BOITE_INFORMATION = "Bo�te d'information";
	private static String BOITE_SIMPLEMESSAGE = "Bo�te d'une simple message";
	private static String BOITE_QUESTION = "Bo�te de question";
	private static String BOITE_AVERTISSEMENT = "Bo�te d'avertissement";

	private static String MESSAGE_ERREUR = "Un message d'erreur.";
	private static String MESSAGE_INFORMATION = "Un message d'information.";
	private static String SIMPLE_MESSAGE = "Un simple message.";
	private static String QUESTION = "Poser une question.";
	private static String MESSAGE_AVERTISSEMENT = "Un message d'avertissement.";

	public static void afficherBoiteMessageErreur () {
		JOptionPane.showMessageDialog ( null,
				MESSAGE_ERREUR,
                BOITE_ERREUR,
                JOptionPane.ERROR_MESSAGE );
	}
	
	public static void afficherBoiteMessageInformation () {
		JOptionPane.showMessageDialog ( null,
				MESSAGE_INFORMATION,
                BOITE_INFORMATION,
                JOptionPane.INFORMATION_MESSAGE );
	}

	public static void afficherBoiteMessage () {
		JOptionPane.showMessageDialog ( null,
				SIMPLE_MESSAGE,
                BOITE_SIMPLEMESSAGE,
                JOptionPane.PLAIN_MESSAGE );
	}

	public static void afficherBoiteQuestion () {

		JOptionPane.showMessageDialog ( null,
				QUESTION,
				BOITE_QUESTION,
                JOptionPane.QUESTION_MESSAGE );
	}

	public static void afficherBoiteAvertissement () {
		JOptionPane.showMessageDialog ( null,
				MESSAGE_AVERTISSEMENT,
				BOITE_AVERTISSEMENT,
                JOptionPane.WARNING_MESSAGE );
	}

	public static void indiquerChoixDeBoite (int choix ) {
		
		int type = choix;
		
		switch ( type ) {
			case 0 : afficherBoiteMessageErreur ();
			break;
			
			case 1 : afficherBoiteMessageInformation ();
			break;
			
			case 2 : afficherBoiteMessage () ;
			break;
			
			case 3 : afficherBoiteQuestion ();
			break;
		
			case 4 : afficherBoiteAvertissement ();
			break;
			
			default : System.out.println("type invalide");
			break;
		}
	
	}
	/**
	 * Exemples de boites de dialogues
	 */
	public static void main(String[] args) {
		
		 String[] typesMessages = {"message d'erreur", "message d'information", "simple message", "poser une question", "message d'avertissement"};
		 int type = JOptionPane.showOptionDialog(null, 
		      "Veuillez indiquer quel bo�te de dialogue vous voulez voir ?",
		      "Bo�tes de dialogue",
		      JOptionPane.YES_NO_CANCEL_OPTION,
		      JOptionPane.QUESTION_MESSAGE,
		      null,
		      typesMessages,
		      typesMessages[0]);
		 
		 JOptionPane.showMessageDialog(null, "Votre choix est de voir la bo�te de dialogue de type :  " + typesMessages[type], "Choix", JOptionPane.INFORMATION_MESSAGE);
		 indiquerChoixDeBoite ( type ); 
		 
	}

}
