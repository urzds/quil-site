; Erkläre dem Computer, daß wir Quil zum Malen verwenden wollen
(ns my.core
  (:require [quil.core :as q :include-macros true]
            [quil.middleware :as m]))

; Lege Starteinstellungen fest
(defn start []
  (q/color-mode :hsb)
  {})

; Male! Nichts... :(
(defn malen [daten])

; Erzeuge eine Zeichenfläche
(q/defsketch my
  :host "host"
  :size [500 500]
  :draw malen
  :setup start
  :middleware [m/fun-mode])
