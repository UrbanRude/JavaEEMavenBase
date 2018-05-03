package mx.com.cinepolis.scheduler.service;

import mx.com.cinepolis.scheduler.commons.to.GithubUserTO;

import java.util.List;

public interface GithubService {
    GithubUserTO getUserGit(String user);
}
