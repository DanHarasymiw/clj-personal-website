(ns clj-website.home
  (:require [clj-website.common :refer [nav-bar jumbotron content]]))



(defn home-page []
  [:div
   (nav-bar "Home")
   (jumbotron "Dan Harasymiw")
   (content
     [:div {:class "text-background"}
      [:p "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce commodo libero id dui efficitur elementum. Nulla id dapibus mauris. Quisque in auctor dolor. Sed dictum odio ut molestie facilisis. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Praesent ultrices suscipit elit sit amet porta. Duis et vulputate dui. Interdum et malesuada fames ac ante ipsum primis in faucibus."]
      [:p "In hac habitasse platea dictumst. Etiam urna ex, lobortis quis mattis vel, eleifend at mauris. Morbi lorem ligula, blandit nec lectus eu, mollis gravida dui. Nunc cursus condimentum arcu, eget pulvinar metus tempor eget. Maecenas sit amet odio nisi. Aenean molestie augue ac magna faucibus molestie. Curabitur malesuada ante sed turpis congue bibendum. Aliquam erat volutpat. Vivamus id commodo nisl, id molestie dolor. Sed ut felis felis."]
      [:p "Cras imperdiet sem ac augue fermentum sollicitudin. Vivamus consequat, nibh vel fringilla lacinia, dui justo congue nisi, tincidunt tristique ligula nisi ac massa. Quisque feugiat ex ex, quis rhoncus diam imperdiet eu. Maecenas vitae enim malesuada, tincidunt metus ac, bibendum mauris. Ut neque augue, finibus vitae dui a, ultrices ultrices quam. Nunc tristique ac justo non hendrerit. Proin sagittis ex at luctus tempus. Nulla facilisi. Cras orci ligula, varius ac vestibulum vel, tincidunt at nulla. Sed at posuere magna. Vivamus euismod tellus sed quam tempor, et rutrum dui dictum. Aenean tempor lorem fringilla eros convallis, id dapibus tortor maximus. Maecenas finibus nulla in ipsum aliquam, in aliquam eros sodales. Donec malesuada elementum viverra."]
      [:p "Etiam euismod ipsum pretium aliquet sagittis. Integer nec nulla placerat, ultrices odio ac, accumsan tellus. Cras dignissim, ligula et viverra tincidunt, felis massa lobortis erat, eget iaculis lacus felis vel tellus. Sed in ligula eu lorem pretium tincidunt id id mauris. Proin luctus tellus sit amet ipsum congue, nec fermentum sapien molestie. Donec hendrerit maximus erat, ac dapibus mauris tincidunt eu. Nam consectetur magna ex, cursus imperdiet elit fringilla non. Suspendisse id suscipit risus, vel egestas orci. Suspendisse accumsan quam pharetra, auctor dolor non, tincidunt nisi. Suspendisse faucibus malesuada sem sit amet dignissim. Vivamus tincidunt, mauris ut faucibus rutrum, magna ipsum gravida leo, nec dapibus sem purus efficitur dui. Sed sed rutrum metus. Mauris nec eros eu elit convallis aliquet et ut turpis. Nullam ac lectus tellus. Duis sit amet nibh felis."]
      [:p "Nam tincidunt dui non lacus bibendum rhoncus. Vestibulum convallis erat nec libero elementum tempus. Cras viverra purus nisi, vitae ultricies sapien scelerisque scelerisque. Curabitur cursus at justo vel placerat. Mauris est turpis, sollicitudin ac suscipit eu, laoreet eu tortor. Cras faucibus libero a pellentesque ullamcorper. Etiam leo nibh, posuere in mauris finibus, faucibus luctus leo."]
      ])])