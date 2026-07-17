package com.nabobery.sdkgen.engine.declarations

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class DeclarationModelTest {
    @Test
    fun normalizationOwnsFileDeclarationAndMemberOrder() {
        val model = goldenSliceModel().shuffled(41)
        val normalized = model.normalized()

        assertEquals(normalized.files.sortedBy { it.path }, normalized.files)
        normalized.files.forEach { file ->
            assertEquals(
                file.declarations.sortedWith(compareBy(Declaration::order, Declaration::symbolId)),
                file.declarations,
            )
        }
        val request =
            normalized.files
                .flatMap { it.declarations }
                .filterIsInstance<ModelDeclaration>()
                .single()
        assertEquals(
            request.fields.sortedWith(compareBy(FieldDeclaration::order, FieldDeclaration::symbolId)),
            request.fields,
        )
    }

    @Test
    fun canonicalDigestIsIndependentOfInputOrderAndLocale() {
        val baseline = goldenSliceModel().normalized().digest()
        assertEquals(baseline, goldenSliceModel().shuffled(9).normalized().digest())
        assertEquals(baseline, goldenSliceModel().shuffled(99).normalized().digest())
    }

    @Test
    fun kdocSanitizationPreventsCommentTermination() {
        val sanitized = sanitizeKDoc("keeps 100% and blocks */ termination")
        assertTrue("100%" in sanitized)
        assertFalse("*/" in sanitized)
        assertTrue("*&#47;" in sanitized)
    }
}
