$(function(){
    var grid = $("#grid");

    renderGrid();

    function renderGrid(){
        grid.datagrid({
            url : "/grid",
            onDblClickRow : function(index,row) {
                alert(row.id);
            },
            columns:[[
                {field:"id",checkbox:true},
                {field:"name",title:"姓名"}
            ]]
            // ,
            // toolbar:[
            //     {
            //         text :'添加',
            //         iconCls:'icon-add'
            //     }
            // ]
        });
    }

    var p = grid.datagrid('getPager');
    p.pagination({
        pageSize: 5,//每页显示的记录条数，默认为10
        pageList: [5, 10, 15],//可以设置每页记录条数的列表
        beforePageText: '第',//页数文本框前显示的汉字
        afterPageText: '页    共 {pages} 页',
        displayMsg: '当前显示 {from} - {to} 条记录   共 {total} 条记录'
    });
});