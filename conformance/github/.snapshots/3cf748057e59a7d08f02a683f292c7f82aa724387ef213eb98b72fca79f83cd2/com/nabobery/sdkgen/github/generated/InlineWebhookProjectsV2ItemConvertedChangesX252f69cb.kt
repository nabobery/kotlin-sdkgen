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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-item-converted/properties/changes.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-item-converted/properties/changes
 */
@Serializable(with = InlineWebhookProjectsV2ItemConvertedChangesX252f69cb.Serializer::class)
public class InlineWebhookProjectsV2ItemConvertedChangesX252f69cb(
  public val contentType: InlineWebhookProjectsV2ItemConvertedChangesContentTypeX7a64a1e8? = null,
) {
  public class Builder {
    public var contentType: InlineWebhookProjectsV2ItemConvertedChangesContentTypeX7a64a1e8? = null

    public fun build(): InlineWebhookProjectsV2ItemConvertedChangesX252f69cb = InlineWebhookProjectsV2ItemConvertedChangesX252f69cb(
      contentType = contentType,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookProjectsV2ItemConvertedChangesX252f69cb = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookProjectsV2ItemConvertedChangesX252f69cb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookProjectsV2ItemConvertedChangesX252f69cb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookProjectsV2ItemConvertedChangesX252f69cb")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookProjectsV2ItemConvertedChangesX252f69cb must be a JSON object")
      return InlineWebhookProjectsV2ItemConvertedChangesX252f69cb(
        contentType = rawObject["content_type"]?.let { json.decodeFromJsonElement<InlineWebhookProjectsV2ItemConvertedChangesContentTypeX7a64a1e8>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectsV2ItemConvertedChangesX252f69cb) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookProjectsV2ItemConvertedChangesX252f69cb")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.contentType?.let { put("content_type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookProjectsV2ItemConvertedChangesX252f69cb(block: InlineWebhookProjectsV2ItemConvertedChangesX252f69cb.Builder.() -> Unit): InlineWebhookProjectsV2ItemConvertedChangesX252f69cb = InlineWebhookProjectsV2ItemConvertedChangesX252f69cb.build(block)
