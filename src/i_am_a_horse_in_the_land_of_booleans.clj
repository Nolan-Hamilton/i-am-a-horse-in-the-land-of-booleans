(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if(= x false)
    false
    (if (= x nil) false true)))
;    (false)
;    (if(= x nil)
;      (false)
;      (true))))  

(defn abs [x]
  (if (< x 0)
    (* x -1)
    x))

(defn divides? [divisor n]
  (if (== (mod n divisor) 0)
    true
    false))

(defn fizzbuzz [n]
  (if (divides? 15 n)
	  "gotcha!"
	  (if (divides? 5 n)
	     "buzz"
	     (if (divides? 3 n)
		     "fizz"
		     ""))))

(defn teen? [age]
  (if (< 12 age 20)
    true
    false))
;  (if (< age 13)
;    false
;    (if (> age 19)
;      false
;      true)))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (if (number? x)
    (* 2 x)
    (if (empty? x)
      nil
      (if (list? x)
        (* 2 (count x))
        (if (vector? x)
          (* 2 (count x))
          true)))))

(defn leap-year? [year]
  (if(not (== (mod year 4) 0))
    false
    (if(not (== (mod year 100) 0))
      true
      (if(not (== (mod year 400) 0))
        false
        true))))

; '_______'
