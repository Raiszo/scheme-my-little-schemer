(def mult
  (fn [n m]
    (if (zero? m)
      0
      (+ n (mult n (- m 1))))))