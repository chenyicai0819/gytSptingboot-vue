import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex);

export const store =new Vuex.Store({
  state:{
    sId:0
  },
  mutations:{
    setsId(state,data){
      state.sId=data;
    }
  },
  actions:{},
  getters:{
    getsId(state) {
      console.log("获取userId的值："+state.sId)
      return state.sId
    }
  }
})
