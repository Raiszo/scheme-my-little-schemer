(def atom? #(not (seq? %)))
(def operator #(first %))
(def fst-expre #(first (rest %)))
(def snd-expre #(first (rest (rest %))))

(def atom-to-func
  (fn [x]
    (cond
      (= x '+) +
      (= x '-) -
      (= x '*) *)))

(def value
  (fn [nexp]
    (cond 
      (atom? nexp) nexp
      :else
        ((atom-to-func (operator nexp))
          (value (fst-expre nexp))
          (value (snd-expre nexp))))))