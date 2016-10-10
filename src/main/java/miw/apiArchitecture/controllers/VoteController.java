package miw.apiArchitecture.controllers;

import miw.apiArchitecture.daos.DaoFactory;
import miw.apiArchitecture.entities.Theme;
import miw.apiArchitecture.entities.Vote;

public class VoteController {

	public boolean createVote(int themeId, int vote) {
		Theme theme = DaoFactory.getFactory().getThemeDao().read(themeId);
		if (theme != null) {
			DaoFactory.getFactory().getVoteDao().create(new Vote(vote, theme));
			return true;
		} else {
			return false;
		}
	}

}
