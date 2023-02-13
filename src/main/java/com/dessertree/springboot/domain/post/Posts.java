package com.dessertree.springboot.domain.post;

import com.dessertree.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity
public class Posts extends BaseTimeEntity {

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



    @Builder // 생성자 대신
    public Posts(String title, String content, String author, int viewCnt, Boolean noticeYn,
                       Boolean deleteYn){
        this.title = title;
        this.content = content;
        this.author = author;
        this.viewCnt = viewCnt;
        this.noticeYn = noticeYn;
        this.deleteYn = deleteYn;
    }

    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }
}
