package com.rosenhristov.tasks.functionaljava;

import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.stream.Collectors;

import static org.apache.commons.lang3.StringUtils.EMPTY;

public class FunctionalJava {

    public static void main(String[] args) {

        var items = List.of(
                new Item("i1", 10.0, 2),
                new Item("i2", 50.0, 1),
                new Item("i3", 7.0, 2),
                new Item("i4", 9.0, 5),
                new Item("i5", 4.0, 2),
                new Item("i6", 3.4, 1),
                new Item("i7", 3.5, 1)
        );
        var items2 = List.of(
                new Item("i1", 10.0, 1),
                new Item("i2", 50.0, 2),
                new Item("i3", 7.0, 2),
                new Item("i4", 191.0, 2),
                new Item("i5", 14.0, 3),
                new Item("i6", 3.4, 2),
                new Item("i7", 3.5, 1)
        );

        var receipts = List.of(
                new Receipt("1", items),
                new Receipt("2", items2)
        );

        //total amount of items for receipts
        var result = totalAmountOfItemsForReceipts(receipts);
        System.out.println("Total amount of items for receipts: " + result);

        //Receipt with highest price
        var receiptWithHighestPrice = receiptWithHighestItemPrice(receipts);
        System.out.println("Receipt with highest price: "  + receiptWithHighestPrice.getId());
    }

    public static double totalAmountOfItemsForReceipts(List<Receipt> receipts){
      return receipts.stream()
              .flatMap(r -> r.getItems().stream())
              .map(item -> item.getAmount() * item.getPrice())
              .mapToDouble(Double::doubleValue)
              .sum();
    }

    //Receipt with highest price
    public static Receipt receiptWithHighestItemPrice(List<Receipt> receipts){
        return receipts.stream()
                .max((n1, n2) -> {
                   double p1 = n1.getItems().stream()
                           .map(i -> i.getPrice() * i.getAmount())
                           .mapToDouble(Double::doubleValue)
                           .max()
                           .getAsDouble();
                   double p2 = n2.getItems().stream()
                           .map(i -> i.getPrice() * i.getAmount())
                           .mapToDouble(Double::doubleValue)
                           .max()
                           .getAsDouble();
                   return p1 > p2 ? 1
                           : p2 > p1 ? -1
                           : 0;
                })
                .get();
    }

    /**
     * Return full title like
     * "Mr. John Smith"
     * "Mr. John A. Smith"
     * "Ms. Jane Smith"
     * "Ms. Jane A. Smith"
     * "Kris Smith" (if unknown gender)
     */
    public static List<String> getFullTitleAndNames(List<Customer> customers) {
        return customers
                .stream()
                .map(c -> {
                    String midName = c.getMiddleName() == null
                            ? null
                            : c.getMiddleName().substring(0, 1) + ".";
                    return new StringBuilder(c.getGender() == Gender.MALE
                                    ? "Mr. " : c.getGender() == Gender.FEMALE
                                    ? "Ms. " : EMPTY)
                            .append(c.getFirstName())
                            .append(" ")
                            .append(midName == null ? EMPTY : midName)
                            .append(" ")
                            .append(c.getLastName())
                            .toString();
                })
                .collect(Collectors.toList());
    }
}

class Receipt{
    private String id;
    private List<Item> items;

    public Receipt(String id, List<Item> items) {
        this.id = id;
        this.items = items;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}

class Item{
    private String name;
    private double price;
    private int amount;

    public Item(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

class Customer {
    private String firstName;
    private String middleName;
    private String lastName;
    private Gender gender;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}

enum Gender {
    MALE, FEMALE
}
