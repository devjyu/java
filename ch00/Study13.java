package ch00;

import ch00.Post.PostBuilder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
class Post{

    private Integer idx;
    private String title;
    private String content;
    private Integer userIdx;

}

public class Study13 {
    public static void main(String[] args) {
        new Post(1, "제목", "내용", 1);

        Post post = new Post();
        post.setIdx(1);
        post.setTitle("제목");
        post.setContent("내용");
        post.setUserIdx(1);

        new Post(post.getUserIdx(), post.getTitle(), post.getContent(), post.getUserIdx());

        // 클래스 내부에 Builder클래스를 만들고
        

        Post post2 = Post.builder()
            .idx(1)
            .title("제목")
            .content("내용")
            .userIdx(1)
            .build();

        Post.builder().build();
    }
}
