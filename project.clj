(defproject ib-re-actor "0.2.0-SNAPSHOT"
  :description "Clojure friendly wrapper for InteractiveBrokers Java API"
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [clj-time "0.14.2"]
                 [org.clojure/tools.logging "0.4.0"]
                 [clj-logging-config "1.9.12"]]
  :profiles {:dev {:dependencies [[twsapi "9.73.07-SNAPSHOT"]
                                  [midje "1.9.1"]]
                   :plugins [[lein-midje "3.2.1"]
                             [com.gfredericks/how-to-ns "0.1.6"]]
                   :how-to-ns {:require-docstring? false}}})
