package miw.apiArchitecture.daos.memory;

import miw.apiArchitecture.daos.ThemeDao;
import miw.apiArchitecture.entities.Theme;

public class ThemeDaoMemory extends GenericMemoryDao<Theme> implements ThemeDao {

	@Override
	protected Integer getId(Theme entity) {
		return entity.getId();
	}

	@Override
	protected void setId(Theme entity, Integer id) {
		entity.setId(id);
		
	}

}