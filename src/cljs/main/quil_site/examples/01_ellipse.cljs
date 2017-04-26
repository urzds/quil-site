(ns my.core
  (:require [quil.core :as q :include-macros true]
            [quil.middleware :as m]))

(defn start []
  (q/color-mode :hsb)
  {})

(defn malen [daten]
  ; Male Ellipse
  (q/ellipse
    0 0   ; Mittelpunkt
    100   ; Breite
    100)) ; Höhe

(q/defsketch my
  :host "host"
  :size [500 500]
  :draw malen
  :setup start
  :middleware [m/fun-mode])
