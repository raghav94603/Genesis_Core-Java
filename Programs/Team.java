import java.util.*;

public class Team {
	String Teamname;
	ArrayList<String> l = new ArrayList<>();
	public String getTeamname() {
		return Teamname;
	}
	public void setTeamname(String teamname) {
		Teamname = teamname;
	}
	public ArrayList<String> getL() {
		return l;
	}
	public void setL(ArrayList<String> l) {
		this.l = l;
	}
	public Team(String teamname) {
		super();
		Teamname = teamname;
	}
	public String addplayer(String playername)
	{
	 
	}
	public ArrayList<String> getplayerlist()
	{
	    Collections.sort(l);
	    return l;
		
	}
	

}
