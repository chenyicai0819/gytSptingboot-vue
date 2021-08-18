import Vue from 'vue'
import Router from 'vue-router'
import Index from '../components/index/Index'
import Login from "../components/Login";
import MainContent from "../components/index/MainContent";
import ViewUser from "../components/user/ViewUser";
import AddUser from "../components/user/AddUser";
import Register from "../components/Register";

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Login',
      component: Login
    },
    {
      path: '/register',
      name: 'Register',
      component: Register
    },
    {
      path: '/index',
      name: 'Index',
      redirect: '/mainContent',
      component: Index,
      children:[
        {
          path: '/mainContent',
          name: 'MainContent',
          component: MainContent,
          children:[
            {
              path: '/healthProtection/healthPreservation',
              component: ViewUser
            },
            {
              path: '/healthProtection/healthCare',
              component: AddUser
            }
          ]
        }
      ]
    }
  ]
})
