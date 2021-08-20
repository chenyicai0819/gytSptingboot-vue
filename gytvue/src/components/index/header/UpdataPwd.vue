<template>
  <div>
    <el-button type="danger" @click="dialogVisible=true" id="updataPwd">修改密码</el-button>
    <!--弹框-->
    <el-dialog title="修改密码" :visible.sync="dialogVisible" :close-on-click-modal="true" :modal="true" :show-close="true" :center="true" width="400px">
      <el-form :label-position="labelPosition" label-width="80px" :model="formLabelAlign">
        <el-form-item label="电话号码">
          <el-input v-model="formLabelAlign.phone" @change="verifyPwd"></el-input>
          <i class="el-icon-circle-close" v-bind:style="{color:'#FF0000'}" v-show="phoneShow">电话号码错误</i>
        </el-form-item>
        <el-form-item label="旧密码">
          <el-input v-model="formLabelAlign.oldPwd" @change="verifyOldPwd"></el-input>
          <i class="el-icon-circle-close" v-bind:style="{color:'#FF0000'}" v-show="oldPwdShow">旧密码错误</i>
        </el-form-item>
        <el-form-item label="新密码">
          <el-input v-model="formLabelAlign.newPwd1"></el-input>
        </el-form-item>
        <el-form-item label="确认密码">
          <el-input v-model="formLabelAlign.newPwd2"></el-input>
          <i class="el-icon-circle-close" v-bind:style="{color:'#FF0000'}" v-show="newPwdShow">两次输入的密码不一致</i>
        </el-form-item>
        <el-button @click="dialogVisible = false">取 消</el-button>
        <el-button type="primary" @click="updataPwd">确 定</el-button>
      </el-form>
    </el-dialog>
  </div>
</template>

<script>
export default {
  name: "updataPwd",
  data(){
    return{
      dialogVisible: false,
      labelPosition: 'right',
      formLabelAlign: {
        phone: '',
        oldPwd: '',
        newPwd1: '',
        newPwd2:''
      },
      phoneShow:false,
      oldPwdShow:false,
      newPwdShow:false,
      phoneVerify:false,
      oldVerify:false,

    };
  },
  computed: {
    sId() {
      return this.$store.getters.getsId;
    }
  },
  methods:{
    verifyPwd(){
      this.axios({
        headers: {
          'Content-Type': 'application/json;charset=UTF-8'
        },
        method: 'get',
        url: `http://localhost:8083/selectPhone?name=`+this.sId,
      }).then(res => {
        console.log(res.data);
        if (this.formLabelAlign.phone!=res.data){
          this.$message('电话号码错误');
          this.phoneShow=true;
          this.phoneVerify=false;
        }else{
          this.phoneShow=false;
          this.phoneVerify=true;
        }
      })
    },
    verifyOldPwd(){
      this.axios({
        headers: {
          'Content-Type': 'application/json;charset=UTF-8'
        },
        method: 'get',
        url: `http://localhost:8083/selectOldPwd?name=`+this.sId,
      }).then(res => {
        console.log(res.data);
        if (this.formLabelAlign.oldPwd!=res.data){
          this.$message('旧密码错误');
          this.oldPwdShow=true;
          this.oldVerify=false;
        }else{
          this.oldPwdShow=false;
          this.oldVerify=true;
        }
      })
    },
    updataPwd() {
      console.log("修改密码");
      let phone=this.formLabelAlign.phone;
      let oldPwd=this.formLabelAlign.oldPwd;
      let newPwd1=this.formLabelAlign.newPwd1;
      let newPwd2=this.formLabelAlign.newPwd2;
      if (phone!=''&&oldPwd!=''&newPwd1!=''&newPwd2!=''){
        if(this.phoneVerify==false||this.oldVerify==false){
          this.$alert('电话号码或者旧密码不对', '出错了', {
            confirmButtonText: '确定',
          });
        }
        else if (newPwd1!=newPwd2){
          this.$alert('两次输入的密码不一致', '出错了', {
            confirmButtonText: '确定',
          });
        }
        else{
          this.updataPost();
        }
      }else{
        this.$message('请完整填写内容');
      }
    },
    updataPost(){
      this.axios({
        headers: {
          'Content-Type': 'application/json;charset=UTF-8'
        },
        method: 'get',
        url: `http://localhost:8083/updataPwd?username=`+this.sId+`&password=`+this.formLabelAlign.newPwd2,
      }).then(res => {
        if (res.data==true){
          this.$message({
            message: '恭喜你，密码修改成功',
            type: 'success'
          });
          this.dialogVisible=false
        }else{
          this.$message.error('密码修改失败');
        }
      })
    }
  }
}
</script>

<style scoped>
#updataPwd{
  margin-right: 10px;
}
</style>
