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
 * The changes to the label if the action was `edited`.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-label-edited/properties/changes
 */
@Serializable(with = InlineWebhookLabelEditedChangesXda43b9d2.Serializer::class)
public class InlineWebhookLabelEditedChangesXda43b9d2(
  public val color: InlineWebhookLabelEditedChangesColorX66e802fa? = null,
  public val description: InlineWebhookLabelEditedChangesDescriptionX959ea7c5? = null,
  public val name: InlineWebhookLabelEditedChangesNameX135e5e94? = null,
) {
  public class Builder {
    public var color: InlineWebhookLabelEditedChangesColorX66e802fa? = null

    public var description: InlineWebhookLabelEditedChangesDescriptionX959ea7c5? = null

    public var name: InlineWebhookLabelEditedChangesNameX135e5e94? = null

    public fun build(): InlineWebhookLabelEditedChangesXda43b9d2 = InlineWebhookLabelEditedChangesXda43b9d2(
      color = color,
      description = description,
      name = name,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookLabelEditedChangesXda43b9d2 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookLabelEditedChangesXda43b9d2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookLabelEditedChangesXda43b9d2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookLabelEditedChangesXda43b9d2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookLabelEditedChangesXda43b9d2 must be a JSON object")
      return InlineWebhookLabelEditedChangesXda43b9d2(
        color = rawObject["color"]?.let { json.decodeFromJsonElement<InlineWebhookLabelEditedChangesColorX66e802fa>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<InlineWebhookLabelEditedChangesDescriptionX959ea7c5>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<InlineWebhookLabelEditedChangesNameX135e5e94>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookLabelEditedChangesXda43b9d2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookLabelEditedChangesXda43b9d2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.color?.let { put("color", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookLabelEditedChangesXda43b9d2(block: InlineWebhookLabelEditedChangesXda43b9d2.Builder.() -> Unit): InlineWebhookLabelEditedChangesXda43b9d2 = InlineWebhookLabelEditedChangesXda43b9d2.build(block)
