package es.upm.miw.apiArchitecture.controllers;

import java.util.List;

import es.upm.miw.apiArchitecture.daos.DaoFactory;
import es.upm.miw.apiArchitecture.entities.Theme;
import es.upm.miw.apiArchitecture.wrappers.OverageWrapper;
import es.upm.miw.apiArchitecture.wrappers.ThemeListWrapper;
import es.upm.miw.apiArchitecture.wrappers.ThemeWrapper;

public class ThemeController {

	public ThemeListWrapper themeList() {
		List<Theme> themeList = DaoFactory.getFactory().getThemeDao().findAll();
		ThemeListWrapper themeListWrapper = new ThemeListWrapper();
		for (Theme theme : themeList) {
			themeListWrapper.addThemeWrapper(new ThemeWrapper(theme.getId(), theme.getName()));
		}
		return themeListWrapper;
	}

	public void createTheme(String themeName) {
		DaoFactory.getFactory().getThemeDao().create(new Theme(themeName));
	}

	public OverageWrapper themeOverage(int themeId) {
		if (DaoFactory.getFactory().getThemeDao().read(themeId) == null) {
			return null;
		}
		List<Integer> voteValues = DaoFactory.getFactory().getVoteDao().findByThemeId(themeId);
		double total = 0;
		for (Integer value : voteValues) {
			total += value;
		}
		return new OverageWrapper(total / voteValues.size());
	}

}
