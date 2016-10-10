package miw.apiArchitecture.wrappers;

import java.util.List;

public class ThemeListWrapper {
	List<ThemeWrapper> themeList;

	public List<ThemeWrapper> getThemeList() {
		return themeList;
	}

	public void setThemeList(List<ThemeWrapper> themeList) {
		this.themeList = themeList;
	}

	@Override
	public String toString() {
		String result = "{\"themeList\":[ ";
		for (ThemeWrapper themeWrapper : themeList) {
			result += themeWrapper.toString() + ",";
		}
		return result.substring(0, result.length() - 1) + "]}";
	}
}
