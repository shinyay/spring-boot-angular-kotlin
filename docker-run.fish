#!/usr/bin/env fish

docker run --rm -it -d --name angular-app -v (pwd)/angularclient:/app -p 4200:4200 shinyay/angular-cli ng serve --host 0.0.0.0 --poll=2000
