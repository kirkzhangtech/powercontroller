import Vue from 'vue'
//这个语句的作用是从 node_modules 目录中导入 Vue.js 库。以下是一些详细信息：
import App from './App'
import router from './router'
import api from './http'
import i18n from './i18n'
import store from './store'
import global from '@/utils/global'
// 从utils目录中导入global文件
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
//从node_modules中导入
import 'font-awesome/css/font-awesome.min.css'

Vue.use(ElementUI)  // 注册使用Element
Vue.use(api)  // 注册使用API模块

Vue.prototype.global = global // 挂载全局配置模块

// 例如，如果在项目中需要获取当前时间戳，可以在main.js中添加如下代码：

// Vue.prototype.$getTimestamp = function() { return new Date().getTime(); }

new Vue({
  el: '#app',
  i18n,
  router,
  store,
  render: h => h(App)
})