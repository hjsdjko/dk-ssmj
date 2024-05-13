<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
var menus = [{
	"backMenu": [{
		"child": [{
			"buttons": ["新增", "修改", "删除"],
			"menu": "学生信息",
			"menuJump": "列表",
			"tableName": "xuesheng"
		}],
		"menu": "学生管理"
	}, {
		"child": [{
			"buttons": ["新增", "修改", "删除"],
			"menu": "学校负责人信息",
			"menuJump": "列表",
			"tableName": "xuexiao"
		}],
		"menu": "学校负责人管理"
	}, {
		"child": [{
			"buttons": ["新增", "修改", "删除"],
			"menu": "银行负责人信息",
			"menuJump": "列表",
			"tableName": "yinhang"
		}],
		"menu": "银行负责人管理"
	}, {
		"child": [{
			"buttons": ["新增", "修改", "删除"],
			"menu": "贷款项目信息",
			"menuJump": "列表",
			"tableName": "daikuan"
		}],
		"menu": "贷款项目管理"
	}, {
		"child": [{
			"buttons": ["新增", "修改", "删除"],
			"menu": "贷款申请信息",
			"menuJump": "列表",
			"tableName": "shenqing"
		}],
		"menu": "贷款申请管理"
	}, {
		"child": [{
			"buttons": ["新增", "修改", "删除"],
			"menu": "留言信息",
			"menuJump": "列表",
			"tableName": "liuyanxinxi"
		}],
		"menu": "留言管理"
	}, {
		"child": [{
			"buttons": ["新增", "修改", "删除"],
			"menu": "公告信息",
			"menuJump": "列表",
			"tableName": "xitonggonggao"
		}],
		"menu": "公告管理"
	}],
	"frontMenu": [],
	"roleName": "管理员",
	"tableName": "users"
}, {
	"backMenu": [{
		"child": [{
			"buttons": ["修改"],
			"menu": "银行负责人信息",
			"menuJump": "列表",
			"tableName": "yinhang"
		}],
		"menu": "银行负责人管理"
	}, {
		"child": [{
			"buttons": ["新增", "修改"],
			"menu": "贷款项目信息",
			"menuJump": "列表",
			"tableName": "daikuan"
		}],
		"menu": "贷款项目管理"
	}, {
		"child": [{
			"buttons": ["修改", "银行","拒绝"],
			"menu": "贷款申请信息",
			"menuJump": "列表",
			"tableName": "shenqing"
		}],
		"menu": "贷款申请管理"
	}, {
		"child": [{
			"buttons": ["新增", "修改"],
			"menu": "留言信息",
			"menuJump": "列表",
			"tableName": "liuyanxinxi"
		}],
		"menu": "留言管理"
	}, {
		"child": [{
			"buttons": ["新增", "修改"],
			"menu": "公告信息",
			"menuJump": "列表",
			"tableName": "xitonggonggao"
		}],
		"menu": "公告管理"
	}],
	"frontMenu": [],
	"roleName": "银行负责人",
	"tableName": "yinhang"
}, {
	"backMenu": [{
		"child": [{
			"buttons": ["新增", "修改"],
			"menu": "学生信息",
			"menuJump": "列表",
			"tableName": "xuesheng"
		}],
		"menu": "学生管理"
	}, {
		"child": [{
			"buttons": ["修改"],
			"menu": "学校负责人信息",
			"menuJump": "列表",
			"tableName": "xuexiao"
		}],
		"menu": "学校负责人管理"
	}, {
		"child": [{
			"buttons": ["新增", "修改"],
			"menu": "贷款项目信息",
			"menuJump": "列表",
			"tableName": "daikuan"
		}],
		"menu": "贷款项目管理"
	}, {
		"child": [{
			"buttons": ["修改", "学校", "拒绝"],
			"menu": "贷款申请信息",
			"menuJump": "列表",
			"tableName": "shenqing"
		}],
		"menu": "贷款申请管理"
	}, {
		"child": [{
			"buttons": ["新增", "修改"],
			"menu": "留言信息",
			"menuJump": "列表",
			"tableName": "liuyanxinxi"
		}],
		"menu": "留言管理"
	}, {
		"child": [{
			"buttons": ["新增", "修改"],
			"menu": "公告信息",
			"menuJump": "列表",
			"tableName": "xitonggonggao"
		}],
		"menu": "公告管理"
	}],
	"frontMenu": [],
	"roleName": "学校负责人",
	"tableName": "xuexiao"
}, {
	"backMenu": [{
		"child": [{
			"buttons": ["修改"],
			"menu": "学生信息",
			"menuJump": "列表",
			"tableName": "xuesheng"
		}],
		"menu": "学生管理"
	}, {
		"child": [{
			"buttons": ["申请"],
			"menu": "贷款项目信息",
			"menuJump": "列表",
			"tableName": "daikuan"
		}],
		"menu": "贷款项目管理"
	}, {
		"child": [{
			"buttons": [],
			"menu": "贷款申请信息",
			"menuJump": "列表",
			"tableName": "shenqing"
		}],
		"menu": "贷款申请管理"
	}, {
		"child": [{
			"buttons": ["新增"],
			"menu": "留言信息",
			"menuJump": "列表",
			"tableName": "liuyanxinxi"
		}],
		"menu": "留言管理"
	}, {
		"child": [{
			"buttons": [],
			"menu": "公告信息",
			"menuJump": "列表",
			"tableName": "xitonggonggao"
		}],
		"menu": "公告管理"
	}],
	"frontMenu": [],
	"roleName": "学生",
	"tableName": "xuesheng"
}];
var hasMessage = '';
