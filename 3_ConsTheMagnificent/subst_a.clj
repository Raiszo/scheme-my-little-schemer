(defn subst [new old lat]
  (when (seq lat)
    (if (= old (first lat))
      (cons new (rest lat))
      (cons
        (first lat)
        (subst new old (rest lat))))))