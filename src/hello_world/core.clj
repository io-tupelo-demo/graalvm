(ns hello-world.core
  (:require [schema.core :as s])
  (:gen-class))

(s/defn reverse-str :- s/Str
  [s :- s/Str]
  (loop [chars  (seq s)
         result []]
    (if (empty? chars)
      (apply str result)
      (recur (rest chars) (cons (first chars) result)))))

(defn -main
  [& args]
  (println "Hello, World!")
  (println (reverse-str "...eybdooG"))
  )
