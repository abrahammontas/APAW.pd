package miw.apiArchitecture.api;

import miw.apiArchitecture.controllers.ThemeController;
import miw.apiArchitecture.exceptions.InvalidThemeFieldException;
import miw.apiArchitecture.exceptions.NotFoundThemeIdException;
import miw.apiArchitecture.wrappers.OverageWrapper;
import miw.apiArchitecture.wrappers.ThemeListWrapper;

// **/themes
public class ThemeResource {

	// GET
	public ThemeListWrapper themeList() {
		return new ThemeController().themeList();
	}

	// POST **?themeName=*
	public void createTheme(String themeName) throws InvalidThemeFieldException {
		this.validateField(themeName);
		new ThemeController().createTheme(themeName);
	}

	private void validateField(String field) throws InvalidThemeFieldException {
		if (field == null || field.isEmpty()) {
			throw new InvalidThemeFieldException(field);
		}
	}

	// GET **/{id}/overage
	public OverageWrapper themeOverage(int themeId) throws NotFoundThemeIdException {
		OverageWrapper overageWrapper = new ThemeController().themeOverage(themeId);
		if (overageWrapper == null) {
			throw new NotFoundThemeIdException("" + themeId);
		}
		return overageWrapper;
	}

}
