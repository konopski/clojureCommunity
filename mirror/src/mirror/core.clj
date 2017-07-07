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

(defn pol0 [xs ys]
     (case [xs ys]
        [[] []] []
        [[] ys] ys
        [xs []] xs
        (concat [(first xs) (first ys)] (pol0 (rest xs) (rest ys)) ))
)

(defn pol [xs ys]
  (remove nil? (pol0 xs ys))
)

(defn readme [strng] 
     (pol [
      (rest (take-nth 2 (concat [""] (string/split-lines (horizontal strng))))) ][
      (rest (take-nth 2 (concat [""] (string/split-lines (vertical   strng)))))
     ])

)
