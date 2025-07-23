package com.example.demo.model.card_labels;

import jakarta.persistence.*;

@Entity
@Table(name = "card_labels", schema = "public")
public class Card_Labels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "card_label_id")
    private Integer cardLabelId;

    @Column(name = "card_id", nullable = false)
    private Integer cardId;

    @Column(name = "label_id", nullable = false)
    private Integer labelId;

    // Getters and Setters
    public Integer getCardLabelId() {
        return cardLabelId;
    }

    public void setCardLabelId(Integer cardLabelId) {
        this.cardLabelId = cardLabelId;
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public Integer getLabelId() {
        return labelId;
    }

    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
}
}