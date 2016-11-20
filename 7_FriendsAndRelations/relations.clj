(defn firsts [rel]
  (when (seq rel)
    (cons (first (first rel)) (firsts (rest rel)))))

(defn fun? [rel]
  (set?' (firsts rel)))

(defn revpair [pair]
  (build (snd pair) (fst pair)))

(defn revrel [rel]
  (when (seq rel)
    (cons
      (revpair (first rel))
      (revrel (rest rel)))))

(defn one-to-one? [fun]
  (fun? (revrel fun)))