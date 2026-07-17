@file:Suppress("ktlint:standard:max-line-length")

package com.nabobery.sdkgen.openapi

import com.fasterxml.jackson.core.JsonFactory
import com.fasterxml.jackson.core.JsonLocation
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.core.JsonToken
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory
import com.nabobery.sdkgen.model.SourceLocation
import com.nabobery.sdkgen.model.SourcePointer
import java.net.URI
import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.security.MessageDigest
import java.util.TreeMap

/**
 * Immutable metadata for one local document in a resolved OpenAPI reference closure.
 *
 * @property canonicalUri relocation-stable logical identity used by the semantic model.
 * @property path real path whose bytes were indexed.
 * @property relativePath path relative to the root document directory.
 * @property sha256 digest of the indexed bytes.
 * @property contentLength indexed byte length.
 */
public data class LocalSourceDocument(
    public val canonicalUri: String,
    public val path: Path,
    public val relativePath: Path,
    public val sha256: String,
    public val contentLength: Long,
)

/** Resolves the local reference closure using the same rules as [SemanticAdapter]. */
public object LocalReferenceClosure {
    public fun resolve(rootPath: Path): List<LocalSourceDocument> =
        resolve(rootPath, listOf(requireNotNull(rootPath.toRealPath().parent)))

    /**
     * Resolves [rootPath] and its external references under the supplied trusted real roots.
     *
     * External references outside every trusted root are rejected instead of being silently
     * omitted from the closure.
     */
    public fun resolve(
        rootPath: Path,
        trustedRoots: List<Path>,
    ): List<LocalSourceDocument> =
        SourceRepository
            .load(rootPath, trustedRoots, rejectOutsideTrustedRoots = true)
            .documents
            .map { document ->
                LocalSourceDocument(
                    canonicalUri = document.canonicalUri,
                    path = document.path,
                    relativePath = Path.of(document.canonicalUri.removePrefix("sdkgen://source/")),
                    sha256 = document.sha256,
                    contentLength = document.contentLength,
                )
            }.sortedBy(LocalSourceDocument::canonicalUri)

    /**
     * Resolves a local reference closure by parsing each file only after [stage] has copied it
     * into the trusted workspace. [stage] must return the workspace path for the staged bytes.
     */
    public fun resolveAndStage(
        rootPath: Path,
        trustedRoots: List<Path>,
        stage: (source: Path, relativePath: Path) -> Path,
    ): List<LocalSourceDocument> {
        val rootRealPath = rootPath.toRealPath()
        val sourceRoot = requireNotNull(rootRealPath.parent)
        val realTrustedRoots = trustedRoots.map(Path::toRealPath).distinct()
        val pending = ArrayDeque<Path>()
        val loaded = linkedMapOf<String, LocalSourceDocument>()
        pending.add(rootRealPath)

        while (pending.isNotEmpty()) {
            val sourcePath = pending.removeFirst().toRealPath()
            val canonicalUri = logicalUri(sourceRoot, realTrustedRoots, sourcePath)
            if (canonicalUri in loaded) {
                check(loaded.getValue(canonicalUri).path == sourcePath) { "Logical URI collision for $canonicalUri" }
                continue
            }

            val relativePath = Path.of(canonicalUri.removePrefix("sdkgen://source/"))
            val stagedPath = stage(sourcePath, relativePath)
            val stagedDocument = SourceMapIndexer.index(stagedPath, canonicalUri)
            loaded[canonicalUri] =
                LocalSourceDocument(
                    canonicalUri = canonicalUri,
                    path = sourcePath,
                    relativePath = relativePath,
                    sha256 = stagedDocument.sha256,
                    contentLength = stagedDocument.contentLength,
                )
            collectExternalReferences(stagedDocument.root).forEach { reference ->
                val referenceUri = URI(reference)
                if (referenceUri.scheme != null || reference.startsWith("#")) return@forEach
                val externalPart = reference.substringBefore('#')
                if (externalPart.isEmpty()) return@forEach
                val candidate =
                    sourcePath.parent
                        .resolve(externalPart)
                        .normalize()
                        .toAbsolutePath()
                val realCandidate = runCatching(candidate::toRealPath).getOrNull() ?: return@forEach
                if (realTrustedRoots.none(realCandidate::startsWith)) {
                    throw ReferenceOutsideTrustedRootsException(realCandidate)
                }
                if (!Files.isRegularFile(realCandidate)) {
                    throw ReferenceNotRegularFileException(realCandidate)
                }
                pending.add(realCandidate)
            }
        }

        return loaded.values.sortedBy(LocalSourceDocument::canonicalUri)
    }
}

/** An external reference resolved outside the roots trusted for local acquisition. */
public class ReferenceOutsideTrustedRootsException(
    public val path: Path,
) : IllegalArgumentException("Reference resolves outside every trusted root: $path")

/** An external reference that resolves to a non-regular local path. */
public class ReferenceNotRegularFileException(
    public val path: Path,
) : IllegalArgumentException("Reference is not a regular file: $path")

private fun logicalUri(
    sourceRoot: Path,
    trustedRoots: List<Path>,
    path: Path,
): String {
    val relative =
        if (path.startsWith(sourceRoot)) {
            sourceRoot.relativize(path)
        } else {
            val trustedRoot =
                trustedRoots
                    .filter(path::startsWith)
                    .maxByOrNull { it.nameCount }
                    ?: throw ReferenceOutsideTrustedRootsException(path)
            Path.of(trustedRoot.fileName.toString()).resolve(trustedRoot.relativize(path))
        }
    return "sdkgen://source/${relative.joinToString("/") { it.toString() }}"
}

private fun collectExternalReferences(root: JsonNode): List<String> {
    val references = mutableListOf<String>()

    fun visit(node: JsonNode) {
        when {
            node.isObject -> {
                node.get("\$ref")?.takeIf(JsonNode::isTextual)?.let { references += it.textValue() }
                node.properties().forEach { (_, value) -> visit(value) }
            }

            node.isArray -> {
                node.forEach(::visit)
            }
        }
    }
    visit(root)
    return references.distinct().sorted()
}

internal data class SourceDocument(
    val canonicalUri: String,
    val path: Path,
    val sha256: String,
    val contentLength: Long,
    val root: JsonNode,
    val locations: Map<String, SourceLocation>,
) {
    fun source(pointer: String): SourcePointer =
        SourcePointer(
            documentUri = canonicalUri,
            jsonPointer = pointer,
            location =
                locations[pointer]
                    ?: error("No source location for $canonicalUri#$pointer"),
        )
}

internal class SourceRepository private constructor(
    private val documentsByUri: Map<String, SourceDocument>,
    private val rootUri: String,
) {
    val documents: Collection<SourceDocument> = documentsByUri.values

    fun document(canonicalUri: String): SourceDocument =
        documentsByUri[canonicalUri] ?: error("Document was not indexed: $canonicalUri")

    fun rootDocument(): SourceDocument = document(rootUri)

    fun resolveReference(
        fromDocumentUri: String,
        rawReference: String,
    ): ResolvedReference {
        val from = URI(fromDocumentUri)
        val resolved = from.resolve(rawReference)
        val withoutFragment =
            URI(resolved.scheme, resolved.authority, resolved.path, resolved.query, null)
                .normalize()
                .toString()
        val pointer =
            resolved.fragment?.let { fragment ->
                when {
                    fragment.isEmpty() -> ""
                    fragment.startsWith("/") -> fragment
                    else -> error("Only JSON Pointer fragments are supported: $rawReference")
                }
            } ?: ""
        val document = document(withoutFragment)
        if (document.root.at(pointer).isMissingNode) {
            error("Reference target does not exist: $withoutFragment#$pointer")
        }
        return ResolvedReference(document, pointer)
    }

    companion object {
        fun load(
            rootPath: Path,
            trustedRoots: List<Path> = emptyList(),
            rejectOutsideTrustedRoots: Boolean = false,
        ): SourceRepository {
            val pending = ArrayDeque<Path>()
            val loaded = linkedMapOf<String, SourceDocument>()
            val rootRealPath = rootPath.toRealPath()
            val sourceRoot = requireNotNull(rootRealPath.parent)
            val realTrustedRoots =
                (trustedRoots.ifEmpty { listOf(sourceRoot) })
                    .map(Path::toRealPath)
                    .distinct()
            val rootUri = logicalUri(sourceRoot, realTrustedRoots, rootRealPath)
            pending.add(rootRealPath)

            while (pending.isNotEmpty()) {
                val path = pending.removeFirst().toRealPath()
                val canonicalUri = logicalUri(sourceRoot, realTrustedRoots, path)
                if (canonicalUri in loaded) {
                    check(loaded.getValue(canonicalUri).path == path) { "Logical URI collision for $canonicalUri" }
                    continue
                }

                val document = SourceMapIndexer.index(path, canonicalUri)
                loaded[canonicalUri] = document
                collectExternalReferences(document.root).forEach { reference ->
                    val referenceUri = URI(reference)
                    if (referenceUri.scheme != null || reference.startsWith("#")) return@forEach
                    val externalPart = reference.substringBefore('#')
                    if (externalPart.isNotEmpty()) {
                        val candidate =
                            path.parent
                                .resolve(externalPart)
                                .normalize()
                                .toAbsolutePath()
                        val realCandidate = runCatching(candidate::toRealPath).getOrNull() ?: return@forEach
                        if (realTrustedRoots.none(realCandidate::startsWith)) {
                            if (rejectOutsideTrustedRoots) throw ReferenceOutsideTrustedRootsException(realCandidate)
                            return@forEach
                        }
                        if (Files.isRegularFile(realCandidate)) pending.add(realCandidate)
                    }
                }
            }

            return SourceRepository(loaded.toSortedMap(), rootUri)
        }

        private fun logicalUri(
            sourceRoot: Path,
            trustedRoots: List<Path>,
            path: Path,
        ): String {
            val relative =
                if (path.startsWith(sourceRoot)) {
                    sourceRoot.relativize(path)
                } else {
                    val trustedRoot =
                        trustedRoots
                            .filter(path::startsWith)
                            .maxByOrNull { it.nameCount }
                            ?: throw ReferenceOutsideTrustedRootsException(path)
                    Path.of(trustedRoot.fileName.toString()).resolve(trustedRoot.relativize(path))
                }
            return "sdkgen://source/${relative.joinToString("/") { it.toString() }}"
        }

        private fun collectExternalReferences(root: JsonNode): List<String> {
            val references = mutableListOf<String>()

            fun visit(node: JsonNode) {
                when {
                    node.isObject -> {
                        node.get("\$ref")?.takeIf(JsonNode::isTextual)?.let { references += it.textValue() }
                        node.properties().forEach { (_, value) -> visit(value) }
                    }

                    node.isArray -> {
                        node.forEach(::visit)
                    }
                }
            }
            visit(root)
            return references.distinct().sorted()
        }
    }
}

internal data class ResolvedReference(
    val document: SourceDocument,
    val pointer: String,
)

internal object SourceMapIndexer {
    fun index(
        path: Path,
        canonicalUri: String = canonicalUri(path),
    ): SourceDocument {
        val realPath = path.toRealPath()
        val bytes = Files.readAllBytes(realPath)
        val factory =
            if (realPath.fileName.toString().endsWith(".json", ignoreCase = true)) {
                JsonFactory()
            } else {
                YAMLFactory()
            }
        val mapper = ObjectMapper(factory)
        val root = mapper.readTree(bytes)
        val locations = indexLocations(factory, bytes)
        return SourceDocument(
            canonicalUri = canonicalUri,
            path = realPath,
            sha256 = bytes.sha256(),
            contentLength = bytes.size.toLong(),
            root = root,
            locations = locations,
        )
    }

    private fun indexLocations(
        factory: JsonFactory,
        bytes: ByteArray,
    ): Map<String, SourceLocation> {
        val result = TreeMap<String, SourceLocation>()
        val lineIndex = Utf8LineIndex(bytes)
        factory.createParser(bytes).use { parser ->
            val stack = ArrayDeque<ContainerContext>()
            while (true) {
                val token = parser.nextToken() ?: break
                when (token) {
                    JsonToken.FIELD_NAME -> {
                        stack.lastOrNull()?.pendingField = parser.currentName()
                    }

                    JsonToken.START_OBJECT, JsonToken.START_ARRAY -> {
                        val pointer = pointerForNextValue(stack)
                        result[pointer] = parser.currentTokenLocation().toSourceLocation(lineIndex)
                        consumeParentValue(stack)
                        stack.addLast(
                            ContainerContext(
                                pointer = pointer,
                                array = token == JsonToken.START_ARRAY,
                            ),
                        )
                    }

                    JsonToken.END_OBJECT, JsonToken.END_ARRAY -> {
                        stack.removeLast()
                    }

                    else -> {
                        if (token.isScalarValue) {
                            val pointer = pointerForNextValue(stack)
                            result[pointer] = parser.currentTokenLocation().toSourceLocation(lineIndex)
                            consumeParentValue(stack)
                        }
                    }
                }
            }
        }
        check("" in result) { "The root document did not produce a source location" }
        return result
    }

    private fun pointerForNextValue(stack: ArrayDeque<ContainerContext>): String {
        val parent = stack.lastOrNull() ?: return ""
        val segment =
            if (parent.array) {
                parent.nextIndex.toString()
            } else {
                escapePointerSegment(parent.pendingField ?: error("Object value has no field name"))
            }
        return "${parent.pointer}/$segment"
    }

    private fun consumeParentValue(stack: ArrayDeque<ContainerContext>) {
        val parent = stack.lastOrNull() ?: return
        if (parent.array) {
            parent.nextIndex += 1
        } else {
            parent.pendingField = null
        }
    }

    private data class ContainerContext(
        val pointer: String,
        val array: Boolean,
        var nextIndex: Int = 0,
        var pendingField: String? = null,
    )
}

private class Utf8LineIndex(
    bytes: ByteArray,
) {
    private val text = bytes.toString(StandardCharsets.UTF_8)
    private val lineStarts: IntArray
    private val lineByteStarts: LongArray

    init {
        val characterStarts = mutableListOf(0)
        val byteStarts = mutableListOf(0L)
        var characterIndex = 0
        var byteIndex = 0L
        text.forEach { character ->
            characterIndex += 1
            byteIndex += character.toString().toByteArray(StandardCharsets.UTF_8).size
            if (character == '\n') {
                characterStarts += characterIndex
                byteStarts += byteIndex
            }
        }
        lineStarts = characterStarts.toIntArray()
        lineByteStarts = byteStarts.toLongArray()
    }

    fun byteOffset(
        line: Int,
        column: Int,
    ): Long {
        val lineIndex = (line - 1).coerceIn(lineStarts.indices)
        val lineStart = lineStarts[lineIndex]
        val characterOffset = (lineStart + column - 1).coerceIn(lineStart, text.length)
        val withinLine =
            text
                .substring(lineStart, characterOffset)
                .toByteArray(StandardCharsets.UTF_8)
                .size
        return lineByteStarts[lineIndex] + withinLine
    }
}

private fun JsonLocation.toSourceLocation(lineIndex: Utf8LineIndex): SourceLocation {
    val line = lineNr.coerceAtLeast(1)
    val column = columnNr.coerceAtLeast(1)
    return SourceLocation(
        line = line,
        column = column,
        byteOffset = byteOffset.takeIf { it >= 0 } ?: lineIndex.byteOffset(line, column),
    )
}

internal fun canonicalUri(path: Path): String =
    path
        .toRealPath()
        .toUri()
        .normalize()
        .toString()

internal fun escapePointerSegment(value: String): String = value.replace("~", "~0").replace("/", "~1")

internal fun Path.fromCanonicalUri(uri: String): Path = Paths.get(URI(uri))

private fun ByteArray.sha256(): String =
    buildString {
        MessageDigest.getInstance("SHA-256").digest(this@sha256).forEach { byte ->
            val value = byte.toInt() and 0xff
            append(HEX_DIGITS[value ushr 4])
            append(HEX_DIGITS[value and 0x0f])
        }
    }

private const val HEX_DIGITS = "0123456789abcdef"
