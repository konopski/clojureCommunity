(ns mirror.core
  (:require [clojure.string :as string]))


(defn vertical [strng] 
  (map #(apply str %) (map reverse (string/split-lines strng) ) ) ) 
  

(defn horizontal [strng] 
  "return mirrored strng")
  
