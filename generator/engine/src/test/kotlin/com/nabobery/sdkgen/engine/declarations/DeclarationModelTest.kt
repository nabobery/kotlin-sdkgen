package com.nabobery.sdkgen.engine.declarations

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNotEquals
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
    fun operationDescriptorMetadataParticipatesInCanonicalDigest() {
        val responseType = KotlinTypeRef("com.example", "Widget")
        val baseline = operationModel(responseType).digest()
        val changed = operationModel(KotlinTypeRef("com.example", "DifferentWidget")).digest()

        assertNotEquals(baseline, changed)
    }

    @Test
    fun nestedFormDeclarationsAffectDigestRewriteTypesAndDefensivelyCopyFields() {
        val nestedFields =
            mutableListOf(
                FormFieldDeclaration(
                    wireName = "child",
                    accessorName = "child",
                    type = KotlinTypeRef("com.example", "Nested"),
                    required = true,
                    value = FormValueDeclaration.Scalar(FormScalarKind.STRING),
                ),
            )
        val formValue = FormValueDeclaration.Object(nestedFields)
        nestedFields.clear()
        val baseline = formOperationModel(formValue)
        val changed = formOperationModel(FormValueDeclaration.Object(emptyList()))
        val rewritten = baseline.rewriteTypeReferences(mapOf(("com.example" to "Nested") to "RenamedNested"))
        val rewrittenField =
            rewritten.files
                .flatMap(KotlinFileDeclaration::declarations)
                .filterIsInstance<OperationClientDeclaration>()
                .single()
                .operations
                .single()
                .requestBodyAlternatives
                .single()
                .formFields
                .single()
                .value
                .let { it as FormValueDeclaration.Object }
                .fields
                .single()

        assertEquals(1, formValue.fields.size)
        assertNotEquals(baseline.digest(), changed.digest())
        assertEquals("RenamedNested", rewrittenField.type.simpleName)
    }

    @Test
    fun nestedFormFieldsParticipateInShuffleAndNormalizeDeterministically() {
        val baseline = formOperationModel(nestedFormObject("a", "b", "c", "d", "e", "f"))
        val shuffled = baseline.shuffled(41)
        val shuffledNames = shuffled.nestedFormFieldNames()

        assertNotEquals(listOf("a", "b", "c", "d", "e", "f"), shuffledNames)
        assertEquals(baseline.normalized().digest(), shuffled.normalized().digest())
    }

    @Test
    fun operationClientDefensivelyCopiesOperationLists() {
        val operation = operation(KotlinTypeRef("com.example", "Widget"))
        val mutableOperations = mutableListOf(operation)
        val client = operationClient(mutableOperations)

        mutableOperations.clear()

        assertEquals(listOf(operation), client.operations)
    }

    private fun KotlinDeclarationModel.nestedFormFieldNames(): List<String> =
        files
            .flatMap(KotlinFileDeclaration::declarations)
            .filterIsInstance<OperationClientDeclaration>()
            .single()
            .operations
            .single()
            .requestBodyAlternatives
            .single()
            .formFields
            .single()
            .value
            .let { it as FormValueDeclaration.Object }
            .fields
            .map(FormFieldDeclaration::wireName)

    private fun nestedFormObject(vararg names: String): FormValueDeclaration.Object =
        FormValueDeclaration.Object(
            names.map { name ->
                FormFieldDeclaration(
                    wireName = name,
                    accessorName = name,
                    type = KotlinTypeRef("kotlin", "String"),
                    required = true,
                    value = FormValueDeclaration.Scalar(FormScalarKind.STRING),
                )
            },
        )

    private fun formOperationModel(value: FormValueDeclaration): KotlinDeclarationModel {
        val operation =
            operation(KotlinTypeRef("kotlin", "Unit"), value)
        return KotlinDeclarationModel(
            listOf(
                KotlinFileDeclaration(
                    packageName = "com.example",
                    fileName = "WidgetClient",
                    declarations = listOf(operationClient(listOf(operation))),
                ),
            ),
        )
    }

    private fun operationModel(alternativeType: KotlinTypeRef): KotlinDeclarationModel {
        val operation = operation(alternativeType)
        return KotlinDeclarationModel(
            listOf(
                KotlinFileDeclaration(
                    packageName = "com.example",
                    fileName = "WidgetClient",
                    declarations = listOf(operationClient(listOf(operation))),
                ),
            ),
        )
    }

    private fun operationClient(operations: List<OperationDeclaration>): OperationClientDeclaration =
        OperationClientDeclaration(
            symbolId = "client:WidgetClient",
            order = 0,
            packageName = "com.example",
            fileName = "WidgetClient",
            resolvedName = "WidgetClient",
            kdoc = "Widgets.",
            codecsObjectName = "WidgetCodecs",
            operations = operations,
        )

    private fun operation(
        alternativeType: KotlinTypeRef,
        formValue: FormValueDeclaration? = null,
    ): OperationDeclaration =
        OperationDeclaration(
            symbolId = "operation:getWidget",
            order = 0,
            operationId = "getWidget",
            method = "GET",
            path = "/widgets/{id}",
            requestMediaTypes = emptyList(),
            responseMediaTypes = listOf("application/json"),
            successStatusCodes = setOf(200),
            requestType = KotlinTypeRef("kotlin", "Unit"),
            responseType = KotlinTypeRef("com.example", "Widget"),
            requestCodecPropertyName = "getWidgetRequestCodec",
            responseCodecPropertyName = "getWidgetResponseCodec",
            requestCodecConstantName = "GET_WIDGET_REQUEST_CODEC_ID",
            responseCodecConstantName = "GET_WIDGET_RESPONSE_CODEC_ID",
            requestCodecId = "getWidget.request",
            responseCodecId = "getWidget.response",
            responseMode = OperationResponseMode.BUFFERED,
            deadlines = OperationDeadlines(1_000, 1_000, null),
            methodKdoc = "Gets a widget.",
            requestBodyAlternatives =
                formValue
                    ?.let { value ->
                        listOf(
                            OperationRequestBodyAlternative(
                                mediaType = "application/x-www-form-urlencoded",
                                type = KotlinTypeRef("com.example", "Request"),
                                formFields =
                                    listOf(
                                        FormFieldDeclaration(
                                            wireName = "root",
                                            accessorName = "root",
                                            type = KotlinTypeRef("com.example", "Nested"),
                                            required = true,
                                            value = value,
                                        ),
                                    ),
                            ),
                        )
                    }.orEmpty(),
            responseAlternatives =
                listOf(
                    OperationResponseAlternative(
                        ResponseSelectorDeclaration.ExactStatus(200),
                        listOf("application/json"),
                        alternativeType,
                    ),
                ),
        )

    @Test
    fun ordinaryResponseCompatibilityHonorsSelectorPrecedenceAndConfiguredSuccesses() {
        val string = KotlinTypeRef("kotlin", "String")
        val binary = KotlinTypeRef("com.nabobery.sdkgen.runtime", "SdkByteStream")
        val alternatives =
            listOf(
                OperationResponseAlternative(
                    ResponseSelectorDeclaration.ExactStatus(200),
                    listOf("application/json"),
                    string,
                ),
                OperationResponseAlternative(
                    ResponseSelectorDeclaration.StatusRange(200, 299),
                    listOf("application/vnd.value+json"),
                    string,
                ),
                OperationResponseAlternative(
                    ResponseSelectorDeclaration.Default,
                    listOf("application/octet-stream"),
                    binary,
                ),
            )
        val ordinaryTwoXx = operation(string).copyForTest(setOf(200), alternatives)
        val customSuccess = operation(string).copyForTest(setOf(200, 304), alternatives)

        assertTrue(ordinaryTwoXx.hasCompatibleOrdinaryResponseShape())
        assertFalse(customSuccess.hasCompatibleOrdinaryResponseShape())
    }

    private fun OperationDeclaration.copyForTest(
        successStatusCodes: Set<Int>,
        responseAlternatives: List<OperationResponseAlternative>,
    ): OperationDeclaration =
        OperationDeclaration(
            symbolId = symbolId,
            order = order,
            operationId = operationId,
            operationIdentity = operationIdentity,
            method = method,
            path = path,
            requestMediaTypes = requestMediaTypes,
            responseMediaTypes = responseAlternatives.flatMap(OperationResponseAlternative::mediaTypes),
            successStatusCodes = successStatusCodes,
            requestType = requestType,
            responseType = responseType,
            requestCodecPropertyName = requestCodecPropertyName,
            responseCodecPropertyName = responseCodecPropertyName,
            requestCodecConstantName = requestCodecConstantName,
            responseCodecConstantName = responseCodecConstantName,
            requestCodecId = requestCodecId,
            responseCodecId = responseCodecId,
            responseMode = responseMode,
            deadlines = deadlines,
            methodKdoc = methodKdoc,
            responseAlternatives = responseAlternatives,
        )

    @Test
    fun kdocSanitizationPreventsCommentTermination() {
        val sanitized = sanitizeKDoc("keeps 100% and blocks */ termination")
        assertTrue("100%" in sanitized)
        assertFalse("*/" in sanitized)
        assertTrue("*&#47;" in sanitized)
    }

    @Test
    fun kdocSanitizationRemovesTrailingWhitespaceFromEveryLine() {
        assertEquals("first\nsecond", sanitizeKDoc("first  \nsecond\t"))
    }
}
