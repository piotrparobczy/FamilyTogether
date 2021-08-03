package webapp.familyTogether.dto;


import webapp.familyTogether.model.Wishlist;

public class WishlistDto {
    private String id;
    private String iWant;

    public WishlistDto(Wishlist wishlist) {
        this.id = wishlist.getId().toString();
        this.iWant = wishlist.getiWant();
    }


}
