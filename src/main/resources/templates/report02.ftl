<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"  "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="Content-Style-Type" content="text/css"/>
    <title>html中表格</title>
    <style type="text/css">
        body {
            font-family: pingfang sc light;
        }

        .center {
            text-align: center;
            width: 100%;
        }
    </style>
</head>
<body>

<div><p style="font-size:10.5pt; line-height:115%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0"><span
        style="font-family:Calibri; font-size:10.5pt">&#xa0;</span></p>
    <div style="text-align:center">
        <table cellspacing="0" cellpadding="0" style="border-collapse:collapse; margin:0 auto">
            <tr style="height:15.85pt">
                <td colspan="6"
                    style="background-color:#ffffff; padding-left:5.4pt; padding-right:5.4pt; vertical-align:middle; width:407.05pt">
                    <h1 style="font-size:22pt; line-height:240%; margin:17pt 0pt 16.5pt; orphans:0; page-break-after:avoid; page-break-inside:avoid; text-align:center; widows:0">
                        <span style="font-family:Calibri; font-size:22pt; font-weight:bold">${(planVO.planName)!''}飞行报告</span>
                    </h1>
                    <p style="font-size:10.5pt; line-height:115%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="color:#ffffff; font-family:Calibri; font-size:10.5pt">&#xa0;</span></p></td>
            </tr>
            <tr style="height:15.85pt">
                <td style="background-color:#ffffff; padding-left:5.4pt; padding-right:5.4pt; vertical-align:middle; width:62.7pt">
                    <p style="font-size:10.5pt; line-height:115%; margin:0pt 0pt 10pt; orphans:0; text-align:right; widows:0">
                        <span style="font-family:Calibri; font-size:10.5pt; font-weight:bold; vertical-align:baseline">&#xa0;</span>
                    </p></td>
                <td style="background-color:#ffffff; padding-left:5.4pt; padding-right:5.4pt; vertical-align:middle; width:78.15pt">
                    <p style="font-size:10.5pt; line-height:115%; margin:0pt 0pt 10pt; orphans:0; widows:0"><span
                            style="font-family:Calibri; font-size:10.5pt; vertical-align:baseline">&#xa0;</span></p>
                </td>
                <td style="background-color:#ffffff; padding-left:5.4pt; padding-right:5.4pt; vertical-align:middle; width:55.05pt">
                    <p style="font-size:10.5pt; line-height:115%; margin:0pt 0pt 10pt; orphans:0; widows:0"><span
                            style="font-family:Calibri; font-size:10.5pt; vertical-align:baseline">&#xa0;</span></p>
                </td>
                <td colspan="2"
                    style="background-color:#ffffff; padding-left:5.4pt; padding-right:5.4pt; vertical-align:middle; width:66.9pt">
                    <p style="font-size:10.5pt; line-height:115%; margin:0pt 0pt 10pt; orphans:0; text-align:right; widows:0">
                        <span style="font-family:Calibri; font-size:10.5pt; font-weight:bold">&#xa0;</span></p></td>
                <td style="background-color:#ffffff; padding-left:5.4pt; padding-right:5.4pt; vertical-align:middle; width:101.05pt">
                    <p style="font-size:10.5pt; line-height:115%; margin:0pt 0pt 10pt; orphans:0; widows:0"><span
                            style="font-family:Calibri; font-size:10.5pt; vertical-align:baseline">&#xa0;</span></p>
                </td>
            </tr>
            <tr style="height:15.85pt">
                <td style="background-color:#ffffff; padding-left:5.4pt; padding-right:5.4pt; vertical-align:middle; width:62.7pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; text-align:right; widows:0">
                        <span style="font-family:宋体; font-size:10.5pt; font-weight:bold; vertical-align:baseline">飞行日期：</span>
                    </p></td>
                <td style="background-color:#ffffff; padding-left:5.4pt; padding-right:5.4pt; vertical-align:middle; width:78.15pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; widows:0"><span
                            style="font-family:Calibri; font-size:10.5pt; vertical-align:baseline">${(planVO.startTime?string('yyyy-MM-dd'))!''}</span></p>
                </td>
                <td style="background-color:#ffffff; padding-left:5.4pt; padding-right:5.4pt; vertical-align:middle; width:55.05pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; widows:0"><span
                            style="font-family:Calibri; font-size:10.5pt; vertical-align:baseline">&#xa0;</span></p>
                </td>
                <td colspan="2"
                    style="background-color:#ffffff; padding-left:5.4pt; padding-right:5.4pt; vertical-align:middle; width:66.9pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; text-align:right; widows:0">
                        <span style="font-family:宋体; font-size:10.5pt; font-weight:bold">飞机型号</span><span
                            style="font-family:Calibri; font-size:10.5pt; font-weight:bold">:</span></p></td>
                <td style="background-color:#ffffff; padding-left:5.4pt; padding-right:5.4pt; vertical-align:middle; width:101.05pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; widows:0"><span
                            style="font-family:Calibri; font-size:10.5pt; vertical-align:baseline">${(planVO.uavName)!''}</span></p></td>
            </tr>
            <tr style="height:15.85pt">
                <td style="background-color:#ffffff; padding-left:5.4pt; padding-right:5.4pt; vertical-align:middle; width:62.7pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; text-align:right; widows:0">
                        <span style="font-family:宋体; font-size:10.5pt; font-weight:bold; vertical-align:baseline">飞手名称：</span>
                    </p></td>
                <td style="background-color:#ffffff; padding-left:5.4pt; padding-right:5.4pt; vertical-align:middle; width:78.15pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; widows:0"><span
                            style="font-family:宋体; font-size:10.5pt; vertical-align:baseline">${(planVO.pilots)!''}</span></p></td>
                <td style="background-color:#ffffff; padding-left:5.4pt; padding-right:5.4pt; vertical-align:middle; width:55.05pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; widows:0"><span
                            style="font-family:Calibri; font-size:10.5pt; vertical-align:baseline">&#xa0;</span></p>
                </td>
                <td colspan="2"
                    style="background-color:#ffffff; padding-left:5.4pt; padding-right:5.4pt; vertical-align:middle; width:66.9pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; text-align:right; widows:0">
                        <span style="font-family:宋体; font-size:10.5pt; font-weight:bold">生成日期</span><span
                            style="font-family:Calibri; font-size:10.5pt; font-weight:bold">:</span></p></td>
                <td style="background-color:#ffffff; padding-left:5.4pt; padding-right:5.4pt; vertical-align:middle; width:101.05pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; widows:0"><span
                            style="font-family:Calibri; font-size:10.5pt; vertical-align:baseline">${.now?string('yyyy-MM-dd')}</span></p>
                </td>
            </tr>
            <tr style="height:15.8pt">
                <td style="background-color:#ffffff; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; padding-left:5.4pt; padding-right:5.4pt; vertical-align:middle; width:62.7pt">
                    <p style="font-size:10.5pt; line-height:115%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:Calibri; font-size:10.5pt; font-weight:bold; vertical-align:baseline">&#xa0;</span>
                    </p></td>
                <td style="background-color:#ffffff; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; padding-left:5.4pt; padding-right:5.4pt; vertical-align:middle; width:78.15pt">
                    <p style="font-size:10.5pt; line-height:115%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:Calibri; font-size:10.5pt; vertical-align:baseline">&#xa0;</span></p>
                </td>
                <td style="background-color:#ffffff; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; padding-left:5.4pt; padding-right:5.4pt; vertical-align:middle; width:55.05pt">
                    <p style="font-size:10.5pt; line-height:115%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:Calibri; font-size:10.5pt; vertical-align:baseline">&#xa0;</span></p>
                </td>
                <td colspan="2"
                    style="background-color:#ffffff; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; padding-left:5.4pt; padding-right:5.4pt; vertical-align:middle; width:66.9pt">
                    <p style="font-size:10.5pt; line-height:115%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:Calibri; font-size:10.5pt; font-weight:bold">&#xa0;</span></p></td>
                <td style="background-color:#ffffff; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; padding-left:5.4pt; padding-right:5.4pt; vertical-align:middle; width:101.05pt">
                    <p style="font-size:10.5pt; line-height:115%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:Calibri; font-size:10.5pt; vertical-align:baseline">&#xa0;</span></p>
                </td>
            </tr>
            <tr style="height:17.75pt">
                <td colspan="6"
                    style="background-color:#ebd6d6; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:407.05pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:宋体; font-size:10.5pt; font-weight:bold; vertical-align:baseline">任务名称:${(planVO.planName)!''}</span>
                    </p></td>
            </tr>
            <tr style="height:16.75pt">
                <td style="background-color:#f4e9e9; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:62.7pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:宋体; font-size:10.5pt; font-weight:bold; vertical-align:baseline">计划编号</span>
                    </p></td>
                <td colspan="3"
                    style="background-color:#f4e9e9; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:187.1pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:Calibri; font-size:10.5pt; vertical-align:baseline">${(planVO.taskNumber)!''}</span></p></td>
                <td colspan="2" rowspan="8"
                    style="background-color:#f4e9e9; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:135.65pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <img src="http://uav-xinjiang.oss-cn-beijing.aliyuncs.com/zhenjiang/nj-zj.png" width="144" height="133"
                             alt="无图片"
                             style="-aw-left-pos:0pt; -aw-rel-hpos:column; -aw-rel-vpos:paragraph; -aw-top-pos:0pt; -aw-wrap-type:inline"/>
                    </p></td>
            </tr>
            <tr style="height:16.75pt">
                <td style="background-color:#f4e9e9; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:62.7pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:宋体; font-size:10.5pt; font-weight:bold; vertical-align:baseline">飞行时间</span>
                    </p></td>
                <td colspan="3"
                    style="background-color:#f4e9e9; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:187.1pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:Calibri; font-size:10.5pt; vertical-align:baseline">${(planVO.startTime?string('yyyy-MM-dd'))!''}</span>
                    </p></td>
            </tr>
            <tr style="height:4.5pt">
                <td style="background-color:#f4e9e9; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:62.7pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:宋体; font-size:10.5pt; font-weight:bold; vertical-align:baseline">飞行里程</span>
                    </p></td>
                <td colspan="3"
                    style="background-color:#f4e9e9; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:187.1pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:Calibri; font-size:10.5pt; vertical-align:baseline">${(planVO.flightDistance/1000)?int}km</span></p></td>
            </tr>
            <tr style="height:16.75pt">
                <td style="background-color:#f4e9e9; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:62.7pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:宋体; font-size:10.5pt; font-weight:bold; vertical-align:baseline">飞行时长</span>
                    </p></td>
                <td colspan="3"
                    style="background-color:#f4e9e9; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:187.1pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:Calibri; font-size:10.5pt; vertical-align:baseline">${(planVO.flightDuration/60)?int}min</span></p></td>
            </tr>
            <tr style="height:16.75pt">
                <td style="background-color:#f4e9e9; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:62.7pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:宋体; font-size:10.5pt; font-weight:bold; vertical-align:baseline">飞行高度</span>
                    </p></td>
                <td colspan="3"
                    style="background-color:#f4e9e9; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:187.1pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:Calibri; font-size:10.5pt; vertical-align:baseline">200</span><span
                            style="font-family:宋体; font-size:10.5pt; vertical-align:baseline">米</span></p></td>
            </tr>
            <tr style="height:16.75pt">
                <td style="background-color:#f4e9e9; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:62.7pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:宋体; font-size:10.5pt; font-weight:bold; vertical-align:baseline">观测方式</span>
                    </p></td>
                <td colspan="3"
                    style="background-color:#f4e9e9; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:187.1pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:宋体; font-size:10.5pt; vertical-align:baseline">正射向下</span></p></td>
            </tr>
            <tr style="height:16.75pt">
                <td style="background-color:#f4e9e9; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:62.7pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:宋体; font-size:10.5pt; font-weight:bold; vertical-align:baseline">是否有遥测</span>
                    </p></td>
                <td colspan="3"
                    style="background-color:#f4e9e9; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:187.1pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:宋体; font-size:10.5pt; vertical-align:baseline">有</span></p></td>
            </tr>
            <tr style="height:17.75pt">
                <td style="background-color:#f4e9e9; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:62.7pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:宋体; font-size:10.5pt; font-weight:bold; vertical-align:baseline">是否有高清</span>
                    </p></td>
                <td colspan="3"
                    style="background-color:#f4e9e9; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:187.1pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:宋体; font-size:10.5pt; vertical-align:baseline">无</span></p></td>
            </tr>
            <tr style="height:0pt">
                <td style="width:73.5pt; border:none"></td>
                <td style="width:88.95pt; border:none"></td>
                <td style="width:65.85pt; border:none"></td>
                <td style="width:43.1pt; border:none"></td>
                <td style="width:34.6pt; border:none"></td>
                <td style="width:111.85pt; border:none"></td>
            </tr>
        </table>
    </div>
    <p style="font-size:10.5pt; line-height:115%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0"><span
            style="font-family:Calibri; font-size:10.5pt">&#xa0;</span></p>
    <p style="font-size:10.5pt; line-height:115%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0"><span
            style="font-family:Calibri; font-size:10.5pt">&#xa0;</span></p>
    <p style="font-size:10.5pt; line-height:115%; margin:0pt 0pt 10pt; orphans:0; text-align:justify; widows:0"><span
            style="font-family:Calibri; font-size:10.5pt">&#xa0;</span></p>
    <div style="text-align:center">
        <table cellspacing="0" cellpadding="0" style="border-collapse:collapse; margin:0 auto">
            <tr style="height:23.2pt">
                <td colspan="4"
                    style="background-color:#ebd6d6; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:411.35pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; text-align:center"><span
                            style="font-family:宋体; font-size:10.5pt; font-weight:bold; vertical-align:baseline">险情统计</span>
                    </p></td>
            </tr>
            <tr>
                <td rowspan="3"
                    style="background-color:#f4e9e9; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:65.9pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:宋体; font-size:10.5pt; font-weight:bold; vertical-align:baseline">险情数量</span>
                    </p></td>
                <td rowspan="3"
                    style="background-color:#f4e9e9; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:104.35pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:Calibri; font-size:10.5pt; vertical-align:baseline">${dangerTotal}</span></p></td>
                <td style="background-color:#f4e9e9; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:104.35pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:宋体; font-size:10.5pt; font-weight:bold; vertical-align:baseline">处理中</span>
                    </p></td>
                <td style="background-color:#f4e9e9; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:104.35pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:Calibri; font-size:10.5pt; vertical-align:baseline">${startNum}</span></p></td>
            </tr>
            <tr style="height:15.6pt">
                <td style="background-color:#f4e9e9; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:104.35pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:宋体; font-size:10.5pt; font-weight:bold; vertical-align:baseline">已处理</span>
                    </p></td>
                <td style="background-color:#f4e9e9; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:104.35pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:Calibri; font-size:10.5pt; vertical-align:baseline">${finishNum}</span></p></td>
            </tr>
            <tr>
                <td style="background-color:#f4e9e9; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:104.35pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:宋体; font-size:10.5pt; font-weight:bold; vertical-align:baseline">未指派</span>
                    </p></td>
                <td style="background-color:#f4e9e9; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:104.35pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:Calibri; font-size:10.5pt; vertical-align:baseline">${unassignNum}</span></p></td>
            </tr>
            <tr>
                <td style="background-color:#f4e9e9; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:65.9pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:宋体; font-size:10.5pt; font-weight:bold; vertical-align:baseline">险情分布</span>
                    </p></td>
                <td colspan="3"
                    style="background-color:#f4e9e9; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:334.65pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:宋体; font-size:10.5pt; vertical-align:baseline">${(targetNames)!''}</span></p>
                </td>
            </tr>
            <#list dangerList as dangerBodyVO>
            <tr style="height:26pt">
                <td colspan="4"
                    style="background-color:#ebd6d6; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:411.35pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:宋体; font-size:10.5pt; font-weight:bold; vertical-align:baseline">险情</span><span
                            style="font-family:Calibri; font-size:10.5pt; font-weight:bold; vertical-align:baseline">${dangerBodyVO_index+1}</span>
                    </p></td>
            </tr>
            <tr>
                <td style="background-color:#f4e9e9; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:65.9pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:宋体; font-size:10.5pt; font-weight:bold; vertical-align:baseline">险情类型</span>
                    </p></td>
                <td style="background-color:#f4e9e9; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:104.35pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:宋体; font-size:10.5pt; vertical-align:baseline">${dangerBodyVO.targetName}</span></p></td>
                <td style="background-color:#f4e9e9; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:104.35pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:宋体; font-size:10.5pt; font-weight:bold; vertical-align:baseline">发现时间</span>
                    </p></td>
                <td style="background-color:#f4e9e9; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:104.35pt">
                    <p style="font-size:10pt; line-height:150%; margin:0pt 0pt 10pt; text-align:center"><span
                            style="font-family:STSong-Light; font-size:10pt">${dangerBodyVO.timeStamp?string('yyyy-MM-dd HH:mm:ss')}</span></p></td>
            </tr>
            <tr>
                <td style="background-color:#f4e9e9; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:65.9pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:宋体; font-size:10.5pt; font-weight:bold; vertical-align:baseline">险情坐标</span>
                    </p></td>
                <td colspan="3"
                    style="background-color:#f4e9e9; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:334.65pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:Calibri; font-size:10.5pt; vertical-align:baseline">${dangerBodyVO.lng?c},${dangerBodyVO.lat?c}</span>
                    </p></td>
            </tr>
            <tr>
                <td style="background-color:#f4e9e9; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:65.9pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:宋体; font-size:10.5pt; font-weight:bold; vertical-align:baseline">险情备注</span>
                    </p></td>
                <td colspan="3"
                    style="background-color:#f4e9e9; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:334.65pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:宋体; font-size:10.5pt; vertical-align:baseline">${(dangerBodyVO.remarks)!''}</span></p></td>
            </tr>
            <tr>
                <td style="background-color:#f4e9e9; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:65.9pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:宋体; font-size:10.5pt; font-weight:bold; vertical-align:baseline">责任人</span>
                    </p></td>
                <td style="background-color:#f4e9e9; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:104.35pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:宋体; font-size:10.5pt; vertical-align:baseline">
                                ${(dangerBodyVO.dangerResult.userName)!''}
                        </span></p></td>
                <td style="background-color:#f4e9e9; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:104.35pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:宋体; font-size:10.5pt; font-weight:bold; vertical-align:baseline">联系方式</span>
                    </p></td>
                <td style="background-color:#f4e9e9; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:104.35pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:Calibri; font-size:10.5pt; vertical-align:baseline">${(dangerBodyVO.dangerResult.phone)!''}</span>
                    </p></td>
            </tr>
            <tr>
                <td style="background-color:#f4e9e9; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:65.9pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:宋体; font-size:10.5pt; font-weight:bold; vertical-align:baseline">处理结果</span>
                    </p></td>
                <td colspan="3"
                    style="background-color:#f4e9e9; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:334.65pt">
                    <p style="font-size:10.5pt; line-height:150%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:宋体; font-size:10.5pt; vertical-align:baseline">${(dangerBodyVO.dangerResult.formulation)!''}</span></p></td>
            </tr>
            <tr style="height:93.95pt">
                <td style="background-color:#f4e9e9; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:65.9pt">
                    <p style="font-size:10.5pt; line-height:115%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:宋体; font-size:10.5pt; font-weight:bold; vertical-align:baseline">险情图片</span>
                    </p></td>
                <td colspan="3"
                    style="background-color:#f4e9e9; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:334.65pt">
                    <p style="font-size:10.5pt; line-height:115%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <img src="http://116.178.68.235:8005${(dangerBodyVO.nowImageUrl)!''}" width="144" height="133"
                             alt="无图片"
                             style="-aw-left-pos:0pt; -aw-rel-hpos:column; -aw-rel-vpos:paragraph; -aw-top-pos:0pt; -aw-wrap-type:inline"/>
                    </p></td>
            </tr>
            <tr style="height:90pt">
                <td style="background-color:#f4e9e9; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:65.9pt">
                    <p style="font-size:10.5pt; line-height:115%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <span style="font-family:宋体; font-size:10.5pt; font-weight:bold; vertical-align:baseline">取证信息</span>
                    </p></td>
                <td colspan="3"
                    style="background-color:#f4e9e9; border-bottom-color:#c0504d; border-bottom-style:solid; border-bottom-width:0.75pt; border-left-color:#c0504d; border-left-style:solid; border-left-width:0.75pt; border-right-color:#c0504d; border-right-style:solid; border-right-width:0.75pt; border-top-color:#c0504d; border-top-style:solid; border-top-width:0.75pt; padding-left:5.03pt; padding-right:5.03pt; vertical-align:middle; width:334.65pt">
                    <p style="font-size:10.5pt; line-height:115%; margin:0pt 0pt 10pt; orphans:0; text-align:center; widows:0">
                        <img src="http://116.178.68.235:8005${(dangerBodyVO.dangerResult.sceneImgs)!''}" width="145" height="133"
                             alt="无图片"
                             style="-aw-left-pos:0pt; -aw-rel-hpos:column; -aw-rel-vpos:paragraph; -aw-top-pos:0pt; -aw-wrap-type:inline"/>
                    </p></td>
            </tr>
            </#list>
        </table>
    </div>
</div>


</body>
</html>