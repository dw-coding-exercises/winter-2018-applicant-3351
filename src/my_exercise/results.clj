(ns my-exercise.results
  (:require [hiccup.page :refer [html5]]))

(defn header [_]
  [:head
   [:meta {:charset "UTF-8"}]
   [:meta {:name "viewport"
           :content "width=device-width, initial-scale=1.0, maximum-scale=1.0"}]
   [:title "Find my next election"]
   [:link {:rel "stylesheet" :href "default.css"}]])

(defn pagecontent [body]
  [:h1 body]
    (println (get-in body [(def returnedbody [{:keys [street street-2 city state zip] :as :form-params})]))
    [:p "First even clojure redirect!"])

(defn otherpage [body]
  (html5
    (header body)
    (pagecontent body)))