/**
 * A bottle thrown by a bartender at a Tile.
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
 * A bottle thrown by a bartender at a Tile.
 */
public class Bottle extends GameObject {
    /**
     * The direction any Cowboys hit by this will move, can be 'North', 'East', 'South', or 'West'.
     */
    public String drunkDirection;

    /**
     * True if this Bottle has impacted and has been destroyed (removed from the Game). False if still in the game flying through the saloon.
     */
    public boolean isDestroyed;

    /**
     * The Tile this bottle is currently flying over.
     */
    public Tile location;

    /**
     * The Tile this Bottle will fly to next turn, if it does not impact anything on its path between the two.
     */
    public Tile nextLocation;


    // <<-- Creer-Merge: fields -->> - Code you add between this comment and the end comment will be preserved between Creer re-runs.
    // you can add addtional field(s) here. None of them will be tracked or updated by the server.
    // <<-- /Creer-Merge: fields -->>


    /**
     * Creates a new instance of a Bottle. Used during game initialization, do not call directly.
     */
    public Bottle() {
        super();
    }

    // <<-- Creer-Merge: methods -->> - Code you add between this comment and the end comment will be preserved between Creer re-runs.
    // you can add addtional method(s) here.
    // <<-- /Creer-Merge: methods -->>
}