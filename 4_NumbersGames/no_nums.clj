(defn no-nums [lst]
  (when (seq lst)
    (if (number? (first lst))
      (no-nums (rest lst))
      (cons (first lst) (no-nums (rest lst))))))