/**
 * The traditional 6x7 board with pieces.
 */

// DO NOT MODIFY THIS FILE
// Never try to directly create an instance of this class, or modify its member variables.
// Instead, you should only be reading its variables and calling its functions.

package games.connectFour;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import org.json.JSONObject;
import joueur.Client;
import joueur.BaseGame;
import joueur.BaseGameObject;

// <<-- Creer-Merge: imports -->> - Code you add between this comment and the end comment will be preserved between Creer re-runs.
// you can add additional import(s) here
// <<-- /Creer-Merge: imports -->>

/**
 * The traditional 6x7 board with pieces.
 */
public class Game extends BaseGame {
    /**
     * The number of tiles on the board along the y (vertical) axis.
     */
    public int cols;

    /**
     * List of all the players in the game.
     */
    public List<Player> players;

    /**
     * A string describing all of the information necessary to fully represent the game's state.
     */
    public String repString;

    /**
     * The number of cells on the board along the x (horizontal) axis.
     */
    public int rows;

    /**
     * A unique identifier for the game instance that is being played.
     */
    public String session;


    // <<-- Creer-Merge: fields -->> - Code you add between this comment and the end comment will be preserved between Creer re-runs.
    // you can add additional field(s) here. None of them will be tracked or updated by the server.
    // <<-- /Creer-Merge: fields -->>

    /**
     * The hash of the game version we have locally. Used to compare to the game server's game version.
     */
    public final static String gameVersion = "ff3da34375459be10b77fd8f82b24d9880f0a100e48e2202812118bfcfd42e1e";


    /**
     * Creates a new instance of a Game. Used during game initialization, do not call directly.
     */
    protected Game() {
        super();
        this.name = "ConnectFour";

        this.players = new ArrayList<Player>();
    }

    // <<-- Creer-Merge: methods -->> - Code you add between this comment and the end comment will be preserved between Creer re-runs.
    // you can add additional method(s) here.
    // <<-- /Creer-Merge: methods -->>
}
