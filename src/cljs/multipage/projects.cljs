(ns multipage.projects
  (:require [multipage.common :refer [nav-bar jumbotron content]]))



(defn project [name description pic-url github-url]
  [:div {:class "project"}
   [:div {:class "row project-content"}
    [:div {:class "col-xs-8"}
     [:div {:class "project-title"}
      [:h3 [:a {:href github-url} name]]]
     [:div {:class "project-desc"}
      description]]
    [:div {:class "col-xs-4 project-pic"}
     [:img {:src pic-url
            :class "img-rounded"}]]]])

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
                      "https://www.what-dog.net/Images/faces2/scroll0015.jpg"
                      "https://github.com/DanHarasymiw/clj-personal-website.git")
             (project "Gladiator"
                      [:p (str "For my fourth year project in university, I created an online multiplayer first person melee combat based game. "
                           "Players would fight against waves of enemies, with each wave having more and more enemies. "
                           "The Unity project files are available ") [:a {:href "https://drive.google.com/file/d/0B9HBAjacY-vNY1poOGVYWFpKNlU/view?usp=sharing"} "here"] (str ". "
                           "I've uploaded videos of the scenes in the game ") [:a {:href "https://www.youtube.com/watch?v=QyiMQWRmfHg&list=PLGGv7hEwYAdCmwhlkBJT_zxILNtBponw5&index=1"} "here"] ". "]
                      "/images/gladiator.PNG"
                      "https://github.com/DanHarasymiw/COSC4087-Gladiator-Scripts")
             (project "Discord Bot"
                      [:p (str "This is the first project that I wrote with Clojure. I had wanted a Discord bot for my Discord Channel so I made a simple bot that can find images, and roll dice. I've been adding features to this bot as my friends request them.")]
                      "/images/discord.png"
                      "https://github.com/DanHarasymiw/clj-discord-bot")
             (project "Global Game Jam 2016 - AM ASAP"
                      [:p
                       [:a {:href "https://globalgamejam.org/2016/games/am-asap"} "Our entry"]
                       (str " for Global Game Jam 2016. For those unfamiliar with Global Game Jam, contestants have about 48 hours to "
                       "create a game based on a given theme. The theme provided for 2016 was 'Ritual', and the game we created had "
                       "players trying to complete various morning tasks (as minigames) within a certain time limit. After each day, "
                       "players would attempt to complete the tasks again with less and less time.")]
                      "/images/amasap.png"
                      "https://github.com/DanHarasymiw/Global-Game-Jam---AM-ASAP"
                      )])])