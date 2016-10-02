/**
 * A player in this game. Every AI controls one player.
 */
package games.saloon;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import org.json.JSONObject;
import joueur.Client;
import joueur.BaseGame;
import joueur.BaseGameObject;

// <<-- Creer-Merge: imports -->> - Code you add between this comment and the end comment will be preserved between Creer re-runs.
// you can add addtional import(s) here
// <<-- /Creer-Merge: imports -->>

/**
 * A player in this game. Every AI controls one player.
 */
public class Player extends GameObject {
    /**
     * What type of client this is, e.g. 'Python', 'JavaScript', or some other language. For potential data mining purposes.
     */
    public String clientType;

    /**
     * Every Cowboy owned by this Player.
     */
    public List<Cowboy> cowboys;

    /**
     * How many enemy Cowboys this player's team has killed.
     */
    public int kills;

    /**
     * If the player lost the game or not.
     */
    public boolean lost;

    /**
     * The name of the player.
     */
    public String name;

    /**
     * This player's opponent in the game.
     */
    public Player opponent;

    /**
     * The reason why the player lost the game.
     */
    public String reasonLost;

    /**
     * The reason why the player won the game.
     */
    public String reasonWon;

    /**
     * How rowdy their team is. When it gets too high their team takes a collective siesta.
     */
    public int rowdyness;

    /**
     * How many times their team has played a piano.
     */
    public int score;

    /**
     * 0 when not having a team siesta. When greater than 0 represents how many turns left for the team siesta to complete.
     */
    public int siesta;

    /**
     * The amount of time (in ns) remaining for this AI to send commands.
     */
    public double timeRemaining;

    /**
     * If the player won the game or not.
     */
    public boolean won;

    /**
     * The only 'Yong Gun' Cowboy this player owns, or null if they called in their young gun during their turn.
     */
    public Cowboy youngGun;


    // <<-- Creer-Merge: fields -->> - Code you add between this comment and the end comment will be preserved between Creer re-runs.
    // you can add addtional field(s) here. None of them will be tracked or updated by the server.
    // <<-- /Creer-Merge: fields -->>


    /**
     * Creates a new instance of a Player. Used during game initialization, do not call directly.
     */
    public Player() {
        super();
        this.cowboys = new ArrayList<Cowboy>();
    }

    /**
     * Sends in the Young Gun to the nearest Tile into the Saloon, and promotes them to a new job.
     *
     * @param   job  The job you want the Young Gun being brought in to be called in to do, changing their job to it.
     * @return The Cowboy that was previously a 'Young Gun', and has now been promoted to a different job if successful, null otherwise.
     */
    public Cowboy sendIn(String job) {
        JSONObject args = new JSONObject();
        args.put("job", Client.getInstance().gameManager.serializeSafe(job));
        return (Cowboy)this.runOnServer("sendIn", args);
    }

    // <<-- Creer-Merge: methods -->> - Code you add between this comment and the end comment will be preserved between Creer re-runs.
    // you can add addtional method(s) here.
    // <<-- /Creer-Merge: methods -->>
}
