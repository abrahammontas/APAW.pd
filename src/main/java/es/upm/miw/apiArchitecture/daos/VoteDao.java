package es.upm.miw.apiArchitecture.daos;

import java.util.List;

import es.upm.miw.apiArchitecture.entities.Vote;

public interface VoteDao extends GenericDao<Vote, Integer> {
	List<Integer> findByThemeId(int themeId);
}
