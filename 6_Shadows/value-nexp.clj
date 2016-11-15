(def operator #(first %))
(def fst_sub_exp #(first (rest %)))
(def snd_sub_exp #(first (rest (rest %))))

(defn value' [aexp]
  (if (seq? aexp)
    ((if (= (operator aexp) '+) + - ) (value' (fst_sub_exp aexp)) (value' (snd_sub_exp aexp)))
    aexp))