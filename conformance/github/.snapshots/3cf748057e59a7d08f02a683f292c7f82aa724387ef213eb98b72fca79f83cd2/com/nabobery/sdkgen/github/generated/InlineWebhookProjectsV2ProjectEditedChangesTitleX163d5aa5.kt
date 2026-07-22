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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-project-edited/properties/changes/properties/tit
 * le.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-project-edited/properties/changes/properties/tit
 * le
 */
@Serializable(with = InlineWebhookProjectsV2ProjectEditedChangesTitleX163d5aa5.Serializer::class)
public class InlineWebhookProjectsV2ProjectEditedChangesTitleX163d5aa5(
  public val from: String? = null,
  public val to: String? = null,
) {
  public class Builder {
    public var from: String? = null

    public var to: String? = null

    public fun build(): InlineWebhookProjectsV2ProjectEditedChangesTitleX163d5aa5 = InlineWebhookProjectsV2ProjectEditedChangesTitleX163d5aa5(
      from = from,
      to = to,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookProjectsV2ProjectEditedChangesTitleX163d5aa5 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookProjectsV2ProjectEditedChangesTitleX163d5aa5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookProjectsV2ProjectEditedChangesTitleX163d5aa5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookProjectsV2ProjectEditedChangesTitleX163d5aa5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookProjectsV2ProjectEditedChangesTitleX163d5aa5 must be a JSON object")
      return InlineWebhookProjectsV2ProjectEditedChangesTitleX163d5aa5(
        from = rawObject["from"]?.let { json.decodeFromJsonElement<String>(it) },
        to = rawObject["to"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectsV2ProjectEditedChangesTitleX163d5aa5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookProjectsV2ProjectEditedChangesTitleX163d5aa5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.from?.let { put("from", it) }
        value.to?.let { put("to", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookProjectsV2ProjectEditedChangesTitleX163d5aa5(block: InlineWebhookProjectsV2ProjectEditedChangesTitleX163d5aa5.Builder.() -> Unit): InlineWebhookProjectsV2ProjectEditedChangesTitleX163d5aa5 = InlineWebhookProjectsV2ProjectEditedChangesTitleX163d5aa5.build(block)
