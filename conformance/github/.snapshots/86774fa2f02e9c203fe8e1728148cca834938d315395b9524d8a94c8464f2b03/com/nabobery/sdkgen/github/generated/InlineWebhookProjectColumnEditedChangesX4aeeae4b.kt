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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-project-column-edited/properties/changes.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-project-column-edited/properties/changes
 */
@Serializable(with = InlineWebhookProjectColumnEditedChangesX4aeeae4b.Serializer::class)
public class InlineWebhookProjectColumnEditedChangesX4aeeae4b(
  public val name: InlineWebhookProjectColumnEditedChangesNameXde92fa93? = null,
) {
  public class Builder {
    public var name: InlineWebhookProjectColumnEditedChangesNameXde92fa93? = null

    public fun build(): InlineWebhookProjectColumnEditedChangesX4aeeae4b = InlineWebhookProjectColumnEditedChangesX4aeeae4b(
      name = name,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookProjectColumnEditedChangesX4aeeae4b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookProjectColumnEditedChangesX4aeeae4b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookProjectColumnEditedChangesX4aeeae4b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookProjectColumnEditedChangesX4aeeae4b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookProjectColumnEditedChangesX4aeeae4b must be a JSON object")
      return InlineWebhookProjectColumnEditedChangesX4aeeae4b(
        name = rawObject["name"]?.let { json.decodeFromJsonElement<InlineWebhookProjectColumnEditedChangesNameXde92fa93>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectColumnEditedChangesX4aeeae4b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookProjectColumnEditedChangesX4aeeae4b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.name?.let { put("name", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookProjectColumnEditedChangesX4aeeae4b(block: InlineWebhookProjectColumnEditedChangesX4aeeae4b.Builder.() -> Unit): InlineWebhookProjectColumnEditedChangesX4aeeae4b = InlineWebhookProjectColumnEditedChangesX4aeeae4b.build(block)
