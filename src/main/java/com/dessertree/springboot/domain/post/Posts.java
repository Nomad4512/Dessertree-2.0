package com.dessertree.springboot.domain.post;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;            // 글 번호, PK
    @Column(length = 500, nullable = false)
    private String title;       // 글 제목
    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;     // 글 내용
    private String author;      // 글쓴이
    private int viewCnt;                   // 조회 수
    private Boolean noticeYn;              // 공지글 여부
    private Boolean deleteYn;              // 삭제 여부
    private LocalDateTime createdDate;     // 생성일시
    private LocalDateTime modifiedDate;    // 최종 수정일시



    @Builder // 생성자 대신
    public Posts(String title, String content, String author, int viewCnt, Boolean noticeYn,
                       Boolean deleteYn, LocalDateTime createdDate, LocalDateTime modifiedDate){
        this.title = title;
        this.content = content;
        this.author = author;
        this.viewCnt = viewCnt;
        this.noticeYn = noticeYn;
        this.deleteYn = deleteYn;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }

    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }
}
