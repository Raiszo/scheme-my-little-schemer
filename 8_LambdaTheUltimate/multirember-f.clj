(def multirember-f
  (fn [test?]
    (fn [old lat]
      (when (seq lat)
        (if (test? old (first lat))
          ((multirember-f test?) old (rest lat))
          (cons (first lat) ((multirember-f test?) old (rest lat))))))))

(def multirember-eq (multirember-f =))