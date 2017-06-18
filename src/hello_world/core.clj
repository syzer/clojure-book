(ns hello-world.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet.LOL"
  [& args]
  (print (get {:a 0 :b 1} :c "Unicorns?")))

;lein repl
(:d {:a 1 :b 2 :c 3} "Yeah way this runs!")
;"Yeah way this runs!"


;vectors
(get [3 2 1] 0)
;3

;lists
(nth '(:a :b :c) 0)
;:a

(list 1 "two" {3  4})

(conj '(1 2 3) 4)
;(4 1 2 3)
