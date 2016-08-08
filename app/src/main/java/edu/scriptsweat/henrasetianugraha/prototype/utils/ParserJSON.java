package edu.scriptsweat.henrasetianugraha.prototype.utils;

import com.google.gson.Gson;

import java.io.IOException;

import edu.scriptsweat.henrasetianugraha.prototype.model.ProdukModel;

/**
 * Created by Henra Setia Nugraha on 8/7/2016.
 */

public class ParserJSON {
    private static Gson gson;

    public static ProdukModel parseAllProduk(String json) throws IOException{
        gson=new Gson();
        return gson.fromJson(json,ProdukModel.class);
    }

    public static String parseRating(String json) throws IOException{
        gson=new Gson();
        return gson.fromJson(json,String.class);
    }
}
