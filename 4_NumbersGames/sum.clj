(def sum'
  (fn [n m]
    (if (zero? m)
      n
      (add1 (sum' n (sub1 m))))))
