package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineLegalEntityCompanyRepresentativeDeclarationXb8056469Branch {
    LegalEntityRepresentativeDeclaration,
}

public sealed class InlineLegalEntityCompanyRepresentativeDeclarationXb8056469DecodingException(
    message: String,
) : SerializationException(message)

public class InlineLegalEntityCompanyRepresentativeDeclarationXb8056469NoMatchException(
    message: String,
) : InlineLegalEntityCompanyRepresentativeDeclarationXb8056469DecodingException(message)

internal data class InlineLegalEntityCompanyRepresentativeDeclarationXb8056469Inspection(
    public val matchesLegalEntityRepresentativeDeclaration: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesLegalEntityRepresentativeDeclaration).count { it }
}

/**
 * This hash is used to attest that the representative is authorized to act as the representative of their legal entity.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/legal_entity_company/properties/representative_declaration
 */
@Serializable(with = InlineLegalEntityCompanyRepresentativeDeclarationXb8056469.Serializer::class)
public class InlineLegalEntityCompanyRepresentativeDeclarationXb8056469 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineLegalEntityCompanyRepresentativeDeclarationXb8056469Inspection,
) {
    public val legalEntityRepresentativeDeclaration: LegalEntityRepresentativeDeclarationView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesLegalEntityRepresentativeDeclaration) {
                json
                    .decodeFromJsonElement<LegalEntityRepresentativeDeclarationView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineLegalEntityCompanyRepresentativeDeclarationXb8056469Branch>
        get() =
            buildSet {
                if (inspection.matchesLegalEntityRepresentativeDeclaration) {
                    add(
                        InlineLegalEntityCompanyRepresentativeDeclarationXb8056469Branch.LegalEntityRepresentativeDeclaration,
                    )
                }
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineLegalEntityCompanyRepresentativeDeclarationXb8056469 {
            val inspection = inspectInlineLegalEntityCompanyRepresentativeDeclarationXb8056469(raw)
            if (inspection.matchCount == 0) {
                throw InlineLegalEntityCompanyRepresentativeDeclarationXb8056469NoMatchException(
                    "InlineLegalEntityCompanyRepresentativeDeclarationXb8056469 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineLegalEntityCompanyRepresentativeDeclarationXb8056469(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineLegalEntityCompanyRepresentativeDeclarationXb8056469> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineLegalEntityCompanyRepresentativeDeclarationXb8056469 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineLegalEntityCompanyRepresentativeDeclarationXb8056469")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineLegalEntityCompanyRepresentativeDeclarationXb8056469,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineLegalEntityCompanyRepresentativeDeclarationXb8056469",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineLegalEntityCompanyRepresentativeDeclarationXb8056469(
    element: JsonElement,
): InlineLegalEntityCompanyRepresentativeDeclarationXb8056469Inspection {
    val raw =
        element as? JsonObject ?: return InlineLegalEntityCompanyRepresentativeDeclarationXb8056469Inspection(
            matchesLegalEntityRepresentativeDeclaration = false,
            failures = listOf("LegalEntityRepresentativeDeclaration: expected JSON object"),
        )
    val matchesLegalEntityRepresentativeDeclaration = true
    return InlineLegalEntityCompanyRepresentativeDeclarationXb8056469Inspection(
        matchesLegalEntityRepresentativeDeclaration = matchesLegalEntityRepresentativeDeclaration,
        failures =
            buildList {
                if (!matchesLegalEntityRepresentativeDeclaration) {
                    add(
                        "LegalEntityRepresentativeDeclaration: required properties  do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
