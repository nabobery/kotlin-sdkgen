package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations~1{authorization}~1finalize_amount/pos
 * t/requestBody/content/application~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations~1{authorization}~1finalize_amount/pos
 * t/requestBody/content/application~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1TestHelpersIssuingAuthorizationsFinalizeAmountPostRequestFormXffccad04.Serializer::class)
public class InlineV1TestHelpersIssuingAuthorizationsFinalizeAmountPostRequestFormXffccad04(
    /**
     * The final authorization amount that will be captured by the merchant. This amount is in the authorization currency
     * and in the [smallest currency unit](https://docs.stripe.com/currencies#zero-decimal).
     */
    public val finalAmount: Int,
    /**
     * Specifies which fields in the response should be expanded.
     */
    public val expand: List<String>? = null,
    /**
     * Fleet-specific information for authorizations using Fleet cards.
     */
    public val fleet: InlineV1TestHelpersIssuing6a15PostRequestFormFleetXf18649be? = null,
    /**
     * Information about fuel that was purchased with this transaction.
     */
    public val fuel: InlineV1TestHelpersIssuing6a15PostRequestFormFuelX5df6fa3d? = null,
) {
    public class Builder {
        private var finalAmountValue: Int? = null

        public var finalAmount: Int
            get() = requireNotNull(finalAmountValue) { "finalAmount is required" }
            set(`value`) {
                finalAmountValue = value
            }

        /**
         * Specifies which fields in the response should be expanded.
         */
        public var expand: List<String>? = null

        /**
         * Fleet-specific information for authorizations using Fleet cards.
         */
        public var fleet: InlineV1TestHelpersIssuing6a15PostRequestFormFleetXf18649be? = null

        /**
         * Information about fuel that was purchased with this transaction.
         */
        public var fuel: InlineV1TestHelpersIssuing6a15PostRequestFormFuelX5df6fa3d? = null

        public fun build(): InlineV1TestHelpersIssuingAuthorizationsFinalizeAmountPostRequestFormXffccad04 {
            check(finalAmountValue != null) { "finalAmount is required" }
            return InlineV1TestHelpersIssuingAuthorizationsFinalizeAmountPostRequestFormXffccad04(
                finalAmount = finalAmount,
                expand = expand,
                fleet = fleet,
                fuel = fuel,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TestHelpersIssuingAuthorizationsFinalizeAmountPostRequestFormXffccad04 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TestHelpersIssuingAuthorizationsFinalizeAmountPostRequestFormXffccad04> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TestHelpersIssuingAuthorizationsFinalizeAmountPostRequestFormXffccad04 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TestHelpersIssuingAuthorizationsFinalizeAmountPostRequestFormXffccad04",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TestHelpersIssuingAuthorizationsFinalizeAmountPostRequestFormXffccad04 must be a JSON object",
                    )
            val finalAmount = json.decodeRequired<Int>(rawObject, "final_amount")
            return InlineV1TestHelpersIssuingAuthorizationsFinalizeAmountPostRequestFormXffccad04(
                finalAmount = finalAmount,
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
                fleet =
                    rawObject["fleet"]?.let {
                        json.decodeFromJsonElement<InlineV1TestHelpersIssuing6a15PostRequestFormFleetXf18649be>(it)
                    },
                fuel =
                    rawObject["fuel"]?.let {
                        json.decodeFromJsonElement<InlineV1TestHelpersIssuing6a15PostRequestFormFuelX5df6fa3d>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TestHelpersIssuingAuthorizationsFinalizeAmountPostRequestFormXffccad04,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TestHelpersIssuingAuthorizationsFinalizeAmountPostRequestFormXffccad04",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("final_amount", json.encodeToJsonElement(value.finalAmount))
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                    value.fleet?.let { put("fleet", json.encodeToJsonElement(it)) }
                    value.fuel?.let { put("fuel", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TestHelpersIssuingAuthorizationsFinalizeAmountPostRequestFormXffccad04(
    block: InlineV1TestHelpersIssuingAuthorizationsFinalizeAmountPostRequestFormXffccad04.Builder.() -> Unit,
): InlineV1TestHelpersIssuingAuthorizationsFinalizeAmountPostRequestFormXffccad04 =
    InlineV1TestHelpersIssuingAuthorizationsFinalizeAmountPostRequestFormXffccad04.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1TestHelpersIssuingAuthorizationsFinalizeAmountPostRequestFormXffccad04 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
