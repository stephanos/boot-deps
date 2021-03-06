(set-env!
  :source-paths #{"src"}
  :dependencies '[[adzerk/bootlaces    "0.1.8" :scope "test"]])

(require '[adzerk.bootlaces :refer :all])

(def +version+ "0.1.3")

(bootlaces! +version+)

(task-options!
 pom  {:project     'boot-deps
       :version     +version+
       :description "Boot task to find outdated dependencies."
       :url         "https://github.com/martinklepsch/boot-deps"
       :scm         {:url "https://github.com/martinklepsch/boot-deps"}
       :license     {"EPL" "http://www.eclipse.org/legal/epl-v10.html"}})
