{:+ {:app {}

     :editor {"alt-w" [:editor.watch.watch-selection]
              "alt-shift-w" [:editor.watch.unwatch]
              }

     :editor.clj {"pmeta-k" [(:eval.custom "(str (type '__SELECTION__) '__SELECTION__)"
                                           {:result-type :replace})]}

     }

 }