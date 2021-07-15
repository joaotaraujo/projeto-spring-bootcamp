package com.mercadolivre.desafioSpring.responses;

import com.fasterxml.jackson.annotation.JsonView;
import com.mercadolivre.desafioSpring.views.UserView;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Comparator;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserInfoResponse {

    private Integer userId;
    private String userName;
    @JsonView(UserView.Detailed.class)
    private Boolean isSeller;

    public static Comparator<UserInfoResponse> UserInfoResponseNameComparator = new Comparator<UserInfoResponse>() {
        public int compare(UserInfoResponse user1, UserInfoResponse user2) {
            return user1.getUserName().toUpperCase().compareTo(user2.getUserName().toUpperCase());
        }
    };
}
