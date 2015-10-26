/** 
 * Generated by Creer at 02:31PM on October 26, 2015 UTC, git hash: '98604e3773d1933864742cb78acbf6ea0b4ecd7b'
 * An object in the game. The most basic class that all game classes should inherit from automatically.
 */
package games.checkers;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import org.json.JSONObject;

import joueur.BaseGame;
import joueur.BaseGameObject;
// <<-- Creer-Merge: imports -->> - Code you add between this comment and the end comment will be preserved between Creer re-runs.
// you can add addtional import(s) here
// <<-- /Creer-Merge: imports -->>
@SuppressWarnings("unused")

/**
 * An object in the game. The most basic class that all game classes should inherit from automatically.
 */
public class GameObject extends BaseGameObject {
    /**
     * String representing the top level Class that this game object is an instance of. Used for reflection to create new instances on clients, but exposed for convenience should AIs want this data.
     */
    public String gameObjectName;

    /**
     * Any strings logged will be stored here when this game object logs the strings. Intended for debugging.
     */
    public List<String> logs;


    // <<-- Creer-Merge: fields -->> - Code you add between this comment and the end comment will be preserved between Creer re-runs.
    // you can add addtional field(s) here. None of them will be tracked or updated by the server.
    // <<-- /Creer-Merge: fields -->>


    /**
     * Creates a new instance of GameObject. Used during game initialization, do not call directly.
     */
    public GameObject() {
        super();
        this.logs = new ArrayList<String>();
    }

    /**
     * adds a message to this game object's log. Intended for debugging purposes.
     *
     * @param   message  A string to add to this GameObject's log. Intended for debugging.
     */
    public void log(String message) {
        JSONObject args = new JSONObject();
        args.put("message", message);
        this.runOnServer("log", args);
    }

    // <<-- Creer-Merge: methods -->> - Code you add between this comment and the end comment will be preserved between Creer re-runs.
    // you can add addtional method(s) here.
    // <<-- /Creer-Merge: methods -->>
}
