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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-project-edited/properties/changes/properties/sho
 * rt_description.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-project-edited/properties/changes/properties/sho
 * rt_description
 */
@Serializable(with = InlineWebhookProjectsV2ProjectEditedChangesShortDescriptionX6da6c10e.Serializer::class)
public class InlineWebhookProjectsV2ProjectEditedChangesShortDescriptionX6da6c10e(
  public val from: String? = null,
  public val to: String? = null,
) {
  public class Builder {
    public var from: String? = null

    public var to: String? = null

    public fun build(): InlineWebhookProjectsV2ProjectEditedChangesShortDescriptionX6da6c10e = InlineWebhookProjectsV2ProjectEditedChangesShortDescriptionX6da6c10e(
      from = from,
      to = to,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookProjectsV2ProjectEditedChangesShortDescriptionX6da6c10e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookProjectsV2ProjectEditedChangesShortDescriptionX6da6c10e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookProjectsV2ProjectEditedChangesShortDescriptionX6da6c10e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookProjectsV2ProjectEditedChangesShortDescriptionX6da6c10e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookProjectsV2ProjectEditedChangesShortDescriptionX6da6c10e must be a JSON object")
      return InlineWebhookProjectsV2ProjectEditedChangesShortDescriptionX6da6c10e(
        from = rawObject["from"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        to = rawObject["to"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectsV2ProjectEditedChangesShortDescriptionX6da6c10e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookProjectsV2ProjectEditedChangesShortDescriptionX6da6c10e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.from?.let { put("from", it) }
        value.to?.let { put("to", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookProjectsV2ProjectEditedChangesShortDescriptionX6da6c10e(block: InlineWebhookProjectsV2ProjectEditedChangesShortDescriptionX6da6c10e.Builder.() -> Unit): InlineWebhookProjectsV2ProjectEditedChangesShortDescriptionX6da6c10e = InlineWebhookProjectsV2ProjectEditedChangesShortDescriptionX6da6c10e.build(block)
