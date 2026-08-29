package com.nabobery.sdkgen.github.generated

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhooks_reviewers/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_reviewers/items
 */
@Serializable(with = InlineWebhooksReviewersItemX7689c76b.Serializer::class)
public class InlineWebhooksReviewersItemX7689c76b(
  public val reviewer: InlineWebhooksReviewersItemReviewerX4c82366a? = null,
  public val type: InlineWebhooksReviewersItemTypeX84e46881? = null,
) {
  public class Builder {
    public var reviewer: InlineWebhooksReviewersItemReviewerX4c82366a? = null

    public var type: InlineWebhooksReviewersItemTypeX84e46881? = null

    public fun build(): InlineWebhooksReviewersItemX7689c76b = InlineWebhooksReviewersItemX7689c76b(
      reviewer = reviewer,
      type = type,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhooksReviewersItemX7689c76b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhooksReviewersItemX7689c76b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhooksReviewersItemX7689c76b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhooksReviewersItemX7689c76b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhooksReviewersItemX7689c76b must be a JSON object")
      return InlineWebhooksReviewersItemX7689c76b(
        reviewer = rawObject["reviewer"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhooksReviewersItemReviewerX4c82366a?>(element) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<InlineWebhooksReviewersItemTypeX84e46881>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksReviewersItemX7689c76b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhooksReviewersItemX7689c76b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.reviewer?.let { put("reviewer", json.encodeToJsonElement(it)) }
        value.type?.let { put("type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhooksReviewersItemX7689c76b(block: InlineWebhooksReviewersItemX7689c76b.Builder.() -> Unit): InlineWebhooksReviewersItemX7689c76b = InlineWebhooksReviewersItemX7689c76b.build(block)
