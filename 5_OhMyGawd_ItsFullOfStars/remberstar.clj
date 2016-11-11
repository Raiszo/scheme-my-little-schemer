(defn rember' [a lst]
  (when (seq lst)
    (cond
      (seq? (first lst)) (cons (rember' a (first lst)) (rember' a (rest lst)))
      (= a (first lst)) (rember' a (rest lst))
      :else (cons (first lst) (rember' a (rest lst))))))