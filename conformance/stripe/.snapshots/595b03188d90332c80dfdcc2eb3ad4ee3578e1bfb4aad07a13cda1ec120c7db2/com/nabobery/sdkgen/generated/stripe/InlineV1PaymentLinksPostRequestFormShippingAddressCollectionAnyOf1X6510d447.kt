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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/shipping_address_collection/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/shipping_address_collection/anyOf/0
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf1X6510d447.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf1X6510d447(
    allowedCountries: List<InlineV1PaymentLinksPostRequestFormShippingAddressCollebe84AnyOf1ItemXce357372>,
) {
    public val allowedCountries:
        List<InlineV1PaymentLinksPostRequestFormShippingAddressCollebe84AnyOf1ItemXce357372> =
        allowedCountries.toList()

    public class Builder {
        private var allowedCountriesValue:
            List<InlineV1PaymentLinksPostRequestFormShippingAddressCollebe84AnyOf1ItemXce357372>? = null

        public var allowedCountries:
            List<InlineV1PaymentLinksPostRequestFormShippingAddressCollebe84AnyOf1ItemXce357372>
            get() = requireNotNull(allowedCountriesValue) { "allowedCountries is required" }
            set(`value`) {
                allowedCountriesValue = value
            }

        public fun build(): InlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf1X6510d447 {
            check(allowedCountriesValue != null) { "allowedCountries is required" }
            return InlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf1X6510d447(
                allowedCountries = allowedCountries,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf1X6510d447 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf1X6510d447> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf1X6510d447 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf1X6510d447",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf1X6510d447 must be a JSON object",
                    )
            val allowedCountries =
                json
                    .decodeRequired<List<InlineV1PaymentLinksPostRequestFormShippingAddressCollebe84AnyOf1ItemXce357372>>(
                        rawObject,
                        "allowed_countries",
                    )
            return InlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf1X6510d447(
                allowedCountries = allowedCountries,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf1X6510d447,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf1X6510d447",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("allowed_countries", json.encodeToJsonElement(value.allowedCountries))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf1X6510d447(
    block: InlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf1X6510d447.Builder.() -> Unit,
): InlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf1X6510d447 =
    InlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf1X6510d447.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1PaymentLinksPostRequestFormShippingAddressCollectionAnyOf1X6510d447 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
