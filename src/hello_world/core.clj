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

(+ 1 2 3 4)
;10

(list 1 "two" {3  4})

(conj '(1 2 3) 4)
;(4 1 2 3)

(if true
  "first expression"
  "second expression")
;"first expression"

(if true
  (do (println "true expression")
      "return true expression")
  (do (println "false expression")
      "return false expression"))
;true expression
;"return true expression"


(nil? 1)
;false

(when true
      ((println "Success")
        "Return Success"))

(= nil nil)
;true


(if nil
  "nil is not true"
  "this is falsey")
;"this is falsey"

;define velues
(def people
  ["Larry King", "Joe Blow", "Mr. Smith"])

;people
;["Larry King" "Joe Blow" "Mr. Smith"]

;sets
(hash-set 7 7 2 2)
;#{7 2}

(contains? #{:a :b} :a)
;true

(conj #{:a :b} :b)
;#{:b :a}

(set [3 3 4 5])
;#{4 3 5}

((or + -) 1 2 3)
;6

((and (= 1 1) +) 1 2 3)
;6

(map inc [0 1 2 3])
;(1 2 3 4)

