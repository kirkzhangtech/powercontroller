<template>
  <div id="app">
    <img src="./assets/logo.png">
    <router-view/>
  </div>
</template>

<script>
// export default 表示你要导出一个默认的对象，这样在其他文件中可以通过 import 语句来引入这个组件。
// { name: 'app' } 是一个对象，其中的 name 属性用于给这个组件命名 , 通常是为了在脚本中选中这个组件名字
export default {
  name: 'App'
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
