(ns clj-website.prod
  (:require [clj-website.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
