package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Unit
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

/**
 * Details about why this subscription was cancelled
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/cancellation_details
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormCancellationDetailsX683d2da1.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormCancellationDetailsX683d2da1(
  public val comment:
      InlineV1SubscriptionsPostRequestFormCancellationDetailsCommentXfd0719ac? = null,
  public val feedback:
      InlineV1SubscriptionsPostRequestFormCancellationDetailsFeedbackX8680ed0d? = null,
) {
  public class Builder {
    public var comment: InlineV1SubscriptionsPostRequestFormCancellationDetailsCommentXfd0719ac? =
        null

    public var feedback: InlineV1SubscriptionsPostRequestFormCancellationDetailsFeedbackX8680ed0d? =
        null

    public fun build(): InlineV1SubscriptionsPostRequestFormCancellationDetailsX683d2da1 = InlineV1SubscriptionsPostRequestFormCancellationDetailsX683d2da1(
      comment = comment,
      feedback = feedback,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormCancellationDetailsX683d2da1 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormCancellationDetailsX683d2da1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormCancellationDetailsX683d2da1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormCancellationDetailsX683d2da1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormCancellationDetailsX683d2da1 must be a JSON object")
      return InlineV1SubscriptionsPostRequestFormCancellationDetailsX683d2da1(
        comment = rawObject["comment"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormCancellationDetailsCommentXfd0719ac>(it) },
        feedback = rawObject["feedback"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormCancellationDetailsFeedbackX8680ed0d>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormCancellationDetailsX683d2da1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormCancellationDetailsX683d2da1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.comment?.let { put("comment", json.encodeToJsonElement(it)) }
        value.feedback?.let { put("feedback", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionsPostRequestFormCancellationDetailsX683d2da1(block: InlineV1SubscriptionsPostRequestFormCancellationDetailsX683d2da1.Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormCancellationDetailsX683d2da1 = InlineV1SubscriptionsPostRequestFormCancellationDetailsX683d2da1.build(block)
