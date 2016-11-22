(def multiremberT
  (fn [test? lat]
    (when (seq lat)
      (if (test? (first lat))
        (multiremberT test? (rest lat))
        (cons (first lat) (multiremberT test? (rest lat)))))))