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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-project-edited/properties/changes/properties/des
 * cription.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-project-edited/properties/changes/properties/des
 * cription
 */
@Serializable(with = InlineWebhookProjectsV2ProjectEditedChangesDescriptionX1774d45e.Serializer::class)
public class InlineWebhookProjectsV2ProjectEditedChangesDescriptionX1774d45e(
  public val from: String? = null,
  public val to: String? = null,
) {
  public class Builder {
    public var from: String? = null

    public var to: String? = null

    public fun build(): InlineWebhookProjectsV2ProjectEditedChangesDescriptionX1774d45e = InlineWebhookProjectsV2ProjectEditedChangesDescriptionX1774d45e(
      from = from,
      to = to,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookProjectsV2ProjectEditedChangesDescriptionX1774d45e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookProjectsV2ProjectEditedChangesDescriptionX1774d45e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookProjectsV2ProjectEditedChangesDescriptionX1774d45e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookProjectsV2ProjectEditedChangesDescriptionX1774d45e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookProjectsV2ProjectEditedChangesDescriptionX1774d45e must be a JSON object")
      return InlineWebhookProjectsV2ProjectEditedChangesDescriptionX1774d45e(
        from = rawObject["from"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        to = rawObject["to"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectsV2ProjectEditedChangesDescriptionX1774d45e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookProjectsV2ProjectEditedChangesDescriptionX1774d45e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.from?.let { put("from", it) }
        value.to?.let { put("to", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookProjectsV2ProjectEditedChangesDescriptionX1774d45e(block: InlineWebhookProjectsV2ProjectEditedChangesDescriptionX1774d45e.Builder.() -> Unit): InlineWebhookProjectsV2ProjectEditedChangesDescriptionX1774d45e = InlineWebhookProjectsV2ProjectEditedChangesDescriptionX1774d45e.build(block)
