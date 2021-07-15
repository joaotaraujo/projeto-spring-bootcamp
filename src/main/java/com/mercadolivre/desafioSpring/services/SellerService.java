package com.mercadolivre.desafioSpring.services;

import com.mercadolivre.desafioSpring.models.Seller;
import com.mercadolivre.desafioSpring.requests.UserToCreateRequest;
import com.mercadolivre.desafioSpring.responses.SellerFollowersInfoResponse;
import com.mercadolivre.desafioSpring.responses.SellerFollowersResponse;
import com.mercadolivre.desafioSpring.responses.UserInfoResponse;

public interface SellerService {

    UserInfoResponse createSeller(UserToCreateRequest sellerToCreateRequest);
    Seller findById(Integer sellerId);
    Seller toModel(UserToCreateRequest userToCreateRequest);
    void followSeller(Integer userId, Integer sellerIdToFollow);
    void unfollowSeller(Integer userId, Integer sellerIdToUnfollow);
    SellerFollowersResponse getFollowersNumber(Integer sellerId);
    SellerFollowersInfoResponse getFollowersInfo(Integer sellerId);
    Seller validateSeller(Integer sellerId);
}
