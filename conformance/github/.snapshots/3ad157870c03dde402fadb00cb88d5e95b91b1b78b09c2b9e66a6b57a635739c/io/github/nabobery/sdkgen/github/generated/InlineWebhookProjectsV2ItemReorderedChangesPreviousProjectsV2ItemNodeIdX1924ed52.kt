package io.github.nabobery.sdkgen.github.generated

import kotlin.String
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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-item-reordered/properties/changes/properties/pre
 * vious_projects_v2_item_node_id.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-item-reordered/properties/changes/properties/pre
 * vious_projects_v2_item_node_id
 */
@Serializable(with = InlineWebhookProjectsV2ItemReorderedChangesPreviousProjectsV2ItemNodeIdX1924ed52.Serializer::class)
public class InlineWebhookProjectsV2ItemReorderedChangesPreviousProjectsV2ItemNodeIdX1924ed52(
  public val from: String? = null,
  public val to: String? = null,
) {
  public class Builder {
    public var from: String? = null

    public var to: String? = null

    public fun build(): InlineWebhookProjectsV2ItemReorderedChangesPreviousProjectsV2ItemNodeIdX1924ed52 = InlineWebhookProjectsV2ItemReorderedChangesPreviousProjectsV2ItemNodeIdX1924ed52(
      from = from,
      to = to,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookProjectsV2ItemReorderedChangesPreviousProjectsV2ItemNodeIdX1924ed52 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookProjectsV2ItemReorderedChangesPreviousProjectsV2ItemNodeIdX1924ed52> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookProjectsV2ItemReorderedChangesPreviousProjectsV2ItemNodeIdX1924ed52 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookProjectsV2ItemReorderedChangesPreviousProjectsV2ItemNodeIdX1924ed52")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookProjectsV2ItemReorderedChangesPreviousProjectsV2ItemNodeIdX1924ed52 must be a JSON object")
      return InlineWebhookProjectsV2ItemReorderedChangesPreviousProjectsV2ItemNodeIdX1924ed52(
        from = rawObject["from"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        to = rawObject["to"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectsV2ItemReorderedChangesPreviousProjectsV2ItemNodeIdX1924ed52) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookProjectsV2ItemReorderedChangesPreviousProjectsV2ItemNodeIdX1924ed52")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.from?.let { put("from", it) }
        value.to?.let { put("to", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookProjectsV2ItemReorderedChangesPreviousProjectsV2ItemNodeIdX1924ed52(block: InlineWebhookProjectsV2ItemReorderedChangesPreviousProjectsV2ItemNodeIdX1924ed52.Builder.() -> Unit): InlineWebhookProjectsV2ItemReorderedChangesPreviousProjectsV2ItemNodeIdX1924ed52 = InlineWebhookProjectsV2ItemReorderedChangesPreviousProjectsV2ItemNodeIdX1924ed52.build(block)
