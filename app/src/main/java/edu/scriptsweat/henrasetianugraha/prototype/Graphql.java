package edu.scriptsweat.henrasetianugraha.prototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Graphql extends AppCompatActivity {

    private String BASE_URL="https://secure-sierra-84794.herokuapp.com/api/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graphql);
    }

    public void intentGetAllProdukG(View view){
        Intent intent=new Intent(Graphql.this,DetailGraphql.class);
        intent.putExtra("url",BASE_URL+"{allProduk{id,sku,type,configurable_attributes,name,description,short_description,price,thumbnail,small_image,small_image,image,media_gallery,gender,brand,material_baju,momen_penggunaan,neck_type,childs{weight,color,size,qty}}}");
        intent.putExtra("title","Get All Produk");
        intent.putExtra("tag","get");
        startActivity(intent);
    }
    public void intentGetDetailProdukG(View view){
        Intent intent=new Intent(Graphql.this,DetailGraphql.class);
        intent.putExtra("url",BASE_URL+"{detailProduk(idProduk:\"950\"){id,sku,type,configurable_attributes,name,description,short_description,price,price,thumbnail,small_image,image,media_gallery,gender,brand,material_baju,momen_penggunaan,neck_type,childs{weight,color,size,qty}}}");
        intent.putExtra("title","Get Detail Produk");
        intent.putExtra("tag","get");
        startActivity(intent);
    }
    public void intentGetKeranjangG(View view){
        Intent intent=new Intent(Graphql.this,DetailGraphql.class);
        intent.putExtra("url",BASE_URL+"keranjang");
        intent.putExtra("title","Get Keranjang");
        intent.putExtra("tag","get");
        startActivity(intent);
    }
    public void intentGetRatingG(View view){
        Intent intent=new Intent(Graphql.this,DetailGraphql.class);
        intent.putExtra("url",BASE_URL+"{rating(idProduk:\"5357\"){idProduk,ratings{comment,rate,user}}}");
        intent.putExtra("title","Get Rating");
        intent.putExtra("tag","get");
        startActivity(intent);
    }
    public void intentGetWishlistG(View view){
        Intent intent=new Intent(Graphql.this,DetailGraphql.class);
        intent.putExtra("url",BASE_URL+"{wishlist(idUser:\"4353452\"){idUser,produks}}");
        intent.putExtra("title","Get Wishlist");
        intent.putExtra("tag","get");
        startActivity(intent);
    }
    public void intentAddKeranjangG(View view){
        Intent intent=new Intent(Graphql.this,DetailGraphql.class);
        intent.putExtra("url",BASE_URL+"mutation{keranjangAdd(idUser:\"4353452\",idProduk:\"444444\",jumlah:90){...on keranjangUpdated{ok,n,nModified}...on keranjangType{idUser,produks{idProduk,jumlah,tanggal}}}}");
        intent.putExtra("title","Add Keranjang");
        intent.putExtra("tag","post");
        startActivity(intent);
    }
    public void intentAddRatingG(View view){
        Intent intent=new Intent(Graphql.this,DetailGraphql.class);
        intent.putExtra("url",BASE_URL+"mutation{ratingAdd(idProduk:\"111\",comment:\"waw\",user:\"hahha\",rate:10){...on ratingUpdate{ok,n,nModified}...on ratingType{idProduk,ratings{comment,rate,user}}}}");
        intent.putExtra("title","Add Rating");
        intent.putExtra("tag","post");
        startActivity(intent);
    }
    public void intentAddWishlistG(View view){
        Intent intent=new Intent(Graphql.this,DetailGraphql.class);
        intent.putExtra("url",BASE_URL+"mutation{wishlistAdd(idUser:\"111\",idProduk:\"34234\"){...on wishlistUpdate{ok,n,nModified}...on wishlistType{idUser,produks}}}");
        intent.putExtra("title","Add Rating");
        intent.putExtra("tag","post");
        startActivity(intent);
    }
    public void intentDeleteKeranjang(View view){
        Intent intent=new Intent(Graphql.this,DetailGraphql.class);
        //put extra
        startActivity(intent);
    }
    public void intentDeleteWishlist(View view){
        Intent intent=new Intent(Graphql.this,DetailGraphql.class);
        //put extra
        startActivity(intent);
    }
}
