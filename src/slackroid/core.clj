(ns slackroid.core
  (:require
   [clj-slack-client.core :as slack]))

(defn handle-slack-event
  [event]
  (println "event:" event))

(defn -main
  [& args]
  (slack/connect "API Token" handle-slack-event)
  (println "bot running...")
  (loop []
    (println "...")
    (Thread/sleep 5000)
    (recur)))
