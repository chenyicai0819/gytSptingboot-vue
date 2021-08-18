<template>
  <div class="header">
    头部区域
    <div id="header-user">
      <Avatar/>
      <UpdataPwd/>
      <el-button type="danger" v-on:click="logout">退出登录</el-button>
    </div>
  </div>
</template>

<script>

import axios from "axios";
import Avatar from "./header/Avatar";
import UpdataPwd from "./header/UpdataPwd";

axios.defaults.withCredentials = true;
export default {
  name: 'Header',
  components: {UpdataPwd, Avatar},

  computed: {
    sId() {
      return this.$store.getters.getsId;
    }
  },
  methods: {
    logout() {
      console.log("退出登录");
      this.axios({
        headers: {
          'Content-Type': 'application/json;charset=UTF-8'
        },
        method: 'post',
        url: `http://localhost:8083/logout`,
      }).then(res => {
        console.log(res);
        if (res.data.code == 1005) {
          // 退出之后清除sessionstorage中的数据
          sessionStorage.removeItem("storedata");
          sessionStorage.removeItem("isLogin");
          this.$router.push('/');
        }
      })
    },

  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.header {
  width: 100%;
  height: 100px;
  background-color: pink;
}

#header-user {
  display: flex;
  /*flex布局右对其;*/
  justify-content: flex-end;
  margin-right: 10px;
}

</style>
