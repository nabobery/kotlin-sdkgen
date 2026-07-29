package com.nabobery.sdkgen.engine.declarations

/**
 * Computes a SHA-256 digest over a normalized "public Kotlin API projection" of this model: declaration
 * signatures only, per ADR 0013 ("Manifest transition and bounded input" / `kotlinApiSha256`).
 *
 * This projection intentionally omits everything [KotlinDeclarationModel.digest] includes that is not part
 * of the public Kotlin API surface:
 * - KDoc text ([Declaration.kdoc] and every nested `kdoc` field) never enters this text at all;
 * - declaration, field, property, function, case, branch, and enum-entry order is replaced with a sort by
 *   name before this text is built, so reordering members in the emitted source cannot move this digest;
 * - codec property/constant/id names ([OperationDeclaration.requestCodecPropertyName] and siblings) are
 *   never read here, so renaming or restructuring internal codec wiring cannot move this digest either.
 *
 * The [KotlinApiCompatibilityClassifier] canonical-subject grammar mirrors this same declaration/property/
 * function/enum-entry shape (see that file's KDoc), so this projection's structure is not an independent
 * design: it is the writer-side counterpart of what the classifier already treats as "the public API."
 */
internal fun KotlinDeclarationModel.kotlinApiProjectionDigest(): String =
    sha256Hex(kotlinApiProjectionText().encodeToByteArray())

private fun KotlinDeclarationModel.kotlinApiProjectionText(): String =
    buildString {
        files
            .flatMap(KotlinFileDeclaration::declarations)
            .sortedBy { declaration -> "${declaration.packageName}.${declaration.resolvedName}" }
            .forEach { declaration -> append(declaration.apiProjectionText()).append('\n') }
    }

private fun Declaration.apiProjectionText(): String =
    buildString {
        append("declaration|")
            .append(packageName)
            .append('.')
            .append(resolvedName)
            .append('|')
        when (this@apiProjectionText) {
            is ModelDeclaration -> {
                append("model|dsl:").append(dslFunctionName)
                fields.sortedBy(FieldDeclaration::resolvedName).forEach { field ->
                    append("|field:")
                        .append(field.resolvedName)
                        .append(':')
                        .append(field.wireName)
                        .append(':')
                        .append(field.type.apiTypeText())
                        .append(':')
                        .append(field.required)
                        .append(':')
                        .append(field.nullable)
                }
                additionalProperties?.let { additional ->
                    append("|additional:")
                        .append(additional.resolvedName)
                        .append(':')
                        .append(additional.valueType.apiTypeText())
                        .append(':')
                        .append(additional.valuesAreJsonElements)
                }
                auxiliaryModels.sortedBy(SimpleModelDeclaration::resolvedName).forEach { auxiliary ->
                    append("|aux:").append(auxiliary.resolvedName)
                    auxiliary.fields.sortedBy(SimpleFieldDeclaration::resolvedName).forEach { field ->
                        append("|aux-field:")
                            .append(field.resolvedName)
                            .append(':')
                            .append(field.wireName)
                            .append(':')
                            .append(field.type.apiTypeText())
                    }
                }
            }

            is OpenEnumDeclaration -> {
                append("enum")
                values.sortedBy(EnumValueDeclaration::resolvedName).forEach { value ->
                    append("|value:").append(value.resolvedName).append(':').append(value.wireValue)
                }
            }

            is OneOfDeclaration -> {
                append("oneof")
                cases.sortedBy(OneOfCaseDeclaration::resolvedName).forEach { case ->
                    append("|case:").append(case.resolvedName)
                    case.requiredFields.sortedBy(UnionFieldDeclaration::resolvedName).forEach { field ->
                        append(":req=").append(field.resolvedName).append(':').append(field.type.apiTypeText())
                    }
                }
            }

            is PrimitiveOneOfDeclaration -> {
                append("primitive-oneof")
                cases.sortedBy(PrimitiveOneOfCaseDeclaration::resolvedName).forEach { case ->
                    append("|case:").append(case.resolvedName).append(':').append(case.type.apiTypeText())
                }
            }

            is AnyOfDeclaration -> {
                append("anyof|branch-enum:")
                    .append(branchEnumName)
                    .append("|inspection:")
                    .append(inspectionName)
                branches.sortedBy(AnyOfBranchDeclaration::resolvedName).forEach { branch ->
                    append("|branch:")
                        .append(branch.resolvedName)
                        .append(':')
                        .append(branch.propertyName)
                        .append(':')
                        .append(branch.shape)
                        .append(':')
                        .append(branch.type?.apiTypeText().orEmpty())
                        .append(':')
                        .append(branch.viewTypeName)
                    branch.fields.sortedBy(UnionFieldDeclaration::resolvedName).forEach { field ->
                        append(":field=").append(field.resolvedName).append(':').append(field.type.apiTypeText())
                    }
                }
            }

            is SupportDeclaration -> {
                append("support|").append(kind)
            }

            is OperationClientDeclaration -> {
                append("operation-client")
                subClients.sortedBy(OperationClientGroupRef::accessorName).forEach { subClient ->
                    append("|sub-client:")
                        .append(subClient.packageName)
                        .append(':')
                        .append(subClient.className)
                        .append(':')
                        .append(subClient.accessorName)
                }
                operations.sortedBy(OperationDeclaration::operationId).forEach { operation ->
                    append("|operation:")
                        .append(operation.operationId)
                        .append(':')
                        .append(operation.method)
                        .append(':')
                        .append(operation.path)
                        .append(':')
                        .append(operation.requestType.apiTypeText())
                        .append(':')
                        .append(operation.responseType.apiTypeText())
                        .append(':')
                        .append(operation.responseMode)
                        .append(':')
                        .append(operation.requestBodyRequired)
                    operation.parameters.sortedBy(OperationParameterDeclaration::name).forEach { parameter ->
                        append("|parameter:")
                            .append(parameter.name)
                            .append(':')
                            .append(parameter.location)
                            .append(':')
                            .append(parameter.type.apiTypeText())
                            .append(':')
                            .append(parameter.required)
                    }
                    operation.requestBodyAlternatives
                        .sortedBy(OperationRequestBodyAlternative::mediaType)
                        .forEach { alternative ->
                            append("|request-body:")
                                .append(alternative.mediaType)
                                .append(':')
                                .append(alternative.type.apiTypeText())
                                .append(':')
                                .append(alternative.required)
                        }
                    operation.responseAlternatives
                        .sortedBy { alternative -> alternative.selector.toString() }
                        .forEach { alternative ->
                            append("|response-alternative:")
                                .append(alternative.selector)
                                .append(':')
                                .append(alternative.type.apiTypeText())
                                .append(':')
                                .append(alternative.mode)
                        }
                }
            }
        }
    }

private fun KotlinTypeRef.apiTypeText(): String =
    buildString {
        append(packageName).append('.').append(simpleName)
        if (arguments.isNotEmpty()) {
            append('<').append(arguments.joinToString(",") { argument -> argument.apiTypeText() }).append('>')
        }
        if (nullable) append('?')
    }
