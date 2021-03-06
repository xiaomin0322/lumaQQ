/*
* LumaQQ - Java QQ Client
*
* Copyright (C) 2004 luma <stubma@163.com>
*
* This program is free software; you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation; either version 2 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program; if not, write to the Free Software
* Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
*/
package edu.tsinghua.lumaqq.widgets.rich;

/**
 * 可wrap的content
 * 
 * @author luma
 */
public interface IWrappedRichContent extends IRichContent {
    /**
     * 根据指定宽度wrap
     * 
     * @param width
     * 		最大宽度
     */
    public void wrap(int width);
    
    /**
     * 根据软行得到硬行的索引
     * 
     * @param softLineIndex
     * 		软行行号
     * @return
     * 		硬行行号
     */
    public int getHardLineIndex(int softLineIndex);
    
    /**
     * @return
     * 		硬行行数
     */
    public int getHardLineCount();
}
