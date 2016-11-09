(def pick'
  (fn [n lat]
    (if (zero? (- n 1))
      (first lat)
      (pick' (- n 1) (rest lat)))))