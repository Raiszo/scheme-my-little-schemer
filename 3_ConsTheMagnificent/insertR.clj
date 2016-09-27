(def insertR
  (fn [new old lat]
    (cond
      (empty? lat) '()
      (= (first lat) old) (cons (first lat) (cons new (rest lat)))
      :else (cons (first lat) (insertR new old (rest lat))))))