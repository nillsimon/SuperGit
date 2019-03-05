package com.example.supergit.data.rest;

import com.example.supergit.data.models.GithubUser;
import com.example.supergit.data.models.RepsModel;


import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Observable;


public interface NetApiClientInterface {
    Observable<GithubUser> getUser(String user);
    Flowable<List<RepsModel>> getReps();
}
