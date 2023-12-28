package com.nicholasfragiskatos.feedme.ui.screens.home.listcontent

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.nicholasfragiskatos.feedme.utils.DateUtils
import java.time.LocalDateTime

@Composable
fun Header(date: LocalDateTime, dayTotal: String, onShare: () -> Unit) {
    val formattedDate = DateUtils.getFormattedDate(date)

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = MaterialTheme.colorScheme.surface)
            .padding(8.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = formattedDate,
                style = MaterialTheme.typography.headlineSmall,
                color = MaterialTheme.colorScheme.secondary,
            )

            Text(
                text = "Total: $dayTotal",
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.secondary
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            IconButton(onClick = onShare) {
                Icon(
                    imageVector = Icons.Filled.Share,
                    contentDescription = "Share Daily Summary"
                )
            }
        }
    }
}