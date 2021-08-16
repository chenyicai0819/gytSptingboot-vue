<template>
  <div>
    <h1>国医堂后台登录</h1>
    <el-form label="top" label-width="80px" id="loginForm">
      <el-form-item label="用户名" id="username-input">
        <el-input type="text" name="username" v-model="loginForm.username" />
      </el-form-item>
      <el-form-item label="密码" id="password-input">
        <el-input type="password" name="password" v-model="loginForm.password" />
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="login">登录</el-button>
      </el-form-item>

    </el-form>

  </div>
</template>

<script>

import axios from "axios";
axios.defaults.withCredentials = true;
  export default {
      data: function () {
          return {
              loginForm:{
                  username:'张晓晓',
                  password: '123456'
              }
          }
      },
      methods:{
          login(){
              this.axios({

                  headers: {
                      'Content-Type': 'application/json;charset=UTF-8'
                  },
                  method: 'post',
                  url: `http://localhost:8083/login?username=${this.loginForm.username}&password=${this.loginForm.password}`,
              }).then(res => {
                  console.log(res);
                console.log(this.loginForm.username);
                  //如果res.data为true（不为null）
                  if(res.data.code==1000){
                    // 将拿到的sid放入setsId中
                      this.$store.commit('setsId',res.data.result)
                    sessionStorage.setItem("store",JSON.stringify(res))
                    // 路由：跳转界面到index
                      this.$router.push('/index');
                  }
              })
          }
      }
  }
</script>

<style>
#loginForm{

}
#username-input{
  width: 300px;
  margin: 0 auto;
  padding-bottom: 5px;
}
#password-input{
  width: 300px;
  margin: 0 auto;
  padding-top: 5px;
  padding-bottom: 10px;
}
</style>
