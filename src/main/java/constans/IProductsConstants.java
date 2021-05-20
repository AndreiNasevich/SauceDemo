package constans;

public interface IProductsConstants {
    String PRODUCT_ITEM = "//*[text()='%s']/ancestor::*[@class='cart_item']";
    String PRODUCT_PRICE = PRODUCT_ITEM + "//*[@class='inventory_item_price']";
    String PRODUCT_QUANTITY = PRODUCT_ITEM + "//*[@class='cart_quantity']";
    String BUTTON_ITEM = "//*[text()='%s']/ancestor::*";
    String ADD_AND_REMOVE_PRODUCT_TO_CART_BUTTON = BUTTON_ITEM + "[@class='inventory_item']//button";
    String REMOVE_PRODUCT_FROM_CART_BUTTON = BUTTON_ITEM + "[@class='cart_item_label']//button";
}