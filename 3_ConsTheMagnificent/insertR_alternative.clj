(defn insertR [new old lat]
  (when (seq lat)
    (cons
      (first lat)
      (if (= (first lat) old)
        (cons new (rest lat))
        (insertR new old (rest lat))))))