package miw.apiArchitecture.api;

import miw.apiArchitecture.controllers.VoteController;
import miw.apiArchitecture.exceptions.InvalidVoteException;
import miw.apiArchitecture.exceptions.NotFoundThemeIdException;

// **/votes
public class VoteResource {

	// POST **?themeId=*&vote=*
	public void createVote(int themeId, int vote) throws InvalidVoteException, NotFoundThemeIdException {
		if (vote < 0 || vote > 10) {
			throw new InvalidVoteException("" + vote);
		}
		if (!new VoteController().createVote(themeId, vote)) {
			throw new NotFoundThemeIdException();
		}
	}
}
