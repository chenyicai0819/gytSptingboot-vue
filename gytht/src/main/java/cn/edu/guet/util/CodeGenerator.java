package cn.edu.guet.util;


import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;



/**
 * @author George
 * @project gytht
 * @package cn.edu.guet
 * @date 2021/8/12 17:32
 * @since 1.0
 */

public class CodeGenerator {
    public static void main(String[] args) {
        // 构建一个代码生成器对象
        AutoGenerator mpg= new AutoGenerator();
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());

        // 全局配置
        GlobalConfig gc=new GlobalConfig();
        // 获取用户路径
        String projectPath=System.getProperty("user.dir");
        // 设置生成文件的位置
        gc.setOutputDir(projectPath+"/src/main/java");
        // 设置作者
        gc.setAuthor("George");
        // 是否打开资源管理器
        gc.setOpen(false);
        // 是否覆盖
        gc.setFileOverride(false);
        // 设置service接口的I前缀
        gc.setServiceName("I%sService");
        // 设置默认初始算法
        gc.setIdType(IdType.ID_WORKER);
        // 设置日期类型
        gc.setDateType(DateType.ONLY_DATE);
        // 将配置放到自动生成器中
        mpg.setGlobalConfig(gc);

        // 设置数据源
        DataSourceConfig dsc=new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/gyt?dormitory=false&serverTimezone=UTC&allowPublicKeyRetrieval=true");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("chenyicai");
        dsc.setPassword("cyc1234");
        dsc.setDbType(DbType.MYSQL);
        mpg.setDataSource(dsc);

        // 配置生成的包
        PackageConfig pc = new PackageConfig();
        pc.setModuleName("guet");
        pc.setParent("cn.edu");
        pc.setEntity("entity");

        mpg.setPackageInfo(pc);

        // 配置策略
        StrategyConfig sc = new StrategyConfig();
        // 需要映射的表名
        sc.setInclude("dict","dictitem","log","organization","resource","resource_role_ref","role",
                "t_knowledge_tcm_question","t_knowledge_tcm_type","t_user_answer","tb_natmeha_chinese_medicine",
                "tb_natmeha_doctor","tb_natmeha_file","tb_natmeha_health_base","tb_natmeha_health_children",
                "tb_natmeha_health_diabetes","tb_natmeha_health_hyper","tb_natmeha_health_med_chi_manage",
                "tb_natmeha_health_postpartum","tb_natmeha_health_records","tb_natmeha_hospital","tb_natmeha_hots_coll_ref",
                "tb_natmeha_hotspot","tb_natmeha_inte_treat","tb_natmeha_med_cost","tb_natmeha_med_records",
                "tb_natmeha_patient","tb_natmeha_project","tb_natmeha_register_ref","tb_natmeha_signal_source",
                "user","user_role_ref","user_tz_result"
        );
        // 自动生成LomBok
        sc.setEntityLombokModel(true);
        // 设置表前缀不生成
        sc.setTablePrefix("tb_natmeha_","t_");
        sc.setNaming(NamingStrategy.underline_to_camel);
        sc.setColumnNaming(NamingStrategy.underline_to_camel);
        // 设置驼峰命名法
        sc.setRestControllerStyle(true);
        mpg.setStrategy(sc);

        //执行
        mpg.execute();
    }
}
