/** 
 * Generated by Creer at 12:13AM on November 01, 2015 UTC, git hash: '1b69e788060071d644dd7b8745dca107577844e1'
 * The weather effect that will be applied at the end of a turn, which causes fires to spread.
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
 * The weather effect that will be applied at the end of a turn, which causes fires to spread.
 */
public class Forecast extends GameObject {
    /**
     * The Player that can use WeatherStations to control this Forecast when its the nextForecast.
     */
    public Player controllingPlayer;

    /**
     * The direction the wind will blow fires in. Can be 'north', 'east', 'south', or 'west'
     */
    public String direction;

    /**
     * How much of a Building's fire that can be blown in the direction of this Forecast. Fire is duplicated (copied), not moved (transfered).
     */
    public int intensity;


    // <<-- Creer-Merge: fields -->> - Code you add between this comment and the end comment will be preserved between Creer re-runs.
    // you can add addtional field(s) here. None of them will be tracked or updated by the server.
    // <<-- /Creer-Merge: fields -->>


    /**
     * Creates a new instance of Forecast. Used during game initialization, do not call directly.
     */
    public Forecast() {
        super();
    }

    // <<-- Creer-Merge: methods -->> - Code you add between this comment and the end comment will be preserved between Creer re-runs.
    // you can add addtional method(s) here.
    // <<-- /Creer-Merge: methods -->>
}