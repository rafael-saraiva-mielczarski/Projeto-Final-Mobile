package com.example.projetofinal.Services;

import android.content.Context;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.example.projetofinal.Repositories.CoinRepository;
import com.example.projetofinal.models.Coin;

import org.json.JSONException;
import org.json.JSONObject;

public class CoinsService {

    public static Coin coinFromJson(JSONObject json) {
        Coin coin = null;
        try {
            coin = new Coin(
                    json.getString("id"),
                    json.getString("symbol"),
                    json.getString("name"),
                    json.getString("image"),
                    json.getInt("current_price"),
                    json.getInt("market_cap"),
                    json.getInt("market_cap_rank"),
                    json.getInt("fully_diluted_valuation"),
                    json.getInt("total_volume"),
                    json.getInt("high_24h"),
                    json.getInt("low_24h"),
                    json.getInt("price_change_24h"),
                    json.getInt("price_change_percentage_24h"),
                    json.getInt("market_cap_change_24h"),
                    json.getInt("market_cap_change_percentage_24h"),
                    json.getInt("circulating_supply"),
                    json.getInt("total_supply"),
                    json.getInt("max_supply"),
                    json.getInt("ath"),
                    json.getInt("ath_change_percentage"),
                    json.getInt("atl"),
                    json.getInt("atl_change_percentage"));
        } catch (JSONException e) {
            System.out.println("erro no Json. Fogo no parquinho "+e.getMessage());
        }
        return coin;
    }

    public static void getAllCoins(Context contexto, ServiceDone callback) {

        JsonArrayRequest request = new JsonArrayRequest(Request.Method.GET,
                "https://api.coingecko.com/api/v3/coins/markets?vs_currency=brl&order=market_cap_desc&per_page=100&page=1&sparkline=false&locale=en", null,
                response -> {
                    System.out.println("recebi o retorno!");
                    for (int i = 0; i < response.length(); i++) {
                        try {
                            JSONObject json = response.getJSONObject(i);
                            CoinRepository.getInstance().addCoin( coinFromJson(json) );
                        } catch (JSONException e) {
                            System.out.println("erro no Json. Fogo no parquinho "+e.getMessage());
                        }
                    }
                    if (callback != null) {
                        callback.onServiceDone();
                    }
                },
                error->{
                    Toast.makeText(contexto, "Ocorreu uma falha na requisição "+error.getMessage(), Toast.LENGTH_LONG).show();
                });
        RequestQueue queue = Volley.newRequestQueue(contexto);
        System.out.println("antes de ir para a queue");
        queue.add(request);
        System.out.println("depois de ir para a queue");
    }
}
