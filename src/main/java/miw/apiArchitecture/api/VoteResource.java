package miw.apiArchitecture.api;

import miw.apiArchitecture.controllers.VoteController;
import miw.apiArchitecture.exceptions.InvalidVoteException;
import miw.apiArchitecture.exceptions.NotFoundThemeIdException;
import miw.apiArchitecture.wrappers.VoteListWrapper;

public class VoteResource {

	// POST **/votes?themeId=*&vote=*
	public void createVote(int themeId, int vote) throws InvalidVoteException, NotFoundThemeIdException {
		if (vote < 0 || vote > 10) {
			throw new InvalidVoteException("" + vote);
		}
		if (!new VoteController().createVote(themeId, vote)) {
			throw new NotFoundThemeIdException("" + themeId);
		}
	}

	// GET **/votes
	public VoteListWrapper voteList() {
		return new VoteController().voteList();
	}
}
