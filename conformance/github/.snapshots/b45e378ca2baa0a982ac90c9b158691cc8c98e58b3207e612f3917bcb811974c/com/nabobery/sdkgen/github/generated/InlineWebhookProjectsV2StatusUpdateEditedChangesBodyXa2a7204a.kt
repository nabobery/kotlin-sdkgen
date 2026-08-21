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
 * es/body.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-status-update-edited/properties/changes/properti
 * es/body
 */
@Serializable(with = InlineWebhookProjectsV2StatusUpdateEditedChangesBodyXa2a7204a.Serializer::class)
public class InlineWebhookProjectsV2StatusUpdateEditedChangesBodyXa2a7204a(
  public val from: String? = null,
  public val to: String? = null,
) {
  public class Builder {
    public var from: String? = null

    public var to: String? = null

    public fun build(): InlineWebhookProjectsV2StatusUpdateEditedChangesBodyXa2a7204a = InlineWebhookProjectsV2StatusUpdateEditedChangesBodyXa2a7204a(
      from = from,
      to = to,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookProjectsV2StatusUpdateEditedChangesBodyXa2a7204a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookProjectsV2StatusUpdateEditedChangesBodyXa2a7204a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookProjectsV2StatusUpdateEditedChangesBodyXa2a7204a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookProjectsV2StatusUpdateEditedChangesBodyXa2a7204a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookProjectsV2StatusUpdateEditedChangesBodyXa2a7204a must be a JSON object")
      return InlineWebhookProjectsV2StatusUpdateEditedChangesBodyXa2a7204a(
        from = rawObject["from"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        to = rawObject["to"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectsV2StatusUpdateEditedChangesBodyXa2a7204a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookProjectsV2StatusUpdateEditedChangesBodyXa2a7204a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.from?.let { put("from", it) }
        value.to?.let { put("to", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookProjectsV2StatusUpdateEditedChangesBodyXa2a7204a(block: InlineWebhookProjectsV2StatusUpdateEditedChangesBodyXa2a7204a.Builder.() -> Unit): InlineWebhookProjectsV2StatusUpdateEditedChangesBodyXa2a7204a = InlineWebhookProjectsV2StatusUpdateEditedChangesBodyXa2a7204a.build(block)
