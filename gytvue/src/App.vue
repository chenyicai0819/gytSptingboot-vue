<template>
  <div id="app">
    <!--<img src="./assets/logo.png">-->
    <router-view/>
  </div>
</template>

<script>
export default {
  name: 'App',
  //防止在刷新页面时丢失登陆状态
  created:function() {
    //在页面加载时读取sessionStorage里的状态信息 如果有的话就存进vuex里面
    if (sessionStorage.getItem("storedata") ) {
      this.$store.replaceState(Object.assign({},
        this.$store.state,JSON.parse(sessionStorage.getItem("storedata"))))
    }
    //在页面刷新时将vuex里的信息保存到sessionStorage里
    window.addEventListener("beforeunload",()=>{
      sessionStorage.setItem("storedata",JSON.stringify(this.$store.state))
    });
    //如果页面加载的时候sessionstorage没有的话 就从vuex中取
    sessionStorage.setItem("isLogin",this.$store.state.isLogin)

  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
</style>
