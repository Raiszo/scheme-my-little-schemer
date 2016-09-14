(def member?
  (fn [e lat]
    (cond
      (empty? lat) false
      (= (first lat) e) true
      :else (member? e (rest lat)))))
