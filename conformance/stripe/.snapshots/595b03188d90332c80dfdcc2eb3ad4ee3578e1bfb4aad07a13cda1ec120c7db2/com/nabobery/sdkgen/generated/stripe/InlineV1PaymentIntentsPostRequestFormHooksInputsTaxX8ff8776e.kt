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

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/hooks/properties/inputs/properties/tax.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/hooks/properties/inputs/properties/tax
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormHooksInputsTaxX8ff8776e.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormHooksInputsTaxX8ff8776e(
    public val calculation: InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX645188b1,
) {
    public class Builder {
        private var calculationValue:
            InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX645188b1? = null

        public var calculation: InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX645188b1
            get() = requireNotNull(calculationValue) { "calculation is required" }
            set(`value`) {
                calculationValue = value
            }

        public fun build(): InlineV1PaymentIntentsPostRequestFormHooksInputsTaxX8ff8776e {
            check(calculationValue != null) { "calculation is required" }
            return InlineV1PaymentIntentsPostRequestFormHooksInputsTaxX8ff8776e(
                calculation = calculation,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormHooksInputsTaxX8ff8776e =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormHooksInputsTaxX8ff8776e> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormHooksInputsTaxX8ff8776e {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormHooksInputsTaxX8ff8776e")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsPostRequestFormHooksInputsTaxX8ff8776e must be a JSON object",
                    )
            val calculation =
                json.decodeRequired<InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX645188b1>(
                    rawObject,
                    "calculation",
                )
            return InlineV1PaymentIntentsPostRequestFormHooksInputsTaxX8ff8776e(
                calculation = calculation,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormHooksInputsTaxX8ff8776e,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormHooksInputsTaxX8ff8776e")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("calculation", json.encodeToJsonElement(value.calculation))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentIntentsPostRequestFormHooksInputsTaxX8ff8776e(
    block: InlineV1PaymentIntentsPostRequestFormHooksInputsTaxX8ff8776e.Builder.() -> Unit,
): InlineV1PaymentIntentsPostRequestFormHooksInputsTaxX8ff8776e =
    InlineV1PaymentIntentsPostRequestFormHooksInputsTaxX8ff8776e.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1PaymentIntentsPostRequestFormHooksInputsTaxX8ff8776e is missing required property '" + name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
