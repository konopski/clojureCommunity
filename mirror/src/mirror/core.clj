(ns mirror.core
  (:require [clojure.string :as string]))


(defn vertical [strng] 
 (string/join "\n" (map (comp #(apply str %) reverse) (string/split-lines strng) ) ) )  
  

(defn horizontal [strng] 
  "return mirrored strng")
