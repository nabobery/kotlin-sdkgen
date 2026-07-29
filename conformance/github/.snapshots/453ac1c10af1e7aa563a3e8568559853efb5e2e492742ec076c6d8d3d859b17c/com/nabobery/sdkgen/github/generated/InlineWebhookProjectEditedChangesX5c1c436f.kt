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
 * The changes to the project if the action was `edited`.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-project-edited/properties/changes
 */
@Serializable(with = InlineWebhookProjectEditedChangesX5c1c436f.Serializer::class)
public class InlineWebhookProjectEditedChangesX5c1c436f(
  public val body: InlineWebhookProjectEditedChangesBodyX75165026? = null,
  public val name: InlineWebhookProjectEditedChangesNameX0e760697? = null,
) {
  public class Builder {
    public var body: InlineWebhookProjectEditedChangesBodyX75165026? = null

    public var name: InlineWebhookProjectEditedChangesNameX0e760697? = null

    public fun build(): InlineWebhookProjectEditedChangesX5c1c436f = InlineWebhookProjectEditedChangesX5c1c436f(
      body = body,
      name = name,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookProjectEditedChangesX5c1c436f = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookProjectEditedChangesX5c1c436f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookProjectEditedChangesX5c1c436f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookProjectEditedChangesX5c1c436f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookProjectEditedChangesX5c1c436f must be a JSON object")
      return InlineWebhookProjectEditedChangesX5c1c436f(
        body = rawObject["body"]?.let { json.decodeFromJsonElement<InlineWebhookProjectEditedChangesBodyX75165026>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<InlineWebhookProjectEditedChangesNameX0e760697>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectEditedChangesX5c1c436f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookProjectEditedChangesX5c1c436f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.body?.let { put("body", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookProjectEditedChangesX5c1c436f(block: InlineWebhookProjectEditedChangesX5c1c436f.Builder.() -> Unit): InlineWebhookProjectEditedChangesX5c1c436f = InlineWebhookProjectEditedChangesX5c1c436f.build(block)
