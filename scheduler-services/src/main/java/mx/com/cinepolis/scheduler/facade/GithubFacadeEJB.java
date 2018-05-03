package mx.com.cinepolis.scheduler.facade;

import mx.com.cinepolis.scheduler.commons.to.GithubUserTO;
import mx.com.cinepolis.scheduler.service.GithubService;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
@LocalBean
public class GithubFacadeEJB {

    @Inject
    GithubService githubService;

    public GithubUserTO getUserGit(String user){ return githubService.getUserGit(user);}
}
