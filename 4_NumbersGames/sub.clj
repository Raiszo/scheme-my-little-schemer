(def sub'
  (fn [n m]
    (if (zero? m)
      n
      (sub1 (sub' n (sub1 m))))))