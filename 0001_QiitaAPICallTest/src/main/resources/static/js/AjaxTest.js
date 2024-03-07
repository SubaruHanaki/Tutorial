$(function() {
  $("#button_ajax_controller").on("click", function(e) {

	// AjaxでControllerのAPI実行
    e.preventDefault();  // デフォルトのイベント(ページの遷移やデータ送信など)を無効にする
    $.ajax({
      url: "/ajaxparams",  // リクエストを送信するURLを指定（action属性のurlを抽出）
      type: "POST",  // HTTPメソッドを指定（デフォルトはGET）
      /*
	  */
      data:JSON.stringify({
		  "page":parseInt($("#page").val()),
		  "per_page":parseInt($("#per_page").val()),
		  "query":$("#query").val(),
	  }),
	  contentType: "application/json; charset=UTF-8"
    })
    .done(function(data) {
		$("#ajax_result").empty();
		console.log(data);
		for(let i = 0; i < data.length;i++){
			let d = data[i];
	        $("#ajax_result").append(`
				<a href="${data.url}" style="color: initial;text-decoration: none;">
					<div class="card">
						<div class="card-header">
							<h3 class="card-title">${d.title.substring(0,20)}${d.title.length>20?"...":""}</h3>
							<div class="card-tools">
								<span class="badge badge-primary">Label</span>
							</div>
						</div>
						<div class="card-body">${d.body.substring(0,40)}${d.body.length>40?"...":""}</div>
						<div class="card-footer">${d.id}</div>
					</div>
				</a>
	        `);		
		}
		$("#ajax_result").val("");  // 入力欄を空にする
    })
    .fail(function() {
      alert("error!");  // 通信に失敗した場合の処理
    })
  });
});
