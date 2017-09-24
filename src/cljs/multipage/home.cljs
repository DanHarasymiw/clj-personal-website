(ns multipage.home
  (:require [multipage.common :refer [nav-bar jumbotron content]]))



(defn home-page []
  [:div
   (nav-bar "Home")
   (jumbotron "Dan Harasymiw")
   (content [:div
             [:p "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec sed ornare libero. Praesent accumsan porta fermentum. Cras in sapien tellus. Morbi elit orci, efficitur quis tincidunt quis, viverra id magna. Sed in ex suscipit, vestibulum felis eu, rhoncus mauris. Phasellus sollicitudin eu odio ut accumsan. Phasellus eget magna diam. Integer vehicula lectus ut orci condimentum suscipit. Morbi lacus dolor, ultrices quis blandit in, pulvinar vel justo. Sed sodales purus mattis nisi bibendum, non suscipit felis fringilla. Vivamus vitae dui facilisis, laoreet urna in, sodales elit."]
             [:p "Nulla vitae leo eros. Praesent lacinia ipsum leo, a eleifend mauris volutpat eget. Morbi congue massa at blandit blandit. Curabitur sodales porta quam, quis porta massa commodo eget. Pellentesque venenatis nibh ut lacus volutpat euismod. Nam sit amet nisi est. Nam non maximus leo, ac viverra turpis. Aliquam quis interdum urna."]])])