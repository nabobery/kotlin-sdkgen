package com.nabobery.sdkgen.engine.declarations

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNotEquals
import kotlin.test.assertNotNull
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

    @Test
    fun requestVariantsParticipateInCanonicalDigest() {
        val baseline =
            variantOperationModel(suffix = "Multipart", replayability = RequestBodyReplayability.NON_REPLAYABLE)
        val changedSuffix =
            variantOperationModel(suffix = "Upload", replayability = RequestBodyReplayability.NON_REPLAYABLE)
        val changedReplayability =
            variantOperationModel(suffix = "Multipart", replayability = RequestBodyReplayability.REPLAYABLE)

        assertNotEquals(baseline.digest(), changedSuffix.digest(), "variant method suffix must affect the digest")
        assertNotEquals(
            baseline.digest(),
            changedReplayability.digest(),
            "variant replayability must affect the digest",
        )
    }

    @Test
    fun requestVariantListsAreDefensivelyCopiedAndShuffleDeterministically() {
        val fields =
            mutableListOf(
                variantFormField("alpha"),
                variantFormField("beta"),
                variantFormField("gamma"),
                variantFormField("delta"),
            )
        val value = FormValueDeclaration.Object(fields)
        val variant =
            requestVariant(
                replayability = RequestBodyReplayability.REPLAYABLE,
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
            )
        val variants = mutableListOf(variant)
        val operation = operation(variants)
        val model =
            KotlinDeclarationModel(
                listOf(
                    KotlinFileDeclaration("com.example", "WidgetClient", listOf(operationClient(listOf(operation)))),
                ),
            )

        variants.clear()
        assertEquals(
            listOf(variant),
            model.files
                .single()
                .declarations
                .filterIsInstance<OperationClientDeclaration>()
                .single()
                .operations
                .single()
                .requestVariants,
        )

        val originalOrder = listOf("alpha", "beta", "gamma", "delta")

        fun shuffledFieldOrder(seed: Int): List<String> =
            model
                .shuffled(seed)
                .files
                .single()
                .declarations
                .filterIsInstance<OperationClientDeclaration>()
                .single()
                .operations
                .single()
                .requestVariants
                .single()
                .formFields
                .single()
                .value
                .let { it as FormValueDeclaration.Object }
                .fields
                .map(FormFieldDeclaration::wireName)

        val changedSeed =
            (1..40)
                .firstOrNull { seed -> shuffledFieldOrder(seed) != originalOrder }
        assertNotNull(
            changedSeed,
            "shuffling must reorder variant form fields for at least one deterministic seed",
        )
        assertEquals(originalOrder.toSet(), shuffledFieldOrder(changedSeed).toSet())
        assertEquals(model.normalized().digest(), model.shuffled(changedSeed).normalized().digest())
    }

    @Test
    fun requestVariantTypesRewriteWithRenames() {
        val variant =
            requestVariant(
                replayability = RequestBodyReplayability.NON_REPLAYABLE,
                multipartParts =
                    listOf(
                        MultipartPartDeclaration(
                            wireName = "file",
                            accessorName = "file",
                            type = KotlinTypeRef("com.example", "Widget"),
                            required = true,
                            contentType = "application/octet-stream",
                        ),
                    ),
            )
        val rewritten =
            KotlinDeclarationModel(
                listOf(
                    KotlinFileDeclaration(
                        "com.example",
                        "WidgetClient",
                        listOf(operationClient(listOf(operation(listOf(variant))))),
                    ),
                ),
            ).rewriteTypeReferences(mapOf(("com.example" to "Widget") to "RenamedWidget"))
                .files
                .single()
                .declarations
                .filterIsInstance<OperationClientDeclaration>()
                .single()
                .operations
                .single()
                .requestVariants
                .single()

        assertEquals("RenamedWidget", rewritten.type.simpleName)
        assertEquals(
            "RenamedWidget",
            rewritten.multipartParts
                .single()
                .type.simpleName,
        )
    }

    private fun variantFormField(name: String): FormFieldDeclaration =
        FormFieldDeclaration(
            wireName = name,
            accessorName = name,
            type = KotlinTypeRef("kotlin", "String"),
            required = true,
            value = FormValueDeclaration.Scalar(FormScalarKind.STRING),
        )

    private fun variantOperationModel(
        suffix: String,
        replayability: RequestBodyReplayability,
    ): KotlinDeclarationModel =
        KotlinDeclarationModel(
            listOf(
                KotlinFileDeclaration(
                    packageName = "com.example",
                    fileName = "WidgetClient",
                    declarations =
                        listOf(
                            operationClient(
                                listOf(
                                    operation(
                                        listOf(
                                            requestVariant(
                                                methodName = "getWidget$suffix",
                                                nameSuffix = suffix,
                                                replayability = replayability,
                                            ),
                                        ),
                                    ),
                                ),
                            ),
                        ),
                ),
            ),
        )

    private fun requestVariant(
        methodName: String = "getWidgetMultipart",
        nameSuffix: String = "Multipart",
        replayability: RequestBodyReplayability,
        multipartParts: List<MultipartPartDeclaration> = emptyList(),
        formFields: List<FormFieldDeclaration> = emptyList(),
    ): OperationRequestVariantDeclaration =
        OperationRequestVariantDeclaration(
            methodName = methodName,
            nameSuffix = nameSuffix,
            operationIdentity = "getWidget",
            mediaTypes = listOf("multipart/form-data"),
            type = KotlinTypeRef("com.example", "Widget"),
            required = true,
            multipartParts = multipartParts,
            formFields = formFields,
            replayability = replayability,
            encoding = RequestBodyEncoding.MULTIPART,
        )

    private fun operation(variants: List<OperationRequestVariantDeclaration>): OperationDeclaration =
        OperationDeclaration(
            symbolId = "operation:getWidget",
            order = 0,
            operationId = "getWidget",
            method = "POST",
            path = "/widgets",
            requestMediaTypes = listOf("multipart/form-data"),
            responseMediaTypes = listOf("application/json"),
            successStatusCodes = setOf(200),
            requestType = KotlinTypeRef("com.example", "Widget"),
            responseType = KotlinTypeRef("com.example", "Widget"),
            requestCodecPropertyName = "getWidgetRequestCodec",
            responseCodecPropertyName = "getWidgetResponseCodec",
            requestCodecConstantName = "GET_WIDGET_REQUEST_CODEC_ID",
            responseCodecConstantName = "GET_WIDGET_RESPONSE_CODEC_ID",
            requestCodecId = "getWidget.request",
            responseCodecId = "getWidget.response",
            responseMode = OperationResponseMode.BUFFERED,
            deadlines = OperationDeadlines(1_000, 1_000, null),
            methodKdoc = "Creates a widget.",
            requestVariants = variants,
        )
}
