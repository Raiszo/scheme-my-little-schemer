(defn firsts [lst]
  (when (seq lst)
    (cons
      (first (first lst))
      (firsts (rest lst)))))
