(ns clj-calculator.parser)

(defn parse-args
  [[_ & [operator & args]]]
  (list operator args))

(defn parse-float
  [string]
  (float (read-string string)))

(defn format-float
  [float-number]
  (format "%.2f" float-number))

(defn call
  [unparsed-args]

  (let [[operator args] (parse-args unparsed-args)]
    (format-float
     (reduce
      (eval (read-string operator))
      (map parse-float args)))))
