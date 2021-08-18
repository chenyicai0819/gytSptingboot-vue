<!--注册界面-->
<template>
  <div id="register">
    <h1>国医堂后台用户注册</h1>
    <el-form label="top" label-width="80px" id="loginForm">
      国医堂名称：<el-input type="text" name="gytname" v-model="loginForm.gytname" @change="changeinput" class="register-input" id="gytname-input"/><br/>
      统一社会信用代码：<el-input type="text" name="creditCode" v-model="loginForm.creditCode" @change="changeinput" class="register-input" id="creditCode-input"/><br/>
      用户名：<el-input type="text" name="username" v-model="loginForm.username" @change="changeinput" class="register-input" id="username-input-re"/><br/>
      密码：<el-input type="password" name="password" v-model="loginForm.password" @change="changeinput" class="register-input" id="password-input-re"/><br/>
      确认密码：<el-input type="text" name="enterPassword" v-model="loginForm.enterPassword" @change="changeinput" class="register-input" id="enterPassword-input"/><br/>
      手机号：<el-input type="text" name="phone" v-model="loginForm.phone" @change="changeinput" class="register-input" id="phone-input-re"/><br/>
      验证码：<el-input type="text" name="code" v-model="loginForm.code" @change="changeinput" class="register-input" id="code-input"/>
      <Imgverify @getImgCode="getImgCode" ref="vueImgVerify"/>

      <el-button type="primary" @click="registerUser" style="width: 200px;height: 50px;margin-right: 100px">注册
      </el-button>
    </el-form>
    <el-button type="danger" @click="loadLogin" style="width: 100px;height: 25px;margin-left: 300px">返回登录</el-button>
  </div>
</template>

<script>
import Imgverify from "./Imgverify";
import {registerVerify} from "../utils/RegVer"

export default {
  name: "Register",
  components: {
    Imgverify,
  },
  data() {
    return {
      loginForm: {
        gytname: '',
        creditCode: '',
        username: '',
        password: '',
        enterPassword: '',
        phone: '',
        code: '',
      },
      imgCode: '',
      spanShowFor1:false,

    }
  },
  mounted:function(){
    this.handleClick();
  },
  methods: {
    // 点击图片获取验证码
    getImgCode(code) {
      this.imgCode = code
      console.log('验证码: ' + this.imgCode)
    },
    // 点击按钮获取验证码
    handleClick() {
      this.imgCode = this.$refs.vueImgVerify.draw()
      console.log('验证码: ' + this.imgCode)
    },
    changeinput(){
      if (this.loginForm.gytname!=''){document.getElementById("gytname-input").style.backgroundColor='#FFFFFF'}
      if (this.loginForm.creditCode!=''){document.getElementById("creditCode-input").style.backgroundColor='#FFFFFF'}
      if (this.loginForm.username!=''){document.getElementById("username-input-re").style.backgroundColor='#FFFFFF'}
      if (this.loginForm.password!=''){document.getElementById("password-input-re").style.backgroundColor='#FFFFFF'}
      if (this.loginForm.enterPassword!=''){document.getElementById("enterPassword-input").style.backgroundColor='#FFFFFF'}
      if (this.loginForm.phone!=''){document.getElementById("phone-input-re").style.backgroundColor='#FFFFFF'}
      if (this.loginForm.code!=''){document.getElementById("code-input").style.backgroundColor='#FFFFFF'}
    },
    // 注册
    registerUser() {
      if (this.loginForm.gytname==''||this.loginForm.creditCode==''||this.loginForm.username==''||this.loginForm.password==''||this.loginForm.enterPassword==''||this.loginForm.phone==''||this.loginForm.code==''){
        this.$alert('请完整填写内容', '出错了', {
          confirmButtonText: '确定',
        });
        if (this.loginForm.gytname==''){document.getElementById("gytname-input").style.backgroundColor='#F5A9A9'}
        if (this.loginForm.creditCode==''){document.getElementById("creditCode-input").style.backgroundColor='#F5A9A9'}
        if (this.loginForm.username==''){document.getElementById("username-input-re").style.backgroundColor='#F5A9A9'}
        if (this.loginForm.password==''){document.getElementById("password-input-re").style.backgroundColor='#F5A9A9'}
        if (this.loginForm.enterPassword==''){document.getElementById("enterPassword-input").style.backgroundColor='#F5A9A9'}
        if (this.loginForm.phone==''){document.getElementById("phone-input-re").style.backgroundColor='#F5A9A9'}
        if (this.loginForm.code==''){document.getElementById("code-input").style.backgroundColor='#F5A9A9'}
      }else{
        if (this.loginForm.password!=this.loginForm.enterPassword){
          this.$alert('两次输入的密码不一致', '出错了', {
            confirmButtonText: '确定',
          });
        }else if (this.imgCode!=this.loginForm.code.toUpperCase()){
          console.log(this.imgCode);
          console.log(this.loginForm.code.toUpperCase());
          this.$alert('验证码错误', '出错了', {
            confirmButtonText: '确定',
          });
        }else if (!(/^1[3456789]\d{9}$/.test(this.loginForm.phone))){
          console.log(this.loginForm.code.toUpperCase());
          this.$alert('手机号码格式错误', '出错了', {
            confirmButtonText: '确定',
          });
        }else{
          console.log("提交注册");
        }
      }
    },
    // 返回登录
    loadLogin(){
      this.$router.push('/');
    }
  },

}
</script>

<style scoped>
* {
  margin: 0;
  padding: 0;
}
h1{
  padding-bottom: 20px;
}
#loginForm {
  width: 600px;
  margin: 0 auto;
  text-align: right;
}

.register-input {
  width: 400px;
  margin: 0 auto;
  padding-top: 5px;
}

</style>
