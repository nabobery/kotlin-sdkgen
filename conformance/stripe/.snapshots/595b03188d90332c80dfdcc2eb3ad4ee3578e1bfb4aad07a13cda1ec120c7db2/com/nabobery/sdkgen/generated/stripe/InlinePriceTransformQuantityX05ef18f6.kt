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

public enum class InlinePriceTransformQuantityX05ef18f6Branch {
    TransformQuantity,
}

public sealed class InlinePriceTransformQuantityX05ef18f6DecodingException(
    message: String,
) : SerializationException(message)

public class InlinePriceTransformQuantityX05ef18f6NoMatchException(
    message: String,
) : InlinePriceTransformQuantityX05ef18f6DecodingException(message)

internal data class InlinePriceTransformQuantityX05ef18f6Inspection(
    public val matchesTransformQuantity: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesTransformQuantity).count { it }
}

/**
 * Apply a transformation to the reported usage or set quantity before computing the amount billed. Cannot be combined
 * with `tiers`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/price/properties/transform_quantity
 */
@Serializable(with = InlinePriceTransformQuantityX05ef18f6.Serializer::class)
public class InlinePriceTransformQuantityX05ef18f6 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePriceTransformQuantityX05ef18f6Inspection,
) {
    public val transformQuantity: TransformQuantityView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesTransformQuantity) json.decodeFromJsonElement<TransformQuantityView>(raw) else null
        }

    public val matchedBranches: Set<InlinePriceTransformQuantityX05ef18f6Branch>
        get() =
            buildSet {
                if (inspection.matchesTransformQuantity) {
                    add(
                        InlinePriceTransformQuantityX05ef18f6Branch.TransformQuantity,
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
        ): InlinePriceTransformQuantityX05ef18f6 {
            val inspection = inspectInlinePriceTransformQuantityX05ef18f6(raw)
            if (inspection.matchCount == 0) {
                throw InlinePriceTransformQuantityX05ef18f6NoMatchException(
                    "InlinePriceTransformQuantityX05ef18f6 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlinePriceTransformQuantityX05ef18f6(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePriceTransformQuantityX05ef18f6> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePriceTransformQuantityX05ef18f6 {
            val jsonDecoder = decoder.requireJsonDecoder("InlinePriceTransformQuantityX05ef18f6")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePriceTransformQuantityX05ef18f6,
        ) {
            encoder.requireJsonEncoder("InlinePriceTransformQuantityX05ef18f6").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePriceTransformQuantityX05ef18f6(
    element: JsonElement,
): InlinePriceTransformQuantityX05ef18f6Inspection {
    val raw =
        element as? JsonObject ?: return InlinePriceTransformQuantityX05ef18f6Inspection(
            matchesTransformQuantity = false,
            failures = listOf("TransformQuantity: expected JSON object"),
        )
    val matchesTransformQuantity = raw["divide_by"] != null && raw["round"] != null
    return InlinePriceTransformQuantityX05ef18f6Inspection(
        matchesTransformQuantity = matchesTransformQuantity,
        failures =
            buildList {
                if (!matchesTransformQuantity) {
                    add(
                        "TransformQuantity: required properties 'divide_by', 'round' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
