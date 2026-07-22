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

public enum class InlineCustomerShippingXa88b4f3fBranch {
    Shipping,
}

public sealed class InlineCustomerShippingXa88b4f3fDecodingException(
    message: String,
) : SerializationException(message)

public class InlineCustomerShippingXa88b4f3fNoMatchException(
    message: String,
) : InlineCustomerShippingXa88b4f3fDecodingException(message)

internal data class InlineCustomerShippingXa88b4f3fInspection(
    public val matchesShipping: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesShipping).count { it }
}

/**
 * Mailing and shipping address for the customer. Appears on invoices emailed to this customer.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/customer/properties/shipping
 */
@Serializable(with = InlineCustomerShippingXa88b4f3f.Serializer::class)
public class InlineCustomerShippingXa88b4f3f internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineCustomerShippingXa88b4f3fInspection,
) {
    public val shipping: ShippingView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesShipping) json.decodeFromJsonElement<ShippingView>(raw) else null
        }

    public val matchedBranches: Set<InlineCustomerShippingXa88b4f3fBranch>
        get() =
            buildSet {
                if (inspection.matchesShipping) add(InlineCustomerShippingXa88b4f3fBranch.Shipping)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineCustomerShippingXa88b4f3f {
            val inspection = inspectInlineCustomerShippingXa88b4f3f(raw)
            if (inspection.matchCount == 0) {
                throw InlineCustomerShippingXa88b4f3fNoMatchException(
                    "InlineCustomerShippingXa88b4f3f matched 0 branches: " + inspection.failures.joinToString("; "),
                )
            }
            return InlineCustomerShippingXa88b4f3f(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineCustomerShippingXa88b4f3f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineCustomerShippingXa88b4f3f {
            val jsonDecoder = decoder.requireJsonDecoder("InlineCustomerShippingXa88b4f3f")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineCustomerShippingXa88b4f3f,
        ) {
            encoder.requireJsonEncoder("InlineCustomerShippingXa88b4f3f").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineCustomerShippingXa88b4f3f(element: JsonElement): InlineCustomerShippingXa88b4f3fInspection {
    val raw =
        element as? JsonObject ?: return InlineCustomerShippingXa88b4f3fInspection(
            matchesShipping = false,
            failures = listOf("Shipping: expected JSON object"),
        )
    val matchesShipping = true
    return InlineCustomerShippingXa88b4f3fInspection(
        matchesShipping = matchesShipping,
        failures =
            buildList {
                if (!matchesShipping) add("Shipping: required properties  do not match their declared types")
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
