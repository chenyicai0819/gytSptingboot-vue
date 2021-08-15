<template>
  <li class="son">
    <router-link :to="menu.menu_url">{{menu.menu_name}}</router-link>
    <ul v-if="menu.childTrees">
      <tree-menu v-for="(childMenu,index) in menu.childTrees" :menu="childMenu" :key="index"></tree-menu>
    </ul>
  </li>
</template>

<script>
export default {
  name: "treeMenu",
  // 接收到父组件的信息
  props:['menu']
}
</script>

<style scoped>

</style>
