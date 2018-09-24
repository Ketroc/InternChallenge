package shopify.jonathan.org.internchallenge;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class RetroProduct {

    //name, inventory count, image
    @SerializedName("id")
    private String id;

    @SerializedName("title")
    private String name;

    private ArrayList<RetroProductVariant> variants;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<RetroProductVariant> getVariants() {
        return variants;
    }

    public void setVariants(ArrayList<RetroProductVariant> variants) {
        this.variants = variants;
    }

    public int getInventoryCount() {
        int count = 0;
        for (RetroProductVariant temp : variants) {
            count += temp.getInventoryCount();
        }
        return count;
    }

    public String getFirstImageUrl() {
        //use first variant's image
        return variants.get(0).getImageUrl();
    }

}
