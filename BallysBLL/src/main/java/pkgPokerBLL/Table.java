package pkgPokerBLL;

import java.io.Serializable;
import java.util.HashMap;
import java.util.UUID;

public class Table implements Serializable {

	private UUID TableID;

	HashMap<UUID, Player> TablePlayers = new HashMap<UUID, Player>();

	public Table() {
		super();
		TableID = UUID.randomUUID();
	}

	public Table AddPlayerToTable(Player p, UUID playerID) {
		this.TablePlayers.put(playerID, p);
		return this;
	}

	public Table RemovePlayerFromTable(Player p, UUID playerID) {
		this.TablePlayers.remove(playerID, p);
		return this;
	}
	public HashMap<UUID, Player> getHmPlayer() {
		  return TablePlayers;}
}
