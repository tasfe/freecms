<%@ page language="java" pageEncoding="UTF-8"%>
<%@   taglib   uri = "http://ckfinder.com"   prefix = "ckfinder"   %>   
<%@   taglib   uri = "http://ckeditor.com"   prefix = "ckeditor"   %>   
<%@page import="java.util.UUID"%>
<%@page import="java.net.URLDecoder"%>
<%@page import="cn.freeteam.cms.model.Info"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%> 
<%@taglib prefix="fs" uri="/fs-tags" %>
<%@include file="../../util/checkParentFrame.jsp" %>
<%@include file="checkSelectSite.jsp" %>
<HTML>
	<HEAD>
		<link rel="stylesheet" href="../../img/common.css" type="text/css" />
		<link rel="stylesheet" href="../../img/style.css" type="text/css" />
		<link rel="stylesheet" href="../../img/style3.css" type="text/css" />
	<link rel="stylesheet" href="../../js/jquery.treeview.css" />
		<script type="text/javascript" src="../../js/jquery-1.5.1.min.js"></script>
	<script src="../../js/jquery.cookie.js" type="text/javascript"></script>
	<script src="../../js/jquery.treeview.js" type="text/javascript"></script>
	<script src="../../js/jquery.treeview.edit.js" type="text/javascript"></script>
	<script src="../../js/jquery.treeview.async.js" type="text/javascript"></script>
		<script type="text/javascript" src="../../js/weebox0.4/bgiframe.js"></script>
		<script type="text/javascript" src="../../js/weebox0.4/weebox.js"></script>
		<link type="text/css" rel="stylesheet" href="../../js/weebox0.4/weebox_css.jsp" />
		<script type="text/javascript" src="../../js/jscolor/jscolor.js"></script>
		<script language="javascript" type="text/javascript" src="../../My97DatePicker/WdatePicker.js" ></script>
		<script type="text/javascript" src="js/infoEdit.js"></script>
		<script type="text/javascript" src="../ckfinder/ckfinder.js"></script>
		<script type="text/javascript" src="../../js/ckfinderUtil.jsp"></script>

	</HEAD>
	<BODY>
		<FORM id=MyForm 
			method=post name=MyForm action=info_editDo.do>
			<input type="hidden" name="pageFuncId" id="pageFuncId" value="${pageFuncId }"/>
			<input type="hidden" name="info.id" value="${info.id }"/>
			<input type="hidden" name="type" value="<%=((request.getParameter("channel.id")!=null || request.getParameter("info.id")!=null)?"channel":"quick") %>"/>
			<DIV class=tab>
				<DIV class=tabOn >
					信息编辑
				</DIV>
				<DIV class=clearer></DIV>
			</DIV>
			<DIV class=column>
				<TABLE cellSpacing=4 cellPadding=4 width="95%" align=center>
					<TBODY>
						
						
								<input type="hidden" name="info.site" id="siteId" value="${site.id }"/>
						
						<TR>
							<TD width="30%" align="left">
								<LABEL id=ctl01_ctl00_label><IMG
											style="BORDER-RIGHT-WIDTH: 0px; BORDER-TOP-WIDTH: 0px; BORDER-BOTTOM-WIDTH: 0px; BORDER-LEFT-WIDTH: 0px"
											id=ctl01_ctl00_imgHelp tabIndex=-1 alt=请选择栏目
											src="../../img/help.gif">
									<NOBR>
										<SPAN id=ctl01_ctl00_lblLabel>栏目：</SPAN>
									</NOBR>
								</LABEL>
							</TD>
							<TD width="70%" align="left">
								<input type="hidden" name="info.channel" id="channelId" value="${channel.id }"/>
								<INPUT onblur="this.className='inputblur';"  readonly id="channelName" onclick="selectChannel()"
									class=inputblur onfocus="this.className='inputfocus';"  style="cursor:hand" title="点击选择栏目"
									maxLength=50 type=text name=channel.name value="${channel.name }"/>
								<SPAN  id=ctl03>*</SPAN>
							</TD>
						</TR>
						<TR>
							<TD width="30%" align="left">
								<LABEL id=ctl01_ctl00_label><IMG
											style="BORDER-RIGHT-WIDTH: 0px; BORDER-TOP-WIDTH: 0px; BORDER-BOTTOM-WIDTH: 0px; BORDER-LEFT-WIDTH: 0px"
											id=ctl01_ctl00_imgHelp tabIndex=-1 alt=请输入标题
											src="../../img/help.gif">
									<NOBR>
										<SPAN id=ctl01_ctl00_lblLabel>标题：</SPAN>
									</NOBR>
								</LABEL>
							</TD>
							<TD width="70%" align="left">
								<INPUT onblur="this.className='inputblur';" id=title
									class=inputblur onfocus="this.className='inputfocus';" size="45"
									maxLength=250 type=text name=info.title value="${info.title }">
								<SPAN  id=ctl03>*</SPAN>
							</TD>
						</TR>
						<TR>
							<TD width="30%" align="left">
								<LABEL id=ctl01_ctl00_label><IMG
											style="BORDER-RIGHT-WIDTH: 0px; BORDER-TOP-WIDTH: 0px; BORDER-BOTTOM-WIDTH: 0px; BORDER-LEFT-WIDTH: 0px"
											id=ctl01_ctl00_imgHelp tabIndex=-1 alt=在列表中显示，留空则显示完整标题
											src="../../img/help.gif">
									<NOBR>
										<SPAN id=ctl01_ctl00_lblLabel>短标题：</SPAN>
									</NOBR>
								</LABEL>
							</TD>
							<TD width="70%" align="left">
								<INPUT onblur="this.className='inputblur';" id=shortTitle
									class=inputblur onfocus="this.className='inputfocus';" 
									maxLength=250 type=text size="45" name=info.shorttitle value="${info.shorttitle }">
							</TD>
						</TR>
						<TR>
							<TD width="30%" align="left">
								<LABEL id=ctl01_ctl00_label><IMG
											style="BORDER-RIGHT-WIDTH: 0px; BORDER-TOP-WIDTH: 0px; BORDER-BOTTOM-WIDTH: 0px; BORDER-LEFT-WIDTH: 0px"
											id=ctl01_ctl00_imgHelp tabIndex=-1 alt=请选择生成信息静态页面的信息模板
											src="../../img/help.gif">
									<NOBR>
										<SPAN id=ctl01_ctl00_lblLabel>信息模板：</SPAN>
									</NOBR>
								</LABEL>
							</TD>
							<TD width="70%" align="left">
								<INPUT onblur="this.className='inputblur';" id=templet readonly style="cursor:hand" title="点击选择模板文件"
									class=inputblur onfocus="this.className='inputfocus';"  onclick="selectTempletFile('templet')"
									maxLength=50 type=text name=info.templet value="${info.templet }"/>
							</TD>
						</TR>
						<TR>
							<TD width="30%" align="left">
								<LABEL id=ctl01_ctl00_label><IMG
											style="BORDER-RIGHT-WIDTH: 0px; BORDER-TOP-WIDTH: 0px; BORDER-BOTTOM-WIDTH: 0px; BORDER-LEFT-WIDTH: 0px"
											id=ctl01_ctl00_imgHelp tabIndex=-1 alt=请选择标题颜色
											src="../../img/help.gif">
									<NOBR>
										<SPAN id=ctl01_ctl00_lblLabel>标题颜色：</SPAN>
									</NOBR>
								</LABEL>
							</TD>
							<TD width="70%" align="left">
								<INPUT  id=titleColor
									class="color"
									maxLength=50 type=text name=info.titlecolor value="${info.titlecolor }<s:if test="info==null || info.titlecolor == null || info.titlecolor ==''">000000</s:if>">
							</TD>
						</TR>
						<TR>
							<TD width="30%" align="left">
								<LABEL id=ctl01_ctl00_label><IMG
											style="BORDER-RIGHT-WIDTH: 0px; BORDER-TOP-WIDTH: 0px; BORDER-BOTTOM-WIDTH: 0px; BORDER-LEFT-WIDTH: 0px"
											id=ctl01_ctl00_imgHelp tabIndex=-1 alt=请选择标题是否加粗
											src="../../img/help.gif">
									<NOBR>
										<SPAN id=ctl01_ctl00_lblLabel>标题是否加粗：</SPAN>
									</NOBR>
								</LABEL>
							</TD>
							<TD width="70%" align="left">
								<input type="radio" id="isblob1" name="info.titleblod" value="1" <s:if test="info.titleblod==1">checked="checked"</s:if>>是
								<input type="radio" id="isblob0" name="info.titleblod" value="0" <s:if test="info==null || info.titleblod==null || info.titleblod==0">checked="checked"</s:if> >否
							</TD>
						</TR>
						<TR>
							<TD width="30%" align="left">
								<LABEL id=ctl01_ctl00_label><IMG
											style="BORDER-RIGHT-WIDTH: 0px; BORDER-TOP-WIDTH: 0px; BORDER-BOTTOM-WIDTH: 0px; BORDER-LEFT-WIDTH: 0px"
											id=ctl01_ctl00_imgHelp tabIndex=-1 alt=请输入信息来源
											src="../../img/help.gif">
									<NOBR>
										<SPAN id=ctl01_ctl00_lblLabel>来源：</SPAN>
									</NOBR>
								</LABEL>
							</TD>
							<TD width="70%" align="left">
								<INPUT onblur="this.className='inputblur';" id=source
									class=inputblur onfocus="this.className='inputfocus';" 
									maxLength=50 type=text name=info.source value="${info.source }">
							</TD>
						</TR>
						<TR>
							<TD width="30%" align="left">
								<LABEL id=ctl01_ctl00_label><IMG
											style="BORDER-RIGHT-WIDTH: 0px; BORDER-TOP-WIDTH: 0px; BORDER-BOTTOM-WIDTH: 0px; BORDER-LEFT-WIDTH: 0px"
											id=ctl01_ctl00_imgHelp tabIndex=-1 alt=请输入信息作者
											src="../../img/help.gif">
									<NOBR>
										<SPAN id=ctl01_ctl00_lblLabel>作者：</SPAN>
									</NOBR>
								</LABEL>
							</TD>
							<TD width="70%" align="left">
								<INPUT onblur="this.className='inputblur';" id=author
									class=inputblur onfocus="this.className='inputfocus';" 
									maxLength=50 type=text name=info.author value="${info.author }">
							</TD>
						</TR>
						<TR>
							<TD width="30%" align="left">
								<LABEL id=ctl01_ctl00_label><IMG
											style="BORDER-RIGHT-WIDTH: 0px; BORDER-TOP-WIDTH: 0px; BORDER-BOTTOM-WIDTH: 0px; BORDER-LEFT-WIDTH: 0px"
											id=ctl01_ctl00_imgHelp tabIndex=-1 alt=请输入信息摘要
											src="../../img/help.gif">
									<NOBR>
										<SPAN id=ctl01_ctl00_lblLabel>摘要：</SPAN>
									</NOBR>
								</LABEL>
							</TD>
							<TD width="70%" align="left">
								<textarea onblur="this.className='inputblur';"  
									class=inputblur onfocus="this.className='inputfocus';" 
									maxLength=50 type=text id=description name=info.description cols="40" rows="3">${info.description }</textarea>
							</TD>
						</TR>
						<TR>
							<TD width="30%" align="left" colspan="10">
								<LABEL id=ctl01_ctl00_label><IMG
											style="BORDER-RIGHT-WIDTH: 0px; BORDER-TOP-WIDTH: 0px; BORDER-BOTTOM-WIDTH: 0px; BORDER-LEFT-WIDTH: 0px"
											id=ctl01_ctl00_imgHelp tabIndex=-1 alt=请输入信息内容
											src="../../img/help.gif">
									<NOBR>
										<SPAN id=ctl01_ctl00_lblLabel>信息内容：</SPAN>
									</NOBR>
								</LABEL>
							</TD>
						</TR>
						<TR>
							<TD width="70%" align="left"  colspan="10">
    							<textarea   cols = "80"   id = "editor1"   name = "info.content"   rows = "10" >${info.content }</textarea >
								<script type="text/javascript" src="<%=checkParentPath %>/admin/ckeditor/ckeditor.js?t=B37D54V"></script>
								<script type="text/javascript">//<![CDATA[
								CKEDITOR.replace('editor1', {"filebrowserImageBrowseUrl":"\<%=checkParentPath %>\/admin\/ckfinder\/ckfinder.html?type=Images","filebrowserBrowseUrl":"\<%=checkParentPath %>\/admin\/ckfinder\/ckfinder.html","filebrowserFlashBrowseUrl":"\<%=checkParentPath %>\/admin\/ckfinder\/ckfinder.html?type=Flash","filebrowserUploadUrl":"\<%=checkParentPath %>\/ckfinder\/core\/connector\/java\/connector.java?command=QuickUpload&type=Files","filebrowserImageUploadUrl":"\<%=checkParentPath %>\/ckfinder\/core\/connector\/java\/connector.java?command=QuickUpload&type=Images","filebrowserFlashUploadUrl":"\<%=checkParentPath %>\/ckfinder\/core\/connector\/java\/connector.java?command=QuickUpload&type=Flash"});
								//]]></script>
								<input type="hidden" id="ckfinderCurrentFolder" value="${currentFolder }"/>
								<input type="hidden" id="ckfinderBasePath" value="<%=checkParentPath %>"/>
							</TD>
						</TR>
						<TR>
							<TD width="30%" align="left">
								<LABEL id=ctl01_ctl00_label><IMG
											style="BORDER-RIGHT-WIDTH: 0px; BORDER-TOP-WIDTH: 0px; BORDER-BOTTOM-WIDTH: 0px; BORDER-LEFT-WIDTH: 0px"
											id=ctl01_ctl00_imgHelp tabIndex=-1 alt=请选择是否固顶
											src="../../img/help.gif">
									<NOBR>
										<SPAN id=ctl01_ctl00_lblLabel>是否固顶：</SPAN>
									</NOBR>
								</LABEL>
							</TD>
							<TD width="70%" align="left">
								<input type="radio" id="istop1" onclick="istop(1)" name="info.istop" value="1" <s:if test="info.istop==1">checked="checked"</s:if>>是
								<input type="radio" id="istop0"  onclick="istop(0)" name="info.istop" value="0" <s:if test="info==null || info.istop==null || info.istop==0">checked="checked"</s:if> >否
								<input name="info.topendtime" id="topendtime" style="display:none"<s:if test="info==null || info.istop==null || info.istop==0"></s:if> class="Wdate"  title="选择固顶结束时间，没有则表示永远固顶!" type="text" size="24" value="${info.topendtimeStr }"  onClick="WdatePicker({skin:'default',dateFmt:'yyyy-MM-dd HH:mm:ss'})"/>
							
							</TD>
						</TR>
						<TR>
							<TD width="30%" align="left">
								<LABEL id=ctl01_ctl00_label><IMG
											style="BORDER-RIGHT-WIDTH: 0px; BORDER-TOP-WIDTH: 0px; BORDER-BOTTOM-WIDTH: 0px; BORDER-LEFT-WIDTH: 0px"
											id=ctl01_ctl00_imgHelp tabIndex=-1 alt=请输入Tag标签，用,分隔
											src="../../img/help.gif">
									<NOBR>
										<SPAN id=ctl01_ctl00_lblLabel>Tag标签：</SPAN>
									</NOBR>
								</LABEL>
							</TD>
							<TD width="70%" align="left">
								<INPUT onblur="this.className='inputblur';" id=tags
									class=inputblur onfocus="this.className='inputfocus';" 
									maxLength=50 type=text name=info.tags value="${info.tags }">多个标签之间用,分隔
							</TD>
						</TR>
						<TR>
							<TD width="30%" align="left">
								<LABEL id=ctl01_ctl00_label><IMG
											style="BORDER-RIGHT-WIDTH: 0px; BORDER-TOP-WIDTH: 0px; BORDER-BOTTOM-WIDTH: 0px; BORDER-LEFT-WIDTH: 0px"
											id=ctl01_ctl00_imgHelp tabIndex=-1 alt=请输入外部链接,输入后点击此信息标题会直接进入此外部链接
											src="../../img/help.gif">
									<NOBR>
										<SPAN id=ctl01_ctl00_lblLabel>外部链接：</SPAN>
									</NOBR>
								</LABEL>
							</TD>
							<TD width="70%" align="left">
								<INPUT onblur="this.className='inputblur';" id=url
									class=inputblur onfocus="this.className='inputfocus';" 
									maxLength=250 size="45" type=text name=info.url value="${info.url }">
							</TD>
						</TR>
						<TR>
							<TD width="30%" align="left">
								<LABEL id=ctl02_ctl00_label>
									<IMG
											style="BORDER-RIGHT-WIDTH: 0px; BORDER-TOP-WIDTH: 0px; BORDER-BOTTOM-WIDTH: 0px; BORDER-LEFT-WIDTH: 0px"
											id=ctl02_ctl00_imgHelp tabIndex=-1 alt=请上传信息图片
											src="../../img/help.gif">
									<NOBR>
										<SPAN id=ctl02_ctl00_lblLabel>信息图片：</SPAN>
									</NOBR>
								</LABEL>
							</TD>
							<TD align="left"> 
							<input type="hidden" name="info.img" id="img" value="<%=checkParentPath %>${info.img }"/>
							<span id="imgSpan">
							<s:if test='%{info.img!=null && info.img != "" && info.img != "null"}'>
							<a href="<%=checkParentPath %>${info.img }?date=<%=UUID.randomUUID() %>" target="_blank">
							<img src="<%=checkParentPath %>${info.img }?date=<%=UUID.randomUUID() %>" width="100" height="100" title="点击查看大图"/>
							</a>
							</s:if>
							</span>
							
							<s:if test='%{info.img!=null && info.img != "" && info.img != "null"}'>
							<a style="display:block" id="imgDelBtn" href="javascript:delImg()">删除</a>
							</s:if>
							<s:if test='%{info.img==null || info.img == "" || info.img == "null"}'>
							<a style="display:none" id="imgDelBtn" href="javascript:delImg()">删除</a>
							</s:if>
							<br/>
									<input type="button"  class="button" value="选择图片" onclick="selectImg()"/>
							</TD>
						</TR>
						<TR>
							<TD width="30%" align="left">
								<LABEL id=ctl01_ctl00_label><IMG
											style="BORDER-RIGHT-WIDTH: 0px; BORDER-TOP-WIDTH: 0px; BORDER-BOTTOM-WIDTH: 0px; BORDER-LEFT-WIDTH: 0px"
											id=ctl01_ctl00_imgHelp tabIndex=-1 alt=请上传附件
											src="../../img/help.gif">
									<NOBR>
										<SPAN id=ctl01_ctl00_lblLabel>附件：</SPAN>
									</NOBR>
								</LABEL>
							</TD>
							<TD width="70%" align="left">
							<input type="hidden" name="info.attchs" id="attchs" value="${info.attchs }"/>
							<span id="attchSpan">
								<%
								//获取附件列表
								if(request.getAttribute("info")!=null){
									Info info=(Info)request.getAttribute("info");
									if(info!=null && info.getAttchs()!=null && info.getAttchs().trim().length()>0){
										String[] attchs=info.getAttchs().split(";");
										if(attchs!=null && attchs.length>0){
											for(int i=0;i<attchs.length;i++){
												if(attchs[i].trim().length()>0){
													String id=UUID.randomUUID().toString();
													out.println("<span id='attch"+id+"' value='"+attchs[i]+"'><br><a  href='"+attchs[i]+"' target='_blank' title='点击下载'>"+
															URLDecoder.decode(attchs[i].substring(attchs[i].lastIndexOf("/")+1),"utf-8")+
															"</a>&nbsp;&nbsp;<a  href='javascript:delAttch(\""+id+"\")'>删除</a></span>");
												}
											}
										}
									}
								}
									
								%>
							</span><br/>
									<input type="button"  class="button" value="添加附件" onclick="selectFile()"/>
							</TD>
						</TR>
						<TR>
							<TD width="30%" align="left">
								<LABEL id=ctl01_ctl00_label><IMG
											style="BORDER-RIGHT-WIDTH: 0px; BORDER-TOP-WIDTH: 0px; BORDER-BOTTOM-WIDTH: 0px; BORDER-LEFT-WIDTH: 0px"
											id=ctl01_ctl00_imgHelp tabIndex=-1 alt=请选择添加时间，默认是当前时间
											src="../../img/help.gif">
									<NOBR>
										<SPAN id=ctl01_ctl00_lblLabel>添加时间：</SPAN>
									</NOBR>
								</LABEL>
							</TD>
							<TD width="70%" align="left">
							<input name="info.addtime" id="addtime"  class="Wdate"  type="text" size="24" value="${info.addtimeStr }"  onClick="WdatePicker({skin:'default',dateFmt:'yyyy-MM-dd HH:mm:ss'})"/>
							
							</TD>
						</TR>
						<TR>
							<TD  align="center" colspan="10">
							<input type="button" value="保 存" onclick="save()"  class="button"  />
							</TD>
						</TR>
					</TBODY>
				</TABLE>
			</DIV>
			
		</FORM>
	</BODY>
</HTML>

