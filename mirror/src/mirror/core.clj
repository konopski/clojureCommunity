(ns mirror.core
  (:require [clojure.string :as string]))


(defn vertical [strng]
  (->> strng
        string/split-lines 
        (map (comp #(apply str %) reverse))
        (string/join "\n") )
)
  
(defn horizontal [strng] 
  (->> strng
        string/split-lines 
        reverse
        (string/join "\n") )
)

(defn readme [strng] 
  (->> strng
        string/split-lines 
        reverse
        (string/join "\n") )
)
