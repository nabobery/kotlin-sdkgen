package com.nabobery.sdkgen.cli

import com.fasterxml.jackson.core.JsonFactory
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.core.JsonToken
import java.io.IOException
import java.nio.file.Files
import java.nio.file.Path

/**
 * The bounded, versioned compatibility-manifest snapshot read by [CompatibilityManifestReader].
 *
 * `v1alpha1` manifests carry only [declarationModelSha256]; the three `v1alpha2` digests are `null` for them.
 * ADR 0013 forbids substituting any one of the four digests for another, so each field is read and carried
 * independently.
 */
internal data class CompatibilityManifestSnapshot(
    internal val schemaVersion: String,
    internal val files: List<CompatibilityManifestFile>,
    internal val declarationModelSha256: String,
    internal val effectiveContractSha256: String? = null,
    internal val semanticModelSha256: String? = null,
    internal val kotlinApiSha256: String? = null,
)

internal data class CompatibilityManifestFile(
    internal val path: String,
    internal val sha256: String,
)

/**
 * Reads a bounded, versioned compatibility manifest as a streaming operation.
 *
 * Both bounds in ADR 0013 ("Manifest transition and bounded input") are enforced before expensive parsing or
 * unbounded allocation:
 *
 * 1. The manifest-byte cap ([MAX_MANIFEST_BYTES]) is checked with [Files.size] before any parser is opened.
 * 2. The declared-file-count cap ([MAX_MANIFEST_FILES]) is enforced incrementally by a streaming Jackson
 *    [JsonParser] while walking the `files` array, so an over-count manifest is rejected on its 20,001st file
 *    element without ever requiring the remainder of the document — malformed or not — to parse.
 *
 * Both failures are deterministic: the same input path produces byte-identical exception messages on every read.
 *
 * ADR 0013 distinguishes two different things both described loosely as "unknown": a field that is not part of
 * the declared manifest schema at all (drift — must fail closed), and a field that is part of the schema but this
 * particular reader does not need (legitimate — every reader consumes a subset). This reader consumes only the
 * schema version, the four digests, and `files`; the remaining top-level fields `AtomicOutputPublisher` writes
 * into every `v1alpha2` manifest — `generatorVersion`, `edition`, `kotlinPoetVersion`, `configDigest`, `source`,
 * `references`, `overlays`, `targets`, `compatibilityProfiles`, `plugins`, `tools`, `warningsAsErrors`,
 * `warningAllowlist`, `diagnostics`, `exclusions`, `acceptedWaivers` — are declared known in
 * [DECLARED_UNCONSUMED_FIELDS] and skipped without being typed. A field outside both sets still fails closed,
 * naming itself, exactly as before.
 */
internal object CompatibilityManifestReader {
    private const val MAX_MANIFEST_BYTES = 16L * 1024 * 1024
    private const val MAX_MANIFEST_FILES = 20_000
    private const val MAX_MANIFEST_PATH_LENGTH = 4_096

    private val JSON_FACTORY = JsonFactory()
    private val DRIVE_QUALIFIED_PATH = Regex("""^[A-Za-z]:""")
    private val CANONICAL_SHA256 = Regex("^[0-9a-f]{64}$")
    private val SUPPORTED_SCHEMA_VERSIONS = setOf("v1alpha1", "v1alpha2")

    /**
     * Top-level fields `AtomicOutputPublisher` always writes into a `v1alpha2` manifest that this reader does not
     * need to consume: governance and provenance evidence read instead by `diff`/`explain`. Declared here so the
     * reader's own engine's manifests remain readable while a genuinely undeclared field still fails closed. This
     * is the full schema outside `schemaVersion`, the four digests, and `files`, which are already typed.
     */
    private val DECLARED_UNCONSUMED_FIELDS =
        setOf(
            "generatorVersion",
            "edition",
            "kotlinPoetVersion",
            "configDigest",
            "source",
            "references",
            "overlays",
            "targets",
            "compatibilityProfiles",
            "plugins",
            "tools",
            "warningsAsErrors",
            "warningAllowlist",
            "diagnostics",
            "exclusions",
            "acceptedWaivers",
        )

    internal fun read(path: Path): CompatibilityManifestSnapshot {
        val size = Files.size(path)
        if (size > MAX_MANIFEST_BYTES) {
            throw CompatibilityManifestInputException(
                "Compatibility manifest exceeds the maximum size of 16 MiB: $path",
            )
        }

        val fields = readManifestFields(path)
        val schemaVersion =
            fields.schemaVersion
                ?: throw CompatibilityManifestInputException("Compatibility manifest is missing schemaVersion: $path")
        if (schemaVersion !in SUPPORTED_SCHEMA_VERSIONS) {
            throw CompatibilityManifestInputException(
                "Compatibility manifest declares an unsupported schemaVersion \"$schemaVersion\": $path",
            )
        }
        if (schemaVersion == "v1alpha1") {
            val disallowedV1alpha2Fields =
                listOfNotNull(
                    "effectiveContractSha256".takeIf { fields.effectiveContractSha256 != null },
                    "semanticModelSha256".takeIf { fields.semanticModelSha256 != null },
                    "kotlinApiSha256".takeIf { fields.kotlinApiSha256 != null },
                )
            if (disallowedV1alpha2Fields.isNotEmpty()) {
                throw CompatibilityManifestInputException(
                    "Compatibility manifest declares v1alpha2 field(s) " +
                        "${disallowedV1alpha2Fields.joinToString(", ")} under schemaVersion \"v1alpha1\": $path",
                )
            }
        }
        val declarationModelSha256 =
            fields.declarationModelSha256
                ?: throw CompatibilityManifestInputException(
                    "Compatibility manifest is missing declarationModelSha256: $path",
                )

        val validatedFiles = fields.files.map { file -> validateManifestFile(file, path) }
        val distinctPaths = validatedFiles.map(CompatibilityManifestFile::path).distinct()
        if (distinctPaths.size != validatedFiles.size) {
            throw CompatibilityManifestInputException("Compatibility manifest file paths must be unique: $path")
        }

        return CompatibilityManifestSnapshot(
            schemaVersion = schemaVersion,
            files = validatedFiles,
            declarationModelSha256 = validateDigest(declarationModelSha256, "declarationModelSha256", path),
            effectiveContractSha256 =
                fields.effectiveContractSha256?.let { validateDigest(it, "effectiveContractSha256", path) },
            semanticModelSha256 =
                fields.semanticModelSha256?.let { validateDigest(it, "semanticModelSha256", path) },
            kotlinApiSha256 = fields.kotlinApiSha256?.let { validateDigest(it, "kotlinApiSha256", path) },
        )
    }

    private fun readManifestFields(path: Path): RawManifestFields {
        var schemaVersion: String? = null
        var declarationModelSha256: String? = null
        var effectiveContractSha256: String? = null
        var semanticModelSha256: String? = null
        var kotlinApiSha256: String? = null
        val files = mutableListOf<CompatibilityManifestFile>()
        val seenFields = mutableSetOf<String>()

        try {
            Files.newInputStream(path).use { input ->
                JSON_FACTORY.createParser(input).use { parser ->
                    requireToken(parser.nextToken(), JsonToken.START_OBJECT, path)
                    while (parser.nextToken() != JsonToken.END_OBJECT) {
                        requireFieldName(parser, path)
                        val fieldName = parser.currentName()
                        // JSON permits a repeated key and Jackson streams both occurrences, so without this every
                        // scalar branch below is silently last-wins. That is a downgrade primitive: a document
                        // whose second `schemaVersion` is "v1alpha1" carries v1alpha2 evidence fields while
                        // declaring the version that forbids them. It also defeats the `files` cap, since each
                        // repeat restarts the count while filling the same list.
                        if (!seenFields.add(fieldName)) {
                            throw CompatibilityManifestInputException(
                                "Compatibility manifest declares field \"$fieldName\" more than once: $path",
                            )
                        }
                        parser.nextToken()
                        when (fieldName) {
                            "schemaVersion" -> {
                                schemaVersion = parser.text
                            }

                            "declarationModelSha256" -> {
                                declarationModelSha256 = parser.text
                            }

                            "effectiveContractSha256" -> {
                                effectiveContractSha256 = parser.text
                            }

                            "semanticModelSha256" -> {
                                semanticModelSha256 = parser.text
                            }

                            "kotlinApiSha256" -> {
                                kotlinApiSha256 = parser.text
                            }

                            "files" -> {
                                readFilesArray(parser, path, files)
                            }

                            in DECLARED_UNCONSUMED_FIELDS -> {
                                parser.skipChildren()
                            }

                            else -> {
                                throw CompatibilityManifestInputException(
                                    "Compatibility manifest declares an unknown field \"$fieldName\": $path",
                                )
                            }
                        }
                    }
                }
            }
        } catch (failure: CompatibilityManifestInputException) {
            throw failure
        } catch (failure: IOException) {
            throw CompatibilityManifestInputException(
                "Compatibility manifest could not be parsed: $path",
                failure,
            )
        }

        return RawManifestFields(
            schemaVersion = schemaVersion,
            declarationModelSha256 = declarationModelSha256,
            effectiveContractSha256 = effectiveContractSha256,
            semanticModelSha256 = semanticModelSha256,
            kotlinApiSha256 = kotlinApiSha256,
            files = files,
        )
    }

    /**
     * Walks the `files` array as a stream, aborting deterministically on the 20,001st element. The count check
     * runs before the element's own fields are read, so an over-count manifest is rejected without requiring the
     * remainder of the document to parse.
     *
     * The count is [sink]'s own size rather than a local counter. A local counter is scoped to one invocation
     * while [sink] accumulates across all of them, so repeated `files` arrays each restarted the bound while
     * continuing to fill the same list. Duplicate top-level fields are now rejected outright, which closes that
     * route independently; deriving the count from the accumulated list means the bound holds regardless.
     */
    private fun readFilesArray(
        parser: JsonParser,
        path: Path,
        sink: MutableList<CompatibilityManifestFile>,
    ) {
        requireToken(parser.currentToken(), JsonToken.START_ARRAY, path)
        while (true) {
            val token =
                parser.nextToken()
                    ?: throw CompatibilityManifestInputException(
                        "Compatibility manifest ended while reading files: $path",
                    )
            if (token == JsonToken.END_ARRAY) break

            if (sink.size + 1 > MAX_MANIFEST_FILES) {
                throw CompatibilityManifestInputException(
                    "Compatibility manifest declares more than the maximum of 20,000 files: $path",
                )
            }
            requireToken(token, JsonToken.START_OBJECT, path)
            sink += readManifestFileEntry(parser, path)
        }
    }

    private fun readManifestFileEntry(
        parser: JsonParser,
        path: Path,
    ): CompatibilityManifestFile {
        var entryPath: String? = null
        var entrySha256: String? = null
        while (parser.nextToken() != JsonToken.END_OBJECT) {
            requireFieldName(parser, path)
            val fieldName = parser.currentName()
            parser.nextToken()
            when (fieldName) {
                "path" -> {
                    entryPath = parser.text
                }

                "sha256" -> {
                    entrySha256 = parser.text
                }

                else -> {
                    throw CompatibilityManifestInputException(
                        "Compatibility manifest file entry declares an unknown field \"$fieldName\": $path",
                    )
                }
            }
        }
        return CompatibilityManifestFile(
            path =
                entryPath
                    ?: throw CompatibilityManifestInputException(
                        "Compatibility manifest file entry is missing path: $path",
                    ),
            sha256 =
                entrySha256
                    ?: throw CompatibilityManifestInputException(
                        "Compatibility manifest file entry is missing sha256: $path",
                    ),
        )
    }

    private fun requireToken(
        actual: JsonToken?,
        expected: JsonToken,
        path: Path,
    ) {
        if (actual != expected) {
            throw CompatibilityManifestInputException("Compatibility manifest is not well-formed JSON: $path")
        }
    }

    private fun requireFieldName(
        parser: JsonParser,
        path: Path,
    ) {
        if (parser.currentToken() != JsonToken.FIELD_NAME) {
            throw CompatibilityManifestInputException("Compatibility manifest is not well-formed JSON: $path")
        }
    }

    private fun validateManifestFile(
        entry: CompatibilityManifestFile,
        path: Path,
    ): CompatibilityManifestFile =
        CompatibilityManifestFile(
            path = validateManifestFilePath(entry.path),
            sha256 = validateDigest(entry.sha256, "files[].sha256", path),
        )

    /**
     * Validates a declared manifest file path against its raw string form, never against a host [Path]. `Path`
     * would not recognize a Windows drive-qualified string as absolute on a non-Windows host, so every check here
     * is a direct string inspection.
     *
     * The drive-qualified check matches any leading `<letter>:` prefix, with or without a following separator, so
     * a drive-relative form such as `C:outside.kt` is rejected exactly like `C:\outside.kt` and `C:/outside.kt`.
     * Segment analysis (root-traversal, non-canonical form) runs against a backslash-to-forward-slash normalized
     * copy of the path so a mixed- or backslash-only traversal such as `generated\..\outside.kt` cannot slip past
     * a check that only ever split on `/`.
     */
    private fun validateManifestFilePath(rawPath: String): String {
        if (rawPath.isEmpty()) {
            throw CompatibilityManifestInputException("Compatibility manifest file path must not be empty.")
        }
        if (rawPath.length > MAX_MANIFEST_PATH_LENGTH) {
            throw CompatibilityManifestInputException(
                "Compatibility manifest file path exceeds the maximum length of $MAX_MANIFEST_PATH_LENGTH: $rawPath",
            )
        }
        if (rawPath.any { character -> character.code == 0 }) {
            throw CompatibilityManifestInputException(
                "Compatibility manifest file path must not contain NUL: $rawPath",
            )
        }
        if (DRIVE_QUALIFIED_PATH.containsMatchIn(rawPath)) {
            throw CompatibilityManifestInputException(
                "Compatibility manifest file path must not be drive-qualified: $rawPath",
            )
        }
        if (rawPath.startsWith('/') || rawPath.startsWith('\\')) {
            throw CompatibilityManifestInputException(
                "Compatibility manifest file path must be relative: $rawPath",
            )
        }
        val normalized = rawPath.replace('\\', '/')
        val segments = normalized.split('/')
        if (segments.any { segment -> segment == ".." }) {
            throw CompatibilityManifestInputException(
                "Compatibility manifest file path must not traverse its root: $rawPath",
            )
        }
        if (segments.any { segment -> segment.isEmpty() || segment == "." }) {
            throw CompatibilityManifestInputException(
                "Compatibility manifest file path is not canonical: $rawPath",
            )
        }
        return normalized
    }

    /** Requires a declared digest field to be a canonical lowercase 64-character SHA-256 hex digest. */
    private fun validateDigest(
        value: String,
        fieldName: String,
        path: Path,
    ): String {
        if (!CANONICAL_SHA256.matches(value)) {
            throw CompatibilityManifestInputException(
                "Compatibility manifest field $fieldName is not a canonical SHA-256 digest: $path",
            )
        }
        return value
    }

    private data class RawManifestFields(
        val schemaVersion: String?,
        val declarationModelSha256: String?,
        val effectiveContractSha256: String?,
        val semanticModelSha256: String?,
        val kotlinApiSha256: String?,
        val files: List<CompatibilityManifestFile>,
    )
}

/** Thrown for deterministic, bounded compatibility-manifest input failures. */
internal class CompatibilityManifestInputException(
    message: String,
    cause: Throwable? = null,
) : IllegalArgumentException(message, cause)
