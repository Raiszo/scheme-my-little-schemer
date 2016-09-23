(def rember
  (fn [a lst]
    (cond
      (empty? lst) '()
      (= a (first lst)) (rest lst)
      :else (cons (first lst) (rember a (rest lst))))))
