
{:+ {:app {}

    :editor {"alt-w" [:editor.watch.watch-selection]
             "pmeta-/"  [:toggle-comment-selection]
              "alt-shift-w" [:editor.watch.unwatch]
              }
    :editor.clj {"pmeta-e" [(:eval.custom "(do (require 'kibit.check)
                                           (if-let [better (kibit.check/check-expr '__SELECTION__)]
                                             (:alt better)
                                             '__SELECTION__
                                           ))"
                                           {:result-type :replace})]

                  "pmeta-i" [(:eval.custom "(str (type '__SELECTION__ ) \" \" '__SELECTION__ )"
                                           {:result-type :replace})]
     
                  "pmeta-p" [(:eval.custom "*ns*"
                                           {:result-type :inline})]}     

;;     :editor.clj {"pmeta-p" [(:eval.custom " (let [commands (clojure.string/split-lines '__SELECTION*__ )
;;                                                   output (map (fn [command]
;;                                                     (->> (clojure.string/split command #\"\\s+\") (apply clojure.java.shell/sh) (:out))) commands)]
;;                                                   (clojure.string/join \"\\n\" output ))                                          "
;;                                            {:result-type :replace})]}





      :tabs {
      "ctrl-pageup" [:tabs.prev]
      "ctrl-pagedown " [:tabs.next]
      }

     }

 }
