package org.sample.rx.deals.model;

import com.google.common.base.MoreObjects;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

public class Deal {

    private UUID id;
    private UUID merchantId;
    private String title;
    private OffsetDateTime startAt;
    private OffsetDateTime endAt;
    private List<Product> products;

    public Deal() {
    }

    public Deal(UUID id, UUID merchantId, String title, OffsetDateTime startAt,
        OffsetDateTime endAt, List<Product> products) {
        this.id = id;
        this.merchantId = merchantId;
        this.title = title;
        this.startAt = startAt;
        this.endAt = endAt;
        this.products = products;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(UUID merchantId) {
        this.merchantId = merchantId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public OffsetDateTime getStartAt() {
        return startAt;
    }

    public void setStartAt(OffsetDateTime startAt) {
        this.startAt = startAt;
    }

    public OffsetDateTime getEndAt() {
        return endAt;
    }

    public void setEndAt(OffsetDateTime endAt) {
        this.endAt = endAt;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override public String toString() {
        return MoreObjects.toStringHelper(this).add("id", id).add("merchantId", merchantId)
            .add("title", title).add("startAt", startAt).add("endAt", endAt)
            .add("products", products).toString();
    }
}
