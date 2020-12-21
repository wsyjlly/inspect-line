<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"> </meta>
    <title>测试</title>
    <style>

        @page{

            @bottom-left {
                content: element(footer);
                vertical-align: top;
                padding-top: 10px;
                /*      border: solid red;    */
            }

            @top-right {
                content: element(header);
                vertical-align: bottom;
                padding-bottom: 10px;
                /*          border: solid green;   */
            }

            size: A4 portrait;
            margin-top:5.5cm;
            margin-left:3cm;
            margin-right:2cm;
            margin-bottom:3.3cm;
        }

        div.header {
            display: block;
            position: running(header);
            border-bottom: 1px solid black;
            text-align: right;
        }

        div.footer {
            margin-top: 0.5cm;
            display: block;
            position: running(footer);
            border-top: 1px solid black;
        }

        div.content {
            /*  border: solid purple;  */
            display: block;
            width: 15.4cm;
            text-align: justify;
        }

        #pagenumber:before {
            content: counter(page);
        }

        #pagecount:before {
            content: counter(pages);
        }
    </style>
</head>
<body style="font-size:12.0pt; font-family:SimSun">
<div class="header">
    体检报告   <span  id="pagenumber"></span> / <span id="pagecount"></span>
</div>
<div class="footer">
    体检报告   <span  id="pagenumber"></span> / <span id="pagecount"></span>
</div>
<h1>你好abc123</h1>
<h1>你好abc123</h1>
<h1>你好abc123</h1>
<h1>你好abc123</h1>
<h1>你好abc123</h1>
<h1>你好abc123</h1>
<h1>你好abc123</h1>
<h1>你好abc123</h1>
<h1>你好abc123</h1>
<h1>你好abc123</h1>
<h1>${name}</h1>
<#--<img  src="one.jpg"></img>-->
<#--<img  src="two.jpg"></img>-->
<h1>循环</h1>
<#list persons as a>
    <tr>
        <td>${a.name}</td>
        <td>${a.age}</td>
        <td>${a.sex}</td>
    </tr>
</#list>
</body>
</html>