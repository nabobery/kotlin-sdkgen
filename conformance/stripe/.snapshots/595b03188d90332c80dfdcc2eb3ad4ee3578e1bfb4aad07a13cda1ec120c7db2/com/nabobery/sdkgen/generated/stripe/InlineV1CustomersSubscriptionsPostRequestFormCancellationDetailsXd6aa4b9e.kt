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
 * Details about why this subscription was cancelled
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/cancellation_details
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsXd6aa4b9e.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsXd6aa4b9e(
    public val comment: InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsCommentX106808c4? = null,
    public val feedback: InlineV1CustomersSubscriptionsPostRequestFormFeedbackX1d708127? = null,
) {
    public class Builder {
        public var comment:
            InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsCommentX106808c4? = null

        public var feedback: InlineV1CustomersSubscriptionsPostRequestFormFeedbackX1d708127? = null

        public fun build(): InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsXd6aa4b9e =
            InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsXd6aa4b9e(
                comment = comment,
                feedback = feedback,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsXd6aa4b9e = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsXd6aa4b9e> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsXd6aa4b9e {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsXd6aa4b9e",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsXd6aa4b9e must be a JSON object",
                    )
            return InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsXd6aa4b9e(
                comment =
                    rawObject["comment"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsCommentX106808c4>(
                                it,
                            )
                    },
                feedback =
                    rawObject["feedback"]?.let {
                        json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormFeedbackX1d708127>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsXd6aa4b9e,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsXd6aa4b9e",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.comment?.let { put("comment", json.encodeToJsonElement(it)) }
                    value.feedback?.let { put("feedback", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsXd6aa4b9e(
    block: InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsXd6aa4b9e.Builder.() -> Unit,
): InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsXd6aa4b9e =
    InlineV1CustomersSubscriptionsPostRequestFormCancellationDetailsXd6aa4b9e.build(block)
