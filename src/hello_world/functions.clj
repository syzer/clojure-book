(ns hello-world.functions
    (:gen-class))

(defn -main
      "I don't do a whole lot ... yet.LOL"
      [& args]
      (print (get {:a 0 :b 1} :c "Unicorns?")))

(defn no-params
      []
      "no params")
;(no-params)
;"no params"

(defn x-chop
      "How you would like to attack ppl?"
      ([name chop-type]
        (str "I " chop-type " chop " name "! Take that !"))
      ([name]
        (x-chop name "karate"))
      ([]
        "Please use like you mean it"))

;(x-chop "Justin Beaver")
;"I katate chop Justin beaver! Take that !"

;(x-chop "Justin Beaver" "karate")
;"I karate chop Justin Beaver! Take that !"

;(x-chop)
;"Please use like you mean it"

(defn print-that
      [person]
      (str "Please take that: " person))

;;;;;;;;;;;arity and rest
(defn pass-me-many
      [& rest-item]
      (map print-that rest-item))

;(pass-me-many "first" "second" "third")
;("please take that:first" "please take that:second" "please take that:third")

(defn chooser
      [[first-choice second-choice & rest-choices]]
      (println (str "First choice: " first-choice))
      (println (str "Second choice: " second-choice))
      (println (str "Rest choices: " (clojure.string/join "," rest-choices))))

(chooser ["1", "2", "3", "4"])
;First choice: 1
;Second choice: 2
;Rest choices: 3,4


;;;;;;;;; Anonymous functions

((fn [x] (* x 3)) 8)
;24

;shorthand notation
(#(* % 3) 8)
;24


(map #(str "Hi, " %)
     ["Lukas", "Thor"])
;("Hi, Lukas" "Hi, Thor")


;;;;;;;;; function return function
(defn inc-maker
      "Create generator"
      [inc-by]
      #(+ % inc-by))

(+ 1 2 3)

(def inc3 (inc-maker 3))
(inc3 0)
;3