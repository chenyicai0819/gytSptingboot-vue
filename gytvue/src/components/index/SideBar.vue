<template>
  <div class="sideBar">
    <ul v-for="menu in allMenus" class="caidan">
      <tree-menu :menu="menu"></tree-menu>
    </ul>
  </div>
</template>

<script>
import treeMenu from "./treeMenu";

export default {
  name: 'SideBar',
  // 发送给子组件的信息
  data() {
    return {
      allMenus: [],
      roleId:'',
    }
  },
  el:'.son',
  methods:{
    toggle:()=>{
    }
  },
  // 注册组件
  components: {
    treeMenu
  },
  // 拿到store里的内容
  computed: {
    sId() {
      return this.$store.getters.getsId;
    }
  },
  mounted() {
    //使用axios发送ajax请求获取菜单
    console.log("用户身份：" + sessionStorage.getItem("sId"))
    this.axios({
      method: 'get',
      // url: 'http://localhost:8083/getUserRole?sId=' + this.sId
      url:'http://rap2api.taobao.org/app/mock/data/2048418'
    }).then(res => {
      console.log(res.data);
      console.log(res.data.roleId);
      //把后台获取到的菜单赋值给Vue实例的allMenus属性
      if(res.data.roleId=='ro101');
      this.allMenus = [
        {
          menu_name: "预防保健",
          menu_url: "",
          id: "1",
          level: "1",
          pid: "",
          childTrees: [
            {
              menu_name: "节气养生",
              menu_url: "/healthProtection/healthPreservation",
              id: "1-1",
              level: "2",
              pid: "1",
              childTrees: []
            }, {
              menu_name: "自我保健",
              menu_url: "/healthProtection/healthCare",
              id: "1-2",
              level: "2",
              pid: "1",
              childTrees: []
            }, {
              menu_name: "药膳食疗",
              menu_url: "/healthProtection/foodTreat",
              id: "1-3",
              level: "2",
              pid: "1",
              childTrees: []
            }, {
              menu_name: "中药常识",
              menu_url: "/ChineseMedicine/chineseMedicine",
              id: "1-4",
              level: "2",
              pid: "1",
              childTrees: []
            }, {
              menu_name: "中医文化",
              menu_url: "/healthProtection/chineseCultural",
              id: "1-5",
              level: "2",
              pid: "1",
              childTrees: []
            }, {
              menu_name: "儿童健康",
              menu_url: "/healthProtection/kidsHealth",
              id: "1-6",
              level: "2",
              pid: "1",
              childTrees: []
            }
          ]
        }, {
          menu_name: "信息管理",
          menu_url: "",
          id: "2",
          level: "1",
          pid: "",
          childTrees: [
            {
              menu_name: "号源管理",
              menu_url: "/signalSource/sourceManage",
              id: "2-1",
              level: "2",
              pid: "2"
            }, {
              menu_name: "服务团队",
              menu_url: "/doctor/doctor",
              id: "2-2",
              level: "2",
              pid: "2"
            }, {
              menu_name: "开展项目",
              menu_url: "/project/characteri",
              id: "2-3",
              level: "2",
              pid: "2"
            }, {
              menu_name: "功效特色",
              menu_url: "/project/project",
              id: "2-4",
              level: "2",
              pid: "2"
            },
          ]
        }
      ]
    })
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.sideBar {
  width: 150px;
  height: 800px;
  background-color: yellow;
  float: left;
}
</style>
