import Vue from 'vue'
import App from './App.vue'
//import draggable from "@/vuedraggable";
Vue.config.productionTip = false
//Event bus
export const bus = new Vue();
new Vue({
render: h => h(App),
}).$mount('#app')
