# Name

Overview

## Description

## Demo

## Features

- feature:1
- feature:2

## Requirement

## Usage

### Angular-CLI Docker Container
#### Update angular-cli submodule

```
$ git submodule update --init --recursive
```
#### Docker Container Build

```
$ docker build -t angular-cli ./angular-cli
```

### Anglar Procject Template
#### Create Angular Project
```
$ docker run --rm -it -v (pwd):/app shinyay/angular-cli ng new angularclient
```

#### Fix vulnerbility
```
$ docker run --rm -it -v (pwd)/angularclient:/app shinyay/angular-cli npm audit fix
```

#### Show vulnerbility details
```
$ docker run --rm -it -v (pwd)/angularclient:/app shinyay/angular-cli npm audit
```

## Installation

## Licence

Released under the [MIT license](https://gist.githubusercontent.com/shinyay/56e54ee4c0e22db8211e05e70a63247e/raw/44f0f4de510b4f2b918fad3c91e0845104092bff/LICENSE)

## Author

[shinyay](https://github.com/shinyay)
