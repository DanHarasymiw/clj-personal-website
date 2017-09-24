(ns clj-website.handler
  (:require [compojure.core :refer [GET defroutes]]
            [compojure.route :refer [not-found resources]]
            [ring.middleware.defaults :refer [site-defaults wrap-defaults]]
            [hiccup.core :refer [html]]
            [hiccup.page :refer [include-js include-css]]
            [prone.middleware :refer [wrap-exceptions]]
            [environ.core :refer [env]]))
(def home-page
  (html
   [:html
    [:head
     [:meta {:charset "utf-8"}]
     [:meta {:name "viewport"
             :content "width=device-width, initial-scale=1"}]
     (include-css (if (env :dev) "css/site.css" "css/site.min.css")
                  "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css")]
    [:body
     [:div#app]
     (include-js "js/app.js"
                  "https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"
                  "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js")]]))

(defroutes routes
  (GET "/" [] home-page)
  (resources "/")
  (not-found "Not Found"))

(def app
  (let [handler (wrap-defaults routes site-defaults)]
    (if (env :dev) (wrap-exceptions handler) handler)))
