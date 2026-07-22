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
import kotlin.Boolean
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_options/properties/card/anyOf/0/properties/installments.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_options/properties/card/anyOf/0/properties/installments
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsInstallmentsXa1d5a2b2.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsInstallmentsXa1d5a2b2(
    public val enabled: Boolean? = null,
    public val plan: InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX27ac85d6? = null,
) {
    public class Builder {
        public var enabled: Boolean? = null

        public var plan:
            InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX27ac85d6? = null

        public fun build(): InlineV1InvoicesPostRequestFormPaymentSettingsInstallmentsXa1d5a2b2 =
            InlineV1InvoicesPostRequestFormPaymentSettingsInstallmentsXa1d5a2b2(
                enabled = enabled,
                plan = plan,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1InvoicesPostRequestFormPaymentSettingsInstallmentsXa1d5a2b2 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsInstallmentsXa1d5a2b2> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1InvoicesPostRequestFormPaymentSettingsInstallmentsXa1d5a2b2 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1InvoicesPostRequestFormPaymentSettingsInstallmentsXa1d5a2b2",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1InvoicesPostRequestFormPaymentSettingsInstallmentsXa1d5a2b2 must be a JSON object",
                    )
            return InlineV1InvoicesPostRequestFormPaymentSettingsInstallmentsXa1d5a2b2(
                enabled = rawObject["enabled"]?.let { json.decodeFromJsonElement<Boolean>(it) },
                plan =
                    rawObject["plan"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX27ac85d6>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesPostRequestFormPaymentSettingsInstallmentsXa1d5a2b2,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1InvoicesPostRequestFormPaymentSettingsInstallmentsXa1d5a2b2",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.enabled?.let { put("enabled", json.encodeToJsonElement(it)) }
                    value.plan?.let { put("plan", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1InvoicesPostRequestFormPaymentSettingsInstallmentsXa1d5a2b2(
    block: InlineV1InvoicesPostRequestFormPaymentSettingsInstallmentsXa1d5a2b2.Builder.() -> Unit,
): InlineV1InvoicesPostRequestFormPaymentSettingsInstallmentsXa1d5a2b2 =
    InlineV1InvoicesPostRequestFormPaymentSettingsInstallmentsXa1d5a2b2.build(block)
