(ns multipage.common
  (:require [clojure.string :as string]))

(defonce pages ["Home" "Projects"])

(defn nav-bar [current-page]
  [:nav {:class "navbar navbar-inverse"}
   [:div {:class "container-fluid"}
    [:div {:class "navbar-header"}
     [:a {:class "navbar-brand" :href "#"}
      "Dan Harasymiw"]]
    [:ul {:class "nav navbar-nav navbar-right"}
     (for [page pages]
       [:li {:class (if (= current-page page) "active")}
        (let [stripped-name (string/lower-case (string/replace page " " ""))]
          [:a {:href (if (= page "Home") "/#/" (str "/#/" stripped-name))} page])])]]])

(defn jumbotron
  "Big name at the top?"
  [title]
  [:div {:class "jumbotron text-center"}
   [:h1 title]])

(defn content [x]
  [:div {:class "container"}
   x])