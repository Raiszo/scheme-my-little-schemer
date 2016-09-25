(def firsts
  (fn [lst]
    (if (empty? lst)
      '()
      (cons
        (first (first lst))
        (firsts (rest lst))))))
