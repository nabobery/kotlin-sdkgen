package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Int
import kotlin.String
import kotlin.Unit

@Serializable
public data class InternalCardView(
    public val brand: String? = null,
    public val country: String? = null,
    @SerialName("exp_month")
    public val expMonth: Int? = null,
    @SerialName("exp_year")
    public val expYear: Int? = null,
    public val last4: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/internal_card
 */
@Serializable(with = InternalCard.Serializer::class)
public class InternalCard(
    /**
     * Brand of the card used in the transaction
     */
    public val brand: String? = null,
    /**
     * Two-letter ISO code representing the country of the card
     */
    public val country: String? = null,
    /**
     * Two digit number representing the card's expiration month
     */
    public val expMonth: Int? = null,
    /**
     * Two digit number representing the card's expiration year
     */
    public val expYear: Int? = null,
    /**
     * The last 4 digits of the card
     */
    public val last4: String? = null,
) {
    public class Builder {
        /**
         * Brand of the card used in the transaction
         */
        public var brand: String? = null

        /**
         * Two-letter ISO code representing the country of the card
         */
        public var country: String? = null

        /**
         * Two digit number representing the card's expiration month
         */
        public var expMonth: Int? = null

        /**
         * Two digit number representing the card's expiration year
         */
        public var expYear: Int? = null

        /**
         * The last 4 digits of the card
         */
        public var last4: String? = null

        public fun build(): InternalCard =
            InternalCard(
                brand = brand,
                country = country,
                expMonth = expMonth,
                expYear = expYear,
                last4 = last4,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InternalCard = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InternalCard> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InternalCard {
            val jsonDecoder = decoder.requireJsonDecoder("InternalCard")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("InternalCard must be a JSON object")
            return InternalCard(
                brand =
                    rawObject["brand"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                country =
                    rawObject["country"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                expMonth =
                    rawObject["exp_month"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
                expYear =
                    rawObject["exp_year"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
                last4 =
                    rawObject["last4"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InternalCard,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InternalCard")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.brand?.let { put("brand", it) }
                    value.country?.let { put("country", it) }
                    value.expMonth?.let { put("exp_month", json.encodeToJsonElement(it)) }
                    value.expYear?.let { put("exp_year", json.encodeToJsonElement(it)) }
                    value.last4?.let { put("last4", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun internalCard(block: InternalCard.Builder.() -> Unit): InternalCard = InternalCard.build(block)
