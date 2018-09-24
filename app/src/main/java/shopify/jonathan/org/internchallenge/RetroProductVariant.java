package shopify.jonathan.org.internchallenge;

import com.google.gson.annotations.SerializedName;

public class RetroProductVariant {
    @SerializedName("inventory_quantity")
    private int inventoryCount;

    @SerializedName("src")
    private String imageUrl;

    public int getInventoryCount() {
        return inventoryCount;
    }

    public void setInventoryCount(int inventoryCount) {
        this.inventoryCount = inventoryCount;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}
