package edu.scriptsweat.henrasetianugraha.prototype.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Henra Setia Nugraha on 8/7/2016.
 */

public class ProdukModel {

    public ArrayList<Data> data;

    public ArrayList<Data> getData() {
        return data;
    }

    public void setData(ArrayList<Data> data) {
        this.data = data;
    }

    public class Data{
        public String id;
        public String sku;
        public List<String> configurable_attributes;
        public String name;
        public String description;
        public String short_description;
        public String price ;
        public String thumbnail;
        public String small_image;
        public String image;
        public List<String> media_gallery;
        public String gender;
        public String brand;
        public String material_baju;
        public String momen_penggunaan;
        public String neck_type;
        public ArrayList<Childs> childs;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getSku() {
            return sku;
        }

        public void setSku(String sku) {
            this.sku = sku;
        }

        public List<String> getConfigurable_attributes() {
            return configurable_attributes;
        }

        public void setConfigurable_attributes(List<String> configurable_attributes) {
            this.configurable_attributes = configurable_attributes;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getShort_description() {
            return short_description;
        }

        public void setShort_description(String short_description) {
            this.short_description = short_description;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        public String getSmall_image() {
            return small_image;
        }

        public void setSmall_image(String small_image) {
            this.small_image = small_image;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public List<String> getMedia_gallery() {
            return media_gallery;
        }

        public void setMedia_gallery(List<String> media_gallery) {
            this.media_gallery = media_gallery;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getMaterial_baju() {
            return material_baju;
        }

        public void setMaterial_baju(String material_baju) {
            this.material_baju = material_baju;
        }

        public String getMomen_penggunaan() {
            return momen_penggunaan;
        }

        public void setMomen_penggunaan(String momen_penggunaan) {
            this.momen_penggunaan = momen_penggunaan;
        }

        public String getNeck_type() {
            return neck_type;
        }

        public void setNeck_type(String neck_type) {
            this.neck_type = neck_type;
        }

        public ArrayList<Childs> getChilds() {
            return childs;
        }

        public void setChilds(ArrayList<Childs> childs) {
            this.childs = childs;
        }
    }

    public class Childs{
        public Integer weight;
        public String color ;
        public String size ;
        public Integer qty;

        public Integer getWeight() {
            return weight;
        }

        public void setWeight(Integer weight) {
            this.weight = weight;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public Integer getQty() {
            return qty;
        }

        public void setQty(Integer qty) {
            this.qty = qty;
        }
    }
}
