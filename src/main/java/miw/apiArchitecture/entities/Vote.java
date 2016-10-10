package miw.apiArchitecture.entities;

public class Vote {

    private int id;

    private int vote;

    private Theme theme;

    public Vote() {
    }

    public Vote(int vote, Theme theme) {
        this.vote = vote;
        this.theme = theme;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
		this.id = id;
	}

	public int getVote() {
        return vote;
    }

    public Theme getTheme() {
        return theme;
    }

}
