package com.nabobery.sdkgen.engine.config

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertInstanceOf
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class LockContractTest {
    @Test
    fun `lock serialization is byte-identical stable LF text with trailing newline`() {
        val lock = TestFixtures.lock()

        val first = LockCodec.encode(lock)
        val second = LockCodec.encode(lock)

        assertArrayEquals(first.toByteArray(), second.toByteArray())
        assertTrue(first.endsWith("\n"))
        assertFalse(first.contains("\r"))
        assertTrue(first.indexOf("\"version\"") < first.indexOf("\"configDigest\""))
        assertEquals(lock, LockCodec.decode(first))
    }

    @Test
    fun `lock serialization preserves canonical plugin phases`() {
        val base = TestFixtures.lock().plugins.single()
        val lock =
            TestFixtures.lock().copy(
                plugins =
                    listOf(
                        base.copy(
                            phases =
                                listOf(
                                    "validation",
                                    "semantic_transform",
                                    "naming_type_mapping",
                                    "declaration_augmentation",
                                    "output_verification",
                                ),
                        ),
                    ),
            )

        assertEquals(lock, LockCodec.decode(LockCodec.encode(lock)))
    }

    @Test
    fun `missing lock version has a distinct typed error`() {
        val invalid = LockCodec.encode(TestFixtures.lock()).replaceFirst("  \"version\": \"v1alpha1\",\n", "")

        val error =
            assertThrows<MissingLockVersionException> {
                LockCodec.decode(invalid, "missing-version.lock")
            }

        assertEquals("SDKGEN-LOCK-VERSION-MISSING", error.diagnostic.code)
        assertEquals("missing-version.lock", error.diagnostic.path.file)
        assertEquals("$.version", error.diagnostic.path.yamlPath)
    }

    @Test
    fun `unsupported lock version has a distinct typed error`() {
        val invalid = LockCodec.encode(TestFixtures.lock()).replaceFirst("v1alpha1", "v2")

        val error =
            assertThrows<UnsupportedLockVersionException> {
                LockCodec.decode(invalid, "unsupported.lock")
            }

        assertEquals("SDKGEN-LOCK-VERSION-UNSUPPORTED", error.diagnostic.code)
        assertEquals("v2", error.actualVersion)
        assertInstanceOf(LockContractException::class.java, error)
    }

    @Test
    fun `malformed lock content has a cause preserving typed decode error`() {
        val error =
            assertThrows<LockDecodeException> {
                LockCodec.decode("{not-json", "malformed.lock")
            }

        assertEquals("SDKGEN-LOCK-DECODE-FAILED", error.diagnostic.code)
        assertEquals(DiagnosticPhase.LOCK, error.diagnostic.phase)
        assertEquals("malformed.lock", error.diagnostic.path.file)
        assertEquals("$", error.diagnostic.path.yamlPath)
        assertTrue(error.cause != null)
    }

    @Test
    fun `unknown lock fields have a cause preserving typed decode error`() {
        val invalid =
            LockCodec
                .encode(
                    TestFixtures.lock(),
                ).replaceFirst("  \"configDigest\"", "  \"unknown\": true,\n  \"configDigest\"")

        val error =
            assertThrows<LockDecodeException> {
                LockCodec.decode(invalid, "unknown.lock")
            }

        assertEquals("SDKGEN-LOCK-DECODE-FAILED", error.diagnostic.code)
        assertEquals("unknown.lock", error.diagnostic.path.file)
        assertTrue(error.cause != null)
    }

    @Test
    fun `configuration digest ignores map insertion order`() {
        val plugin = TestFixtures.config.plugins.single()
        val first =
            TestFixtures.config.copy(
                plugins = listOf(plugin.copy(config = linkedMapOf("alpha" to "1", "beta" to "2"))),
            )
        val second =
            TestFixtures.config.copy(
                plugins = listOf(plugin.copy(config = linkedMapOf("beta" to "2", "alpha" to "1"))),
            )

        assertEquals(ConfigDigest.sha256(first), ConfigDigest.sha256(second))
    }

    @Test
    fun `ordered overlays remain significant in config digests and lock encoding`() {
        val firstOverlay = OverlayConfig("first", "sdkgen://overlay/first", "a".repeat(64))
        val secondOverlay = OverlayConfig("second", "sdkgen://overlay/second", "b".repeat(64))
        val firstConfig = TestFixtures.config.copy(overlays = listOf(firstOverlay, secondOverlay))
        val reversedConfig = firstConfig.copy(overlays = listOf(secondOverlay, firstOverlay))
        val firstLock =
            TestFixtures.lock().copy(
                overlays =
                    listOf(
                        LockedOverlay("first", "sdkgen://overlay/first", "a".repeat(64)),
                        LockedOverlay("second", "sdkgen://overlay/second", "b".repeat(64)),
                    ),
            )
        val reversedLock = firstLock.copy(overlays = firstLock.overlays.reversed())

        assertNotEquals(ConfigDigest.sha256(firstConfig), ConfigDigest.sha256(reversedConfig))
        assertNotEquals(LockCodec.encode(firstLock), LockCodec.encode(reversedLock))
    }

    @Test
    fun `locked mode proceeds when every digest matches`() {
        val result = LockedMode.verify(TestFixtures.config, TestFixtures.lock(), TestFixtures.resolvedInputs())

        assertEquals(LockedModeResult.Proceed, result)
    }

    @Test
    fun `locked mode returns typed digest mismatch refusal`() {
        val changed =
            TestFixtures.resolvedInputs().copy(
                source = TestFixtures.resolvedInputs().source.copy(sha256 = "d".repeat(64)),
            )

        val result = LockedMode.verify(TestFixtures.config, TestFixtures.lock(), changed)

        val refused = assertInstanceOf(LockedModeResult.Refused::class.java, result)
        val mismatch = assertInstanceOf(LockRefusal.DigestMismatch::class.java, refused.reasons.single())
        assertEquals("SDKGEN-LOCK-DIGEST-MISMATCH", mismatch.diagnostic.code)
        assertEquals("file:///workspace/openapi/openapi.yaml", mismatch.inputId)
    }

    @Test
    fun `locked mode refuses changed content length even when digest metadata matches`() {
        val changed =
            TestFixtures.resolvedInputs().copy(
                references =
                    TestFixtures.resolvedInputs().references.map { reference ->
                        reference.copy(contentLength = reference.contentLength + 1)
                    },
            )

        val result = LockedMode.verify(TestFixtures.config, TestFixtures.lock(), changed)

        val refused = assertInstanceOf(LockedModeResult.Refused::class.java, result)
        val mismatch = assertInstanceOf(LockRefusal.ContentLengthMismatch::class.java, refused.reasons.single())
        assertEquals("SDKGEN-LOCK-CONTENT-LENGTH-MISMATCH", mismatch.diagnostic.code)
        assertEquals("file:///workspace/openapi/components.yaml", mismatch.inputId)
    }

    @Test
    fun `locked mode returns typed missing entry refusal`() {
        val missingReference = TestFixtures.resolvedInputs().copy(references = emptyList())

        val result = LockedMode.verify(TestFixtures.config, TestFixtures.lock(), missingReference)

        val refused = assertInstanceOf(LockedModeResult.Refused::class.java, result)
        val missing = assertInstanceOf(LockRefusal.MissingInput::class.java, refused.reasons.single())
        assertEquals("SDKGEN-LOCK-INPUT-MISSING", missing.diagnostic.code)
        assertEquals("file:///workspace/openapi/components.yaml", missing.inputId)
    }

    @Test
    fun `locked mode refuses duplicate resolved reference identities`() {
        val reference = TestFixtures.resolvedInputs().references.single()
        val resolved =
            TestFixtures.resolvedInputs().copy(
                references = listOf(reference, reference),
            )

        val result = LockedMode.verify(TestFixtures.config, TestFixtures.lock(), resolved)

        val refused = assertInstanceOf(LockedModeResult.Refused::class.java, result)
        val duplicate = assertInstanceOf(LockRefusal.DuplicateInput::class.java, refused.reasons.single())
        assertEquals("SDKGEN-LOCK-DUPLICATE-INPUT", duplicate.diagnostic.code)
        assertEquals(reference.canonicalUri, duplicate.inputId)
    }

    @Test
    fun `locked mode refuses duplicate locked reference identities`() {
        val reference =
            TestFixtures
                .lock()
                .source.references
                .single()
        val lock =
            TestFixtures.lock().copy(
                source = TestFixtures.lock().source.copy(references = listOf(reference, reference)),
            )

        val result = LockedMode.verify(TestFixtures.config, lock, TestFixtures.resolvedInputs())

        val refused = assertInstanceOf(LockedModeResult.Refused::class.java, result)
        val duplicate =
            assertInstanceOf(
                LockRefusal.DuplicateLockEntry::class.java,
                refused.reasons.filterIsInstance<LockRefusal.DuplicateLockEntry>().single(),
            )
        assertEquals("SDKGEN-LOCK-DUPLICATE-ENTRY", duplicate.diagnostic.code)
        assertEquals(reference.canonicalUri, duplicate.inputId)
    }

    @Test
    fun `locked mode reports non-strict reference order alongside duplicate entries`() {
        val reference =
            TestFixtures
                .lock()
                .source.references
                .single()
        val lock =
            TestFixtures.lock().copy(
                source = TestFixtures.lock().source.copy(references = listOf(reference, reference)),
            )

        val result = LockedMode.verify(TestFixtures.config, lock, TestFixtures.resolvedInputs())

        val refused = assertInstanceOf(LockedModeResult.Refused::class.java, result)
        assertTrue(refused.reasons.any { it is LockRefusal.ReferenceOrder })
        assertTrue(refused.reasons.any { it is LockRefusal.DuplicateLockEntry })
    }

    @Test
    fun `locked mode refuses a resolved input with no lock entry`() {
        val extraReference =
            ResolvedInput(
                canonicalUri = "file:///workspace/openapi/unlocked.yaml",
                sha256 = "e".repeat(64),
                contentLength = 12,
            )
        val resolved =
            TestFixtures.resolvedInputs().copy(
                references = TestFixtures.resolvedInputs().references + extraReference,
            )

        val result = LockedMode.verify(TestFixtures.config, TestFixtures.lock(), resolved)

        val refused = assertInstanceOf(LockedModeResult.Refused::class.java, result)
        val missing = assertInstanceOf(LockRefusal.MissingLockEntry::class.java, refused.reasons.single())
        assertEquals("SDKGEN-LOCK-ENTRY-MISSING", missing.diagnostic.code)
        assertEquals(extraReference.canonicalUri, missing.inputId)
    }

    @Test
    fun `locked mode refuses references outside canonical URI order`() {
        val reference =
            TestFixtures
                .lock()
                .source.references
                .single()
        val precedingReference =
            LockedReference(
                canonicalUri = "file:///workspace/openapi/a.yaml",
                sha256 = "a".repeat(64),
                contentLength = 1,
            )
        val lock =
            TestFixtures.lock().copy(
                source = TestFixtures.lock().source.copy(references = listOf(reference, precedingReference)),
            )
        val resolved =
            TestFixtures.resolvedInputs().copy(
                references =
                    TestFixtures.resolvedInputs().references +
                        ResolvedInput(
                            precedingReference.canonicalUri,
                            precedingReference.sha256,
                            precedingReference.contentLength,
                        ),
            )

        val result = LockedMode.verify(TestFixtures.config, lock, resolved)

        val refused = assertInstanceOf(LockedModeResult.Refused::class.java, result)
        assertEquals(
            "SDKGEN-LOCK-REFERENCE-ORDER",
            refused.reasons
                .single()
                .diagnostic.code,
        )
    }

    @Test
    fun `locked mode refuses plugin metadata drift even when config digest matches`() {
        val changedLock =
            TestFixtures.lock().copy(
                plugins =
                    listOf(
                        TestFixtures
                            .lock()
                            .plugins
                            .single()
                            .copy(configSha256 = "d".repeat(64)),
                    ),
            )

        val result = LockedMode.verify(TestFixtures.config, changedLock, TestFixtures.resolvedInputs())

        val refused = assertInstanceOf(LockedModeResult.Refused::class.java, result)
        val mismatch =
            assertInstanceOf(
                LockRefusal.PluginMetadataMismatch::class.java,
                refused.reasons.single(),
            )
        assertEquals("com.nabobery.sdkgen.builtin.output-verification", mismatch.pluginId)
        assertEquals("SDKGEN-LOCK-PLUGIN-MISMATCH", mismatch.diagnostic.code)
        assertEquals("$.plugins[0]", mismatch.diagnostic.path.yamlPath)
    }

    @Test
    fun `locked mode refuses plugin phase drift`() {
        val plugin = TestFixtures.lock().plugins.single()
        val changedLock =
            TestFixtures.lock().copy(
                plugins = listOf(plugin.copy(phases = listOf("naming_type_mapping"))),
            )

        val result =
            LockedMode.verify(
                TestFixtures.config,
                changedLock,
                TestFixtures.resolvedInputs(),
                pluginPhases = mapOf(plugin.id to emptyList()),
            )

        val refused = assertInstanceOf(LockedModeResult.Refused::class.java, result)
        val mismatch = assertInstanceOf(LockRefusal.PluginMetadataMismatch::class.java, refused.reasons.single())
        assertEquals(plugin.id, mismatch.pluginId)
    }

    @Test
    fun `locked mode refuses duplicate plugin lock entries`() {
        val plugin = TestFixtures.lock().plugins.single()
        val changedLock = TestFixtures.lock().copy(plugins = listOf(plugin, plugin))

        val result = LockedMode.verify(TestFixtures.config, changedLock, TestFixtures.resolvedInputs())

        val refused = assertInstanceOf(LockedModeResult.Refused::class.java, result)
        val duplicate =
            assertInstanceOf(
                LockRefusal.DuplicateLockEntry::class.java,
                refused.reasons.single { it is LockRefusal.DuplicateLockEntry },
            )
        assertEquals(plugin.id, duplicate.inputId)
    }

    @Test
    fun `check detects config drift from lock`() {
        val changed =
            TestFixtures.config.copy(
                kotlin = TestFixtures.config.kotlin.copy(packageName = "com.example.changed"),
            )

        val drift = LockDrift.check(changed, TestFixtures.lock())

        assertEquals(1, drift.size)
        assertEquals("SDKGEN-LOCK-CONFIG-DRIFT", drift.single().code)
        assertEquals(DiagnosticPhase.LOCK, drift.single().phase)
    }
}
