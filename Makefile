all:
	lein cljsbuild once
	lein run -m quil-site.core/run 8080
