package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-item-reordered/properties/changes.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-item-reordered/properties/changes
 */
@Serializable(with = InlineWebhookProjectsV2ItemReorderedChangesX55e0c905.Serializer::class)
public class InlineWebhookProjectsV2ItemReorderedChangesX55e0c905(
  public val previousProjectsV2ItemNodeId:
      InlineWebhookProjectsV2ItemReorderedChangesPreviousProjectsV2ItemNodeIdX1924ed52? = null,
) {
  public class Builder {
    public var previousProjectsV2ItemNodeId:
        InlineWebhookProjectsV2ItemReorderedChangesPreviousProjectsV2ItemNodeIdX1924ed52? = null

    public fun build(): InlineWebhookProjectsV2ItemReorderedChangesX55e0c905 = InlineWebhookProjectsV2ItemReorderedChangesX55e0c905(
      previousProjectsV2ItemNodeId = previousProjectsV2ItemNodeId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookProjectsV2ItemReorderedChangesX55e0c905 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookProjectsV2ItemReorderedChangesX55e0c905> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookProjectsV2ItemReorderedChangesX55e0c905 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookProjectsV2ItemReorderedChangesX55e0c905")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookProjectsV2ItemReorderedChangesX55e0c905 must be a JSON object")
      return InlineWebhookProjectsV2ItemReorderedChangesX55e0c905(
        previousProjectsV2ItemNodeId = rawObject["previous_projects_v2_item_node_id"]?.let { json.decodeFromJsonElement<InlineWebhookProjectsV2ItemReorderedChangesPreviousProjectsV2ItemNodeIdX1924ed52>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectsV2ItemReorderedChangesX55e0c905) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookProjectsV2ItemReorderedChangesX55e0c905")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.previousProjectsV2ItemNodeId?.let { put("previous_projects_v2_item_node_id", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookProjectsV2ItemReorderedChangesX55e0c905(block: InlineWebhookProjectsV2ItemReorderedChangesX55e0c905.Builder.() -> Unit): InlineWebhookProjectsV2ItemReorderedChangesX55e0c905 = InlineWebhookProjectsV2ItemReorderedChangesX55e0c905.build(block)
