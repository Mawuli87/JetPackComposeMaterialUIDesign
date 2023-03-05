package com.yawomessie.gmailclone

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.*

import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.yawomessie.gmailclone.components.GmailDrawerMenu
import com.yawomessie.gmailclone.components.HomeAppBar
import com.yawomessie.gmailclone.components.HomeBottomMenu
import com.yawomessie.gmailclone.ui.theme.GmailCloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GmailCloneTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    GmailApp()
                }
            }
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun GmailApp() {
    /**Todo 4 create values for Scaffold state and coroutine scope
     * pass the values into HomeAppBar
     * */
    val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()
    //Todo 19: create value for scroll state
    val scrollState = rememberScrollState()
    //Todo 6:add scaffold state to scaffold
    Scaffold(scaffoldState = scaffoldState,
        topBar = {
            HomeAppBar(scaffoldState,coroutineScope)
        },
        //Todo 5: add drawer content with empty lambda
        drawerContent = {
            //Todo 9:pass GmailDrawerMenu as the drawer content
            //Todo 20 pass the scrollstate value
            GmailDrawerMenu(scrollState)
        },
        bottomBar = {
            HomeBottomMenu()
        }
    ){
        LazyColumn{
            items(50){
                index-> Text(text = "Index @$index")
                Divider()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GmailCloneTheme {
        GmailApp()
    }
}