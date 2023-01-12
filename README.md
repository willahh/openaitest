# OpenAI API tests


## Idées
- Correcteur orthographique basé sur Open AI
- Open AI Playground


## TODO
### Tooling
- [ ] IntelliJ Clojure intellisense for Tailwind classes


## Stack
### Backend : Clojure
  - OPEN AI API
  - Interaction avec l'api OPENAI via un serveur backend

### Frontend : Clojurescript
  - NPM
    - [Building deps]
      - webpack
      - npm-run-all
      - cross-env
      - postcss-cli
      - postcss
      - postcss-import
      - autoprefixer
    
    - [Deps] 
      - tailwindcss
      - Axios
      - Moment
      - React
  - Clojurescript
    -
- CI 
  - Github Action

- Release / Deploy: Github Action



####
- `npm-run-all` 
Will run multiple scripts in parallel. We'll be generating Tailwind's CSS file and running Figwheel both with hot reloading.

- `cross-env` 
Will set environment variables that we will use in our run scripts.

- `postcss-cli`  
Will run PostCSS which will process and generate our Tailwind CSS file that we will reference in our app.

`PostCSS` 
Tool for transforming CSS with JavaScript.

`PostCSS` 
PostCSS plugin to transform @import rules by inlining content.

`Autoprefixer` 
CSS post-processor that automatically adds vendor-prefixed CSS properties based on the browser capabilities.


## Usage
npm run dev


## Ressources
- Project Scatfolding :
  - https://curiousprogrammer.dev/blog/how-can-i-create-a-clojure-script-web-app-from-scratch-with-reagent-and-npm
  - https://curiousprogrammer.dev/blog/how-can-i-use-tailwind-in-my-clojure-script-web-app
  
- Await / async avec Promesa :https://funcool.github.io/promesa/latest/promises.html
- Setup fullstack Clojure / Clojurescript app : https://www.youtube.com/watch?v=V-dBmuRsW6w&ab_channel=onthecodeagain

- Tailwind :
  - => Voir cet article https://curiousprogrammer.dev/blog/how-can-i-use-tailwind-in-my-clojure-script-web-app/
  - https://github.com/wilkerlucio/tailwind-garden

