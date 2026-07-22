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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/automatic_tax/properties/liability.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/automatic_tax/properties/liability
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemLiabilityXc3764f5f.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemLiabilityXc3764f5f(
    public val type: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAutomaticTaxTypeX8b1e9bfe,
    public val account: String? = null,
) {
    public class Builder {
        private var typeValue:
            InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAutomaticTaxTypeX8b1e9bfe? = null

        public var type: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAutomaticTaxTypeX8b1e9bfe
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        public var account: String? = null

        public fun build(): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemLiabilityXc3764f5f {
            check(typeValue != null) { "type is required" }
            return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemLiabilityXc3764f5f(
                type = type,
                account = account,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemLiabilityXc3764f5f = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemLiabilityXc3764f5f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemLiabilityXc3764f5f {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionSchedulesPostRequestFormPhasesItemLiabilityXc3764f5f",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SubscriptionSchedulesPostRequestFormPhasesItemLiabilityXc3764f5f must be a JSON object",
                    )
            val type =
                json.decodeRequired<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAutomaticTaxTypeX8b1e9bfe>(
                    rawObject,
                    "type",
                )
            return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemLiabilityXc3764f5f(
                type = type,
                account = rawObject["account"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemLiabilityXc3764f5f,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SubscriptionSchedulesPostRequestFormPhasesItemLiabilityXc3764f5f",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("type", json.encodeToJsonElement(value.type))
                    value.account?.let { put("account", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1SubscriptionSchedulesPostRequestFormPhasesItemLiabilityXc3764f5f(
    block: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemLiabilityXc3764f5f.Builder.() -> Unit,
): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemLiabilityXc3764f5f =
    InlineV1SubscriptionSchedulesPostRequestFormPhasesItemLiabilityXc3764f5f.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1SubscriptionSchedulesPostRequestFormPhasesItemLiabilityXc3764f5f is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
