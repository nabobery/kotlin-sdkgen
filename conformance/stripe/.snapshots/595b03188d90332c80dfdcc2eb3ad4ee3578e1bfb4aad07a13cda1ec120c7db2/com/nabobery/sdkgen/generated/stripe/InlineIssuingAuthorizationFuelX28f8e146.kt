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

public enum class InlineIssuingAuthorizationFuelX28f8e146Branch {
    IssuingAuthorizationFuelData,
}

public sealed class InlineIssuingAuthorizationFuelX28f8e146DecodingException(
    message: String,
) : SerializationException(message)

public class InlineIssuingAuthorizationFuelX28f8e146NoMatchException(
    message: String,
) : InlineIssuingAuthorizationFuelX28f8e146DecodingException(message)

internal data class InlineIssuingAuthorizationFuelX28f8e146Inspection(
    public val matchesIssuingAuthorizationFuelData: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesIssuingAuthorizationFuelData).count { it }
}

/**
 * Information about fuel that was purchased with this transaction. Typically this information is received from the
 * merchant after the authorization has been approved and the fuel dispensed.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.authorization/properties/fuel
 */
@Serializable(with = InlineIssuingAuthorizationFuelX28f8e146.Serializer::class)
public class InlineIssuingAuthorizationFuelX28f8e146 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineIssuingAuthorizationFuelX28f8e146Inspection,
) {
    public val issuingAuthorizationFuelData: IssuingAuthorizationFuelDataView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesIssuingAuthorizationFuelData) {
                json
                    .decodeFromJsonElement<IssuingAuthorizationFuelDataView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineIssuingAuthorizationFuelX28f8e146Branch>
        get() =
            buildSet {
                if (inspection.matchesIssuingAuthorizationFuelData) {
                    add(
                        InlineIssuingAuthorizationFuelX28f8e146Branch.IssuingAuthorizationFuelData,
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
        ): InlineIssuingAuthorizationFuelX28f8e146 {
            val inspection = inspectInlineIssuingAuthorizationFuelX28f8e146(raw)
            if (inspection.matchCount == 0) {
                throw InlineIssuingAuthorizationFuelX28f8e146NoMatchException(
                    "InlineIssuingAuthorizationFuelX28f8e146 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineIssuingAuthorizationFuelX28f8e146(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineIssuingAuthorizationFuelX28f8e146> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineIssuingAuthorizationFuelX28f8e146 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingAuthorizationFuelX28f8e146")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineIssuingAuthorizationFuelX28f8e146,
        ) {
            encoder.requireJsonEncoder("InlineIssuingAuthorizationFuelX28f8e146").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineIssuingAuthorizationFuelX28f8e146(
    element: JsonElement,
): InlineIssuingAuthorizationFuelX28f8e146Inspection {
    val raw =
        element as? JsonObject ?: return InlineIssuingAuthorizationFuelX28f8e146Inspection(
            matchesIssuingAuthorizationFuelData = false,
            failures = listOf("IssuingAuthorizationFuelData: expected JSON object"),
        )
    val matchesIssuingAuthorizationFuelData = true
    return InlineIssuingAuthorizationFuelX28f8e146Inspection(
        matchesIssuingAuthorizationFuelData = matchesIssuingAuthorizationFuelData,
        failures =
            buildList {
                if (!matchesIssuingAuthorizationFuelData) {
                    add(
                        "IssuingAuthorizationFuelData: required properties  do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
