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
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 * If this is an `au_becs_debit` PaymentMethod, this hash contains details about the bank account.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/au_becs_debit
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormAuBecsDebitX9e169e4d.Serializer::class)
public class InlineV1PaymentMethodsPostRequestFormAuBecsDebitX9e169e4d(
    public val accountNumber: String,
    public val bsbNumber: String,
) {
    public class Builder {
        private var accountNumberValue: String? = null

        public var accountNumber: String
            get() = requireNotNull(accountNumberValue) { "accountNumber is required" }
            set(`value`) {
                accountNumberValue = value
            }

        private var bsbNumberValue: String? = null

        public var bsbNumber: String
            get() = requireNotNull(bsbNumberValue) { "bsbNumber is required" }
            set(`value`) {
                bsbNumberValue = value
            }

        public fun build(): InlineV1PaymentMethodsPostRequestFormAuBecsDebitX9e169e4d {
            check(accountNumberValue != null) { "accountNumber is required" }
            check(bsbNumberValue != null) { "bsbNumber is required" }
            return InlineV1PaymentMethodsPostRequestFormAuBecsDebitX9e169e4d(
                accountNumber = accountNumber,
                bsbNumber = bsbNumber,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodsPostRequestFormAuBecsDebitX9e169e4d =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormAuBecsDebitX9e169e4d> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentMethodsPostRequestFormAuBecsDebitX9e169e4d {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodsPostRequestFormAuBecsDebitX9e169e4d")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentMethodsPostRequestFormAuBecsDebitX9e169e4d must be a JSON object",
                    )
            val accountNumber = json.decodeRequired<String>(rawObject, "account_number")
            val bsbNumber = json.decodeRequired<String>(rawObject, "bsb_number")
            return InlineV1PaymentMethodsPostRequestFormAuBecsDebitX9e169e4d(
                accountNumber = accountNumber,
                bsbNumber = bsbNumber,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentMethodsPostRequestFormAuBecsDebitX9e169e4d,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodsPostRequestFormAuBecsDebitX9e169e4d")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("account_number", value.accountNumber)
                    put("bsb_number", value.bsbNumber)
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentMethodsPostRequestFormAuBecsDebitX9e169e4d(
    block: InlineV1PaymentMethodsPostRequestFormAuBecsDebitX9e169e4d.Builder.() -> Unit,
): InlineV1PaymentMethodsPostRequestFormAuBecsDebitX9e169e4d =
    InlineV1PaymentMethodsPostRequestFormAuBecsDebitX9e169e4d.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1PaymentMethodsPostRequestFormAuBecsDebitX9e169e4d is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
