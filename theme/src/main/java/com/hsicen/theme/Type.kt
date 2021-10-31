package com.hsicen.theme

import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp


/**
 * 作者：hsicen  8/24/21 10:50
 * 邮箱：codinghuang@163.com
 * 功能：
 * 描述：custom widgets style
 */

val Typography = Typography(
  body1 = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.Normal,
    fontSize = 16.sp
  ),

  body2 = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.Normal,
    fontSize = 14.sp
  ),

  button = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.W500,
    fontSize = 14.sp
  ),

  caption = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.Normal,
    fontSize = 12.sp
  ),

  subtitle1 = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.Normal,
    fontSize = 16.sp,
    color = Color.Gray
  ),

  subtitle2 = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.Normal,
    fontSize = 14.sp,
    color = Color.Gray
  )
)