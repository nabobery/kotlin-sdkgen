package com.nabobery.sdkgen.model

import kotlin.test.Test
import kotlin.test.assertEquals

class ModelContractTest {
    @Test
    fun `minimal immutable document renders deterministically`() {
        val source =
            SourcePointer(
                documentUri = "sdkgen://source/minimal.yaml",
                jsonPointer = "",
                location = SourceLocation(line = 1, column = 1, byteOffset = 0),
            )
        val document =
            SemanticDocument(
                documentUri = source.documentUri,
                title = "Minimal",
                version = "1.0.0",
                sourceDocuments =
                    listOf(
                        SourceDocumentIdentity(
                            canonicalUri = source.documentUri,
                            sha256 = "0".repeat(64),
                            contentLength = 1,
                            acquisitionPolicy = AcquisitionPolicy.LOCAL_FILE,
                            source = source,
                        ),
                    ),
                schemas = emptyMap(),
                operations = emptyList(),
                securityAlternatives = emptyList(),
                extensions = emptyMap(),
                diagnostics = emptyList(),
                source = source,
            )

        assertEquals(SnapshotRenderer.render(document), SnapshotRenderer.render(document.copy()))
    }

    @Test
    fun `operation extension models expose typed immutable value semantics`() {
        val pagination =
            PaginationModel.Cursor(
                requestCursor = "cursor",
                requestLimit = "limit",
                responseItems = JsonPointer("/data"),
                responseNextCursor = JsonPointer("/nextCursor"),
            )
        val streaming =
            StreamingModel.Sse(
                requestFlag = "stream",
                responseContentType = "text/event-stream",
                sentinel = "[DONE]",
            )
        val idempotency =
            IdempotencyModel(
                keyHeader = "Idempotency-Key",
                clientGenerated = true,
            )

        assertEquals(pagination, pagination.copy())
        assertEquals(streaming, streaming.copy())
        assertEquals(idempotency, idempotency.copy())
        assertEquals(listOf("data"), pagination.responseItems.segments)
    }
}
