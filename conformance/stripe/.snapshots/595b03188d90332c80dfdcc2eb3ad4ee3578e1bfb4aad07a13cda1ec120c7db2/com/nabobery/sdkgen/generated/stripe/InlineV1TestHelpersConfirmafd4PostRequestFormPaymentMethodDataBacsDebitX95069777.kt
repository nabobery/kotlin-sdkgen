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
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/payment_method_data/properties/bacs_debit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/payment_method_data/properties/bacs_debit
 */
@Serializable(with = InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataBacsDebitX95069777.Serializer::class)
public class InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataBacsDebitX95069777(
    public val accountNumber: String? = null,
    public val sortCode: String? = null,
) {
    public class Builder {
        public var accountNumber: String? = null

        public var sortCode: String? = null

        public fun build(): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataBacsDebitX95069777 =
            InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataBacsDebitX95069777(
                accountNumber = accountNumber,
                sortCode = sortCode,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataBacsDebitX95069777 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataBacsDebitX95069777> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataBacsDebitX95069777 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataBacsDebitX95069777",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataBacsDebitX95069777 must be a JSON object",
                    )
            return InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataBacsDebitX95069777(
                accountNumber = rawObject["account_number"]?.let { json.decodeFromJsonElement<String>(it) },
                sortCode = rawObject["sort_code"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataBacsDebitX95069777,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataBacsDebitX95069777",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.accountNumber?.let { put("account_number", it) }
                    value.sortCode?.let { put("sort_code", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataBacsDebitX95069777(
    block: InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataBacsDebitX95069777.Builder.() -> Unit,
): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataBacsDebitX95069777 =
    InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataBacsDebitX95069777.build(block)
