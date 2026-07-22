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

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0/properties/three_d_secure/proper
 * ties/network_options/properties/cartes_bancaires.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0/properties/three_d_secure/proper
 * ties/network_options/properties/cartes_bancaires
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormCartesBancairesXa206231e.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormCartesBancairesXa206231e(
    public val cbAvalgo: InlineV1PaymentIntentsConfirmPostRequestFormCbAvalgoX93d2f20d,
    public val cbExemption: String? = null,
    public val cbScore: Int? = null,
) {
    public class Builder {
        private var cbAvalgoValue: InlineV1PaymentIntentsConfirmPostRequestFormCbAvalgoX93d2f20d? = null

        public var cbAvalgo: InlineV1PaymentIntentsConfirmPostRequestFormCbAvalgoX93d2f20d
            get() = requireNotNull(cbAvalgoValue) { "cbAvalgo is required" }
            set(`value`) {
                cbAvalgoValue = value
            }

        public var cbExemption: String? = null

        public var cbScore: Int? = null

        public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormCartesBancairesXa206231e {
            check(cbAvalgoValue != null) { "cbAvalgo is required" }
            return InlineV1PaymentIntentsConfirmPostRequestFormCartesBancairesXa206231e(
                cbAvalgo = cbAvalgo,
                cbExemption = cbExemption,
                cbScore = cbScore,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsConfirmPostRequestFormCartesBancairesXa206231e = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormCartesBancairesXa206231e> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsConfirmPostRequestFormCartesBancairesXa206231e {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsConfirmPostRequestFormCartesBancairesXa206231e",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsConfirmPostRequestFormCartesBancairesXa206231e must be a JSON object",
                    )
            val cbAvalgo =
                json.decodeRequired<InlineV1PaymentIntentsConfirmPostRequestFormCbAvalgoX93d2f20d>(
                    rawObject,
                    "cb_avalgo",
                )
            return InlineV1PaymentIntentsConfirmPostRequestFormCartesBancairesXa206231e(
                cbAvalgo = cbAvalgo,
                cbExemption = rawObject["cb_exemption"]?.let { json.decodeFromJsonElement<String>(it) },
                cbScore = rawObject["cb_score"]?.let { json.decodeFromJsonElement<Int>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsConfirmPostRequestFormCartesBancairesXa206231e,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsConfirmPostRequestFormCartesBancairesXa206231e",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("cb_avalgo", json.encodeToJsonElement(value.cbAvalgo))
                    value.cbExemption?.let { put("cb_exemption", it) }
                    value.cbScore?.let { put("cb_score", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentIntentsConfirmPostRequestFormCartesBancairesXa206231e(
    block: InlineV1PaymentIntentsConfirmPostRequestFormCartesBancairesXa206231e.Builder.() -> Unit,
): InlineV1PaymentIntentsConfirmPostRequestFormCartesBancairesXa206231e =
    InlineV1PaymentIntentsConfirmPostRequestFormCartesBancairesXa206231e.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1PaymentIntentsConfirmPostRequestFormCartesBancairesXa206231e is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
