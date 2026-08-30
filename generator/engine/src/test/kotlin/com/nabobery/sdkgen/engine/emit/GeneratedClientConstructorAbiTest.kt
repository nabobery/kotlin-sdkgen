package com.nabobery.sdkgen.engine.emit

import com.nabobery.sdkgen.engine.declarations.KotlinDeclarationModel
import com.nabobery.sdkgen.engine.declarations.KotlinFileDeclaration
import com.nabobery.sdkgen.engine.declarations.KotlinTypeRef
import com.nabobery.sdkgen.engine.declarations.OperationClientDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationClientGroupRef
import com.nabobery.sdkgen.engine.declarations.OperationDeadlines
import com.nabobery.sdkgen.engine.declarations.OperationDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationResponseAlternative
import com.nabobery.sdkgen.engine.declarations.OperationResponseMode
import com.nabobery.sdkgen.engine.declarations.ResponseSelectorDeclaration
import com.nabobery.sdkgen.runtime.SdkAuthentication
import com.nabobery.sdkgen.runtime.SdkClientConfig
import com.nabobery.sdkgen.runtime.SdkRequest
import com.nabobery.sdkgen.runtime.SdkResponse
import com.nabobery.sdkgen.runtime.SdkTransport
import com.nabobery.sdkgen.runtime.TransportCapabilities
import com.nabobery.sdkgen.runtime.auth.CredentialProvider
import com.nabobery.sdkgen.runtime.auth.TrustedHosts
import org.jetbrains.kotlin.cli.common.ExitCode
import org.jetbrains.kotlin.cli.jvm.K2JVMCompiler
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import java.lang.reflect.Modifier
import java.net.URLClassLoader
import java.nio.file.Files
import java.nio.file.Path
import kotlin.io.path.createDirectories
import kotlin.io.path.writeText
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertSame
import kotlin.test.assertTrue

/**
 * Binary-level proof that a caller compiled against the 0.3.0 generated constructor keeps linking and executing
 * against 0.4.0 bytecode, the configuration-aware constructor is purely additive, and one
 * `SdkClientConfig` instance is shared by the root facade and every lazily-constructed resource client.
 */
class GeneratedClientConstructorAbiTest {
    @Test
    fun legacyConstructorDescriptorsSurviveOnRootAndResourceClients() {
        val output = compileGeneratedClients()
        URLClassLoader(arrayOf(output.toUri().toURL()), javaClass.classLoader).use { loader ->
            listOf("$PACKAGE.RootClient", "$PACKAGE.PingClient").forEach { className ->
                val descriptors = loader.loadClass(className).declaredConstructors.map { it.describe() }
                assertTrue(LEGACY_DESCRIPTOR in descriptors, "$className: $descriptors")
                assertTrue(LEGACY_DEFAULT_BRIDGE in descriptors, "$className: $descriptors")
                assertTrue(CONFIGURED_DESCRIPTOR in descriptors, "$className: $descriptors")
                assertTrue(CONFIGURED_DEFAULT_BRIDGE in descriptors, "$className: $descriptors")
            }
        }
    }

    @Test
    fun callerCompiledAgainstLegacySignaturesLinksAndShares0ne0ConfigurationPerRoot() {
        val output = compileGeneratedClients()
        val callerOutput = compileLegacyCaller(output)
        URLClassLoader(
            arrayOf(callerOutput.toUri().toURL(), output.toUri().toURL()),
            javaClass.classLoader,
        ).use { loader ->
            val caller = loader.loadClass("$PACKAGE.LegacyCallerKt")
            val transport = NoopTransport()

            val twoArgumentRoot =
                caller.getMethod("twoArgumentRoot", SdkTransport::class.java).invoke(null, transport)
            val fiveArgumentRoot =
                caller.getMethod("fiveArgumentRoot", SdkTransport::class.java).invoke(null, transport)
            val configured = SdkClientConfig(productToken = "acme/1.0")
            val configuredRoot =
                caller
                    .getMethod("configuredRoot", SdkTransport::class.java, SdkClientConfig::class.java)
                    .invoke(null, transport, configured)

            listOf(twoArgumentRoot, fiveArgumentRoot).forEach { root ->
                val rootConfig = root.privateField("clientConfig")
                assertTrue(rootConfig is SdkClientConfig, "root must carry an SdkClientConfig")
                assertSame(rootConfig, root.subClient("ping").privateField("clientConfig"))
            }
            assertSame(configured, configuredRoot.privateField("clientConfig"))
            assertSame(configured, configuredRoot.subClient("ping").privateField("clientConfig"))
        }
    }

    @Test
    fun legacyDefaultBridgeInvokedTheWayA030CallerWouldStillExecutes() {
        val output = compileGeneratedClients()
        URLClassLoader(arrayOf(output.toUri().toURL()), javaClass.classLoader).use { loader ->
            val rootClass = loader.loadClass("$PACKAGE.RootClient")
            val bridge =
                rootClass.getDeclaredConstructor(
                    SdkTransport::class.java,
                    String::class.java,
                    Map::class.java,
                    TrustedHosts::class.java,
                    SdkAuthentication::class.java,
                    Int::class.javaPrimitiveType,
                    Class.forName("kotlin.jvm.internal.DefaultConstructorMarker"),
                )
            // Mask 0b11100 = parameters 3..5 defaulted: exactly what `RootClient(transport, baseUri)` compiled to
            // in 0.3.0.
            val root = bridge.newInstance(NoopTransport(), "https://example.test", null, null, null, 0b11100, null)

            assertTrue(root.privateField("clientConfig") is SdkClientConfig)
        }
    }

    private fun compileGeneratedClients(): Path {
        val ping =
            OperationDeclaration(
                symbolId = "operation:ping",
                order = 0,
                operationId = "ping",
                method = "GET",
                path = "/ping",
                requestMediaTypes = emptyList(),
                responseMediaTypes = emptyList(),
                successStatusCodes = setOf(204),
                requestType = UNIT,
                responseType = UNIT,
                requestCodecPropertyName = "pingRequestCodec",
                responseCodecPropertyName = "pingResponseCodec",
                requestCodecConstantName = "PING_REQUEST_CODEC_ID",
                responseCodecConstantName = "PING_RESPONSE_CODEC_ID",
                requestCodecId = "ping.request",
                responseCodecId = "ping.response",
                responseMode = OperationResponseMode.BUFFERED,
                deadlines = OperationDeadlines(null, null, null),
                methodKdoc = "Pings.",
                responseAlternatives =
                    listOf(
                        OperationResponseAlternative(ResponseSelectorDeclaration.ExactStatus(204), emptyList(), UNIT),
                    ),
            )
        val pingClient =
            OperationClientDeclaration(
                symbolId = "client:PingClient",
                order = 1,
                packageName = PACKAGE,
                fileName = "PingClient",
                resolvedName = "PingClient",
                kdoc = "Ping resource client.",
                codecsObjectName = "PingCodecs",
                operations = listOf(ping),
            )
        val root =
            OperationClientDeclaration(
                symbolId = "client:RootClient",
                order = 0,
                packageName = PACKAGE,
                fileName = "RootClient",
                resolvedName = "RootClient",
                kdoc = "Root facade.",
                codecsObjectName = "RootCodecs",
                operations = emptyList(),
                subClients = listOf(OperationClientGroupRef(PACKAGE, "PingClient", "ping", "Ping operations.")),
            )
        val rendered =
            KotlinPoetEmitter(PACKAGE)
                .render(
                    KotlinDeclarationModel(
                        listOf(
                            KotlinFileDeclaration(PACKAGE, "RootClient", listOf(root)),
                            KotlinFileDeclaration(PACKAGE, "PingClient", listOf(pingClient)),
                        ),
                    ),
                ).files
        val root0 = Files.createTempDirectory("sdkgen-client-abi-")
        val sources =
            rendered.map { file ->
                val path = root0.resolve(file.path)
                path.parent.createDirectories()
                path.writeText(file.bytes.decodeToString())
                path.toString()
            }
        return compile(root0.resolve("out"), System.getProperty("java.class.path"), sources)
    }

    /** A caller written exactly as a 0.3.0 consumer would have written it, compiled against the fresh bytecode. */
    private fun compileLegacyCaller(generatedOutput: Path): Path {
        val root = Files.createTempDirectory("sdkgen-client-abi-caller-")
        val source = root.resolve("LegacyCaller.kt")
        source.writeText(
            """
            package $PACKAGE

            import com.nabobery.sdkgen.runtime.SdkClientConfig
            import com.nabobery.sdkgen.runtime.SdkTransport

            fun twoArgumentRoot(transport: SdkTransport): RootClient = RootClient(transport, "https://example.test")

            fun fiveArgumentRoot(transport: SdkTransport): RootClient =
                RootClient(transport, "https://example.test", emptyMap(), null, null)

            fun configuredRoot(transport: SdkTransport, config: SdkClientConfig): RootClient =
                RootClient(transport, "https://example.test", config)
            """.trimIndent(),
        )
        val classpath = listOf(generatedOutput.toString(), System.getProperty("java.class.path"))
        return compile(
            root.resolve("out"),
            classpath.joinToString(java.io.File.pathSeparator),
            listOf(source.toString()),
        )
    }

    private fun compile(
        output: Path,
        classpath: String,
        sources: List<String>,
    ): Path {
        output.createDirectories()
        val compilerOutput = ByteArrayOutputStream()
        val result =
            K2JVMCompiler().exec(
                PrintStream(compilerOutput),
                "-classpath",
                classpath,
                "-d",
                output.toString(),
                *sources.toTypedArray(),
            )
        assertEquals(ExitCode.OK, result, compilerOutput.toString())
        return output
    }

    private fun java.lang.reflect.Constructor<*>.describe(): String {
        val visibility =
            if (Modifier.isPublic(modifiers)) {
                "public"
            } else if (Modifier.isPrivate(modifiers)) {
                "private"
            } else {
                "other"
            }
        return "$visibility(" + parameterTypes.joinToString(",") { it.name } + ")"
    }

    private fun Any.privateField(name: String): Any? =
        javaClass.getDeclaredField(name).also { it.isAccessible = true }.get(this)

    private fun Any.subClient(accessor: String): Any =
        requireNotNull(javaClass.getMethod("get${accessor.replaceFirstChar(Char::uppercaseChar)}").invoke(this))

    private class NoopTransport : SdkTransport {
        override fun capabilities(): TransportCapabilities = TransportCapabilities(supportsStreaming = true)

        override suspend fun execute(request: SdkRequest): SdkResponse = error("never executed")
    }

    private companion object {
        const val PACKAGE = "com.example.abi"
        val UNIT = KotlinTypeRef("kotlin", "Unit")
        const val SDK_TRANSPORT = "com.nabobery.sdkgen.runtime.SdkTransport"
        const val SDK_CLIENT_CONFIG = "com.nabobery.sdkgen.runtime.SdkClientConfig"
        const val TRUSTED_HOSTS = "com.nabobery.sdkgen.runtime.auth.TrustedHosts"
        const val SDK_AUTHENTICATION = "com.nabobery.sdkgen.runtime.SdkAuthentication"
        const val MARKER = "kotlin.jvm.internal.DefaultConstructorMarker"
        const val LEGACY_DESCRIPTOR =
            "public($SDK_TRANSPORT,java.lang.String,java.util.Map,$TRUSTED_HOSTS,$SDK_AUTHENTICATION)"
        const val LEGACY_DEFAULT_BRIDGE =
            "public($SDK_TRANSPORT,java.lang.String,java.util.Map,$TRUSTED_HOSTS,$SDK_AUTHENTICATION,int,$MARKER)"
        const val CONFIGURED_DESCRIPTOR =
            "public($SDK_TRANSPORT,java.lang.String,$SDK_CLIENT_CONFIG,java.util.Map,$TRUSTED_HOSTS,$SDK_AUTHENTICATION)"
        const val CONFIGURED_DEFAULT_BRIDGE =
            "public($SDK_TRANSPORT,java.lang.String,$SDK_CLIENT_CONFIG,java.util.Map,$TRUSTED_HOSTS,$SDK_AUTHENTICATION,int,$MARKER)"
    }
}
