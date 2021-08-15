<template>
  <div>
    <form action="">
      用户名：<input type="text" name="username" v-model="loginForm.username">
      密  码：<input type="password" name="password" v-model="loginForm.password">
      <input type="button" value="登录" @click="login">
    </form>
  </div>
</template>

<script>


  export default {
      data: function () {
          return {
              loginForm:{
                  username:'陈益财',
                  password: '111111'
              }
          }
      },
      methods:{
          login(){
              this.axios({
                  headers: {
                      'Content-Type': 'application/json;charset=UTF-8'
                  },
                  method: 'get',
                  // url: 'http://localhost:8083/login',
                  url:'http://rap2api.taobao.org/app/mock/data/2048418',
                  data: JSON.stringify(this.loginForm)
              }).then(res => {
                  console.log(res.data);
                  //如果res.data为true（不为null）
                  /*if(res.data){
                    // 将拿到的sid放入setsId中
                      this.$store.commit('setsId',res.data.sId)
                    // 路由：跳转界面到index
                      this.$router.push('/index');
                  }*/
                  this.$router.push('/index')
              })
          }
      }
  }
</script>

<style>

</style>
