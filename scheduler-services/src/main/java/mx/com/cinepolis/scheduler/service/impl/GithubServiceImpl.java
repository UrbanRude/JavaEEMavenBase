package mx.com.cinepolis.scheduler.service.impl;

import mx.com.cinepolis.scheduler.commons.to.GithubUserTO;
import mx.com.cinepolis.scheduler.service.GithubService;

public class GithubServiceImpl implements GithubService {

    @Override
    public GithubUserTO getUserGit(String user) {
        GithubUserTO githubUserTO = new GithubUserTO();
        if(user.equals("UrbanRude")){
            githubUserTO.setName("Urbano Ceron");
            githubUserTO.setLogin("UrbanRude");
            githubUserTO.setAvatar_url("https://avatars2.githubusercontent.com/u/17173581?v=4");
            githubUserTO.setFollowers(10);
            githubUserTO.setFollowing(12);
        }if (user.equals("Arturo")){
            githubUserTO.setName("Arturo");
            githubUserTO.setLogin("Arturo");
            githubUserTO.setAvatar_url("https://avatars2.githubusercontent.com/u/17173581?v=4");
            githubUserTO.setFollowers(13);
            githubUserTO.setFollowing(13);
        }
        return githubUserTO;
    }
}
