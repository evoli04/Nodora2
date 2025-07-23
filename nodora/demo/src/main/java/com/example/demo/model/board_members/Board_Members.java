package com.example.demo.model.board_members;

import jakarta.persistence.*;

@Entity
@Table(name = "board_members")
public class Board_Members {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "board_id", nullable = false)
    private Integer boardId;

    @Column(name = "member_id", nullable = false)
    private Integer memberId;

    @Column(name = "roles_id", nullable = false)
    private Integer rolesId;

    // Getter ve Setter'lar
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Integer getBoardId() { return boardId; }
    public void setBoardId(Integer boardId) { this.boardId = boardId; }

    public Integer getMemberId() { return memberId; }
    public void setMemberId(Integer memberId) { this.memberId = memberId; }

    public Integer getRolesId() { return rolesId; }
    public void setRolesId(Integer rolesId) { this.rolesId=rolesId;}
}