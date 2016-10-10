package es.upm.miw.apiArchitecture.api;

import es.upm.miw.apiArchitecture.controllers.VoteController;
import es.upm.miw.apiArchitecture.exceptions.InvalidVoteException;
import es.upm.miw.apiArchitecture.exceptions.NotFoundThemeIdException;
import es.upm.miw.apiArchitecture.wrappers.VoteListWrapper;

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
