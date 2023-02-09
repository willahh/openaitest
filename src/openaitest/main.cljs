(ns openaitest.main)


(defn main
      []
      [:div.min-h-full
       [:nav.border-b.border-gray-200.bg-white
        [:div.mx-auto.max-w-7xl.px-4.sm:px-6.lg:px-8
         [:div.flex.h-16.justify-between
          [:div.flex
           [:div.flex.flex-shrink-0.items-center
            [:img.block.h-8.w-auto.lg:hidden {:src "https://tailwindui.com/img/logos/mark.svg?color=indigo&shade=600" :alt "Your Company"}]
            [:img.hidden.h-8.w-auto.lg:block {:src "https://tailwindui.com/img/logos/mark.svg?color=indigo&shade=600" :alt "Your Company"}]]
           [:div.hidden.sm:-my-px.sm:ml-6.sm:flex.sm:space-x-8
            [:a.border-indigo-500.text-gray-900.inline-flex.items-center.px-1.pt-1.border-b-2.text-sm.font-medium {:href "#" :aria-current "page"} "Dashboard"]
            [:a.border-transparent.text-gray-500.hover:border-gray-300.hover:text-gray-700.inline-flex.items-center.px-1.pt-1.border-b-2.text-sm.font-medium {:href "#"} "Team"]
            [:a.border-transparent.text-gray-500.hover:border-gray-300.hover:text-gray-700.inline-flex.items-center.px-1.pt-1.border-b-2.text-sm.font-medium {:href "#"} "Projects"]
            [:a.border-transparent.text-gray-500.hover:border-gray-300.hover:text-gray-700.inline-flex.items-center.px-1.pt-1.border-b-2.text-sm.font-medium {:href "#"} "Calendar"]]]
          [:div.hidden.sm:ml-6.sm:flex.sm:items-center
           [:button.rounded-full.bg-white.p-1.text-gray-400.hover:text-gray-500.focus:outline-none.focus:ring-2.focus:ring-indigo-500.focus:ring-offset-2 {:type "button"}
            [:span.sr-only "View notifications"]
            [:svg.h-6.w-6 {:xmlns "http://www.w3.org/2000/svg" :fill "none" :viewBox "0 0 24 24" :stroke-width "1.5" :stroke "currentColor" :aria-hidden "true"}
             [:path {:stroke-linecap "round" :stroke-linejoin "round" :d "M14.857 17.082a23.848 23.848 0 005.454-1.31A8.967 8.967 0 0118 9.75v-.7V9A6 6 0 006 9v.75a8.967 8.967 0 01-2.312 6.022c1.733.64 3.56 1.085 5.455 1.31m5.714 0a24.255 24.255 0 01-5.714 0m5.714 0a3 3 0 11-5.714 0"}]]]
           [:div.relative.ml-3
            [:div
             [:button#user-menu-button.flex.max-w-xs.items-center.rounded-full.bg-white.text-sm.focus:outline-none.focus:ring-2.focus:ring-indigo-500.focus:ring-offset-2 {:type "button" :aria-expanded "false" :aria-haspopup "true"}
              [:span.sr-only "Open user menu"]
              [:img.h-8.w-8.rounded-full {:src "https://images.unsplash.com/photo-1472099645785-5658abf4ff4e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=facearea&facepad=2&w=256&h=256&q=80" :alt ""}]]]
            [:div.absolute.right-0.z-10.mt-2.w-48.origin-top-right.rounded-md.bg-white.py-1.shadow-lg.ring-1.ring-black.ring-opacity-5.focus:outline-none {:role "menu" :aria-orientation "vertical" :aria-labelledby "user-menu-button" :tabindex "-1"}
             [:a#user-menu-item-0.block.px-4.py-2.text-sm.text-gray-700 {:href "#" :role "menuitem" :tabindex "-1"} "Your Profile"]
             [:a#user-menu-item-1.block.px-4.py-2.text-sm.text-gray-700 {:href "#" :role "menuitem" :tabindex "-1"} "Settings"]
             [:a#user-menu-item-2.block.px-4.py-2.text-sm.text-gray-700 {:href "#" :role "menuitem" :tabindex "-1"} "Sign out"]]]]
          [:div.-mr-2.flex.items-center.sm:hidden
           [:button.inline-flex.items-center.justify-center.rounded-md.bg-white.p-2.text-gray-400.hover:bg-gray-100.hover:text-gray-500.focus:outline-none.focus:ring-2.focus:ring-indigo-500.focus:ring-offset-2 {:type "button" :aria-controls "mobile-menu" :aria-expanded "false"}
            [:span.sr-only "Open main menu"]
            [:svg.block.h-6.w-6 {:xmlns "http://www.w3.org/2000/svg" :fill "none" :viewBox "0 0 24 24" :stroke-width "1.5" :stroke "currentColor" :aria-hidden "true"}
             [:path {:stroke-linecap "round" :stroke-linejoin "round" :d "M3.75 6.75h16.5M3.75 12h16.5m-16.5 5.25h16.5"}]]
            [:svg.hidden.h-6.w-6 {:xmlns "http://www.w3.org/2000/svg" :fill "none" :viewBox "0 0 24 24" :stroke-width "1.5" :stroke "currentColor" :aria-hidden "true"}
             [:path {:stroke-linecap "round" :stroke-linejoin "round" :d "M6 18L18 6M6 6l12 12"}]]]]]]
        [:div#mobile-menu.sm:hidden
         [:div.space-y-1.pt-2.pb-3
          [:a.bg-indigo-50.border-indigo-500.text-indigo-700.block.pl-3.pr-4.py-2.border-l-4.text-base.font-medium {:href "#" :aria-current "page"} "Dashboard"]
          [:a.border-transparent.text-gray-600.hover:bg-gray-50.hover:border-gray-300.hover:text-gray-800.block.pl-3.pr-4.py-2.border-l-4.text-base.font-medium {:href "#"} "Team"]
          [:a.border-transparent.text-gray-600.hover:bg-gray-50.hover:border-gray-300.hover:text-gray-800.block.pl-3.pr-4.py-2.border-l-4.text-base.font-medium {:href "#"} "Projects"]
          [:a.border-transparent.text-gray-600.hover:bg-gray-50.hover:border-gray-300.hover:text-gray-800.block.pl-3.pr-4.py-2.border-l-4.text-base.font-medium {:href "#"} "Calendar"]]
         [:div.border-t.border-gray-200.pt-4.pb-3
          [:div.flex.items-center.px-4
           [:div.flex-shrink-0
            [:img.h-10.w-10.rounded-full {:src "https://images.unsplash.com/photo-1472099645785-5658abf4ff4e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=facearea&facepad=2&w=256&h=256&q=80" :alt ""}]]
           [:div.ml-3
            [:div.text-base.font-medium.text-gray-800 "Tom Cook"]
            [:div.text-sm.font-medium.text-gray-500 "tom@example.com"]]
           [:button.ml-auto.flex-shrink-0.rounded-full.bg-white.p-1.text-gray-400.hover:text-gray-500.focus:outline-none.focus:ring-2.focus:ring-indigo-500.focus:ring-offset-2 {:type "button"}
            [:span.sr-only "View notifications"]
            [:svg.h-6.w-6 {:xmlns "http://www.w3.org/2000/svg" :fill "none" :viewBox "0 0 24 24" :stroke-width "1.5" :stroke "currentColor" :aria-hidden "true"}
             [:path {:stroke-linecap "round" :stroke-linejoin "round" :d "M14.857 17.082a23.848 23.848 0 005.454-1.31A8.967 8.967 0 0118 9.75v-.7V9A6 6 0 006 9v.75a8.967 8.967 0 01-2.312 6.022c1.733.64 3.56 1.085 5.455 1.31m5.714 0a24.255 24.255 0 01-5.714 0m5.714 0a3 3 0 11-5.714 0"}]]]]
          [:div.mt-3.space-y-1
           [:a.block.px-4.py-2.text-base.font-medium.text-gray-500.hover:bg-gray-100.hover:text-gray-800 {:href "#"} "Your Profile"]
           [:a.block.px-4.py-2.text-base.font-medium.text-gray-500.hover:bg-gray-100.hover:text-gray-800 {:href "#"} "Settings"]
           [:a.block.px-4.py-2.text-base.font-medium.text-gray-500.hover:bg-gray-100.hover:text-gray-800 {:href "#"} "Sign out"]]]]]
       [:div.py-10
        [:header
         [:div.mx-auto.max-w-7xl.px-4.sm:px-6.lg:px-8
          [:h1.text-3xl.font-bold.leading-tight.tracking-tight.text-gray-900 "Dashboard"]]]
        [:main
         [:div.mx-auto.max-w-7xl.sm:px-6.lg:px-8
          [:div.px-4.py-8.sm:px-0
           [:div.h-96.rounded-lg.border-4.border-dashed.border-gray-200]]]]]])
