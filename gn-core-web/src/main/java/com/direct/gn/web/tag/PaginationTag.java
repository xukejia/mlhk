/**
 * com.direct.gn
 */
package com.direct.gn.web.tag;

import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.tags.HtmlEscapingAwareTag;

import com.direct.gn.result.PageResult;

import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/**
 * @author cc
 */
public class PaginationTag extends HtmlEscapingAwareTag {
    private final static int MC = 9;
    private final static int[] PAGESIZE_BAR_ARR = new int[]{20, 30, 50, 100};

    /**
     *
     */
    private static final long serialVersionUID = 3788702160164690067L;

    private String formId;

    private String actionUrl;

    private Writer writer;

    private Boolean showPageSize;

    @SuppressWarnings("rawtypes")
    @Override
    protected int doStartTagInternal() throws Exception {

        this.writer = createTagWriter();
        Object obj = pageContext.getRequest().getAttribute("page");
        PageResult page = null;
        if (obj instanceof PageResult) {
            page = (PageResult) obj;

            String path = getRequestContext().getContextPath();

            appendValue("<form ");
            writeAttribute("id", "pageForm");
            writeAttribute("method", "post");
            writeAttribute("action", path + this.actionUrl);
            writeAttribute("class", "form-inline");
            appendValue(">\r\n");


            appendValue("<div ");
            String strClsPgSz = BooleanUtils.isTrue(showPageSize) ? StringUtils.EMPTY : " hide";
            writeAttribute("class", "dataTables_length pagination" + strClsPgSz);
            writeAttribute("id", "datatable_length");
            appendValue(" >");
            appendValue("<label>每页显示 ");
            appendValue("<select ");
            writeAttribute("class", "form-control input-sm");
            writeAttribute("aria-controls", "datatable");
            writeAttribute("name", "numPerPage");
            writeAttribute("onChange", "$('#changePgSz').val('true');pageTag(1)");
            appendValue(" >");
            int oldPageSize = page.getPageSize();
            Arrays.stream(PAGESIZE_BAR_ARR).forEach(pgSz -> {
                appendValue("<option value=\"");
                appendValue(String.valueOf(pgSz));
                appendValue("\" ");
                appendValue(pgSz == oldPageSize ? " selected" : "");
                appendValue(">");
                appendValue(String.valueOf(pgSz));
                appendValue("</option>");
            });
            appendValue("</select>");
            appendValue(" 条记录</label>");
            appendValue("</div>");


            appendValue("<div style='text-align: right;'>");

            appendValue("<ul class='pagination pagination-right'>");
            if (page.getPages() >= 1 && page.getPageNum() >= 1) {

                if (page.getPageNum() > 1) {
                    appendValue("<li><a href='javascript:pageTag(" + (page.getPageNum() - 1) + ")'>&laquo;</a></li>");
                }

                if (page.getPageNum() <= 1) {
                    appendValue("<li class='disabled'><a href='#'>&laquo;</a></li>");
                }

                String sytle = "";
                if (1 == page.getPageNum()) {
                    sytle = "active";
                }

                appendValue("<li class='" + sytle + "'><a href='javascript:pageTag(1)'>1</a></li>");

                // final int count = page.getPageNum() + maxCount - 1;

//                if (page.getPageNum() > 2) {
//                    if (page.getPageNum() > maxCount) {
//                        appendValue("<li class='disabled'><a href='#'>.......</a></li>");
//                    }
//                }
                int currPage = page.getPageNum();
                int pages = page.getPages();
                boolean haveEnd = false;
                int begin = currPage - (MC - 1) / 2;
                int end = currPage + (MC + 1) / 2;
                if (currPage < (MC + 3) / 2 || pages < MC + 3) {
                    begin = 2;
                    end = MC + 2;
                } else if (currPage > pages - (MC + 1) / 2) {
                    begin = pages - MC;
                    end = pages;
                }

                String omitBox = "<li><a href='javascript:void(0)'>...</a></li>";
                appendValue(begin > 2 ? omitBox : StringUtils.EMPTY);
                for (int i = begin; i < end; i++) {
                    if (i > 1 && i < pages) {
                        sytle = i == currPage ? "active" : "";
                        appendValue("<li class='" + sytle + "'>");
                        appendValue("<a href='javascript:pageTag(" + i + ")'>" + i + "</a>");
                        appendValue("</li>");
                        if (i == pages) {
                            haveEnd = true;
                        }
                    }
                }
                appendValue(end < pages - 1 ? omitBox : StringUtils.EMPTY);

                sytle = pages == currPage ? "active" : "";
                if (!haveEnd && pages > 1) {
                    appendValue("<li class='" + sytle + "'>");
                    appendValue("<a href='javascript:pageTag(" + pages + ")'>" + pages + "</a>");
                    appendValue("</li>");
                }


//                for (int i = 2; i <= page.getPages(); i++) {
//                    long tmp = i;
//                    long tmp = i;
//                    long tmp = i;
//
//                    if (page.getPageNum() > maxCount) {
//                        tmp = tmp + page.getPageNum() - maxCount;
//                    }
//                    sytle = "";
//                    if (tmp == page.getPageNum()) {
//                        sytle = "active";
//                    }
//
//                    appendValue(
//                            "<li class='" + sytle + "'><a href='javascript:pageTag(" + tmp + ")'>" + tmp + "</a></li>");
//
//                    if (maxCount == i) {
//                        if ((page.getPages() - maxCount) > 0 && page.getPageNum() != page.getPages()) {
//                            if (!(page.getPages() - page.getPageNum() == 1)) {
//                                appendValue("<li class='disabled'><a href='#'>.......</a></li>");
//                            }
//
//                            tmp = page.getPages();
//                            appendValue("<li class='" + sytle + "'><a href='javascript:pageTag(" + tmp + ")'>" + tmp
//                                    + "</a></li>");
//                        }
//
//                        break;
//                    }
//                }

                if (page.getPageNum() < page.getPages()) {
                    appendValue("<li><a href='javascript:pageTag(" + (page.getPageNum() + 1) + ")'>&raquo;</a></li>");
                }
                if (page.getPageNum() >= page.getPages()) {
                    appendValue("<li class='disabled'><a href='#'>&raquo;</a></li>");
                }

            }

            appendValue("</ul>");
            appendValue("</div>");
            appendValue("<input ");
            writeAttribute("type", "hidden");
            writeAttribute("value", "" + page.getPageNum());
            writeAttribute("id", "pageNum");
            writeAttribute("name", "pageNum");
            appendValue("/>");

//            appendValue("<input");
//            writeAttribute("type", "hidden");
//            writeAttribute("value", "" + page.getPageSize());
//            writeAttribute("id", "numPerPage");
//            writeAttribute("name", "numPerPage");
//            appendValue("/>");

            appendValue("<input");
            writeAttribute("type", "hidden");
            writeAttribute("value", "" + page.getPageSize());
            writeAttribute("id", "numPerNum");
            writeAttribute("name", "numPerNum");
            appendValue("/>");

            appendValue("<input");
            writeAttribute("type", "hidden");
            writeAttribute("value", this.formId);
            writeAttribute("id", "formId");
            appendValue("/>");

            appendValue("<input");
            writeAttribute("type", "hidden");
            writeAttribute("value", "false");
            writeAttribute("name", "changePgSz");
            writeAttribute("id", "changePgSz");
            appendValue("/>");

            appendValue("</form>");

            appendValue("<script type=\"text/javascript\" src=\"" + path + "/js/paginationTag.js\"></script>");
        }
        return SKIP_BODY;
    }

    protected Writer createTagWriter() {
        return pageContext.getOut();
    }

    public String getFormId() {
        return formId;
    }

    public void setFormId(String formId) {
        this.formId = formId;
    }

    public String getActionUrl() {
        return this.actionUrl;
    }

    public void setActionUrl(String actionUrl) {
        this.actionUrl = actionUrl;
    }

    public Boolean getShowPageSize() {
        return showPageSize;
    }

    public void setShowPageSize(Boolean showPageSize) {
        this.showPageSize = showPageSize;
    }

    protected void writeAttribute(String name, String value) {
        safeWrite(" " + name + "=\"" + value + "\"");

    }

    protected void appendValue(String value) {
        safeWrite(value);
    }

    protected void safeWrite(String value) {
        try {
            writer.write(value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
