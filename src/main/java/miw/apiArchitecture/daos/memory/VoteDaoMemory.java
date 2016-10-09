package miw.apiArchitecture.daos.memory;

import miw.apiArchitecture.daos.VoteDao;
import miw.apiArchitecture.entities.Vote;

public class VoteDaoMemory extends GenericMemoryDao<Vote> implements VoteDao {

	@Override
	protected Integer getId(Vote entity) {
		return entity.getId();
	}

	@Override
	protected void setId(Vote entity, Integer id) {
		entity.setId(id);
	}


}