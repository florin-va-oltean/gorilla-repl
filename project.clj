;;;; This file is part of gorilla-repl. Copyright (C) 2014-, Jony Hudson.
;;;;
;;;; gorilla-repl is licenced to you under the MIT licence. See the file LICENCE.txt for full details.

(defproject org.clojars.jenshweber/gorilla-repl "0.9.0"
  :description "A rich REPL for Clojure in the notebook style."
  :url "https://github.com/benfb/gorilla-repl"
  :license {:name "MIT"}
  :dependencies ^:replace [[org.clojure/clojure "1.11.1"]
                           [http-kit "2.6.0" :exclusions [ring/ring-core]]
                           [ring/ring-json "0.5.1" :exclusions [org.clojure/clojure]]
                           [cheshire "5.11.0"]
                           [javax.xml.bind/jaxb-api "2.3.1"]
                           [compojure "1.6.3" :exclusions [ring/ring-core ring/ring-json]]
                           [gorilla-renderable "2.0.0"]
                           [gorilla-plot "0.1.4" :exclusions [org.clojure/clojure]]
                           [grimradical/clj-semver "0.3.0" :exclusions [org.clojure/clojure]]
                           [cider/cider-nrepl "0.30.0" :exclusions [org.clojure/clojure]]
                           [nrepl/nrepl "1.0.0"]]
  :target-path "target/%s"
  :release-tasks [["vcs" "assert-committed"]
                  ["change" "version" "leiningen.release/bump-version" "release"]
                  ["vcs" "commit"]
                  ["vcs" "tag" "v" "--no-sign"]
                  ["deploy"]
                  ["change" "version" "leiningen.release/bump-version"]
                  ["vcs" "commit"]
                  ["vcs" "push"]]
  :deploy-repositories {"releases" {:url "https://repo.clojars.org" :creds :gpg :sign-releases false}})
