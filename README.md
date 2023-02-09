# OpenAI API tests


## Usage

### Run in development locally
````dev
npm run build
````

### Release the app
````shell
npm run release
````

### Build the app
````shell
npm run build
````

### Deploy the app
````shell
npm run deploy
````


## Idées
- Outil basé en grande partie par Open AI
  - Correcteur orthographique
  - Organisateur (Notes / Rappels / ...)
- Open AI Playground
- Electron desktop app


## TODO
### Tooling
- [x] Setup Tailwind tools (config / treeshaker) with Clojurescript
- [ ] Helper with all tailwind styles declarations
  e.g. (require '[tailwind-helper :as tw]) [:div {:class [tw/text-lg tw/md:text-xl]}]
- [ ] IntelliJ Clojure intellisense for Tailwind classes


## Stack
### Backend : Clojure
  - OPEN AI API
  - Interaction avec l'api OPENAI via un serveur backend

### Frontend : Clojurescript
  - Electron desktop
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


## Ressources
- Project Scatfolding :
  - https://curiousprogrammer.dev/blog/how-can-i-create-a-clojure-script-web-app-from-scratch-with-reagent-and-npm
  - https://curiousprogrammer.dev/blog/how-can-i-use-tailwind-in-my-clojure-script-web-app
  - https://www.youtube.com/watch?v=V-dBmuRsW6w&ab_channel=onthecodeagain
  
- Await / async avec Promesa :https://funcool.github.io/promesa/latest/promises.html
- Setup fullstack Clojure / Clojurescript app : https://www.youtube.com/watch?v=V-dBmuRsW6w&ab_channel=onthecodeagain

- Tailwind :
  - => Voir cet article https://curiousprogrammer.dev/blog/how-can-i-use-tailwind-in-my-clojure-script-web-app/
  - https://github.com/wilkerlucio/tailwind-garden

- Figma :
  - => From Figma to Tailwind : https://www.youtube.com/watch?v=6XIT2nXIbLU&ab_channel=LeeRobinson

- Storybook : 
  - ShadowCLJS + Storybook https://github.com/lilactown/storybook-cljs


## Thanks 
Clarice Bouwer :
 - https://curiousprogrammer.dev/blog/how-can-i-create-a-clojure-script-web-app-from-scratch-with-reagent-and-npm/
 - 
Daniel Amber : 
 - https://daniel-amber.com/
 - https://www.youtube.com/watch?v=V-dBmuRsW6w&ab_channel=onthecodeagain