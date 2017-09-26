(ns clj-website.contact
  (:require [clj-website.common :refer [nav-bar jumbotron content]]))

(defn contact-page []
  [:div
   (nav-bar "Contact")
   (jumbotron "Contact Me")
   (content [:p (str "hey you can contact me")])])