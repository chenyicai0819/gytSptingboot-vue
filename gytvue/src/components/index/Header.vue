<template>
  <div class="header">
    头部区域
    <el-row :gutter="20">
      <el-col :offset="11">
        <el-button type="danger" v-on:click="logout">退出登录</el-button>
      </el-col>
    </el-row>

  </div>
</template>

<script>
import axios from "axios";
axios.defaults.withCredentials = true;
export default {
  name: 'Header',
  methods:{
    logout(){
      console.log("退出登录");
      this.axios({
        headers: {
          'Content-Type': 'application/json;charset=UTF-8'
        },
        method: 'post',
        url: `http://localhost:8083/logout`,
      }).then(res=>{
        console.log(res);
        if (res.data.code==1005){
          this.$router.push('/');
        }
      })
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.header{
  width: 100%;
  height: 100px;
  background-color: pink;
}
</style>
