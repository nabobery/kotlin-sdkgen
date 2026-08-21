package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-status-update-edited/properties/changes/properti
 * es/status.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-status-update-edited/properties/changes/properti
 * es/status
 */
@Serializable(with = InlineWebhookProjectsV2StatusUpdateEditedChangesStatusXd3c983ef.Serializer::class)
public class InlineWebhookProjectsV2StatusUpdateEditedChangesStatusXd3c983ef(
  public val from: InlineWebhookProjectsV2StatusUpdateEditedChangesStatusFromX2878c7a4? = null,
  public val to: InlineWebhookProjectsV2StatusUpdateEditedChangesStatusToX30f970d8? = null,
) {
  public class Builder {
    public var from: InlineWebhookProjectsV2StatusUpdateEditedChangesStatusFromX2878c7a4? = null

    public var to: InlineWebhookProjectsV2StatusUpdateEditedChangesStatusToX30f970d8? = null

    public fun build(): InlineWebhookProjectsV2StatusUpdateEditedChangesStatusXd3c983ef = InlineWebhookProjectsV2StatusUpdateEditedChangesStatusXd3c983ef(
      from = from,
      to = to,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookProjectsV2StatusUpdateEditedChangesStatusXd3c983ef = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookProjectsV2StatusUpdateEditedChangesStatusXd3c983ef> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookProjectsV2StatusUpdateEditedChangesStatusXd3c983ef {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookProjectsV2StatusUpdateEditedChangesStatusXd3c983ef")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookProjectsV2StatusUpdateEditedChangesStatusXd3c983ef must be a JSON object")
      return InlineWebhookProjectsV2StatusUpdateEditedChangesStatusXd3c983ef(
        from = rawObject["from"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookProjectsV2StatusUpdateEditedChangesStatusFromX2878c7a4?>(element) },
        to = rawObject["to"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookProjectsV2StatusUpdateEditedChangesStatusToX30f970d8?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectsV2StatusUpdateEditedChangesStatusXd3c983ef) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookProjectsV2StatusUpdateEditedChangesStatusXd3c983ef")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.from?.let { put("from", json.encodeToJsonElement(it)) }
        value.to?.let { put("to", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookProjectsV2StatusUpdateEditedChangesStatusXd3c983ef(block: InlineWebhookProjectsV2StatusUpdateEditedChangesStatusXd3c983ef.Builder.() -> Unit): InlineWebhookProjectsV2StatusUpdateEditedChangesStatusXd3c983ef = InlineWebhookProjectsV2StatusUpdateEditedChangesStatusXd3c983ef.build(block)
