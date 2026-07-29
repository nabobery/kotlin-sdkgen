package com.nabobery.sdkgen.cli

/**
 * Classifies a typed Kotlin public-API projection supplied as compatibility evidence.
 *
 * Canonical-subject grammar:
 * - `(kotlinApi, declaration)`: `<package>.<declaration-name>` or `<package>.<Type>#<member>`
 * - `(kotlinApi, property)`: `<package>.<declaration-name>#<property-name>`
 * - `(kotlinApi, function)`: `<package>.<declaration-name>#<function-name>(<parameter-type-list>)`
 * - `(kotlinApi, enum-entry)`: `<package>.<declaration-name>#<entry-name>`
 *
 * Worked example: the declaration subject for `ChatClient.stableOperation` is exactly
 * `com.nabobery.sdkgen.generated.ChatClient#stableOperation`.
 * Evidence uses `declaration-projection`. KDoc, source formatting, declaration order, and codec names are absent
 * from this projection and therefore cannot affect its fingerprints or change IDs.
 */
internal object KotlinApiCompatibilityClassifier : CompatibilityLayerClassifier<KotlinPublicApiEvidence> {
    override val layer: CompatibilityLayer = CompatibilityLayer.KOTLIN_API

    override fun classify(
        before: KotlinPublicApiEvidence?,
        after: KotlinPublicApiEvidence?,
    ): CompatibilityLayerClassificationResult {
        if (before == null || after == null) return unavailableClassification(layer)
        validationFailure(before)?.let { reason ->
            return unavailableClassification(layer, reason.code, reason.detail)
        }
        validationFailure(after)?.let { reason ->
            return unavailableClassification(layer, reason.code, reason.detail)
        }
        val changes =
            declarationChanges(before, after) +
                propertyChanges(before, after) +
                functionChanges(before, after) +
                enumEntryChanges(before, after)
        return classifiedLayer(layer, changes)
    }

    private fun declarationChanges(
        before: KotlinPublicApiEvidence,
        after: KotlinPublicApiEvidence,
    ): List<CompatibilityChange> =
        changesFor(
            subjectKind = "declaration",
            before =
                before.projection.declarations.map { declaration ->
                    KotlinApiSubject(
                        canonicalSubject = declaration.qualifiedName,
                        fingerprint = declaration.fingerprint(),
                        detail =
                            KotlinApiSubjectDetail.Declaration(
                                kind = declaration.kind,
                                visibility = declaration.visibility,
                                modifiers = declaration.modifiers,
                                typeParameters = declaration.typeParameters,
                                superTypes = declaration.superTypes,
                            ),
                    )
                },
            after =
                after.projection.declarations.map { declaration ->
                    KotlinApiSubject(
                        canonicalSubject = declaration.qualifiedName,
                        fingerprint = declaration.fingerprint(),
                        detail =
                            KotlinApiSubjectDetail.Declaration(
                                kind = declaration.kind,
                                visibility = declaration.visibility,
                                modifiers = declaration.modifiers,
                                typeParameters = declaration.typeParameters,
                                superTypes = declaration.superTypes,
                            ),
                    )
                },
            beforeEvidence = before.evidence,
            afterEvidence = after.evidence,
        )

    private fun propertyChanges(
        before: KotlinPublicApiEvidence,
        after: KotlinPublicApiEvidence,
    ): List<CompatibilityChange> =
        changesFor(
            subjectKind = "property",
            before = before.projection.declarations.flatMap { declaration -> declaration.propertySubjects() },
            after = after.projection.declarations.flatMap { declaration -> declaration.propertySubjects() },
            beforeEvidence = before.evidence,
            afterEvidence = after.evidence,
        )

    private fun functionChanges(
        before: KotlinPublicApiEvidence,
        after: KotlinPublicApiEvidence,
    ): List<CompatibilityChange> =
        changesFor(
            subjectKind = "function",
            before = before.projection.declarations.flatMap { declaration -> declaration.functionSubjects() },
            after = after.projection.declarations.flatMap { declaration -> declaration.functionSubjects() },
            beforeEvidence = before.evidence,
            afterEvidence = after.evidence,
        )

    private fun enumEntryChanges(
        before: KotlinPublicApiEvidence,
        after: KotlinPublicApiEvidence,
    ): List<CompatibilityChange> =
        changesFor(
            subjectKind = "enum-entry",
            before = before.projection.declarations.flatMap { declaration -> declaration.enumEntrySubjects() },
            after = after.projection.declarations.flatMap { declaration -> declaration.enumEntrySubjects() },
            beforeEvidence = before.evidence,
            afterEvidence = after.evidence,
        )

    private fun changesFor(
        subjectKind: String,
        before: List<KotlinApiSubject>,
        after: List<KotlinApiSubject>,
        beforeEvidence: CompatibilityEvidenceReference,
        afterEvidence: CompatibilityEvidenceReference,
    ): List<CompatibilityChange> {
        requireUniqueSubjects(before.map(KotlinApiSubject::canonicalSubject))
        requireUniqueSubjects(after.map(KotlinApiSubject::canonicalSubject))
        return (before.map(KotlinApiSubject::canonicalSubject) + after.map(KotlinApiSubject::canonicalSubject))
            .distinct()
            .sorted()
            .mapNotNull { subject ->
                val previous = before.singleOrNull { it.canonicalSubject == subject }
                val subsequent = after.singleOrNull { it.canonicalSubject == subject }
                if (previous?.fingerprint == subsequent?.fingerprint) {
                    null
                } else {
                    CompatibilityChange(
                        id =
                            CompatibilityChangeId.create(
                                layer = layer,
                                subjectKind = subjectKind,
                                canonicalSubject = subject,
                                beforeFingerprint = previous?.fingerprint,
                                afterFingerprint = subsequent?.fingerprint,
                            ),
                        layer = layer,
                        classification = classificationFor(previous, subsequent),
                        summary = summaryFor(subjectKind, subject, previous, subsequent),
                        evidence = pairedEvidence(beforeEvidence, afterEvidence),
                    )
                }
            }
    }

    /**
     * Classifies one subject's before/after pair.
     *
     * Presence decides the two easy rungs: a subject that did not exist cannot break a caller that could not
     * reference it, and a subject that existed and no longer does breaks every caller that did. The modified
     * case is the one this classifier used to get wrong -- it answered `breaking` for every modification, so a
     * widening and a narrowing produced identical output. [modificationClassification] decides that case from
     * the typed [KotlinApiSubjectDetail] values, and answers [CompatibilityClassification.UNKNOWN] when it can
     * prove neither direction. Per ADR 0013 an `unknown` change forces the aggregate outcome to `incomplete`,
     * which is the honest report; guessing `breaking` is a verdict the evidence does not support.
     */
    private fun classificationFor(
        before: KotlinApiSubject?,
        after: KotlinApiSubject?,
    ): CompatibilityClassification =
        when {
            before == null -> CompatibilityClassification.ADDITIVE
            after == null -> CompatibilityClassification.BREAKING
            else -> modificationClassification(before.detail, after.detail)
        }

    private fun modificationClassification(
        before: KotlinApiSubjectDetail,
        after: KotlinApiSubjectDetail,
    ): CompatibilityClassification =
        when {
            before is KotlinApiSubjectDetail.Property && after is KotlinApiSubjectDetail.Property -> {
                propertyClassification(before.property, after.property)
            }

            before is KotlinApiSubjectDetail.Declaration && after is KotlinApiSubjectDetail.Declaration -> {
                declarationClassification(before, after)
            }

            // A function's canonical subject already carries its whole parameter type list, so a surviving
            // subject can still have changed call-site details such as visibility, parameter names, or
            // defaults. Preserve the direction of the changes that Kotlin defines as widenings.
            before is KotlinApiSubjectDetail.Function && after is KotlinApiSubjectDetail.Function -> {
                functionClassification(before.function, after.function)
            }

            else -> {
                CompatibilityClassification.UNKNOWN
            }
        }

    /**
     * A property is a read position for every consumer, so any change to its type -- widening, narrowing, or
     * nullability in either direction -- invalidates the declared type at the call site. Mutability is the one
     * axis with a provable direction: adding a setter cannot break a reader, removing one breaks every writer.
     */
    private fun propertyClassification(
        before: KotlinApiProperty,
        after: KotlinApiProperty,
    ): CompatibilityClassification {
        if (before.type != after.type) return CompatibilityClassification.BREAKING
        return combineClassifications(
            visibilityClassification(before.visibility, after.visibility),
            when {
                !before.mutable && after.mutable -> CompatibilityClassification.ADDITIVE
                before.mutable && !after.mutable -> CompatibilityClassification.BREAKING
                else -> null
            },
        )
    }

    private fun functionClassification(
        before: KotlinApiFunction,
        after: KotlinApiFunction,
    ): CompatibilityClassification {
        if (
            before.returnType != after.returnType ||
            before.isSuspend != after.isSuspend ||
            before.typeParameters != after.typeParameters ||
            before.receiverType != after.receiverType ||
            before.parameters.size != after.parameters.size
        ) {
            return CompatibilityClassification.BREAKING
        }
        val parameterChanges =
            before.parameters.zip(after.parameters).flatMap { (previous, subsequent) ->
                when {
                    previous.name != subsequent.name ||
                        previous.type != subsequent.type ||
                        previous.isVararg != subsequent.isVararg -> {
                        listOf(CompatibilityClassification.BREAKING)
                    }

                    previous.hasDefaultValue && !subsequent.hasDefaultValue -> {
                        listOf(CompatibilityClassification.BREAKING)
                    }

                    !previous.hasDefaultValue && subsequent.hasDefaultValue -> {
                        listOf(CompatibilityClassification.ADDITIVE)
                    }

                    else -> {
                        emptyList()
                    }
                }
            }
        return combineClassifications(
            visibilityClassification(before.visibility, after.visibility),
            *parameterChanges.toTypedArray(),
        )
    }

    /**
     * Changing what a declaration *is* (a class becoming an interface) or what it is generic over breaks every
     * use of it. Super types are the axis with a provable direction: gaining one cannot break a caller that
     * never referenced it, losing one breaks every caller that upcast to it. A set that both gained and lost
     * members is neither, and is reported [CompatibilityClassification.UNKNOWN] rather than guessed.
     */
    private fun declarationClassification(
        before: KotlinApiSubjectDetail.Declaration,
        after: KotlinApiSubjectDetail.Declaration,
    ): CompatibilityClassification {
        if (before.kind != after.kind || before.typeParameters != after.typeParameters) {
            return CompatibilityClassification.BREAKING
        }
        val removed = before.superTypes.toSet() - after.superTypes.toSet()
        val added = after.superTypes.toSet() - before.superTypes.toSet()
        val superTypeClassification =
            when {
                removed.isNotEmpty() && added.isNotEmpty() -> CompatibilityClassification.UNKNOWN
                removed.isNotEmpty() -> CompatibilityClassification.BREAKING
                added.isNotEmpty() -> CompatibilityClassification.ADDITIVE
                else -> null
            }
        return combineClassifications(
            visibilityClassification(before.visibility, after.visibility),
            modifierClassification(before.modifiers, after.modifiers),
            superTypeClassification,
        )
    }

    private fun visibilityClassification(
        before: String,
        after: String,
    ): CompatibilityClassification? =
        when {
            before == after -> null
            before == "protected" && after == "public" -> CompatibilityClassification.ADDITIVE
            else -> CompatibilityClassification.BREAKING
        }

    private fun modifierClassification(
        before: List<String>,
        after: List<String>,
    ): CompatibilityClassification? {
        val removed = before.toSet() - after.toSet()
        val added = after.toSet() - before.toSet()
        if (removed.isEmpty() && added.isEmpty()) return null
        if ((removed + added).any { it !in DIRECTIONAL_MODIFIERS }) {
            return CompatibilityClassification.BREAKING
        }
        return combineClassifications(
            if ("open" in added || "abstract" in removed || "sealed" in removed) {
                CompatibilityClassification.ADDITIVE
            } else {
                null
            },
            if ("open" in removed || "abstract" in added || "sealed" in added) {
                CompatibilityClassification.BREAKING
            } else {
                null
            },
        )
    }

    private fun combineClassifications(vararg changes: CompatibilityClassification?): CompatibilityClassification {
        val present = changes.filterNotNull()
        return when {
            CompatibilityClassification.BREAKING in present -> CompatibilityClassification.BREAKING
            CompatibilityClassification.UNKNOWN in present -> CompatibilityClassification.UNKNOWN
            CompatibilityClassification.ADDITIVE in present -> CompatibilityClassification.ADDITIVE
            else -> CompatibilityClassification.UNKNOWN
        }
    }

    private val DIRECTIONAL_MODIFIERS = setOf("abstract", "open", "sealed")

    private fun summaryFor(
        subjectKind: String,
        subject: String,
        before: KotlinApiSubject?,
        after: KotlinApiSubject?,
    ): String =
        when {
            before == null -> "Add Kotlin API $subjectKind $subject"
            after == null -> "Remove Kotlin API $subjectKind $subject"
            else -> "Change Kotlin API $subjectKind $subject"
        }

    private fun validationFailure(evidence: KotlinPublicApiEvidence): CompatibilityUnavailableReason? {
        invalidCompatibilityEvidenceReason(listOf(evidence.evidence))?.let { reason -> return reason }
        require(evidence.evidence.kind == "declaration-projection") {
            "Kotlin API evidence must use the declaration-projection evidence kind."
        }
        requireUniqueSubjects(evidence.projection.declarations.map(KotlinApiDeclaration::qualifiedName))
        return null
    }
}

/** A typed public-only projection used as Kotlin API compatibility evidence. */
internal data class KotlinPublicApiEvidence(
    internal val projection: KotlinPublicApiProjection,
    internal val evidence: CompatibilityEvidenceReference,
)

internal data class KotlinPublicApiProjection(
    internal val declarations: List<KotlinApiDeclaration>,
)

internal data class KotlinApiDeclaration(
    internal val qualifiedName: String,
    internal val kind: KotlinApiDeclarationKind,
    internal val visibility: String = "public",
    internal val modifiers: List<String> = emptyList(),
    internal val typeParameters: List<String> = emptyList(),
    internal val superTypes: List<KotlinApiType> = emptyList(),
    internal val properties: List<KotlinApiProperty> = emptyList(),
    internal val functions: List<KotlinApiFunction> = emptyList(),
    internal val enumEntries: List<String> = emptyList(),
) {
    internal fun fingerprint(): String =
        normalizedCompatibilityFingerprint(
            buildString {
                append(kind.wireName)
                append('|').append(visibility)
                append('|').append(modifiers.sorted().joinToString(","))
                append('|').append(typeParameters.joinToString(","))
                append('|').append(superTypes.map(KotlinApiType::canonicalText).sorted().joinToString(","))
            },
        )

    internal fun propertySubjects(): List<KotlinApiSubject> =
        properties.map { property ->
            KotlinApiSubject(
                canonicalSubject = "$qualifiedName#${property.name}",
                fingerprint =
                    normalizedCompatibilityFingerprint(
                        "${property.type.canonicalText()}|${property.mutable}|${property.visibility}",
                    ),
                detail = KotlinApiSubjectDetail.Property(property),
            )
        }

    internal fun functionSubjects(): List<KotlinApiSubject> =
        functions.map { function ->
            KotlinApiSubject(
                canonicalSubject =
                    "$qualifiedName#${function.receiverType?.canonicalText()?.plus(".").orEmpty()}" +
                        "${function.name}(${function.parameters.joinToString(",") { parameter ->
                            parameter.type.canonicalText()
                        }})",
                fingerprint = function.fingerprint(),
                detail = KotlinApiSubjectDetail.Function(function),
            )
        }

    internal fun enumEntrySubjects(): List<KotlinApiSubject> =
        enumEntries.mapIndexed { index, entry ->
            KotlinApiSubject(
                canonicalSubject = "$qualifiedName#$entry",
                fingerprint = normalizedCompatibilityFingerprint("$index:$entry"),
                detail = KotlinApiSubjectDetail.EnumEntry,
            )
        }
}

internal enum class KotlinApiDeclarationKind(
    internal val wireName: String,
) {
    CLASS("class"),
    INTERFACE("interface"),
    OBJECT("object"),
    ENUM("enum"),
    SEALED_INTERFACE("sealed-interface"),
}

internal data class KotlinApiProperty(
    internal val name: String,
    internal val type: KotlinApiType,
    internal val mutable: Boolean,
    internal val visibility: String = "public",
)

internal data class KotlinApiFunction(
    internal val name: String,
    internal val parameters: List<KotlinApiParameter>,
    internal val returnType: KotlinApiType,
    internal val isSuspend: Boolean,
    internal val typeParameters: List<String> = emptyList(),
    internal val visibility: String = "public",
    internal val receiverType: KotlinApiType? = null,
) {
    internal fun fingerprint(): String =
        normalizedCompatibilityFingerprint(
            buildString {
                append(returnType.canonicalText())
                append('|').append(visibility)
                append('|').append(receiverType?.canonicalText().orEmpty())
                append('|').append(isSuspend)
                append('|').append(typeParameters.joinToString(","))
                parameters.forEach { parameter ->
                    append('|').append(parameter.name)
                    append(':').append(parameter.type.canonicalText())
                    append(':').append(parameter.hasDefaultValue)
                    append(':').append(parameter.isVararg)
                }
            },
        )
}

internal data class KotlinApiParameter(
    internal val name: String,
    internal val type: KotlinApiType,
    internal val hasDefaultValue: Boolean,
    internal val isVararg: Boolean = false,
)

internal data class KotlinApiType(
    internal val packageName: String,
    internal val simpleName: String,
    internal val arguments: List<KotlinApiType> = emptyList(),
    internal val nullable: Boolean = false,
) {
    internal fun canonicalText(): String =
        buildString {
            append(packageName).append('.').append(simpleName)
            if (arguments.isNotEmpty()) {
                append('<').append(arguments.joinToString(",") { argument -> argument.canonicalText() }).append('>')
            }
            if (nullable) append('?')
        }
}

internal data class KotlinApiSubject(
    internal val canonicalSubject: String,
    internal val fingerprint: String,
    internal val detail: KotlinApiSubjectDetail,
)

/**
 * The typed before/after payload a subject carries so [KotlinApiCompatibilityClassifier] can classify a
 * *modification* rather than only an addition or a removal.
 *
 * A fingerprint answers "did this subject change?" and nothing more. Deciding whether a change widened the API
 * or narrowed it needs the values themselves, which is why the subject carries them alongside the fingerprint
 * instead of the classifier re-deriving them from text.
 */
internal sealed interface KotlinApiSubjectDetail {
    data class Declaration(
        internal val kind: KotlinApiDeclarationKind,
        internal val visibility: String,
        internal val modifiers: List<String>,
        internal val typeParameters: List<String>,
        internal val superTypes: List<KotlinApiType>,
    ) : KotlinApiSubjectDetail

    data class Property(
        internal val property: KotlinApiProperty,
    ) : KotlinApiSubjectDetail

    data class Function(
        internal val function: KotlinApiFunction,
    ) : KotlinApiSubjectDetail

    /**
     * An entry's canonical subject is its own name, so an entry can only appear or disappear -- there is no
     * modified case to classify.
     */
    data object EnumEntry : KotlinApiSubjectDetail
}
