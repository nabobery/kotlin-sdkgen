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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/delete/requestBody/content/applica
 * tion~1x-www-form-urlencoded/schema/properties/cancellation_details
 */
@Serializable(with = InlineV1SubscriptionsDeleteRequestFormCancellationDetailsXd492ca32.Serializer::class)
public class InlineV1SubscriptionsDeleteRequestFormCancellationDetailsXd492ca32(
    public val comment: InlineV1SubscriptionsDeleteRequestFormCancellationDetailsCommentXc27857b4? = null,
    public val feedback: InlineV1SubscriptionsDeleteRequestFormCancellationDetailsFeedbackXfe24bb6e? = null,
) {
    public class Builder {
        public var comment: InlineV1SubscriptionsDeleteRequestFormCancellationDetailsCommentXc27857b4? =
            null

        public var feedback: InlineV1SubscriptionsDeleteRequestFormCancellationDetailsFeedbackXfe24bb6e? =
            null

        public fun build(): InlineV1SubscriptionsDeleteRequestFormCancellationDetailsXd492ca32 =
            InlineV1SubscriptionsDeleteRequestFormCancellationDetailsXd492ca32(
                comment = comment,
                feedback = feedback,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1SubscriptionsDeleteRequestFormCancellationDetailsXd492ca32 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsDeleteRequestFormCancellationDetailsXd492ca32> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1SubscriptionsDeleteRequestFormCancellationDetailsXd492ca32 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionsDeleteRequestFormCancellationDetailsXd492ca32",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SubscriptionsDeleteRequestFormCancellationDetailsXd492ca32 must be a JSON object",
                    )
            return InlineV1SubscriptionsDeleteRequestFormCancellationDetailsXd492ca32(
                comment =
                    rawObject["comment"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionsDeleteRequestFormCancellationDetailsCommentXc27857b4>(
                                it,
                            )
                    },
                feedback =
                    rawObject["feedback"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionsDeleteRequestFormCancellationDetailsFeedbackXfe24bb6e>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsDeleteRequestFormCancellationDetailsXd492ca32,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SubscriptionsDeleteRequestFormCancellationDetailsXd492ca32",
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

public fun inlineV1SubscriptionsDeleteRequestFormCancellationDetailsXd492ca32(
    block: InlineV1SubscriptionsDeleteRequestFormCancellationDetailsXd492ca32.Builder.() -> Unit,
): InlineV1SubscriptionsDeleteRequestFormCancellationDetailsXd492ca32 =
    InlineV1SubscriptionsDeleteRequestFormCancellationDetailsXd492ca32.build(block)
