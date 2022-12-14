
package me.telegram.bot;

import com.pengrad.telegrambot.model.CallbackQuery;
import com.pengrad.telegrambot.model.request.InlineKeyboardButton;
import com.pengrad.telegrambot.model.request.InlineKeyboardMarkup;
import com.pengrad.telegrambot.request.EditMessageCaption;
import com.pengrad.telegrambot.request.EditMessageReplyMarkup;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order extends AbstractOrder {
    private Integer orderID;
    private Long orderChatID;
    private int orderMessageID;
    private int priceCoffee;
    private int milkPrice;
    private int sizePrice;
    private int orderPrice;

    private String coffeeName;
    private String coffeeDescription;
    private String witchSize;
    private String witchMilk;
    private String invoiceLink;
    private String comment;
    private String customer;
    private boolean itsAComment;



/*
    public EditMessageReplyMarkup orderKeyboardChooseMilk(Order order) {

        return new EditMessageReplyMarkup(order.getOrderChatID(),
                order.getOrderMessageID()).replyMarkup(new InlineKeyboardMarkup(
                new InlineKeyboardButton("\uD83D\uDC2E Обычное + 0₾").callbackData("selectedRegularMilk " + order.getOrderID())).addRow(
                new InlineKeyboardButton("\uD83C\uDF30 Миндальное + 1₾").callbackData("selectedAlmondMilk "+ order.getOrderID())).addRow(
                new InlineKeyboardButton("\uD83E\uDD65 Кокосовое +1₾").callbackData("selectedCoconutMilk "+ order.getOrderID())).addRow(
                new InlineKeyboardButton("\uD83C\uDF4C Банановое +1₾").callbackData("selectedBananaMilk "+ order.getOrderID())));
    }

    public EditMessageCaption orderKeyboardMilkChosen(CallbackQuery callbackQuery, HashMap<Integer, Order> orderMap, int orderID) {
            this.witchMilk = callbackQuery.data();
                if (!witchMilk.contains("selectedRegularMilk")) {
                    orderMap.get(orderID).setMilkPrice(1);
                    if (witchMilk.contains("selectedAlmondMilk")) {
                        orderMap.get(orderID).setWitchMilk("Миндальное");
                    } else if (witchMilk.contains("selectedCoconutMilk")) {
                        orderMap.get(orderID).setWitchMilk("Кокосовое");
                    } else {
                        orderMap.get(orderID).setWitchMilk("Банановое");
                    }
                } else {
                    orderMap.get(orderID).setMilkPrice(0);
                    orderMap.get(orderID).setWitchMilk("Обычное");
                }
            orderMap.get(orderID).setOrderPrice(calculateOrderPrice(orderID, orderMap));
            return orderCaptionSelectedProduct(orderMap,orderID).replyMarkup(orderKeyboard(orderMap,orderID));
        }


    public EditMessageReplyMarkup orderKeyboardChooseSize(Order order) {
        return new EditMessageReplyMarkup(order.getOrderChatID(),
                order.getOrderMessageID()).replyMarkup(new InlineKeyboardMarkup(
                new InlineKeyboardButton("Средний + 0₾").callbackData("selectedSizeMedium"+ order.getOrderID())).addRow(
                new InlineKeyboardButton("Большой + 2₾").callbackData("selectedSizeLarge"+ order.getOrderID())));
    }

    public EditMessageCaption orderKeyboardSizeChosen(CallbackQuery callbackQuery, HashMap<Integer, Order> orderMap,Integer orderID) {
                this.witchSize = callbackQuery.data();
                if (witchSize.contains("selectedSizeLarge")) {
                    orderMap.get(orderID).setSizePrice(2);
                    orderMap.get(orderID).setWitchSize("L");

                } else {
                    orderMap.get(orderID).setSizePrice(0);
                    orderMap.get(orderID).setWitchSize("M");
                }

            orderMap.get(orderID).setOrderPrice(calculateOrderPrice(orderID, orderMap));
            return orderCaptionSelectedProduct(orderMap,orderID).replyMarkup(orderKeyboard(orderMap,orderID));
        }


    public EditMessageCaption orderWriteComment(Order order) {
        return new EditMessageCaption(order.getOrderChatID(),
                order.getOrderMessageID()).caption("\uD83D\uDCAC Введите комментарий " + "\n" +
                "\n" + "Отправьте боту текст комментария, мы передадим его бариста: ").replyMarkup(
                new InlineKeyboardMarkup(new InlineKeyboardButton("◀️ Без комментария").callbackData("back" + orderID)));
    }

    private int calculateOrderPrice(Integer orderID, HashMap<Integer, Order> orderMap) {

        return orderMap.get(orderID).getMilkPrice() + orderMap.get(orderID).getPriceCoffee() + orderMap.get(orderID).getSizePrice();
    }


 */
}

