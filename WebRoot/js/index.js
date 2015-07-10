Ext.onReady(function(){

	var sm=new Ext.grid.CheckboxSelectionModel();
	var cm=new Ext.grid.ColumnModel([
	    new Ext.grid.RowNumberer(),// 自动行号
	    {id:'username',header:"姓名",dataIndex:'username',width : 90},
	    {header:"密码",dataIndex:'password',width : 90},
	    {header:"性别",dataIndex:'sex',width : 90}
	    ]);
	// 定义一个用户对象,这样便于我们动态的添加记录,虽然也可以设置成匿名内置对象
	var userObject = Ext.data.Record.create( [ {
			name : 'username',
			mapping : 'username',
			type : 'string'
		},{
			name : 'password',
			mapping : 'password',
			type : 'string'
		}, {
			name : 'sex',
			mapping : 'sex',
			type : 'string'
		}]);
	// 创建 jsonReader
    var jsonReader = new Ext.data.JsonReader( {
			id : 'username',
			totalProperty : 'totalProperty',// 数据总数
			root : 'users',// 一定要与action中的数据名对应，否则 bj 哪儿是数据的头，可以看action里面是怎么定义数据格式的，这里就是如何解析的
			successProperty : 'success' // 数据获得状态
	},userObject);
    
	// 创建 Data Store
	var store = new Ext.data.Store({
			proxy : new Ext.data.HttpProxy({
						url : 'user_execute.action',   //这个鸡巴一定要注意，别写错了。
						method : 'GET'
			}),
			reader : jsonReader
	});

	var tbartools = new Ext.Toolbar([ 
	     {text:'添加按钮'},{text:'修改按钮'},{text:'删除按钮'}]); 	    

	
	var grid=new Ext.grid.GridPanel({
		renderTo:"grid",   //必须跟变量相同
		width:400,
		height:300,	  
		//el:'grid',
		//ds:ds,
		cm:cm,       //数据字段
		sm:sm,    
		store:store, //数据源
		title:'show data', //标题
		autoExpandColumn:2, //自动伸展，占满剩余区域
		selModel : new Ext.grid.RowSelectionModel( { singleSelect : false}),// 设置单行选中模式,否则将无法删除数据
		//添加分页工具栏
		bbar : new Ext.PagingToolbar({ // 添加分页工具栏
            pageSize : 10,//每页显示几条数据
            store : store,
            displayInfo : true,//是否显示数据信息
            displayMsg : '显示 {0}-{1}条 / 共 {2} 条',
            emptyMsg : "无数据- -!"
        }),
        tbar :[{text:'查询'}]           //添加工具栏
/*	     listeners : { 
	       'render': function(){ 
	    	   tbartools.render(userGrid.tbar); 
	        } 
	     }*/ 
	  }); 
	grid.getStore().load();      //这个鸡巴与上一个鸡巴是基佬，浪费了我2天半的什么才搞清楚。一定要注意，别写错了！
	//userGrid.render(); 
});