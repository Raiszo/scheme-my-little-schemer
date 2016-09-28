(defn multiinsertR [new old lat]
  (when (seq lat)
    (cons
      (first lat)
      (if (= old (first lat))
        (cons new (multiinsertR new old (rest lat)))
        (multiinsertR new old (rest lat))))))