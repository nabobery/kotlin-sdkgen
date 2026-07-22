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
import kotlin.collections.List

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cardholders/post/requestBody/content/application~1x-www-form-urlen
 * coded/schema/properties/spending_controls/properties/spending_limits/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cardholders/post/requestBody/content/application~1x-www-form-urlen
 * coded/schema/properties/spending_controls/properties/spending_limits/items
 */
@Serializable(with = InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX2b591b3f.Serializer::class)
public class InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX2b591b3f(
    public val amount: Int,
    public val interval: InlineV1IssuingCardholdersPostRequestFormSpendingControlsIntervalX93fe3e73,
    public val categories: List<InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX365c6d31>? = null,
) {
    public class Builder {
        private var amountValue: Int? = null

        public var amount: Int
            get() = requireNotNull(amountValue) { "amount is required" }
            set(`value`) {
                amountValue = value
            }

        private var intervalValue:
            InlineV1IssuingCardholdersPostRequestFormSpendingControlsIntervalX93fe3e73? = null

        public var interval: InlineV1IssuingCardholdersPostRequestFormSpendingControlsIntervalX93fe3e73
            get() = requireNotNull(intervalValue) { "interval is required" }
            set(`value`) {
                intervalValue = value
            }

        public var categories:
            List<InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX365c6d31>? = null

        public fun build(): InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX2b591b3f {
            check(amountValue != null) { "amount is required" }
            check(intervalValue != null) { "interval is required" }
            return InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX2b591b3f(
                amount = amount,
                interval = interval,
                categories = categories,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX2b591b3f = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX2b591b3f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX2b591b3f {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX2b591b3f",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX2b591b3f must be a JSON object",
                    )
            val amount = json.decodeRequired<Int>(rawObject, "amount")
            val interval =
                json.decodeRequired<InlineV1IssuingCardholdersPostRequestFormSpendingControlsIntervalX93fe3e73>(
                    rawObject,
                    "interval",
                )
            return InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX2b591b3f(
                amount = amount,
                interval = interval,
                categories =
                    rawObject["categories"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX365c6d31>>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX2b591b3f,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX2b591b3f",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("amount", json.encodeToJsonElement(value.amount))
                    put("interval", json.encodeToJsonElement(value.interval))
                    value.categories?.let { put("categories", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX2b591b3f(
    block: InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX2b591b3f.Builder.() -> Unit,
): InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX2b591b3f =
    InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX2b591b3f.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX2b591b3f is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
