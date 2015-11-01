/** 
 * Generated by Creer at 04:49PM on November 01, 2015 UTC, git hash: '1b69e788060071d644dd7b8745dca107577844e1'
 * A typical abandoned warehouse... that anarchists hang out in and can be bribed to burn down Buildings.
 */
package games.anarchy;

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
 * A typical abandoned warehouse... that anarchists hang out in and can be bribed to burn down Buildings.
 */
public class Warehouse extends Building {
    /**
     * How exposed the anarchists in this warehouse are to PoliceStations. Raises when bribed to ignite buildings, and drops each turn if not bribed.
     */
    public int exposure;

    /**
     * The amount of fire added to buildings when bribed to ignite a building. Headquarters add more fire than normal Warehouses.
     */
    public int fireAdded;


    // <<-- Creer-Merge: fields -->> - Code you add between this comment and the end comment will be preserved between Creer re-runs.
    // you can add addtional field(s) here. None of them will be tracked or updated by the server.
    // <<-- /Creer-Merge: fields -->>


    /**
     * Creates a new instance of Warehouse. Used during game initialization, do not call directly.
     */
    public Warehouse() {
        super();
    }

    /**
     * Bribes the Warehouse to light a Building on fire. This adds this building's fireAdded to their fire, and then this building's exposure is increased based on the Manhatten distance between the two buildings.
     *
     * @param   building  The Building you want to light on fire.
     * @return The exposure added to this Building's exposure. -1 is returned if there was an error.
     */
    public int ignite(Building building) {
        JSONObject args = new JSONObject();
        args.put("building", building);
        return (int)this.runOnServer("ignite", args);
    }

    // <<-- Creer-Merge: methods -->> - Code you add between this comment and the end comment will be preserved between Creer re-runs.
    // you can add addtional method(s) here.
    // <<-- /Creer-Merge: methods -->>
}
