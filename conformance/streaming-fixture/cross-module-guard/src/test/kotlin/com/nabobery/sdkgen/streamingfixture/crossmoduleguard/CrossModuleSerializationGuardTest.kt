package com.nabobery.sdkgen.streamingfixture.crossmoduleguard

import io.github.nabobery.sdkgen.generated.ChatResult
import io.github.nabobery.sdkgen.generated.ChatResultDetail
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.nio.file.Files
import kotlin.io.path.writeText
import kotlin.test.Test
import kotlin.test.assertContains
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertNotNull

@Serializable
internal data class ConsumerEnvelope(
    val result: ChatResult,
)

internal class CrossModuleSerializationGuardTest {
    @Test
    fun generatedModelRoundTripsThroughSynthesizedCompanionSerializer() {
        val model = ChatResult(content = "hello", id = "chat-1")

        assertNotNull(ChatResult.Companion.serializer())
        val encoded = Json.encodeToString(model)
        val decoded = Json.decodeFromString<ChatResult>(encoded)

        assertEquals(model.content, decoded.content)
        assertEquals(model.id, decoded.id)
    }

    @Test
    fun consumerSerializableTypeEmbedsGeneratedModel() {
        val envelope = ConsumerEnvelope(ChatResult(content = "hello", id = "chat-1"))

        val encoded = Json.encodeToString(envelope)
        val decoded = Json.decodeFromString<ConsumerEnvelope>(encoded)

        assertEquals(envelope.result.content, decoded.result.content)
        assertEquals(envelope.result.id, decoded.result.id)
    }

    @Test
    fun generatedUnionRoundTripsThroughSynthesizedCompanionSerializer() {
        val detail: ChatResultDetail = ChatResultDetail.ChatTextDetail.of("hello")

        assertNotNull(ChatResultDetail.serializer())
        val encoded = Json.encodeToString(detail)
        val decoded = Json.decodeFromString<ChatResultDetail>(encoded)

        assertEquals(detail.raw, decoded.raw)
    }

    @Test
    fun generatedProtocolGlueCannotBeReferencedFromOutsideItsModule() {
        val probeDirectory = Files.createTempDirectory("sdkgen-adr0020-probe")
        try {
            val probe = probeDirectory.resolve("InternalGlueProbe.kt")
            probe.writeText(
                """
                package probe

                import io.github.nabobery.sdkgen.generated.ChatResult
                import io.github.nabobery.sdkgen.generated.ChatResultDetailSerializer
                import io.github.nabobery.sdkgen.generated.chat.ChatCodecs

                fun probe() {
                    ChatResult.Serializer
                    ChatResultDetailSerializer
                    ChatCodecs
                }
                """.trimIndent(),
            )
            val result =
                ProcessBuilder(
                    javaExecutable(),
                    "-cp",
                    System.getProperty("java.class.path"),
                    "org.jetbrains.kotlin.cli.jvm.K2JVMCompiler",
                    "-no-stdlib",
                    "-no-reflect",
                    "-classpath",
                    System.getProperty("java.class.path"),
                    "-d",
                    probeDirectory.resolve("classes").toString(),
                    probe.toString(),
                ).redirectErrorStream(true).start()
            val diagnostics = result.inputStream.bufferedReader().readText()

            assertNotEquals(0, result.waitFor(), diagnostics)
            assertContains(
                diagnostics,
                "cannot access 'object ChatResultDetailSerializer : KSerializer<ChatResultDetail>': it is internal in file.",
            )
            assertContains(diagnostics, "ChatResult.Serializer")
            assertContains(diagnostics, "ChatCodecs")
            assertEquals(false, diagnostics.contains("unresolved reference"))
        } finally {
            probeDirectory.toFile().deleteRecursively()
        }
    }

    private fun javaExecutable(): String = System.getProperty("java.home") + "/bin/java"
}
