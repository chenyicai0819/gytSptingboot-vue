<template>
    <el-avatar shape="square" :size="40" :src="squareUrl" id="avatar"></el-avatar>
</template>

<script>
export default {
  name: "avatar",
  data(){
    return{
      squareUrl: "https://cube.elemecdn.com/9/c2/f0ee8a3c7c9638a54940382568c9dpng.png",
    }
  }
}
</script>

<style scoped>
#avatar{
  margin-right: 10px;
}
</style>
