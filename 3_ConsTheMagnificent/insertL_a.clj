(defn insertL [new old lat]
  (when (seq lat)
    (if (= (first lat) old)
      (cons new lat)
      (cons (first lat) (insertL new old (rest lat))))))