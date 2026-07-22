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

public enum class InlinePersonAdditionalTosAcceptancesAccountX74bb852fBranch {
    PersonAdditionalTosAcceptance,
}

public sealed class InlinePersonAdditionalTosAcceptancesAccountX74bb852fDecodingException(
    message: String,
) : SerializationException(message)

public class InlinePersonAdditionalTosAcceptancesAccountX74bb852fNoMatchException(
    message: String,
) : InlinePersonAdditionalTosAcceptancesAccountX74bb852fDecodingException(message)

internal data class InlinePersonAdditionalTosAcceptancesAccountX74bb852fInspection(
    public val matchesPersonAdditionalTosAcceptance: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesPersonAdditionalTosAcceptance).count { it }
}

/**
 * Details on the legal guardian's acceptance of the main Stripe service agreement.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/person_additional_tos_acceptances/properties/account
 */
@Serializable(with = InlinePersonAdditionalTosAcceptancesAccountX74bb852f.Serializer::class)
public class InlinePersonAdditionalTosAcceptancesAccountX74bb852f internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePersonAdditionalTosAcceptancesAccountX74bb852fInspection,
) {
    public val personAdditionalTosAcceptance: PersonAdditionalTosAcceptanceView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesPersonAdditionalTosAcceptance) {
                json
                    .decodeFromJsonElement<PersonAdditionalTosAcceptanceView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlinePersonAdditionalTosAcceptancesAccountX74bb852fBranch>
        get() =
            buildSet {
                if (inspection.matchesPersonAdditionalTosAcceptance) {
                    add(
                        InlinePersonAdditionalTosAcceptancesAccountX74bb852fBranch.PersonAdditionalTosAcceptance,
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
        ): InlinePersonAdditionalTosAcceptancesAccountX74bb852f {
            val inspection = inspectInlinePersonAdditionalTosAcceptancesAccountX74bb852f(raw)
            if (inspection.matchCount == 0) {
                throw InlinePersonAdditionalTosAcceptancesAccountX74bb852fNoMatchException(
                    "InlinePersonAdditionalTosAcceptancesAccountX74bb852f matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlinePersonAdditionalTosAcceptancesAccountX74bb852f(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePersonAdditionalTosAcceptancesAccountX74bb852f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePersonAdditionalTosAcceptancesAccountX74bb852f {
            val jsonDecoder = decoder.requireJsonDecoder("InlinePersonAdditionalTosAcceptancesAccountX74bb852f")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePersonAdditionalTosAcceptancesAccountX74bb852f,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlinePersonAdditionalTosAcceptancesAccountX74bb852f",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePersonAdditionalTosAcceptancesAccountX74bb852f(
    element: JsonElement,
): InlinePersonAdditionalTosAcceptancesAccountX74bb852fInspection {
    val raw =
        element as? JsonObject ?: return InlinePersonAdditionalTosAcceptancesAccountX74bb852fInspection(
            matchesPersonAdditionalTosAcceptance = false,
            failures = listOf("PersonAdditionalTosAcceptance: expected JSON object"),
        )
    val matchesPersonAdditionalTosAcceptance = true
    return InlinePersonAdditionalTosAcceptancesAccountX74bb852fInspection(
        matchesPersonAdditionalTosAcceptance = matchesPersonAdditionalTosAcceptance,
        failures =
            buildList {
                if (!matchesPersonAdditionalTosAcceptance) {
                    add(
                        "PersonAdditionalTosAcceptance: required properties  do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
