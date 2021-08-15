<template>
  <div class="mainContent">
    内容区
    <router-view></router-view>
  </div>
</template>

<script>
export default {
  name: 'MainContent'
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.mainContent{
  width:100%;
  height: 800px;
  background-color: gray;
}
</style>
