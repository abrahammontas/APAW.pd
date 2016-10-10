package miw.apiArchitecture.daos.memory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import miw.apiArchitecture.daos.VoteDao;
import miw.apiArchitecture.entities.Vote;

public class VoteDaoMemory extends GenericMemoryDao<Vote> implements VoteDao {

	public VoteDaoMemory() {
		this.setMap(new HashMap<Integer,Vote>());
	}

	@Override
	protected Integer getId(Vote entity) {
		return entity.getId();
	}

	@Override
	protected void setId(Vote entity, Integer id) {
		entity.setId(id);
	}

	@Override
	public List<Integer> findByThemeId(int themeId) {
		List<Vote> votes = this.findAll();
		List<Integer> votesValue = new ArrayList<>();
		for (Vote vote : votes) {
			if (vote.getTheme().getId() == themeId) {
				votesValue.add(vote.getVote());
			}
		}
		return votesValue;
	}

}