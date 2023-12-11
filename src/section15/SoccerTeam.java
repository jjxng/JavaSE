package section15;

public class SoccerTeam implements Cloneable{

	public String name;		// 팁 이름
	public String location;	// 지역
	public String since;	// 창단연도
	public String league;	// 리그
	
	public SoccerTeam(
				String name,
				String location,
				String since,
				String league
			) {
		
		this.name = name;
		this.location = location;
		this.since = since;
		this.league = league;
	}
	
	@Override
	public String toString() {
		return name + "@" + league;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public Object callClone() throws CloneNotSupportedException {
		return clone();
	}
	
}
