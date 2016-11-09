(def exp'
  (fn [n m]
    (if (zero? m)
      1
      (* n (exp' n (- m 1))))))