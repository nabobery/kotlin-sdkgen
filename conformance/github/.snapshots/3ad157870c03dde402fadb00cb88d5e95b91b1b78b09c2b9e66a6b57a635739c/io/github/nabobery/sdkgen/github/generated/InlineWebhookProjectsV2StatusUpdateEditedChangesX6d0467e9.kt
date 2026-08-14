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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-status-update-edited/properties/changes.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-status-update-edited/properties/changes
 */
@Serializable(with = InlineWebhookProjectsV2StatusUpdateEditedChangesX6d0467e9.Serializer::class)
public class InlineWebhookProjectsV2StatusUpdateEditedChangesX6d0467e9(
  public val body: InlineWebhookProjectsV2StatusUpdateEditedChangesBodyXa2a7204a? = null,
  public val startDate: InlineWebhookProjectsV2StatusUpdateEditedChangesStartDateXa0996846? = null,
  public val status: InlineWebhookProjectsV2StatusUpdateEditedChangesStatusXd3c983ef? = null,
  public val targetDate:
      InlineWebhookProjectsV2StatusUpdateEditedChangesTargetDateX73a98e2f? = null,
) {
  public class Builder {
    public var body: InlineWebhookProjectsV2StatusUpdateEditedChangesBodyXa2a7204a? = null

    public var startDate: InlineWebhookProjectsV2StatusUpdateEditedChangesStartDateXa0996846? = null

    public var status: InlineWebhookProjectsV2StatusUpdateEditedChangesStatusXd3c983ef? = null

    public var targetDate: InlineWebhookProjectsV2StatusUpdateEditedChangesTargetDateX73a98e2f? =
        null

    public fun build(): InlineWebhookProjectsV2StatusUpdateEditedChangesX6d0467e9 = InlineWebhookProjectsV2StatusUpdateEditedChangesX6d0467e9(
      body = body,
      startDate = startDate,
      status = status,
      targetDate = targetDate,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookProjectsV2StatusUpdateEditedChangesX6d0467e9 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookProjectsV2StatusUpdateEditedChangesX6d0467e9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookProjectsV2StatusUpdateEditedChangesX6d0467e9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookProjectsV2StatusUpdateEditedChangesX6d0467e9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookProjectsV2StatusUpdateEditedChangesX6d0467e9 must be a JSON object")
      return InlineWebhookProjectsV2StatusUpdateEditedChangesX6d0467e9(
        body = rawObject["body"]?.let { json.decodeFromJsonElement<InlineWebhookProjectsV2StatusUpdateEditedChangesBodyXa2a7204a>(it) },
        startDate = rawObject["start_date"]?.let { json.decodeFromJsonElement<InlineWebhookProjectsV2StatusUpdateEditedChangesStartDateXa0996846>(it) },
        status = rawObject["status"]?.let { json.decodeFromJsonElement<InlineWebhookProjectsV2StatusUpdateEditedChangesStatusXd3c983ef>(it) },
        targetDate = rawObject["target_date"]?.let { json.decodeFromJsonElement<InlineWebhookProjectsV2StatusUpdateEditedChangesTargetDateX73a98e2f>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectsV2StatusUpdateEditedChangesX6d0467e9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookProjectsV2StatusUpdateEditedChangesX6d0467e9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.body?.let { put("body", json.encodeToJsonElement(it)) }
        value.startDate?.let { put("start_date", json.encodeToJsonElement(it)) }
        value.status?.let { put("status", json.encodeToJsonElement(it)) }
        value.targetDate?.let { put("target_date", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookProjectsV2StatusUpdateEditedChangesX6d0467e9(block: InlineWebhookProjectsV2StatusUpdateEditedChangesX6d0467e9.Builder.() -> Unit): InlineWebhookProjectsV2StatusUpdateEditedChangesX6d0467e9 = InlineWebhookProjectsV2StatusUpdateEditedChangesX6d0467e9.build(block)
