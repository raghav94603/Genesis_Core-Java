
import java.util.*;
	public class Player implements Comparable<Player> {
		
		String Playername;
		
		public String getPlayername() {
			return Playername;
		}
		public void setPlayername(String playername) {
			Playername = playername;
		}

		public Player(String playername) {
			super();
			Playername = playername;
		}

		 public String toString() {
		 return;
		 }

		@Override
		public int compareTo(Player o) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}