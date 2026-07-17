@file:Suppress("ktlint:standard:max-line-length")

package com.nabobery.sdkgen.engine.declarations

private const val GENERATED_PACKAGE = "com.nabobery.sdkgen.generated"

internal fun goldenSliceModel(): KotlinDeclarationModel {
    val string = KotlinTypeRef("kotlin", "String")
    val int = KotlinTypeRef("kotlin", "Int")
    val double = KotlinTypeRef("kotlin", "Double")
    val chatMessageList =
        KotlinTypeRef(
            "kotlin.collections",
            "List",
            listOf(KotlinTypeRef(GENERATED_PACKAGE, "ChatMessage")),
        )
    return KotlinDeclarationModel(
        files =
            listOf(
                KotlinFileDeclaration(
                    GENERATED_PACKAGE,
                    "FieldPresence",
                    listOf(
                        SupportDeclaration(
                            "support:field-presence",
                            0,
                            GENERATED_PACKAGE,
                            "FieldPresence",
                            "FieldPresence",
                            "Wire presence of a property, independent of Kotlin nullability.",
                            SupportKind.FieldPresence,
                        ),
                    ),
                ),
                KotlinFileDeclaration(
                    GENERATED_PACKAGE,
                    "SerializationSupport",
                    listOf(
                        SupportDeclaration(
                            "support:serialization",
                            0,
                            GENERATED_PACKAGE,
                            "SerializationSupport",
                            "SerializationSupport",
                            "SDK-owned JSON behavior and JSON-only serializer guards.",
                            SupportKind.Serialization,
                        ),
                    ),
                ),
                KotlinFileDeclaration(
                    GENERATED_PACKAGE,
                    "ProviderSort",
                    listOf(
                        OpenEnumDeclaration(
                            "schema:ProviderSort",
                            0,
                            GENERATED_PACKAGE,
                            "ProviderSort",
                            "ProviderSort",
                            "Forward-compatible provider ordering. Unknown strings remain intact.",
                            listOf(
                                EnumValueDeclaration(
                                    "schema:ProviderSort/price",
                                    0,
                                    "Price",
                                    "price",
                                    "Sort by price.",
                                ),
                                EnumValueDeclaration(
                                    "schema:ProviderSort/throughput",
                                    1,
                                    "Throughput",
                                    "throughput",
                                    "Sort by throughput.",
                                ),
                                EnumValueDeclaration(
                                    "schema:ProviderSort/latency",
                                    2,
                                    "Latency",
                                    "latency",
                                    "Sort by latency.",
                                ),
                            ),
                        ),
                    ),
                ),
                KotlinFileDeclaration(
                    GENERATED_PACKAGE,
                    "ChatContent",
                    listOf(
                        OneOfDeclaration(
                            "schema:ChatContent",
                            0,
                            GENERATED_PACKAGE,
                            "ChatContent",
                            "ChatContent",
                            "Closed non-discriminated oneOf. Exactly one branch must structurally match.",
                            listOf(
                                OneOfCaseDeclaration(
                                    "schema:ChatContent/Text",
                                    0,
                                    "Text",
                                    listOf(UnionFieldDeclaration("text", "text", string)),
                                ),
                                OneOfCaseDeclaration(
                                    "schema:ChatContent/Image",
                                    1,
                                    "Image",
                                    listOf(UnionFieldDeclaration("imageUrl", "image_url", string)),
                                ),
                                OneOfCaseDeclaration(
                                    "schema:ChatContent/Audio",
                                    2,
                                    "Audio",
                                    listOf(
                                        UnionFieldDeclaration("audioData", "audio_data", string),
                                        UnionFieldDeclaration("format", "format", string),
                                    ),
                                ),
                            ),
                        ),
                    ),
                ),
                KotlinFileDeclaration(
                    GENERATED_PACKAGE,
                    "MessageMetadataAnyOf",
                    listOf(
                        AnyOfDeclaration(
                            "schema:MessageMetadataAnyOf",
                            0,
                            GENERATED_PACKAGE,
                            "MessageMetadataAnyOf",
                            "MessageMetadataAnyOf",
                            "Lossless anyOf wrapper. Retained raw JSON is the sole serialization authority.",
                            listOf(
                                AnyOfBranchDeclaration(
                                    "schema:MessageMetadataAnyOf/Citations",
                                    0,
                                    "Citations",
                                    "citations",
                                    listOf(
                                        UnionFieldDeclaration(
                                            "citations",
                                            "citations",
                                            KotlinTypeRef("kotlin.collections", "List", listOf(string)),
                                        ),
                                    ),
                                    viewTypeName = "CitationMetadata",
                                ),
                                AnyOfBranchDeclaration(
                                    "schema:MessageMetadataAnyOf/CacheControl",
                                    1,
                                    "CacheControl",
                                    "cache",
                                    listOf(UnionFieldDeclaration("cacheControl", "cache_control", string)),
                                    viewTypeName = "CacheMetadata",
                                ),
                            ),
                            branchEnumName = "MessageMetadataBranch",
                            inspectionName = "MetadataInspection",
                        ),
                    ),
                ),
                KotlinFileDeclaration(
                    GENERATED_PACKAGE,
                    "ChatRequest",
                    listOf(
                        ModelDeclaration(
                            "schema:ChatRequest",
                            0,
                            GENERATED_PACKAGE,
                            "ChatRequest",
                            "ChatRequest",
                            "Immutable chat request with exact absent, present-null, and present-value semantics. 100% generated; unsafe KDoc terminators like */ are sanitized.",
                            listOf(
                                FieldDeclaration(
                                    "schema:ChatRequest/model",
                                    0,
                                    "model",
                                    "model",
                                    string,
                                    true,
                                    false,
                                    "Model identifier.",
                                ),
                                FieldDeclaration(
                                    "schema:ChatRequest/messages",
                                    1,
                                    "messages",
                                    "messages",
                                    chatMessageList,
                                    true,
                                    false,
                                    "Ordered messages.",
                                ),
                                FieldDeclaration(
                                    "schema:ChatRequest/session_id",
                                    2,
                                    "sessionId",
                                    "session_id",
                                    string,
                                    true,
                                    true,
                                    "Required nullable session identifier.",
                                ),
                                FieldDeclaration(
                                    "schema:ChatRequest/temperature",
                                    3,
                                    "temperature",
                                    "temperature",
                                    double,
                                    false,
                                    true,
                                    "Optional nullable temperature.",
                                ),
                                FieldDeclaration(
                                    "schema:ChatRequest/max_tokens",
                                    4,
                                    "maxTokens",
                                    "max_tokens",
                                    int,
                                    false,
                                    false,
                                    "Optional non-null token limit.",
                                ),
                            ),
                            dslFunctionName = "chatRequest",
                            auxiliaryModels =
                                listOf(
                                    SimpleModelDeclaration(
                                        resolvedName = "ChatMessage",
                                        kdoc = "One chat message.",
                                        fields =
                                            listOf(
                                                SimpleFieldDeclaration("role", "role", string, "Message role."),
                                                SimpleFieldDeclaration(
                                                    "content",
                                                    "content",
                                                    KotlinTypeRef(GENERATED_PACKAGE, "ChatContent"),
                                                    "Message content.",
                                                ),
                                            ),
                                    ),
                                ),
                        ),
                    ),
                ),
            ),
    )
}
