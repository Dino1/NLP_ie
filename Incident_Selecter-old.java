





<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
  <link rel="dns-prefetch" href="https://assets-cdn.github.com">
  <link rel="dns-prefetch" href="https://avatars0.githubusercontent.com">
  <link rel="dns-prefetch" href="https://avatars1.githubusercontent.com">
  <link rel="dns-prefetch" href="https://avatars2.githubusercontent.com">
  <link rel="dns-prefetch" href="https://avatars3.githubusercontent.com">
  <link rel="dns-prefetch" href="https://github-cloud.s3.amazonaws.com">
  <link rel="dns-prefetch" href="https://user-images.githubusercontent.com/">

<meta content="origin-when-cross-origin" name="referrer" />

  <link crossorigin="anonymous" href="https://assets-cdn.github.com/assets/frameworks-c9193575f18b28be82c0a963e144ff6fa7a809dd8ae003a1d1e5979bed3f7f00.css" integrity="sha256-yRk1dfGLKL6CwKlj4UT/b6eoCd2K4AOh0eWXm+0/fwA=" media="all" rel="stylesheet" />
  <link crossorigin="anonymous" href="https://assets-cdn.github.com/assets/github-fe5efc7180a3c7c686d9fbeb16cdb9e6831caa44951e3275b5a24c118fc3e924.css" integrity="sha256-/l78cYCjx8aG2fvrFs255oMcqkSVHjJ1taJMEY/D6SQ=" media="all" rel="stylesheet" />
  
  
  
  

  <meta name="viewport" content="width=device-width">
  
  <title>NLP_ie/Incident_Selecter.java at master · Dino1/NLP_ie</title>
  <link rel="search" type="application/opensearchdescription+xml" href="/opensearch.xml" title="GitHub">
  <link rel="fluid-icon" href="https://github.com/fluidicon.png" title="GitHub">
  <meta property="fb:app_id" content="1401488693436528">

    
    <meta content="https://avatars1.githubusercontent.com/u/5093659?s=400&amp;v=4" property="og:image" /><meta content="GitHub" property="og:site_name" /><meta content="object" property="og:type" /><meta content="Dino1/NLP_ie" property="og:title" /><meta content="https://github.com/Dino1/NLP_ie" property="og:url" /><meta content="Contribute to NLP_ie development by creating an account on GitHub." property="og:description" />

  <link rel="assets" href="https://assets-cdn.github.com/">
  <link rel="web-socket" href="wss://live.github.com/_sockets/VjI6MjE5NDI0ODUyOjY3ZjZmNjEzNmVhNjU3ZTBkYzA5M2I1NGRiYzQ3NjRkNTM4MDQ5NmJlYzNkYTU2NWYyNjY5YTRjYzg3MmY4NDY=--e800071a0762775f57178901bbe11b477182a2d5">
  <meta name="pjax-timeout" content="1000">
  <link rel="sudo-modal" href="/sessions/sudo_modal">
  <meta name="request-id" content="7831:F58B:310FFA:53889B:5A1D408E" data-pjax-transient>
  

  <meta name="selected-link" value="repo_source" data-pjax-transient>

  <meta name="google-site-verification" content="KT5gs8h0wvaagLKAVWq8bbeNwnZZK1r1XQysX3xurLU">
<meta name="google-site-verification" content="ZzhVyEFwb7w3e0-uOTltm8Jsck2F5StVihD0exw2fsA">
    <meta name="google-analytics" content="UA-3769691-2">

<meta content="collector.githubapp.com" name="octolytics-host" /><meta content="github" name="octolytics-app-id" /><meta content="https://collector.githubapp.com/github-external/browser_event" name="octolytics-event-url" /><meta content="7831:F58B:310FFA:53889B:5A1D408E" name="octolytics-dimension-request_id" /><meta content="iad" name="octolytics-dimension-region_edge" /><meta content="iad" name="octolytics-dimension-region_render" /><meta content="5093659" name="octolytics-actor-id" /><meta content="Dino1" name="octolytics-actor-login" /><meta content="d2131459447794f27822c70d0003afe983c29dc8b719523429f429a873a0fd63" name="octolytics-actor-hash" />
<meta content="/&lt;user-name&gt;/&lt;repo-name&gt;/blob/show" data-pjax-transient="true" name="analytics-location" />




  <meta class="js-ga-set" name="dimension1" content="Logged In">


  

      <meta name="hostname" content="github.com">
  <meta name="user-login" content="Dino1">

      <meta name="expected-hostname" content="github.com">
    <meta name="js-proxy-site-detection-payload" content="Y2EyYmE3Y2VkOThiMTVhZTQ1MWI1OGZhY2NlOWM3MWJiOGI3NzQ4ZDc5OGJmNzJiYzZlMjg1ZWZkNDQ2OWQ4Mnx7InJlbW90ZV9hZGRyZXNzIjoiMTU1Ljk4LjEzMS4xIiwicmVxdWVzdF9pZCI6Ijc4MzE6RjU4QjozMTBGRkE6NTM4ODlCOjVBMUQ0MDhFIiwidGltZXN0YW1wIjoxNTExODY2NTE4LCJob3N0IjoiZ2l0aHViLmNvbSJ9">

    <meta name="enabled-features" content="UNIVERSE_BANNER,FREE_TRIALS">

  <meta name="html-safe-nonce" content="3fd470fe057f95059d9959ca86b37a0b2b37adba">

  <meta http-equiv="x-pjax-version" content="2af685a4f3d3f6b3d27d5b69bb0ebc1e">
  

      <link href="https://github.com/Dino1/NLP_ie/commits/master.atom?token=AE25GxlghJKQb7b4lA_JEmwAibAqDC-Uks64KSGWwA%3D%3D" rel="alternate" title="Recent Commits to NLP_ie:master" type="application/atom+xml">

  <meta name="description" content="Contribute to NLP_ie development by creating an account on GitHub.">
  <meta name="go-import" content="github.com/Dino1/NLP_ie git https://github.com/Dino1/NLP_ie.git">

  <meta content="5093659" name="octolytics-dimension-user_id" /><meta content="Dino1" name="octolytics-dimension-user_login" /><meta content="109445511" name="octolytics-dimension-repository_id" /><meta content="Dino1/NLP_ie" name="octolytics-dimension-repository_nwo" /><meta content="false" name="octolytics-dimension-repository_public" /><meta content="false" name="octolytics-dimension-repository_is_fork" /><meta content="109445511" name="octolytics-dimension-repository_network_root_id" /><meta content="Dino1/NLP_ie" name="octolytics-dimension-repository_network_root_nwo" /><meta content="true" name="octolytics-dimension-repository_explore_github_marketplace_ci_cta_shown" />


    <link rel="canonical" href="https://github.com/Dino1/NLP_ie/blob/master/Incident_Selecter.java" data-pjax-transient>


  <meta name="browser-stats-url" content="https://api.github.com/_private/browser/stats">

  <meta name="browser-errors-url" content="https://api.github.com/_private/browser/errors">

  <link rel="mask-icon" href="https://assets-cdn.github.com/pinned-octocat.svg" color="#000000">
  <link rel="icon" type="image/x-icon" class="js-site-favicon" href="https://assets-cdn.github.com/favicon.ico">

<meta name="theme-color" content="#1e2327">


  <meta name="u2f-support" content="true">

  </head>

  <body class="logged-in env-production page-blob">
    

  <div class="position-relative js-header-wrapper ">
    <a href="#start-of-content" tabindex="1" class="bg-black text-white p-3 show-on-focus js-skip-to-content">Skip to content</a>
    <div id="js-pjax-loader-bar" class="pjax-loader-bar"><div class="progress"></div></div>

    
    
    



        
<header class="Header  f5" role="banner">
  <div class="d-flex px-3 flex-justify-between container-lg">
    <div class="d-flex flex-justify-between">
      <a class="header-logo-invertocat" href="https://github.com/" data-hotkey="g d" aria-label="Homepage" data-ga-click="Header, go to dashboard, icon:logo">
  <svg aria-hidden="true" class="octicon octicon-mark-github" height="32" version="1.1" viewBox="0 0 16 16" width="32"><path fill-rule="evenodd" d="M8 0C3.58 0 0 3.58 0 8c0 3.54 2.29 6.53 5.47 7.59.4.07.55-.17.55-.38 0-.19-.01-.82-.01-1.49-2.01.37-2.53-.49-2.69-.94-.09-.23-.48-.94-.82-1.13-.28-.15-.68-.52-.01-.53.63-.01 1.08.58 1.23.82.72 1.21 1.87.87 2.33.66.07-.52.28-.87.51-1.07-1.78-.2-3.64-.89-3.64-3.95 0-.87.31-1.59.82-2.15-.08-.2-.36-1.02.08-2.12 0 0 .67-.21 2.2.82.64-.18 1.32-.27 2-.27.68 0 1.36.09 2 .27 1.53-1.04 2.2-.82 2.2-.82.44 1.1.16 1.92.08 2.12.51.56.82 1.27.82 2.15 0 3.07-1.87 3.75-3.65 3.95.29.25.54.73.54 1.48 0 1.07-.01 1.93-.01 2.2 0 .21.15.46.55.38A8.013 8.013 0 0 0 16 8c0-4.42-3.58-8-8-8z"/></svg>
</a>


    </div>

    <div class="HeaderMenu d-flex flex-justify-between flex-auto">
      <div class="d-flex">
            <div class="">
              <div class="header-search scoped-search site-scoped-search js-site-search" role="search">
  <!-- '"` --><!-- </textarea></xmp> --></option></form><form accept-charset="UTF-8" action="/Dino1/NLP_ie/search" class="js-site-search-form" data-scoped-search-url="/Dino1/NLP_ie/search" data-unscoped-search-url="/search" method="get"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /></div>
    <label class="form-control header-search-wrapper js-chromeless-input-container">
        <a href="/Dino1/NLP_ie/blob/master/Incident_Selecter.java" class="header-search-scope no-underline">This repository</a>
      <input type="text"
        class="form-control header-search-input js-site-search-focus js-site-search-field is-clearable"
        data-hotkey="s"
        name="q"
        value=""
        placeholder="Search"
        aria-label="Search this repository"
        data-unscoped-placeholder="Search GitHub"
        data-scoped-placeholder="Search"
        autocapitalize="off">
        <input type="hidden" class="js-site-search-type-field" name="type" >
    </label>
</form></div>

            </div>

          <ul class="d-flex pl-2 flex-items-center text-bold list-style-none" role="navigation">
            <li>
              <a href="/pulls" aria-label="Pull requests you created" class="js-selected-navigation-item HeaderNavlink px-2" data-ga-click="Header, click, Nav menu - item:pulls context:user" data-hotkey="g p" data-selected-links="/pulls /pulls/assigned /pulls/mentioned /pulls">
                Pull requests
</a>            </li>
            <li>
              <a href="/issues" aria-label="Issues you created" class="js-selected-navigation-item HeaderNavlink px-2" data-ga-click="Header, click, Nav menu - item:issues context:user" data-hotkey="g i" data-selected-links="/issues /issues/assigned /issues/mentioned /issues">
                Issues
</a>            </li>
                <li>
                  <a href="/marketplace" class="js-selected-navigation-item HeaderNavlink px-2" data-ga-click="Header, click, Nav menu - item:marketplace context:user" data-selected-links=" /marketplace">
                    Marketplace
</a>                </li>
            <li>
              <a href="/explore" class="js-selected-navigation-item HeaderNavlink px-2" data-ga-click="Header, click, Nav menu - item:explore" data-selected-links="/explore /trending /trending/developers /integrations /integrations/feature/code /integrations/feature/collaborate /integrations/feature/ship showcases showcases_search showcases_landing /explore">
                Explore
</a>            </li>
          </ul>
      </div>

      <div class="d-flex">
        
<ul class="user-nav d-flex flex-items-center list-style-none" id="user-links">
  <li class="dropdown js-menu-container">
    <span class="d-inline-block  px-2">
      
    <a href="/notifications" aria-label="You have no unread notifications" class="notification-indicator tooltipped tooltipped-s  js-socket-channel js-notification-indicator" data-channel="notification-changed:5093659" data-ga-click="Header, go to notifications, icon:read" data-hotkey="g n">
        <span class="mail-status "></span>
        <svg aria-hidden="true" class="octicon octicon-bell" height="16" version="1.1" viewBox="0 0 14 16" width="14"><path fill-rule="evenodd" d="M14 12v1H0v-1l.73-.58c.77-.77.81-2.55 1.19-4.42C2.69 3.23 6 2 6 2c0-.55.45-1 1-1s1 .45 1 1c0 0 3.39 1.23 4.16 5 .38 1.88.42 3.66 1.19 4.42l.66.58H14zm-7 4c1.11 0 2-.89 2-2H5c0 1.11.89 2 2 2z"/></svg>
</a>
    </span>
  </li>

  <li class="dropdown js-menu-container">
    <details class="dropdown-details details-reset js-dropdown-details d-flex px-2 flex-items-center">
      <summary class="HeaderNavlink"
         aria-label="Create new…"
         data-ga-click="Header, create new, icon:add">
        <svg aria-hidden="true" class="octicon octicon-plus float-left mr-1 mt-1" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path fill-rule="evenodd" d="M12 9H7v5H5V9H0V7h5V2h2v5h5z"/></svg>
        <span class="dropdown-caret mt-1"></span>
      </summary>

      <ul class="dropdown-menu dropdown-menu-sw">
        
<a class="dropdown-item" href="/new" data-ga-click="Header, create new repository">
  New repository
</a>

  <a class="dropdown-item" href="/new/import" data-ga-click="Header, import a repository">
    Import repository
  </a>

<a class="dropdown-item" href="https://gist.github.com/" data-ga-click="Header, create new gist">
  New gist
</a>

  <a class="dropdown-item" href="/organizations/new" data-ga-click="Header, create new organization">
    New organization
  </a>



  <div class="dropdown-divider"></div>
  <div class="dropdown-header">
    <span title="Dino1/NLP_ie">This repository</span>
  </div>
    <a class="dropdown-item" href="/Dino1/NLP_ie/issues/new" data-ga-click="Header, create new issue">
      New issue
    </a>

      </ul>
    </details>
  </li>

  <li class="dropdown js-menu-container">

    <details class="dropdown-details details-reset js-dropdown-details d-flex pl-2 flex-items-center">
      <summary class="HeaderNavlink name mt-1"
        aria-label="View profile and more"
        data-ga-click="Header, show menu, icon:avatar">
        <img alt="@Dino1" class="avatar float-left mr-1" src="https://avatars0.githubusercontent.com/u/5093659?s=40&amp;v=4" height="20" width="20">
        <span class="dropdown-caret"></span>
      </summary>

      <ul class="dropdown-menu dropdown-menu-sw">
        <li class="dropdown-header header-nav-current-user css-truncate">
          Signed in as <strong class="css-truncate-target">Dino1</strong>
        </li>

        <li class="dropdown-divider"></li>

        <li><a class="dropdown-item" href="/Dino1" data-ga-click="Header, go to profile, text:your profile">
          Your profile
        </a></li>
        <li><a class="dropdown-item" href="/Dino1?tab=stars" data-ga-click="Header, go to starred repos, text:your stars">
          Your stars
        </a></li>
          <li><a class="dropdown-item" href="https://gist.github.com/" data-ga-click="Header, your gists, text:your gists">Your Gists</a></li>

        <li class="dropdown-divider"></li>

        <li><a class="dropdown-item" href="https://help.github.com" data-ga-click="Header, go to help, text:help">
          Help
        </a></li>

        <li><a class="dropdown-item" href="/settings/profile" data-ga-click="Header, go to settings, icon:settings">
          Settings
        </a></li>

        <li><!-- '"` --><!-- </textarea></xmp> --></option></form><form accept-charset="UTF-8" action="/logout" class="logout-form" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="fDMfDulDVoif3c6I+3W0aJ+4hSB5S30RsNjRd1HEZ0RBiySC1MuCMh81CAEXkWEJDcmD+7UNDvNHhP2tmntjJA==" /></div>
          <button type="submit" class="dropdown-item dropdown-signout" data-ga-click="Header, sign out, icon:logout">
            Sign out
          </button>
        </form></li>
      </ul>
    </details>
  </li>
</ul>


        <!-- '"` --><!-- </textarea></xmp> --></option></form><form accept-charset="UTF-8" action="/logout" class="sr-only right-0" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="1ng5TRPxxh+CZivbTmJzSYK/2sE3poiGlwMyoZBk4bDrwALBLnkSpQKO7VKihqYoEM7cGvvg+2RgXx57W9vl0A==" /></div>
          <button type="submit" class="dropdown-item dropdown-signout" data-ga-click="Header, sign out, icon:logout">
            Sign out
          </button>
</form>      </div>
    </div>
  </div>
</header>


      

  </div>

  <div id="start-of-content" class="show-on-focus"></div>

    <div id="js-flash-container">
</div>



  <div role="main">
        <div itemscope itemtype="http://schema.org/SoftwareSourceCode">
    <div id="js-repo-pjax-container" data-pjax-container>
      





    <div class="pagehead repohead instapaper_ignore readability-menu experiment-repo-nav ">
      <div class="repohead-details-container clearfix container ">

        <ul class="pagehead-actions">
  <li>
        <!-- '"` --><!-- </textarea></xmp> --></option></form><form accept-charset="UTF-8" action="/notifications/subscribe" class="js-social-container" data-autosubmit="true" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="sx1FvyjacYU7yN2quIqFwKq09u10S/SsNkH/JsSHjPV+rjnt5ESxsTIcc4WHVN/o2+8FJVwNz/fBpCntamqptg==" /></div>      <input class="form-control" id="repository_id" name="repository_id" type="hidden" value="109445511" />

        <div class="select-menu js-menu-container js-select-menu">
          <a href="/Dino1/NLP_ie/subscription"
            class="btn btn-sm btn-with-count select-menu-button js-menu-target"
            role="button"
            aria-haspopup="true"
            aria-expanded="false"
            aria-label="Toggle repository notifications menu"
            data-ga-click="Repository, click Watch settings, action:blob#show">
            <span class="js-select-button">
                <svg aria-hidden="true" class="octicon octicon-eye" height="16" version="1.1" viewBox="0 0 16 16" width="16"><path fill-rule="evenodd" d="M8.06 2C3 2 0 8 0 8s3 6 8.06 6C13 14 16 8 16 8s-3-6-7.94-6zM8 12c-2.2 0-4-1.78-4-4 0-2.2 1.8-4 4-4 2.22 0 4 1.8 4 4 0 2.22-1.78 4-4 4zm2-4c0 1.11-.89 2-2 2-1.11 0-2-.89-2-2 0-1.11.89-2 2-2 1.11 0 2 .89 2 2z"/></svg>
                Unwatch
            </span>
          </a>
            <a class="social-count js-social-count"
              href="/Dino1/NLP_ie/watchers"
              aria-label="2 users are watching this repository">
              2
            </a>

        <div class="select-menu-modal-holder">
          <div class="select-menu-modal subscription-menu-modal js-menu-content">
            <div class="select-menu-header js-navigation-enable" tabindex="-1">
              <svg aria-label="Close" class="octicon octicon-x js-menu-close" height="16" role="img" version="1.1" viewBox="0 0 12 16" width="12"><path fill-rule="evenodd" d="M7.48 8l3.75 3.75-1.48 1.48L6 9.48l-3.75 3.75-1.48-1.48L4.52 8 .77 4.25l1.48-1.48L6 6.52l3.75-3.75 1.48 1.48z"/></svg>
              <span class="select-menu-title">Notifications</span>
            </div>

              <div class="select-menu-list js-navigation-container" role="menu">

                <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
                  <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
                  <div class="select-menu-item-text">
                    <input id="do_included" name="do" type="radio" value="included" />
                    <span class="select-menu-item-heading">Not watching</span>
                    <span class="description">Be notified when participating or @mentioned.</span>
                    <span class="js-select-button-text hidden-select-button-text">
                      <svg aria-hidden="true" class="octicon octicon-eye" height="16" version="1.1" viewBox="0 0 16 16" width="16"><path fill-rule="evenodd" d="M8.06 2C3 2 0 8 0 8s3 6 8.06 6C13 14 16 8 16 8s-3-6-7.94-6zM8 12c-2.2 0-4-1.78-4-4 0-2.2 1.8-4 4-4 2.22 0 4 1.8 4 4 0 2.22-1.78 4-4 4zm2-4c0 1.11-.89 2-2 2-1.11 0-2-.89-2-2 0-1.11.89-2 2-2 1.11 0 2 .89 2 2z"/></svg>
                      Watch
                    </span>
                  </div>
                </div>

                <div class="select-menu-item js-navigation-item selected" role="menuitem" tabindex="0">
                  <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
                  <div class="select-menu-item-text">
                    <input checked="checked" id="do_subscribed" name="do" type="radio" value="subscribed" />
                    <span class="select-menu-item-heading">Watching</span>
                    <span class="description">Be notified of all conversations.</span>
                    <span class="js-select-button-text hidden-select-button-text">
                      <svg aria-hidden="true" class="octicon octicon-eye" height="16" version="1.1" viewBox="0 0 16 16" width="16"><path fill-rule="evenodd" d="M8.06 2C3 2 0 8 0 8s3 6 8.06 6C13 14 16 8 16 8s-3-6-7.94-6zM8 12c-2.2 0-4-1.78-4-4 0-2.2 1.8-4 4-4 2.22 0 4 1.8 4 4 0 2.22-1.78 4-4 4zm2-4c0 1.11-.89 2-2 2-1.11 0-2-.89-2-2 0-1.11.89-2 2-2 1.11 0 2 .89 2 2z"/></svg>
                        Unwatch
                    </span>
                  </div>
                </div>

                <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
                  <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
                  <div class="select-menu-item-text">
                    <input id="do_ignore" name="do" type="radio" value="ignore" />
                    <span class="select-menu-item-heading">Ignoring</span>
                    <span class="description">Never be notified.</span>
                    <span class="js-select-button-text hidden-select-button-text">
                      <svg aria-hidden="true" class="octicon octicon-mute" height="16" version="1.1" viewBox="0 0 16 16" width="16"><path fill-rule="evenodd" d="M8 2.81v10.38c0 .67-.81 1-1.28.53L3 10H1c-.55 0-1-.45-1-1V7c0-.55.45-1 1-1h2l3.72-3.72C7.19 1.81 8 2.14 8 2.81zm7.53 3.22l-1.06-1.06-1.97 1.97-1.97-1.97-1.06 1.06L11.44 8 9.47 9.97l1.06 1.06 1.97-1.97 1.97 1.97 1.06-1.06L13.56 8l1.97-1.97z"/></svg>
                        Stop ignoring
                    </span>
                  </div>
                </div>

              </div>

            </div>
          </div>
        </div>
</form>
  </li>

  <li>
    
  <div class="js-toggler-container js-social-container starring-container ">
    <!-- '"` --><!-- </textarea></xmp> --></option></form><form accept-charset="UTF-8" action="/Dino1/NLP_ie/unstar" class="starred js-social-form" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="K9Z8kfkcApYKKkdCovMYKeaPaxWPdtUgtGxpGUoKFCrbrT8szJu53nkAPmr9GGscf8Px+215rfj84Ydj3wb/fg==" /></div>
      <input type="hidden" name="context" value="repository"></input>
      <button
        type="submit"
        class="btn btn-sm btn-with-count js-toggler-target"
        aria-label="Unstar this repository" title="Unstar Dino1/NLP_ie"
        data-ga-click="Repository, click unstar button, action:blob#show; text:Unstar">
        <svg aria-hidden="true" class="octicon octicon-star" height="16" version="1.1" viewBox="0 0 14 16" width="14"><path fill-rule="evenodd" d="M14 6l-4.9-.64L7 1 4.9 5.36 0 6l3.6 3.26L2.67 14 7 11.67 11.33 14l-.93-4.74z"/></svg>
        Unstar
      </button>
        <a class="social-count js-social-count" href="/Dino1/NLP_ie/stargazers"
           aria-label="0 users starred this repository">
          0
        </a>
</form>
    <!-- '"` --><!-- </textarea></xmp> --></option></form><form accept-charset="UTF-8" action="/Dino1/NLP_ie/star" class="unstarred js-social-form" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="OcOZBsgHwybI8djrQWA5m1Wj6tZqyxPrdZ9j9PYlAIp7igqMvBDU/gqarCqo/KZr7I06iXiPLBtmPeOC/fc0GA==" /></div>
      <input type="hidden" name="context" value="repository"></input>
      <button
        type="submit"
        class="btn btn-sm btn-with-count js-toggler-target"
        aria-label="Star this repository" title="Star Dino1/NLP_ie"
        data-ga-click="Repository, click star button, action:blob#show; text:Star">
        <svg aria-hidden="true" class="octicon octicon-star" height="16" version="1.1" viewBox="0 0 14 16" width="14"><path fill-rule="evenodd" d="M14 6l-4.9-.64L7 1 4.9 5.36 0 6l3.6 3.26L2.67 14 7 11.67 11.33 14l-.93-4.74z"/></svg>
        Star
      </button>
        <a class="social-count js-social-count" href="/Dino1/NLP_ie/stargazers"
           aria-label="0 users starred this repository">
          0
        </a>
</form>  </div>

  </li>

  <li>
          <a href="#fork-destination-box" class="btn btn-sm btn-with-count"
              title="Fork your own copy of Dino1/NLP_ie to your account"
              aria-label="Fork your own copy of Dino1/NLP_ie to your account"
              rel="facebox"
              data-ga-click="Repository, show fork modal, action:blob#show; text:Fork">
              <svg aria-hidden="true" class="octicon octicon-repo-forked" height="16" version="1.1" viewBox="0 0 10 16" width="10"><path fill-rule="evenodd" d="M8 1a1.993 1.993 0 0 0-1 3.72V6L5 8 3 6V4.72A1.993 1.993 0 0 0 2 1a1.993 1.993 0 0 0-1 3.72V6.5l3 3v1.78A1.993 1.993 0 0 0 5 15a1.993 1.993 0 0 0 1-3.72V9.5l3-3V4.72A1.993 1.993 0 0 0 8 1zM2 4.2C1.34 4.2.8 3.65.8 3c0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2 0 .65-.55 1.2-1.2 1.2zm3 10c-.66 0-1.2-.55-1.2-1.2 0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2 0 .65-.55 1.2-1.2 1.2zm3-10c-.66 0-1.2-.55-1.2-1.2 0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2 0 .65-.55 1.2-1.2 1.2z"/></svg>
            Fork
          </a>

          <div id="fork-destination-box" style="display: none;">
            <h2 class="facebox-header" data-facebox-id="facebox-header">Where should we fork this repository?</h2>
            <include-fragment src=""
                class="js-fork-select-fragment fork-select-fragment"
                data-url="/Dino1/NLP_ie/fork?fragment=1">
              <img alt="Loading" height="64" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-128.gif" width="64" />
            </include-fragment>
          </div>

    <a href="/Dino1/NLP_ie/network" class="social-count"
       aria-label="0 users forked this repository">
      0
    </a>
  </li>
</ul>

        <h1 class="private ">
  <svg aria-hidden="true" class="octicon octicon-lock" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path fill-rule="evenodd" d="M4 13H3v-1h1v1zm8-6v7c0 .55-.45 1-1 1H1c-.55 0-1-.45-1-1V7c0-.55.45-1 1-1h1V4c0-2.2 1.8-4 4-4s4 1.8 4 4v2h1c.55 0 1 .45 1 1zM3.8 6h4.41V4c0-1.22-.98-2.2-2.2-2.2-1.22 0-2.2.98-2.2 2.2v2H3.8zM11 7H2v7h9V7zM4 8H3v1h1V8zm0 2H3v1h1v-1z"/></svg>
  <span class="author" itemprop="author"><a href="/Dino1" class="url fn" rel="author">Dino1</a></span><!--
--><span class="path-divider">/</span><!--
--><strong itemprop="name"><a href="/Dino1/NLP_ie" data-pjax="#js-repo-pjax-container">NLP_ie</a></strong>
    <span class="Label Label--outline v-align-middle">Private</span>

</h1>

      </div>
      
<nav class="reponav js-repo-nav js-sidenav-container-pjax container"
     itemscope
     itemtype="http://schema.org/BreadcrumbList"
     role="navigation"
     data-pjax="#js-repo-pjax-container">

  <span itemscope itemtype="http://schema.org/ListItem" itemprop="itemListElement">
    <a href="/Dino1/NLP_ie" class="js-selected-navigation-item selected reponav-item" data-hotkey="g c" data-selected-links="repo_source repo_downloads repo_commits repo_releases repo_tags repo_branches repo_packages /Dino1/NLP_ie" itemprop="url">
      <svg aria-hidden="true" class="octicon octicon-code" height="16" version="1.1" viewBox="0 0 14 16" width="14"><path fill-rule="evenodd" d="M9.5 3L8 4.5 11.5 8 8 11.5 9.5 13 14 8 9.5 3zm-5 0L0 8l4.5 5L6 11.5 2.5 8 6 4.5 4.5 3z"/></svg>
      <span itemprop="name">Code</span>
      <meta itemprop="position" content="1">
</a>  </span>

    <span itemscope itemtype="http://schema.org/ListItem" itemprop="itemListElement">
      <a href="/Dino1/NLP_ie/issues" class="js-selected-navigation-item reponav-item" data-hotkey="g i" data-selected-links="repo_issues repo_labels repo_milestones /Dino1/NLP_ie/issues" itemprop="url">
        <svg aria-hidden="true" class="octicon octicon-issue-opened" height="16" version="1.1" viewBox="0 0 14 16" width="14"><path fill-rule="evenodd" d="M7 2.3c3.14 0 5.7 2.56 5.7 5.7s-2.56 5.7-5.7 5.7A5.71 5.71 0 0 1 1.3 8c0-3.14 2.56-5.7 5.7-5.7zM7 1C3.14 1 0 4.14 0 8s3.14 7 7 7 7-3.14 7-7-3.14-7-7-7zm1 3H6v5h2V4zm0 6H6v2h2v-2z"/></svg>
        <span itemprop="name">Issues</span>
        <span class="Counter">0</span>
        <meta itemprop="position" content="2">
</a>    </span>

  <span itemscope itemtype="http://schema.org/ListItem" itemprop="itemListElement">
    <a href="/Dino1/NLP_ie/pulls" class="js-selected-navigation-item reponav-item" data-hotkey="g p" data-selected-links="repo_pulls /Dino1/NLP_ie/pulls" itemprop="url">
      <svg aria-hidden="true" class="octicon octicon-git-pull-request" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path fill-rule="evenodd" d="M11 11.28V5c-.03-.78-.34-1.47-.94-2.06C9.46 2.35 8.78 2.03 8 2H7V0L4 3l3 3V4h1c.27.02.48.11.69.31.21.2.3.42.31.69v6.28A1.993 1.993 0 0 0 10 15a1.993 1.993 0 0 0 1-3.72zm-1 2.92c-.66 0-1.2-.55-1.2-1.2 0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2 0 .65-.55 1.2-1.2 1.2zM4 3c0-1.11-.89-2-2-2a1.993 1.993 0 0 0-1 3.72v6.56A1.993 1.993 0 0 0 2 15a1.993 1.993 0 0 0 1-3.72V4.72c.59-.34 1-.98 1-1.72zm-.8 10c0 .66-.55 1.2-1.2 1.2-.65 0-1.2-.55-1.2-1.2 0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2zM2 4.2C1.34 4.2.8 3.65.8 3c0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2 0 .65-.55 1.2-1.2 1.2z"/></svg>
      <span itemprop="name">Pull requests</span>
      <span class="Counter">0</span>
      <meta itemprop="position" content="3">
</a>  </span>

    <a href="/Dino1/NLP_ie/projects" class="js-selected-navigation-item reponav-item" data-hotkey="g b" data-selected-links="repo_projects new_repo_project repo_project /Dino1/NLP_ie/projects">
      <svg aria-hidden="true" class="octicon octicon-project" height="16" version="1.1" viewBox="0 0 15 16" width="15"><path fill-rule="evenodd" d="M10 12h3V2h-3v10zm-4-2h3V2H6v8zm-4 4h3V2H2v12zm-1 1h13V1H1v14zM14 0H1a1 1 0 0 0-1 1v14a1 1 0 0 0 1 1h13a1 1 0 0 0 1-1V1a1 1 0 0 0-1-1z"/></svg>
      Projects
      <span class="Counter" >0</span>
</a>
    <a href="/Dino1/NLP_ie/wiki" class="js-selected-navigation-item reponav-item" data-hotkey="g w" data-selected-links="repo_wiki /Dino1/NLP_ie/wiki">
      <svg aria-hidden="true" class="octicon octicon-book" height="16" version="1.1" viewBox="0 0 16 16" width="16"><path fill-rule="evenodd" d="M3 5h4v1H3V5zm0 3h4V7H3v1zm0 2h4V9H3v1zm11-5h-4v1h4V5zm0 2h-4v1h4V7zm0 2h-4v1h4V9zm2-6v9c0 .55-.45 1-1 1H9.5l-1 1-1-1H2c-.55 0-1-.45-1-1V3c0-.55.45-1 1-1h5.5l1 1 1-1H15c.55 0 1 .45 1 1zm-8 .5L7.5 3H2v9h6V3.5zm7-.5H9.5l-.5.5V12h6V3z"/></svg>
      Wiki
</a>

  <a href="/Dino1/NLP_ie/pulse" class="js-selected-navigation-item reponav-item" data-selected-links="repo_graphs repo_contributors dependency_graph pulse /Dino1/NLP_ie/pulse">
    <svg aria-hidden="true" class="octicon octicon-graph" height="16" version="1.1" viewBox="0 0 16 16" width="16"><path fill-rule="evenodd" d="M16 14v1H0V0h1v14h15zM5 13H3V8h2v5zm4 0H7V3h2v10zm4 0h-2V6h2v7z"/></svg>
    Insights
</a>
    <a href="/Dino1/NLP_ie/settings" class="js-selected-navigation-item reponav-item" data-selected-links="repo_settings repo_branch_settings hooks integration_installations /Dino1/NLP_ie/settings">
      <svg aria-hidden="true" class="octicon octicon-gear" height="16" version="1.1" viewBox="0 0 14 16" width="14"><path fill-rule="evenodd" d="M14 8.77v-1.6l-1.94-.64-.45-1.09.88-1.84-1.13-1.13-1.81.91-1.09-.45-.69-1.92h-1.6l-.63 1.94-1.11.45-1.84-.88-1.13 1.13.91 1.81-.45 1.09L0 7.23v1.59l1.94.64.45 1.09-.88 1.84 1.13 1.13 1.81-.91 1.09.45.69 1.92h1.59l.63-1.94 1.11-.45 1.84.88 1.13-1.13-.92-1.81.47-1.09L14 8.75v.02zM7 11c-1.66 0-3-1.34-3-3s1.34-3 3-3 3 1.34 3 3-1.34 3-3 3z"/></svg>
      Settings
</a>
</nav>


    </div>

<div class="container new-discussion-timeline experiment-repo-nav">
  <div class="repository-content">

    
  <a href="/Dino1/NLP_ie/blob/6c1f9e761eae8c1e089dcaf83183a0265fa20be8/Incident_Selecter.java" class="d-none js-permalink-shortcut" data-hotkey="y">Permalink</a>

  <!-- blob contrib key: blob_contributors:v21:c3af4115780e9d796767a6aa9af19b71 -->

  <div class="file-navigation js-zeroclipboard-container">
    
<div class="select-menu branch-select-menu js-menu-container js-select-menu float-left">
  <button class=" btn btn-sm select-menu-button js-menu-target css-truncate" data-hotkey="w"
    
    type="button" aria-label="Switch branches or tags" aria-expanded="false" aria-haspopup="true">
      <i>Branch:</i>
      <span class="js-select-button css-truncate-target">master</span>
  </button>

  <div class="select-menu-modal-holder js-menu-content js-navigation-container" data-pjax>

    <div class="select-menu-modal">
      <div class="select-menu-header">
        <svg aria-label="Close" class="octicon octicon-x js-menu-close" height="16" role="img" version="1.1" viewBox="0 0 12 16" width="12"><path fill-rule="evenodd" d="M7.48 8l3.75 3.75-1.48 1.48L6 9.48l-3.75 3.75-1.48-1.48L4.52 8 .77 4.25l1.48-1.48L6 6.52l3.75-3.75 1.48 1.48z"/></svg>
        <span class="select-menu-title">Switch branches/tags</span>
      </div>

      <div class="select-menu-filters">
        <div class="select-menu-text-filter">
          <input type="text" aria-label="Find or create a branch…" id="context-commitish-filter-field" class="form-control js-filterable-field js-navigation-enable" placeholder="Find or create a branch…">
        </div>
        <div class="select-menu-tabs">
          <ul>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="branches" data-filter-placeholder="Find or create a branch…" class="js-select-menu-tab" role="tab">Branches</a>
            </li>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="tags" data-filter-placeholder="Find a tag…" class="js-select-menu-tab" role="tab">Tags</a>
            </li>
          </ul>
        </div>
      </div>

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="branches" role="menu">

        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


            <a class="select-menu-item js-navigation-item js-navigation-open selected"
               href="/Dino1/NLP_ie/blob/master/Incident_Selecter.java"
               data-name="master"
               data-skip-pjax="true"
               rel="nofollow">
              <svg aria-hidden="true" class="octicon octicon-check select-menu-item-icon" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5z"/></svg>
              <span class="select-menu-item-text css-truncate-target js-select-menu-filter-text">
                master
              </span>
            </a>
        </div>

          <!-- '"` --><!-- </textarea></xmp> --></option></form><form accept-charset="UTF-8" action="/Dino1/NLP_ie/branches" class="js-create-branch select-menu-item select-menu-new-item-form js-navigation-item js-new-item-form" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="xBz9x0GoCOLsvv6m6JqbjsFlJF5YnlctzR/aCqCcjM8fr38vlOyLWrLAXOWVMsrC+VzuZKQRutNeqVDT0PAOdA==" /></div>
          <svg aria-hidden="true" class="octicon octicon-git-branch select-menu-item-icon" height="16" version="1.1" viewBox="0 0 10 16" width="10"><path fill-rule="evenodd" d="M10 5c0-1.11-.89-2-2-2a1.993 1.993 0 0 0-1 3.72v.3c-.02.52-.23.98-.63 1.38-.4.4-.86.61-1.38.63-.83.02-1.48.16-2 .45V4.72a1.993 1.993 0 0 0-1-3.72C.88 1 0 1.89 0 3a2 2 0 0 0 1 1.72v6.56c-.59.35-1 .99-1 1.72 0 1.11.89 2 2 2 1.11 0 2-.89 2-2 0-.53-.2-1-.53-1.36.09-.06.48-.41.59-.47.25-.11.56-.17.94-.17 1.05-.05 1.95-.45 2.75-1.25S8.95 7.77 9 6.73h-.02C9.59 6.37 10 5.73 10 5zM2 1.8c.66 0 1.2.55 1.2 1.2 0 .65-.55 1.2-1.2 1.2C1.35 4.2.8 3.65.8 3c0-.65.55-1.2 1.2-1.2zm0 12.41c-.66 0-1.2-.55-1.2-1.2 0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2 0 .65-.55 1.2-1.2 1.2zm6-8c-.66 0-1.2-.55-1.2-1.2 0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2 0 .65-.55 1.2-1.2 1.2z"/></svg>
            <div class="select-menu-item-text">
              <span class="select-menu-item-heading">Create branch: <span class="js-new-item-name"></span></span>
              <span class="description">from ‘master’</span>
            </div>
            <input type="hidden" name="name" id="name" class="js-new-item-value">
            <input type="hidden" name="branch" id="branch" value="master">
            <input type="hidden" name="path" id="path" value="Incident_Selecter.java">
</form>
      </div>

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="tags">
        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


        </div>

        <div class="select-menu-no-results">Nothing to show</div>
      </div>

    </div>
  </div>
</div>

    <div class="BtnGroup float-right">
      <a href="/Dino1/NLP_ie/find/master"
            class="js-pjax-capture-input btn btn-sm BtnGroup-item"
            data-pjax
            data-hotkey="t">
        Find file
      </a>
      <button aria-label="Copy file path to clipboard" class="js-zeroclipboard btn btn-sm BtnGroup-item tooltipped tooltipped-s" data-copied-hint="Copied!" type="button">Copy path</button>
    </div>
    <div class="breadcrumb js-zeroclipboard-target">
      <span class="repo-root js-repo-root"><span class="js-path-segment"><a href="/Dino1/NLP_ie"><span>NLP_ie</span></a></span></span><span class="separator">/</span><strong class="final-path">Incident_Selecter.java</strong>
    </div>
  </div>


  
  <div class="commit-tease">
      <span class="float-right">
        <a class="commit-tease-sha" href="/Dino1/NLP_ie/commit/4e0e5500da65af6a986158897102729552a068ee" data-pjax>
          4e0e550
        </a>
        <relative-time datetime="2017-11-28T02:25:32Z">Nov 27, 2017</relative-time>
      </span>
      <div>
        <img alt="@Dino1" class="avatar" height="20" src="https://avatars0.githubusercontent.com/u/5093659?s=40&amp;v=4" width="20" />
        <a href="/Dino1" class="user-mention" rel="author">Dino1</a>
          <a href="/Dino1/NLP_ie/commit/4e0e5500da65af6a986158897102729552a068ee" class="message" data-pjax="true" title="&quot;imrpoved&quot; incident selection">"imrpoved" incident selection</a>
      </div>

    <div class="commit-tease-contributors">
      <button type="button" class="btn-link muted-link contributors-toggle" data-facebox="#blob_contributors_box">
        <strong>1</strong>
         contributor
      </button>
      
    </div>

    <div id="blob_contributors_box" style="display:none">
      <h2 class="facebox-header" data-facebox-id="facebox-header">Users who have contributed to this file</h2>
      <ul class="facebox-user-list" data-facebox-id="facebox-description">
          <li class="facebox-user-list-item">
            <img alt="@Dino1" height="24" src="https://avatars1.githubusercontent.com/u/5093659?s=48&amp;v=4" width="24" />
            <a href="/Dino1">Dino1</a>
          </li>
      </ul>
    </div>
  </div>


  <div class="file">
    <div class="file-header">
  <div class="file-actions">

    <div class="BtnGroup">
      <a href="/Dino1/NLP_ie/raw/master/Incident_Selecter.java" class="btn btn-sm BtnGroup-item" id="raw-url">Raw</a>
        <a href="/Dino1/NLP_ie/blame/master/Incident_Selecter.java" class="btn btn-sm js-update-url-with-hash BtnGroup-item" data-hotkey="b">Blame</a>
      <a href="/Dino1/NLP_ie/commits/master/Incident_Selecter.java" class="btn btn-sm BtnGroup-item" rel="nofollow">History</a>
    </div>

        <a class="btn-octicon tooltipped tooltipped-nw"
           href="github-windows://openRepo/https://github.com/Dino1/NLP_ie?branch=master&amp;filepath=Incident_Selecter.java"
           aria-label="Open this file in GitHub Desktop"
           data-ga-click="Repository, open with desktop, type:windows">
            <svg aria-hidden="true" class="octicon octicon-device-desktop" height="16" version="1.1" viewBox="0 0 16 16" width="16"><path fill-rule="evenodd" d="M15 2H1c-.55 0-1 .45-1 1v9c0 .55.45 1 1 1h5.34c-.25.61-.86 1.39-2.34 2h8c-1.48-.61-2.09-1.39-2.34-2H15c.55 0 1-.45 1-1V3c0-.55-.45-1-1-1zm0 9H1V3h14v8z"/></svg>
        </a>

        <!-- '"` --><!-- </textarea></xmp> --></option></form><form accept-charset="UTF-8" action="/Dino1/NLP_ie/edit/master/Incident_Selecter.java" class="inline-form js-update-url-with-hash" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="4g7XcAcEubZl7FSscUjdN93ZL86xwwgurKAkAsgC3r0tDOiyFLJyTzunYYIwG4yVRvHptOTb0r8EUvOFSxXR5w==" /></div>
          <button class="btn-octicon tooltipped tooltipped-nw" type="submit"
            aria-label="Edit this file" data-hotkey="e" data-disable-with>
            <svg aria-hidden="true" class="octicon octicon-pencil" height="16" version="1.1" viewBox="0 0 14 16" width="14"><path fill-rule="evenodd" d="M0 12v3h3l8-8-3-3-8 8zm3 2H1v-2h1v1h1v1zm10.3-9.3L12 6 9 3l1.3-1.3a.996.996 0 0 1 1.41 0l1.59 1.59c.39.39.39 1.02 0 1.41z"/></svg>
          </button>
</form>        <!-- '"` --><!-- </textarea></xmp> --></option></form><form accept-charset="UTF-8" action="/Dino1/NLP_ie/delete/master/Incident_Selecter.java" class="inline-form" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="6jkC3e3MkiEWxS2olc2p9OrTRhQ0TlES9UHPHgqWJ8TG29qUdQisupAu95sySl8VEAEvVre9U/WxQKh0w0myOw==" /></div>
          <button class="btn-octicon btn-octicon-danger tooltipped tooltipped-nw" type="submit"
            aria-label="Delete this file" data-disable-with>
            <svg aria-hidden="true" class="octicon octicon-trashcan" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path fill-rule="evenodd" d="M11 2H9c0-.55-.45-1-1-1H5c-.55 0-1 .45-1 1H2c-.55 0-1 .45-1 1v1c0 .55.45 1 1 1v9c0 .55.45 1 1 1h7c.55 0 1-.45 1-1V5c.55 0 1-.45 1-1V3c0-.55-.45-1-1-1zm-1 12H3V5h1v8h1V5h1v8h1V5h1v8h1V5h1v9zm1-10H2V3h9v1z"/></svg>
          </button>
</form>  </div>

  <div class="file-info">
      414 lines (361 sloc)
      <span class="file-info-divider"></span>
    68.4 KB
  </div>
</div>

    

  <div itemprop="text" class="blob-wrapper data type-java">
      <table class="highlight tab-size js-file-line-container" data-tab-size="8">
      <tr>
        <td id="L1" class="blob-num js-line-number" data-line-number="1"></td>
        <td id="LC1" class="blob-code blob-code-inner js-file-line"><span class="pl-c"><span class="pl-c">//</span>package final_project;//commented out because i&#39;m not using packages atm. comment back in when running on JACOB</span></td>
      </tr>
      <tr>
        <td id="L2" class="blob-num js-line-number" data-line-number="2"></td>
        <td id="LC2" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L3" class="blob-num js-line-number" data-line-number="3"></td>
        <td id="LC3" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L4" class="blob-num js-line-number" data-line-number="4"></td>
        <td id="LC4" class="blob-code blob-code-inner js-file-line"><span class="pl-c"><span class="pl-c">//</span>import final_project.Winnow;</span></td>
      </tr>
      <tr>
        <td id="L5" class="blob-num js-line-number" data-line-number="5"></td>
        <td id="LC5" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L6" class="blob-num js-line-number" data-line-number="6"></td>
        <td id="LC6" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">java.io.File</span>;</td>
      </tr>
      <tr>
        <td id="L7" class="blob-num js-line-number" data-line-number="7"></td>
        <td id="LC7" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">java.io.FileNotFoundException</span>;</td>
      </tr>
      <tr>
        <td id="L8" class="blob-num js-line-number" data-line-number="8"></td>
        <td id="LC8" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">java.io.FileReader</span>;</td>
      </tr>
      <tr>
        <td id="L9" class="blob-num js-line-number" data-line-number="9"></td>
        <td id="LC9" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">java.io.PrintWriter</span>;</td>
      </tr>
      <tr>
        <td id="L10" class="blob-num js-line-number" data-line-number="10"></td>
        <td id="LC10" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">java.io.Reader</span>;</td>
      </tr>
      <tr>
        <td id="L11" class="blob-num js-line-number" data-line-number="11"></td>
        <td id="LC11" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">java.io.StringReader</span>;</td>
      </tr>
      <tr>
        <td id="L12" class="blob-num js-line-number" data-line-number="12"></td>
        <td id="LC12" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">java.util.ArrayList</span>;</td>
      </tr>
      <tr>
        <td id="L13" class="blob-num js-line-number" data-line-number="13"></td>
        <td id="LC13" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">java.util.HashSet</span>;</td>
      </tr>
      <tr>
        <td id="L14" class="blob-num js-line-number" data-line-number="14"></td>
        <td id="LC14" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">java.util.List</span>;</td>
      </tr>
      <tr>
        <td id="L15" class="blob-num js-line-number" data-line-number="15"></td>
        <td id="LC15" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">java.util.Scanner</span>;</td>
      </tr>
      <tr>
        <td id="L16" class="blob-num js-line-number" data-line-number="16"></td>
        <td id="LC16" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">java.util.Set</span>;</td>
      </tr>
      <tr>
        <td id="L17" class="blob-num js-line-number" data-line-number="17"></td>
        <td id="LC17" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">java.io.ObjectInputStream</span>;</td>
      </tr>
      <tr>
        <td id="L18" class="blob-num js-line-number" data-line-number="18"></td>
        <td id="LC18" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">java.io.ObjectOutputStream</span>;</td>
      </tr>
      <tr>
        <td id="L19" class="blob-num js-line-number" data-line-number="19"></td>
        <td id="LC19" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">java.io.FileInputStream</span>;</td>
      </tr>
      <tr>
        <td id="L20" class="blob-num js-line-number" data-line-number="20"></td>
        <td id="LC20" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">java.io.FileOutputStream</span>;</td>
      </tr>
      <tr>
        <td id="L21" class="blob-num js-line-number" data-line-number="21"></td>
        <td id="LC21" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">java.io.IOException</span>;</td>
      </tr>
      <tr>
        <td id="L22" class="blob-num js-line-number" data-line-number="22"></td>
        <td id="LC22" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">java.util.HashMap</span>;</td>
      </tr>
      <tr>
        <td id="L23" class="blob-num js-line-number" data-line-number="23"></td>
        <td id="LC23" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">java.util.Arrays</span>;</td>
      </tr>
      <tr>
        <td id="L24" class="blob-num js-line-number" data-line-number="24"></td>
        <td id="LC24" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">java.util.Properties</span>;</td>
      </tr>
      <tr>
        <td id="L25" class="blob-num js-line-number" data-line-number="25"></td>
        <td id="LC25" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L26" class="blob-num js-line-number" data-line-number="26"></td>
        <td id="LC26" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">edu.stanford.nlp.pipeline.*</span>;</td>
      </tr>
      <tr>
        <td id="L27" class="blob-num js-line-number" data-line-number="27"></td>
        <td id="LC27" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">edu.stanford.nlp.ling.CoreLabel</span>;</td>
      </tr>
      <tr>
        <td id="L28" class="blob-num js-line-number" data-line-number="28"></td>
        <td id="LC28" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">edu.stanford.nlp.util.CoreMap</span>;</td>
      </tr>
      <tr>
        <td id="L29" class="blob-num js-line-number" data-line-number="29"></td>
        <td id="LC29" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">edu.stanford.nlp.ling.CoreAnnotations.*</span>;</td>
      </tr>
      <tr>
        <td id="L30" class="blob-num js-line-number" data-line-number="30"></td>
        <td id="LC30" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">edu.stanford.nlp.ling.HasWord</span>;</td>
      </tr>
      <tr>
        <td id="L31" class="blob-num js-line-number" data-line-number="31"></td>
        <td id="LC31" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">edu.stanford.nlp.ling.SentenceUtils</span>;</td>
      </tr>
      <tr>
        <td id="L32" class="blob-num js-line-number" data-line-number="32"></td>
        <td id="LC32" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">edu.stanford.nlp.parser.lexparser.LexicalizedParser</span>;</td>
      </tr>
      <tr>
        <td id="L33" class="blob-num js-line-number" data-line-number="33"></td>
        <td id="LC33" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">edu.stanford.nlp.parser.shiftreduce.ShiftReduceParser</span>;</td>
      </tr>
      <tr>
        <td id="L34" class="blob-num js-line-number" data-line-number="34"></td>
        <td id="LC34" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">edu.stanford.nlp.process.CoreLabelTokenFactory</span>;</td>
      </tr>
      <tr>
        <td id="L35" class="blob-num js-line-number" data-line-number="35"></td>
        <td id="LC35" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">edu.stanford.nlp.process.DocumentPreprocessor</span>;</td>
      </tr>
      <tr>
        <td id="L36" class="blob-num js-line-number" data-line-number="36"></td>
        <td id="LC36" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">edu.stanford.nlp.process.PTBTokenizer</span>;</td>
      </tr>
      <tr>
        <td id="L37" class="blob-num js-line-number" data-line-number="37"></td>
        <td id="LC37" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">edu.stanford.nlp.tagger.maxent.MaxentTagger</span>;</td>
      </tr>
      <tr>
        <td id="L38" class="blob-num js-line-number" data-line-number="38"></td>
        <td id="LC38" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">edu.stanford.nlp.trees.Constituent</span>;</td>
      </tr>
      <tr>
        <td id="L39" class="blob-num js-line-number" data-line-number="39"></td>
        <td id="LC39" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">edu.stanford.nlp.trees.Tree</span>;</td>
      </tr>
      <tr>
        <td id="L40" class="blob-num js-line-number" data-line-number="40"></td>
        <td id="LC40" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">edu.stanford.nlp.ling.Word</span>;</td>
      </tr>
      <tr>
        <td id="L41" class="blob-num js-line-number" data-line-number="41"></td>
        <td id="LC41" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">edu.stanford.nlp.parser.nndep.DependencyParser</span>;</td>
      </tr>
      <tr>
        <td id="L42" class="blob-num js-line-number" data-line-number="42"></td>
        <td id="LC42" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">edu.stanford.nlp.trees.GrammaticalStructure</span>;</td>
      </tr>
      <tr>
        <td id="L43" class="blob-num js-line-number" data-line-number="43"></td>
        <td id="LC43" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">edu.stanford.nlp.trees.TypedDependency</span>;</td>
      </tr>
      <tr>
        <td id="L44" class="blob-num js-line-number" data-line-number="44"></td>
        <td id="LC44" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">edu.stanford.nlp.ie.AbstractSequenceClassifier</span>;</td>
      </tr>
      <tr>
        <td id="L45" class="blob-num js-line-number" data-line-number="45"></td>
        <td id="LC45" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">edu.stanford.nlp.ie.crf.*</span>;</td>
      </tr>
      <tr>
        <td id="L46" class="blob-num js-line-number" data-line-number="46"></td>
        <td id="LC46" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">edu.stanford.nlp.ling.CoreAnnotations</span>;</td>
      </tr>
      <tr>
        <td id="L47" class="blob-num js-line-number" data-line-number="47"></td>
        <td id="LC47" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L48" class="blob-num js-line-number" data-line-number="48"></td>
        <td id="LC48" class="blob-code blob-code-inner js-file-line"><span class="pl-c"><span class="pl-c">/*</span>*</span></td>
      </tr>
      <tr>
        <td id="L49" class="blob-num js-line-number" data-line-number="49"></td>
        <td id="LC49" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> * CS 5340</span></td>
      </tr>
      <tr>
        <td id="L50" class="blob-num js-line-number" data-line-number="50"></td>
        <td id="LC50" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> * Final Project</span></td>
      </tr>
      <tr>
        <td id="L51" class="blob-num js-line-number" data-line-number="51"></td>
        <td id="LC51" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> *</span></td>
      </tr>
      <tr>
        <td id="L52" class="blob-num js-line-number" data-line-number="52"></td>
        <td id="LC52" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> * @author Jacob Luke and Bernard Serbinowski</span></td>
      </tr>
      <tr>
        <td id="L53" class="blob-num js-line-number" data-line-number="53"></td>
        <td id="LC53" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> *</span></td>
      </tr>
      <tr>
        <td id="L54" class="blob-num js-line-number" data-line-number="54"></td>
        <td id="LC54" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> <span class="pl-c">*/</span></span></td>
      </tr>
      <tr>
        <td id="L55" class="blob-num js-line-number" data-line-number="55"></td>
        <td id="LC55" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L56" class="blob-num js-line-number" data-line-number="56"></td>
        <td id="LC56" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L57" class="blob-num js-line-number" data-line-number="57"></td>
        <td id="LC57" class="blob-code blob-code-inner js-file-line"><span class="pl-k">class</span> <span class="pl-en">Freq_tuple</span> {</td>
      </tr>
      <tr>
        <td id="L58" class="blob-num js-line-number" data-line-number="58"></td>
        <td id="LC58" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">public</span> <span class="pl-k">int</span> numerator;</td>
      </tr>
      <tr>
        <td id="L59" class="blob-num js-line-number" data-line-number="59"></td>
        <td id="LC59" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">public</span> <span class="pl-k">int</span> denominator;</td>
      </tr>
      <tr>
        <td id="L60" class="blob-num js-line-number" data-line-number="60"></td>
        <td id="LC60" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L61" class="blob-num js-line-number" data-line-number="61"></td>
        <td id="LC61" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">public</span> <span class="pl-en">Freq_tuple</span>(<span class="pl-k">int</span> <span class="pl-v">n</span>, <span class="pl-k">int</span> <span class="pl-v">d</span>){</td>
      </tr>
      <tr>
        <td id="L62" class="blob-num js-line-number" data-line-number="62"></td>
        <td id="LC62" class="blob-code blob-code-inner js-file-line">		numerator<span class="pl-k">=</span>n;</td>
      </tr>
      <tr>
        <td id="L63" class="blob-num js-line-number" data-line-number="63"></td>
        <td id="LC63" class="blob-code blob-code-inner js-file-line">		denominator<span class="pl-k">=</span>d;</td>
      </tr>
      <tr>
        <td id="L64" class="blob-num js-line-number" data-line-number="64"></td>
        <td id="LC64" class="blob-code blob-code-inner js-file-line">	}</td>
      </tr>
      <tr>
        <td id="L65" class="blob-num js-line-number" data-line-number="65"></td>
        <td id="LC65" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">public</span> <span class="pl-k">void</span> <span class="pl-en">inc_both</span>(){</td>
      </tr>
      <tr>
        <td id="L66" class="blob-num js-line-number" data-line-number="66"></td>
        <td id="LC66" class="blob-code blob-code-inner js-file-line">		numerator<span class="pl-k">++</span>;</td>
      </tr>
      <tr>
        <td id="L67" class="blob-num js-line-number" data-line-number="67"></td>
        <td id="LC67" class="blob-code blob-code-inner js-file-line">		denominator<span class="pl-k">++</span>;</td>
      </tr>
      <tr>
        <td id="L68" class="blob-num js-line-number" data-line-number="68"></td>
        <td id="LC68" class="blob-code blob-code-inner js-file-line">	}</td>
      </tr>
      <tr>
        <td id="L69" class="blob-num js-line-number" data-line-number="69"></td>
        <td id="LC69" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">public</span> <span class="pl-k">void</span> <span class="pl-en">inc_de</span>(){</td>
      </tr>
      <tr>
        <td id="L70" class="blob-num js-line-number" data-line-number="70"></td>
        <td id="LC70" class="blob-code blob-code-inner js-file-line">		denominator<span class="pl-k">=</span>denominator<span class="pl-k">+</span><span class="pl-c1">1</span>;</td>
      </tr>
      <tr>
        <td id="L71" class="blob-num js-line-number" data-line-number="71"></td>
        <td id="LC71" class="blob-code blob-code-inner js-file-line">	}</td>
      </tr>
      <tr>
        <td id="L72" class="blob-num js-line-number" data-line-number="72"></td>
        <td id="LC72" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">public</span> <span class="pl-smi">Double</span> <span class="pl-en">get_doub</span>(<span class="pl-k">int</span> <span class="pl-v">cut_off</span>, <span class="pl-k">double</span> <span class="pl-v">min_val</span>){</td>
      </tr>
      <tr>
        <td id="L73" class="blob-num js-line-number" data-line-number="73"></td>
        <td id="LC73" class="blob-code blob-code-inner js-file-line">		<span class="pl-c"><span class="pl-c">//</span>System.out.println(numerator+&quot;  &quot;+denominator+ &quot; &quot;+((double)(numerator))/((double)(denominator)));</span></td>
      </tr>
      <tr>
        <td id="L74" class="blob-num js-line-number" data-line-number="74"></td>
        <td id="LC74" class="blob-code blob-code-inner js-file-line">		<span class="pl-k">if</span>(numerator<span class="pl-k">&lt;</span>cut_off){</td>
      </tr>
      <tr>
        <td id="L75" class="blob-num js-line-number" data-line-number="75"></td>
        <td id="LC75" class="blob-code blob-code-inner js-file-line">			<span class="pl-k">return</span> <span class="pl-c1">0.0</span>;</td>
      </tr>
      <tr>
        <td id="L76" class="blob-num js-line-number" data-line-number="76"></td>
        <td id="LC76" class="blob-code blob-code-inner js-file-line">		}</td>
      </tr>
      <tr>
        <td id="L77" class="blob-num js-line-number" data-line-number="77"></td>
        <td id="LC77" class="blob-code blob-code-inner js-file-line">		<span class="pl-k">if</span>(((<span class="pl-k">double</span>)(numerator))<span class="pl-k">/</span>((<span class="pl-k">double</span>)(denominator))<span class="pl-k">&lt;</span>min_val){</td>
      </tr>
      <tr>
        <td id="L78" class="blob-num js-line-number" data-line-number="78"></td>
        <td id="LC78" class="blob-code blob-code-inner js-file-line">			<span class="pl-k">return</span> <span class="pl-c1">0.0</span>;</td>
      </tr>
      <tr>
        <td id="L79" class="blob-num js-line-number" data-line-number="79"></td>
        <td id="LC79" class="blob-code blob-code-inner js-file-line">		}</td>
      </tr>
      <tr>
        <td id="L80" class="blob-num js-line-number" data-line-number="80"></td>
        <td id="LC80" class="blob-code blob-code-inner js-file-line">		<span class="pl-k">return</span> ((<span class="pl-k">double</span>)(numerator))<span class="pl-k">/</span>((<span class="pl-k">double</span>)(denominator));</td>
      </tr>
      <tr>
        <td id="L81" class="blob-num js-line-number" data-line-number="81"></td>
        <td id="LC81" class="blob-code blob-code-inner js-file-line">	}</td>
      </tr>
      <tr>
        <td id="L82" class="blob-num js-line-number" data-line-number="82"></td>
        <td id="LC82" class="blob-code blob-code-inner js-file-line">}</td>
      </tr>
      <tr>
        <td id="L83" class="blob-num js-line-number" data-line-number="83"></td>
        <td id="LC83" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L84" class="blob-num js-line-number" data-line-number="84"></td>
        <td id="LC84" class="blob-code blob-code-inner js-file-line"><span class="pl-k">public</span> <span class="pl-k">class</span> <span class="pl-en">Incident_Selecter</span>{</td>
      </tr>
      <tr>
        <td id="L85" class="blob-num js-line-number" data-line-number="85"></td>
        <td id="LC85" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">private</span> <span class="pl-k">static</span> <span class="pl-k">HashMap&lt;<span class="pl-smi">String</span>, <span class="pl-smi">Integer</span>&gt;</span> dict<span class="pl-k">=</span><span class="pl-c1">null</span>;</td>
      </tr>
      <tr>
        <td id="L86" class="blob-num js-line-number" data-line-number="86"></td>
        <td id="LC86" class="blob-code blob-code-inner js-file-line"><span class="pl-c"><span class="pl-c">/*</span></span></td>
      </tr>
      <tr>
        <td id="L87" class="blob-num js-line-number" data-line-number="87"></td>
        <td id="LC87" class="blob-code blob-code-inner js-file-line"><span class="pl-c">	private static HashMap&lt;String, Freq_tuple&gt; freq_weapon=new HashMap&lt;&gt;();</span></td>
      </tr>
      <tr>
        <td id="L88" class="blob-num js-line-number" data-line-number="88"></td>
        <td id="LC88" class="blob-code blob-code-inner js-file-line"><span class="pl-c">	private static HashMap&lt;String, Freq_tuple&gt; freq_indv=new HashMap&lt;&gt;();</span></td>
      </tr>
      <tr>
        <td id="L89" class="blob-num js-line-number" data-line-number="89"></td>
        <td id="LC89" class="blob-code blob-code-inner js-file-line"><span class="pl-c">	private static HashMap&lt;String, Freq_tuple&gt; freq_org=new HashMap&lt;&gt;();</span></td>
      </tr>
      <tr>
        <td id="L90" class="blob-num js-line-number" data-line-number="90"></td>
        <td id="LC90" class="blob-code blob-code-inner js-file-line"><span class="pl-c">	private static HashMap&lt;String, Freq_tuple&gt; freq_tar=new HashMap&lt;&gt;();</span></td>
      </tr>
      <tr>
        <td id="L91" class="blob-num js-line-number" data-line-number="91"></td>
        <td id="LC91" class="blob-code blob-code-inner js-file-line"><span class="pl-c">	private static HashMap&lt;String, Freq_tuple&gt; freq_vic=new HashMap&lt;&gt;();</span></td>
      </tr>
      <tr>
        <td id="L92" class="blob-num js-line-number" data-line-number="92"></td>
        <td id="LC92" class="blob-code blob-code-inner js-file-line"><span class="pl-c"><span class="pl-c">*/</span></span></td>
      </tr>
      <tr>
        <td id="L93" class="blob-num js-line-number" data-line-number="93"></td>
        <td id="LC93" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">private</span> <span class="pl-k">static</span> <span class="pl-k">HashMap&lt;<span class="pl-smi">String</span>, <span class="pl-smi">Freq_tuple</span>&gt;</span> freq_arson<span class="pl-k">=</span><span class="pl-k">new</span> <span class="pl-k">HashMap&lt;&gt;</span>();</td>
      </tr>
      <tr>
        <td id="L94" class="blob-num js-line-number" data-line-number="94"></td>
        <td id="LC94" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">private</span> <span class="pl-k">static</span> <span class="pl-k">HashMap&lt;<span class="pl-smi">String</span>, <span class="pl-smi">Freq_tuple</span>&gt;</span> freq_attack<span class="pl-k">=</span><span class="pl-k">new</span> <span class="pl-k">HashMap&lt;&gt;</span>();</td>
      </tr>
      <tr>
        <td id="L95" class="blob-num js-line-number" data-line-number="95"></td>
        <td id="LC95" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">private</span> <span class="pl-k">static</span> <span class="pl-k">HashMap&lt;<span class="pl-smi">String</span>, <span class="pl-smi">Freq_tuple</span>&gt;</span> freq_bombing<span class="pl-k">=</span><span class="pl-k">new</span> <span class="pl-k">HashMap&lt;&gt;</span>();</td>
      </tr>
      <tr>
        <td id="L96" class="blob-num js-line-number" data-line-number="96"></td>
        <td id="LC96" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">private</span> <span class="pl-k">static</span> <span class="pl-k">HashMap&lt;<span class="pl-smi">String</span>, <span class="pl-smi">Freq_tuple</span>&gt;</span> freq_kidnapping<span class="pl-k">=</span><span class="pl-k">new</span> <span class="pl-k">HashMap&lt;&gt;</span>();</td>
      </tr>
      <tr>
        <td id="L97" class="blob-num js-line-number" data-line-number="97"></td>
        <td id="LC97" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">private</span> <span class="pl-k">static</span> <span class="pl-k">HashMap&lt;<span class="pl-smi">String</span>, <span class="pl-smi">Freq_tuple</span>&gt;</span> freq_robbery<span class="pl-k">=</span><span class="pl-k">new</span> <span class="pl-k">HashMap&lt;&gt;</span>();</td>
      </tr>
      <tr>
        <td id="L98" class="blob-num js-line-number" data-line-number="98"></td>
        <td id="LC98" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L99" class="blob-num js-line-number" data-line-number="99"></td>
        <td id="LC99" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L100" class="blob-num js-line-number" data-line-number="100"></td>
        <td id="LC100" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">private</span> <span class="pl-k">static</span> <span class="pl-k">ArrayList&lt;<span class="pl-smi">String</span>&gt;</span> ignore_arson<span class="pl-k">=</span><span class="pl-k">new</span> <span class="pl-k">ArrayList&lt;<span class="pl-smi">String</span>&gt;</span>(<span class="pl-smi">Arrays</span><span class="pl-k">.</span>asList(<span class="pl-s"><span class="pl-pds">&quot;</span><span class="pl-pds">&quot;</span></span>));</td>
      </tr>
      <tr>
        <td id="L101" class="blob-num js-line-number" data-line-number="101"></td>
        <td id="LC101" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">private</span> <span class="pl-k">static</span> <span class="pl-k">ArrayList&lt;<span class="pl-smi">String</span>&gt;</span> ignore_attack<span class="pl-k">=</span><span class="pl-k">new</span> <span class="pl-k">ArrayList&lt;<span class="pl-smi">String</span>&gt;</span>(<span class="pl-smi">Arrays</span><span class="pl-k">.</span>asList(<span class="pl-s"><span class="pl-pds">&quot;</span><span class="pl-pds">&quot;</span></span>));</td>
      </tr>
      <tr>
        <td id="L102" class="blob-num js-line-number" data-line-number="102"></td>
        <td id="LC102" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">private</span> <span class="pl-k">static</span> <span class="pl-k">ArrayList&lt;<span class="pl-smi">String</span>&gt;</span> ignore_bombing<span class="pl-k">=</span><span class="pl-k">new</span> <span class="pl-k">ArrayList&lt;<span class="pl-smi">String</span>&gt;</span>(<span class="pl-smi">Arrays</span><span class="pl-k">.</span>asList(<span class="pl-s"><span class="pl-pds">&quot;</span><span class="pl-pds">&quot;</span></span>));</td>
      </tr>
      <tr>
        <td id="L103" class="blob-num js-line-number" data-line-number="103"></td>
        <td id="LC103" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">private</span> <span class="pl-k">static</span> <span class="pl-k">ArrayList&lt;<span class="pl-smi">String</span>&gt;</span> ignore_kidnapping<span class="pl-k">=</span><span class="pl-k">new</span> <span class="pl-k">ArrayList&lt;<span class="pl-smi">String</span>&gt;</span>(<span class="pl-smi">Arrays</span><span class="pl-k">.</span>asList(<span class="pl-s"><span class="pl-pds">&quot;</span><span class="pl-pds">&quot;</span></span>));</td>
      </tr>
      <tr>
        <td id="L104" class="blob-num js-line-number" data-line-number="104"></td>
        <td id="LC104" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">private</span> <span class="pl-k">static</span> <span class="pl-k">ArrayList&lt;<span class="pl-smi">String</span>&gt;</span> ignore_robbery<span class="pl-k">=</span><span class="pl-k">new</span> <span class="pl-k">ArrayList&lt;<span class="pl-smi">String</span>&gt;</span>(<span class="pl-smi">Arrays</span><span class="pl-k">.</span>asList(<span class="pl-s"><span class="pl-pds">&quot;</span><span class="pl-pds">&quot;</span></span>));</td>
      </tr>
      <tr>
        <td id="L105" class="blob-num js-line-number" data-line-number="105"></td>
        <td id="LC105" class="blob-code blob-code-inner js-file-line">							//private static ArrayList&lt;String&gt; ignore_arson=new ArrayList&lt;String&gt;(Arrays.asList(&quot;&quot;, &quot;ATTENTION&quot;, &quot;GROUPS&quot;, &quot;TERRITORY&quot;, &quot;NEAR&quot;, &quot;SHOULD&quot;, &quot;THING&quot;, &quot;GENOCIDE&quot;, &quot;THINK&quot;, &quot;COMING&quot;, &quot;YEAR&quot;, &quot;TAKEN&quot;, &quot;YOUR&quot;, &quot;CARTRIDGES&quot;, &quot;LIMON&quot;, &quot;SEARCH&quot;, &quot;&#39;&quot;, &quot;MUCH&quot;, &quot;VARGAS&quot;, &quot;DYNAMITED&quot;, &quot;MEJICANOS&quot;, &quot;DEPARTMENT&quot;, &quot;,&quot;, &quot;WHERE&quot;, &quot;AN&quot;, &quot;-&quot;, &quot;.&quot;, &quot;CABANAS&quot;, &quot;1&quot;, &quot;HOW&quot;, &quot;AS&quot;, &quot;2&quot;, &quot;AT&quot;, &quot;3&quot;, &quot;4&quot;, &quot;THUS&quot;, &quot;6&quot;, &quot;9&quot;, &quot;:&quot;, &quot;REQUESTED&quot;, &quot;;&quot;, &quot;ELLACURIA&quot;, &quot;OUTSKIRTS&quot;, &quot;?&quot;, &quot;COMMANDO&quot;, &quot;SAME&quot;, &quot;DETERMINED&quot;, &quot;A&quot;, &quot;SHOWN&quot;, &quot;CHANGED&quot;, &quot;BE&quot;, &quot;SET&quot;, &quot;I&quot;, &quot;SMALL&quot;, &quot;BATTALION&quot;, &quot;PRIEST&quot;, &quot;BY&quot;, &quot;PARTICIPATED&quot;, &quot;COMMAND&quot;, &quot;TURN&quot;, &quot;KILLED&quot;, &quot;JUL&quot;, &quot;STATES&quot;, &quot;SITUATION&quot;, &quot;SUPPORTED&quot;, &quot;MARTI&quot;, &quot;CONTINUE&quot;, &quot;VEHICLES&quot;, &quot;SECURITY&quot;, &quot;IGNACIO&quot;, &quot;MACHINEGUNS&quot;, &quot;DO&quot;, &quot;AMMUNITION&quot;, &quot;MAURICIO&quot;, &quot;AREA&quot;, &quot;COUNTRY&quot;, &quot;PLACES&quot;, &quot;VIOLENT&quot;, &quot;EXPLOSIVES&quot;, &quot;EL&quot;, &quot;FOR&quot;, &quot;PRESS&quot;, &quot;DAMAGE&quot;, &quot;GUERRILLA&quot;, &quot;NEED&quot;, &quot;DOING&quot;, &quot;PASSAGE&quot;, &quot;OCCURRED&quot;, &quot;COORDINATING&quot;, &quot;ARAUCA&quot;, &quot;MOVEMENT&quot;, &quot;NEIGHBORHOOD&quot;, &quot;SUFFERING&quot;, &quot;ABOUT&quot;, &quot;CONTRIBUTE&quot;, &quot;ACTIVITIES&quot;, &quot;CENTERS&quot;, &quot;WITH&quot;, &quot;ACTION&quot;, &quot;TRUCK&quot;, &quot;HE&quot;, &quot;STRONG&quot;, &quot;TREACHEROUS&quot;, &quot;INTERCEPTED&quot;, &quot;NEGOTIATION&quot;, &quot;BECAUSE&quot;, &quot;CARRIES&quot;, &quot;TOLD&quot;, &quot;COLOMBIAN&quot;, &quot;CARRIED&quot;, &quot;IF&quot;, &quot;VARIOUS&quot;, &quot;IN&quot;, &quot;MOTHER&quot;, &quot;COUNTERATTACK&quot;, &quot;IS&quot;, &quot;IT&quot;, &quot;FORCE&quot;, &quot;EVEN&quot;, &quot;MAY&quot;, &quot;SQUADS&quot;, &quot;HAVE&quot;, &quot;AGENCIES&quot;, &quot;MONSIGNOR&quot;, &quot;AMBUSHED&quot;, &quot;ACTIONS&quot;, &quot;CADENA&quot;, &quot;KM&quot;, &quot;5TH&quot;, &quot;NOVEMBER&quot;, &quot;FIRST&quot;, &quot;CITY&quot;, &quot;LA&quot;, &quot;PERMANENT&quot;, &quot;PROVOKE&quot;, &quot;ARMY&quot;, &quot;CASUALTIES&quot;, &quot;SINGLE&quot;, &quot;WEST&quot;, &quot;DEATH&quot;, &quot;JOINED&quot;, &quot;DEFINITELY&quot;, &quot;EASTERN&quot;, &quot;REPORTS&quot;, &quot;ESPECIALLY&quot;, &quot;COMRADES&quot;, &quot;THEATER&quot;, &quot;WILLINGNESS&quot;, &quot;CEMETERY&quot;, &quot;IMPORTANT&quot;, &quot;WERE&quot;, &quot;GASOLINE&quot;, &quot;SOLDIERS&quot;, &quot;TOOK&quot;, &quot;READ&quot;, &quot;INSTITUTE&quot;, &quot;OIL&quot;, &quot;MEN&quot;, &quot;THREE&quot;, &quot;NEIGHBORHOODS&quot;, &quot;NO&quot;, &quot;LOCATED&quot;, &quot;LAND&quot;, &quot;CITIES&quot;, &quot;SAYS&quot;, &quot;MEMBER&quot;, &quot;OF&quot;, &quot;STRIKE&quot;, &quot;CHANGE&quot;, &quot;COMMANDER&quot;, &quot;CONFIRM&quot;, &quot;ON&quot;, &quot;ZACAMIL&quot;, &quot;REPORTED&quot;, &quot;SHOWED&quot;, &quot;OR&quot;, &quot;CONFRONT&quot;, &quot;COLOMBIA&quot;, &quot;ROMERO&quot;, &quot;ATTACK&quot;, &quot;SECOND&quot;, &quot;THEIR&quot;, &quot;GARCIA&quot;, &quot;OLD&quot;, &quot;BETWEEN&quot;, &quot;FRONT&quot;, &quot;THANK&quot;, &quot;RIFLE&quot;, &quot;POSITION&quot;, &quot;INCREASE&quot;, &quot;NOTHING&quot;, &quot;MIDDLE&quot;, &quot;KNOWLEDGE&quot;, &quot;NORTHEASTERN&quot;, &quot;MUST&quot;, &quot;SPANISH&quot;, &quot;EXPLOSIVE&quot;, &quot;CALM&quot;, &quot;STRATEGY&quot;, &quot;ONE&quot;, &quot;GROUP&quot;, &quot;1ST&quot;, &quot;U.S.&quot;, &quot;MESSAGES&quot;, &quot;SURRENDER&quot;, &quot;DOES&quot;, &quot;SO&quot;, &quot;ALTHOUGH&quot;, &quot;BUT&quot;, &quot;SUCH&quot;, &quot;GREAT&quot;, &quot;SALVADORAN&quot;, &quot;REBELS&quot;, &quot;DELGADO&quot;, &quot;CAME&quot;, &quot;RESPONSIBILITY&quot;, &quot;ALLIANCE&quot;, &quot;OTHER&quot;, &quot;PATROL&quot;, &quot;MAINTAINING&quot;, &quot;TO&quot;, &quot;BEHALF&quot;, &quot;UNION&quot;, &quot;CANO&quot;, &quot;THERE&quot;, &quot;BEGINNING&quot;, &quot;TRUTH&quot;, &quot;APPROXIMATELY&quot;, &quot;GUARD&quot;, &quot;EXPLAINING&quot;, &quot;GRENADE&quot;, &quot;CORRESPONDENT&quot;, &quot;UN&quot;, &quot;UP&quot;, &quot;DURING&quot;, &quot;US&quot;, &quot;PARTICIPATION&quot;, &quot;SALVADOR&quot;, &quot;THESE&quot;, &quot;WORKING&quot;, &quot;FINAL&quot;, &quot;MEANWHILE&quot;, &quot;WARN&quot;, &quot;YEARS&quot;, &quot;POSSIBLE&quot;, &quot;PRIESTS&quot;, &quot;LAST&quot;, &quot;WROTE&quot;, &quot;HOSPITAL&quot;, &quot;IMPOSED&quot;, &quot;STATIONED&quot;, &quot;WHETHER&quot;, &quot;INTERNATIONAL&quot;, &quot;CONTROL&quot;, &quot;GENERAL&quot;, &quot;WE&quot;, &quot;ACHIEVE&quot;, &quot;SALVADORANS&quot;, &quot;GUERRILLAS&quot;, &quot;PIPELINE&quot;, &quot;AREAS&quot;, &quot;SHOT&quot;, &quot;PROVIDE&quot;, &quot;PAID&quot;, &quot;TIME&quot;, &quot;ANOTHER&quot;, &quot;HOURS&quot;, &quot;STRUGGLE&quot;, &quot;PRESIDENT&quot;, &quot;NEWS&quot;, &quot;FILLED&quot;, &quot;PEOPLE&quot;, &quot;INSIDE&quot;, &quot;RAMON&quot;, &quot;PROBLEMS&quot;, &quot;PLAN&quot;, &quot;WOUNDED&quot;, &quot;INCIDENTS&quot;, &quot;WHEN&quot;, &quot;FAILED&quot;, &quot;BOTERO&quot;, &quot;DOMESTIC&quot;, &quot;OUR&quot;, &quot;OUT&quot;, &quot;GIVE&quot;, &quot;GEN&quot;, &quot;FIRED&quot;, &quot;CONTAIN&quot;, &quot;GET&quot;, &quot;BRIGADE&quot;, &quot;ARMORED&quot;, &quot;ADVANCE&quot;, &quot;PERSECUTION&quot;, &quot;1989&quot;, &quot;-LRB-&quot;, &quot;PRESENT&quot;, &quot;BEGIN&quot;, &quot;STEPPED&quot;, &quot;HOMES&quot;, &quot;ORDER&quot;, &quot;ADDED&quot;, &quot;LIBERATION&quot;, &quot;GIVEN&quot;, &quot;BEING&quot;, &quot;SEVEN&quot;, &quot;MANUEL&quot;, &quot;BOMBING&quot;, &quot;NAMED&quot;, &quot;MORE&quot;, &quot;CONFRONTING&quot;, &quot;CLANDESTINE&quot;, &quot;0200&quot;, &quot;SERVICE&quot;, &quot;UNITS&quot;, &quot;BOTH&quot;, &quot;REGIONAL&quot;, &quot;EXCEPT&quot;, &quot;CAN&quot;, &quot;AFRAID&quot;, &quot;DETACHMENT&quot;, &quot;CHURCH&quot;, &quot;3,000&quot;, &quot;PART&quot;, &quot;ALSO&quot;, &quot;RESULTED&quot;, &quot;TIMES&quot;, &quot;TODAY&quot;, &quot;DIRECTION&quot;, &quot;UNTIL&quot;, &quot;ADDS&quot;, &quot;STUDENTS&quot;, &quot;KILLING&quot;, &quot;MOVE&quot;, &quot;TARGETS&quot;, &quot;RESULT&quot;, &quot;``&quot;, &quot;HEARD&quot;, &quot;VENCEREMOS&quot;, &quot;ASSURANCES&quot;, &quot;TANKS&quot;, &quot;POLICE&quot;, &quot;HELICOPTERS&quot;, &quot;COMPLETELY&quot;, &quot;UNIFORM&quot;, &quot;CONTINUING&quot;, &quot;DEMANDS&quot;, &quot;BOMBINGS&quot;, &quot;POLICY&quot;, &quot;BEEN&quot;, &quot;PAST&quot;, &quot;STRATEGIC&quot;, &quot;REITERATE&quot;, &quot;THE&quot;, &quot;LUIS&quot;, &quot;BEGAN&quot;, &quot;UNITED&quot;, &quot;CONGRESS&quot;, &quot;JOINT&quot;, &quot;BARCO&quot;, &quot;ARMED&quot;, &quot;DEMOCRACY&quot;, &quot;OFFENSIVE&quot;, &quot;POWER&quot;, &quot;PLACE&quot;, &quot;GARRISONS&quot;, &quot;OPERATION&quot;, &quot;MINE&quot;, &quot;ADMITTED&quot;, &quot;INCREASED&quot;, &quot;RECORDING&quot;, &quot;DOWN&quot;, &quot;ADMINISTRATION&quot;, &quot;ELN&quot;, &quot;PAZ&quot;, &quot;ITS&quot;, &quot;PAY&quot;, &quot;TAKING&quot;, &quot;GLORIOUS&quot;, &quot;DEEPLY&quot;, &quot;NORTH&quot;, &quot;ENEMY&quot;, &quot;FOUND&quot;, &quot;TROOPS&quot;, &quot;SOLDIER&quot;, &quot;STATION&quot;, &quot;NATIONALIST&quot;, &quot;INSTALLATIONS&quot;, &quot;EARLY&quot;, &quot;FMLN&quot;, &quot;TOWARD&quot;, &quot;HEAVY&quot;, &quot;HIGHWAY&quot;, &quot;END&quot;, &quot;DEFENSE&quot;, &quot;AFP&quot;, &quot;LEVELS&quot;, &quot;DEPARTMENTS&quot;, &quot;JUST&quot;, &quot;SOME&quot;, &quot;FOLLOWS&quot;, &quot;CONCERNING&quot;, &quot;&#39;&#39;&quot;, &quot;TERRORISTS&quot;, &quot;CONDUCTING&quot;, &quot;MORTARS&quot;, &quot;OVER&quot;, &quot;JESUIT&quot;, &quot;OTHERS&quot;, &quot;OFFICERS&quot;, &quot;CRISTIANI&quot;, &quot;BOARD&quot;, &quot;FOUR&quot;, &quot;RECEIVING&quot;, &quot;TEXT&quot;, &quot;&#39;S&quot;, &quot;CLAIMS&quot;, &quot;INTERIOR&quot;, &quot;WHICH&quot;, &quot;ELSE&quot;, &quot;FORCES&quot;, &quot;LEFTIST&quot;, &quot;SOUTH&quot;, &quot;HOPE&quot;, &quot;VERY&quot;, &quot;NATIONAL&quot;, &quot;COMMENTARY&quot;, &quot;6TH&quot;, &quot;AIR&quot;, &quot;STILL&quot;, &quot;HOWEVER&quot;, &quot;LEADERSHIP&quot;, &quot;ERP&quot;, &quot;SAYING&quot;, &quot;COUNTERINSURGENCY&quot;, &quot;REVOLUTIONARY&quot;, &quot;RIGHT&quot;, &quot;FACTORY&quot;, &quot;INTERVENTION&quot;, &quot;PRESENTED&quot;, &quot;MATERIAL&quot;, &quot;CONTROLLED&quot;, &quot;EFFORTS&quot;, &quot;FARABUNDO&quot;, &quot;VICENTE&quot;, &quot;CALLED&quot;, &quot;INTERVIEW&quot;, &quot;-RSB-&quot;, &quot;SIEGE&quot;, &quot;THAT&quot;, &quot;ATTACKS&quot;, &quot;ALL&quot;, &quot;TERRORIST&quot;, &quot;ALONG&quot;, &quot;RECEIVE&quot;, &quot;HAPPENED&quot;, &quot;ORGANIZATIONS&quot;, &quot;SOVEREIGNTY&quot;, &quot;TALKS&quot;, &quot;MINUTE&quot;, &quot;--&quot;, &quot;DETACHMENTS&quot;, &quot;MORAZAN&quot;, &quot;TRUE&quot;, &quot;JUSTICE&quot;, &quot;POPULATED&quot;, &quot;AND&quot;, &quot;AGREED&quot;, &quot;UNLEASHED&quot;, &quot;ANY&quot;, &quot;MAKE&quot;, &quot;YSKL&quot;, &quot;GOING&quot;, &quot;STARTED&quot;, &quot;MATERIEL&quot;, &quot;BELIEVE&quot;, &quot;ALFREDO&quot;, &quot;NUNS&quot;, &quot;LED&quot;, &quot;COOPERATION&quot;, &quot;CURRENTLY&quot;, &quot;ATTACKING&quot;, &quot;FREEDOM&quot;, &quot;SCHOOL&quot;, &quot;WEAPONS&quot;, &quot;OWNED&quot;, &quot;AFTER&quot;, &quot;CLOSE&quot;, &quot;ERNESTO&quot;, &quot;PLURALISM&quot;, &quot;THEY&quot;, &quot;FIRE&quot;, &quot;SABOTAGED&quot;, &quot;FAITH&quot;, &quot;INCLUDE&quot;, &quot;10&quot;, &quot;ENGINEERS&quot;, &quot;ATTACKED&quot;, &quot;18&quot;, &quot;19&quot;, &quot;SONORA&quot;, &quot;TWO&quot;, &quot;ANNOUNCEMENT&quot;, &quot;REPUBLICAN&quot;, &quot;ARE&quot;, &quot;BOGOTA&quot;, &quot;SOURCE&quot;, &quot;MIGUEL&quot;, &quot;THEM&quot;, &quot;PARTY&quot;, &quot;23&quot;, &quot;26&quot;, &quot;REPEAT&quot;, &quot;PARTS&quot;, &quot;2D&quot;, &quot;ASK&quot;, &quot;SEEK&quot;, &quot;HILL&quot;, &quot;36&quot;, &quot;WORDS&quot;, &quot;REPRESENT&quot;, &quot;UNDER&quot;, &quot;FIFTH&quot;, &quot;OPEN&quot;, &quot;CONTINUED&quot;, &quot;3D&quot;, &quot;EXPLOSIONS&quot;, &quot;JOSE&quot;, &quot;STAFF&quot;, &quot;HAS&quot;, &quot;CONTINUES&quot;, &quot;INDISTINCT&quot;, &quot;FIVE&quot;, &quot;FAMILIES&quot;, &quot;SEVERAL&quot;, &quot;NUMBER&quot;, &quot;CHIEFS&quot;, &quot;KNOW&quot;, &quot;FASCIST&quot;, &quot;NOT&quot;, &quot;NOV&quot;, &quot;PLANE&quot;, &quot;NOW&quot;, &quot;-RRB-&quot;, &quot;RIFLES&quot;, &quot;THIS&quot;, &quot;60&quot;, &quot;UNIVERSITY&quot;, &quot;OPERATIONS&quot;, &quot;YES&quot;, &quot;WAS&quot;, &quot;PEACE&quot;, &quot;WAY&quot;, &quot;CAMPUS&quot;, &quot;ARTILLERY&quot;, &quot;CIUDAD&quot;, &quot;SLOGANS&quot;, &quot;REPORT&quot;, &quot;WRITING&quot;, &quot;PUT&quot;, &quot;AGAINST&quot;, &quot;PEREZ&quot;, &quot;FAR&quot;, &quot;CAPITAL&quot;, &quot;HOMELAND&quot;, &quot;89&quot;, &quot;-LSB-&quot;, &quot;MORNING&quot;, &quot;CLASHES&quot;, &quot;WORD&quot;, &quot;TELEPHONE&quot;, &quot;ARRESTED&quot;, &quot;SUBMACHINEGUN&quot;, &quot;THOSE&quot;, &quot;MILITARY&quot;, &quot;INDICATE&quot;, &quot;WORK&quot;, &quot;WITHOUT&quot;, &quot;SO-CALLED&quot;, &quot;POSTS&quot;, &quot;COLONEL&quot;, &quot;ARRIVED&quot;, &quot;LARGE&quot;, &quot;SPREAD&quot;, &quot;COWARDLY&quot;, &quot;DARK&quot;, &quot;HIM&quot;, &quot;HIT&quot;, &quot;ADDITION&quot;, &quot;OCCUPIED&quot;, &quot;RADIO&quot;, &quot;FEW&quot;, &quot;DEVICES&quot;, &quot;DAY&quot;, &quot;DISLODGE&quot;, &quot;M-16&quot;, &quot;ONLY&quot;, &quot;DEATHS&quot;, &quot;FROM&quot;, &quot;JESUITS&quot;, &quot;SUPPORT&quot;, &quot;POSITIONS&quot;, &quot;HEADQUARTERS&quot;, &quot;GUARDS&quot;, &quot;WORLD&quot;, &quot;WHO&quot;, &quot;CONDUCTED&quot;, &quot;SANDOVAL&quot;, &quot;INTERVIEWED&quot;, &quot;MEMBERS&quot;, &quot;SINCE&quot;, &quot;INFANTRY&quot;, &quot;FIGHTING&quot;, &quot;INDISCRIMINATE&quot;, &quot;DATE&quot;, &quot;CASTRO&quot;, &quot;INJURED&quot;, &quot;WIN&quot;, &quot;SAN&quot;, &quot;TRANQUILITY&quot;, &quot;SAY&quot;, &quot;SAID&quot;, &quot;HERE&quot;, &quot;COURAGE&quot;, &quot;BURNED&quot;, &quot;WEEK&quot;, &quot;BASIS&quot;, &quot;TOTAL&quot;, &quot;INDUSTRY&quot;, &quot;BAN&quot;, &quot;THROUGHOUT&quot;, &quot;CHIEF&quot;, &quot;WILL&quot;, &quot;WHILE&quot;, &quot;GENERATE&quot;, &quot;THEMSELVES&quot;, &quot;YOU&quot;));</td>
      </tr>
      <tr>
        <td id="L106" class="blob-num js-line-number" data-line-number="106"></td>
        <td id="LC106" class="blob-code blob-code-inner js-file-line">							//private static ArrayList&lt;String&gt; ignore_bombing=new ArrayList&lt;String&gt;(Arrays.asList(&quot;&quot;, &quot;ATTENTION&quot;, &quot;DIRECTORATE&quot;, &quot;GROUPS&quot;, &quot;TERRITORY&quot;, &quot;POOR&quot;, &quot;AFFECTED&quot;, &quot;NEAR&quot;, &quot;FARC&quot;, &quot;YEAR&quot;, &quot;COMMUNIQUE&quot;, &quot;TAKEN&quot;, &quot;URGE&quot;, &quot;ADVISABLE&quot;, &quot;DEMONSTRATIONS&quot;, &quot;$&quot;, &quot;STOP&quot;, &quot;&#39;&quot;, &quot;MIGHT&quot;, &quot;VARGAS&quot;, &quot;MEJICANOS&quot;, &quot;DEPARTMENT&quot;, &quot;,&quot;, &quot;WHERE&quot;, &quot;EMILIO&quot;, &quot;-&quot;, &quot;.&quot;, &quot;CABANAS&quot;, &quot;1&quot;, &quot;2&quot;, &quot;SEE&quot;, &quot;3&quot;, &quot;4&quot;, &quot;5&quot;, &quot;6&quot;, &quot;7&quot;, &quot;8&quot;, &quot;9&quot;, &quot;ADVISE&quot;, &quot;:&quot;, &quot;;&quot;, &quot;ACHIEVING&quot;, &quot;UNDERSTAND&quot;, &quot;?&quot;, &quot;SEP&quot;, &quot;A&quot;, &quot;RESPOND&quot;, &quot;SET&quot;, &quot;I&quot;, &quot;FLORES&quot;, &quot;BATTALION&quot;, &quot;PARTICIPATED&quot;, &quot;ATTRIBUTED&quot;, &quot;JUL&quot;, &quot;STATES&quot;, &quot;JURISDICTION&quot;, &quot;SUPPORTED&quot;, &quot;MILLION&quot;, &quot;CONTINUE&quot;, &quot;VEHICLES&quot;, &quot;SUSPEND&quot;, &quot;RELATIONS&quot;, &quot;SECURITY&quot;, &quot;D&#39;AUBUISSON&quot;, &quot;COLINDRES&quot;, &quot;STATEMENT&quot;, &quot;SERVICES&quot;, &quot;POST&quot;, &quot;REPEATEDLY&quot;, &quot;COOPERATE&quot;, &quot;SHE&quot;, &quot;PRISONERS&quot;, &quot;COUNTRY&quot;, &quot;NINE&quot;, &quot;WITNESSES&quot;, &quot;FINDING&quot;, &quot;TONIGHT&quot;, &quot;PLACES&quot;, &quot;VIOLENT&quot;, &quot;STRICT&quot;, &quot;EXPLOSIVES&quot;, &quot;HUMBERTO&quot;, &quot;FOR&quot;, &quot;DEPUTY&quot;, &quot;USING&quot;, &quot;NEED&quot;, &quot;FOLLOWED&quot;, &quot;DOING&quot;, &quot;ATTAIN&quot;, &quot;LIVES&quot;, &quot;PASSAGE&quot;, &quot;SIT&quot;, &quot;OAS&quot;, &quot;AMBASSADOR&quot;, &quot;OCCURRED&quot;, &quot;SIX&quot;, &quot;COORDINATING&quot;, &quot;BUSES&quot;, &quot;WITHIN&quot;, &quot;DEMANDED&quot;, &quot;ACTING&quot;, &quot;PROGRESS&quot;, &quot;REACTION&quot;, &quot;DETAINED&quot;, &quot;OPINION&quot;, &quot;CHARGE&quot;, &quot;RODRIGUEZ&quot;, &quot;WHITE&quot;, &quot;BATTLE&quot;, &quot;ATTEMPTED&quot;, &quot;OCTOBER&quot;, &quot;ACTIVITIES&quot;, &quot;VIOLENCE&quot;, &quot;CARLOS&quot;, &quot;STATEMENTS&quot;, &quot;RICA&quot;, &quot;ACTION&quot;, &quot;DESIRE&quot;, &quot;FRG&quot;, &quot;AGENTS&quot;, &quot;PROVES&quot;, &quot;CARACOL&quot;, &quot;PLANNED&quot;, &quot;TRUCE&quot;, &quot;CANDIDATE&quot;, &quot;NEGOTIATION&quot;, &quot;UNDERSECRETARY&quot;, &quot;GUILLERMO&quot;, &quot;SEARCHING&quot;, &quot;TOLD&quot;, &quot;CARRIED&quot;, &quot;SPOT&quot;, &quot;BELIEF&quot;, &quot;PABLO&quot;, &quot;FORCE&quot;, &quot;MSGR&quot;, &quot;AUGUSTO&quot;, &quot;FEBRUARY&quot;, &quot;BECOME&quot;, &quot;OPPOSITION&quot;, &quot;AMBUSHED&quot;, &quot;ACTIONS&quot;, &quot;ASKING&quot;, &quot;CEASE&quot;, &quot;COUNCIL&quot;, &quot;GACHA&quot;, &quot;SPECIFICALLY&quot;, &quot;ADDING&quot;, &quot;5TH&quot;, &quot;ENDED&quot;, &quot;NOVEMBER&quot;, &quot;THREAT&quot;, &quot;COMMISSION&quot;, &quot;SON&quot;, &quot;CITY&quot;, &quot;CLAIMING&quot;, &quot;TREATED&quot;, &quot;CREW&quot;, &quot;CASUALTIES&quot;, &quot;ALAN&quot;, &quot;COLUMN&quot;, &quot;FRENCH&quot;, &quot;WILLING&quot;, &quot;STATUS&quot;, &quot;EASTERN&quot;, &quot;WARNED&quot;, &quot;REPORTS&quot;, &quot;SECTORS&quot;, &quot;RETURNED&quot;, &quot;JANUARY&quot;, &quot;COMRADES&quot;, &quot;TRULY&quot;, &quot;UNIT&quot;, &quot;IMPORTANT&quot;, &quot;DISCUSS&quot;, &quot;AGREEMENT&quot;, &quot;ASSASSIN&quot;, &quot;TOOK&quot;, &quot;READ&quot;, &quot;INSTITUTE&quot;, &quot;MAYOR&quot;, &quot;OIL&quot;, &quot;BEHIND&quot;, &quot;ALLEGED&quot;, &quot;REAL&quot;, &quot;SPEAKING&quot;, &quot;NEIGHBORHOODS&quot;, &quot;COSTA&quot;, &quot;NEIGHBORING&quot;, &quot;INVITED&quot;, &quot;EXTRADITABLES&quot;, &quot;CHAMORRO&quot;, &quot;FOLLOWING&quot;, &quot;REPORTER&quot;, &quot;HANDS&quot;, &quot;LIBERAL&quot;, &quot;VENEZUELA&quot;, &quot;PRESIDENTIAL&quot;, &quot;STRIKE&quot;, &quot;CHANGE&quot;, &quot;CONFIRM&quot;, &quot;ANTONIO&quot;, &quot;APRIL&quot;, &quot;REPORTED&quot;, &quot;MOMENT&quot;, &quot;ELECTED&quot;, &quot;CONFRONT&quot;, &quot;COLOMBIA&quot;, &quot;REBEL&quot;, &quot;VISIT&quot;, &quot;ROMERO&quot;, &quot;MANAGUA&quot;, &quot;RESOLVE&quot;, &quot;ATTACK&quot;, &quot;UNKNOWN&quot;, &quot;BOSSES&quot;, &quot;DOZEN&quot;, &quot;IN-DEPTH&quot;, &quot;WILLIAM&quot;, &quot;BURIAL&quot;, &quot;CIVIL&quot;, &quot;GOVERNOR&quot;, &quot;LEAST&quot;, &quot;OLD&quot;, &quot;OBSERVERS&quot;, &quot;FRONT&quot;, &quot;RIFLE&quot;, &quot;CONSIDERED&quot;, &quot;POSITION&quot;, &quot;COMMUNITY&quot;, &quot;PROCESS&quot;, &quot;CIVIC&quot;, &quot;SEEKING&quot;, &quot;SOLIDARITY&quot;, &quot;BRAZIL&quot;, &quot;TRIAL&quot;, &quot;MUNICIPAL&quot;, &quot;ESTABLISHED&quot;, &quot;SPANISH&quot;, &quot;ANGRY&quot;, &quot;KEY&quot;, &quot;ACTS&quot;, &quot;BEGUN&quot;, &quot;CALL&quot;, &quot;EMERGENCY&quot;, &quot;CALI&quot;, &quot;ATTENDED&quot;, &quot;CARACAS&quot;, &quot;ONE&quot;, &quot;SUPPLIES&quot;, &quot;RETURNING&quot;, &quot;SUFFERED&quot;, &quot;CLEARED&quot;, &quot;MAOIST&quot;, &quot;1ST&quot;, &quot;BROUGHT&quot;, &quot;BUT&quot;, &quot;SUCH&quot;, &quot;GREAT&quot;, &quot;SALVADORAN&quot;, &quot;HEADS&quot;, &quot;FACILITIES&quot;, &quot;CAME&quot;, &quot;EVERYTHING&quot;, &quot;RESPONSIBILITY&quot;, &quot;...&quot;, &quot;ALLIANCE&quot;, &quot;OTHER&quot;, &quot;REQUEST&quot;, &quot;PERCENT&quot;, &quot;COMMUNIST&quot;, &quot;BEHALF&quot;, &quot;VICE&quot;, &quot;REVEALS&quot;, &quot;HISTORY&quot;, &quot;CANO&quot;, &quot;EARLIER&quot;, &quot;AIRCRAFT&quot;, &quot;NEITHER&quot;, &quot;CATHEDRAL&quot;, &quot;FIERCE&quot;, &quot;METROPOLITAN&quot;, &quot;ALERT&quot;, &quot;CLASS&quot;, &quot;TECHNICAL&quot;, &quot;BEGINNING&quot;, &quot;VIEW&quot;, &quot;LINES&quot;, &quot;ACCOUNT&quot;, &quot;GUARD&quot;, &quot;ABSOLUTELY&quot;, &quot;DURING&quot;, &quot;COURTS&quot;, &quot;CLASH&quot;, &quot;SALVADOR&quot;, &quot;SERVED&quot;, &quot;WORKING&quot;, &quot;TRAFFICKERS&quot;, &quot;NAME&quot;, &quot;YEARS&quot;, &quot;VISTA&quot;, &quot;TOWN&quot;, &quot;HOSPITAL&quot;, &quot;MEASURES&quot;, &quot;BRING&quot;, &quot;EXPERIENCE&quot;, &quot;SOMOZA&quot;, &quot;WHETHER&quot;, &quot;INTERNATIONAL&quot;, &quot;CONTROL&quot;, &quot;ENTERED&quot;, &quot;NARINO&quot;, &quot;OFFICIALS&quot;, &quot;IMPROVE&quot;, &quot;NEGOTIATIONS&quot;, &quot;GEORGE&quot;, &quot;THOUGH&quot;, &quot;GENERAL&quot;, &quot;HIGHER&quot;, &quot;JUDGE&quot;, &quot;QUESTION&quot;, &quot;ACHIEVE&quot;, &quot;SIGNED&quot;, &quot;NEXT&quot;, &quot;SALVADORANS&quot;, &quot;LEAVE&quot;, &quot;PIPELINE&quot;, &quot;SHOW&quot;, &quot;LAUNCH&quot;, &quot;PROVIDE&quot;, &quot;LEFT-WING&quot;, &quot;SERVING&quot;, &quot;APPROACH&quot;, &quot;REGARD&quot;, &quot;WHAT&quot;, &quot;GREEN&quot;, &quot;URGENT&quot;, &quot;AGENCY&quot;, &quot;FMLN-FDR&quot;, &quot;STRUGGLE&quot;, &quot;0630&quot;, &quot;DUTY&quot;, &quot;PRESIDENT&quot;, &quot;NEWS&quot;, &quot;AGENDA&quot;, &quot;GENOCIDAL&quot;, &quot;MINUTES&quot;, &quot;MEDELLIN&quot;, &quot;UNIONS&quot;, &quot;INSIDE&quot;, &quot;UNTS&quot;, &quot;1966&quot;, &quot;DIRECTORS&quot;, &quot;PROBLEMS&quot;, &quot;NICARAGUAN&quot;, &quot;PLAN&quot;, &quot;RENE&quot;, &quot;WOUNDED&quot;, &quot;INCIDENTS&quot;, &quot;PLAY&quot;, &quot;WHEN&quot;, &quot;YARD&quot;, &quot;FAILED&quot;, &quot;BREAK&quot;, &quot;LOCAL&quot;, &quot;DOCUMENT&quot;, &quot;BOTERO&quot;, &quot;RECOGNIZED&quot;, &quot;PERSON&quot;, &quot;DOMESTIC&quot;, &quot;ENTERING&quot;, &quot;LITTLE&quot;, &quot;SUBJECTED&quot;, &quot;OUR&quot;, &quot;OUT&quot;, &quot;CASE&quot;, &quot;GIVE&quot;, &quot;GEN&quot;, &quot;AIMED&quot;, &quot;1980&quot;, &quot;GET&quot;, &quot;SYSTEMS&quot;, &quot;BRIGADE&quot;, &quot;ADVANCE&quot;, &quot;INVOLVE&quot;, &quot;PERSECUTION&quot;, &quot;SECRET&quot;, &quot;ACCUSED&quot;, &quot;STOLEN&quot;, &quot;STAGED&quot;, &quot;PRESENT&quot;, &quot;BEGIN&quot;, &quot;ROBERTO&quot;, &quot;JOURNALIST&quot;, &quot;DOLLARS&quot;, &quot;SEVEN&quot;, &quot;SENATOR&quot;, &quot;CONDEMNED&quot;, &quot;BOMBING&quot;, &quot;PHYSICAL&quot;, &quot;SPOKESMEN&quot;, &quot;OWN&quot;, &quot;MORE&quot;, &quot;INVESTIGATORS&quot;, &quot;SAENZ&quot;, &quot;LIVING&quot;, &quot;LIBERTY&quot;, &quot;MORAL&quot;, &quot;CONTACT&quot;, &quot;PERSONALITIES&quot;, &quot;ANNOUNCE&quot;, &quot;SAFETY&quot;, &quot;MEASURE&quot;, &quot;USULUTAN&quot;, &quot;CLANDESTINE&quot;, &quot;SERIOUS&quot;, &quot;AUXILIARY&quot;, &quot;ALVARO&quot;, &quot;STATED&quot;, &quot;0200&quot;, &quot;CONTINENT&quot;, &quot;USED&quot;, &quot;SERVICE&quot;, &quot;STRONGLY&quot;, &quot;BOTH&quot;, &quot;DIFFERENT&quot;, &quot;ANYONE&quot;, &quot;KEEP&quot;, &quot;MOST&quot;, &quot;WEEKEND&quot;, &quot;TRIED&quot;, &quot;GRIPPED&quot;, &quot;ITSELF&quot;, &quot;CAN&quot;, &quot;FLIGHT&quot;, &quot;ESTABLISH&quot;, &quot;FRANCISCO&quot;, &quot;ARTURO&quot;, &quot;URGED&quot;, &quot;RELATED&quot;, &quot;MURDERS&quot;, &quot;DIED&quot;, &quot;ASSUMED&quot;, &quot;DETACHMENT&quot;, &quot;GOMEZ&quot;, &quot;ANGELES&quot;, &quot;TREASURY&quot;, &quot;ALSO&quot;, &quot;INVOLVED&quot;, &quot;SECONDLY&quot;, &quot;SERIES&quot;, &quot;TODAY&quot;, &quot;CHAVEZ&quot;, &quot;COMMENTED&quot;, &quot;CHALATENANGO&quot;, &quot;MEDIATE&quot;, &quot;UNTIL&quot;, &quot;ADDS&quot;, &quot;TELLING&quot;, &quot;KILLING&quot;, &quot;MOVE&quot;, &quot;DEVELOPMENT&quot;, &quot;CROSS&quot;, &quot;EDUARDO&quot;, &quot;TARGETS&quot;, &quot;SPOKESMAN&quot;, &quot;APPROVED&quot;, &quot;RESULT&quot;, &quot;RIGHT-WING&quot;, &quot;IMPLEMENTED&quot;, &quot;SIMPLY&quot;, &quot;UNDETERMINED&quot;, &quot;TANKS&quot;, &quot;POLICE&quot;, &quot;VEHICLE&quot;, &quot;COMBAT&quot;, &quot;TRAFFICKING&quot;, &quot;METHODS&quot;, &quot;GMT&quot;, &quot;TOGETHER&quot;, &quot;MAKING&quot;, &quot;NATIONS&quot;, &quot;DELEGATIONS&quot;, &quot;NATIONALITY&quot;, &quot;EYES&quot;, &quot;WHOM&quot;, &quot;CRITICIZED&quot;, &quot;THE&quot;, &quot;LUIS&quot;, &quot;BROKE&quot;, &quot;KINGPINS&quot;, &quot;SURROUNDED&quot;, &quot;REGRET&quot;, &quot;OBJECTIVE&quot;, &quot;GOD&quot;, &quot;JOINT&quot;, &quot;BARCO&quot;, &quot;ARMED&quot;, &quot;PSYCHOLOGICAL&quot;, &quot;RULED&quot;, &quot;OFFENSIVE&quot;, &quot;POWER&quot;, &quot;PLACE&quot;, &quot;MUNICIPALITY&quot;, &quot;ANTIOQUIA&quot;, &quot;EXTREME&quot;, &quot;ABROAD&quot;, &quot;REALLY&quot;, &quot;DEAD&quot;, &quot;ADMITTED&quot;, &quot;SYSTEM&quot;, &quot;EMBASSY&quot;, &quot;DRIVER&quot;, &quot;PAZ&quot;, &quot;ISSUE&quot;, &quot;NORTH&quot;, &quot;CONSTANTLY&quot;, &quot;MINISTRY&quot;, &quot;ENEMY&quot;, &quot;TROOPS&quot;, &quot;CRITICAL&quot;, &quot;RESPONSIBLE&quot;, &quot;STATION&quot;, &quot;NATIONALIST&quot;, &quot;TOTALLY&quot;, &quot;SOLVE&quot;, &quot;BENITO&quot;, &quot;CURRENT&quot;, &quot;MEDICAL&quot;, &quot;INDEPENDENCE&quot;, &quot;FUENTES&quot;, &quot;INCLUDED&quot;, &quot;INDIVIDUAL&quot;, &quot;CONDEMNING&quot;, &quot;PRESSURE&quot;, &quot;PEASANTS&quot;, &quot;FOLLOWS&quot;, &quot;&#39;&#39;&quot;, &quot;EXCLUSIVE&quot;, &quot;TERRORISTS&quot;, &quot;DISTURBANCES&quot;, &quot;MORTARS&quot;, &quot;IDENTIFIED&quot;, &quot;SOCIALIST&quot;, &quot;MEETING&quot;, &quot;PROBABLY&quot;, &quot;ILLEGAL&quot;, &quot;OVER&quot;, &quot;RELEASED&quot;, &quot;BOARD&quot;, &quot;COFFEE&quot;, &quot;RANKS&quot;, &quot;FOUR&quot;, &quot;&#39;S&quot;, &quot;REACTED&quot;, &quot;IMAGE&quot;, &quot;CONFIRMED&quot;, &quot;CLAIMS&quot;, &quot;INTERIOR&quot;, &quot;WHICH&quot;, &quot;ELSE&quot;, &quot;SOUTH&quot;, &quot;MANNER&quot;, &quot;VERY&quot;, &quot;RAUL&quot;, &quot;READY&quot;, &quot;SENATE&quot;, &quot;6TH&quot;, &quot;GUILTY&quot;, &quot;EITHER&quot;, &quot;REGION&quot;, &quot;HOWEVER&quot;, &quot;TOP&quot;, &quot;TOO&quot;, &quot;CONGRESSMEN&quot;, &quot;NARCOTERRORISTS&quot;, &quot;ARGENTINE&quot;, &quot;NEWSCAST&quot;, &quot;FRIDAY&quot;, &quot;REITERATED&quot;, &quot;SAYING&quot;, &quot;ALWAYS&quot;, &quot;ORGANIZATION&quot;, &quot;JUSTIFIED&quot;, &quot;LARGEST&quot;, &quot;LAUNCHED&quot;, &quot;PURPOSE&quot;, &quot;MATERIAL&quot;, &quot;COL&quot;, &quot;BETTER&quot;, &quot;HONDURAN&quot;, &quot;EFFORTS&quot;, &quot;DEMONSTRATE&quot;, &quot;FARABUNDO&quot;, &quot;LAUNDERING&quot;, &quot;HONDURAS&quot;, &quot;PERHAPS&quot;, &quot;VICENTE&quot;, &quot;ORGANIZED&quot;, &quot;SUSPENSION&quot;, &quot;PROVE&quot;, &quot;INTERVIEW&quot;, &quot;BLOCKS&quot;, &quot;REGIME&quot;, &quot;-RSB-&quot;, &quot;GETTING&quot;, &quot;JORGE&quot;, &quot;AFFIRMED&quot;, &quot;LAS&quot;, &quot;THAT&quot;, &quot;ATTACKS&quot;, &quot;ASSEMBLY&quot;, &quot;RECENT&quot;, &quot;LAW&quot;, &quot;HIGH&quot;, &quot;THURSDAY&quot;, &quot;THAN&quot;, &quot;WESTERN&quot;, &quot;ALONG&quot;, &quot;BUSINESS&quot;, &quot;INSURGENTS&quot;, &quot;UPCOMING&quot;, &quot;TRY&quot;, &quot;COMMANDERS&quot;, &quot;CREATING&quot;, &quot;--&quot;, &quot;LEADERS&quot;, &quot;OFFERED&quot;, &quot;SAMAYOA&quot;, &quot;NEGOTIATE&quot;, &quot;BROAD&quot;, &quot;JUSTICE&quot;, &quot;POPULATED&quot;, &quot;INFORMERS&quot;, &quot;OTHERWISE&quot;, &quot;DELICATE&quot;, &quot;AGREED&quot;, &quot;HEAD&quot;, &quot;PAINFUL&quot;, &quot;RIGHTS&quot;, &quot;CARTEL&quot;, &quot;INVESTIGATIONS&quot;, &quot;REFUSED&quot;, &quot;SOURCES&quot;, &quot;YSKL&quot;, &quot;COCA&quot;, &quot;STARTED&quot;, &quot;IMMEDIATELY&quot;, &quot;MATERIEL&quot;, &quot;INTERFERENCE&quot;, &quot;MATTER&quot;, &quot;COOPERATION&quot;, &quot;FOURTH&quot;, &quot;REACH&quot;, &quot;AFTERNOON&quot;, &quot;FREEDOM&quot;, &quot;LET&quot;, &quot;CONCERN&quot;, &quot;LOGISTICS&quot;, &quot;SIXTH&quot;, &quot;CLOSE&quot;, &quot;THEY&quot;, &quot;MONTHS&quot;, &quot;CENTER&quot;, &quot;NEEDS&quot;, &quot;INTERNAL&quot;, &quot;10&quot;, &quot;11&quot;, &quot;12&quot;, &quot;13&quot;, &quot;14&quot;, &quot;CUT&quot;, &quot;15&quot;, &quot;16&quot;, &quot;ATTACKED&quot;, &quot;DAILY&quot;, &quot;17&quot;, &quot;PROBLEM&quot;, &quot;18&quot;, &quot;19&quot;, &quot;PROVIDED&quot;, &quot;SONORA&quot;, &quot;TWO&quot;, &quot;ANNOUNCEMENT&quot;, &quot;IDENTITY&quot;, &quot;BOGOTA&quot;, &quot;THEN&quot;, &quot;THEM&quot;, &quot;PROVIDES&quot;, &quot;20&quot;, &quot;BARRIOS&quot;, &quot;21&quot;, &quot;PARTY&quot;, &quot;22&quot;, &quot;23&quot;, &quot;24&quot;, &quot;25&quot;, &quot;26&quot;, &quot;27&quot;, &quot;28&quot;, &quot;RELIABLE&quot;, &quot;CONFISCATED&quot;, &quot;MERCEDES&quot;, &quot;2D&quot;, &quot;FISHING&quot;, &quot;SUMMIT&quot;, &quot;PREPARED&quot;, &quot;SEEM&quot;, &quot;30&quot;, &quot;SEEN&quot;, &quot;SEEK&quot;, &quot;CONDUCT&quot;, &quot;36&quot;, &quot;WORDS&quot;, &quot;HAD&quot;, &quot;PREVENT&quot;, &quot;CONTINUED&quot;, &quot;3D&quot;, &quot;JOSE&quot;, &quot;GUTIERREZ&quot;, &quot;HAS&quot;, &quot;AGGRESSION&quot;, &quot;CONTINUES&quot;, &quot;TARGET&quot;, &quot;45&quot;, &quot;WANTED&quot;, &quot;EXPLAINED&quot;, &quot;INDISTINCT&quot;, &quot;ORDERED&quot;, &quot;DELEGATION&quot;, &quot;POLITICIANS&quot;, &quot;LEMOS&quot;, &quot;REPORTERS&quot;, &quot;50&quot;, &quot;SEVERAL&quot;, &quot;ENDURING&quot;, &quot;FENASTRAS&quot;, &quot;NUMBER&quot;, &quot;RUNNING&quot;, &quot;DECREE&quot;, &quot;TUESDAY&quot;, &quot;KNOW&quot;, &quot;FERNANDEZ&quot;, &quot;SOUTHERN&quot;, &quot;LOWER&quot;, &quot;SPECIFIC&quot;, &quot;PLANE&quot;, &quot;HOPEFUL&quot;, &quot;-RRB-&quot;, &quot;THIS&quot;, &quot;EXAMPLE&quot;, &quot;60&quot;, &quot;HAVING&quot;, &quot;UNOFFICIAL&quot;, &quot;YES&quot;, &quot;CHARGES&quot;, &quot;CHARGED&quot;, &quot;YET&quot;, &quot;PEACE&quot;, &quot;MEETINGS&quot;, &quot;PANIC&quot;, &quot;COL.&quot;, &quot;CAMPUS&quot;, &quot;CIUDAD&quot;, &quot;GIVING&quot;, &quot;72&quot;, &quot;LIFE&quot;, &quot;ISRAELI&quot;, &quot;SLOGANS&quot;, &quot;HOMILY&quot;, &quot;REPORT&quot;, &quot;PEASANT&quot;, &quot;PUT&quot;, &quot;RAFAEL&quot;, &quot;HER&quot;, &quot;PEREZ&quot;, &quot;80&quot;, &quot;CAPITAL&quot;, &quot;89&quot;, &quot;ASKED&quot;, &quot;AIRPORT&quot;, &quot;INCIDENT&quot;, &quot;CEASE-FIRE&quot;, &quot;EFFECTIVE&quot;, &quot;ARMANDO&quot;, &quot;INDICATED&quot;, &quot;TABLE&quot;, &quot;MORNING&quot;, &quot;THREATENED&quot;, &quot;HELD&quot;, &quot;90&quot;, &quot;CLASHES&quot;, &quot;MPSC&quot;, &quot;SATURDAY&quot;, &quot;INTENSIFIED&quot;, &quot;COME&quot;, &quot;TYPE&quot;, &quot;INDICATES&quot;, &quot;RESULTING&quot;, &quot;ARRESTED&quot;, &quot;LIFT&quot;, &quot;LEVEL&quot;, &quot;THOSE&quot;, &quot;LOS&quot;, &quot;GOAL&quot;, &quot;STRENGTHEN&quot;, &quot;WITHOUT&quot;, &quot;FATHERLAND&quot;, &quot;CRIMES&quot;, &quot;JAIME&quot;, &quot;OPENED&quot;, &quot;POSTS&quot;, &quot;FLAG&quot;, &quot;POLITICAL&quot;, &quot;LARGE&quot;, &quot;DOUBLE&quot;, &quot;ENOUGH&quot;, &quot;CAMPAIGN&quot;, &quot;COWARDLY&quot;, &quot;HELP&quot;, &quot;SITE&quot;, &quot;DARK&quot;, &quot;ADVISERS&quot;, &quot;HIM&quot;, &quot;FAILURE&quot;, &quot;HIT&quot;, &quot;UCA&quot;, &quot;HIS&quot;, &quot;DAS&quot;, &quot;FRAMEWORK&quot;, &quot;NEARBY&quot;, &quot;DAY&quot;, &quot;LEAD&quot;, &quot;DRUG&quot;, &quot;FORMER&quot;, &quot;STRICTLY&quot;, &quot;ONLY&quot;, &quot;DEATHS&quot;, &quot;STRAFED&quot;, &quot;RECEIVED&quot;, &quot;SUPPORT&quot;, &quot;POSITIONS&quot;, &quot;EXPRESS&quot;, &quot;GUARDS&quot;, &quot;SECRETARY&quot;, &quot;ESCOBAR&quot;, &quot;WORLD&quot;, &quot;CONDUCTED&quot;, &quot;COMMENTING&quot;, &quot;PANAMANIAN&quot;, &quot;MEMBERS&quot;, &quot;SUNDAY&quot;, &quot;CONSTITUTION&quot;, &quot;DATE&quot;, &quot;LIKE&quot;, &quot;GOES&quot;, &quot;SENT&quot;, &quot;GRENADES&quot;, &quot;CONFLICT&quot;, &quot;JOURNALISTS&quot;, &quot;DELIVERED&quot;, &quot;PANAMA&quot;, &quot;MISSING&quot;, &quot;SAID&quot;, &quot;HERE&quot;, &quot;STOPPED&quot;, &quot;CONDITIONS&quot;, &quot;WEEK&quot;, &quot;DIRECT&quot;, &quot;TOTAL&quot;, &quot;ISSUED&quot;, &quot;DEC&quot;, &quot;SENATORS&quot;, &quot;YORK&quot;, &quot;MISSION&quot;, &quot;DEL&quot;, &quot;SERGEANT&quot;, &quot;AMERICAN&quot;, &quot;FORMS&quot;, &quot;BEFORE&quot;, &quot;LIMA&quot;, &quot;THROUGHOUT&quot;, &quot;CESAR&quot;, &quot;ARTICLE&quot;, &quot;DECLARE&quot;, &quot;AREVALO&quot;, &quot;WILL&quot;, &quot;WHILE&quot;, &quot;YOU&quot;, &quot;UNDERSTANDING&quot;, &quot;ENTERPRISES&quot;, &quot;INVESTIGATING&quot;, &quot;RULING&quot;, &quot;YESTERDAY&quot;, &quot;EVERYBODY&quot;, &quot;DAWN&quot;, &quot;SHOULD&quot;, &quot;THING&quot;, &quot;WHATEVER&quot;, &quot;ARREST&quot;, &quot;LEARNED&quot;, &quot;HALF&quot;, &quot;THINK&quot;, &quot;COMING&quot;, &quot;NORTHWESTERN&quot;, &quot;INTENTION&quot;, &quot;YOUR&quot;, &quot;MURDERED&quot;, &quot;CARTRIDGES&quot;, &quot;PROPOSED&quot;, &quot;REGRETTED&quot;, &quot;PUNISHED&quot;, &quot;LEFT&quot;, &quot;SEARCH&quot;, &quot;INFLICTED&quot;, &quot;MUCH&quot;, &quot;1230&quot;, &quot;AM&quot;, &quot;AN&quot;, &quot;STRUGGLING&quot;, &quot;HOW&quot;, &quot;AS&quot;, &quot;AT&quot;, &quot;HOY&quot;, &quot;THUS&quot;, &quot;PERUVIAN&quot;, &quot;RESISTANCE&quot;, &quot;REQUESTED&quot;, &quot;OUTSKIRTS&quot;, &quot;PREVIOUSLY&quot;, &quot;SAME&quot;, &quot;LEAVING&quot;, &quot;SHOWN&quot;, &quot;BE&quot;, &quot;TRYING&quot;, &quot;REJECT&quot;, &quot;DAYS&quot;, &quot;HAND&quot;, &quot;ROLE&quot;, &quot;MESSAGE&quot;, &quot;INSISTED&quot;, &quot;BASED&quot;, &quot;PERPETRATED&quot;, &quot;BY&quot;, &quot;COMMAND&quot;, &quot;TURN&quot;, &quot;INVESTIGATION&quot;, &quot;KILLED&quot;, &quot;DID&quot;, &quot;BOXES&quot;, &quot;DENIED&quot;, &quot;SITUATION&quot;, &quot;AIRPLANES&quot;, &quot;MARTI&quot;, &quot;REFERRING&quot;, &quot;CENTENO&quot;, &quot;NECESSARY&quot;, &quot;NATURE&quot;, &quot;CHANGES&quot;, &quot;OFFICE&quot;, &quot;DE&quot;, &quot;RELIGIOUS&quot;, &quot;DO&quot;, &quot;DR&quot;, &quot;CONFLICTS&quot;, &quot;CONTROLLING&quot;, &quot;AREA&quot;, &quot;REPRESSION&quot;, &quot;AUTONOMOUS&quot;, &quot;ABANDON&quot;, &quot;GOOD&quot;, &quot;ALLOW&quot;, &quot;CLERGYMEN&quot;, &quot;AVIANCA&quot;, &quot;EL&quot;, &quot;LIGHT&quot;, &quot;NACIONAL&quot;, &quot;BUSINESSMEN&quot;, &quot;PRESS&quot;, &quot;GUERRILLA&quot;, &quot;DECLARED&quot;, &quot;ELECTRIC&quot;, &quot;LIST&quot;, &quot;LACK&quot;, &quot;MARQUEZ&quot;, &quot;STATE&quot;, &quot;BASICALLY&quot;, &quot;MOVEMENT&quot;, &quot;BODIES&quot;, &quot;NEIGHBORHOOD&quot;, &quot;HUMANITARIAN&quot;, &quot;SUFFERING&quot;, &quot;ABOUT&quot;, &quot;CONTRIBUTE&quot;, &quot;ACTIVELY&quot;, &quot;POINTED&quot;, &quot;WELL&quot;, &quot;GO&quot;, &quot;7TH&quot;, &quot;WITH&quot;, &quot;SHORT&quot;, &quot;ALREADY&quot;, &quot;1,000&quot;, &quot;WAGED&quot;, &quot;AGAIN&quot;, &quot;START&quot;, &quot;FACING&quot;, &quot;HE&quot;, &quot;ROOM&quot;, &quot;STRONG&quot;, &quot;BECAUSE&quot;, &quot;HIMSELF&quot;, &quot;EVERY&quot;, &quot;COLOMBIAN&quot;, &quot;AIRPLANE&quot;, &quot;ENFORCEMENT&quot;, &quot;IF&quot;, &quot;VARIOUS&quot;, &quot;AMONG&quot;, &quot;DEBATES&quot;, &quot;IN&quot;, &quot;AZCONA&quot;, &quot;IS&quot;, &quot;IT&quot;, &quot;DPA&quot;, &quot;ELECTIONS&quot;, &quot;MAJ&quot;, &quot;AGREE&quot;, &quot;EVEN&quot;, &quot;ACCUSATION&quot;, &quot;MAN&quot;, &quot;EVER&quot;, &quot;MAR&quot;, &quot;DEFEND&quot;, &quot;MATTERS&quot;, &quot;MAY&quot;, &quot;TALKED&quot;, &quot;SQUADS&quot;, &quot;PLANES&quot;, &quot;MASSACRE&quot;, &quot;HAVE&quot;, &quot;MONSIGNOR&quot;, &quot;COMMENT&quot;, &quot;THREW&quot;, &quot;NEWSMAN&quot;, &quot;CONFERENCE&quot;, &quot;CADENA&quot;, &quot;ARENA&quot;, &quot;KM&quot;, &quot;USE&quot;, &quot;FIRST&quot;, &quot;DIALOGUE&quot;, &quot;ROSA&quot;, &quot;PRIVATE&quot;, &quot;MEANS&quot;, &quot;LA&quot;, &quot;SOCIAL&quot;, &quot;HOLDING&quot;, &quot;NORMAL&quot;, &quot;LEGISLATIVE&quot;, &quot;CONCLUDE&quot;, &quot;ARMY&quot;, &quot;SINGLE&quot;, &quot;THIRD&quot;, &quot;DETAILS&quot;, &quot;DEATH&quot;, &quot;PROPOSAL&quot;, &quot;PEOPLES&quot;, &quot;EVENT&quot;, &quot;INTENTIONS&quot;, &quot;MAFIA&quot;, &quot;RESPECT&quot;, &quot;DIFFICULTIES&quot;, &quot;REPRESENTED&quot;, &quot;FUEL&quot;, &quot;VISITED&quot;, &quot;ME&quot;, &quot;ENJOY&quot;, &quot;UPON&quot;, &quot;ESPECIALLY&quot;, &quot;WILLINGNESS&quot;, &quot;CEMETERY&quot;, &quot;WERE&quot;, &quot;SEPTEMBER&quot;, &quot;MY&quot;, &quot;SOLDIERS&quot;, &quot;RESIDENTS&quot;, &quot;REMAIN&quot;, &quot;DEMAND&quot;, &quot;HAPPEN&quot;, &quot;MEN&quot;, &quot;DOZENS&quot;, &quot;REASONS&quot;, &quot;ELECTION&quot;, &quot;LESS&quot;, &quot;HELICOPTER&quot;, &quot;THREE&quot;, &quot;NO&quot;, &quot;MAJOR&quot;, &quot;LOCATED&quot;, &quot;PERSONS&quot;, &quot;LAND&quot;, &quot;CITIES&quot;, &quot;SAYS&quot;, &quot;MEMBER&quot;, &quot;DUE&quot;, &quot;OF&quot;, &quot;INVESTIGATE&quot;, &quot;COMMANDER&quot;, &quot;ON&quot;, &quot;BELIEVED&quot;, &quot;ZACAMIL&quot;, &quot;PROMISED&quot;, &quot;OR&quot;, &quot;RIGHTIST&quot;, &quot;MANEUVER&quot;, &quot;BELIEVES&quot;, &quot;ALLOWED&quot;, &quot;AFFECT&quot;, &quot;BUSH&quot;, &quot;SECOND&quot;, &quot;THEIR&quot;, &quot;POINT&quot;, &quot;OPPORTUNITY&quot;, &quot;GARCIA&quot;, &quot;MINISTER&quot;, &quot;REACHED&quot;, &quot;THROW&quot;, &quot;BETWEEN&quot;, &quot;DOCE&quot;, &quot;ENSURE&quot;, &quot;QUICKLY&quot;, &quot;INCREASE&quot;, &quot;CARRYING&quot;, &quot;NOTHING&quot;, &quot;MIDDLE&quot;, &quot;EACH&quot;, &quot;CERTAIN&quot;, &quot;PREPARING&quot;, &quot;MUST&quot;, &quot;WANT&quot;, &quot;WEAKEN&quot;, &quot;BOLIVAR&quot;, &quot;COMMUNICATIONS&quot;, &quot;TELEVISION&quot;, &quot;GROUP&quot;, &quot;U.S.&quot;, &quot;JAVIER&quot;, &quot;DOES&quot;, &quot;DESTROYING&quot;, &quot;WOULD&quot;, &quot;SO&quot;, &quot;PONCE&quot;, &quot;ALTHOUGH&quot;, &quot;AROUND&quot;, &quot;INTERESTS&quot;, &quot;REBELS&quot;, &quot;ARRESTS&quot;, &quot;SOYAPANGO&quot;, &quot;COMMITTEE&quot;, &quot;COMMITTED&quot;, &quot;CAPTURED&quot;, &quot;PATROL&quot;, &quot;0830&quot;, &quot;THREATS&quot;, &quot;MINISTERS&quot;, &quot;MAINTAINING&quot;, &quot;TO&quot;, &quot;CALLS&quot;, &quot;UNION&quot;, &quot;MODERATOR&quot;, &quot;THERE&quot;, &quot;LATE&quot;, &quot;HEREBY&quot;, &quot;APPROXIMATELY&quot;, &quot;PACKAGE&quot;, &quot;EXPLAINING&quot;, &quot;CORRESPONDENT&quot;, &quot;UN&quot;, &quot;JUAN&quot;, &quot;UP&quot;, &quot;US&quot;, &quot;PARTICIPATION&quot;, &quot;INNOCENT&quot;, &quot;THESE&quot;, &quot;RELATIVES&quot;, &quot;DIEGO&quot;, &quot;MEANWHILE&quot;, &quot;FULL&quot;, &quot;LAST&quot;, &quot;CONSUMPTION&quot;, &quot;VOTE&quot;, &quot;COLOMBIANS&quot;, &quot;CAUSING&quot;, &quot;BELONGING&quot;, &quot;BLAME&quot;, &quot;WE&quot;, &quot;PROTECT&quot;, &quot;WAVE&quot;, &quot;INITIATIVE&quot;, &quot;HAPPY&quot;, &quot;NEWSMEN&quot;, &quot;GUERRILLAS&quot;, &quot;SPOKE&quot;, &quot;AREAS&quot;, &quot;PERU&quot;, &quot;BEHAVIOR&quot;, &quot;SECTOR&quot;, &quot;PAID&quot;, &quot;TIME&quot;, &quot;SOLUTION&quot;, &quot;ANOTHER&quot;, &quot;PERSONNEL&quot;, &quot;HOURS&quot;, &quot;FILLED&quot;, &quot;PEOPLE&quot;, &quot;SANTANDER&quot;, &quot;POPULATION&quot;, &quot;CRIME&quot;, &quot;DIPLOMATIC&quot;, &quot;VICTIMS&quot;, &quot;CAUSED&quot;, &quot;DICTATORSHIP&quot;, &quot;CITIZENS&quot;, &quot;TEGUCIGALPA&quot;, &quot;REPUBLIC&quot;, &quot;CENTRAL&quot;, &quot;HERNAN&quot;, &quot;BATTALIONS&quot;, &quot;LEADING&quot;, &quot;SOLUTIONS&quot;, &quot;EVIDENCE&quot;, &quot;OSCAR&quot;, &quot;COMPANY&quot;, &quot;RESIDENTIAL&quot;, &quot;WOMEN&quot;, &quot;COMMON&quot;, &quot;PUBLIC&quot;, &quot;SATISFIED&quot;, &quot;EXACTLY&quot;, &quot;-LRB-&quot;, &quot;POLICEMEN&quot;, &quot;ALPES&quot;, &quot;QUITE&quot;, &quot;STEPPED&quot;, &quot;MRS&quot;, &quot;ORDER&quot;, &quot;ADDED&quot;, &quot;LIBERATION&quot;, &quot;GIVEN&quot;, &quot;BEING&quot;, &quot;BOLIVIA&quot;, &quot;MANUEL&quot;, &quot;ESCALATION&quot;, &quot;DECIDED&quot;, &quot;LOOKING&quot;, &quot;PRELIMINARY&quot;, &quot;COCAINE&quot;, &quot;OFFICER&quot;, &quot;MORALE&quot;, &quot;NAMED&quot;, &quot;STAYING&quot;, &quot;SEIZED&quot;, &quot;COULD&quot;, &quot;BISHOP&quot;, &quot;CUELLAR&quot;, &quot;ASSOCIATION&quot;, &quot;ACAN-EFE&quot;, &quot;TELA&quot;, &quot;EIGHT&quot;, &quot;ZONE&quot;, &quot;WASHINGTON&quot;, &quot;UNITY&quot;, &quot;MARXIST&quot;, &quot;PATRIOTIC&quot;, &quot;WOMAN&quot;, &quot;ATTITUDE&quot;, &quot;NATION&quot;, &quot;THREATENING&quot;, &quot;ERRAZURIZ&quot;, &quot;TELL&quot;, &quot;REPRESENTATIVE&quot;, &quot;INCLUDING&quot;, &quot;UNITS&quot;, &quot;DONE&quot;, &quot;SOUTHEAST&quot;, &quot;MOVING&quot;, &quot;BENAVIDES&quot;, &quot;DEMOCRATIC&quot;, &quot;DIFFICULT&quot;, &quot;ACCEPT&quot;, &quot;EXPLOITATION&quot;, &quot;DEVELOPING&quot;, &quot;MAINTAIN&quot;, &quot;SPECULATIONS&quot;, &quot;EFE&quot;, &quot;ARIAS&quot;, &quot;CHURCH&quot;, &quot;FIRMLY&quot;, &quot;PART&quot;, &quot;SUBSTANTIAL&quot;, &quot;SEARCHED&quot;, &quot;EAST&quot;, &quot;RESULTED&quot;, &quot;CATHOLIC&quot;, &quot;RESULTS&quot;, &quot;25TH&quot;, &quot;MEAN&quot;, &quot;OFFICIAL&quot;, &quot;DETERMINE&quot;, &quot;LIEUTENANTS&quot;, &quot;CERTAINLY&quot;, &quot;JENNIFER&quot;, &quot;PEDRO&quot;, &quot;STUDENTS&quot;, &quot;REESTABLISH&quot;, &quot;ACCORDING&quot;, &quot;``&quot;, &quot;HEARD&quot;, &quot;PATH&quot;, &quot;VENCEREMOS&quot;, &quot;DECEMBER&quot;, &quot;PERFECTLY&quot;, &quot;FIGHT&quot;, &quot;SCHEDULED&quot;, &quot;CLAIMED&quot;, &quot;OPERATING&quot;, &quot;EXPLAIN&quot;, &quot;CANAL&quot;, &quot;WALKER&quot;, &quot;POINTS&quot;, &quot;CHRISTIAN&quot;, &quot;ATTEMPT&quot;, &quot;COMPLETELY&quot;, &quot;AMERICA&quot;, &quot;COUNTRIES&quot;, &quot;UNIFORM&quot;, &quot;TECLA&quot;, &quot;DEMANDS&quot;, &quot;SABOTAGE&quot;, &quot;HEART&quot;, &quot;BOMBINGS&quot;, &quot;BEEN&quot;, &quot;EMPLOYEES&quot;, &quot;SOMETHING&quot;, &quot;CHILENA&quot;, &quot;PAST&quot;, &quot;JULY&quot;, &quot;MURDER&quot;, &quot;ANDRES&quot;, &quot;TURBAY&quot;, &quot;AGREEMENTS&quot;, &quot;EXPRESSED&quot;, &quot;CLARIFICATION&quot;, &quot;DISTRICT&quot;, &quot;BEGAN&quot;, &quot;DAUGHTER&quot;, &quot;WEARING&quot;, &quot;TACTICS&quot;, &quot;UNITED&quot;, &quot;CONGRESS&quot;, &quot;LABOR&quot;, &quot;APPARENTLY&quot;, &quot;AUTHORITIES&quot;, &quot;MEET&quot;, &quot;DETERMINATION&quot;, &quot;SIMON&quot;, &quot;DEMOCRACY&quot;, &quot;SEEKS&quot;, &quot;ABSTAIN&quot;, &quot;NORTHERN&quot;, &quot;RED&quot;, &quot;250,000&quot;, &quot;ACT&quot;, &quot;OPERATION&quot;, &quot;DESERVES&quot;, &quot;MINE&quot;, &quot;APPEARED&quot;, &quot;INCREASED&quot;, &quot;GOVERNMENT&quot;, &quot;RECORDING&quot;, &quot;DOWN&quot;, &quot;ORLANDO&quot;, &quot;ELN&quot;, &quot;INFORMED&quot;, &quot;ITS&quot;, &quot;TAKING&quot;, &quot;TALK&quot;, &quot;OPPOSED&quot;, &quot;LEADER&quot;, &quot;DELEGATES&quot;, &quot;DESERVE&quot;, &quot;FOUND&quot;, &quot;HOLD&quot;, &quot;FACTS&quot;, &quot;TAKE&quot;, &quot;SOLDIER&quot;, &quot;ENERGY&quot;, &quot;CONSERVATIVE&quot;, &quot;INSTALLATIONS&quot;, &quot;INFORMATION&quot;, &quot;EARLY&quot;, &quot;FMLN&quot;, &quot;WANTS&quot;, &quot;TOWARD&quot;, &quot;AK-47&quot;, &quot;BLOODSHED&quot;, &quot;HEAVY&quot;, &quot;HIGHWAY&quot;, &quot;APPROPRIATE&quot;, &quot;GUATEMALA&quot;, &quot;END&quot;, &quot;CAPTAIN&quot;, &quot;CONFUSE&quot;, &quot;DEFENSE&quot;, &quot;MONEY&quot;, &quot;ECONOMIC&quot;, &quot;DISCLOSE&quot;, &quot;SANTIAGO&quot;, &quot;QUESTIONED&quot;, &quot;AFP&quot;, &quot;DOCUMENTS&quot;, &quot;JUST&quot;, &quot;CLIPS&quot;, &quot;SOME&quot;, &quot;MAFIAS&quot;, &quot;ACCUSATIONS&quot;, &quot;CONCERNING&quot;, &quot;CARIBBEAN&quot;, &quot;SOVIET&quot;, &quot;BRANCH&quot;, &quot;ACCIDENT&quot;, &quot;AGO&quot;, &quot;OTHERS&quot;, &quot;SOLE&quot;, &quot;REPRESENTATIVES&quot;, &quot;OFFICERS&quot;, &quot;RIO&quot;, &quot;BACK&quot;, &quot;CRISTIANI&quot;, &quot;TELEPHONES&quot;, &quot;HOME&quot;, &quot;PROTEST&quot;, &quot;ADVISED&quot;, &quot;RECEIVING&quot;, &quot;TEXT&quot;, &quot;ALMOST&quot;, &quot;CONTINUOUSLY&quot;, &quot;HUMAN&quot;, &quot;PRESIDENTS&quot;, &quot;FORCES&quot;, &quot;LEFTIST&quot;, &quot;AID&quot;, &quot;SOON&quot;, &quot;SPAIN&quot;, &quot;DOUBT&quot;, &quot;MOTHERS&quot;, &quot;LOSSES&quot;, &quot;NATIONAL&quot;, &quot;ASSASSINATION&quot;, &quot;WORKERS&quot;, &quot;FIGHTERS&quot;, &quot;AIR&quot;, &quot;FORCED&quot;, &quot;TORTURE&quot;, &quot;STILL&quot;, &quot;JARAMILLO&quot;, &quot;BORDER&quot;, &quot;VALDIVIESO&quot;, &quot;MADE&quot;, &quot;ADVISER&quot;, &quot;ANNOUNCED&quot;, &quot;ACCOMPANY&quot;, &quot;ABLE&quot;, &quot;FLYING&quot;, &quot;ENTER&quot;, &quot;ANDEAN&quot;, &quot;POSSIBILITY&quot;, &quot;OMITTED&quot;, &quot;REVOLUTIONARY&quot;, &quot;RIGHT&quot;, &quot;TERROR&quot;, &quot;ELENA&quot;, &quot;ESCALON&quot;, &quot;ANONYMOUS&quot;, &quot;STARTING&quot;, &quot;DISTRIBUTION&quot;, &quot;MARTIN&quot;, &quot;ANYWHERE&quot;, &quot;EXCERPT&quot;, &quot;ZACATECOLUCA&quot;, &quot;DENYING&quot;, &quot;CALLED&quot;, &quot;PRESSURED&quot;, &quot;ETA&quot;, &quot;RICARDO&quot;, &quot;EXTENSIVE&quot;, &quot;WHOLE&quot;, &quot;SIEGE&quot;, &quot;OBSTACLES&quot;, &quot;ALL&quot;, &quot;NEW&quot;, &quot;TRADE&quot;, &quot;LETTER&quot;, &quot;PUNISH&quot;, &quot;FEEL&quot;, &quot;TERRORIST&quot;, &quot;ALIAS&quot;, &quot;HOST&quot;, &quot;FUTURE&quot;, &quot;HOTEL&quot;, &quot;PUBLISHED&quot;, &quot;HAPPENED&quot;, &quot;ORGANIZATIONS&quot;, &quot;PACIFICATION&quot;, &quot;JUDICIAL&quot;, &quot;ORDERS&quot;, &quot;FIND&quot;, &quot;TALKS&quot;, &quot;MINUTE&quot;, &quot;MAIN&quot;, &quot;ELITE&quot;, &quot;TERRORISM&quot;, &quot;ENTIRE&quot;, &quot;TASK&quot;, &quot;CLEARLY&quot;, &quot;DESCRIBED&quot;, &quot;MORAZAN&quot;, &quot;4TH&quot;, &quot;TRUE&quot;, &quot;MARTINEZ&quot;, &quot;PARTICIPATE&quot;, &quot;THROUGH&quot;, &quot;ANA&quot;, &quot;AND&quot;, &quot;SORT&quot;, &quot;AUGUST&quot;, &quot;MOUNTAIN&quot;, &quot;INITIAL&quot;, &quot;ANY&quot;, &quot;MAKE&quot;, &quot;FAMOUS&quot;, &quot;REQUESTING&quot;, &quot;GOING&quot;, &quot;BARONS&quot;, &quot;BELIEVE&quot;, &quot;ALFREDO&quot;, &quot;PERUANA&quot;, &quot;DANGER&quot;, &quot;POPULAR&quot;, &quot;CURRENTLY&quot;, &quot;ADVANTAGE&quot;, &quot;MERE&quot;, &quot;100&quot;, &quot;SOTO&quot;, &quot;VOICE&quot;, &quot;PRESUMED&quot;, &quot;ADMINISTRATIVE&quot;, &quot;103&quot;, &quot;SPECIALIZED&quot;, &quot;JAN&quot;, &quot;BLAMED&quot;, &quot;EXPECTED&quot;, &quot;CLEAR&quot;, &quot;SCHOOL&quot;, &quot;WEAPONS&quot;, &quot;MONTH&quot;, &quot;APR&quot;, &quot;MENTIONED&quot;, &quot;COUNTERPART&quot;, &quot;MEDIATOR&quot;, &quot;AFTER&quot;, &quot;RAIDED&quot;, &quot;EXCERPTS&quot;, &quot;INDIVIDUALS&quot;, &quot;WEDNESDAY&quot;, &quot;AHEAD&quot;, &quot;FIRE&quot;, &quot;MORMON&quot;, &quot;RESPONSE&quot;, &quot;INCLUDE&quot;, &quot;FIRM&quot;, &quot;BLOOD&quot;, &quot;LATER&quot;, &quot;PRIOR&quot;, &quot;REPUBLICAN&quot;, &quot;SHOCK&quot;, &quot;PALACE&quot;, &quot;ARE&quot;, &quot;THINGS&quot;, &quot;SOURCE&quot;, &quot;MIGUEL&quot;, &quot;CORPS&quot;, &quot;OBTAIN&quot;, &quot;AFFECTS&quot;, &quot;MOMENTS&quot;, &quot;INTO&quot;, &quot;REPEAT&quot;, &quot;DECREED&quot;, &quot;FACT&quot;, &quot;RESIDENCE&quot;, &quot;SPECIFY&quot;, &quot;CONVERGENCE&quot;, &quot;ASK&quot;, &quot;LONG&quot;, &quot;FELL&quot;, &quot;REPRESENT&quot;, &quot;CIVILIANS&quot;, &quot;UNDER&quot;, &quot;RUN&quot;, &quot;PARTIES&quot;, &quot;OPEN&quot;, &quot;EXPLOSIONS&quot;, &quot;PRESENCE&quot;, &quot;MARCH&quot;, &quot;LUISA&quot;, &quot;STAFF&quot;, &quot;MANY&quot;, &quot;WEAPON&quot;, &quot;FACE&quot;, &quot;STAY&quot;, &quot;SADNESS&quot;, &quot;ELECT&quot;, &quot;DESPITE&quot;, &quot;ROUTE&quot;, &quot;PERUVIANS&quot;, &quot;DEARLY&quot;, &quot;IMMEDIATE&quot;, &quot;VICINITY&quot;, &quot;FIVE&quot;, &quot;AUG&quot;, &quot;SUPPLY&quot;, &quot;WHOSE&quot;, &quot;DEMOBILIZATION&quot;, &quot;SANTA&quot;, &quot;BROKEN&quot;, &quot;NETWORK&quot;, &quot;GUERILLAS&quot;, &quot;CHIEFS&quot;, &quot;PROTECTION&quot;, &quot;FELT&quot;, &quot;LATIN&quot;, &quot;CHILEAN&quot;, &quot;FASCIST&quot;, &quot;NOR&quot;, &quot;THEREFORE&quot;, &quot;ACADEMY&quot;, &quot;NOT&quot;, &quot;INTERNATIONALLY&quot;, &quot;NOV&quot;, &quot;GUARANTEES&quot;, &quot;RANSOM&quot;, &quot;SUSPENDED&quot;, &quot;NOW&quot;, &quot;PIZARRO&quot;, &quot;RIFLES&quot;, &quot;UNIVERSITY&quot;, &quot;LOOK&quot;, &quot;RICAN&quot;, &quot;OPERATIONS&quot;, &quot;WAS&quot;, &quot;WAR&quot;, &quot;SPEECH&quot;, &quot;WAY&quot;, &quot;REPRESENTS&quot;, &quot;MASK&quot;, &quot;SPREADING&quot;, &quot;ADOPTED&quot;, &quot;IMPLEMENT&quot;, &quot;FOREIGN&quot;, &quot;0500&quot;, &quot;LEGAL&quot;, &quot;EXECUTIVE&quot;, &quot;RULE&quot;, &quot;DIRECTOR&quot;, &quot;CITIZEN&quot;, &quot;EMPTY&quot;, &quot;SOMETIMES&quot;, &quot;SARMIENTO&quot;, &quot;GENERALIZED&quot;, &quot;STEP&quot;, &quot;ESCAPE&quot;, &quot;AGAINST&quot;, &quot;VIRGILIO&quot;, &quot;FAR&quot;, &quot;CRIMINAL&quot;, &quot;100-PERCENT&quot;, &quot;-LSB-&quot;, &quot;CUSCATLAN&quot;, &quot;LOST&quot;, &quot;STAND&quot;, &quot;PRESIDENCY&quot;, &quot;INTELLIGENCE&quot;, &quot;THOUGHT&quot;, &quot;GUNS&quot;, &quot;INDISCRIMINATELY&quot;, &quot;NICARAGUA&quot;, &quot;DIRECTED&quot;, &quot;FUNERAL&quot;, &quot;ADVOCATED&quot;, &quot;GAVIRIA&quot;, &quot;WORD&quot;, &quot;MARKET&quot;, &quot;BULLETS&quot;, &quot;CHILE&quot;, &quot;MILITARY&quot;, &quot;INDICATE&quot;, &quot;DIARIO&quot;, &quot;WORK&quot;, &quot;CHECK&quot;, &quot;ELECTRICITY&quot;, &quot;SO-CALLED&quot;, &quot;COLONEL&quot;, &quot;ARRIVED&quot;, &quot;EVIDENT&quot;, &quot;FEDERATION&quot;, &quot;PERSONAL&quot;, &quot;DRUGS&quot;, &quot;ESPECTADOR&quot;, &quot;FEB&quot;, &quot;PUPPET&quot;, &quot;REACHING&quot;, &quot;KNOWN&quot;, &quot;PEACEFUL&quot;, &quot;LAWYER&quot;, &quot;NEGOTIATED&quot;, &quot;ADDITION&quot;, &quot;OCCUPIED&quot;, &quot;RADIO&quot;, &quot;FEW&quot;, &quot;GOVERNMENTS&quot;, &quot;DECISION&quot;, &quot;EVENTS&quot;, &quot;REFERRED&quot;, &quot;CAUSE&quot;, &quot;ARNULFO&quot;, &quot;SENTENCE&quot;, &quot;FROM&quot;, &quot;M-19&quot;, &quot;CARMEN&quot;, &quot;SPECIAL&quot;, &quot;HEADQUARTERS&quot;, &quot;NIGHT&quot;, &quot;MAZA&quot;, &quot;PUTTING&quot;, &quot;WHO&quot;, &quot;SERIOUSLY&quot;, &quot;SINCE&quot;, &quot;WHY&quot;, &quot;EXPERTS&quot;, &quot;INFANTRY&quot;, &quot;FIGHTING&quot;, &quot;GOALS&quot;, &quot;CHAIRMAN&quot;, &quot;INRAVISION&quot;, &quot;OCCUR&quot;, &quot;WIN&quot;, &quot;STEPS&quot;, &quot;DECREES&quot;, &quot;LINKED&quot;, &quot;SAN&quot;, &quot;CORDOBA&quot;, &quot;FELLOW&quot;, &quot;FESTIVITIES&quot;, &quot;SAW&quot;, &quot;SAY&quot;, &quot;CONCERNED&quot;, &quot;BASIC&quot;, &quot;WAGING&quot;, &quot;ACAN&quot;, &quot;TOMORROW&quot;, &quot;BURNED&quot;, &quot;6-HOUR&quot;, &quot;CALLING&quot;, &quot;BOMBED&quot;, &quot;BASIS&quot;, &quot;RUBEN&quot;, &quot;GROUNDS&quot;, &quot;UNIDENTIFIED&quot;, &quot;MEXICO&quot;, &quot;INSTRUMENT&quot;, &quot;CHIEF&quot;, &quot;CIVILIAN&quot;, &quot;THEMSELVES&quot;));</td>
      </tr>
      <tr>
        <td id="L107" class="blob-num js-line-number" data-line-number="107"></td>
        <td id="LC107" class="blob-code blob-code-inner js-file-line">							//private static ArrayList&lt;String&gt; ignore_kidnapping=new ArrayList&lt;String&gt;(Arrays.asList(&quot;&quot;, &quot;ATTENTION&quot;, &quot;GROUPS&quot;, &quot;SURPRISE&quot;, &quot;RULING&quot;, &quot;YESTERDAY&quot;, &quot;NEAR&quot;, &quot;PASTRANA&quot;, &quot;LEARNED&quot;, &quot;HALF&quot;, &quot;YEAR&quot;, &quot;NORTHWESTERN&quot;, &quot;COMMUNIQUE&quot;, &quot;INTENTION&quot;, &quot;TAKEN&quot;, &quot;THOROUGHLY&quot;, &quot;URGE&quot;, &quot;LEFT&quot;, &quot;$&quot;, &quot;STOP&quot;, &quot;SEARCH&quot;, &quot;NEVERTHELESS&quot;, &quot;&#39;&quot;, &quot;MIGHT&quot;, &quot;DEPARTMENT&quot;, &quot;,&quot;, &quot;WHERE&quot;, &quot;AN&quot;, &quot;-&quot;, &quot;.&quot;, &quot;ATMOSPHERE&quot;, &quot;STRUGGLING&quot;, &quot;1&quot;, &quot;HOW&quot;, &quot;AS&quot;, &quot;2&quot;, &quot;SEE&quot;, &quot;PROPOSALS&quot;, &quot;AT&quot;, &quot;3&quot;, &quot;HOY&quot;, &quot;VICTORY&quot;, &quot;4&quot;, &quot;5&quot;, &quot;6&quot;, &quot;PERUVIAN&quot;, &quot;7&quot;, &quot;8&quot;, &quot;9&quot;, &quot;:&quot;, &quot;REQUESTED&quot;, &quot;ACHIEVING&quot;, &quot;OUTSKIRTS&quot;, &quot;?&quot;, &quot;SEP&quot;, &quot;SAME&quot;, &quot;LEAVING&quot;, &quot;DETERMINED&quot;, &quot;A&quot;, &quot;RESPOND&quot;, &quot;COVER&quot;, &quot;SHOWN&quot;, &quot;BE&quot;, &quot;STRIKES&quot;, &quot;TRYING&quot;, &quot;SET&quot;, &quot;DAYS&quot;, &quot;I&quot;, &quot;PREVIOUS&quot;, &quot;FLORES&quot;, &quot;MESSAGE&quot;, &quot;BATTALION&quot;, &quot;PERPETRATED&quot;, &quot;PRIEST&quot;, &quot;BY&quot;, &quot;TURN&quot;, &quot;KILLED&quot;, &quot;DID&quot;, &quot;ATTRIBUTED&quot;, &quot;JUL&quot;, &quot;`&quot;, &quot;STATES&quot;, &quot;JUN&quot;, &quot;CIMA&quot;, &quot;SITUATION&quot;, &quot;MARTI&quot;, &quot;MILLION&quot;, &quot;CONTINUE&quot;, &quot;NATURE&quot;, &quot;VEHICLES&quot;, &quot;SUSPEND&quot;, &quot;RELATIONS&quot;, &quot;OFFICE&quot;, &quot;SECURITY&quot;, &quot;COLINDRES&quot;, &quot;STATEMENT&quot;, &quot;DE&quot;, &quot;ACTIVISTS&quot;, &quot;SERVICES&quot;, &quot;DETONATED&quot;, &quot;DO&quot;, &quot;SHE&quot;, &quot;PRISONERS&quot;, &quot;AREA&quot;, &quot;COUNTRY&quot;, &quot;REPRESSION&quot;, &quot;ELIZABETH&quot;, &quot;TONIGHT&quot;, &quot;CAPTURE&quot;, &quot;PLACES&quot;, &quot;ASSASSINATIONS&quot;, &quot;EXPLOSIVES&quot;, &quot;EL&quot;, &quot;LIGHT&quot;, &quot;FOR&quot;, &quot;NACIONAL&quot;, &quot;PRESS&quot;, &quot;GUERRILLA&quot;, &quot;RADICAL&quot;, &quot;ATTAIN&quot;, &quot;LIVES&quot;, &quot;HEADED&quot;, &quot;DECLARED&quot;, &quot;PASSAGE&quot;, &quot;COMPANIONS&quot;, &quot;PROPOSE&quot;, &quot;OAS&quot;, &quot;AMBASSADOR&quot;, &quot;SIX&quot;, &quot;STATE&quot;, &quot;WITHIN&quot;, &quot;LIVE&quot;, &quot;DEMANDED&quot;, &quot;ABSOLUTE&quot;, &quot;ACTING&quot;, &quot;INTERESTED&quot;, &quot;MOVEMENT&quot;, &quot;BODIES&quot;, &quot;DETAINED&quot;, &quot;NEIGHBORHOOD&quot;, &quot;CHARGE&quot;, &quot;ABOUT&quot;, &quot;RODRIGUEZ&quot;, &quot;OCTOBER&quot;, &quot;WELL&quot;, &quot;ACTIVITIES&quot;, &quot;CASES&quot;, &quot;WITH&quot;, &quot;ALREADY&quot;, &quot;CARLOS&quot;, &quot;STATEMENTS&quot;, &quot;ACTION&quot;, &quot;GUADALUPE&quot;, &quot;HE&quot;, &quot;STRONG&quot;, &quot;PLANNED&quot;, &quot;OCT&quot;, &quot;INTERCEPTED&quot;, &quot;BECAUSE&quot;, &quot;GUILLERMO&quot;, &quot;TOLD&quot;, &quot;COLOMBIAN&quot;, &quot;CARRIED&quot;, &quot;ENEMIES&quot;, &quot;VARIOUS&quot;, &quot;AMONG&quot;, &quot;ESTRADA&quot;, &quot;IN&quot;, &quot;IS&quot;, &quot;EXACT&quot;, &quot;IT&quot;, &quot;ATTEND&quot;, &quot;PABLO&quot;, &quot;DPA&quot;, &quot;FORCE&quot;, &quot;ELECTIONS&quot;, &quot;MSGR&quot;, &quot;WENT&quot;, &quot;AUGUSTO&quot;, &quot;CONDEMN&quot;, &quot;MAR&quot;, &quot;ARRIVE&quot;, &quot;MAY&quot;, &quot;MASSACRE&quot;, &quot;HAVE&quot;, &quot;FEBRUARY&quot;, &quot;MONSIGNOR&quot;, &quot;BLOODY&quot;, &quot;COMMENT&quot;, &quot;PLANNING&quot;, &quot;ATTORNEY&quot;, &quot;CARTAGENA&quot;, &quot;CONFERENCE&quot;, &quot;ACTIONS&quot;, &quot;ASKING&quot;, &quot;CADENA&quot;, &quot;ASSOCIATED&quot;, &quot;CEASE&quot;, &quot;KM&quot;, &quot;GACHA&quot;, &quot;UNGO&quot;, &quot;USE&quot;, &quot;NOVEMBER&quot;, &quot;FIRST&quot;, &quot;CRIMINALS&quot;, &quot;COMMISSION&quot;, &quot;SHOOTING&quot;, &quot;MEANS&quot;, &quot;SON&quot;, &quot;CITY&quot;, &quot;LA&quot;, &quot;SOCIAL&quot;, &quot;LIBERTAD&quot;, &quot;ABIDE&quot;, &quot;DESTROYED&quot;, &quot;TREATED&quot;, &quot;HOLDING&quot;, &quot;NORMAL&quot;, &quot;LEGISLATIVE&quot;, &quot;IDENTIFY&quot;, &quot;CONCLUDE&quot;, &quot;ARMY&quot;, &quot;DETAILS&quot;, &quot;ALAN&quot;, &quot;COLUMN&quot;, &quot;DEATH&quot;, &quot;INTENTIONS&quot;, &quot;RESPECT&quot;, &quot;WILLING&quot;, &quot;EASTERN&quot;, &quot;REPORTS&quot;, &quot;SECTORS&quot;, &quot;ENJOY&quot;, &quot;REASON&quot;, &quot;ESPECIALLY&quot;, &quot;JANUARY&quot;, &quot;NUMBERS&quot;, &quot;THANKS&quot;, &quot;WERE&quot;, &quot;SEPTEMBER&quot;, &quot;DISCUSS&quot;, &quot;AGREEMENT&quot;, &quot;ASSASSIN&quot;, &quot;SOLDIERS&quot;, &quot;TOOK&quot;, &quot;READ&quot;, &quot;RESIDENTS&quot;, &quot;REMAIN&quot;, &quot;DEMAND&quot;, &quot;OIL&quot;, &quot;BEHIND&quot;, &quot;MEN&quot;, &quot;REAL&quot;, &quot;LESS&quot;, &quot;MET&quot;, &quot;OCHOA&quot;, &quot;THREE&quot;, &quot;NEWSPAPERS&quot;, &quot;NEIGHBORHOODS&quot;, &quot;NO&quot;, &quot;ACTIVE&quot;, &quot;LOCATED&quot;, &quot;PERSONS&quot;, &quot;ROUTINE&quot;, &quot;POLITICIAN&quot;, &quot;FOLLOWING&quot;, &quot;SAYS&quot;, &quot;MEMBER&quot;, &quot;REPORTER&quot;, &quot;HANDS&quot;, &quot;LIBERAL&quot;, &quot;DUE&quot;, &quot;OF&quot;, &quot;INVESTIGATE&quot;, &quot;VENEZUELA&quot;, &quot;PRESIDENTIAL&quot;, &quot;STRIKE&quot;, &quot;ON&quot;, &quot;ANTONIO&quot;, &quot;BELIEVED&quot;, &quot;ZACAMIL&quot;, &quot;REPORTED&quot;, &quot;SHOWED&quot;, &quot;OR&quot;, &quot;ASSISTANT&quot;, &quot;PORRAS&quot;, &quot;COLOMBIA&quot;, &quot;REBEL&quot;, &quot;VISIT&quot;, &quot;TURNED&quot;, &quot;BUSH&quot;, &quot;ROMERO&quot;, &quot;ATTACK&quot;, &quot;THEIR&quot;, &quot;UNKNOWN&quot;, &quot;DOZEN&quot;, &quot;POINT&quot;, &quot;GARCIA&quot;, &quot;MINISTER&quot;, &quot;CONFIRMING&quot;, &quot;LEAST&quot;, &quot;BETWEEN&quot;, &quot;FRONT&quot;, &quot;COMMUNITY&quot;, &quot;PROCESS&quot;, &quot;CARRYING&quot;, &quot;SEEKING&quot;, &quot;EACH&quot;, &quot;NORTHEASTERN&quot;, &quot;MUST&quot;, &quot;MUNICIPAL&quot;, &quot;HELPING&quot;, &quot;ESTABLISHED&quot;, &quot;WEEKS&quot;, &quot;WANT&quot;, &quot;POINTING&quot;, &quot;ACTS&quot;, &quot;CALL&quot;, &quot;CALI&quot;, &quot;HIGHWAYS&quot;, &quot;CARACAS&quot;, &quot;ONE&quot;, &quot;TELEVISION&quot;, &quot;CEREZO&quot;, &quot;SUFFERED&quot;, &quot;GROUP&quot;, &quot;1ST&quot;, &quot;U.S.&quot;, &quot;MESSAGES&quot;, &quot;GALAN&quot;, &quot;HECTOR&quot;, &quot;DOES&quot;, &quot;WOULD&quot;, &quot;URIBE&quot;, &quot;SO&quot;, &quot;ALTHOUGH&quot;, &quot;HEAVILY&quot;, &quot;BUT&quot;, &quot;SUCH&quot;, &quot;SALVADORAN&quot;, &quot;INTERESTS&quot;, &quot;REBELS&quot;, &quot;FACILITIES&quot;, &quot;DELGADO&quot;, &quot;CAME&quot;, &quot;SOYAPANGO&quot;, &quot;COMMITTEE&quot;, &quot;LEARN&quot;, &quot;RESPONSIBILITY&quot;, &quot;OTHER&quot;, &quot;CAPTURED&quot;, &quot;FATHER&quot;, &quot;PATROL&quot;, &quot;THREATS&quot;, &quot;BRITISH&quot;, &quot;SUBJECT&quot;, &quot;TO&quot;, &quot;HIDING&quot;, &quot;HISTORY&quot;, &quot;THERE&quot;, &quot;TECHNICAL&quot;, &quot;BEGINNING&quot;, &quot;0600&quot;, &quot;APPROXIMATELY&quot;, &quot;ACCOUNT&quot;, &quot;TUPAC&quot;, &quot;EXPLAINING&quot;, &quot;UN&quot;, &quot;JUAN&quot;, &quot;UP&quot;, &quot;DURING&quot;, &quot;US&quot;, &quot;SALVADOR&quot;, &quot;SERVED&quot;, &quot;THESE&quot;, &quot;WORKING&quot;, &quot;TRAFFICKERS&quot;, &quot;RELATIVES&quot;, &quot;DIEGO&quot;, &quot;FINAL&quot;, &quot;PRESUMABLY&quot;, &quot;MEANWHILE&quot;, &quot;FULL&quot;, &quot;FURTHER&quot;, &quot;NAME&quot;, &quot;YEARS&quot;, &quot;POSSIBLE&quot;, &quot;LAST&quot;, &quot;TOWN&quot;, &quot;DEALT&quot;, &quot;BRING&quot;, &quot;EXPERIENCE&quot;, &quot;WHETHER&quot;, &quot;BOMB&quot;, &quot;INTERNATIONAL&quot;, &quot;COURT&quot;, &quot;BILLION&quot;, &quot;ENTERED&quot;, &quot;OFFICIALS&quot;, &quot;VOTE&quot;, &quot;COLOMBIANS&quot;, &quot;ASSASSINS&quot;, &quot;GENERAL&quot;, &quot;WE&quot;, &quot;COURSE&quot;, &quot;NOTES&quot;, &quot;IMPLICATED&quot;, &quot;ACHIEVE&quot;, &quot;SIGNED&quot;, &quot;NEWSMEN&quot;, &quot;NEXT&quot;, &quot;SALVADORANS&quot;, &quot;GUERRILLAS&quot;, &quot;SPOKE&quot;, &quot;AREAS&quot;, &quot;PERU&quot;, &quot;PROVIDE&quot;, &quot;NORTHEAST&quot;, &quot;NOTED&quot;, &quot;SECTOR&quot;, &quot;MOUNTAINOUS&quot;, &quot;TIME&quot;, &quot;WHAT&quot;, &quot;ANOTHER&quot;, &quot;UNHARMED&quot;, &quot;AWAY&quot;, &quot;URGENT&quot;, &quot;AGENCY&quot;, &quot;PERSONNEL&quot;, &quot;FMLN-FDR&quot;, &quot;HOURS&quot;, &quot;STRUGGLE&quot;, &quot;0630&quot;, &quot;PRESIDENT&quot;, &quot;NEWS&quot;, &quot;AGENDA&quot;, &quot;PEOPLE&quot;, &quot;MEDELLIN&quot;, &quot;1966&quot;, &quot;DIRECTORS&quot;, &quot;POPULATION&quot;, &quot;CRIME&quot;, &quot;PROBLEMS&quot;, &quot;SPEAK&quot;, &quot;PLAN&quot;, &quot;SHARE&quot;, &quot;WOUNDED&quot;, &quot;ENDING&quot;, &quot;CARD&quot;, &quot;CITIZENS&quot;, &quot;WHEN&quot;, &quot;FRANKLIN&quot;, &quot;BREAK&quot;, &quot;LOCAL&quot;, &quot;DOCUMENT&quot;, &quot;EXCHANGE&quot;, &quot;ACTED&quot;, &quot;PERSON&quot;, &quot;CENTRAL&quot;, &quot;1990&quot;, &quot;DOMESTIC&quot;, &quot;SUBJECTED&quot;, &quot;OUR&quot;, &quot;LEADING&quot;, &quot;OUT&quot;, &quot;CASE&quot;, &quot;COMPANY&quot;, &quot;GIVE&quot;, &quot;WOMEN&quot;, &quot;ESCORT&quot;, &quot;SHERATON&quot;, &quot;COMMON&quot;, &quot;PUBLIC&quot;, &quot;BRIGADE&quot;, &quot;CAUSES&quot;, &quot;PERSECUTION&quot;, &quot;1989&quot;, &quot;NAMES&quot;, &quot;-LRB-&quot;, &quot;POLICEMEN&quot;, &quot;ANALYSIS&quot;, &quot;BEGIN&quot;, &quot;MRS&quot;, &quot;ORDER&quot;, &quot;ADDED&quot;, &quot;LIBERATION&quot;, &quot;GIVEN&quot;, &quot;CEREMONY&quot;, &quot;BEING&quot;, &quot;ROBERTO&quot;, &quot;JOURNALIST&quot;, &quot;SENATOR&quot;, &quot;ESCALATION&quot;, &quot;DECIDED&quot;, &quot;CONDEMNED&quot;, &quot;BOMBING&quot;, &quot;SPOKESMEN&quot;, &quot;OWN&quot;, &quot;BROTHER&quot;, &quot;OFFICES&quot;, &quot;STAYING&quot;, &quot;MORE&quot;, &quot;SEIZED&quot;, &quot;COULD&quot;, &quot;LIVING&quot;, &quot;LIBERTY&quot;, &quot;CUELLAR&quot;, &quot;QUITO&quot;, &quot;ACAN-EFE&quot;, &quot;EIGHT&quot;, &quot;ZONE&quot;, &quot;MEASURE&quot;, &quot;PATRIOTIC&quot;, &quot;CLANDESTINE&quot;, &quot;ALVARO&quot;, &quot;INSTITUTIONS&quot;, &quot;STATED&quot;, &quot;0200&quot;, &quot;INFORM&quot;, &quot;REPRESENTATIVE&quot;, &quot;MEDIA&quot;, &quot;USED&quot;, &quot;SERVICE&quot;, &quot;INCLUDING&quot;, &quot;STRONGLY&quot;, &quot;UNITS&quot;, &quot;CATATUMBO&quot;, &quot;BOTH&quot;, &quot;REGIONAL&quot;, &quot;DIFFERENT&quot;, &quot;SOUTHEAST&quot;, &quot;MOST&quot;, &quot;FULLY&quot;, &quot;TRIED&quot;, &quot;DEMOCRATIC&quot;, &quot;CAN&quot;, &quot;DIFFICULT&quot;, &quot;ACCEPT&quot;, &quot;EXPLOITATION&quot;, &quot;FLIGHT&quot;, &quot;KIND&quot;, &quot;FRANCISCO&quot;, &quot;DISCUSSIONS&quot;, &quot;RELATED&quot;, &quot;EFE&quot;, &quot;HIRED&quot;, &quot;SOCIETY&quot;, &quot;HEADING&quot;, &quot;CHURCH&quot;, &quot;FIRMLY&quot;, &quot;PART&quot;, &quot;GOMEZ&quot;, &quot;ALSO&quot;, &quot;EAST&quot;, &quot;MEAN&quot;, &quot;OFFICIAL&quot;, &quot;DETERMINE&quot;, &quot;TODAY&quot;, &quot;PESOS&quot;, &quot;PEDRO&quot;, &quot;UNTIL&quot;, &quot;ADDS&quot;, &quot;STUDENTS&quot;, &quot;REST&quot;, &quot;HUANCAYO&quot;, &quot;REVEALED&quot;, &quot;TARGETS&quot;, &quot;SPOKESMAN&quot;, &quot;RESULT&quot;, &quot;ACCORDING&quot;, &quot;``&quot;, &quot;HEARD&quot;, &quot;VENCEREMOS&quot;, &quot;DECEMBER&quot;, &quot;FIGHT&quot;, &quot;MOREOVER&quot;, &quot;SCHEDULED&quot;, &quot;ECUADOR&quot;, &quot;CLAIMED&quot;, &quot;OPERATING&quot;, &quot;TANKS&quot;, &quot;SPORADIC&quot;, &quot;POINTS&quot;, &quot;POLICE&quot;, &quot;CHRISTIAN&quot;, &quot;HELICOPTERS&quot;, &quot;AMERICA&quot;, &quot;COUNTRIES&quot;, &quot;COMBAT&quot;, &quot;EFFECT&quot;, &quot;REVEAL&quot;, &quot;GMT&quot;, &quot;TOGETHER&quot;, &quot;SABOTAGE&quot;, &quot;BOMBINGS&quot;, &quot;POLICY&quot;, &quot;BEEN&quot;, &quot;EMPLOYEES&quot;, &quot;SOMETHING&quot;, &quot;PAST&quot;, &quot;MAKING&quot;, &quot;JULY&quot;, &quot;RCN&quot;, &quot;NATIONS&quot;, &quot;ANDRES&quot;, &quot;TURBAY&quot;, &quot;EXPRESSED&quot;, &quot;WHOM&quot;, &quot;CLARIFICATION&quot;, &quot;CLOSEST&quot;, &quot;DOWNED&quot;, &quot;REITERATE&quot;, &quot;THE&quot;, &quot;LUIS&quot;, &quot;BROKE&quot;, &quot;UPPER&quot;, &quot;ALFONSO&quot;, &quot;BEGAN&quot;, &quot;DAUGHTER&quot;, &quot;PARAMILITARY&quot;, &quot;OBJECTIVE&quot;, &quot;UNITED&quot;, &quot;HEROIC&quot;, &quot;BARCO&quot;, &quot;ARMED&quot;, &quot;VELASQUEZ&quot;, &quot;AUTHORITIES&quot;, &quot;DEMOCRACY&quot;, &quot;POWER&quot;, &quot;NORTHERN&quot;, &quot;VINICIO&quot;, &quot;PLACE&quot;, &quot;VICTIM&quot;, &quot;PERMIT&quot;, &quot;MUNICIPALITY&quot;, &quot;ANTIOQUIA&quot;, &quot;ACT&quot;, &quot;OPERATION&quot;, &quot;ADMITTED&quot;, &quot;GOVERNMENT&quot;, &quot;RECORDING&quot;, &quot;EMBASSY&quot;, &quot;ADD&quot;, &quot;DOWN&quot;, &quot;INFORMED&quot;, &quot;PAZ&quot;, &quot;FASCISTS&quot;, &quot;ITS&quot;, &quot;PAY&quot;, &quot;TAKING&quot;, &quot;GLORIOUS&quot;, &quot;TYPES&quot;, &quot;LEADER&quot;, &quot;HIGH-RANKING&quot;, &quot;NORTH&quot;, &quot;CONSTANTLY&quot;, &quot;MINISTRY&quot;, &quot;FOUND&quot;, &quot;TROOPS&quot;, &quot;TAKE&quot;, &quot;RESPONSIBLE&quot;, &quot;STATION&quot;, &quot;INFORMATION&quot;, &quot;EARLY&quot;, &quot;FMLN&quot;, &quot;TOTALLY&quot;, &quot;OFFICIALLY&quot;, &quot;BENITO&quot;, &quot;WANTS&quot;, &quot;SQUAD&quot;, &quot;MEDICAL&quot;, &quot;GUARANTEE&quot;, &quot;GUATEMALA&quot;, &quot;FOREIGNER&quot;, &quot;END&quot;, &quot;FUENTES&quot;, &quot;INCLUDED&quot;, &quot;CAPTAIN&quot;, &quot;ORGANIZE&quot;, &quot;DEFENSE&quot;, &quot;MONEY&quot;, &quot;ECONOMIC&quot;, &quot;DISCLOSE&quot;, &quot;SANTIAGO&quot;, &quot;INDEPENDENT&quot;, &quot;QUESTIONED&quot;, &quot;AFP&quot;, &quot;DEPARTMENTS&quot;, &quot;JUST&quot;, &quot;PRESSURE&quot;, &quot;STUDENT&quot;, &quot;SOME&quot;, &quot;MAFIAS&quot;, &quot;CONCERNING&quot;, &quot;&#39;&#39;&quot;, &quot;EXCLUSIVE&quot;, &quot;CONDUCTING&quot;, &quot;IDENTIFIED&quot;, &quot;AGO&quot;, &quot;SOCIALIST&quot;, &quot;MEETING&quot;, &quot;ILLEGAL&quot;, &quot;OVER&quot;, &quot;OTHERS&quot;, &quot;SOLE&quot;, &quot;RELEASED&quot;, &quot;REPRESENTATIVES&quot;, &quot;OFFICERS&quot;, &quot;LOPEZ&quot;, &quot;BACK&quot;, &quot;CRISTIANI&quot;, &quot;BARRANCABERMEJA&quot;, &quot;HOME&quot;, &quot;PROTEST&quot;, &quot;BOARD&quot;, &quot;ADVISED&quot;, &quot;ASKS&quot;, &quot;FOUR&quot;, &quot;JOIN&quot;, &quot;RECEIVING&quot;, &quot;TEXT&quot;, &quot;&#39;S&quot;, &quot;ALMOST&quot;, &quot;HUMAN&quot;, &quot;IMAGE&quot;, &quot;TRANQUILLITY&quot;, &quot;CONFIRMED&quot;, &quot;WHICH&quot;, &quot;PRESIDENTS&quot;, &quot;SICK&quot;, &quot;FORCES&quot;, &quot;SOON&quot;, &quot;SPAIN&quot;, &quot;DOUBT&quot;, &quot;MOTHERS&quot;, &quot;NATIONAL&quot;, &quot;ASSASSINATION&quot;, &quot;WORKERS&quot;, &quot;GAVE&quot;, &quot;FIGHTERS&quot;, &quot;FORCED&quot;, &quot;TORTURE&quot;, &quot;EITHER&quot;, &quot;AMARU&quot;, &quot;REGION&quot;, &quot;STILL&quot;, &quot;JARAMILLO&quot;, &quot;BORDER&quot;, &quot;CONCEPT&quot;, &quot;HOWEVER&quot;, &quot;MADE&quot;, &quot;ADVISER&quot;, &quot;ANNOUNCED&quot;, &quot;ACCOMPANY&quot;, &quot;ABLE&quot;, &quot;SAYING&quot;, &quot;ENTER&quot;, &quot;COUNTERINSURGENCY&quot;, &quot;ALWAYS&quot;, &quot;MONTANA&quot;, &quot;ELECTORAL&quot;, &quot;ORGANIZATION&quot;, &quot;POSSIBILITY&quot;, &quot;EFFORT&quot;, &quot;LAUNCHED&quot;, &quot;OMITTED&quot;, &quot;REVOLUTIONARY&quot;, &quot;RIGHT&quot;, &quot;PURPOSE&quot;, &quot;INTERVENTION&quot;, &quot;ELENA&quot;, &quot;FEBE&quot;, &quot;ANYWHERE&quot;, &quot;EXCERPT&quot;, &quot;OLIGARCHY&quot;, &quot;FARABUNDO&quot;, &quot;CALLED&quot;, &quot;SUSPENSION&quot;, &quot;PRESSURED&quot;, &quot;INTERVIEW&quot;, &quot;KNEW&quot;, &quot;-RSB-&quot;, &quot;CONDEMNS&quot;, &quot;JORGE&quot;, &quot;THAT&quot;, &quot;ATTACKS&quot;, &quot;ALL&quot;, &quot;NEW&quot;, &quot;TRADE&quot;, &quot;QUINTERO&quot;, &quot;RECENT&quot;, &quot;LAW&quot;, &quot;HIGH&quot;, &quot;PUNISH&quot;, &quot;THAN&quot;, &quot;TERRORIST&quot;, &quot;ALONG&quot;, &quot;BUSINESS&quot;, &quot;HOTEL&quot;, &quot;INSURGENTS&quot;, &quot;ORGANIZATIONS&quot;, &quot;MINUTE&quot;, &quot;MAIN&quot;, &quot;FINE&quot;, &quot;ELITE&quot;, &quot;TERRORISM&quot;, &quot;--&quot;, &quot;CRITERIA&quot;, &quot;LEADERS&quot;, &quot;OFFERED&quot;, &quot;CLEARLY&quot;, &quot;NEGOTIATE&quot;, &quot;4TH&quot;, &quot;TRUE&quot;, &quot;PROOF&quot;, &quot;BROAD&quot;, &quot;COMMUNITIES&quot;, &quot;EXISTING&quot;, &quot;JUSTICE&quot;, &quot;MARTINEZ&quot;, &quot;PARTICIPATE&quot;, &quot;REPORTEDLY&quot;, &quot;POPULATED&quot;, &quot;DEPARTURE&quot;, &quot;THROUGH&quot;, &quot;AND&quot;, &quot;AUGUST&quot;, &quot;REGISTRY&quot;, &quot;RIGHTS&quot;, &quot;CARTEL&quot;, &quot;ANY&quot;, &quot;MAKE&quot;, &quot;SOURCES&quot;, &quot;PUBLICITY&quot;, &quot;IMMEDIATELY&quot;, &quot;MATERIEL&quot;, &quot;BARONS&quot;, &quot;BELIEVE&quot;, &quot;ALFREDO&quot;, &quot;LED&quot;, &quot;CURRENTLY&quot;, &quot;FOURTH&quot;, &quot;ADVANTAGE&quot;, &quot;REACH&quot;, &quot;VOICE&quot;, &quot;SPECIALIZED&quot;, &quot;JAN&quot;, &quot;FREEDOM&quot;, &quot;LET&quot;, &quot;BEST&quot;, &quot;EXPECTED&quot;, &quot;WEAPONS&quot;, &quot;MONTH&quot;, &quot;APR&quot;, &quot;ASSASSINATED&quot;, &quot;OWNED&quot;, &quot;LONGER&quot;, &quot;AFTER&quot;, &quot;COPREFA&quot;, &quot;ERNESTO&quot;, &quot;THEY&quot;, &quot;INDIVIDUALS&quot;, &quot;STREETS&quot;, &quot;MONTHS&quot;, &quot;CENTER&quot;, &quot;WALDEMAR&quot;, &quot;CONSIDERATION&quot;, &quot;INCLUDE&quot;, &quot;INTERRUPTED&quot;, &quot;10&quot;, &quot;11&quot;, &quot;12&quot;, &quot;LATER&quot;, &quot;CAPACITY&quot;, &quot;13&quot;, &quot;14&quot;, &quot;CUT&quot;, &quot;15&quot;, &quot;16&quot;, &quot;DAILY&quot;, &quot;17&quot;, &quot;18&quot;, &quot;PRIOR&quot;, &quot;19&quot;, &quot;OCCASION&quot;, &quot;TWO&quot;, &quot;ANNOUNCEMENT&quot;, &quot;IDENTITY&quot;, &quot;ARE&quot;, &quot;THINGS&quot;, &quot;BOGOTA&quot;, &quot;SOURCE&quot;, &quot;TAXI&quot;, &quot;THEM&quot;, &quot;PROVIDES&quot;, &quot;CORPS&quot;, &quot;OBTAIN&quot;, &quot;20&quot;, &quot;21&quot;, &quot;PARTY&quot;, &quot;22&quot;, &quot;24&quot;, &quot;INTO&quot;, &quot;26&quot;, &quot;27&quot;, &quot;SHIPMENT&quot;, &quot;PARTS&quot;, &quot;OFFER&quot;, &quot;29&quot;, &quot;FACT&quot;, &quot;FREE&quot;, &quot;0700&quot;, &quot;CONVERGENCE&quot;, &quot;SUMMIT&quot;, &quot;30&quot;, &quot;SEEN&quot;, &quot;SIMILAR&quot;, &quot;LONG&quot;, &quot;32&quot;, &quot;CONDUCT&quot;, &quot;ESSENTIAL&quot;, &quot;CIVILIANS&quot;, &quot;UNDER&quot;, &quot;HAD&quot;, &quot;ANALYZE&quot;, &quot;PREVENT&quot;, &quot;JOSE&quot;, &quot;PRESENCE&quot;, &quot;MARCH&quot;, &quot;HAS&quot;, &quot;PAYING&quot;, &quot;MANY&quot;, &quot;40&quot;, &quot;CONTINUES&quot;, &quot;45&quot;, &quot;DESPITE&quot;, &quot;WANTED&quot;, &quot;INDISTINCT&quot;, &quot;GATHERED&quot;, &quot;IMMEDIATE&quot;, &quot;MARIA&quot;, &quot;INCREASING&quot;, &quot;ORDERED&quot;, &quot;DELEGATION&quot;, &quot;FAMILIES&quot;, &quot;LEMOS&quot;, &quot;SUPPLY&quot;, &quot;WHOSE&quot;, &quot;SEVERAL&quot;, &quot;NUMBER&quot;, &quot;NETWORK&quot;, &quot;GUERILLAS&quot;, &quot;PROTECTION&quot;, &quot;TUESDAY&quot;, &quot;LATIN&quot;, &quot;FASCIST&quot;, &quot;THEREFORE&quot;, &quot;ACADEMY&quot;, &quot;NOT&quot;, &quot;NOV&quot;, &quot;GUARANTEES&quot;, &quot;PLANE&quot;, &quot;HOPEFUL&quot;, &quot;NOW&quot;, &quot;-RRB-&quot;, &quot;THIS&quot;, &quot;UNIVERSITY&quot;, &quot;HAVING&quot;, &quot;MARIO&quot;, &quot;UNOFFICIAL&quot;, &quot;VIOLATE&quot;, &quot;OPERATIONS&quot;, &quot;WAS&quot;, &quot;YET&quot;, &quot;PEACE&quot;, &quot;WAR&quot;, &quot;WAY&quot;, &quot;PROTECTING&quot;, &quot;RETURN&quot;, &quot;ELEMENTS&quot;, &quot;FOREIGN&quot;, &quot;ARTILLERY&quot;, &quot;LEGAL&quot;, &quot;MASS&quot;, &quot;EXECUTIVE&quot;, &quot;DAMAGED&quot;, &quot;CITIZEN&quot;, &quot;LIFE&quot;, &quot;VENEZUELAN&quot;, &quot;SOARES&quot;, &quot;ONES&quot;, &quot;STEP&quot;, &quot;REPORT&quot;, &quot;WRITING&quot;, &quot;SOACHA&quot;, &quot;UNJUSTIFIABLE&quot;, &quot;BROTHERS&quot;, &quot;AGAINST&quot;, &quot;JUDGMENT&quot;, &quot;HER&quot;, &quot;PEREZ&quot;, &quot;VIRGILIO&quot;, &quot;CRIMINAL&quot;, &quot;CAPITAL&quot;, &quot;89&quot;, &quot;-LSB-&quot;, &quot;ASKED&quot;, &quot;AIRPORT&quot;, &quot;CEASE-FIRE&quot;, &quot;ARMANDO&quot;, &quot;PRESIDENCY&quot;, &quot;INTELLIGENCE&quot;, &quot;MORNING&quot;, &quot;THREATENED&quot;, &quot;HELD&quot;, &quot;NICARAGUA&quot;, &quot;90&quot;, &quot;COME&quot;, &quot;INDICATES&quot;, &quot;GAVIRIA&quot;, &quot;WORD&quot;, &quot;TELEPHONE&quot;, &quot;HURTING&quot;, &quot;REGARDING&quot;, &quot;LEVEL&quot;, &quot;THOSE&quot;, &quot;MILITARY&quot;, &quot;DIARIO&quot;, &quot;WOUNDS&quot;, &quot;LOSE&quot;, &quot;WORK&quot;, &quot;WITHOUT&quot;, &quot;WIFE&quot;, &quot;FATHERLAND&quot;, &quot;SO-CALLED&quot;, &quot;SMUGGLING&quot;, &quot;PARTICULARLY&quot;, &quot;COLONEL&quot;, &quot;NOON&quot;, &quot;ARRIVED&quot;, &quot;BODYGUARDS&quot;, &quot;SHOOT&quot;, &quot;POLITICAL&quot;, &quot;AMBUSH&quot;, &quot;LARGE&quot;, &quot;DRUGS&quot;, &quot;RECENTLY&quot;, &quot;CAMPAIGN&quot;, &quot;COWARDLY&quot;, &quot;HELP&quot;, &quot;SITE&quot;, &quot;SITUATIONS&quot;, &quot;FEB&quot;, &quot;KNOWN&quot;, &quot;PEACEFUL&quot;, &quot;LAWYER&quot;, &quot;GUEVARA&quot;, &quot;RESPECTIVELY&quot;, &quot;HIM&quot;, &quot;FRONTS&quot;, &quot;HIS&quot;, &quot;ADDITION&quot;, &quot;OCCUPIED&quot;, &quot;VERSION&quot;, &quot;RADIO&quot;, &quot;FEW&quot;, &quot;ABOMINABLE&quot;, &quot;DISLODGE&quot;, &quot;DRUG&quot;, &quot;DECISION&quot;, &quot;FORMER&quot;, &quot;CAUSE&quot;, &quot;ARNULFO&quot;, &quot;ONLY&quot;, &quot;FROM&quot;, &quot;SPECIAL&quot;, &quot;INTEREST&quot;, &quot;RECEIVED&quot;, &quot;SUPPORT&quot;, &quot;HEADQUARTERS&quot;, &quot;DENSELY&quot;, &quot;NIGHT&quot;, &quot;SECRETARY&quot;, &quot;WORLD&quot;, &quot;WHO&quot;, &quot;CONDUCTED&quot;, &quot;COMMENTING&quot;, &quot;MEMBERS&quot;, &quot;SUNDAY&quot;, &quot;THOUSANDS&quot;, &quot;IRRATIONAL&quot;, &quot;SINCE&quot;, &quot;INFANTRY&quot;, &quot;CONSTITUTION&quot;, &quot;FIGHTING&quot;, &quot;BLOW&quot;, &quot;INDISCRIMINATE&quot;, &quot;INRAVISION&quot;, &quot;OPERATED&quot;, &quot;DATE&quot;, &quot;LIKE&quot;, &quot;INJURED&quot;, &quot;NOTIMEX&quot;, &quot;SENT&quot;, &quot;CIRCUMSTANCES&quot;, &quot;SAN&quot;, &quot;JOURNALISTS&quot;, &quot;DELIVERED&quot;, &quot;FELLOW&quot;, &quot;PANAMA&quot;, &quot;GUATEMALAN&quot;, &quot;MISSING&quot;, &quot;SAID&quot;, &quot;HERE&quot;, &quot;ACAN&quot;, &quot;SPECULATION&quot;, &quot;TOMORROW&quot;, &quot;NOTE&quot;, &quot;CHANNELS&quot;, &quot;BASIS&quot;, &quot;TOTAL&quot;, &quot;ISSUED&quot;, &quot;DEC&quot;, &quot;GROUNDS&quot;, &quot;MISSION&quot;, &quot;UNIDENTIFIED&quot;, &quot;CLARIFY&quot;, &quot;OVERCOME&quot;, &quot;MARXIST-LENINIST&quot;, &quot;MEXICO&quot;, &quot;AMERICAN&quot;, &quot;BEFORE&quot;, &quot;LIMA&quot;, &quot;CESAR&quot;, &quot;ARTICLE&quot;, &quot;CHIEF&quot;, &quot;RODRIGO&quot;, &quot;WILL&quot;, &quot;WHILE&quot;, &quot;CIVILIAN&quot;, &quot;THEMSELVES&quot;, &quot;YOU&quot;));</td>
      </tr>
      <tr>
        <td id="L108" class="blob-num js-line-number" data-line-number="108"></td>
        <td id="LC108" class="blob-code blob-code-inner js-file-line">							<span class="pl-c"><span class="pl-c">//</span>private static ArrayList&lt;String&gt; ignore_robbery=new ArrayList&lt;String&gt;(Arrays.asList(&quot;&quot;));</span></td>
      </tr>
      <tr>
        <td id="L109" class="blob-num js-line-number" data-line-number="109"></td>
        <td id="LC109" class="blob-code blob-code-inner js-file-line">							<span class="pl-c"><span class="pl-c">//</span>ArrayList&lt;String&gt; ignore_attack=new ArrayList&lt;String&gt;(Arrays.asList(&quot;&quot;));</span></td>
      </tr>
      <tr>
        <td id="L110" class="blob-num js-line-number" data-line-number="110"></td>
        <td id="LC110" class="blob-code blob-code-inner js-file-line">							//private static ArrayList&lt;String&gt; ignore_attack=new ArrayList&lt;String&gt;(Arrays.asList(&quot;&quot;, &quot;ATTENTION&quot;, &quot;SIDEWALK&quot;, &quot;NEAR&quot;, &quot;INDICATION&quot;, &quot;YEAR&quot;, &quot;TAKEN&quot;, &quot;URGE&quot;, &quot;$&quot;, &quot;STOP&quot;, &quot;VARGAS&quot;, &quot;DEPARTMENT&quot;, &quot;,&quot;, &quot;WHERE&quot;, &quot;.&quot;, &quot;CABANAS&quot;, &quot;2&quot;, &quot;3&quot;, &quot;4&quot;, &quot;5&quot;, &quot;6&quot;, &quot;7&quot;, &quot;8&quot;, &quot;9&quot;, &quot;ADVISE&quot;, &quot;:&quot;, &quot;PROMINENT&quot;, &quot;PASSENGERS&quot;, &quot;SEP&quot;, &quot;A&quot;, &quot;RESPOND&quot;, &quot;SET&quot;, &quot;MAYORS&quot;, &quot;FLORES&quot;, &quot;BATTALION&quot;, &quot;COMPANIES&quot;, &quot;ATTRIBUTED&quot;, &quot;JUL&quot;, &quot;`&quot;, &quot;JURISDICTION&quot;, &quot;VEHICLES&quot;, &quot;SECURITY&quot;, &quot;COLINDRES&quot;, &quot;SUBORDINATES&quot;, &quot;WORTH&quot;, &quot;SERVICES&quot;, &quot;BOULEVARD&quot;, &quot;ETERNAL&quot;, &quot;SHE&quot;, &quot;COUNTRY&quot;, &quot;VIOLENT&quot;, &quot;WORSE&quot;, &quot;MECHANISMS&quot;, &quot;SUPPLYING&quot;, &quot;DOING&quot;, &quot;JAIL&quot;, &quot;BRAZILIAN&quot;, &quot;PROPOSE&quot;, &quot;OCCURRED&quot;, &quot;WITHIN&quot;, &quot;DEMANDED&quot;, &quot;ACTING&quot;, &quot;PROGRESS&quot;, &quot;DETAINED&quot;, &quot;CHARGE&quot;, &quot;ACCOMPANIED&quot;, &quot;RODRIGUEZ&quot;, &quot;TRAVEL&quot;, &quot;AIRES&quot;, &quot;ACTION&quot;, &quot;COORDINATOR&quot;, &quot;DESIRE&quot;, &quot;TRUCK&quot;, &quot;RICH&quot;, &quot;TRUCE&quot;, &quot;TOLD&quot;, &quot;AGUA&quot;, &quot;AUGUSTO&quot;, &quot;FEBRUARY&quot;, &quot;STORMED&quot;, &quot;ASKING&quot;, &quot;ARGUMENT&quot;, &quot;CEASE&quot;, &quot;AVENUE&quot;, &quot;SINCERE&quot;, &quot;CASTILLO&quot;, &quot;GUATEMALANS&quot;, &quot;TRADITIONAL&quot;, &quot;RECORDS&quot;, &quot;SON&quot;, &quot;2.5&quot;, &quot;CASUALTIES&quot;, &quot;ALARM&quot;, &quot;COMRADES&quot;, &quot;LONG-TERM&quot;, &quot;IMPORTANT&quot;, &quot;AGREEMENT&quot;, &quot;TOOK&quot;, &quot;200&quot;, &quot;INSTITUTE&quot;, &quot;PCCH&quot;, &quot;HEARTFELT&quot;, &quot;TOOL&quot;, &quot;NEIGHBORHOODS&quot;, &quot;ACTIVE&quot;, &quot;SRE&quot;, &quot;EXTRADITABLES&quot;, &quot;CHAMORRO&quot;, &quot;VENEZUELA&quot;, &quot;REFERENCE&quot;, &quot;STRIKE&quot;, &quot;ANTONIO&quot;, &quot;REPORTED&quot;, &quot;SHOWED&quot;, &quot;AFFECTING&quot;, &quot;CONFRONT&quot;, &quot;REBEL&quot;, &quot;RESOLVE&quot;, &quot;FRONT&quot;, &quot;RIFLE&quot;, &quot;CONTEXT&quot;, &quot;CONSIDERED&quot;, &quot;CONDOLENCES&quot;, &quot;MISTAKEN&quot;, &quot;FOREIGNERS&quot;, &quot;SEEKING&quot;, &quot;SLOW&quot;, &quot;ESTABLISHED&quot;, &quot;BOMBS&quot;, &quot;ANGRY&quot;, &quot;GRAY&quot;, &quot;POSSIBLY&quot;, &quot;SUFFERED&quot;, &quot;MAOIST&quot;, &quot;1ST&quot;, &quot;MESSAGES&quot;, &quot;SURRENDER&quot;, &quot;MINISTRIES&quot;, &quot;LANDING&quot;, &quot;HECTOR&quot;, &quot;HEAVILY&quot;, &quot;BUT&quot;, &quot;BUS&quot;, &quot;VALLEJO&quot;, &quot;RESPONSIBILITY&quot;, &quot;OTHER&quot;, &quot;PADILLA&quot;, &quot;METROPOLITAN&quot;, &quot;SORRY&quot;, &quot;BEGINNING&quot;, &quot;FINALLY&quot;, &quot;1930&quot;, &quot;GUARD&quot;, &quot;GRENADE&quot;, &quot;ABSOLUTELY&quot;, &quot;DURING&quot;, &quot;TRAFFICKERS&quot;, &quot;TOWN&quot;, &quot;MEASURES&quot;, &quot;SOMOZA&quot;, &quot;ENTERED&quot;, &quot;SORTO&quot;, &quot;BRIDGE&quot;, &quot;HIGHER&quot;, &quot;CREATES&quot;, &quot;TWELVE&quot;, &quot;PIPELINE&quot;, &quot;PROVIDE&quot;, &quot;AGENCY&quot;, &quot;FMLN-FDR&quot;, &quot;0630&quot;, &quot;1960&quot;, &quot;AGENDA&quot;, &quot;SESSIONS&quot;, &quot;MINUTES&quot;, &quot;UNIONS&quot;, &quot;INSIDE&quot;, &quot;1966&quot;, &quot;DIRECTORS&quot;, &quot;WOUNDED&quot;, &quot;INCIDENTS&quot;, &quot;PLAY&quot;, &quot;WHEN&quot;, &quot;LOCAL&quot;, &quot;DOCUMENT&quot;, &quot;BOTERO&quot;, &quot;PERSON&quot;, &quot;1990&quot;, &quot;DOMESTIC&quot;, &quot;ENTERING&quot;, &quot;SUBJECTED&quot;, &quot;MONTOYA&quot;, &quot;SYSTEMS&quot;, &quot;NOTICE&quot;, &quot;STAGED&quot;, &quot;WONDER&quot;, &quot;BEGIN&quot;, &quot;CEREMONY&quot;, &quot;ROBERTO&quot;, &quot;JOURNALIST&quot;, &quot;BOMBING&quot;, &quot;PHYSICAL&quot;, &quot;SPOKESMEN&quot;, &quot;BROTHER&quot;, &quot;REINFORCE&quot;, &quot;SULA&quot;, &quot;INVESTIGATORS&quot;, &quot;INDEED&quot;, &quot;ALVARO&quot;, &quot;USED&quot;, &quot;ANYONE&quot;, &quot;EXCEPT&quot;, &quot;GRIPPED&quot;, &quot;ITSELF&quot;, &quot;FLIGHT&quot;, &quot;CAR&quot;, &quot;SABOTAGING&quot;, &quot;RELATED&quot;, &quot;CLOSED&quot;, &quot;DETACHMENT&quot;, &quot;ANGELES&quot;, &quot;SERIES&quot;, &quot;TODAY&quot;, &quot;COMMENTED&quot;, &quot;UNTIL&quot;, &quot;TELLING&quot;, &quot;CROSS&quot;, &quot;TARGETS&quot;, &quot;SPOKESMAN&quot;, &quot;ASSURANCES&quot;, &quot;COLLABORATING&quot;, &quot;SPORADIC&quot;, &quot;INCLUSION&quot;, &quot;COMBAT&quot;, &quot;HURT&quot;, &quot;DELEGATIONS&quot;, &quot;WHOM&quot;, &quot;CLOSEST&quot;, &quot;APOPA&quot;, &quot;PARDO&quot;, &quot;CONSULT&quot;, &quot;THE&quot;, &quot;BROKE&quot;, &quot;UPPER&quot;, &quot;KINGPINS&quot;, &quot;PROLONGED&quot;, &quot;RECOVERING&quot;, &quot;YOUTHS&quot;, &quot;ARMED&quot;, &quot;PSYCHOLOGICAL&quot;, &quot;DRIVERS&quot;, &quot;PLACE&quot;, &quot;MUNICIPALITY&quot;, &quot;ANTIOQUIA&quot;, &quot;ADMITTED&quot;, &quot;BARRANQUILLA&quot;, &quot;FASCISTS&quot;, &quot;DEEPLY&quot;, &quot;MINISTRY&quot;, &quot;GERMAN&quot;, &quot;TROOPS&quot;, &quot;SECRETARIAT&quot;, &quot;OFFICIALLY&quot;, &quot;MEDICAL&quot;, &quot;UNILATERAL&quot;, &quot;FUENTES&quot;, &quot;HORDES&quot;, &quot;RATE&quot;, &quot;RECALL&quot;, &quot;MINORS&quot;, &quot;PRESSURE&quot;, &quot;FOLLOWS&quot;, &quot;SCENE&quot;, &quot;INSIST&quot;, &quot;&#39;&#39;&quot;, &quot;SOCIALIST&quot;, &quot;PROBABLY&quot;, &quot;ILLEGAL&quot;, &quot;RELEASED&quot;, &quot;FEELING&quot;, &quot;FOUR&quot;, &quot;&#39;S&quot;, &quot;REACTED&quot;, &quot;CONFIRMED&quot;, &quot;CLAIMS&quot;, &quot;ELSE&quot;, &quot;RAUL&quot;, &quot;GUILTY&quot;, &quot;EITHER&quot;, &quot;HOWEVER&quot;, &quot;TOP&quot;, &quot;ARGENTINE&quot;, &quot;FRIDAY&quot;, &quot;ARGENTINA&quot;, &quot;ORGANIZATION&quot;, &quot;ABANDONED&quot;, &quot;LAUNCHED&quot;, &quot;USSR&quot;, &quot;LAUNCHER&quot;, &quot;DEMONSTRATE&quot;, &quot;OLIGARCHY&quot;, &quot;LAUNDERING&quot;, &quot;VICENTE&quot;, &quot;ORGANIZED&quot;, &quot;SUSPENSION&quot;, &quot;300&quot;, &quot;-RSB-&quot;, &quot;AFFIRMED&quot;, &quot;LAS&quot;, &quot;THAT&quot;, &quot;ATTACKS&quot;, &quot;LAY&quot;, &quot;BUSINESS&quot;, &quot;INSURGENTS&quot;, &quot;UPCOMING&quot;, &quot;315&quot;, &quot;COMMUNIQUES&quot;, &quot;CREATING&quot;, &quot;--&quot;, &quot;LEADERS&quot;, &quot;OFFERED&quot;, &quot;BROAD&quot;, &quot;REPORTEDLY&quot;, &quot;POPULATED&quot;, &quot;INFORMERS&quot;, &quot;AGREED&quot;, &quot;HEAD&quot;, &quot;CARTEL&quot;, &quot;DISAPPEARANCE&quot;, &quot;STORES&quot;, &quot;MIRAFLORES&quot;, &quot;COCA&quot;, &quot;MUNICIPALITIES&quot;, &quot;FOURTH&quot;, &quot;LEG&quot;, &quot;REACH&quot;, &quot;LET&quot;, &quot;CARABINEROS&quot;, &quot;CONCERN&quot;, &quot;REACT&quot;, &quot;CLOSE&quot;, &quot;COPREFA&quot;, &quot;350&quot;, &quot;STREETS&quot;, &quot;MONTHS&quot;, &quot;INTERNAL&quot;, &quot;10&quot;, &quot;12&quot;, &quot;13&quot;, &quot;14&quot;, &quot;INJURIES&quot;, &quot;DAILY&quot;, &quot;18&quot;, &quot;PROVIDED&quot;, &quot;TWO&quot;, &quot;ANNOUNCEMENT&quot;, &quot;IDENTITY&quot;, &quot;BOEING&quot;, &quot;BOGOTA&quot;, &quot;THEM&quot;, &quot;PROVIDES&quot;, &quot;20&quot;, &quot;BARRIOS&quot;, &quot;21&quot;, &quot;PARTY&quot;, &quot;22&quot;, &quot;24&quot;, &quot;CAMERAS&quot;, &quot;27&quot;, &quot;OFFER&quot;, &quot;BUENOS&quot;, &quot;TRAVELED&quot;, &quot;0700&quot;, &quot;2D&quot;, &quot;CLOTHES&quot;, &quot;SEEM&quot;, &quot;30&quot;, &quot;SEEN&quot;, &quot;31&quot;, &quot;32&quot;, &quot;35&quot;, &quot;BLEW&quot;, &quot;36&quot;, &quot;PENAL&quot;, &quot;VOTING&quot;, &quot;3D&quot;, &quot;GUTIERREZ&quot;, &quot;45&quot;, &quot;47&quot;, &quot;48&quot;, &quot;GROWING&quot;, &quot;INDISTINCT&quot;, &quot;DECADE&quot;, &quot;LEMOS&quot;, &quot;NUMBER&quot;, &quot;TUESDAY&quot;, &quot;FERNANDEZ&quot;, &quot;FORCING&quot;, &quot;INTERSECTION&quot;, &quot;PLANE&quot;, &quot;-RRB-&quot;, &quot;60&quot;, &quot;64&quot;, &quot;REDUCE&quot;, &quot;BUILDINGS&quot;, &quot;UNOFFICIAL&quot;, &quot;CIUDAD&quot;, &quot;SEIS&quot;, &quot;VENEZUELAN&quot;, &quot;ISRAELI&quot;, &quot;SLOGANS&quot;, &quot;REPORT&quot;, &quot;80&quot;, &quot;89&quot;, &quot;AIRPORT&quot;, &quot;ROLDAN&quot;, &quot;ARMANDO&quot;, &quot;TABLE&quot;, &quot;THREATENED&quot;, &quot;HELD&quot;, &quot;INJURING&quot;, &quot;90&quot;, &quot;CLASHES&quot;, &quot;ROOTS&quot;, &quot;REJECTS&quot;, &quot;AGRICULTURE&quot;, &quot;LIFT&quot;, &quot;LOS&quot;, &quot;WIFE&quot;, &quot;SOLELY&quot;, &quot;ACHIEVED&quot;, &quot;MOBILIZED&quot;, &quot;LARGE&quot;, &quot;ENOUGH&quot;, &quot;SITUATIONS&quot;, &quot;DARK&quot;, &quot;GUEVARA&quot;, &quot;DAS&quot;, &quot;ABOMINABLE&quot;, &quot;DISLODGE&quot;, &quot;DRUG&quot;, &quot;GERARDO&quot;, &quot;RECEIVED&quot;, &quot;SECRETARY&quot;, &quot;INTERVIEWED&quot;, &quot;INTERVENED&quot;, &quot;CONSTITUTION&quot;, &quot;OPERATED&quot;, &quot;SENT&quot;, &quot;DELIVERED&quot;, &quot;MISSING&quot;, &quot;FPMR&quot;, &quot;RESTREPO&quot;, &quot;HERE&quot;, &quot;CHOICE&quot;, &quot;COST&quot;, &quot;NOTE&quot;, &quot;STOPPED&quot;, &quot;INCENDIARY&quot;, &quot;TOTAL&quot;, &quot;ORDERLY&quot;, &quot;SENATORS&quot;, &quot;SUPPOSED&quot;, &quot;PERSIST&quot;, &quot;LIMA&quot;, &quot;CESAR&quot;, &quot;ARTICLE&quot;, &quot;GUILT&quot;, &quot;AREVALO&quot;, &quot;STUDYING&quot;, &quot;CREDIT&quot;, &quot;DAWN&quot;, &quot;WONDERED&quot;, &quot;THINK&quot;, &quot;NORTHWESTERN&quot;, &quot;THOROUGHLY&quot;, &quot;CARTRIDGES&quot;, &quot;SEARCH&quot;, &quot;NEVERTHELESS&quot;, &quot;INFLICTED&quot;, &quot;1230&quot;, &quot;AN&quot;, &quot;THROWING&quot;, &quot;STRUGGLING&quot;, &quot;AT&quot;, &quot;PERUVIAN&quot;, &quot;RESISTANCE&quot;, &quot;REQUESTED&quot;, &quot;OUTSKIRTS&quot;, &quot;PREVIOUSLY&quot;, &quot;LEAVING&quot;, &quot;SHOWN&quot;, &quot;SUSTAINED&quot;, &quot;BLUE&quot;, &quot;MESSAGE&quot;, &quot;CRASH&quot;, &quot;INSISTED&quot;, &quot;ORIGIN&quot;, &quot;BY&quot;, &quot;DETAILED&quot;, &quot;TRANSPORTATION&quot;, &quot;BRINGS&quot;, &quot;IMPLACABLE&quot;, &quot;DA&quot;, &quot;DE&quot;, &quot;ACTIVISTS&quot;, &quot;CONFLICTS&quot;, &quot;AREA&quot;, &quot;BUSINESSMEN&quot;, &quot;PRESS&quot;, &quot;DAMAGE&quot;, &quot;GUERRILLA&quot;, &quot;RADICAL&quot;, &quot;HEADED&quot;, &quot;ELECTRIC&quot;, &quot;LACK&quot;, &quot;STATE&quot;, &quot;RESPECTIVE&quot;, &quot;BODIES&quot;, &quot;NEIGHBORHOOD&quot;, &quot;SUFFERING&quot;, &quot;APPROACHED&quot;, &quot;CELLS&quot;, &quot;SUDDEN&quot;, &quot;SHORTLY&quot;, &quot;SUPPOSEDLY&quot;, &quot;APPLY&quot;, &quot;ACTIVITY&quot;, &quot;INTERCEPTED&quot;, &quot;AIRPLANE&quot;, &quot;VARIOUS&quot;, &quot;IN&quot;, &quot;MOTHER&quot;, &quot;MAN&quot;, &quot;ALLOWING&quot;, &quot;AGENCIES&quot;, &quot;PLANNING&quot;, &quot;THREW&quot;, &quot;SPORTS&quot;, &quot;NEWSMAN&quot;, &quot;CADENA&quot;, &quot;OUTSIDE&quot;, &quot;KG&quot;, &quot;KM&quot;, &quot;LAUNCHERS&quot;, &quot;DIALOGUE&quot;, &quot;MEANT&quot;, &quot;MEANS&quot;, &quot;LA&quot;, &quot;REBELLION&quot;, &quot;HOLDING&quot;, &quot;PERMANENT&quot;, &quot;PROVOKE&quot;, &quot;CONCLUDE&quot;, &quot;ARMY&quot;, &quot;SINGLE&quot;, &quot;AYALA&quot;, &quot;THIRD&quot;, &quot;INTENTIONS&quot;, &quot;MAFIA&quot;, &quot;RESPECT&quot;, &quot;ENJOY&quot;, &quot;NUMBERS&quot;, &quot;CEMETERY&quot;, &quot;EXTEND&quot;, &quot;SEPTEMBER&quot;, &quot;MY&quot;, &quot;EXTREMIST&quot;, &quot;MEN&quot;, &quot;ELECTION&quot;, &quot;RHETORICAL&quot;, &quot;CACERES&quot;, &quot;OCHOA&quot;, &quot;THREE&quot;, &quot;EXISTENCE&quot;, &quot;NEWSPAPERS&quot;, &quot;NO&quot;, &quot;INTERRUPTING&quot;, &quot;BURY&quot;, &quot;LAND&quot;, &quot;DUE&quot;, &quot;OF&quot;, &quot;TRANSFORMER&quot;, &quot;ON&quot;, &quot;OR&quot;, &quot;TIED&quot;, &quot;BUSH&quot;, &quot;OPPORTUNITY&quot;, &quot;GARCIA&quot;, &quot;CONFIRMING&quot;, &quot;THROW&quot;, &quot;BETWEEN&quot;, &quot;ENSURE&quot;, &quot;USUALLY&quot;, &quot;QUICKLY&quot;, &quot;CARRYING&quot;, &quot;MIDDLE&quot;, &quot;TOWER&quot;, &quot;NORBERTO&quot;, &quot;HIGHWAYS&quot;, &quot;COMMUNICATIONS&quot;, &quot;TELEVISION&quot;, &quot;JAVIER&quot;, &quot;BANKS&quot;, &quot;DAUGHTERS&quot;, &quot;CONFORM&quot;, &quot;URIBE&quot;, &quot;INTERESTS&quot;, &quot;REBELS&quot;, &quot;COMMITTEE&quot;, &quot;0830&quot;, &quot;MAINTAINING&quot;, &quot;HEREBY&quot;, &quot;COMMITS&quot;, &quot;TUPAC&quot;, &quot;UN&quot;, &quot;PERQUIN&quot;, &quot;RELATIVES&quot;, &quot;OPPOSE&quot;, &quot;FINAL&quot;, &quot;WARN&quot;, &quot;ROCKET&quot;, &quot;LAST&quot;, &quot;VOTE&quot;, &quot;COMPLICATE&quot;, &quot;CAUSING&quot;, &quot;NEWSMEN&quot;, &quot;GUERRILLAS&quot;, &quot;SPOKE&quot;, &quot;AREAS&quot;, &quot;PERU&quot;, &quot;APPEARS&quot;, &quot;OBVIOUSLY&quot;, &quot;OPERATE&quot;, &quot;DESTABILIZING&quot;, &quot;TIME&quot;, &quot;QUESTIONS&quot;, &quot;HOURS&quot;, &quot;SECTION&quot;, &quot;ECONOMY&quot;, &quot;DIPLOMATIC&quot;, &quot;FIGHTER&quot;, &quot;ENDING&quot;, &quot;CONSULATE&quot;, &quot;HOUSE&quot;, &quot;PREVENTION&quot;, &quot;HERNAN&quot;, &quot;COMPANY&quot;, &quot;LAWS&quot;, &quot;USUAL&quot;, &quot;SATISFIED&quot;, &quot;-LRB-&quot;, &quot;STEPPED&quot;, &quot;MRS&quot;, &quot;LIBERATION&quot;, &quot;BEING&quot;, &quot;COCAINE&quot;, &quot;OFFICER&quot;, &quot;OFFICES&quot;, &quot;STAYING&quot;, &quot;SEIZED&quot;, &quot;QUITO&quot;, &quot;ASSOCIATION&quot;, &quot;DRUGSTORE&quot;, &quot;MARXIST&quot;, &quot;WOMAN&quot;, &quot;THREATENING&quot;, &quot;PREPARATION&quot;, &quot;SOUTHEAST&quot;, &quot;BENAVIDES&quot;, &quot;DEVELOPING&quot;, &quot;POWDER&quot;, &quot;PARTICIPANTS&quot;, &quot;SPECULATIONS&quot;, &quot;EFE&quot;, &quot;POLICEMAN&quot;, &quot;INTENSITY&quot;, &quot;MINOR&quot;, &quot;3,000&quot;, &quot;JEOPARDIZING&quot;, &quot;SUBSTANTIAL&quot;, &quot;RESULTED&quot;, &quot;25TH&quot;, &quot;MEAN&quot;, &quot;OFFICIAL&quot;, &quot;INTENSIVE&quot;, &quot;STUDENTS&quot;, &quot;VIA&quot;, &quot;SURRENDERING&quot;, &quot;ACCORDING&quot;, &quot;``&quot;, &quot;VENCEREMOS&quot;, &quot;PERFECTLY&quot;, &quot;SCHEDULED&quot;, &quot;CHRISTIAN&quot;, &quot;BETANCUR&quot;, &quot;VELEZ&quot;, &quot;SABOTAGE&quot;, &quot;BOMBINGS&quot;, &quot;CHILENA&quot;, &quot;JULY&quot;, &quot;ABORTED&quot;, &quot;CLARIFICATION&quot;, &quot;HOSPITALS&quot;, &quot;CARGO&quot;, &quot;WEARING&quot;, &quot;TACTICS&quot;, &quot;CONGRESS&quot;, &quot;SEEKS&quot;, &quot;OPERATION&quot;, &quot;DESERVES&quot;, &quot;MARCOS&quot;, &quot;INCREASED&quot;, &quot;ELN&quot;, &quot;TAKING&quot;, &quot;CONDEMNABLE&quot;, &quot;REQUIRES&quot;, &quot;HOLD&quot;, &quot;INSTALLATIONS&quot;, &quot;TOWARD&quot;, &quot;CARTRIDGE&quot;, &quot;CAPTAIN&quot;, &quot;MONEY&quot;, &quot;ECONOMIC&quot;, &quot;DISCLOSE&quot;, &quot;QUESTIONED&quot;, &quot;JUST&quot;, &quot;CLIPS&quot;, &quot;MAFIAS&quot;, &quot;CONCERNING&quot;, &quot;BRANCH&quot;, &quot;OBTAINED&quot;, &quot;LOGISTICAL&quot;, &quot;INFILTRATED&quot;, &quot;SOLE&quot;, &quot;INTEGRATION&quot;, &quot;HOME&quot;, &quot;ADVISED&quot;, &quot;SONS&quot;, &quot;SIMEON&quot;, &quot;DISTORT&quot;, &quot;SOON&quot;, &quot;LOSSES&quot;, &quot;WORKERS&quot;, &quot;FIGHTERS&quot;, &quot;TORTURE&quot;, &quot;ADVISER&quot;, &quot;ACCOMPANY&quot;, &quot;ABLE&quot;, &quot;ENTER&quot;, &quot;BROADER&quot;, &quot;ALAMEDA&quot;, &quot;ELENA&quot;, &quot;ENGLISH&quot;, &quot;EXCERPT&quot;, &quot;ZACATECOLUCA&quot;, &quot;MOUTHPIECE&quot;, &quot;PRESSURED&quot;, &quot;EXTENSIVE&quot;, &quot;AIDES&quot;, &quot;TERRORIST&quot;, &quot;BUILD&quot;, &quot;DATED&quot;, &quot;HOTEL&quot;, &quot;BRASILIA&quot;, &quot;CORDONED&quot;, &quot;FIND&quot;, &quot;CRITERIA&quot;, &quot;SHOWING&quot;, &quot;TASK&quot;, &quot;UNARMED&quot;, &quot;CLEARLY&quot;, &quot;MORAZAN&quot;, &quot;4TH&quot;, &quot;PARTICIPATE&quot;, &quot;THROUGH&quot;, &quot;AUGUST&quot;, &quot;MOUNTAIN&quot;, &quot;PUBLICITY&quot;, &quot;REQUESTING&quot;, &quot;PINOCHET&quot;, &quot;PERUANA&quot;, &quot;PRETEXT&quot;, &quot;POPULAR&quot;, &quot;CURRENTLY&quot;, &quot;ADVANTAGE&quot;, &quot;SOTO&quot;, &quot;VOICE&quot;, &quot;ADMINISTRATIVE&quot;, &quot;SPECIALIZED&quot;, &quot;EXPECTED&quot;, &quot;DESIGNATED&quot;, &quot;MENTIONED&quot;, &quot;AFTER&quot;, &quot;HOUSES&quot;, &quot;EYE&quot;, &quot;FIRE&quot;, &quot;FIRM&quot;, &quot;LATER&quot;, &quot;EVACUATING&quot;, &quot;0930&quot;, &quot;SHOCK&quot;, &quot;SOURCE&quot;, &quot;MIGUEL&quot;, &quot;SIMULTANEOUSLY&quot;, &quot;REPEAT&quot;, &quot;VOICED&quot;, &quot;UNDER&quot;, &quot;FIFTH&quot;, &quot;PRESENCE&quot;, &quot;WEAPON&quot;, &quot;INCREASING&quot;, &quot;FIVE&quot;, &quot;FAMILIES&quot;, &quot;PRIMARILY&quot;, &quot;SUPPLY&quot;, &quot;WHOSE&quot;, &quot;LATIN&quot;, &quot;HIDDEN&quot;, &quot;FASCIST&quot;, &quot;THEREFORE&quot;, &quot;NOW&quot;, &quot;WAS&quot;, &quot;WAR&quot;, &quot;CHURCHES&quot;, &quot;WAY&quot;, &quot;REPRESENTS&quot;, &quot;SPREADING&quot;, &quot;FOREIGN&quot;, &quot;DAMAGED&quot;, &quot;EMPTY&quot;, &quot;GENERALIZED&quot;, &quot;PARTIAL&quot;, &quot;WRITING&quot;, &quot;VLADIMIR&quot;, &quot;JUDGMENT&quot;, &quot;OLIGARCHIC&quot;, &quot;100-PERCENT&quot;, &quot;-LSB-&quot;, &quot;CUSCATLAN&quot;, &quot;GUNS&quot;, &quot;UPSET&quot;, &quot;ALTERNATIVE&quot;, &quot;MARKET&quot;, &quot;USEFUL&quot;, &quot;CHECK&quot;, &quot;MOSCOW&quot;, &quot;ARRIVED&quot;, &quot;SHOOK&quot;, &quot;SHOOT&quot;, &quot;FEDERATION&quot;, &quot;SURPASSED&quot;, &quot;ESPECTADOR&quot;, &quot;FEB&quot;, &quot;BRIEFING&quot;, &quot;PASSERSBY&quot;, &quot;ONGOING&quot;, &quot;LAWYER&quot;, &quot;AMAZONIA&quot;, &quot;ADDITION&quot;, &quot;OCCUPIED&quot;, &quot;RATHER&quot;, &quot;FEW&quot;, &quot;GOVERNMENTS&quot;, &quot;DECISION&quot;, &quot;EVENTS&quot;, &quot;FROM&quot;, &quot;NIGHT&quot;, &quot;PUTTING&quot;, &quot;POLE&quot;, &quot;REMOVED&quot;, &quot;SLIGHTLY&quot;, &quot;BLOCK&quot;, &quot;CHAIRMAN&quot;, &quot;INRAVISION&quot;, &quot;DANGEROUS&quot;, &quot;BLOCS&quot;, &quot;CLEARING&quot;, &quot;BATHROOM&quot;, &quot;INJURED&quot;, &quot;WIN&quot;, &quot;COURAGE&quot;, &quot;JAPAN&quot;, &quot;BURNED&quot;, &quot;CALLING&quot;, &quot;RODRIGO&quot;, &quot;TERRITORY&quot;, &quot;LOYALTY&quot;, &quot;FARM&quot;, &quot;CONSOLIDATED&quot;, &quot;LIMON&quot;, &quot;CONTRIBUTION&quot;, &quot;ACHIEVING&quot;, &quot;LOCATION&quot;, &quot;UNFAIR&quot;, &quot;GROUND&quot;, &quot;MILLION&quot;, &quot;SUSPEND&quot;, &quot;D&#39;AUBUISSON&quot;, &quot;LIVED&quot;, &quot;AMMUNITION&quot;, &quot;FINDING&quot;, &quot;TONIGHT&quot;, &quot;PLACES&quot;, &quot;NORTHWEST&quot;, &quot;EXPLOSIVES&quot;, &quot;FOR&quot;, &quot;ATTAIN&quot;, &quot;PARTICULAR&quot;, &quot;INSTITUTIONAL&quot;, &quot;REACTION&quot;, &quot;WHITE&quot;, &quot;OCTOBER&quot;, &quot;URBAN&quot;, &quot;ACTIVITIES&quot;, &quot;PLACED&quot;, &quot;ESTIMATED&quot;, &quot;CIRCLES&quot;, &quot;CARACOL&quot;, &quot;OCT&quot;, &quot;NEGOTIATION&quot;, &quot;SEARCHING&quot;, &quot;AMBUSHES&quot;, &quot;SPOT&quot;, &quot;ATLACATL&quot;, &quot;SEIZING&quot;, &quot;OFF&quot;, &quot;OPPOSITION&quot;, &quot;AMBUSHED&quot;, &quot;CROWDED&quot;, &quot;ASSOCIATED&quot;, &quot;ENGINES&quot;, &quot;5TH&quot;, &quot;CITY&quot;, &quot;LIBERTAD&quot;, &quot;CLAIMING&quot;, &quot;TREATED&quot;, &quot;ALAN&quot;, &quot;COLUMN&quot;, &quot;FRENCH&quot;, &quot;DEFINITELY&quot;, &quot;DEPARTED&quot;, &quot;REPORTS&quot;, &quot;RETURNED&quot;, &quot;GENEVA&quot;, &quot;JANUARY&quot;, &quot;UNIT&quot;, &quot;DISCUSS&quot;, &quot;ASSASSIN&quot;, &quot;GASOLINE&quot;, &quot;BILATERAL&quot;, &quot;READ&quot;, &quot;MAYOR&quot;, &quot;OIL&quot;, &quot;BEHIND&quot;, &quot;SPEAKING&quot;, &quot;STUCK&quot;, &quot;APPARENT&quot;, &quot;CONTAINED&quot;, &quot;HANDS&quot;, &quot;SHARED&quot;, &quot;LIBERAL&quot;, &quot;CHANGE&quot;, &quot;CONFIRM&quot;, &quot;ELECTED&quot;, &quot;COSTS&quot;, &quot;COLOMBIA&quot;, &quot;VISIT&quot;, &quot;ATTACK&quot;, &quot;ELDORADO&quot;, &quot;LEAST&quot;, &quot;OLD&quot;, &quot;OBSERVERS&quot;, &quot;POSITION&quot;, &quot;DISPOSAL&quot;, &quot;RECOVER&quot;, &quot;DEPLORABLE&quot;, &quot;BRAZIL&quot;, &quot;MUNICIPAL&quot;, &quot;CHILEANS&quot;, &quot;ACTS&quot;, &quot;CALM&quot;, &quot;CALI&quot;, &quot;ATTENDED&quot;, &quot;ONE&quot;, &quot;HARASSMENT&quot;, &quot;EDGAR&quot;, &quot;BELONGED&quot;, &quot;VALUABLE&quot;, &quot;BELTRAN&quot;, &quot;HEADS&quot;, &quot;FACILITIES&quot;, &quot;ACCEPTING&quot;, &quot;LEARN&quot;, &quot;...&quot;, &quot;ENTERPRISE&quot;, &quot;REQUEST&quot;, &quot;BASQUE&quot;, &quot;COMMUNIST&quot;, &quot;COMMONLY&quot;, &quot;BEHALF&quot;, &quot;MEDIATORS&quot;, &quot;REVEALS&quot;, &quot;HISTORY&quot;, &quot;CANO&quot;, &quot;CLASS&quot;, &quot;TECHNICAL&quot;, &quot;LINES&quot;, &quot;ACCOUNT&quot;, &quot;BURIED&quot;, &quot;PERNICIOUS&quot;, &quot;SERVED&quot;, &quot;WORKING&quot;, &quot;PRESUMABLY&quot;, &quot;ALLIES&quot;, &quot;NAME&quot;, &quot;VISTA&quot;, &quot;IMPOSED&quot;, &quot;GAS&quot;, &quot;EXPERIENCE&quot;, &quot;WHETHER&quot;, &quot;BOMB&quot;, &quot;ACROSS&quot;, &quot;CONTROL&quot;, &quot;NARINO&quot;, &quot;OFFICIALS&quot;, &quot;POSITIVE&quot;, &quot;GEORGE&quot;, &quot;FBIS&quot;, &quot;WELL-KNOWN&quot;, &quot;SIGNED&quot;, &quot;SALVADORANS&quot;, &quot;LEFT-WING&quot;, &quot;NORTHEAST&quot;, &quot;SERVING&quot;, &quot;APPROACH&quot;, &quot;GREEN&quot;, &quot;POSSESSION&quot;, &quot;UNHARMED&quot;, &quot;URGENT&quot;, &quot;DUTY&quot;, &quot;HITTING&quot;, &quot;MEDELLIN&quot;, &quot;CARS&quot;, &quot;CARD&quot;, &quot;YARD&quot;, &quot;FAILED&quot;, &quot;HOSTED&quot;, &quot;CAST&quot;, &quot;LITTLE&quot;, &quot;OUR&quot;, &quot;GEN&quot;, &quot;CONTAIN&quot;, &quot;GET&quot;, &quot;BRIGADE&quot;, &quot;ADVANCE&quot;, &quot;PERSECUTION&quot;, &quot;SECRET&quot;, &quot;STOLEN&quot;, &quot;REFERENDUM&quot;, &quot;SENATOR&quot;, &quot;MOTIVE&quot;, &quot;BORDERS&quot;, &quot;MORE&quot;, &quot;LIVING&quot;, &quot;LIBERTY&quot;, &quot;OQUELI&quot;, &quot;TRAFFICKER&quot;, &quot;CLANDESTINE&quot;, &quot;AUXILIARY&quot;, &quot;BRIEF&quot;, &quot;0200&quot;, &quot;OWNERS&quot;, &quot;BOTH&quot;, &quot;REGIONAL&quot;, &quot;DIFFERENT&quot;, &quot;TRIED&quot;, &quot;KIND&quot;, &quot;AYUTUXTEPEQUE&quot;, &quot;HEADING&quot;, &quot;GOMEZ&quot;, &quot;TREASURY&quot;, &quot;15-YEAR-OLD&quot;, &quot;SECONDLY&quot;, &quot;CHALATENANGO&quot;, &quot;ADDS&quot;, &quot;HUANCAYO&quot;, &quot;MOVE&quot;, &quot;RESULT&quot;, &quot;ELIANA&quot;, &quot;IMPLEMENTED&quot;, &quot;UNDETERMINED&quot;, &quot;ECUADOR&quot;, &quot;PUNISHMENT&quot;, &quot;BLACK&quot;, &quot;SLATED&quot;, &quot;POLICE&quot;, &quot;CONTINUING&quot;, &quot;METHODS&quot;, &quot;GMT&quot;, &quot;BLINDFOLDED&quot;, &quot;POLICY&quot;, &quot;MAKING&quot;, &quot;NATIONS&quot;, &quot;NATIONALITY&quot;, &quot;FAMILY&quot;, &quot;SURROUNDED&quot;, &quot;FREDDY&quot;, &quot;VICTORIES&quot;, &quot;GOD&quot;, &quot;JOINT&quot;, &quot;BARCO&quot;, &quot;POWER&quot;, &quot;EMBASSY&quot;, &quot;GENTLEMEN&quot;, &quot;DRIVER&quot;, &quot;PAZ&quot;, &quot;NORTH&quot;, &quot;CONSTANTLY&quot;, &quot;RESPONSIBLE&quot;, &quot;STATION&quot;, &quot;TOTALLY&quot;, &quot;BENITO&quot;, &quot;INDEPENDENCE&quot;, &quot;INDIVIDUAL&quot;, &quot;CENTURY&quot;, &quot;STUDENT&quot;, &quot;EXERCISES&quot;, &quot;TERRORISTS&quot;, &quot;MORTARS&quot;, &quot;MEETING&quot;, &quot;KIDNAPPING&quot;, &quot;BOARD&quot;, &quot;JOIN&quot;, &quot;CONTACTED&quot;, &quot;IMAGE&quot;, &quot;FOUNDED&quot;, &quot;INTERIOR&quot;, &quot;WHICH&quot;, &quot;SOUTH&quot;, &quot;DIGNITY&quot;, &quot;6TH&quot;, &quot;AMARU&quot;, &quot;REGION&quot;, &quot;HILDA&quot;, &quot;CONGRESSMEN&quot;, &quot;NARCOTERRORISTS&quot;, &quot;SUBVERSIVE&quot;, &quot;RESCUED&quot;, &quot;PARDON&quot;, &quot;NEWSCAST&quot;, &quot;ENGINEER&quot;, &quot;REITERATED&quot;, &quot;SAYING&quot;, &quot;COUNTERINSURGENCY&quot;, &quot;DEMOBILIZE&quot;, &quot;FACTORS&quot;, &quot;LARGEST&quot;, &quot;INCOME&quot;, &quot;WINDOWS&quot;, &quot;PURPOSE&quot;, &quot;MONTANO&quot;, &quot;INTERVENTION&quot;, &quot;MATERIAL&quot;, &quot;EFFORTS&quot;, &quot;GETTING&quot;, &quot;JORGE&quot;, &quot;ASSEMBLY&quot;, &quot;USELESS&quot;, &quot;WESTERN&quot;, &quot;ALONG&quot;, &quot;RECEIVE&quot;, &quot;BLASTS&quot;, &quot;MODERATION&quot;, &quot;ANALYSTS&quot;, &quot;NEGOTIATE&quot;, &quot;COMMUNITIES&quot;, &quot;SEVERELY&quot;, &quot;SOURCES&quot;, &quot;YSKL&quot;, &quot;CONFESSED&quot;, &quot;STARTED&quot;, &quot;ENJOYING&quot;, &quot;FREEDOM&quot;, &quot;LOGISTICS&quot;, &quot;UNABLE&quot;, &quot;MENTIONING&quot;, &quot;MIDNIGHT&quot;, &quot;ERNESTO&quot;, &quot;UNAWARE&quot;, &quot;CENTER&quot;, &quot;NEEDS&quot;, &quot;CALMLY&quot;, &quot;ATTACKED&quot;, &quot;SONORA&quot;, &quot;CONFISCATED&quot;, &quot;HILL&quot;, &quot;VAST&quot;, &quot;FACTOR&quot;, &quot;STREET&quot;, &quot;PREVENT&quot;, &quot;JOSE&quot;, &quot;HAS&quot;, &quot;POSITIVELY&quot;, &quot;PAYING&quot;, &quot;CONTINUES&quot;, &quot;TARGET&quot;, &quot;WANTED&quot;, &quot;QUANTITY&quot;, &quot;GREETINGS&quot;, &quot;DELEGATION&quot;, &quot;REPORTERS&quot;, &quot;SEVERAL&quot;, &quot;FENASTRAS&quot;, &quot;SOUTHERN&quot;, &quot;SPECIFIC&quot;, &quot;CONGRESSMAN&quot;, &quot;YES&quot;, &quot;CHARGES&quot;, &quot;PEACE&quot;, &quot;PANIC&quot;, &quot;CAMPUS&quot;, &quot;BRAVELY&quot;, &quot;HOMILY&quot;, &quot;HER&quot;, &quot;REPUBLICA&quot;, &quot;INAUGURATION&quot;, &quot;ACTUALLY&quot;, &quot;RESUMPTION&quot;, &quot;MPSC&quot;, &quot;SATURDAY&quot;, &quot;FORTUNATELY&quot;, &quot;INDICATES&quot;, &quot;TELEPHONE&quot;, &quot;GALLONS&quot;, &quot;GOAL&quot;, &quot;STRENGTHEN&quot;, &quot;WITHOUT&quot;, &quot;FATHERLAND&quot;, &quot;KEEPING&quot;, &quot;SMUGGLING&quot;, &quot;FLAG&quot;, &quot;OCCUPY&quot;, &quot;0300&quot;, &quot;SPREAD&quot;, &quot;CAMPAIGN&quot;, &quot;COWARDLY&quot;, &quot;SITE&quot;, &quot;FAILURE&quot;, &quot;HIT&quot;, &quot;INTERVENE&quot;, &quot;VERSION&quot;, &quot;NEARBY&quot;, &quot;LEAD&quot;, &quot;STICKS&quot;, &quot;STRICTLY&quot;, &quot;SUPPORT&quot;, &quot;DENSELY&quot;, &quot;ARMING&quot;, &quot;GUARDS&quot;, &quot;ESCOBAR&quot;, &quot;SHAKEN&quot;, &quot;CONDUCTED&quot;, &quot;COMMENTING&quot;, &quot;SIGNING&quot;, &quot;BRAVO&quot;, &quot;SUNDAY&quot;, &quot;INDISCRIMINATE&quot;, &quot;GRENADES&quot;, &quot;JOURNALISTS&quot;, &quot;PENTAGON&quot;, &quot;SAID&quot;, &quot;MERELY&quot;, &quot;WEEK&quot;, &quot;FORMS&quot;, &quot;THROUGHOUT&quot;, &quot;TRUCKS&quot;, &quot;WHILE&quot;, &quot;UNDERSTANDING&quot;, &quot;ENTERPRISES&quot;, &quot;SURPRISE&quot;, &quot;YESTERDAY&quot;, &quot;EVERYBODY&quot;, &quot;MURDERER&quot;, &quot;SAKE&quot;, &quot;HALF&quot;, &quot;COMING&quot;, &quot;REGRETTED&quot;, &quot;SIMULTANEOUS&quot;, &quot;LEFT&quot;, &quot;REFERS&quot;, &quot;RELEASE&quot;, &quot;ATMOSPHERE&quot;, &quot;HOY&quot;, &quot;SAME&quot;, &quot;DETERMINED&quot;, &quot;COVER&quot;, &quot;CHANGED&quot;, &quot;STRIKES&quot;, &quot;NARCOTICS&quot;, &quot;HAND&quot;, &quot;SMALL&quot;, &quot;TURN&quot;, &quot;KILLED&quot;, &quot;REACTIONS&quot;, &quot;2100&quot;, &quot;CENTENO&quot;, &quot;MARTA&quot;, &quot;NATURE&quot;, &quot;OFFICE&quot;, &quot;ELIMINATE&quot;, &quot;RELIGIOUS&quot;, &quot;RALLIES&quot;, &quot;REPRESSION&quot;, &quot;AUTONOMOUS&quot;, &quot;CAPTURE&quot;, &quot;TANDONA&quot;, &quot;LIGHT&quot;, &quot;NACIONAL&quot;, &quot;PATRICIA&quot;, &quot;GONE&quot;, &quot;FLMN&quot;, &quot;MOVEMENT&quot;, &quot;ACTIVELY&quot;, &quot;POINTED&quot;, &quot;WELL&quot;, &quot;YOUNG&quot;, &quot;WAGED&quot;, &quot;ROOM&quot;, &quot;EVERY&quot;, &quot;COLOMBIAN&quot;, &quot;ENFORCEMENT&quot;, &quot;ESTRADA&quot;, &quot;COUNTERATTACK&quot;, &quot;AGREE&quot;, &quot;LEON&quot;, &quot;WENT&quot;, &quot;ARRIVE&quot;, &quot;MATTERS&quot;, &quot;MONSIGNOR&quot;, &quot;COMMENT&quot;, &quot;CONFERENCE&quot;, &quot;RIDICULOUS&quot;, &quot;FIRST&quot;, &quot;ROSA&quot;, &quot;INSURRECTION&quot;, &quot;DESTROYED&quot;, &quot;NORMAL&quot;, &quot;LEGISLATIVE&quot;, &quot;IDENTIFY&quot;, &quot;DOORS&quot;, &quot;DETAILS&quot;, &quot;WEST&quot;, &quot;FUEL&quot;, &quot;VISITED&quot;, &quot;PROVOKED&quot;, &quot;WERE&quot;, &quot;SOLDIERS&quot;, &quot;BELONG&quot;, &quot;NEGATIVE&quot;, &quot;JANEIRO&quot;, &quot;LOCATED&quot;, &quot;PERSONS&quot;, &quot;LEAFLETS&quot;, &quot;ACCOMPLICES&quot;, &quot;PARATROOPERS&quot;, &quot;BELIEVED&quot;, &quot;ZACAMIL&quot;, &quot;RIGHTIST&quot;, &quot;MANEUVER&quot;, &quot;ASSISTANT&quot;, &quot;ROSALES&quot;, &quot;PRO-CASTROITE&quot;, &quot;CONCLUDED&quot;, &quot;INCREASE&quot;, &quot;TOWNSHIP&quot;, &quot;CATAPULTS&quot;, &quot;KNOWLEDGE&quot;, &quot;NORTHEASTERN&quot;, &quot;PREPARING&quot;, &quot;HELPING&quot;, &quot;EXPLOSIVE&quot;, &quot;WITHDRAWN&quot;, &quot;BOLIVAR&quot;, &quot;GROUP&quot;, &quot;DOES&quot;, &quot;ASSAULT&quot;, &quot;ALTHOUGH&quot;, &quot;DELGADO&quot;, &quot;SOYAPANGO&quot;, &quot;CONTROLS&quot;, &quot;CAPTURED&quot;, &quot;THREATS&quot;, &quot;BRITISH&quot;, &quot;TEAM&quot;, &quot;UNION&quot;, &quot;COMMANDOS&quot;, &quot;PACKAGE&quot;, &quot;CORRESPONDENT&quot;, &quot;THESE&quot;, &quot;DIEGO&quot;, &quot;FULL&quot;, &quot;DEALT&quot;, &quot;CIVILIZED&quot;, &quot;TAIWAN&quot;, &quot;BLAME&quot;, &quot;PETITION&quot;, &quot;SURROUNDING&quot;, &quot;HAPPY&quot;, &quot;EXPECT&quot;, &quot;SECTOR&quot;, &quot;MOUNTAINOUS&quot;, &quot;UNDERWAY&quot;, &quot;PERSONNEL&quot;, &quot;FILLED&quot;, &quot;INSURGENT&quot;, &quot;SANTANDER&quot;, &quot;MONITORING&quot;, &quot;VICTIMS&quot;, &quot;CAUSED&quot;, &quot;CORRUPTION&quot;, &quot;INDUSTRIALIZED&quot;, &quot;BODYGUARD&quot;, &quot;EXCHANGE&quot;, &quot;FIRES&quot;, &quot;BATTALIONS&quot;, &quot;LEADING&quot;, &quot;SOLUTIONS&quot;, &quot;RESIDENTIAL&quot;, &quot;SYMBOL&quot;, &quot;SIERRA&quot;, &quot;ARMORED&quot;, &quot;CAUSES&quot;, &quot;FUSE&quot;, &quot;REMAINED&quot;, &quot;PRINCIPLE&quot;, &quot;MANUEL&quot;, &quot;ESCALATION&quot;, &quot;DECIDED&quot;, &quot;PRELIMINARY&quot;, &quot;NAMED&quot;, &quot;ZONE&quot;, &quot;UNITY&quot;, &quot;POWERFUL&quot;, &quot;CONFRONTING&quot;, &quot;YOURS&quot;, &quot;INCLUDING&quot;, &quot;UNITS&quot;, &quot;MOVING&quot;, &quot;DIFFICULT&quot;, &quot;ACCEPT&quot;, &quot;RESTRICTED&quot;, &quot;BUILDING&quot;, &quot;FIRMLY&quot;, &quot;EAST&quot;, &quot;DETERMINE&quot;, &quot;PEDRO&quot;, &quot;REVEALED&quot;, &quot;UNFAVORABLE&quot;, &quot;DECEMBER&quot;, &quot;CLAIMED&quot;, &quot;CANAL&quot;, &quot;COMPLETELY&quot;, &quot;COUNTRIES&quot;, &quot;UNIFORM&quot;, &quot;TECLA&quot;, &quot;CANAS&quot;, &quot;HEART&quot;, &quot;EMPLOYEES&quot;, &quot;SOMETHING&quot;, &quot;PAST&quot;, &quot;RCN&quot;, &quot;ANDRES&quot;, &quot;TURBAY&quot;, &quot;AGREEMENTS&quot;, &quot;REITERATE&quot;, &quot;DISTRICT&quot;, &quot;BEGAN&quot;, &quot;DAUGHTER&quot;, &quot;SIMON&quot;, &quot;RED&quot;, &quot;250,000&quot;, &quot;ACT&quot;, &quot;MINE&quot;, &quot;DOWN&quot;, &quot;INFORMED&quot;, &quot;UNREST&quot;, &quot;FOUND&quot;, &quot;ENERGY&quot;, &quot;CONSERVATIVE&quot;, &quot;EARLY&quot;, &quot;8TH&quot;, &quot;SQUAD&quot;, &quot;AK-47&quot;, &quot;HEAVY&quot;, &quot;APPROPRIATE&quot;, &quot;GUATEMALA&quot;, &quot;FOREIGNER&quot;, &quot;SPILL&quot;, &quot;PRESERVE&quot;, &quot;SANTIAGO&quot;, &quot;AFP&quot;, &quot;DOCUMENTS&quot;, &quot;LABORATORIES&quot;, &quot;SOVIET&quot;, &quot;VALLE&quot;, &quot;CONDUCTING&quot;, &quot;AGO&quot;, &quot;NORMALIZED&quot;, &quot;OTHERS&quot;, &quot;RIO&quot;, &quot;BACK&quot;, &quot;TELEPHONES&quot;, &quot;PROTEST&quot;, &quot;RECEIVING&quot;, &quot;TEXT&quot;, &quot;ALMOST&quot;, &quot;LEFTIST&quot;, &quot;NATIONAL&quot;, &quot;AIM&quot;, &quot;FORCED&quot;, &quot;TRAIN&quot;, &quot;BORDER&quot;, &quot;VALDIVIESO&quot;, &quot;PARLIAMENT&quot;, &quot;ANNOUNCED&quot;, &quot;SANDINO&quot;, &quot;POSSIBILITY&quot;, &quot;TOWERS&quot;, &quot;METERS&quot;, &quot;PRAVDA&quot;, &quot;REVOLUTIONARY&quot;, &quot;ESCALON&quot;, &quot;COVERING&quot;, &quot;ANYWHERE&quot;, &quot;SUBVERSIVES&quot;, &quot;CONVERSATIONS&quot;, &quot;DENYING&quot;, &quot;PUNISH&quot;, &quot;ALIAS&quot;, &quot;VIOLATED&quot;, &quot;MINUTE&quot;, &quot;MAIN&quot;, &quot;OUTLAWED&quot;, &quot;PRICE&quot;, &quot;TELAM&quot;, &quot;GILDA&quot;, &quot;MARTINEZ&quot;, &quot;ROUND&quot;, &quot;INITIAL&quot;, &quot;ANY&quot;, &quot;BARONS&quot;, &quot;PAPER&quot;, &quot;DOWNTOWN&quot;, &quot;100&quot;, &quot;PROPAGANDA&quot;, &quot;103&quot;, &quot;REDUCTION&quot;, &quot;JAN&quot;, &quot;ENABLED&quot;, &quot;WEAPONS&quot;, &quot;OWNED&quot;, &quot;COUNTERPART&quot;, &quot;MEDIATOR&quot;, &quot;EXCERPTS&quot;, &quot;MORMON&quot;, &quot;CONSIDERATION&quot;, &quot;INCLUDE&quot;, &quot;PRIOR&quot;, &quot;PALACE&quot;, &quot;PARKED&quot;, &quot;OBTAIN&quot;, &quot;DECREED&quot;, &quot;SPECIFY&quot;, &quot;CONVERGENCE&quot;, &quot;BAKER&quot;, &quot;FELL&quot;, &quot;OSVALDO&quot;, &quot;BELLOSO&quot;, &quot;REPRESENT&quot;, &quot;OPEN&quot;, &quot;MARCO&quot;, &quot;EXPLOSIONS&quot;, &quot;MARCH&quot;, &quot;LUISA&quot;, &quot;FACED&quot;, &quot;ROUTE&quot;, &quot;DIFFERENTLY&quot;, &quot;PERUVIANS&quot;, &quot;150&quot;, &quot;CARRIERS&quot;, &quot;VICINITY&quot;, &quot;BROKEN&quot;, &quot;GUERILLAS&quot;, &quot;CHIEFS&quot;, &quot;PROTECTION&quot;, &quot;PROPERTY&quot;, &quot;FELT&quot;, &quot;GUARANTEES&quot;, &quot;RIFLES&quot;, &quot;SLOWLY&quot;, &quot;DYNAMITE&quot;, &quot;LOOK&quot;, &quot;MARIO&quot;, &quot;VIOLATE&quot;, &quot;OPERATIONS&quot;, &quot;CONFRONTATION&quot;, &quot;PROTECTING&quot;, &quot;MASK&quot;, &quot;ADOPTED&quot;, &quot;0500&quot;, &quot;ARTILLERY&quot;, &quot;EXECUTIVE&quot;, &quot;CITIZEN&quot;, &quot;STEP&quot;, &quot;FEDERAL&quot;, &quot;SOACHA&quot;, &quot;MARK&quot;, &quot;MRTA&quot;, &quot;SECURE&quot;, &quot;PRESIDENCY&quot;, &quot;INTELLIGENCE&quot;, &quot;NICARAGUA&quot;, &quot;WORD&quot;, &quot;SQUARE&quot;, &quot;HURTING&quot;, &quot;UNDERTAKEN&quot;, &quot;GRADUATING&quot;, &quot;DIARIO&quot;, &quot;LOSE&quot;, &quot;SO-CALLED&quot;, &quot;ITALIAN&quot;, &quot;LOTS&quot;, &quot;PUPPET&quot;, &quot;BENJAMIN&quot;, &quot;RADIO&quot;, &quot;DEVICES&quot;, &quot;MEXICAN&quot;, &quot;SPECIAL&quot;, &quot;HEADQUARTERS&quot;, &quot;MAZA&quot;, &quot;SERIOUSLY&quot;, &quot;INFANTRY&quot;, &quot;FIGHTING&quot;, &quot;JUNIOR&quot;, &quot;NOTIMEX&quot;, &quot;DECREES&quot;, &quot;SAN&quot;, &quot;FESTIVITIES&quot;, &quot;SAW&quot;, &quot;BASIC&quot;, &quot;RESERVATIONS&quot;, &quot;BASIN&quot;, &quot;6-HOUR&quot;, &quot;BASIS&quot;, &quot;GROUNDS&quot;, &quot;UNIDENTIFIED&quot;, &quot;FRUIT&quot;, &quot;NECESSARILY&quot;, &quot;LEGALLY&quot;, &quot;GENERATE&quot;, &quot;CIVILIAN&quot;, &quot;THEMSELVES&quot;));</td>
      </tr>
      <tr>
        <td id="L111" class="blob-num js-line-number" data-line-number="111"></td>
        <td id="LC111" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L112" class="blob-num js-line-number" data-line-number="112"></td>
        <td id="LC112" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">private</span> <span class="pl-k">static</span> <span class="pl-k">AbstractSequenceClassifier&lt;<span class="pl-smi">CoreLabel</span>&gt;</span> classifier <span class="pl-k">=</span> <span class="pl-c1">null</span>;</td>
      </tr>
      <tr>
        <td id="L113" class="blob-num js-line-number" data-line-number="113"></td>
        <td id="LC113" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L114" class="blob-num js-line-number" data-line-number="114"></td>
        <td id="LC114" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">public</span> <span class="pl-k">static</span> <span class="pl-k">void</span> <span class="pl-en">main</span>(<span class="pl-k">String</span>[] <span class="pl-v">args</span>) {</td>
      </tr>
      <tr>
        <td id="L115" class="blob-num js-line-number" data-line-number="115"></td>
        <td id="LC115" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L116" class="blob-num js-line-number" data-line-number="116"></td>
        <td id="LC116" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L117" class="blob-num js-line-number" data-line-number="117"></td>
        <td id="LC117" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L118" class="blob-num js-line-number" data-line-number="118"></td>
        <td id="LC118" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L119" class="blob-num js-line-number" data-line-number="119"></td>
        <td id="LC119" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L120" class="blob-num js-line-number" data-line-number="120"></td>
        <td id="LC120" class="blob-code blob-code-inner js-file-line">		<span class="pl-k">try</span> {</td>
      </tr>
      <tr>
        <td id="L121" class="blob-num js-line-number" data-line-number="121"></td>
        <td id="LC121" class="blob-code blob-code-inner js-file-line">			 <span class="pl-smi">FileInputStream</span> in_file <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">FileInputStream</span>(<span class="pl-s"><span class="pl-pds">&quot;</span>./dict.ser<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L122" class="blob-num js-line-number" data-line-number="122"></td>
        <td id="LC122" class="blob-code blob-code-inner js-file-line">			 <span class="pl-smi">ObjectInputStream</span> in <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">ObjectInputStream</span>(in_file);</td>
      </tr>
      <tr>
        <td id="L123" class="blob-num js-line-number" data-line-number="123"></td>
        <td id="LC123" class="blob-code blob-code-inner js-file-line">			 dict <span class="pl-k">=</span> (<span class="pl-k">HashMap&lt;<span class="pl-smi">String</span>, <span class="pl-smi">Integer</span>&gt;</span>) in<span class="pl-k">.</span>readObject();</td>
      </tr>
      <tr>
        <td id="L124" class="blob-num js-line-number" data-line-number="124"></td>
        <td id="LC124" class="blob-code blob-code-inner js-file-line">			 in<span class="pl-k">.</span>close();</td>
      </tr>
      <tr>
        <td id="L125" class="blob-num js-line-number" data-line-number="125"></td>
        <td id="LC125" class="blob-code blob-code-inner js-file-line">			 in_file<span class="pl-k">.</span>close();</td>
      </tr>
      <tr>
        <td id="L126" class="blob-num js-line-number" data-line-number="126"></td>
        <td id="LC126" class="blob-code blob-code-inner js-file-line"><span class="pl-c"><span class="pl-c">/*</span></span></td>
      </tr>
      <tr>
        <td id="L127" class="blob-num js-line-number" data-line-number="127"></td>
        <td id="LC127" class="blob-code blob-code-inner js-file-line"><span class="pl-c">			 in_file = new FileInputStream(&quot;./sentence_probs_adv/prob_vic_adv.ser&quot;);</span></td>
      </tr>
      <tr>
        <td id="L128" class="blob-num js-line-number" data-line-number="128"></td>
        <td id="LC128" class="blob-code blob-code-inner js-file-line"><span class="pl-c">			 in = new ObjectInputStream(in_file);</span></td>
      </tr>
      <tr>
        <td id="L129" class="blob-num js-line-number" data-line-number="129"></td>
        <td id="LC129" class="blob-code blob-code-inner js-file-line"><span class="pl-c">			 dict = (HashMap&lt;String, Integer&gt;) in.readObject();</span></td>
      </tr>
      <tr>
        <td id="L130" class="blob-num js-line-number" data-line-number="130"></td>
        <td id="LC130" class="blob-code blob-code-inner js-file-line"><span class="pl-c">			 in.close();</span></td>
      </tr>
      <tr>
        <td id="L131" class="blob-num js-line-number" data-line-number="131"></td>
        <td id="LC131" class="blob-code blob-code-inner js-file-line"><span class="pl-c">			 in_file.close();</span></td>
      </tr>
      <tr>
        <td id="L132" class="blob-num js-line-number" data-line-number="132"></td>
        <td id="LC132" class="blob-code blob-code-inner js-file-line"><span class="pl-c"><span class="pl-c">*/</span></span></td>
      </tr>
      <tr>
        <td id="L133" class="blob-num js-line-number" data-line-number="133"></td>
        <td id="LC133" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L134" class="blob-num js-line-number" data-line-number="134"></td>
        <td id="LC134" class="blob-code blob-code-inner js-file-line">			 classifier<span class="pl-k">=</span><span class="pl-smi">CRFClassifier</span><span class="pl-k">.</span>getClassifier(<span class="pl-s"><span class="pl-pds">&quot;</span>./english.all.3class.distsim.crf.ser.gz<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L135" class="blob-num js-line-number" data-line-number="135"></td>
        <td id="LC135" class="blob-code blob-code-inner js-file-line">		} <span class="pl-k">catch</span> (<span class="pl-smi">IOException</span> e) {</td>
      </tr>
      <tr>
        <td id="L136" class="blob-num js-line-number" data-line-number="136"></td>
        <td id="LC136" class="blob-code blob-code-inner js-file-line">			 e<span class="pl-k">.</span>printStackTrace();</td>
      </tr>
      <tr>
        <td id="L137" class="blob-num js-line-number" data-line-number="137"></td>
        <td id="LC137" class="blob-code blob-code-inner js-file-line">			 <span class="pl-k">return</span>;</td>
      </tr>
      <tr>
        <td id="L138" class="blob-num js-line-number" data-line-number="138"></td>
        <td id="LC138" class="blob-code blob-code-inner js-file-line">		} <span class="pl-k">catch</span> (<span class="pl-smi">ClassNotFoundException</span> e) {</td>
      </tr>
      <tr>
        <td id="L139" class="blob-num js-line-number" data-line-number="139"></td>
        <td id="LC139" class="blob-code blob-code-inner js-file-line">			 <span class="pl-k">return</span>;</td>
      </tr>
      <tr>
        <td id="L140" class="blob-num js-line-number" data-line-number="140"></td>
        <td id="LC140" class="blob-code blob-code-inner js-file-line">		}</td>
      </tr>
      <tr>
        <td id="L141" class="blob-num js-line-number" data-line-number="141"></td>
        <td id="LC141" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L142" class="blob-num js-line-number" data-line-number="142"></td>
        <td id="LC142" class="blob-code blob-code-inner js-file-line">		<span class="pl-smi">Scanner</span> input_scanner <span class="pl-k">=</span> <span class="pl-c1">null</span>;</td>
      </tr>
      <tr>
        <td id="L143" class="blob-num js-line-number" data-line-number="143"></td>
        <td id="LC143" class="blob-code blob-code-inner js-file-line">    <span class="pl-smi">Scanner</span> ans_scanner <span class="pl-k">=</span> <span class="pl-c1">null</span>;</td>
      </tr>
      <tr>
        <td id="L144" class="blob-num js-line-number" data-line-number="144"></td>
        <td id="LC144" class="blob-code blob-code-inner js-file-line">		<span class="pl-smi">PrintWriter</span>  writer <span class="pl-k">=</span> <span class="pl-c1">null</span>;</td>
      </tr>
      <tr>
        <td id="L145" class="blob-num js-line-number" data-line-number="145"></td>
        <td id="LC145" class="blob-code blob-code-inner js-file-line">		<span class="pl-c"><span class="pl-c">//</span>try {input_scanner = new Scanner(new File(args[0]));}</span></td>
      </tr>
      <tr>
        <td id="L146" class="blob-num js-line-number" data-line-number="146"></td>
        <td id="LC146" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L147" class="blob-num js-line-number" data-line-number="147"></td>
        <td id="LC147" class="blob-code blob-code-inner js-file-line"><span class="pl-c"><span class="pl-c">/*</span></span></td>
      </tr>
      <tr>
        <td id="L148" class="blob-num js-line-number" data-line-number="148"></td>
        <td id="LC148" class="blob-code blob-code-inner js-file-line"><span class="pl-c">		ArrayList&lt;ArrayList&lt;ArrayList &lt;Word&gt; &gt; &gt; articles=new ArrayList&lt;ArrayList&lt;ArrayList&lt;Word &gt; &gt; &gt;();</span></td>
      </tr>
      <tr>
        <td id="L149" class="blob-num js-line-number" data-line-number="149"></td>
        <td id="LC149" class="blob-code blob-code-inner js-file-line"><span class="pl-c">		ArrayList&lt;ArrayList&lt;String[]&gt; &gt; art_ans_weapon=new ArrayList&lt;ArrayList&lt;String[]&gt; &gt;();//2</span></td>
      </tr>
      <tr>
        <td id="L150" class="blob-num js-line-number" data-line-number="150"></td>
        <td id="LC150" class="blob-code blob-code-inner js-file-line"><span class="pl-c">		ArrayList&lt;ArrayList&lt;String[]&gt; &gt; art_ans_indv=new ArrayList&lt;ArrayList&lt;String[]&gt; &gt;();//3</span></td>
      </tr>
      <tr>
        <td id="L151" class="blob-num js-line-number" data-line-number="151"></td>
        <td id="LC151" class="blob-code blob-code-inner js-file-line"><span class="pl-c">		ArrayList&lt;ArrayList&lt;String[]&gt; &gt; art_ans_org=new ArrayList&lt;ArrayList&lt;String[]&gt; &gt;();//4</span></td>
      </tr>
      <tr>
        <td id="L152" class="blob-num js-line-number" data-line-number="152"></td>
        <td id="LC152" class="blob-code blob-code-inner js-file-line"><span class="pl-c">		ArrayList&lt;ArrayList&lt;String[]&gt; &gt; art_ans_tar=new ArrayList&lt;ArrayList&lt;String[]&gt; &gt;();//5</span></td>
      </tr>
      <tr>
        <td id="L153" class="blob-num js-line-number" data-line-number="153"></td>
        <td id="LC153" class="blob-code blob-code-inner js-file-line"><span class="pl-c">		ArrayList&lt;ArrayList&lt;String[]&gt; &gt; art_ans_vic=new ArrayList&lt;ArrayList&lt;String[]&gt; &gt;();//6</span></td>
      </tr>
      <tr>
        <td id="L154" class="blob-num js-line-number" data-line-number="154"></td>
        <td id="LC154" class="blob-code blob-code-inner js-file-line"><span class="pl-c">		<span class="pl-c">*/</span></span></td>
      </tr>
      <tr>
        <td id="L155" class="blob-num js-line-number" data-line-number="155"></td>
        <td id="LC155" class="blob-code blob-code-inner js-file-line">		<span class="pl-k">try</span> {</td>
      </tr>
      <tr>
        <td id="L156" class="blob-num js-line-number" data-line-number="156"></td>
        <td id="LC156" class="blob-code blob-code-inner js-file-line">			<span class="pl-c"><span class="pl-c">//</span>input_scanner = new Scanner(new File(&quot;input.txt&quot;));</span></td>
      </tr>
      <tr>
        <td id="L157" class="blob-num js-line-number" data-line-number="157"></td>
        <td id="LC157" class="blob-code blob-code-inner js-file-line">  		<span class="pl-c"><span class="pl-c">//</span>ans_scanner = new Scanner(new File(&quot;output.txt&quot;));</span></td>
      </tr>
      <tr>
        <td id="L158" class="blob-num js-line-number" data-line-number="158"></td>
        <td id="LC158" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L159" class="blob-num js-line-number" data-line-number="159"></td>
        <td id="LC159" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L160" class="blob-num js-line-number" data-line-number="160"></td>
        <td id="LC160" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L161" class="blob-num js-line-number" data-line-number="161"></td>
        <td id="LC161" class="blob-code blob-code-inner js-file-line">			<span class="pl-c"><span class="pl-c">//</span>input_scanner = new Scanner(new File(&quot;testset1-input.txt&quot;));</span></td>
      </tr>
      <tr>
        <td id="L162" class="blob-num js-line-number" data-line-number="162"></td>
        <td id="LC162" class="blob-code blob-code-inner js-file-line">      <span class="pl-c"><span class="pl-c">//</span>ans_scanner = new Scanner(new File(&quot;testset1-anskeys.txt&quot;));</span></td>
      </tr>
      <tr>
        <td id="L163" class="blob-num js-line-number" data-line-number="163"></td>
        <td id="LC163" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L164" class="blob-num js-line-number" data-line-number="164"></td>
        <td id="LC164" class="blob-code blob-code-inner js-file-line">			input_scanner <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">Scanner</span>(<span class="pl-k">new</span> <span class="pl-smi">File</span>(<span class="pl-s"><span class="pl-pds">&quot;</span>DEV_ALL<span class="pl-pds">&quot;</span></span>));</td>
      </tr>
      <tr>
        <td id="L165" class="blob-num js-line-number" data-line-number="165"></td>
        <td id="LC165" class="blob-code blob-code-inner js-file-line">      ans_scanner <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">Scanner</span>(<span class="pl-k">new</span> <span class="pl-smi">File</span>(<span class="pl-s"><span class="pl-pds">&quot;</span>ANS_ALL<span class="pl-pds">&quot;</span></span>));</td>
      </tr>
      <tr>
        <td id="L166" class="blob-num js-line-number" data-line-number="166"></td>
        <td id="LC166" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L167" class="blob-num js-line-number" data-line-number="167"></td>
        <td id="LC167" class="blob-code blob-code-inner js-file-line">			<span class="pl-c"><span class="pl-c">//</span>writer = new PrintWriter(&quot;input.txt.template&quot;);</span></td>
      </tr>
      <tr>
        <td id="L168" class="blob-num js-line-number" data-line-number="168"></td>
        <td id="LC168" class="blob-code blob-code-inner js-file-line">		}</td>
      </tr>
      <tr>
        <td id="L169" class="blob-num js-line-number" data-line-number="169"></td>
        <td id="LC169" class="blob-code blob-code-inner js-file-line">		<span class="pl-k">catch</span> (<span class="pl-smi">FileNotFoundException</span> e) {e<span class="pl-k">.</span>printStackTrace();}</td>
      </tr>
      <tr>
        <td id="L170" class="blob-num js-line-number" data-line-number="170"></td>
        <td id="LC170" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L171" class="blob-num js-line-number" data-line-number="171"></td>
        <td id="LC171" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L172" class="blob-num js-line-number" data-line-number="172"></td>
        <td id="LC172" class="blob-code blob-code-inner js-file-line">		<span class="pl-smi">MaxentTagger</span> tagger <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">MaxentTagger</span>(<span class="pl-s"><span class="pl-pds">&quot;</span>./english-left3words-distsim.tagger<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L173" class="blob-num js-line-number" data-line-number="173"></td>
        <td id="LC173" class="blob-code blob-code-inner js-file-line">		<span class="pl-smi">LexicalizedParser</span> parsnip <span class="pl-k">=</span> <span class="pl-smi">LexicalizedParser</span><span class="pl-k">.</span>loadModel(<span class="pl-s"><span class="pl-pds">&quot;</span>englishPCFG.ser<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L174" class="blob-num js-line-number" data-line-number="174"></td>
        <td id="LC174" class="blob-code blob-code-inner js-file-line">		<span class="pl-smi">Properties</span> props <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">Properties</span>();</td>
      </tr>
      <tr>
        <td id="L175" class="blob-num js-line-number" data-line-number="175"></td>
        <td id="LC175" class="blob-code blob-code-inner js-file-line">		props<span class="pl-k">.</span>put(<span class="pl-s"><span class="pl-pds">&quot;</span>annotators<span class="pl-pds">&quot;</span></span>, <span class="pl-s"><span class="pl-pds">&quot;</span>tokenize, ssplit, truecase<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L176" class="blob-num js-line-number" data-line-number="176"></td>
        <td id="LC176" class="blob-code blob-code-inner js-file-line">		<span class="pl-smi">StanfordCoreNLP</span> pipeline <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">StanfordCoreNLP</span>(props);</td>
      </tr>
      <tr>
        <td id="L177" class="blob-num js-line-number" data-line-number="177"></td>
        <td id="LC177" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L178" class="blob-num js-line-number" data-line-number="178"></td>
        <td id="LC178" class="blob-code blob-code-inner js-file-line">		<span class="pl-c"><span class="pl-c">//</span> Go through all articles</span></td>
      </tr>
      <tr>
        <td id="L179" class="blob-num js-line-number" data-line-number="179"></td>
        <td id="LC179" class="blob-code blob-code-inner js-file-line">		<span class="pl-smi">String</span> next_article_name <span class="pl-k">=</span> <span class="pl-s"><span class="pl-pds">&quot;</span><span class="pl-pds">&quot;</span></span>;</td>
      </tr>
      <tr>
        <td id="L180" class="blob-num js-line-number" data-line-number="180"></td>
        <td id="LC180" class="blob-code blob-code-inner js-file-line">		<span class="pl-smi">String</span> current_article_name <span class="pl-k">=</span> <span class="pl-s"><span class="pl-pds">&quot;</span><span class="pl-pds">&quot;</span></span>;</td>
      </tr>
      <tr>
        <td id="L181" class="blob-num js-line-number" data-line-number="181"></td>
        <td id="LC181" class="blob-code blob-code-inner js-file-line">		<span class="pl-k">boolean</span> done_with_stuff<span class="pl-k">=</span><span class="pl-c1">false</span>;</td>
      </tr>
      <tr>
        <td id="L182" class="blob-num js-line-number" data-line-number="182"></td>
        <td id="LC182" class="blob-code blob-code-inner js-file-line">		<span class="pl-k">while</span>(<span class="pl-k">!</span>done_with_stuff){</td>
      </tr>
      <tr>
        <td id="L183" class="blob-num js-line-number" data-line-number="183"></td>
        <td id="LC183" class="blob-code blob-code-inner js-file-line">			<span class="pl-smi">String</span> the_article<span class="pl-k">=</span><span class="pl-s"><span class="pl-pds">&quot;</span><span class="pl-pds">&quot;</span></span>;</td>
      </tr>
      <tr>
        <td id="L184" class="blob-num js-line-number" data-line-number="184"></td>
        <td id="LC184" class="blob-code blob-code-inner js-file-line">			<span class="pl-k">boolean</span> next_article_found<span class="pl-k">=</span><span class="pl-c1">false</span>;</td>
      </tr>
      <tr>
        <td id="L185" class="blob-num js-line-number" data-line-number="185"></td>
        <td id="LC185" class="blob-code blob-code-inner js-file-line">			<span class="pl-k">while</span>(input_scanner<span class="pl-k">.</span>hasNextLine() <span class="pl-k">&amp;&amp;!</span> next_article_found){</td>
      </tr>
      <tr>
        <td id="L186" class="blob-num js-line-number" data-line-number="186"></td>
        <td id="LC186" class="blob-code blob-code-inner js-file-line">				<span class="pl-smi">String</span> next_line <span class="pl-k">=</span> input_scanner<span class="pl-k">.</span>nextLine();</td>
      </tr>
      <tr>
        <td id="L187" class="blob-num js-line-number" data-line-number="187"></td>
        <td id="LC187" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L188" class="blob-num js-line-number" data-line-number="188"></td>
        <td id="LC188" class="blob-code blob-code-inner js-file-line">				<span class="pl-k">if</span>(next_line<span class="pl-k">.</span>matches(<span class="pl-s"><span class="pl-pds">&quot;</span>(DEV-MUC3-[0-9]{4}.*)|(TST1-MUC3-[0-9]{4}.*)|(TST2-MUC4-[0-9]{4}.*)<span class="pl-pds">&quot;</span></span>)){</td>
      </tr>
      <tr>
        <td id="L189" class="blob-num js-line-number" data-line-number="189"></td>
        <td id="LC189" class="blob-code blob-code-inner js-file-line">					next_article_found<span class="pl-k">=</span><span class="pl-c1">true</span>;</td>
      </tr>
      <tr>
        <td id="L190" class="blob-num js-line-number" data-line-number="190"></td>
        <td id="LC190" class="blob-code blob-code-inner js-file-line">					current_article_name <span class="pl-k">=</span> next_article_name;</td>
      </tr>
      <tr>
        <td id="L191" class="blob-num js-line-number" data-line-number="191"></td>
        <td id="LC191" class="blob-code blob-code-inner js-file-line">					next_article_name <span class="pl-k">=</span> next_line;</td>
      </tr>
      <tr>
        <td id="L192" class="blob-num js-line-number" data-line-number="192"></td>
        <td id="LC192" class="blob-code blob-code-inner js-file-line">				}</td>
      </tr>
      <tr>
        <td id="L193" class="blob-num js-line-number" data-line-number="193"></td>
        <td id="LC193" class="blob-code blob-code-inner js-file-line">				<span class="pl-k">else</span></td>
      </tr>
      <tr>
        <td id="L194" class="blob-num js-line-number" data-line-number="194"></td>
        <td id="LC194" class="blob-code blob-code-inner js-file-line">					the_article <span class="pl-k">+=</span> next_line;</td>
      </tr>
      <tr>
        <td id="L195" class="blob-num js-line-number" data-line-number="195"></td>
        <td id="LC195" class="blob-code blob-code-inner js-file-line">			}</td>
      </tr>
      <tr>
        <td id="L196" class="blob-num js-line-number" data-line-number="196"></td>
        <td id="LC196" class="blob-code blob-code-inner js-file-line">			<span class="pl-k">if</span>(<span class="pl-k">!</span>next_article_found){</td>
      </tr>
      <tr>
        <td id="L197" class="blob-num js-line-number" data-line-number="197"></td>
        <td id="LC197" class="blob-code blob-code-inner js-file-line">				done_with_stuff <span class="pl-k">=</span> <span class="pl-c1">true</span>;</td>
      </tr>
      <tr>
        <td id="L198" class="blob-num js-line-number" data-line-number="198"></td>
        <td id="LC198" class="blob-code blob-code-inner js-file-line">				current_article_name <span class="pl-k">=</span> next_article_name;</td>
      </tr>
      <tr>
        <td id="L199" class="blob-num js-line-number" data-line-number="199"></td>
        <td id="LC199" class="blob-code blob-code-inner js-file-line">			}</td>
      </tr>
      <tr>
        <td id="L200" class="blob-num js-line-number" data-line-number="200"></td>
        <td id="LC200" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L201" class="blob-num js-line-number" data-line-number="201"></td>
        <td id="LC201" class="blob-code blob-code-inner js-file-line">			<span class="pl-k">if</span>(<span class="pl-k">!</span>the_article<span class="pl-k">.</span>equals(<span class="pl-s"><span class="pl-pds">&quot;</span><span class="pl-pds">&quot;</span></span>)){</td>
      </tr>
      <tr>
        <td id="L202" class="blob-num js-line-number" data-line-number="202"></td>
        <td id="LC202" class="blob-code blob-code-inner js-file-line">        <span class="pl-smi">String</span> ans_id<span class="pl-k">=</span><span class="pl-s"><span class="pl-pds">&quot;</span><span class="pl-pds">&quot;</span></span>;<span class="pl-c"><span class="pl-c">//</span>0</span></td>
      </tr>
      <tr>
        <td id="L203" class="blob-num js-line-number" data-line-number="203"></td>
        <td id="LC203" class="blob-code blob-code-inner js-file-line">        <span class="pl-smi">String</span> ans_inc<span class="pl-k">=</span><span class="pl-s"><span class="pl-pds">&quot;</span><span class="pl-pds">&quot;</span></span>;<span class="pl-c"><span class="pl-c">//</span>1</span></td>
      </tr>
      <tr>
        <td id="L204" class="blob-num js-line-number" data-line-number="204"></td>
        <td id="LC204" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">ArrayList&lt;<span class="pl-k">String</span>[]&gt;</span> ans_weapon<span class="pl-k">=</span><span class="pl-k">new</span> <span class="pl-k">ArrayList&lt;<span class="pl-k">String</span>[]&gt;</span>();<span class="pl-c"><span class="pl-c">//</span>2</span></td>
      </tr>
      <tr>
        <td id="L205" class="blob-num js-line-number" data-line-number="205"></td>
        <td id="LC205" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">ArrayList&lt;<span class="pl-k">String</span>[]&gt;</span> ans_indv<span class="pl-k">=</span><span class="pl-k">new</span> <span class="pl-k">ArrayList&lt;<span class="pl-k">String</span>[]&gt;</span>();<span class="pl-c"><span class="pl-c">//</span>3</span></td>
      </tr>
      <tr>
        <td id="L206" class="blob-num js-line-number" data-line-number="206"></td>
        <td id="LC206" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">ArrayList&lt;<span class="pl-k">String</span>[]&gt;</span> ans_org<span class="pl-k">=</span><span class="pl-k">new</span> <span class="pl-k">ArrayList&lt;<span class="pl-k">String</span>[]&gt;</span>();<span class="pl-c"><span class="pl-c">//</span>4</span></td>
      </tr>
      <tr>
        <td id="L207" class="blob-num js-line-number" data-line-number="207"></td>
        <td id="LC207" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">ArrayList&lt;<span class="pl-k">String</span>[]&gt;</span> ans_tar<span class="pl-k">=</span><span class="pl-k">new</span> <span class="pl-k">ArrayList&lt;<span class="pl-k">String</span>[]&gt;</span>();<span class="pl-c"><span class="pl-c">//</span>5</span></td>
      </tr>
      <tr>
        <td id="L208" class="blob-num js-line-number" data-line-number="208"></td>
        <td id="LC208" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">ArrayList&lt;<span class="pl-k">String</span>[]&gt;</span> ans_vic<span class="pl-k">=</span><span class="pl-k">new</span> <span class="pl-k">ArrayList&lt;<span class="pl-k">String</span>[]&gt;</span>();<span class="pl-c"><span class="pl-c">//</span>6</span></td>
      </tr>
      <tr>
        <td id="L209" class="blob-num js-line-number" data-line-number="209"></td>
        <td id="LC209" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">boolean</span> ans_found<span class="pl-k">=</span><span class="pl-c1">false</span>;</td>
      </tr>
      <tr>
        <td id="L210" class="blob-num js-line-number" data-line-number="210"></td>
        <td id="LC210" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">boolean</span> ans_done<span class="pl-k">=</span><span class="pl-c1">false</span>;</td>
      </tr>
      <tr>
        <td id="L211" class="blob-num js-line-number" data-line-number="211"></td>
        <td id="LC211" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">int</span> ans_count<span class="pl-k">=</span><span class="pl-c1">0</span>;</td>
      </tr>
      <tr>
        <td id="L212" class="blob-num js-line-number" data-line-number="212"></td>
        <td id="LC212" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L213" class="blob-num js-line-number" data-line-number="213"></td>
        <td id="LC213" class="blob-code blob-code-inner js-file-line">				<span class="pl-c"><span class="pl-c">//</span> GET THE ID</span></td>
      </tr>
      <tr>
        <td id="L214" class="blob-num js-line-number" data-line-number="214"></td>
        <td id="LC214" class="blob-code blob-code-inner js-file-line">				<span class="pl-smi">String</span> <span class="pl-c1">ID</span> <span class="pl-k">=</span> current_article_name<span class="pl-k">.</span>substring(<span class="pl-c1">0</span>, <span class="pl-c1">14</span>);</td>
      </tr>
      <tr>
        <td id="L215" class="blob-num js-line-number" data-line-number="215"></td>
        <td id="LC215" class="blob-code blob-code-inner js-file-line">				<span class="pl-k">if</span>(<span class="pl-c1">ID</span><span class="pl-k">.</span>charAt(<span class="pl-c1">0</span>) <span class="pl-k">==</span> <span class="pl-s"><span class="pl-pds">&#39;</span>D<span class="pl-pds">&#39;</span></span>){</td>
      </tr>
      <tr>
        <td id="L216" class="blob-num js-line-number" data-line-number="216"></td>
        <td id="LC216" class="blob-code blob-code-inner js-file-line">					<span class="pl-c1">ID</span> <span class="pl-k">=</span> <span class="pl-c1">ID</span><span class="pl-k">.</span>substring(<span class="pl-c1">0</span>, <span class="pl-c1">13</span>);</td>
      </tr>
      <tr>
        <td id="L217" class="blob-num js-line-number" data-line-number="217"></td>
        <td id="LC217" class="blob-code blob-code-inner js-file-line">        }</td>
      </tr>
      <tr>
        <td id="L218" class="blob-num js-line-number" data-line-number="218"></td>
        <td id="LC218" class="blob-code blob-code-inner js-file-line">				<span class="pl-c"><span class="pl-c">//</span>System.out.println(ID);</span></td>
      </tr>
      <tr>
        <td id="L219" class="blob-num js-line-number" data-line-number="219"></td>
        <td id="LC219" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L220" class="blob-num js-line-number" data-line-number="220"></td>
        <td id="LC220" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L221" class="blob-num js-line-number" data-line-number="221"></td>
        <td id="LC221" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">while</span>(ans_scanner<span class="pl-k">.</span>hasNextLine() <span class="pl-k">&amp;&amp;!</span> ans_done){</td>
      </tr>
      <tr>
        <td id="L222" class="blob-num js-line-number" data-line-number="222"></td>
        <td id="LC222" class="blob-code blob-code-inner js-file-line">    				<span class="pl-smi">String</span> next_line <span class="pl-k">=</span> ans_scanner<span class="pl-k">.</span>nextLine();</td>
      </tr>
      <tr>
        <td id="L223" class="blob-num js-line-number" data-line-number="223"></td>
        <td id="LC223" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">String</span>[] things;</td>
      </tr>
      <tr>
        <td id="L224" class="blob-num js-line-number" data-line-number="224"></td>
        <td id="LC224" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">if</span>(ans_found){</td>
      </tr>
      <tr>
        <td id="L225" class="blob-num js-line-number" data-line-number="225"></td>
        <td id="LC225" class="blob-code blob-code-inner js-file-line">              <span class="pl-k">if</span>(next_line<span class="pl-k">.</span>trim()<span class="pl-k">.</span>length()<span class="pl-k">==</span><span class="pl-c1">0</span>){</td>
      </tr>
      <tr>
        <td id="L226" class="blob-num js-line-number" data-line-number="226"></td>
        <td id="LC226" class="blob-code blob-code-inner js-file-line">                ans_done<span class="pl-k">=</span><span class="pl-c1">true</span>;</td>
      </tr>
      <tr>
        <td id="L227" class="blob-num js-line-number" data-line-number="227"></td>
        <td id="LC227" class="blob-code blob-code-inner js-file-line">              }</td>
      </tr>
      <tr>
        <td id="L228" class="blob-num js-line-number" data-line-number="228"></td>
        <td id="LC228" class="blob-code blob-code-inner js-file-line">              <span class="pl-k">else</span>{</td>
      </tr>
      <tr>
        <td id="L229" class="blob-num js-line-number" data-line-number="229"></td>
        <td id="LC229" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">if</span>(next_line<span class="pl-k">.</span>charAt(<span class="pl-c1">0</span>)<span class="pl-k">!=</span><span class="pl-s"><span class="pl-pds">&#39;</span> <span class="pl-pds">&#39;</span></span>){</td>
      </tr>
      <tr>
        <td id="L230" class="blob-num js-line-number" data-line-number="230"></td>
        <td id="LC230" class="blob-code blob-code-inner js-file-line">                  ans_count<span class="pl-k">++</span>;</td>
      </tr>
      <tr>
        <td id="L231" class="blob-num js-line-number" data-line-number="231"></td>
        <td id="LC231" class="blob-code blob-code-inner js-file-line">                }</td>
      </tr>
      <tr>
        <td id="L232" class="blob-num js-line-number" data-line-number="232"></td>
        <td id="LC232" class="blob-code blob-code-inner js-file-line">                <span class="pl-smi">String</span> consider<span class="pl-k">=</span>next_line<span class="pl-k">.</span>substring(<span class="pl-c1">16</span>);</td>
      </tr>
      <tr>
        <td id="L233" class="blob-num js-line-number" data-line-number="233"></td>
        <td id="LC233" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">switch</span>(ans_count){</td>
      </tr>
      <tr>
        <td id="L234" class="blob-num js-line-number" data-line-number="234"></td>
        <td id="LC234" class="blob-code blob-code-inner js-file-line">                  <span class="pl-k">case</span> <span class="pl-c1">1</span><span class="pl-k">:</span></td>
      </tr>
      <tr>
        <td id="L235" class="blob-num js-line-number" data-line-number="235"></td>
        <td id="LC235" class="blob-code blob-code-inner js-file-line">                        ans_inc<span class="pl-k">=</span>consider;</td>
      </tr>
      <tr>
        <td id="L236" class="blob-num js-line-number" data-line-number="236"></td>
        <td id="LC236" class="blob-code blob-code-inner js-file-line">                        <span class="pl-k">break</span>;</td>
      </tr>
      <tr>
        <td id="L237" class="blob-num js-line-number" data-line-number="237"></td>
        <td id="LC237" class="blob-code blob-code-inner js-file-line">                  <span class="pl-k">case</span> <span class="pl-c1">2</span><span class="pl-k">:</span></td>
      </tr>
      <tr>
        <td id="L238" class="blob-num js-line-number" data-line-number="238"></td>
        <td id="LC238" class="blob-code blob-code-inner js-file-line">                        things<span class="pl-k">=</span>consider<span class="pl-k">.</span>split(<span class="pl-s"><span class="pl-pds">&quot;</span>/<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L239" class="blob-num js-line-number" data-line-number="239"></td>
        <td id="LC239" class="blob-code blob-code-inner js-file-line">                        <span class="pl-k">for</span>(<span class="pl-k">int</span> counter<span class="pl-k">=</span><span class="pl-c1">0</span>; counter<span class="pl-k">&lt;</span>things<span class="pl-k">.</span>length; counter<span class="pl-k">++</span>){</td>
      </tr>
      <tr>
        <td id="L240" class="blob-num js-line-number" data-line-number="240"></td>
        <td id="LC240" class="blob-code blob-code-inner js-file-line">                          ans_weapon<span class="pl-k">.</span>add((things[counter])<span class="pl-k">.</span>split(<span class="pl-s"><span class="pl-pds">&quot;</span> <span class="pl-pds">&quot;</span></span>));</td>
      </tr>
      <tr>
        <td id="L241" class="blob-num js-line-number" data-line-number="241"></td>
        <td id="LC241" class="blob-code blob-code-inner js-file-line">                        }</td>
      </tr>
      <tr>
        <td id="L242" class="blob-num js-line-number" data-line-number="242"></td>
        <td id="LC242" class="blob-code blob-code-inner js-file-line">                        <span class="pl-k">break</span>;</td>
      </tr>
      <tr>
        <td id="L243" class="blob-num js-line-number" data-line-number="243"></td>
        <td id="LC243" class="blob-code blob-code-inner js-file-line">                  <span class="pl-k">case</span> <span class="pl-c1">3</span><span class="pl-k">:</span></td>
      </tr>
      <tr>
        <td id="L244" class="blob-num js-line-number" data-line-number="244"></td>
        <td id="LC244" class="blob-code blob-code-inner js-file-line">                        things<span class="pl-k">=</span>consider<span class="pl-k">.</span>split(<span class="pl-s"><span class="pl-pds">&quot;</span>/<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L245" class="blob-num js-line-number" data-line-number="245"></td>
        <td id="LC245" class="blob-code blob-code-inner js-file-line">                        <span class="pl-k">for</span>(<span class="pl-k">int</span> counter<span class="pl-k">=</span><span class="pl-c1">0</span>; counter<span class="pl-k">&lt;</span>things<span class="pl-k">.</span>length; counter<span class="pl-k">++</span>){</td>
      </tr>
      <tr>
        <td id="L246" class="blob-num js-line-number" data-line-number="246"></td>
        <td id="LC246" class="blob-code blob-code-inner js-file-line">                          ans_indv<span class="pl-k">.</span>add((things[counter])<span class="pl-k">.</span>split(<span class="pl-s"><span class="pl-pds">&quot;</span> <span class="pl-pds">&quot;</span></span>));</td>
      </tr>
      <tr>
        <td id="L247" class="blob-num js-line-number" data-line-number="247"></td>
        <td id="LC247" class="blob-code blob-code-inner js-file-line">                        }</td>
      </tr>
      <tr>
        <td id="L248" class="blob-num js-line-number" data-line-number="248"></td>
        <td id="LC248" class="blob-code blob-code-inner js-file-line">                        <span class="pl-k">break</span>;</td>
      </tr>
      <tr>
        <td id="L249" class="blob-num js-line-number" data-line-number="249"></td>
        <td id="LC249" class="blob-code blob-code-inner js-file-line">                  <span class="pl-k">case</span> <span class="pl-c1">4</span><span class="pl-k">:</span></td>
      </tr>
      <tr>
        <td id="L250" class="blob-num js-line-number" data-line-number="250"></td>
        <td id="LC250" class="blob-code blob-code-inner js-file-line">                        things<span class="pl-k">=</span>consider<span class="pl-k">.</span>split(<span class="pl-s"><span class="pl-pds">&quot;</span>/<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L251" class="blob-num js-line-number" data-line-number="251"></td>
        <td id="LC251" class="blob-code blob-code-inner js-file-line">                        <span class="pl-k">for</span>(<span class="pl-k">int</span> counter<span class="pl-k">=</span><span class="pl-c1">0</span>; counter<span class="pl-k">&lt;</span>things<span class="pl-k">.</span>length; counter<span class="pl-k">++</span>){</td>
      </tr>
      <tr>
        <td id="L252" class="blob-num js-line-number" data-line-number="252"></td>
        <td id="LC252" class="blob-code blob-code-inner js-file-line">                          ans_org<span class="pl-k">.</span>add((things[counter])<span class="pl-k">.</span>split(<span class="pl-s"><span class="pl-pds">&quot;</span> <span class="pl-pds">&quot;</span></span>));</td>
      </tr>
      <tr>
        <td id="L253" class="blob-num js-line-number" data-line-number="253"></td>
        <td id="LC253" class="blob-code blob-code-inner js-file-line">                        }</td>
      </tr>
      <tr>
        <td id="L254" class="blob-num js-line-number" data-line-number="254"></td>
        <td id="LC254" class="blob-code blob-code-inner js-file-line">                        <span class="pl-k">break</span>;</td>
      </tr>
      <tr>
        <td id="L255" class="blob-num js-line-number" data-line-number="255"></td>
        <td id="LC255" class="blob-code blob-code-inner js-file-line">                  <span class="pl-k">case</span> <span class="pl-c1">5</span><span class="pl-k">:</span></td>
      </tr>
      <tr>
        <td id="L256" class="blob-num js-line-number" data-line-number="256"></td>
        <td id="LC256" class="blob-code blob-code-inner js-file-line">                        things<span class="pl-k">=</span>consider<span class="pl-k">.</span>split(<span class="pl-s"><span class="pl-pds">&quot;</span>/<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L257" class="blob-num js-line-number" data-line-number="257"></td>
        <td id="LC257" class="blob-code blob-code-inner js-file-line">                        <span class="pl-k">for</span>(<span class="pl-k">int</span> counter<span class="pl-k">=</span><span class="pl-c1">0</span>; counter<span class="pl-k">&lt;</span>things<span class="pl-k">.</span>length; counter<span class="pl-k">++</span>){</td>
      </tr>
      <tr>
        <td id="L258" class="blob-num js-line-number" data-line-number="258"></td>
        <td id="LC258" class="blob-code blob-code-inner js-file-line">                          ans_tar<span class="pl-k">.</span>add((things[counter])<span class="pl-k">.</span>split(<span class="pl-s"><span class="pl-pds">&quot;</span> <span class="pl-pds">&quot;</span></span>));</td>
      </tr>
      <tr>
        <td id="L259" class="blob-num js-line-number" data-line-number="259"></td>
        <td id="LC259" class="blob-code blob-code-inner js-file-line">                        }</td>
      </tr>
      <tr>
        <td id="L260" class="blob-num js-line-number" data-line-number="260"></td>
        <td id="LC260" class="blob-code blob-code-inner js-file-line">                        <span class="pl-k">break</span>;</td>
      </tr>
      <tr>
        <td id="L261" class="blob-num js-line-number" data-line-number="261"></td>
        <td id="LC261" class="blob-code blob-code-inner js-file-line">                  <span class="pl-k">case</span> <span class="pl-c1">6</span><span class="pl-k">:</span></td>
      </tr>
      <tr>
        <td id="L262" class="blob-num js-line-number" data-line-number="262"></td>
        <td id="LC262" class="blob-code blob-code-inner js-file-line">                        things<span class="pl-k">=</span>consider<span class="pl-k">.</span>split(<span class="pl-s"><span class="pl-pds">&quot;</span>/<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L263" class="blob-num js-line-number" data-line-number="263"></td>
        <td id="LC263" class="blob-code blob-code-inner js-file-line">                        <span class="pl-k">for</span>(<span class="pl-k">int</span> counter<span class="pl-k">=</span><span class="pl-c1">0</span>; counter<span class="pl-k">&lt;</span>things<span class="pl-k">.</span>length; counter<span class="pl-k">++</span>){</td>
      </tr>
      <tr>
        <td id="L264" class="blob-num js-line-number" data-line-number="264"></td>
        <td id="LC264" class="blob-code blob-code-inner js-file-line">                          ans_vic<span class="pl-k">.</span>add((things[counter])<span class="pl-k">.</span>split(<span class="pl-s"><span class="pl-pds">&quot;</span> <span class="pl-pds">&quot;</span></span>));</td>
      </tr>
      <tr>
        <td id="L265" class="blob-num js-line-number" data-line-number="265"></td>
        <td id="LC265" class="blob-code blob-code-inner js-file-line">                        }</td>
      </tr>
      <tr>
        <td id="L266" class="blob-num js-line-number" data-line-number="266"></td>
        <td id="LC266" class="blob-code blob-code-inner js-file-line">                        <span class="pl-k">break</span>;</td>
      </tr>
      <tr>
        <td id="L267" class="blob-num js-line-number" data-line-number="267"></td>
        <td id="LC267" class="blob-code blob-code-inner js-file-line">                  <span class="pl-k">default</span><span class="pl-k">:</span></td>
      </tr>
      <tr>
        <td id="L268" class="blob-num js-line-number" data-line-number="268"></td>
        <td id="LC268" class="blob-code blob-code-inner js-file-line">                        ans_done<span class="pl-k">=</span><span class="pl-c1">true</span>;</td>
      </tr>
      <tr>
        <td id="L269" class="blob-num js-line-number" data-line-number="269"></td>
        <td id="LC269" class="blob-code blob-code-inner js-file-line">                        <span class="pl-k">break</span>;</td>
      </tr>
      <tr>
        <td id="L270" class="blob-num js-line-number" data-line-number="270"></td>
        <td id="LC270" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L271" class="blob-num js-line-number" data-line-number="271"></td>
        <td id="LC271" class="blob-code blob-code-inner js-file-line">                }</td>
      </tr>
      <tr>
        <td id="L272" class="blob-num js-line-number" data-line-number="272"></td>
        <td id="LC272" class="blob-code blob-code-inner js-file-line">              }</td>
      </tr>
      <tr>
        <td id="L273" class="blob-num js-line-number" data-line-number="273"></td>
        <td id="LC273" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L274" class="blob-num js-line-number" data-line-number="274"></td>
        <td id="LC274" class="blob-code blob-code-inner js-file-line">            }</td>
      </tr>
      <tr>
        <td id="L275" class="blob-num js-line-number" data-line-number="275"></td>
        <td id="LC275" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">else</span>{</td>
      </tr>
      <tr>
        <td id="L276" class="blob-num js-line-number" data-line-number="276"></td>
        <td id="LC276" class="blob-code blob-code-inner js-file-line">              <span class="pl-k">if</span>(<span class="pl-c1">ID</span><span class="pl-k">.</span>equals(next_line<span class="pl-k">.</span>substring(<span class="pl-c1">16</span>))){</td>
      </tr>
      <tr>
        <td id="L277" class="blob-num js-line-number" data-line-number="277"></td>
        <td id="LC277" class="blob-code blob-code-inner js-file-line">                ans_id<span class="pl-k">=</span><span class="pl-c1">ID</span>;</td>
      </tr>
      <tr>
        <td id="L278" class="blob-num js-line-number" data-line-number="278"></td>
        <td id="LC278" class="blob-code blob-code-inner js-file-line">                ans_found<span class="pl-k">=</span><span class="pl-c1">true</span>;</td>
      </tr>
      <tr>
        <td id="L279" class="blob-num js-line-number" data-line-number="279"></td>
        <td id="LC279" class="blob-code blob-code-inner js-file-line">              }</td>
      </tr>
      <tr>
        <td id="L280" class="blob-num js-line-number" data-line-number="280"></td>
        <td id="LC280" class="blob-code blob-code-inner js-file-line">            }</td>
      </tr>
      <tr>
        <td id="L281" class="blob-num js-line-number" data-line-number="281"></td>
        <td id="LC281" class="blob-code blob-code-inner js-file-line">    		}</td>
      </tr>
      <tr>
        <td id="L282" class="blob-num js-line-number" data-line-number="282"></td>
        <td id="LC282" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L283" class="blob-num js-line-number" data-line-number="283"></td>
        <td id="LC283" class="blob-code blob-code-inner js-file-line">				<span class="pl-c"><span class="pl-c">//</span> SPLIT THE ARTICLE INTO SENTENCES</span></td>
      </tr>
      <tr>
        <td id="L284" class="blob-num js-line-number" data-line-number="284"></td>
        <td id="LC284" class="blob-code blob-code-inner js-file-line">				<span class="pl-smi">Annotation</span> article_with_case <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">Annotation</span>(the_article<span class="pl-k">.</span>toLowerCase());</td>
      </tr>
      <tr>
        <td id="L285" class="blob-num js-line-number" data-line-number="285"></td>
        <td id="LC285" class="blob-code blob-code-inner js-file-line">				<span class="pl-smi">Reader</span> reader <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">StringReader</span>(article_with_case<span class="pl-k">.</span>toString());</td>
      </tr>
      <tr>
        <td id="L286" class="blob-num js-line-number" data-line-number="286"></td>
        <td id="LC286" class="blob-code blob-code-inner js-file-line">				<span class="pl-smi">DocumentPreprocessor</span> dp <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">DocumentPreprocessor</span>(reader);</td>
      </tr>
      <tr>
        <td id="L287" class="blob-num js-line-number" data-line-number="287"></td>
        <td id="LC287" class="blob-code blob-code-inner js-file-line">				<span class="pl-k">ArrayList&lt;<span class="pl-smi">Tree</span>&gt;</span> tag_trees <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-k">ArrayList&lt;<span class="pl-smi">Tree</span>&gt;</span>();</td>
      </tr>
      <tr>
        <td id="L288" class="blob-num js-line-number" data-line-number="288"></td>
        <td id="LC288" class="blob-code blob-code-inner js-file-line">				<span class="pl-k">ArrayList&lt;<span class="pl-k">ArrayList&lt;<span class="pl-smi">Word</span>&gt;</span>&gt;</span> noun_phrases<span class="pl-k">=</span><span class="pl-k">new</span> <span class="pl-k">ArrayList&lt;<span class="pl-k">ArrayList&lt;<span class="pl-smi">Word</span>&gt;</span>&gt;</span>();</td>
      </tr>
      <tr>
        <td id="L289" class="blob-num js-line-number" data-line-number="289"></td>
        <td id="LC289" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L290" class="blob-num js-line-number" data-line-number="290"></td>
        <td id="LC290" class="blob-code blob-code-inner js-file-line">				<span class="pl-c"><span class="pl-c">//</span>ArrayList&lt;String&gt; ignore_vic = new ArrayList&lt;String&gt;(Arrays.asList(&quot;HER&quot;, &quot;PRESIDENTIAL&quot;, &quot;SEVERAL&quot;, &quot;KILLED&quot;, &quot;10&quot;, &quot;THAT&quot;, &quot;ONE&quot;, &quot;WAS&quot;,  &quot;TWO&quot;, &quot;FIVE&quot;, &quot;SIX&quot;, &quot;BY&quot;, &quot;IS&quot;, &quot;AS&quot;, &quot;AT&quot;, &quot;ON&quot;, &quot;TO&quot;, &quot;THIS&quot;,&quot;AND&quot;, &quot;THE&quot;, &quot;OF&quot;, &quot;A&quot;, &quot;IN&quot;, &quot;&quot;, &quot;-&quot;, &quot;-LSB-&quot;, &quot;-RSB-&quot;, &quot;-RRB-&quot;, &quot;-LRB-&quot;, &quot;&quot;, &quot;,&quot;, &quot;;&quot;, &quot;.&quot;, &quot;&#39;S&quot;, &quot;--&quot;, &quot;``&quot;));</span></td>
      </tr>
      <tr>
        <td id="L291" class="blob-num js-line-number" data-line-number="291"></td>
        <td id="LC291" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L292" class="blob-num js-line-number" data-line-number="292"></td>
        <td id="LC292" class="blob-code blob-code-inner js-file-line">				<span class="pl-k">if</span>(ans_inc<span class="pl-k">.</span>equals(<span class="pl-s"><span class="pl-pds">&quot;</span>ARSON<span class="pl-pds">&quot;</span></span>)){</td>
      </tr>
      <tr>
        <td id="L293" class="blob-num js-line-number" data-line-number="293"></td>
        <td id="LC293" class="blob-code blob-code-inner js-file-line">					<span class="pl-k">for</span> (<span class="pl-k">List&lt;<span class="pl-smi">HasWord</span>&gt;</span> sentence <span class="pl-k">:</span> dp){</td>
      </tr>
      <tr>
        <td id="L294" class="blob-num js-line-number" data-line-number="294"></td>
        <td id="LC294" class="blob-code blob-code-inner js-file-line">						update_freq_count(freq_arson, sentence, ans_inc, ignore_arson, <span class="pl-c1">8</span>);</td>
      </tr>
      <tr>
        <td id="L295" class="blob-num js-line-number" data-line-number="295"></td>
        <td id="LC295" class="blob-code blob-code-inner js-file-line">					}</td>
      </tr>
      <tr>
        <td id="L296" class="blob-num js-line-number" data-line-number="296"></td>
        <td id="LC296" class="blob-code blob-code-inner js-file-line">				}</td>
      </tr>
      <tr>
        <td id="L297" class="blob-num js-line-number" data-line-number="297"></td>
        <td id="LC297" class="blob-code blob-code-inner js-file-line">				<span class="pl-k">else</span> <span class="pl-k">if</span>(ans_inc<span class="pl-k">.</span>equals(<span class="pl-s"><span class="pl-pds">&quot;</span>BOMBING<span class="pl-pds">&quot;</span></span>)){</td>
      </tr>
      <tr>
        <td id="L298" class="blob-num js-line-number" data-line-number="298"></td>
        <td id="LC298" class="blob-code blob-code-inner js-file-line">					<span class="pl-k">for</span> (<span class="pl-k">List&lt;<span class="pl-smi">HasWord</span>&gt;</span> sentence <span class="pl-k">:</span> dp){</td>
      </tr>
      <tr>
        <td id="L299" class="blob-num js-line-number" data-line-number="299"></td>
        <td id="LC299" class="blob-code blob-code-inner js-file-line">						update_freq_count(freq_bombing, sentence, ans_inc, ignore_bombing, <span class="pl-c1">8</span>);</td>
      </tr>
      <tr>
        <td id="L300" class="blob-num js-line-number" data-line-number="300"></td>
        <td id="LC300" class="blob-code blob-code-inner js-file-line">					}</td>
      </tr>
      <tr>
        <td id="L301" class="blob-num js-line-number" data-line-number="301"></td>
        <td id="LC301" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L302" class="blob-num js-line-number" data-line-number="302"></td>
        <td id="LC302" class="blob-code blob-code-inner js-file-line">				}</td>
      </tr>
      <tr>
        <td id="L303" class="blob-num js-line-number" data-line-number="303"></td>
        <td id="LC303" class="blob-code blob-code-inner js-file-line">				<span class="pl-k">else</span> <span class="pl-k">if</span>(ans_inc<span class="pl-k">.</span>equals(<span class="pl-s"><span class="pl-pds">&quot;</span>KIDNAPPING<span class="pl-pds">&quot;</span></span>)){</td>
      </tr>
      <tr>
        <td id="L304" class="blob-num js-line-number" data-line-number="304"></td>
        <td id="LC304" class="blob-code blob-code-inner js-file-line">					<span class="pl-k">for</span> (<span class="pl-k">List&lt;<span class="pl-smi">HasWord</span>&gt;</span> sentence <span class="pl-k">:</span> dp){</td>
      </tr>
      <tr>
        <td id="L305" class="blob-num js-line-number" data-line-number="305"></td>
        <td id="LC305" class="blob-code blob-code-inner js-file-line">						update_freq_count(freq_kidnapping, sentence, ans_inc, ignore_kidnapping, <span class="pl-c1">8</span>);</td>
      </tr>
      <tr>
        <td id="L306" class="blob-num js-line-number" data-line-number="306"></td>
        <td id="LC306" class="blob-code blob-code-inner js-file-line">					}</td>
      </tr>
      <tr>
        <td id="L307" class="blob-num js-line-number" data-line-number="307"></td>
        <td id="LC307" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L308" class="blob-num js-line-number" data-line-number="308"></td>
        <td id="LC308" class="blob-code blob-code-inner js-file-line">				}</td>
      </tr>
      <tr>
        <td id="L309" class="blob-num js-line-number" data-line-number="309"></td>
        <td id="LC309" class="blob-code blob-code-inner js-file-line">				<span class="pl-k">else</span> <span class="pl-k">if</span>(ans_inc<span class="pl-k">.</span>equals(<span class="pl-s"><span class="pl-pds">&quot;</span>ROBBERY<span class="pl-pds">&quot;</span></span>)){</td>
      </tr>
      <tr>
        <td id="L310" class="blob-num js-line-number" data-line-number="310"></td>
        <td id="LC310" class="blob-code blob-code-inner js-file-line">					<span class="pl-k">for</span> (<span class="pl-k">List&lt;<span class="pl-smi">HasWord</span>&gt;</span> sentence <span class="pl-k">:</span> dp){</td>
      </tr>
      <tr>
        <td id="L311" class="blob-num js-line-number" data-line-number="311"></td>
        <td id="LC311" class="blob-code blob-code-inner js-file-line">						update_freq_count(freq_robbery, sentence, ans_inc, ignore_robbery, <span class="pl-c1">8</span>);</td>
      </tr>
      <tr>
        <td id="L312" class="blob-num js-line-number" data-line-number="312"></td>
        <td id="LC312" class="blob-code blob-code-inner js-file-line">					}</td>
      </tr>
      <tr>
        <td id="L313" class="blob-num js-line-number" data-line-number="313"></td>
        <td id="LC313" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L314" class="blob-num js-line-number" data-line-number="314"></td>
        <td id="LC314" class="blob-code blob-code-inner js-file-line">				}</td>
      </tr>
      <tr>
        <td id="L315" class="blob-num js-line-number" data-line-number="315"></td>
        <td id="LC315" class="blob-code blob-code-inner js-file-line">				<span class="pl-k">else</span>{<span class="pl-c"><span class="pl-c">//</span>interpret this as attack</span></td>
      </tr>
      <tr>
        <td id="L316" class="blob-num js-line-number" data-line-number="316"></td>
        <td id="LC316" class="blob-code blob-code-inner js-file-line">					<span class="pl-k">for</span> (<span class="pl-k">List&lt;<span class="pl-smi">HasWord</span>&gt;</span> sentence <span class="pl-k">:</span> dp){</td>
      </tr>
      <tr>
        <td id="L317" class="blob-num js-line-number" data-line-number="317"></td>
        <td id="LC317" class="blob-code blob-code-inner js-file-line">						update_freq_count(freq_attack, sentence, ans_inc, ignore_attack, <span class="pl-c1">8</span>);</td>
      </tr>
      <tr>
        <td id="L318" class="blob-num js-line-number" data-line-number="318"></td>
        <td id="LC318" class="blob-code blob-code-inner js-file-line">					}</td>
      </tr>
      <tr>
        <td id="L319" class="blob-num js-line-number" data-line-number="319"></td>
        <td id="LC319" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L320" class="blob-num js-line-number" data-line-number="320"></td>
        <td id="LC320" class="blob-code blob-code-inner js-file-line">				}</td>
      </tr>
      <tr>
        <td id="L321" class="blob-num js-line-number" data-line-number="321"></td>
        <td id="LC321" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L322" class="blob-num js-line-number" data-line-number="322"></td>
        <td id="LC322" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L323" class="blob-num js-line-number" data-line-number="323"></td>
        <td id="LC323" class="blob-code blob-code-inner js-file-line">			}</td>
      </tr>
      <tr>
        <td id="L324" class="blob-num js-line-number" data-line-number="324"></td>
        <td id="LC324" class="blob-code blob-code-inner js-file-line">		}</td>
      </tr>
      <tr>
        <td id="L325" class="blob-num js-line-number" data-line-number="325"></td>
        <td id="LC325" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L326" class="blob-num js-line-number" data-line-number="326"></td>
        <td id="LC326" class="blob-code blob-code-inner js-file-line">		<span class="pl-c"><span class="pl-c">//</span>SAVE ALL THE THINGS</span></td>
      </tr>
      <tr>
        <td id="L327" class="blob-num js-line-number" data-line-number="327"></td>
        <td id="LC327" class="blob-code blob-code-inner js-file-line">		<span class="pl-c"><span class="pl-c">/*</span></span></td>
      </tr>
      <tr>
        <td id="L328" class="blob-num js-line-number" data-line-number="328"></td>
        <td id="LC328" class="blob-code blob-code-inner js-file-line"><span class="pl-c">		HashMap&lt;String, Double&gt; prob_weapon=terrible_converter(freq_weapon, 0, 0);</span></td>
      </tr>
      <tr>
        <td id="L329" class="blob-num js-line-number" data-line-number="329"></td>
        <td id="LC329" class="blob-code blob-code-inner js-file-line"><span class="pl-c">		HashMap&lt;String, Double&gt; prob_vic=terrible_converter(freq_vic, 0, 0);</span></td>
      </tr>
      <tr>
        <td id="L330" class="blob-num js-line-number" data-line-number="330"></td>
        <td id="LC330" class="blob-code blob-code-inner js-file-line"><span class="pl-c">		HashMap&lt;String, Double&gt; prob_tar=terrible_converter(freq_tar, 0, 0);</span></td>
      </tr>
      <tr>
        <td id="L331" class="blob-num js-line-number" data-line-number="331"></td>
        <td id="LC331" class="blob-code blob-code-inner js-file-line"><span class="pl-c">		HashMap&lt;String, Double&gt; prob_org=terrible_converter(freq_org, 0, 0);</span></td>
      </tr>
      <tr>
        <td id="L332" class="blob-num js-line-number" data-line-number="332"></td>
        <td id="LC332" class="blob-code blob-code-inner js-file-line"><span class="pl-c">		HashMap&lt;String, Double&gt; prob_indv=terrible_converter(freq_indv, 0, 0);</span></td>
      </tr>
      <tr>
        <td id="L333" class="blob-num js-line-number" data-line-number="333"></td>
        <td id="LC333" class="blob-code blob-code-inner js-file-line"><span class="pl-c">		<span class="pl-c">*/</span></span></td>
      </tr>
      <tr>
        <td id="L334" class="blob-num js-line-number" data-line-number="334"></td>
        <td id="LC334" class="blob-code blob-code-inner js-file-line">		<span class="pl-k">HashMap&lt;<span class="pl-smi">String</span>, <span class="pl-smi">Double</span>&gt;</span> prob_arson<span class="pl-k">=</span>terrible_converter(freq_arson, <span class="pl-c1">0</span>, <span class="pl-c1">0</span>);</td>
      </tr>
      <tr>
        <td id="L335" class="blob-num js-line-number" data-line-number="335"></td>
        <td id="LC335" class="blob-code blob-code-inner js-file-line">		<span class="pl-k">HashMap&lt;<span class="pl-smi">String</span>, <span class="pl-smi">Double</span>&gt;</span> prob_attack<span class="pl-k">=</span>terrible_converter(freq_attack, <span class="pl-c1">0</span>, <span class="pl-c1">0</span>);</td>
      </tr>
      <tr>
        <td id="L336" class="blob-num js-line-number" data-line-number="336"></td>
        <td id="LC336" class="blob-code blob-code-inner js-file-line">		<span class="pl-k">HashMap&lt;<span class="pl-smi">String</span>, <span class="pl-smi">Double</span>&gt;</span> prob_bombing<span class="pl-k">=</span>terrible_converter(freq_bombing, <span class="pl-c1">0</span>, <span class="pl-c1">0</span>);</td>
      </tr>
      <tr>
        <td id="L337" class="blob-num js-line-number" data-line-number="337"></td>
        <td id="LC337" class="blob-code blob-code-inner js-file-line">		<span class="pl-k">HashMap&lt;<span class="pl-smi">String</span>, <span class="pl-smi">Double</span>&gt;</span> prob_kidnapping<span class="pl-k">=</span>terrible_converter(freq_kidnapping, <span class="pl-c1">0</span>, <span class="pl-c1">0</span>);</td>
      </tr>
      <tr>
        <td id="L338" class="blob-num js-line-number" data-line-number="338"></td>
        <td id="LC338" class="blob-code blob-code-inner js-file-line">		<span class="pl-k">HashMap&lt;<span class="pl-smi">String</span>, <span class="pl-smi">Double</span>&gt;</span> prob_robbery<span class="pl-k">=</span>terrible_converter(freq_robbery, <span class="pl-c1">0</span>, <span class="pl-c1">0</span>);</td>
      </tr>
      <tr>
        <td id="L339" class="blob-num js-line-number" data-line-number="339"></td>
        <td id="LC339" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">try</span> {</td>
      </tr>
      <tr>
        <td id="L340" class="blob-num js-line-number" data-line-number="340"></td>
        <td id="LC340" class="blob-code blob-code-inner js-file-line">      <span class="pl-smi">FileOutputStream</span> fileOut <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">FileOutputStream</span>(<span class="pl-s"><span class="pl-pds">&quot;</span>./sentence_probs_adv/prob_arson.ser<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L341" class="blob-num js-line-number" data-line-number="341"></td>
        <td id="LC341" class="blob-code blob-code-inner js-file-line">      <span class="pl-smi">ObjectOutputStream</span> out <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">ObjectOutputStream</span>(fileOut);</td>
      </tr>
      <tr>
        <td id="L342" class="blob-num js-line-number" data-line-number="342"></td>
        <td id="LC342" class="blob-code blob-code-inner js-file-line">      out<span class="pl-k">.</span>writeObject(prob_arson);</td>
      </tr>
      <tr>
        <td id="L343" class="blob-num js-line-number" data-line-number="343"></td>
        <td id="LC343" class="blob-code blob-code-inner js-file-line">      out<span class="pl-k">.</span>close();</td>
      </tr>
      <tr>
        <td id="L344" class="blob-num js-line-number" data-line-number="344"></td>
        <td id="LC344" class="blob-code blob-code-inner js-file-line">      fileOut<span class="pl-k">.</span>close();</td>
      </tr>
      <tr>
        <td id="L345" class="blob-num js-line-number" data-line-number="345"></td>
        <td id="LC345" class="blob-code blob-code-inner js-file-line">    } <span class="pl-k">catch</span> (<span class="pl-smi">IOException</span> e) {</td>
      </tr>
      <tr>
        <td id="L346" class="blob-num js-line-number" data-line-number="346"></td>
        <td id="LC346" class="blob-code blob-code-inner js-file-line">      e<span class="pl-k">.</span>printStackTrace();</td>
      </tr>
      <tr>
        <td id="L347" class="blob-num js-line-number" data-line-number="347"></td>
        <td id="LC347" class="blob-code blob-code-inner js-file-line">    }</td>
      </tr>
      <tr>
        <td id="L348" class="blob-num js-line-number" data-line-number="348"></td>
        <td id="LC348" class="blob-code blob-code-inner js-file-line">		<span class="pl-k">try</span> {</td>
      </tr>
      <tr>
        <td id="L349" class="blob-num js-line-number" data-line-number="349"></td>
        <td id="LC349" class="blob-code blob-code-inner js-file-line">			<span class="pl-smi">FileOutputStream</span> fileOut <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">FileOutputStream</span>(<span class="pl-s"><span class="pl-pds">&quot;</span>./sentence_probs_adv/prob_attack.ser<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L350" class="blob-num js-line-number" data-line-number="350"></td>
        <td id="LC350" class="blob-code blob-code-inner js-file-line">			<span class="pl-smi">ObjectOutputStream</span> out <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">ObjectOutputStream</span>(fileOut);</td>
      </tr>
      <tr>
        <td id="L351" class="blob-num js-line-number" data-line-number="351"></td>
        <td id="LC351" class="blob-code blob-code-inner js-file-line">			out<span class="pl-k">.</span>writeObject(prob_attack);</td>
      </tr>
      <tr>
        <td id="L352" class="blob-num js-line-number" data-line-number="352"></td>
        <td id="LC352" class="blob-code blob-code-inner js-file-line">			out<span class="pl-k">.</span>close();</td>
      </tr>
      <tr>
        <td id="L353" class="blob-num js-line-number" data-line-number="353"></td>
        <td id="LC353" class="blob-code blob-code-inner js-file-line">			fileOut<span class="pl-k">.</span>close();</td>
      </tr>
      <tr>
        <td id="L354" class="blob-num js-line-number" data-line-number="354"></td>
        <td id="LC354" class="blob-code blob-code-inner js-file-line">		} <span class="pl-k">catch</span> (<span class="pl-smi">IOException</span> e) {</td>
      </tr>
      <tr>
        <td id="L355" class="blob-num js-line-number" data-line-number="355"></td>
        <td id="LC355" class="blob-code blob-code-inner js-file-line">			e<span class="pl-k">.</span>printStackTrace();</td>
      </tr>
      <tr>
        <td id="L356" class="blob-num js-line-number" data-line-number="356"></td>
        <td id="LC356" class="blob-code blob-code-inner js-file-line">		}</td>
      </tr>
      <tr>
        <td id="L357" class="blob-num js-line-number" data-line-number="357"></td>
        <td id="LC357" class="blob-code blob-code-inner js-file-line">		<span class="pl-k">try</span> {</td>
      </tr>
      <tr>
        <td id="L358" class="blob-num js-line-number" data-line-number="358"></td>
        <td id="LC358" class="blob-code blob-code-inner js-file-line">			<span class="pl-smi">FileOutputStream</span> fileOut <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">FileOutputStream</span>(<span class="pl-s"><span class="pl-pds">&quot;</span>./sentence_probs_adv/prob_bombing.ser<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L359" class="blob-num js-line-number" data-line-number="359"></td>
        <td id="LC359" class="blob-code blob-code-inner js-file-line">			<span class="pl-smi">ObjectOutputStream</span> out <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">ObjectOutputStream</span>(fileOut);</td>
      </tr>
      <tr>
        <td id="L360" class="blob-num js-line-number" data-line-number="360"></td>
        <td id="LC360" class="blob-code blob-code-inner js-file-line">			out<span class="pl-k">.</span>writeObject(prob_bombing);</td>
      </tr>
      <tr>
        <td id="L361" class="blob-num js-line-number" data-line-number="361"></td>
        <td id="LC361" class="blob-code blob-code-inner js-file-line">			out<span class="pl-k">.</span>close();</td>
      </tr>
      <tr>
        <td id="L362" class="blob-num js-line-number" data-line-number="362"></td>
        <td id="LC362" class="blob-code blob-code-inner js-file-line">			fileOut<span class="pl-k">.</span>close();</td>
      </tr>
      <tr>
        <td id="L363" class="blob-num js-line-number" data-line-number="363"></td>
        <td id="LC363" class="blob-code blob-code-inner js-file-line">		} <span class="pl-k">catch</span> (<span class="pl-smi">IOException</span> e) {</td>
      </tr>
      <tr>
        <td id="L364" class="blob-num js-line-number" data-line-number="364"></td>
        <td id="LC364" class="blob-code blob-code-inner js-file-line">			e<span class="pl-k">.</span>printStackTrace();</td>
      </tr>
      <tr>
        <td id="L365" class="blob-num js-line-number" data-line-number="365"></td>
        <td id="LC365" class="blob-code blob-code-inner js-file-line">		}</td>
      </tr>
      <tr>
        <td id="L366" class="blob-num js-line-number" data-line-number="366"></td>
        <td id="LC366" class="blob-code blob-code-inner js-file-line">		<span class="pl-k">try</span> {</td>
      </tr>
      <tr>
        <td id="L367" class="blob-num js-line-number" data-line-number="367"></td>
        <td id="LC367" class="blob-code blob-code-inner js-file-line">			<span class="pl-smi">FileOutputStream</span> fileOut <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">FileOutputStream</span>(<span class="pl-s"><span class="pl-pds">&quot;</span>./sentence_probs_adv/prob_kidnapping.ser<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L368" class="blob-num js-line-number" data-line-number="368"></td>
        <td id="LC368" class="blob-code blob-code-inner js-file-line">			<span class="pl-smi">ObjectOutputStream</span> out <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">ObjectOutputStream</span>(fileOut);</td>
      </tr>
      <tr>
        <td id="L369" class="blob-num js-line-number" data-line-number="369"></td>
        <td id="LC369" class="blob-code blob-code-inner js-file-line">			out<span class="pl-k">.</span>writeObject(prob_kidnapping);</td>
      </tr>
      <tr>
        <td id="L370" class="blob-num js-line-number" data-line-number="370"></td>
        <td id="LC370" class="blob-code blob-code-inner js-file-line">			out<span class="pl-k">.</span>close();</td>
      </tr>
      <tr>
        <td id="L371" class="blob-num js-line-number" data-line-number="371"></td>
        <td id="LC371" class="blob-code blob-code-inner js-file-line">			fileOut<span class="pl-k">.</span>close();</td>
      </tr>
      <tr>
        <td id="L372" class="blob-num js-line-number" data-line-number="372"></td>
        <td id="LC372" class="blob-code blob-code-inner js-file-line">		} <span class="pl-k">catch</span> (<span class="pl-smi">IOException</span> e) {</td>
      </tr>
      <tr>
        <td id="L373" class="blob-num js-line-number" data-line-number="373"></td>
        <td id="LC373" class="blob-code blob-code-inner js-file-line">			e<span class="pl-k">.</span>printStackTrace();</td>
      </tr>
      <tr>
        <td id="L374" class="blob-num js-line-number" data-line-number="374"></td>
        <td id="LC374" class="blob-code blob-code-inner js-file-line">		}</td>
      </tr>
      <tr>
        <td id="L375" class="blob-num js-line-number" data-line-number="375"></td>
        <td id="LC375" class="blob-code blob-code-inner js-file-line">		<span class="pl-k">try</span> {</td>
      </tr>
      <tr>
        <td id="L376" class="blob-num js-line-number" data-line-number="376"></td>
        <td id="LC376" class="blob-code blob-code-inner js-file-line">			<span class="pl-smi">FileOutputStream</span> fileOut <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">FileOutputStream</span>(<span class="pl-s"><span class="pl-pds">&quot;</span>./sentence_probs_adv/prob_robbery.ser<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L377" class="blob-num js-line-number" data-line-number="377"></td>
        <td id="LC377" class="blob-code blob-code-inner js-file-line">			<span class="pl-smi">ObjectOutputStream</span> out <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">ObjectOutputStream</span>(fileOut);</td>
      </tr>
      <tr>
        <td id="L378" class="blob-num js-line-number" data-line-number="378"></td>
        <td id="LC378" class="blob-code blob-code-inner js-file-line">			out<span class="pl-k">.</span>writeObject(prob_robbery);</td>
      </tr>
      <tr>
        <td id="L379" class="blob-num js-line-number" data-line-number="379"></td>
        <td id="LC379" class="blob-code blob-code-inner js-file-line">			out<span class="pl-k">.</span>close();</td>
      </tr>
      <tr>
        <td id="L380" class="blob-num js-line-number" data-line-number="380"></td>
        <td id="LC380" class="blob-code blob-code-inner js-file-line">			fileOut<span class="pl-k">.</span>close();</td>
      </tr>
      <tr>
        <td id="L381" class="blob-num js-line-number" data-line-number="381"></td>
        <td id="LC381" class="blob-code blob-code-inner js-file-line">		} <span class="pl-k">catch</span> (<span class="pl-smi">IOException</span> e) {</td>
      </tr>
      <tr>
        <td id="L382" class="blob-num js-line-number" data-line-number="382"></td>
        <td id="LC382" class="blob-code blob-code-inner js-file-line">			e<span class="pl-k">.</span>printStackTrace();</td>
      </tr>
      <tr>
        <td id="L383" class="blob-num js-line-number" data-line-number="383"></td>
        <td id="LC383" class="blob-code blob-code-inner js-file-line">		}</td>
      </tr>
      <tr>
        <td id="L384" class="blob-num js-line-number" data-line-number="384"></td>
        <td id="LC384" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L385" class="blob-num js-line-number" data-line-number="385"></td>
        <td id="LC385" class="blob-code blob-code-inner js-file-line">	}</td>
      </tr>
      <tr>
        <td id="L386" class="blob-num js-line-number" data-line-number="386"></td>
        <td id="LC386" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L387" class="blob-num js-line-number" data-line-number="387"></td>
        <td id="LC387" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">private</span> <span class="pl-k">static</span> <span class="pl-k">HashMap&lt;<span class="pl-smi">String</span>, <span class="pl-smi">Double</span>&gt;</span> <span class="pl-en">terrible_converter</span>(<span class="pl-k">HashMap&lt;<span class="pl-smi">String</span>, <span class="pl-smi">Freq_tuple</span>&gt;</span> <span class="pl-v">input</span>, <span class="pl-k">int</span> <span class="pl-v">cut_off</span>, <span class="pl-k">double</span> <span class="pl-v">min_val</span>){</td>
      </tr>
      <tr>
        <td id="L388" class="blob-num js-line-number" data-line-number="388"></td>
        <td id="LC388" class="blob-code blob-code-inner js-file-line">		<span class="pl-k">HashMap&lt;<span class="pl-smi">String</span>, <span class="pl-smi">Double</span>&gt;</span> prob<span class="pl-k">=</span><span class="pl-k">new</span> <span class="pl-k">HashMap&lt;&gt;</span>();</td>
      </tr>
      <tr>
        <td id="L389" class="blob-num js-line-number" data-line-number="389"></td>
        <td id="LC389" class="blob-code blob-code-inner js-file-line">		<span class="pl-k">for</span>(<span class="pl-smi">String</span> s<span class="pl-k">:</span> input<span class="pl-k">.</span>keySet()){</td>
      </tr>
      <tr>
        <td id="L390" class="blob-num js-line-number" data-line-number="390"></td>
        <td id="LC390" class="blob-code blob-code-inner js-file-line">			prob<span class="pl-k">.</span>put(s, input<span class="pl-k">.</span>get(s)<span class="pl-k">.</span>get_doub(cut_off, min_val));</td>
      </tr>
      <tr>
        <td id="L391" class="blob-num js-line-number" data-line-number="391"></td>
        <td id="LC391" class="blob-code blob-code-inner js-file-line">		}</td>
      </tr>
      <tr>
        <td id="L392" class="blob-num js-line-number" data-line-number="392"></td>
        <td id="LC392" class="blob-code blob-code-inner js-file-line">		<span class="pl-c"><span class="pl-c">//</span>System.out.println(prob.size()+&quot;   &quot;+input.size());</span></td>
      </tr>
      <tr>
        <td id="L393" class="blob-num js-line-number" data-line-number="393"></td>
        <td id="LC393" class="blob-code blob-code-inner js-file-line">		<span class="pl-k">return</span> prob;</td>
      </tr>
      <tr>
        <td id="L394" class="blob-num js-line-number" data-line-number="394"></td>
        <td id="LC394" class="blob-code blob-code-inner js-file-line">	}</td>
      </tr>
      <tr>
        <td id="L395" class="blob-num js-line-number" data-line-number="395"></td>
        <td id="LC395" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L396" class="blob-num js-line-number" data-line-number="396"></td>
        <td id="LC396" class="blob-code blob-code-inner js-file-line">	<span class="pl-k">private</span> <span class="pl-k">static</span> <span class="pl-k">void</span> <span class="pl-en">update_freq_count</span>(<span class="pl-k">HashMap&lt;<span class="pl-smi">String</span>, <span class="pl-smi">Freq_tuple</span>&gt;</span> <span class="pl-v">freq</span>, <span class="pl-k">List&lt;<span class="pl-smi">HasWord</span>&gt;</span> <span class="pl-v">sentence</span>, <span class="pl-smi">String</span> <span class="pl-v">ans_</span>, <span class="pl-k">ArrayList&lt;<span class="pl-smi">String</span>&gt;</span> <span class="pl-v">ignore_words</span>, <span class="pl-k">int</span> <span class="pl-v">range</span>){</td>
      </tr>
      <tr>
        <td id="L397" class="blob-num js-line-number" data-line-number="397"></td>
        <td id="LC397" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L398" class="blob-num js-line-number" data-line-number="398"></td>
        <td id="LC398" class="blob-code blob-code-inner js-file-line">		<span class="pl-k">for</span>(<span class="pl-smi">HasWord</span> word<span class="pl-k">:</span> sentence){</td>
      </tr>
      <tr>
        <td id="L399" class="blob-num js-line-number" data-line-number="399"></td>
        <td id="LC399" class="blob-code blob-code-inner js-file-line">			<span class="pl-k">if</span>(ignore_words<span class="pl-k">.</span>contains(word<span class="pl-k">.</span>word()<span class="pl-k">.</span>toUpperCase())){</td>
      </tr>
      <tr>
        <td id="L400" class="blob-num js-line-number" data-line-number="400"></td>
        <td id="LC400" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L401" class="blob-num js-line-number" data-line-number="401"></td>
        <td id="LC401" class="blob-code blob-code-inner js-file-line">			}</td>
      </tr>
      <tr>
        <td id="L402" class="blob-num js-line-number" data-line-number="402"></td>
        <td id="LC402" class="blob-code blob-code-inner js-file-line">			<span class="pl-k">else</span>{</td>
      </tr>
      <tr>
        <td id="L403" class="blob-num js-line-number" data-line-number="403"></td>
        <td id="LC403" class="blob-code blob-code-inner js-file-line">				<span class="pl-k">if</span>(freq<span class="pl-k">.</span>containsKey(word<span class="pl-k">.</span>word()<span class="pl-k">.</span>toUpperCase())){</td>
      </tr>
      <tr>
        <td id="L404" class="blob-num js-line-number" data-line-number="404"></td>
        <td id="LC404" class="blob-code blob-code-inner js-file-line">					freq<span class="pl-k">.</span>get(word<span class="pl-k">.</span>word()<span class="pl-k">.</span>toUpperCase())<span class="pl-k">.</span>inc_both();</td>
      </tr>
      <tr>
        <td id="L405" class="blob-num js-line-number" data-line-number="405"></td>
        <td id="LC405" class="blob-code blob-code-inner js-file-line">				}</td>
      </tr>
      <tr>
        <td id="L406" class="blob-num js-line-number" data-line-number="406"></td>
        <td id="LC406" class="blob-code blob-code-inner js-file-line">				<span class="pl-k">else</span>{</td>
      </tr>
      <tr>
        <td id="L407" class="blob-num js-line-number" data-line-number="407"></td>
        <td id="LC407" class="blob-code blob-code-inner js-file-line">					freq<span class="pl-k">.</span>put(word<span class="pl-k">.</span>word()<span class="pl-k">.</span>toUpperCase(), <span class="pl-k">new</span> <span class="pl-smi">Freq_tuple</span>(<span class="pl-c1">1</span>, <span class="pl-c1">1</span>));</td>
      </tr>
      <tr>
        <td id="L408" class="blob-num js-line-number" data-line-number="408"></td>
        <td id="LC408" class="blob-code blob-code-inner js-file-line">				}</td>
      </tr>
      <tr>
        <td id="L409" class="blob-num js-line-number" data-line-number="409"></td>
        <td id="LC409" class="blob-code blob-code-inner js-file-line">			}</td>
      </tr>
      <tr>
        <td id="L410" class="blob-num js-line-number" data-line-number="410"></td>
        <td id="LC410" class="blob-code blob-code-inner js-file-line">		}</td>
      </tr>
      <tr>
        <td id="L411" class="blob-num js-line-number" data-line-number="411"></td>
        <td id="LC411" class="blob-code blob-code-inner js-file-line">	}</td>
      </tr>
      <tr>
        <td id="L412" class="blob-num js-line-number" data-line-number="412"></td>
        <td id="LC412" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L413" class="blob-num js-line-number" data-line-number="413"></td>
        <td id="LC413" class="blob-code blob-code-inner js-file-line">}</td>
      </tr>
</table>

  <div class="BlobToolbar position-absolute js-file-line-actions dropdown js-menu-container js-select-menu d-none" aria-hidden="true">
    <button class="btn-octicon ml-0 px-2 p-0 bg-white border border-gray-dark rounded-1 dropdown-toggle js-menu-target" id="js-file-line-action-button" type="button" aria-expanded="false" aria-haspopup="true" aria-label="Inline file action toolbar" aria-controls="inline-file-actions">
      <svg aria-hidden="true" class="octicon octicon-kebab-horizontal" height="16" version="1.1" viewBox="0 0 13 16" width="13"><path fill-rule="evenodd" d="M1.5 9a1.5 1.5 0 1 1 0-3 1.5 1.5 0 0 1 0 3zm5 0a1.5 1.5 0 1 1 0-3 1.5 1.5 0 0 1 0 3zm5 0a1.5 1.5 0 1 1 0-3 1.5 1.5 0 0 1 0 3z"/></svg>
    </button>
    <div class="dropdown-menu-content js-menu-content" id="inline-file-actions">
      <ul class="BlobToolbar-dropdown dropdown-menu dropdown-menu-se mt-2">
        <li><a class="js-zeroclipboard dropdown-item" style="cursor:pointer;" id="js-copy-lines" data-original-text="Copy lines">Copy lines</a></li>
        <li><a class="js-zeroclipboard dropdown-item" id= "js-copy-permalink" style="cursor:pointer;" data-original-text="Copy permalink">Copy permalink</a></li>
        <li><a href="/Dino1/NLP_ie/blame/6c1f9e761eae8c1e089dcaf83183a0265fa20be8/Incident_Selecter.java" class="dropdown-item js-update-url-with-hash" id="js-view-git-blame">View git blame</a></li>
          <li><a href="/Dino1/NLP_ie/issues/new" class="dropdown-item" id="js-new-issue">Open new issue</a></li>
      </ul>
    </div>
  </div>

  </div>

  </div>

  <button type="button" data-facebox="#jump-to-line" data-facebox-class="linejump" data-hotkey="l" class="d-none">Jump to Line</button>
  <div id="jump-to-line" style="display:none">
    <!-- '"` --><!-- </textarea></xmp> --></option></form><form accept-charset="UTF-8" action="" class="js-jump-to-line-form" method="get"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /></div>
      <input class="form-control linejump-input js-jump-to-line-field" type="text" placeholder="Jump to line&hellip;" aria-label="Jump to line" autofocus>
      <button type="submit" class="btn">Go</button>
</form>  </div>

  </div>
  <div class="modal-backdrop js-touch-events"></div>
</div>

    </div>
  </div>

  </div>

      
<div class="footer container-lg px-3" role="contentinfo">
  <div class="position-relative d-flex flex-justify-between py-6 mt-6 f6 text-gray border-top border-gray-light ">
    <ul class="list-style-none d-flex flex-wrap ">
      <li class="mr-3">&copy; 2017 <span title="0.18951s from unicorn-1837508190-r89x0">GitHub</span>, Inc.</li>
        <li class="mr-3"><a href="https://github.com/site/terms" data-ga-click="Footer, go to terms, text:terms">Terms</a></li>
        <li class="mr-3"><a href="https://github.com/site/privacy" data-ga-click="Footer, go to privacy, text:privacy">Privacy</a></li>
        <li class="mr-3"><a href="https://github.com/security" data-ga-click="Footer, go to security, text:security">Security</a></li>
        <li class="mr-3"><a href="https://status.github.com/" data-ga-click="Footer, go to status, text:status">Status</a></li>
        <li><a href="https://help.github.com" data-ga-click="Footer, go to help, text:help">Help</a></li>
    </ul>

    <a href="https://github.com" aria-label="Homepage" class="footer-octicon" title="GitHub">
      <svg aria-hidden="true" class="octicon octicon-mark-github" height="24" version="1.1" viewBox="0 0 16 16" width="24"><path fill-rule="evenodd" d="M8 0C3.58 0 0 3.58 0 8c0 3.54 2.29 6.53 5.47 7.59.4.07.55-.17.55-.38 0-.19-.01-.82-.01-1.49-2.01.37-2.53-.49-2.69-.94-.09-.23-.48-.94-.82-1.13-.28-.15-.68-.52-.01-.53.63-.01 1.08.58 1.23.82.72 1.21 1.87.87 2.33.66.07-.52.28-.87.51-1.07-1.78-.2-3.64-.89-3.64-3.95 0-.87.31-1.59.82-2.15-.08-.2-.36-1.02.08-2.12 0 0 .67-.21 2.2.82.64-.18 1.32-.27 2-.27.68 0 1.36.09 2 .27 1.53-1.04 2.2-.82 2.2-.82.44 1.1.16 1.92.08 2.12.51.56.82 1.27.82 2.15 0 3.07-1.87 3.75-3.65 3.95.29.25.54.73.54 1.48 0 1.07-.01 1.93-.01 2.2 0 .21.15.46.55.38A8.013 8.013 0 0 0 16 8c0-4.42-3.58-8-8-8z"/></svg>
</a>
    <ul class="list-style-none d-flex flex-wrap ">
        <li class="mr-3"><a href="https://github.com/contact" data-ga-click="Footer, go to contact, text:contact">Contact GitHub</a></li>
      <li class="mr-3"><a href="https://developer.github.com" data-ga-click="Footer, go to api, text:api">API</a></li>
      <li class="mr-3"><a href="https://training.github.com" data-ga-click="Footer, go to training, text:training">Training</a></li>
      <li class="mr-3"><a href="https://shop.github.com" data-ga-click="Footer, go to shop, text:shop">Shop</a></li>
        <li class="mr-3"><a href="https://github.com/blog" data-ga-click="Footer, go to blog, text:blog">Blog</a></li>
        <li><a href="https://github.com/about" data-ga-click="Footer, go to about, text:about">About</a></li>

    </ul>
  </div>
</div>



  <div id="ajax-error-message" class="ajax-error-message flash flash-error">
    <svg aria-hidden="true" class="octicon octicon-alert" height="16" version="1.1" viewBox="0 0 16 16" width="16"><path fill-rule="evenodd" d="M8.865 1.52c-.18-.31-.51-.5-.87-.5s-.69.19-.87.5L.275 13.5c-.18.31-.18.69 0 1 .19.31.52.5.87.5h13.7c.36 0 .69-.19.86-.5.17-.31.18-.69.01-1L8.865 1.52zM8.995 13h-2v-2h2v2zm0-3h-2V6h2v4z"/></svg>
    <button type="button" class="flash-close js-ajax-error-dismiss" aria-label="Dismiss error">
      <svg aria-hidden="true" class="octicon octicon-x" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path fill-rule="evenodd" d="M7.48 8l3.75 3.75-1.48 1.48L6 9.48l-3.75 3.75-1.48-1.48L4.52 8 .77 4.25l1.48-1.48L6 6.52l3.75-3.75 1.48 1.48z"/></svg>
    </button>
    You can't perform that action at this time.
  </div>


    
    <script crossorigin="anonymous" integrity="sha256-AKaM1UiP5hAbMK+ODXKSSOA4wMfbHA/ze8QlV5HCOp8=" src="https://assets-cdn.github.com/assets/frameworks-00a68cd5488fe6101b30af8e0d729248e038c0c7db1c0ff37bc4255791c23a9f.js"></script>
    
    <script async="async" crossorigin="anonymous" integrity="sha256-T7cvrB5csNdoOf7z1E9FfViDGonRXsqL1sTj9IVBFTc=" src="https://assets-cdn.github.com/assets/github-4fb72fac1e5cb0d76839fef3d44f457d58831a89d15eca8bd6c4e3f485411537.js"></script>
    
    
    
    
  <div class="js-stale-session-flash stale-session-flash flash flash-warn flash-banner d-none">
    <svg aria-hidden="true" class="octicon octicon-alert" height="16" version="1.1" viewBox="0 0 16 16" width="16"><path fill-rule="evenodd" d="M8.865 1.52c-.18-.31-.51-.5-.87-.5s-.69.19-.87.5L.275 13.5c-.18.31-.18.69 0 1 .19.31.52.5.87.5h13.7c.36 0 .69-.19.86-.5.17-.31.18-.69.01-1L8.865 1.52zM8.995 13h-2v-2h2v2zm0-3h-2V6h2v4z"/></svg>
    <span class="signed-in-tab-flash">You signed in with another tab or window. <a href="">Reload</a> to refresh your session.</span>
    <span class="signed-out-tab-flash">You signed out in another tab or window. <a href="">Reload</a> to refresh your session.</span>
  </div>
  <div class="facebox" id="facebox" style="display:none;">
  <div class="facebox-popup">
    <div class="facebox-content" role="dialog" aria-labelledby="facebox-header" aria-describedby="facebox-description">
    </div>
    <button type="button" class="facebox-close js-facebox-close" aria-label="Close modal">
      <svg aria-hidden="true" class="octicon octicon-x" height="16" version="1.1" viewBox="0 0 12 16" width="12"><path fill-rule="evenodd" d="M7.48 8l3.75 3.75-1.48 1.48L6 9.48l-3.75 3.75-1.48-1.48L4.52 8 .77 4.25l1.48-1.48L6 6.52l3.75-3.75 1.48 1.48z"/></svg>
    </button>
  </div>
</div>


  </body>
</html>

