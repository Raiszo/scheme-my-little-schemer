(defn multisubst [new old lat]
  (when (seq lat)
    (cons
      (if (= old (first lat)) new (first lat))
      (multisubst new old (rest lat)))))