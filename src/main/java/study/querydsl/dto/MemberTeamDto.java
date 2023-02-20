package study.querydsl.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;

@Data
public class MemberTeamDto {
    private Long memberId;
    private String username;
    private int age;
    private Long team;
    private String teamName;


    @QueryProjection
    public MemberTeamDto(Long memberId, String username, int age, Long team, String teamName) {
        this.memberId = memberId;
        this.username = username;
        this.age = age;
        this.team = team;
        this.teamName = teamName;
    }
}
