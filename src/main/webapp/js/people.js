var columns = [
{
field : 'selectItem',
radio : true
},
{
title : '分类id',
field : 'id',
visible : false,
align : 'center',
valign : 'middle',
width : '80px'
},
{
title : '分类名称',
field : 'name',
align : 'center',
valign : 'middle',
sortable : true,
width : '180px'
},
{
title : '上级分类',
field : 'parentName',
align : 'center',
valign : 'middle',
sortable : true,
width : '180px'
},
{
title : '排序号',
field : 'sort',
align : 'center',
valign : 'middle',
sortable : true,
width : '100px'
}];

$(function(){
	doGetObjects();
})
function doGetObjects(){
	var tableId="typeTable";//type_list.jsp中的tableid
	var url="findNodes.do";
	//构建treeTable对象
	var treeTable=
    new TreeTable(tableId, url, columns);
	treeTable.setExpandColumn(2);
	//初始化treeTable对象
	treeTable.init();
}











