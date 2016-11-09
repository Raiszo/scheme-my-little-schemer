(defn rempick [n lst]
  (when (seq lst)
    (if (zero? (- n 1))
      (rest lst)
      (cons (first lst) (rempick (- n 1) (rest lst))))))