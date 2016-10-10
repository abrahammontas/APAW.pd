package miw.apiArchitecture.controllers;

import java.util.ArrayList;
import java.util.List;

import miw.apiArchitecture.daos.DaoFactory;
import miw.apiArchitecture.entities.Theme;
import miw.apiArchitecture.wrappers.OverageWrapper;
import miw.apiArchitecture.wrappers.ThemeListWrapper;
import miw.apiArchitecture.wrappers.ThemeWrapper;

public class ThemeController {

	public ThemeListWrapper themeList() {
		List<Theme> themeList = DaoFactory.getFactory().getThemeDao().findAll();
		List<ThemeWrapper> themeWrapperList = new ArrayList<>();
		for (Theme theme : themeList) {
			themeWrapperList.add(new ThemeWrapper(theme.getId(), theme.getName()));
		}
		ThemeListWrapper themeListWrapper = new ThemeListWrapper();
		themeListWrapper.setThemeList(themeWrapperList);
		return themeListWrapper;
	}

	public void createTheme(String themeName) {
		DaoFactory.getFactory().getThemeDao().create(new Theme(themeName));
	}

	public OverageWrapper themeOverage(int themeId) {
		List<Integer> voteValues= DaoFactory.getFactory().getVoteDao().findByThemeId(themeId);
		double total=0;
		for (Integer value : voteValues) {
			total+=value;
		}
		return new OverageWrapper(total/voteValues.size());
	}

}
