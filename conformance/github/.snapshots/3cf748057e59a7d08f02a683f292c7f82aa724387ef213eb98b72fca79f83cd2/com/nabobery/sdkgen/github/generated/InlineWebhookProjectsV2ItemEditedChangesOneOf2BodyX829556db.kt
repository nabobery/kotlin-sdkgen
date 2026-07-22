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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-item-edited/properties/changes/oneOf/1/propertie
 * s/body.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-item-edited/properties/changes/oneOf/1/propertie
 * s/body
 */
@Serializable(with = InlineWebhookProjectsV2ItemEditedChangesOneOf2BodyX829556db.Serializer::class)
public class InlineWebhookProjectsV2ItemEditedChangesOneOf2BodyX829556db(
  public val from: String? = null,
  public val to: String? = null,
) {
  public class Builder {
    public var from: String? = null

    public var to: String? = null

    public fun build(): InlineWebhookProjectsV2ItemEditedChangesOneOf2BodyX829556db = InlineWebhookProjectsV2ItemEditedChangesOneOf2BodyX829556db(
      from = from,
      to = to,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookProjectsV2ItemEditedChangesOneOf2BodyX829556db = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookProjectsV2ItemEditedChangesOneOf2BodyX829556db> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookProjectsV2ItemEditedChangesOneOf2BodyX829556db {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookProjectsV2ItemEditedChangesOneOf2BodyX829556db")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookProjectsV2ItemEditedChangesOneOf2BodyX829556db must be a JSON object")
      return InlineWebhookProjectsV2ItemEditedChangesOneOf2BodyX829556db(
        from = rawObject["from"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        to = rawObject["to"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectsV2ItemEditedChangesOneOf2BodyX829556db) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookProjectsV2ItemEditedChangesOneOf2BodyX829556db")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.from?.let { put("from", it) }
        value.to?.let { put("to", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookProjectsV2ItemEditedChangesOneOf2BodyX829556db(block: InlineWebhookProjectsV2ItemEditedChangesOneOf2BodyX829556db.Builder.() -> Unit): InlineWebhookProjectsV2ItemEditedChangesOneOf2BodyX829556db = InlineWebhookProjectsV2ItemEditedChangesOneOf2BodyX829556db.build(block)
