package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Unit

/**
 * JCB is a credit card company based in Japan. JCB is currently available in Japan to businesses approved by JCB, and
 * available to all businesses in Australia, Canada, Hong Kong, Japan, New Zealand, Singapore, Switzerland, United
 * Kingdom, United States, and all countries in the European Economic Area except Iceland. Check this
 * [page](https://support.stripe.com/questions/accepting-japan-credit-bureau-%28jcb%29-payments) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/jcb
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormJcbXe8831514.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormJcbXe8831514(
    public val displayPreference: InlineV1PaymentMethodConfigurationsPostRequestFormJcbDisplayPreferenceXc2cc2fc6? = null,
) {
    public class Builder {
        public var displayPreference:
            InlineV1PaymentMethodConfigurationsPostRequestFormJcbDisplayPreferenceXc2cc2fc6? = null

        public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormJcbXe8831514 =
            InlineV1PaymentMethodConfigurationsPostRequestFormJcbXe8831514(
                displayPreference = displayPreference,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormJcbXe8831514 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormJcbXe8831514> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormJcbXe8831514 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormJcbXe8831514",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentMethodConfigurationsPostRequestFormJcbXe8831514 must be a JSON object",
                    )
            return InlineV1PaymentMethodConfigurationsPostRequestFormJcbXe8831514(
                displayPreference =
                    rawObject["display_preference"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormJcbDisplayPreferenceXc2cc2fc6>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentMethodConfigurationsPostRequestFormJcbXe8831514,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentMethodConfigurationsPostRequestFormJcbXe8831514",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.displayPreference?.let { put("display_preference", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormJcbXe8831514(
    block: InlineV1PaymentMethodConfigurationsPostRequestFormJcbXe8831514.Builder.() -> Unit,
): InlineV1PaymentMethodConfigurationsPostRequestFormJcbXe8831514 =
    InlineV1PaymentMethodConfigurationsPostRequestFormJcbXe8831514.build(block)
