package miw.apiArchitecture.daos.memory;

import miw.apiArchitecture.daos.DaoFactory;
import miw.apiArchitecture.daos.ThemeDao;
import miw.apiArchitecture.daos.VoteDao;

public class DaoFactoryMemory extends DaoFactory {

	private ThemeDao themeDao;
	private VoteDao voteDao;

	public DaoFactoryMemory() {
	}

	@Override
	public ThemeDao getThemeDao() {
		if (themeDao == null) {
			themeDao = new ThemeDaoMemory();
		}
		return themeDao;
	}

	@Override
	public VoteDao getVoteDao() {
		if (voteDao == null) {
			voteDao = new VoteDaoMemory();
		}
		return voteDao;
	}

}
