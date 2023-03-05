package com.yawomessie.gmailclone.components

import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.runtime.Composable

//Todo 1 create a new file and create GmailFab compose function in it
//Todo 4: create a scroll state variable
@Composable
fun GmailFab() {
    //Todo 2: add a floating action button
    FloatingActionButton(
        onClick = {},
        backgroundColor = MaterialTheme.colors.surface,
    ) {
        Icon(imageVector = Icons.Default.Edit, "")
    }}

