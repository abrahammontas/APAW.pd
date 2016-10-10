package es.upm.miw.apiArchitecture.api;

import es.upm.miw.apiArchitecture.controllers.ThemeController;
import es.upm.miw.apiArchitecture.exceptions.InvalidThemeFieldException;
import es.upm.miw.apiArchitecture.exceptions.NotFoundThemeIdException;
import es.upm.miw.apiArchitecture.wrappers.OverageWrapper;
import es.upm.miw.apiArchitecture.wrappers.ThemeListWrapper;

public class ThemeResource {

	// GET **/themes
	public ThemeListWrapper themeList() {
		return new ThemeController().themeList();
	}

	// POST **/themes?themeName=*
	public void createTheme(String themeName) throws InvalidThemeFieldException {
		this.validateField(themeName);
		new ThemeController().createTheme(themeName);
	}

	private void validateField(String field) throws InvalidThemeFieldException {
		if (field == null || field.isEmpty()) {
			throw new InvalidThemeFieldException(field);
		}
	}

	// GET **themes/{id}/overage
	public OverageWrapper themeOverage(int themeId) throws NotFoundThemeIdException {
		OverageWrapper overageWrapper = new ThemeController().themeOverage(themeId);
		if (overageWrapper == null) {
			throw new NotFoundThemeIdException("" + themeId);
		} else {
			return overageWrapper;
		}
	}

}