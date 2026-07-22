package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-status-update-edited/properties/changes/properti
 * es/start_date.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-status-update-edited/properties/changes/properti
 * es/start_date
 */
@Serializable(with = InlineWebhookProjectsV2StatusUpdateEditedChangesStartDateXa0996846.Serializer::class)
public class InlineWebhookProjectsV2StatusUpdateEditedChangesStartDateXa0996846(
  public val from: String? = null,
  public val to: String? = null,
) {
  public class Builder {
    public var from: String? = null

    public var to: String? = null

    public fun build(): InlineWebhookProjectsV2StatusUpdateEditedChangesStartDateXa0996846 = InlineWebhookProjectsV2StatusUpdateEditedChangesStartDateXa0996846(
      from = from,
      to = to,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookProjectsV2StatusUpdateEditedChangesStartDateXa0996846 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookProjectsV2StatusUpdateEditedChangesStartDateXa0996846> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookProjectsV2StatusUpdateEditedChangesStartDateXa0996846 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookProjectsV2StatusUpdateEditedChangesStartDateXa0996846")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookProjectsV2StatusUpdateEditedChangesStartDateXa0996846 must be a JSON object")
      return InlineWebhookProjectsV2StatusUpdateEditedChangesStartDateXa0996846(
        from = rawObject["from"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        to = rawObject["to"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectsV2StatusUpdateEditedChangesStartDateXa0996846) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookProjectsV2StatusUpdateEditedChangesStartDateXa0996846")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.from?.let { put("from", it) }
        value.to?.let { put("to", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookProjectsV2StatusUpdateEditedChangesStartDateXa0996846(block: InlineWebhookProjectsV2StatusUpdateEditedChangesStartDateXa0996846.Builder.() -> Unit): InlineWebhookProjectsV2StatusUpdateEditedChangesStartDateXa0996846 = InlineWebhookProjectsV2StatusUpdateEditedChangesStartDateXa0996846.build(block)
