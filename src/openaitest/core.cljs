(ns openaitest.core
  (:require [axios]
            [moment]
            [reagent.dom :as r.dom]
            [openaitest.main :as main]))



(defn a [to text]
      [:a.font-bold.text-yellow-300.hover:text-pink-600 {:href to} text])


(defn app []
      [:div
       [:div.p-8.max-w-full
        [:div.rounded-lg.bg-gray-800.text-white.shadow-xs.py-24.px-4.text-center
         [:div.text-3xl.lg:text-9xl
          [:span "Hello "]
          [:span.font-extrabold.text-transparent.bg-clip-text.bg-gradient-to-r.from-green-400.to-blue-500.font-mono "Tailwind!"]
          [:span " ✌️"]]
         [:div.text-lg.md:text-xl.lg:text-2xl.mt-8.text-gray-400 "Rapidly build modern websites without ever leaving your ClojureScript."]
         [:div.text-lg.md:text-xl.lg:text-2xl.mt-4.text-gray-400
          [:span "'( "]
          [a "https://tailwindcss.com/" "tailwindcss.com"]
          [:span " ... "]
          [a "https://clojurescript.org/" "clojurescript.org"]
          [:span " )"]]]]
       [:div.text-white.text-center.opacity-70.text-md
        [:p "A demo by " [a "https://clarice.bouwer.dev" "Clarice Bouwer"] " at curiousprogrammer.dev"]]
       [::div.text-white.text-center.opacity-50.text-sm.mt-5
        [:span [a "https://benborgers.com/posts/tailwind-gradient-text" "Text gradients"] " by benborgers.com"]]
       [main/main]])


(r.dom/render [app] (js/document.getElementById "app"))

;
;;; Use mock REST API to get data to output to the browser
;(-> (.. axios (get "https://jsonplaceholder.typicode.com/todos/1"))
;    (.then #(js/console.log %)))
;
;
;;; Display the day of the week
;;; https://momentjs.com/docs/
;(js/console.log (.format (moment) "dddd"))
;
;
;(defn app []
;      [:div
;       [:h1 "Example application"]])
;
;
;(r.dom/render [app] (js/document.getElementById "app"))
