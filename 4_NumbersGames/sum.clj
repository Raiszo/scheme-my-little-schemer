(def sum'
  (fn [n m]
    (if (zero? m)
      n
      :else (add1 (sum' n (sub1 m))))))