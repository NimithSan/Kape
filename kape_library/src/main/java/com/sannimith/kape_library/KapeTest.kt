package com.sannimith.kape_library

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomTextField(
    modifier: Modifier = Modifier,
    modifierForFocus: Modifier = Modifier,
    placeholder: @Composable (() -> Unit) ?= null,
    text: String,
    maxLines: Int = 10,
    onChange: (newString: String) -> Unit,
    singleLine: Boolean = false,
    shape: Shape = RoundedCornerShape(8.dp),
    leadingIcon : @Composable (() -> Unit) ?= null,
    trailingIcon: @Composable (() -> Unit) ?= null,
    readOnly: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
){
    BasicTextField(
        value = text,
        onValueChange = { newText ->
            onChange(newText)
        },
        textStyle = TextStyle(
            fontSize = 15.sp,
            color = Color.DarkGray,
            fontWeight = FontWeight.Medium
        ),
        decorationBox = { innerTextField ->
            Row(
                modifier = modifier
                    .border(
                        border = BorderStroke(width = 1.dp, color = Color.LightGray),
                        shape = shape
                    )
                    .clip(shape = shape)
                    .background(Color.Transparent),
                verticalAlignment = Alignment.CenterVertically
            ) {
                if (leadingIcon != null) leadingIcon()
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .padding(vertical = 10.dp, horizontal = 5.dp)// inner padding
                ) {
                    if (text.isEmpty() && placeholder != null){
                        placeholder()
                    }
                    innerTextField()
                }
                if (trailingIcon != null) trailingIcon()
            }
        },
        singleLine = singleLine,
        maxLines = maxLines,
        readOnly = readOnly,
        modifier = modifierForFocus,
        visualTransformation = visualTransformation,
    )
}
