package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

@Serializable
public data class PaymentLinksResourceCardRestrictionsView(
    @SerialName("brands_blocked")
    public val brandsBlocked: List<InlinePaymentLinksResourceCardRestrictionsBrandsBlockedItemX01b21113>,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_links_resource_card_restrictions
 */
@Serializable(with = PaymentLinksResourceCardRestrictions.Serializer::class)
public class PaymentLinksResourceCardRestrictions(
    brandsBlocked: List<InlinePaymentLinksResourceCardRestrictionsBrandsBlockedItemX01b21113>,
) {
    /**
     * The card brands to block. If a customer enters or selects a card belonging to a blocked brand, they can't complete
     * the payment.
     */
    public val brandsBlocked:
        List<InlinePaymentLinksResourceCardRestrictionsBrandsBlockedItemX01b21113> =
        brandsBlocked.toList()

    public class Builder {
        private var brandsBlockedValue:
            List<InlinePaymentLinksResourceCardRestrictionsBrandsBlockedItemX01b21113>? = null

        public var brandsBlocked:
            List<InlinePaymentLinksResourceCardRestrictionsBrandsBlockedItemX01b21113>
            get() = requireNotNull(brandsBlockedValue) { "brandsBlocked is required" }
            set(`value`) {
                brandsBlockedValue = value
            }

        public fun build(): PaymentLinksResourceCardRestrictions {
            check(brandsBlockedValue != null) { "brandsBlocked is required" }
            return PaymentLinksResourceCardRestrictions(
                brandsBlocked = brandsBlocked,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentLinksResourceCardRestrictions =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentLinksResourceCardRestrictions> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentLinksResourceCardRestrictions {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentLinksResourceCardRestrictions")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentLinksResourceCardRestrictions must be a JSON object")
            val brandsBlocked =
                json
                    .decodeRequired<List<InlinePaymentLinksResourceCardRestrictionsBrandsBlockedItemX01b21113>>(
                        rawObject,
                        "brands_blocked",
                    )
            return PaymentLinksResourceCardRestrictions(
                brandsBlocked = brandsBlocked,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentLinksResourceCardRestrictions,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentLinksResourceCardRestrictions")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("brands_blocked", json.encodeToJsonElement(value.brandsBlocked))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentLinksResourceCardRestrictions(
    block: PaymentLinksResourceCardRestrictions.Builder.() -> Unit,
): PaymentLinksResourceCardRestrictions = PaymentLinksResourceCardRestrictions.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "PaymentLinksResourceCardRestrictions is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
