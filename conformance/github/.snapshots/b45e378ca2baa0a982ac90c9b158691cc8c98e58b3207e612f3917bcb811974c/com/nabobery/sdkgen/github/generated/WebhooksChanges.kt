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
 * The changes to the comment.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_changes
 */
@Serializable(with = WebhooksChanges.Serializer::class)
public class WebhooksChanges(
  public val body: InlineWebhooksChangesBodyXa38d6b09? = null,
) {
  public class Builder {
    public var body: InlineWebhooksChangesBodyXa38d6b09? = null

    public fun build(): WebhooksChanges = WebhooksChanges(
      body = body,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhooksChanges = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhooksChanges> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhooksChanges {
      val jsonDecoder = decoder.requireJsonDecoder("WebhooksChanges")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhooksChanges must be a JSON object")
      return WebhooksChanges(
        body = rawObject["body"]?.let { json.decodeFromJsonElement<InlineWebhooksChangesBodyXa38d6b09>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhooksChanges) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhooksChanges")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.body?.let { put("body", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhooksChanges(block: WebhooksChanges.Builder.() -> Unit): WebhooksChanges = WebhooksChanges.build(block)
