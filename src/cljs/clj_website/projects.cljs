(ns clj-website.projects
  (:require [clj-website.common :refer [nav-bar jumbotron content]]))



(defn project [name description pic-url github-url]
  [:div {:class "project"}
   [:div {:class "row project-content"}
    [:div {:class "col-xs-8"}
     [:div {:class "project-title"}
      [:h3 name]]]]
   [:div {:class "row project-content"}
     [:div {:class "col-xs-10"}
      [:div {:class "text-background"} description]]
     [:div {:class "col-xs-2 project-pic"}
      [:img {:src pic-url
            :class "img-rounded"}]
      [:div {:class "github-link"} [:a {:href github-url} "GitHub " [:img {:src "images/github.png" :class "github-pic"}]]]]]])

(defn projects-page []
  [:div
   (nav-bar "Projects")
   (jumbotron "Projects")
   (content [:div
             (project "This Website"
                      [:p (str "I began learning Clojure recently and wanted to create a web app using ClojureScript. Since I didn't have a personal website yet I figured that this might be a good place to start. "
                           "I used ") [:a {:href "https://github.com/reagent-project/reagent"} "Reagent"] (str " to help create this site, which is a ClojureScript interface to React. Reagent allows you to create webpages without actually writing any HTML, instead you Clojure data structures. Vectors are used to create elements and maps are used to define an elements attributes "
                           "I also used ") [:a {:href "https://github.com/bhauman/lein-figwheel"} "Figwheel"] (str " which made development much easier. Figwheel takes your ClojureScript code and hotloads it into the browser so that you can see your website change as you work on it. "
                           "This website is definitely a work in progress, and I hope to improve upon it as my Clojure skills improve.")]
                      "/images/clojurescript.png"
                      "https://github.com/DanHarasymiw/clj-personal-website.git")
             (project "SaltToday"
                      [:p "As an avid reader of " [:a {:href "https://sootoday.com"} "Soo Today"] " or more accurately their wonderful comment section, I wanted a convenient way of finding the most amusing comments so I made a site to do just that. "
                       [:a {:href "https://salttoday.ca"} "SaltToday"] " scrapes Soo Today's comment section, stores them in Datomic, and displays the comments to users based on the number of likes and dislikes they get. It's not quite done yet, and theres still a few features "
                       "that I want to add, but overall I'm happy with the outcome so far and have enjoyed my initial experience using Datomic."]
                      "/images/clojurescript.png"
                      "https://github.com/DanHarasymiw/SaltToday.git")
             (project "Gladiator"
                      [:div [:p (str "For my fourth year project at Algoma University, I created a first person melee combat "
                               "based game with online multiplayer using the Unity3D game engine with C#. "
                               "My first semester consisted of implementing the "
                               "basic gameplay such as player controls, and an enemy AI that could navigate around "
                               "obstacles. The environment and map was also created in this semester. In the second "
                               "semester I added a game made that spawned increasingly more difficult waves of enemies "
                               "for the players to combat as well as online multiplayer which also featured a simple "
                               "game browser to join other player's games.")]
                            [:p (str "The Unity project files are available ") [:a {:href "https://drive.google.com/file/d/0B9HBAjacY-vNY1poOGVYWFpKNlU/view?usp=sharing"} "here"] (str ". "
                           "I've uploaded videos of the scenes in the game ") [:a {:href "https://www.youtube.com/watch?v=QyiMQWRmfHg&list=PLGGv7hEwYAdCmwhlkBJT_zxILNtBponw5&index=1"} "here"] ". "]]
                      "/images/unity.png"
                      "https://github.com/DanHarasymiw/COSC4087-Gladiator-Scripts")
             (project "Discord Bot"
                      [:p (str "My first project ever written in Clojure, I had wanted to make a Discord bot for my "
                               "Discord channel for some time and it seemed like a project that would be challenging "
                               "enough to learn some new things. The Discord bot only has a few simple commands "
                               "like finding images and posting them in the chat, but I plan to add more (and have been) "
                               "as friends request them.")]
                      "/images/discord2.png"
                      "https://github.com/DanHarasymiw/clj-discord-bot")
             (project "Global Game Jam 2016 - AM ASAP"
                      [:p
                       [:a {:href "https://globalgamejam.org/2016/games/am-asap"} "Our entry"]
                       (str " for Global Game Jam 2016. For those unfamiliar with Global Game Jam, contestants have 48 hours to "
                            "create a game based on a given theme. The theme provided for 2016 was 'Ritual', and the game we created had "
                            "players trying to complete various morning tasks (as minigames) within a certain time limit. After each day, "
                            "players would attempt to complete the tasks again with less and less time. This was a very fun "
                            "experience and I'd recommend anyone attend if they're interested.")]
                      "/images/globalgamejam.png"
                      "https://github.com/DanHarasymiw/Global-Game-Jam---AM-ASAP"
                      )])])