@file:Suppress("ktlint:standard:max-line-length")

package com.nabobery.sdkgen.engine.emit

import com.nabobery.sdkgen.engine.declarations.FormFieldDeclaration
import com.nabobery.sdkgen.engine.declarations.FormScalarKind
import com.nabobery.sdkgen.engine.declarations.FormValueDeclaration
import com.nabobery.sdkgen.engine.declarations.KotlinDeclarationModel
import com.nabobery.sdkgen.engine.declarations.KotlinFileDeclaration
import com.nabobery.sdkgen.engine.declarations.KotlinTypeRef
import com.nabobery.sdkgen.engine.declarations.MultipartPartDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationClientDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationDeadlines
import com.nabobery.sdkgen.engine.declarations.OperationDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationParameterDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationParameterLocation
import com.nabobery.sdkgen.engine.declarations.OperationRequestBodyAlternative
import com.nabobery.sdkgen.engine.declarations.OperationRequestVariantDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationResponseAlternative
import com.nabobery.sdkgen.engine.declarations.OperationResponseMode
import com.nabobery.sdkgen.engine.declarations.RequestBodyEncoding
import com.nabobery.sdkgen.engine.declarations.RequestBodyReplayability
import com.nabobery.sdkgen.engine.declarations.ResponseSelectorDeclaration
import com.nabobery.sdkgen.engine.declarations.StreamingDeclaration
import com.nabobery.sdkgen.engine.declarations.SupportDeclaration
import com.nabobery.sdkgen.engine.declarations.SupportKind
import org.jetbrains.kotlin.cli.common.ExitCode
import org.jetbrains.kotlin.cli.jvm.K2JVMCompiler
import org.junit.jupiter.api.AfterAll
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import java.net.URLClassLoader
import java.nio.file.Files
import java.nio.file.Path
import java.util.Base64
import kotlin.io.path.createDirectories
import kotlin.io.path.writeText
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * Media-specific emission regression coverage (ADR 0021): one callable method + request-codec path per declared
 * [OperationRequestVariantDeclaration], compiled AND executed against a scripted in-memory transport through the
 * real runtime executor. The generated sources are compiled with the embeddable compiler and run via reflection,
 * so every wire-level claim below (exact URL/parameters/auth per variant, hardcoded content types, JSON and
 * multipart wire bodies, typed success/error decoding, and replayability-driven retry suppression) is exercised
 * end to end rather than asserted against source text alone.
 */
class OperationVariantEmissionCompileRegressionTest {
    @Test
    fun dualMediaVariantsCompileWithDistinctRequestTypesNullableBodiesSharedParametersAndTypedErrors() {
        val rendered = KotlinPoetEmitter(PACKAGE).render(dualMediaModel()).files
        val source = rendered.single { file -> file.path.endsWith("/VariantClient.kt") }.bytes.decodeToString()
        val flat = source.replace(Regex("\\s+"), " ")

        // Required dual-media operation: two callable methods over two different request types sharing the
        // operation's path/query parameters.
        assertTrue(
            Regex("public suspend fun transcribeAudio\\(\\s?request: TranscribeJsonRequest,\\s?team: String")
                .containsMatchIn(flat),
            source,
        )
        assertTrue(
            Regex(
                "public suspend fun transcribeAudioMultipart\\(\\s?request: TranscribeMultipartRequest,\\s?team: String",
            ).containsMatchIn(flat),
            source,
        )
        // Optional-body dual-media operation: both callable variants take a NULLABLE request with a null default.
        assertTrue(
            Regex("public suspend fun annotateDraft\\(\\s?request: DraftJsonRequest\\? = null").containsMatchIn(flat),
            source,
        )
        assertTrue(
            Regex("public suspend fun annotateDraftForm\\(\\s?request: DraftFormRequest\\? = null")
                .containsMatchIn(flat),
            source,
        )
        // Typed errors are shared operation semantics wired into every variant's execution path.
        assertTrue(
            flat.contains("executeWithTypedErrors<TranscribeJsonRequest, TranscribeAudioResponse, Transcription>("),
            source,
        )
        assertTrue(
            flat.contains(
                "executeWithTypedErrors<TranscribeMultipartRequest, TranscribeAudioResponse, Transcription>(",
            ),
            source,
        )
        assertEquals(1, Regex("private object TranscribeAudioResponseDecoder").findAll(source).count())
        // Per-variant codecs behind per-variant registries; the form variant emits its own form codec object.
        assertTrue(
            source.contains("""TRANSCRIBE_AUDIO_REQUEST_CODEC_ID: String = "transcribeAudio.request""""),
            source,
        )
        assertTrue(source.contains("MediaTypeCodec<TranscribeJsonRequest>"), source)
        assertTrue(source.contains("MediaTypeCodec<TranscribeMultipartRequest>"), source)
        assertTrue(source.contains("FormUrlEncodedBody()"), source)
        assertTrue(source.contains("val transcribeAudioRequestCodecRegistry"), source)
        assertTrue(source.contains("val transcribeAudioMultipartRequestCodecRegistry"), source)
        assertTrue(source.contains("val annotateDraftRequestCodecRegistry"), source)
        assertTrue(source.contains("val annotateDraftFormRequestCodecRegistry"), source)

        // Compiled together with the execution harness, which declares every wire type this client references
        // (the class-wide cached compilation covers exactly this file set).
        compileVariantClient()
    }

    @Test
    fun generatedDualMediaMethodsExecuteWithExactUrlParametersAuthAndWireBodiesPerVariant() {
        val output = compileVariantClient()

        URLClassLoader(arrayOf(output.toUri().toURL()), javaClass.classLoader).use { loader ->
            val harness = loader.loadClass("$PACKAGE.VariantExecutionHarnessKt")
            // The JSON variant sends its own serializer output under its own hardcoded content type.
            val jsonOutcome = harness.getMethod("jsonVariantOutcome").invoke(null) as String
            assertEquals(
                listOf(
                    "hi", // decoded typed success payload
                    "POST",
                    "https://api.example.com/v1/audio/acme/transcriptions?language=en",
                    "application/json",
                    """{"model":"whisper","prompt":"hello"}""",
                ).joinToString("|"),
                jsonOutcome.substringBefore("|HDRS|"),
                jsonOutcome,
            )
            // The multipart variant sends its own part encoder output under ITS hardcoded content type.
            val multipartOutcome = harness.getMethod("multipartVariantOutcome").invoke(null) as String
            assertEquals(
                listOf("mp", "POST", "https://api.example.com/v1/audio/acme/transcriptions").joinToString("|"),
                multipartOutcome.substringBefore("|CT|"),
                multipartOutcome,
            )
            val multipartContentType = multipartOutcome.substringAfter("|CT|").substringBefore("|BODY|")
            val multipartBody =
                Base64.getDecoder().decode(multipartOutcome.substringAfter("|BODY|").substringBefore("|HDRS|"))
            assertTrue(multipartContentType.startsWith("multipart/form-data; boundary="), multipartContentType)
            assertMultipartWireBody(multipartContentType, multipartBody.decodeToString())
            // Shared operation semantics: identical non-body headers (auth included) across both media variants.
            val jsonHeaders = jsonOutcome.substringAfter("|HDRS|")
            val multipartHeaders = multipartOutcome.substringAfter("|HDRS|").substringBefore("|CT|")
            assertEquals(jsonHeaders, multipartHeaders, "auth/parameter headers must be identical across variants")
            assertTrue(jsonHeaders.contains("Authorization=Bearer token123"), jsonHeaders)
        }
    }

    @Test
    fun generatedVariantsReturnTypedSuccessAndTypedNonSuccessResponsesPerMedia() {
        URLClassLoader(arrayOf(compileVariantClient().toUri().toURL()), javaClass.classLoader).use { loader ->
            val harness = loader.loadClass("$PACKAGE.VariantExecutionHarnessKt")

            val jsonError = harness.getMethod("typedErrorOutcomeJson").invoke(null) as String
            assertEquals("ApiException:bad-json", jsonError, jsonError)

            val multipartSuccess = harness.getMethod("typedSuccessOutcomeMultipart").invoke(null) as String
            assertEquals("decoded:mp-success", multipartSuccess, multipartSuccess)

            val multipartError = harness.getMethod("typedErrorOutcomeMultipart").invoke(null) as String
            assertEquals("ApiException:bad-multipart", multipartError, multipartError)
        }
    }

    @Test
    fun oneShotMultipartStreamBodyIsNeverRetriedWhileReplayableJsonBodyRetries() {
        URLClassLoader(arrayOf(compileVariantClient().toUri().toURL()), javaClass.classLoader).use { loader ->
            val harness = loader.loadClass("$PACKAGE.VariantExecutionHarnessKt")

            // Positive control: the REPLAYABLE JSON body is retried after the scripted 500 (2 attempts total).
            val jsonAttempts = harness.getMethod("jsonRetryAttemptCount").invoke(null) as String
            assertEquals("ok|2", jsonAttempts, jsonAttempts)

            // The NON_REPLAYABLE multipart body binds an SdkRequestBody.OneShot at generation time, so the same
            // scripted failure yields EXACTLY ONE transport attempt despite a retryable status and budget left.
            val multipartAttempts = harness.getMethod("multipartNeverRetriedAttemptCount").invoke(null) as String
            assertEquals("attempts=1", multipartAttempts, multipartAttempts)
        }
    }

    @Test
    fun streamingSecondaryVariantExecutesThroughTheStreamingPathAndDecodesEvents() {
        URLClassLoader(arrayOf(compileVariantClient().toUri().toURL()), javaClass.classLoader).use { loader ->
            val harness = loader.loadClass("$PACKAGE.VariantExecutionHarnessKt")

            // Primary: JSON request codec, SSE accept header injected, both events decoded through the real
            // SdkExecutor + sseFlow pipeline.
            val primary = harness.getMethod("streamPrimaryOutcome").invoke(null) as String
            assertEquals(
                listOf(
                    "one,two",
                    "POST",
                    "https://api.example.com/v1/audio/acme/events",
                    "application/json",
                    """{"model":"whisper"}""",
                ).joinToString("|"),
                primary.substringBefore("|HDRS|"),
                primary,
            )
            assertTrue(primary.substringAfter("|HDRS|").contains("Accept=text/event-stream"), primary)

            // The SECONDARY variant must take the SAME streaming path (no buffered executor.execute, which would
            // throw "execute() requires at least one response codec id" after performing transport): its own
            // multipart wire body goes out, and the shared SSE response decodes the same events.
            val secondary = harness.getMethod("streamSecondaryOutcome").invoke(null) as String
            assertEquals(
                listOf(
                    "one,two",
                    "POST",
                    "https://api.example.com/v1/audio/acme/events",
                ).joinToString("|"),
                secondary.substringBefore("|CT|"),
                secondary,
            )
            val contentType = secondary.substringAfter("|CT|").substringBefore("|BODY|")
            assertTrue(contentType.startsWith("multipart/form-data; boundary="), contentType)
            val body = Base64.getDecoder().decode(secondary.substringAfter("|BODY|").substringBefore("|HDRS|"))
            assertTrue(body.decodeToString().contains("fake-wav-bytes"), secondary)
            val secondaryHeaders = secondary.substringAfter("|HDRS|")
            assertEquals(
                primary.substringAfter("|HDRS|"),
                secondaryHeaders,
                "shared streaming headers must match across variants",
            )
        }
    }

    @Test
    fun genericSecondaryMediaVariantSendsItsDeclaredContentTypeAndRoundTrips() {
        URLClassLoader(arrayOf(compileVariantClient().toUri().toURL()), javaClass.classLoader).use { loader ->
            val harness = loader.loadClass("$PACKAGE.VariantExecutionHarnessKt")

            // The text/csv secondary sends ITS declared Content-Type carrying the string's RAW bytes — the CSV
            // document itself, never a JSON-quoted representation — and decodes the response without an
            // SdkCapabilityException from a JSON-only codec registry.
            val outcome = harness.getMethod("genericSecondaryOutcome").invoke(null) as String
            assertEquals(
                listOf(
                    "ok",
                    "text/csv",
                    "a,b",
                    "https://api.example.com/v1/imports/acme",
                ).joinToString("|"),
                outcome.substringBefore("|HDRS|"),
                outcome,
            )
            assertTrue(outcome.substringAfter("|HDRS|").contains("Authorization=Bearer token123"), outcome)
        }
    }

    private fun assertMultipartWireBody(
        contentType: String,
        body: String,
    ) {
        val boundary = requireNotNull(Regex("boundary=(.+)$").find(contentType)?.groupValues?.get(1))
        // Parse into (wire name -> value) entries, preserving repeats: a `[]`-named part appears more than once.
        val entries =
            body.split("--$boundary").drop(1).dropLast(1).map { rawPart ->
                val (head, value) = splitPart(rawPart.trim('\r', '\n'))
                val name = requireNotNull(Regex("""name="([^"]*)"""").find(head)) { head }.groupValues[1]
                Triple(name, head, value.trim('\r', '\n'))
            }

        fun valuesOf(name: String): List<String> = entries.filter { it.first == name }.map { it.third }

        fun headOf(name: String): String = entries.first { it.first == name }.second

        // file + caption + response_format + granularities[0] + granularities[1] + two repeated timestamp parts.
        assertEquals(7, entries.size, body)
        // No part name may be double-bracketed: a `[]`-terminated wire name must not gain another `[index]`.
        assertTrue(entries.none { it.first.contains("[][") }, body)

        assertTrue(headOf("file").contains("Content-Type: audio/wav"), body)
        assertEquals(listOf("fake-wav-bytes"), valuesOf("file"), body)
        assertTrue(headOf("caption").contains("Content-Type: text/plain"), body)
        assertEquals(listOf("hello"), valuesOf("caption"), body)

        // F1: the string-backed open-enum scalar arrives as bare `verbose_json` (no JSON quotes) in a text part.
        assertTrue(headOf("response_format").contains("Content-Type: text/plain"), body)
        assertEquals(listOf("verbose_json"), valuesOf("response_format"), body)

        // Existing non-`[]` indexed part keeps `name[index]` with the enum element's `.value`.
        assertEquals(listOf("word"), valuesOf("granularities[0]"), body)
        assertEquals(listOf("segment"), valuesOf("granularities[1]"), body)

        // F2: the `[]`-terminated indexed part repeats under its UNCHANGED name, one entry per element `.value`.
        assertEquals(listOf("word", "segment"), valuesOf("timestamp_granularities[]"), body)
    }

    private fun splitPart(part: String): Pair<String, String> {
        val separator = "\r\n\r\n"
        val index = requireNotNull(part.indexOf(separator)) { part }
        return part.substring(0, index) to part.substring(index + separator.length)
    }

    // One compilation per test CLASS: every test exercises the same generated client + harness file set, so
    // recompiling per test only multiplies embeddable-compiler wall clock. The output lives under the managed
    // class-level temp root and is removed in [cleanUpCompiledOutput].
    private fun compileVariantClient(): Path =
        cachedVariantClient ?: compileGenerated(
            KotlinPoetEmitter(PACKAGE).render(dualMediaModel()).files +
                RenderedKotlinFile(harnessPath(), executionHarness()),
        ).also { compiled -> cachedVariantClient = compiled }

    private fun harnessPath(): String = "${PACKAGE.replace('.', '/')}/VariantExecutionHarness.kt"

    /** Request/response models, a scripted transport, and reflective entry points compiled beside the SDK. */
    private fun executionHarness(): ByteArray =
        """
        package $PACKAGE

        import com.nabobery.sdkgen.runtime.BearerTokenAuthentication
        import com.nabobery.sdkgen.runtime.SdkApiException
        import com.nabobery.sdkgen.runtime.SdkByteStream
        import com.nabobery.sdkgen.runtime.SdkHeader
        import com.nabobery.sdkgen.runtime.SdkRequest
        import com.nabobery.sdkgen.runtime.SdkRequestBody
        import com.nabobery.sdkgen.runtime.SdkResponse
        import com.nabobery.sdkgen.runtime.SdkTransport
        import com.nabobery.sdkgen.runtime.TransportCapabilities
        import com.nabobery.sdkgen.runtime.toByteArray
        import kotlinx.coroutines.flow.toList
        import kotlinx.coroutines.runBlocking
        import kotlinx.serialization.KSerializer
        import kotlinx.serialization.builtins.serializer
        import kotlinx.serialization.descriptors.SerialDescriptor
        import kotlinx.serialization.descriptors.buildClassSerialDescriptor
        import kotlinx.serialization.encoding.Decoder
        import kotlinx.serialization.encoding.Encoder
        import kotlinx.serialization.json.JsonObject
        import kotlinx.serialization.json.buildJsonObject
        import kotlinx.serialization.json.jsonPrimitive
        import kotlinx.serialization.json.put
        import java.util.Base64

        class TranscribeJsonRequest(val model: String, val prompt: String? = null) {
            internal object Serializer : KSerializer<TranscribeJsonRequest> {
                override val descriptor: SerialDescriptor =
                    buildClassSerialDescriptor("$PACKAGE.TranscribeJsonRequest")

                override fun deserialize(decoder: Decoder): TranscribeJsonRequest {
                    val element = decoder.decodeSerializableValue(JsonObject.serializer())
                    return TranscribeJsonRequest(
                        model = element.getValue("model").jsonPrimitive.content,
                        prompt = element["prompt"]?.jsonPrimitive?.content,
                    )
                }

                override fun serialize(encoder: Encoder, value: TranscribeJsonRequest) {
                    encoder.encodeSerializableValue(
                        JsonObject.serializer(),
                        buildJsonObject {
                            put("model", value.model)
                            if (value.prompt != null) put("prompt", value.prompt)
                        },
                    )
                }
            }
        }

        class Granularity(val value: String)

        // A string-backed open-enum wrapper exposing `.value`, exactly the shape the fixed emitter must write as a
        // plain text part. It is deliberately NOT wired into SdkJson: the pre-fix emitter routes this scalar through
        // SdkJson.encodeToString(...), which fails the reified serializer lookup here — proving the JSON-encode
        // branch was taken (the F1 defect). The fixed emitter writes `value.value` as text and never serializes it.
        class ResponseFormat(val value: String)

        class TranscribeMultipartRequest(
            val file: SdkByteStream,
            val caption: String? = null,
            val responseFormat: ResponseFormat? = null,
            val granularities: List<Granularity> = emptyList(),
            val timestampGranularities: List<Granularity> = emptyList(),
        )

        class Transcription(val text: String) {
            internal object Serializer : KSerializer<Transcription> {
                override val descriptor: SerialDescriptor = buildClassSerialDescriptor("$PACKAGE.Transcription")

                override fun deserialize(decoder: Decoder): Transcription =
                    Transcription(decoder.decodeSerializableValue(JsonObject.serializer()).getValue("text").jsonPrimitive.content)

                override fun serialize(encoder: Encoder, value: Transcription) {
                    encoder.encodeSerializableValue(
                        JsonObject.serializer(),
                        buildJsonObject { put("text", value.text) },
                    )
                }
            }
        }

        class ApiError(val message: String) {
            internal object Serializer : KSerializer<ApiError> {
                override val descriptor: SerialDescriptor = buildClassSerialDescriptor("$PACKAGE.ApiError")

                override fun deserialize(decoder: Decoder): ApiError =
                    ApiError(decoder.decodeSerializableValue(JsonObject.serializer())["message"]?.jsonPrimitive?.content ?: "")

                override fun serialize(encoder: Encoder, value: ApiError) {
                    encoder.encodeSerializableValue(
                        JsonObject.serializer(),
                        buildJsonObject { put("message", value.message) },
                    )
                }
            }
        }

        class DraftJsonRequest(val note: String) {
            internal object Serializer : KSerializer<DraftJsonRequest> {
                override val descriptor: SerialDescriptor = buildClassSerialDescriptor("$PACKAGE.DraftJsonRequest")

                override fun deserialize(decoder: Decoder): DraftJsonRequest =
                    DraftJsonRequest(decoder.decodeSerializableValue(JsonObject.serializer()).getValue("note").jsonPrimitive.content)

                override fun serialize(encoder: Encoder, value: DraftJsonRequest) {
                    encoder.encodeSerializableValue(
                        JsonObject.serializer(),
                        buildJsonObject { put("note", value.note) },
                    )
                }
            }
        }

        class DraftFormRequest(val note: String)

        class StreamStartRequest(val model: String) {
            internal object Serializer : KSerializer<StreamStartRequest> {
                override val descriptor: SerialDescriptor =
                    buildClassSerialDescriptor("$PACKAGE.StreamStartRequest")

                override fun deserialize(decoder: Decoder): StreamStartRequest =
                    StreamStartRequest(
                        decoder.decodeSerializableValue(JsonObject.serializer()).getValue("model").jsonPrimitive.content,
                    )

                override fun serialize(encoder: Encoder, value: StreamStartRequest) {
                    encoder.encodeSerializableValue(
                        JsonObject.serializer(),
                        buildJsonObject { put("model", value.model) },
                    )
                }
            }
        }

        class StreamDelta(val text: String) {
            internal object Serializer : KSerializer<StreamDelta> {
                override val descriptor: SerialDescriptor = buildClassSerialDescriptor("$PACKAGE.StreamDelta")

                override fun deserialize(decoder: Decoder): StreamDelta =
                    StreamDelta(decoder.decodeSerializableValue(JsonObject.serializer()).getValue("text").jsonPrimitive.content)

                override fun serialize(encoder: Encoder, value: StreamDelta) {
                    encoder.encodeSerializableValue(
                        JsonObject.serializer(),
                        buildJsonObject { put("text", value.text) },
                    )
                }
            }
        }

        class ByteArrayStream(private val data: ByteArray) : SdkByteStream {
            private var offset = 0

            override suspend fun readChunk(maxBytes: Int): ByteArray? {
                if (offset >= data.size) return null
                val end = minOf(offset + maxBytes, data.size)
                return data.copyOfRange(offset, end).also { offset = end }
            }

            override fun close(cause: Throwable?) {}
        }

        class CapturedAttempt(
            val method: String,
            val uri: String,
            val headers: List<SdkHeader>,
            val contentType: String?,
            val bodyBytes: ByteArray,
        )

        class ScriptedTransport(vararg responses: Pair<Int, String>) : SdkTransport {
            val attempts = mutableListOf<CapturedAttempt>()
            private val queue = ArrayDeque(responses.toList())

            override suspend fun execute(request: SdkRequest): SdkResponse {
                val body = request.body
                attempts +=
                    CapturedAttempt(
                        method = request.method,
                        uri = request.uri,
                        headers = request.headers.toList(),
                        contentType = body?.contentType,
                        bodyBytes = if (body == null) ByteArray(0) else readBody(body),
                    )
                val (status, text) = queue.removeFirst()
                return SdkResponse(
                    statusCode = status,
                    headers = listOf(SdkHeader("Content-Type", "application/json")),
                    body = ByteArrayStream(text.encodeToByteArray()),
                )
            }

            private suspend fun readBody(body: SdkRequestBody): ByteArray =
                when (body) {
                    is SdkRequestBody.Bytes -> body.bytes
                    is SdkRequestBody.OneShot -> body.stream.toByteArray(MAX_CAPTURE_BYTES)
                    is SdkRequestBody.ReplayFactory -> readBody(body.create())
                }

            companion object {
                const val MAX_CAPTURE_BYTES: Long = 4L * 1024 * 1024
            }
        }

        /** Like [ScriptedTransport] but answers an SSE success and declares streaming transport capability. */
        class ScriptedStreamingTransport(private val sseBody: String) : SdkTransport {
            val attempts = mutableListOf<CapturedAttempt>()

            override fun capabilities(): TransportCapabilities = TransportCapabilities(supportsStreaming = true)

            override suspend fun execute(request: SdkRequest): SdkResponse {
                val body = request.body
                attempts +=
                    CapturedAttempt(
                        method = request.method,
                        uri = request.uri,
                        headers = request.headers.toList(),
                        contentType = body?.contentType,
                        bodyBytes = if (body == null) ByteArray(0) else readBody(body),
                    )
                return SdkResponse(
                    statusCode = 200,
                    headers = listOf(SdkHeader("Content-Type", "text/event-stream")),
                    body = ByteArrayStream(sseBody.encodeToByteArray()),
                )
            }

            private suspend fun readBody(body: SdkRequestBody): ByteArray =
                when (body) {
                    is SdkRequestBody.Bytes -> body.bytes
                    is SdkRequestBody.OneShot -> body.stream.toByteArray(MAX_CAPTURE_BYTES)
                    is SdkRequestBody.ReplayFactory -> readBody(body.create())
                }

            companion object {
                const val MAX_CAPTURE_BYTES: Long = 4L * 1024 * 1024
            }
        }

        private fun headerSummary(headers: List<SdkHeader>): String =
            headers
                .filter { !it.name.equals("Content-Type", ignoreCase = true) }
                .sortedBy(SdkHeader::name)
                .joinToString(";") { "${'$'}{it.name}=${'$'}{it.value}" }

        private fun newClient(transport: SdkTransport): VariantClient =
            VariantClient(transport, "https://api.example.com/v1", authentication = BearerTokenAuthentication { "token123" })

        fun jsonVariantOutcome(): String {
            val transport = ScriptedTransport(200 to "{\"text\":\"hi\"}")
            val result =
                runBlocking {
                    newClient(transport).transcribeAudio(
                        request = TranscribeJsonRequest(model = "whisper", prompt = "hello"),
                        team = "acme",
                        language = "en",
                    )
                }
            val attempt = transport.attempts.single()
            return listOf(result.text, attempt.method, attempt.uri, attempt.contentType.orEmpty(), attempt.bodyBytes.decodeToString(), "HDRS|" + headerSummary(attempt.headers)).joinToString("|")
        }

        fun multipartVariantOutcome(): String {
            val transport = ScriptedTransport(200 to "{\"text\":\"mp\"}")
            val result =
                runBlocking {
                    newClient(transport).transcribeAudioMultipart(
                        request = TranscribeMultipartRequest(
                            file = ByteArrayStream("fake-wav-bytes".encodeToByteArray()),
                            caption = "hello",
                            responseFormat = ResponseFormat("verbose_json"),
                            granularities = listOf(Granularity("word"), Granularity("segment")),
                            timestampGranularities = listOf(Granularity("word"), Granularity("segment")),
                        ),
                        team = "acme",
                        language = null,
                    )
                }
            val attempt = transport.attempts.single()
            return listOf(
                result.text,
                attempt.method,
                attempt.uri,
                "CT|" + attempt.contentType.orEmpty(),
                "BODY|" + Base64.getEncoder().encodeToString(attempt.bodyBytes),
                "HDRS|" + headerSummary(attempt.headers),
            ).joinToString("|")
        }

        fun typedSuccessOutcomeMultipart(): String {
            val transport = ScriptedTransport(200 to "{\"text\":\"mp-success\"}")
            val result =
                runBlocking {
                    newClient(transport).transcribeAudioMultipart(
                        request = TranscribeMultipartRequest(file = ByteArrayStream(ByteArray(0))),
                        team = "acme",
                    )
                }
            return "decoded:" + result.text
        }

        private fun apiErrorMessage(failure: VariantClient.TranscribeAudioApiException): String =
            (failure.error as VariantClient.TranscribeAudioResponse.Http400To499ProblemJson).json.message

        fun typedErrorOutcomeJson(): String =
            try {
                runBlocking {
                    newClient(ScriptedTransport(400 to "{\"message\":\"bad-json\"}"))
                        .transcribeAudio(request = TranscribeJsonRequest(model = "whisper"), team = "acme")
                }
                "no-exception"
            } catch (failure: VariantClient.TranscribeAudioApiException) {
                "ApiException:" + apiErrorMessage(failure)
            }

        fun typedErrorOutcomeMultipart(): String =
            try {
                runBlocking {
                    newClient(ScriptedTransport(400 to "{\"message\":\"bad-multipart\"}"))
                        .transcribeAudioMultipart(
                            request = TranscribeMultipartRequest(file = ByteArrayStream(ByteArray(0))),
                            team = "acme",
                        )
                }
                "no-exception"
            } catch (failure: VariantClient.TranscribeAudioApiException) {
                "ApiException:" + apiErrorMessage(failure)
            }

        fun jsonRetryAttemptCount(): String {
            val transport = ScriptedTransport(429 to "{}", 200 to "{\"text\":\"ok\"}")
            val result =
                runBlocking {
                    newClient(transport).transcribeAudio(request = TranscribeJsonRequest(model = "whisper"), team = "acme")
                }
            return result.text + "|" + transport.attempts.size
        }

        fun multipartNeverRetriedAttemptCount(): String {
            val transport = ScriptedTransport(429 to "{}", 200 to "{}")
            return try {
                runBlocking {
                    newClient(transport).transcribeAudioMultipart(
                        request = TranscribeMultipartRequest(file = ByteArrayStream("one-shot".encodeToByteArray())),
                        team = "acme",
                    )
                }
                "no-exception"
            } catch (failure: com.nabobery.sdkgen.runtime.SdkException) {
                "attempts=" + transport.attempts.size
            }
        }

        fun streamPrimaryOutcome(): String {
            val transport =
                ScriptedStreamingTransport(
                    "data: {\"text\":\"one\"}\n\ndata: {\"text\":\"two\"}\n\ndata: [DONE]\n\n",
                )
            val events =
                runBlocking {
                    newClient(transport)
                        .streamTranscription(request = StreamStartRequest(model = "whisper"), team = "acme")
                        .toList()
                }
            val attempt = transport.attempts.single()
            return listOf(
                events.joinToString(",") { it.text },
                attempt.method,
                attempt.uri,
                attempt.contentType.orEmpty(),
                attempt.bodyBytes.decodeToString(),
                "HDRS|" + headerSummary(attempt.headers),
            ).joinToString("|")
        }

        fun streamSecondaryOutcome(): String {
            val transport =
                ScriptedStreamingTransport(
                    "data: {\"text\":\"one\"}\n\ndata: {\"text\":\"two\"}\n\ndata: [DONE]\n\n",
                )
            val events =
                runBlocking {
                    newClient(transport)
                        .streamTranscriptionMultipart(
                            request = TranscribeMultipartRequest(file = ByteArrayStream("fake-wav-bytes".encodeToByteArray())),
                            team = "acme",
                        ).toList()
                }
            val attempt = transport.attempts.single()
            return listOf(
                events.joinToString(",") { it.text },
                attempt.method,
                attempt.uri,
                "CT|" + attempt.contentType.orEmpty(),
                "BODY|" + Base64.getEncoder().encodeToString(attempt.bodyBytes),
                "HDRS|" + headerSummary(attempt.headers),
            ).joinToString("|")
        }

        fun genericSecondaryOutcome(): String {
            val transport = ScriptedTransport(200 to "{\"text\":\"ok\"}")
            val result =
                runBlocking {
                    newClient(transport).importContactsCsv(request = "a,b", team = "acme")
                }
            val attempt = transport.attempts.single()
            return listOf(
                result.text,
                attempt.contentType.orEmpty(),
                attempt.bodyBytes.decodeToString(),
                attempt.uri,
                "HDRS|" + headerSummary(attempt.headers),
            ).joinToString("|")
        }
        """.trimIndent().encodeToByteArray()

    private fun dualMediaModel(): KotlinDeclarationModel {
        val string = KotlinTypeRef("kotlin", "String")
        val stringNullable = string.copy(nullable = true)
        val jsonRequest = KotlinTypeRef(PACKAGE, "TranscribeJsonRequest")
        val multipartRequest = KotlinTypeRef(PACKAGE, "TranscribeMultipartRequest")
        val draftJsonRequest = KotlinTypeRef(PACKAGE, "DraftJsonRequest")
        val draftFormRequest = KotlinTypeRef(PACKAGE, "DraftFormRequest")
        val transcription = KotlinTypeRef(PACKAGE, "Transcription")
        val apiError = KotlinTypeRef(PACKAGE, "ApiError")
        val teamParameter =
            OperationParameterDeclaration("team", OperationParameterLocation.PATH, string, required = true)

        val transcribeAudio =
            OperationDeclaration(
                symbolId = "operation:transcribeAudio",
                order = 0,
                operationId = "transcribeAudio",
                operationIdentity = "transcribeAudio",
                method = "POST",
                path = "/audio/{team}/transcriptions",
                requestMediaTypes = listOf("application/json"),
                responseMediaTypes = listOf("application/json"),
                successStatusCodes = setOf(200),
                requestType = jsonRequest,
                responseType = transcription,
                requestCodecPropertyName = "transcribeAudioRequestCodec",
                responseCodecPropertyName = "transcribeAudioResponseCodec",
                requestCodecConstantName = "TRANSCRIBE_AUDIO_REQUEST_CODEC_ID",
                responseCodecConstantName = "TRANSCRIBE_AUDIO_RESPONSE_CODEC_ID",
                requestCodecId = "transcribeAudio.request",
                responseCodecId = "transcribeAudio.response",
                responseMode = OperationResponseMode.BUFFERED,
                deadlines = OperationDeadlines(null, null, null),
                methodKdoc = "Transcribes audio.",
                parameters =
                    listOf(
                        OperationParameterDeclaration("team", OperationParameterLocation.PATH, string, required = true),
                        OperationParameterDeclaration(
                            "language",
                            OperationParameterLocation.QUERY,
                            string,
                            required = false,
                        ),
                    ),
                requestBodyAlternatives =
                    listOf(
                        OperationRequestBodyAlternative("application/json", jsonRequest, required = true),
                    ),
                requestBodyRequired = true,
                requestVariants =
                    listOf(
                        OperationRequestVariantDeclaration(
                            methodName = "transcribeAudio",
                            nameSuffix = "",
                            operationIdentity = "transcribeAudio",
                            mediaTypes = listOf("application/json"),
                            type = jsonRequest,
                            required = true,
                            replayability = RequestBodyReplayability.REPLAYABLE,
                            encoding = RequestBodyEncoding.JSON,
                        ),
                        OperationRequestVariantDeclaration(
                            methodName = "transcribeAudioMultipart",
                            nameSuffix = "Multipart",
                            operationIdentity = "transcribeAudio",
                            mediaTypes = listOf("multipart/form-data"),
                            type = multipartRequest,
                            required = true,
                            multipartParts =
                                listOf(
                                    MultipartPartDeclaration(
                                        wireName = "file",
                                        accessorName = "file",
                                        type = KotlinTypeRef("com.nabobery.sdkgen.runtime", "SdkByteStream"),
                                        required = true,
                                        contentType = "audio/wav",
                                    ),
                                    MultipartPartDeclaration(
                                        wireName = "caption",
                                        accessorName = "caption",
                                        type = stringNullable,
                                        required = false,
                                        contentType = "text/plain",
                                    ),
                                    // Non-indexed scalar part backed by a string forward-compat open enum: it must be
                                    // written as a plain `text` part carrying `.value` (bare `verbose_json`), NOT
                                    // JSON-encoded through the generic fallback which would quote the wire text.
                                    MultipartPartDeclaration(
                                        wireName = "response_format",
                                        accessorName = "responseFormat",
                                        type = KotlinTypeRef(PACKAGE, "ResponseFormat", nullable = true),
                                        required = false,
                                        contentType = "text/plain",
                                        openEnumScalar = true,
                                    ),
                                    // Indexed multipart part whose ELEMENT is a string-backed forward-compat enum:
                                    // each `granularities[i]` text entry must serialize the enum's `.value`, not the
                                    // (List<Granularity>) part type nor the enum wrapper itself.
                                    MultipartPartDeclaration(
                                        wireName = "granularities",
                                        accessorName = "granularities",
                                        type =
                                            KotlinTypeRef(
                                                "kotlin.collections",
                                                "List",
                                                listOf(KotlinTypeRef(PACKAGE, "Granularity")),
                                            ),
                                        required = true,
                                        contentType = "text/plain",
                                        indexedElements = true,
                                        elementType = KotlinTypeRef(PACKAGE, "Granularity"),
                                    ),
                                    // Indexed multipart part whose wire name already ends with `[]`: each element must
                                    // be emitted under the UNCHANGED repeated name `timestamp_granularities[]`, never
                                    // the double-bracketed `timestamp_granularities[][index]`.
                                    MultipartPartDeclaration(
                                        wireName = "timestamp_granularities[]",
                                        accessorName = "timestampGranularities",
                                        type =
                                            KotlinTypeRef(
                                                "kotlin.collections",
                                                "List",
                                                listOf(KotlinTypeRef(PACKAGE, "Granularity")),
                                            ),
                                        required = true,
                                        contentType = "text/plain",
                                        indexedElements = true,
                                        elementType = KotlinTypeRef(PACKAGE, "Granularity"),
                                    ),
                                ),
                            replayability = RequestBodyReplayability.NON_REPLAYABLE,
                            encoding = RequestBodyEncoding.MULTIPART,
                        ),
                    ),
                responseAlternatives =
                    listOf(
                        OperationResponseAlternative(
                            ResponseSelectorDeclaration.ExactStatus(200),
                            listOf("application/json"),
                            transcription,
                        ),
                        OperationResponseAlternative(
                            ResponseSelectorDeclaration.StatusRange(400, 499),
                            listOf("application/problem+json"),
                            apiError,
                        ),
                    ),
            )

        val annotateDraft =
            OperationDeclaration(
                symbolId = "operation:annotateDraft",
                order = 1,
                operationId = "annotateDraft",
                operationIdentity = "annotateDraft",
                method = "PUT",
                path = "/drafts/{id}/annotations",
                requestMediaTypes = listOf("application/json"),
                responseMediaTypes = emptyList(),
                successStatusCodes = setOf(204),
                requestType = draftJsonRequest.copy(nullable = true),
                responseType = KotlinTypeRef("kotlin", "Unit"),
                requestCodecPropertyName = "annotateDraftRequestCodec",
                responseCodecPropertyName = "annotateDraftResponseCodec",
                requestCodecConstantName = "ANNOTATE_DRAFT_REQUEST_CODEC_ID",
                responseCodecConstantName = "ANNOTATE_DRAFT_RESPONSE_CODEC_ID",
                requestCodecId = "annotateDraft.request",
                responseCodecId = "annotateDraft.response",
                responseMode = OperationResponseMode.BUFFERED,
                deadlines = OperationDeadlines(null, null, null),
                methodKdoc = "Annotates a draft.",
                parameters =
                    listOf(
                        OperationParameterDeclaration("id", OperationParameterLocation.PATH, string, required = true),
                    ),
                requestBodyAlternatives =
                    listOf(
                        OperationRequestBodyAlternative(
                            "application/json",
                            draftJsonRequest,
                            required = false,
                        ),
                    ),
                requestBodyRequired = false,
                requestVariants =
                    listOf(
                        OperationRequestVariantDeclaration(
                            methodName = "annotateDraft",
                            nameSuffix = "",
                            operationIdentity = "annotateDraft",
                            mediaTypes = listOf("application/json"),
                            type = draftJsonRequest,
                            required = false,
                            replayability = RequestBodyReplayability.REPLAYABLE,
                            encoding = RequestBodyEncoding.JSON,
                        ),
                        OperationRequestVariantDeclaration(
                            methodName = "annotateDraftForm",
                            nameSuffix = "Form",
                            operationIdentity = "annotateDraft",
                            mediaTypes = listOf("application/x-www-form-urlencoded"),
                            type = draftFormRequest,
                            required = false,
                            formFields =
                                listOf(
                                    FormFieldDeclaration(
                                        wireName = "note",
                                        accessorName = "note",
                                        type = string,
                                        required = true,
                                        value = FormValueDeclaration.Scalar(FormScalarKind.STRING),
                                    ),
                                ),
                            replayability = RequestBodyReplayability.REPLAYABLE,
                            encoding = RequestBodyEncoding.FORM,
                        ),
                    ),
            )

        val streamTranscription =
            OperationDeclaration(
                symbolId = "operation:streamTranscription",
                order = 2,
                operationId = "streamTranscription",
                operationIdentity = "streamTranscription",
                method = "POST",
                path = "/audio/{team}/events",
                requestMediaTypes = listOf("application/json"),
                responseMediaTypes = listOf("text/event-stream"),
                successStatusCodes = setOf(200),
                requestType = KotlinTypeRef(PACKAGE, "StreamStartRequest"),
                responseType = KotlinTypeRef(PACKAGE, "StreamDelta"),
                requestCodecPropertyName = "streamTranscriptionRequestCodec",
                responseCodecPropertyName = "streamTranscriptionResponseCodec",
                requestCodecConstantName = "STREAM_TRANSCRIPTION_REQUEST_CODEC_ID",
                responseCodecConstantName = "STREAM_TRANSCRIPTION_RESPONSE_CODEC_ID",
                requestCodecId = "streamTranscription.request",
                responseCodecId = "streamTranscription.response",
                responseMode = OperationResponseMode.STREAMING,
                deadlines = OperationDeadlines(null, 30_000, null),
                methodKdoc = "Streams transcription events.",
                parameters = listOf(teamParameter),
                requestBodyAlternatives =
                    listOf(
                        OperationRequestBodyAlternative(
                            "application/json",
                            KotlinTypeRef(PACKAGE, "StreamStartRequest"),
                            required = true,
                        ),
                    ),
                requestBodyRequired = true,
                requestVariants =
                    listOf(
                        OperationRequestVariantDeclaration(
                            methodName = "streamTranscription",
                            nameSuffix = "",
                            operationIdentity = "streamTranscription",
                            mediaTypes = listOf("application/json"),
                            type = KotlinTypeRef(PACKAGE, "StreamStartRequest"),
                            required = true,
                            replayability = RequestBodyReplayability.REPLAYABLE,
                            encoding = RequestBodyEncoding.JSON,
                        ),
                        OperationRequestVariantDeclaration(
                            methodName = "streamTranscriptionMultipart",
                            nameSuffix = "Multipart",
                            operationIdentity = "streamTranscription",
                            mediaTypes = listOf("multipart/form-data"),
                            type = multipartRequest,
                            required = true,
                            multipartParts =
                                listOf(
                                    MultipartPartDeclaration(
                                        wireName = "file",
                                        accessorName = "file",
                                        type = KotlinTypeRef("com.nabobery.sdkgen.runtime", "SdkByteStream"),
                                        required = true,
                                        contentType = "audio/wav",
                                    ),
                                ),
                            replayability = RequestBodyReplayability.NON_REPLAYABLE,
                            encoding = RequestBodyEncoding.MULTIPART,
                        ),
                    ),
                responseAlternatives =
                    listOf(
                        OperationResponseAlternative(
                            ResponseSelectorDeclaration.ExactStatus(200),
                            listOf("text/event-stream"),
                            KotlinTypeRef(PACKAGE, "StreamDelta"),
                            OperationResponseMode.STREAMING,
                        ),
                    ),
                streaming =
                    StreamingDeclaration.ServerSentEvents("[DONE]", responseContentType = "text/event-stream"),
            )

        val importContacts =
            OperationDeclaration(
                symbolId = "operation:importContacts",
                order = 3,
                operationId = "importContacts",
                operationIdentity = "importContacts",
                method = "POST",
                path = "/imports/{team}",
                requestMediaTypes = listOf("application/json"),
                responseMediaTypes = listOf("application/json"),
                successStatusCodes = setOf(200),
                requestType = jsonRequest,
                responseType = transcription,
                requestCodecPropertyName = "importContactsRequestCodec",
                responseCodecPropertyName = "importContactsResponseCodec",
                requestCodecConstantName = "IMPORT_CONTACTS_REQUEST_CODEC_ID",
                responseCodecConstantName = "IMPORT_CONTACTS_RESPONSE_CODEC_ID",
                requestCodecId = "importContacts.request",
                responseCodecId = "importContacts.response",
                responseMode = OperationResponseMode.BUFFERED,
                deadlines = OperationDeadlines(60_000, 30_000, null),
                methodKdoc = "Imports contacts.",
                parameters = listOf(teamParameter),
                requestBodyAlternatives =
                    listOf(
                        OperationRequestBodyAlternative("application/json", jsonRequest, required = true),
                    ),
                requestBodyRequired = true,
                requestVariants =
                    listOf(
                        OperationRequestVariantDeclaration(
                            methodName = "importContacts",
                            nameSuffix = "",
                            operationIdentity = "importContacts",
                            mediaTypes = listOf("application/json"),
                            type = jsonRequest,
                            required = true,
                            replayability = RequestBodyReplayability.REPLAYABLE,
                            encoding = RequestBodyEncoding.JSON,
                        ),
                        // Generic VALUE-family body over a non-JSON media: no part/field projection, the wire
                        // type is emitted as-is and the codec must carry this variant's exact media types.
                        OperationRequestVariantDeclaration(
                            methodName = "importContactsCsv",
                            nameSuffix = "Csv",
                            operationIdentity = "importContacts",
                            mediaTypes = listOf("text/csv"),
                            type = string,
                            required = true,
                            replayability = RequestBodyReplayability.REPLAYABLE,
                            encoding = RequestBodyEncoding.TEXT,
                        ),
                    ),
                responseAlternatives =
                    listOf(
                        OperationResponseAlternative(
                            ResponseSelectorDeclaration.ExactStatus(200),
                            listOf("application/json"),
                            transcription,
                        ),
                    ),
            )

        return KotlinDeclarationModel(
            listOf(
                KotlinFileDeclaration(
                    PACKAGE,
                    "SerializationSupport",
                    listOf(
                        SupportDeclaration(
                            symbolId = "support:serialization",
                            order = 0,
                            packageName = PACKAGE,
                            fileName = "SerializationSupport",
                            resolvedName = "SerializationSupport",
                            kdoc = "",
                            kind = SupportKind.Serialization,
                        ),
                    ),
                ),
                KotlinFileDeclaration(
                    PACKAGE,
                    "VariantClient",
                    listOf(
                        OperationClientDeclaration(
                            symbolId = "client:VariantClient",
                            order = 0,
                            packageName = PACKAGE,
                            fileName = "VariantClient",
                            resolvedName = "VariantClient",
                            kdoc = "Dual-media variant client.",
                            codecsObjectName = "VariantCodecs",
                            operations = listOf(transcribeAudio, annotateDraft, streamTranscription, importContacts),
                        ),
                    ),
                ),
            ),
        )
    }

    private fun compileGenerated(files: List<RenderedKotlinFile>): Path {
        val root = Files.createTempDirectory(compileRoot, "unit-")
        val sourcePaths =
            files.map { rendered ->
                val path = root.resolve(rendered.path)
                path.parent.createDirectories()
                path.writeText(rendered.bytes.decodeToString())
                path.toString()
            }
        val output = root.resolve("out").also { path -> path.createDirectories() }
        val compilerOutput = ByteArrayOutputStream()
        val result =
            K2JVMCompiler().exec(
                PrintStream(compilerOutput),
                "-classpath",
                System.getProperty("java.class.path"),
                "-d",
                output.toString(),
                *sourcePaths.toTypedArray(),
            )
        assertEquals(ExitCode.OK, result, compilerOutput.toString())
        return output
    }

    private companion object {
        const val PACKAGE = "com.example.generated"

        @Volatile
        private var cachedVariantClient: Path? = null

        /** Managed temp root for every compilation this class performs; removed after the class completes. */
        private val compileRoot: Path = Files.createTempDirectory("sdkgen-variant-compile-")

        @JvmStatic
        @AfterAll
        fun cleanUpCompiledOutput() {
            cachedVariantClient = null
            compileRoot.toFile().deleteRecursively()
        }
    }
}
