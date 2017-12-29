package com.ote.user.crud;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserPayload {

    private long id;

    @NotNull
    private String login;

    @NotNull
    private String password;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<UserRightPayload> userRights;
}
