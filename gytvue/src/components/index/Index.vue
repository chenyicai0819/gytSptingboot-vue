<template>
  <div class="index">
    <Header/>
    <SideBar/>
    <router-view/>
  </div>
</template>

<script>
import Header from './Header'
import SideBar from './SideBar'
import MainContent from './MainContent'

export default {
  name: 'Index',
  // 注册组件
  components:{
    Header,
    SideBar
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.index{
  margin: 0;
  padding: 0;
}
</style>
