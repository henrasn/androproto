package edu.scriptsweat.henrasetianugraha.prototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Rest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rest);
    }

    public void intentGetAllProdukR(View view){
        Intent intent=new Intent(Rest.this,DetailRest.class);
//        intent.putExtra("url","https://raw.github.com/square/okhttp/master/README.md");
        intent.putExtra("url","https://scriptsweat-rest.herokuapp.com/api/produk");
        intent.putExtra("title","Get All Produk");
        intent.putExtra("tag","get");
        startActivity(intent);
    }
    public void intentGetDetailProdukR(View view){
        Intent intent=new Intent(Rest.this,DetailRest.class);
        intent.putExtra("url","https://scriptsweat-rest.herokuapp.com/api/produk/detail/950");
        intent.putExtra("title","Get Detail Produk");
        intent.putExtra("tag","get");
        startActivity(intent);
    }
    public void intentGetKeranjangR(View view){
        Intent intent=new Intent(Rest.this,DetailRest.class);
        intent.putExtra("url","https://scriptsweat-rest.herokuapp.com/api/keranjang/4353452");
        intent.putExtra("title","Get Keranjang");
        intent.putExtra("tag","get");
        startActivity(intent);
    }
    public void intentGetRatingR(View view){
        Intent intent=new Intent(Rest.this,DetailRest.class);
        intent.putExtra("url","https://scriptsweat-rest.herokuapp.com/api/produk/rating/5357");
        intent.putExtra("title","Get Rating");
        intent.putExtra("tag","get");
        startActivity(intent);
    }
    public void intentGetWishlistR(View view){
        Intent intent=new Intent(Rest.this,DetailRest.class);
        intent.putExtra("url","https://scriptsweat-rest.herokuapp.com/api/produk/wishlist/234241");
        intent.putExtra("title","Get Wishlist");
        intent.putExtra("tag","get");
        startActivity(intent);
    }
    public void intentAddKeranjangR(View view){
        Intent intent=new Intent(Rest.this,DetailRest.class);
        intent.putExtra("url","https://scriptsweat-rest.herokuapp.com/api/keranjang/4353452");
        intent.putExtra("title","Add keranjang");
        intent.putExtra("req","keranjang");
        intent.putExtra("tag","post");
        startActivity(intent);
    }
    public void intentAddRatingR(View view){
        Intent intent=new Intent(Rest.this,DetailRest.class);
        intent.putExtra("url","https://scriptsweat-rest.herokuapp.com/api/produk/rating/5357");
        intent.putExtra("title","Add Rating");
        intent.putExtra("req","rating");
        intent.putExtra("tag","post");
        startActivity(intent);
    }
    public void intentAddWishlistR(View view){
        Intent intent=new Intent(Rest.this,DetailRest.class);
        intent.putExtra("url","https://scriptsweat-rest.herokuapp.com/api/produk/wishlist/4353452");
        intent.putExtra("title","Add Wishlist");
        intent.putExtra("req","wishlist");
        intent.putExtra("tag","post");
        startActivity(intent);
    }
}
