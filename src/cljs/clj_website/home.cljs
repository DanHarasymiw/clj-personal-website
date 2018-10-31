(ns clj-website.home
  (:require [clj-website.common :refer [nav-bar jumbotron content]]))

(defn home-page []
  [:div
   (nav-bar "Home")
   (jumbotron "Dan Harasymiw")
   (content
     [:div {:class "text-background"}
      [:p "Welcome! This is my site, its not quite finished yet, but look around if you want. I'll be mostly using this to show off some of the things I have worked on in the past or am currently working on."]
      ])])