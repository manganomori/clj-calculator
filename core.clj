(load-file "./parsers.clj")

(ns clj-calculator.core)

(require '[clj-calculator.parser :as parser])

(defn main
  []
  (println (parser/call  *command-line-args*)))

(main)
