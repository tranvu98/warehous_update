package com.tranvu1805.warehousemanager.Model;

import androidx.room.Entity;
import androidx.room.ForeignKey;

@Entity(tableName = "ChiTietHoaDon",
        primaryKeys = {"idProduct", "idInvoice"},
        foreignKeys = {
                @ForeignKey(entity = ProductDTO.class,
                        parentColumns = "id",
                        childColumns = "idProduct",
                        onDelete = ForeignKey.CASCADE
                ), @ForeignKey(entity = Invoice.class,
                parentColumns = "id",
                childColumns = "idInvoice",
                onDelete = ForeignKey.CASCADE
        )
        }
)
public class InvoiceDetailDTO {
    int idProduct, idInvoice;
    int quantity, price;

    public InvoiceDetailDTO(int idProduct, int idInvoice, int quantity, int price) {
        this.idProduct = idProduct;
        this.idInvoice = idInvoice;
        this.quantity = quantity;
        this.price = price;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public int getIdInvoice() {
        return idInvoice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
