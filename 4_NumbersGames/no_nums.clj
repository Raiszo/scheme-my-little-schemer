(defn no-nums [lst]
  (when (seq lst)
    (if (number? (first lst))
      (cons (first lst) (no-nums (rest lst)))
      (no-nums (rest lst)))))