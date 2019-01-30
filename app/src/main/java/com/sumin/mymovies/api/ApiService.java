package com.sumin.mymovies.api;

import com.sumin.mymovies.data.MoviesResponse;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("movie")
    Single<MoviesResponse> getMovies(@Query("api_key") String apiKey,
                                     @Query("language") String lang,
                                     @Query("sort_by") int sortBy,
                                     @Query("vote_count.gte") int minVoteCount,
                                     @Query("page") int page);
}
