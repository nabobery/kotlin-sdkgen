package com.nabobery.sdkgen.github.generated

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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-edited/properties/changes.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-edited/properties/changes
 */
@Serializable(with = InlineWebhookPullRequestReviewEditedChangesXdfbf20ae.Serializer::class)
public class InlineWebhookPullRequestReviewEditedChangesXdfbf20ae(
  public val body: InlineWebhookPullRequestReviewEditedChangesBodyX88091c3b? = null,
) {
  public class Builder {
    public var body: InlineWebhookPullRequestReviewEditedChangesBodyX88091c3b? = null

    public fun build(): InlineWebhookPullRequestReviewEditedChangesXdfbf20ae = InlineWebhookPullRequestReviewEditedChangesXdfbf20ae(
      body = body,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewEditedChangesXdfbf20ae = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewEditedChangesXdfbf20ae> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewEditedChangesXdfbf20ae {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewEditedChangesXdfbf20ae")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewEditedChangesXdfbf20ae must be a JSON object")
      return InlineWebhookPullRequestReviewEditedChangesXdfbf20ae(
        body = rawObject["body"]?.let { json.decodeFromJsonElement<InlineWebhookPullRequestReviewEditedChangesBodyX88091c3b>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewEditedChangesXdfbf20ae) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewEditedChangesXdfbf20ae")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.body?.let { put("body", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestReviewEditedChangesXdfbf20ae(block: InlineWebhookPullRequestReviewEditedChangesXdfbf20ae.Builder.() -> Unit): InlineWebhookPullRequestReviewEditedChangesXdfbf20ae = InlineWebhookPullRequestReviewEditedChangesXdfbf20ae.build(block)
