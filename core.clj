(defn parse-args
  [[_ & [operator & args]]]
  (list operator args))

(defn main
  []
  (println (str "Hello, " (parse-args *command-line-args*))))

(main)
