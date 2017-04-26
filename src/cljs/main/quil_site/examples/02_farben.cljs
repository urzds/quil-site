(ns my.core
  (:require [quil.core :as q :include-macros true]
            [quil.middleware :as m]))

(defn start []
  (q/color-mode :hsb)
  {})

(defn malen [daten]
  (q/fill 0 255 255) ; Male ab jetzt in Rot!
  (q/ellipse 250 250 100 100)
  (q/fill 30 255 255) ; Male ab jetzt in Orange!
  (q/rect 0 0 30 40))

(q/defsketch my
  :host "host"
  :size [500 500]
  :draw malen
  :setup start
  :middleware [m/fun-mode])
