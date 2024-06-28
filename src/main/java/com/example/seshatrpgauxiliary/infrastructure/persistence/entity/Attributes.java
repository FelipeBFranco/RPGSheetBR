package com.example.seshatrpgauxiliary.infrastructure.persistence.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "attributes", schema = "seshat")
public class Attributes {

        @Id
        private Long id;
        private Integer level;
        private Integer experience;
        private Integer health;
        private Integer stamina;
        private Integer mana;
        private Integer amalgama;
        private Integer strength;
        private Integer agility;
        private Integer intelligence;
        private Integer mind;
        private Integer block;
        private Integer dodge;
        private Integer determination;

}
