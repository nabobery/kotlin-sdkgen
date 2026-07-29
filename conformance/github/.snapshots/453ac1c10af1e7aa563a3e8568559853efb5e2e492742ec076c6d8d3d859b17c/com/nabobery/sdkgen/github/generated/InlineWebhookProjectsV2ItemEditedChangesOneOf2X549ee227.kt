package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-item-edited/properties/changes/oneOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-item-edited/properties/changes/oneOf/1
 */
@Serializable(with = InlineWebhookProjectsV2ItemEditedChangesOneOf2X549ee227.Serializer::class)
public class InlineWebhookProjectsV2ItemEditedChangesOneOf2X549ee227(
  public val body: InlineWebhookProjectsV2ItemEditedChangesOneOf2BodyX829556db,
) {
  public class Builder {
    private var bodyValue: InlineWebhookProjectsV2ItemEditedChangesOneOf2BodyX829556db? = null

    public var body: InlineWebhookProjectsV2ItemEditedChangesOneOf2BodyX829556db
      get() = requireNotNull(bodyValue) { "body is required" }
      set(`value`) {
        bodyValue = value
      }

    public fun build(): InlineWebhookProjectsV2ItemEditedChangesOneOf2X549ee227 {
      check(bodyValue != null) { "body is required" }
      return InlineWebhookProjectsV2ItemEditedChangesOneOf2X549ee227(
        body = body,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookProjectsV2ItemEditedChangesOneOf2X549ee227 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookProjectsV2ItemEditedChangesOneOf2X549ee227> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookProjectsV2ItemEditedChangesOneOf2X549ee227 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookProjectsV2ItemEditedChangesOneOf2X549ee227")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookProjectsV2ItemEditedChangesOneOf2X549ee227 must be a JSON object")
      val body = json.decodeRequired<InlineWebhookProjectsV2ItemEditedChangesOneOf2BodyX829556db>(rawObject, "body")
      return InlineWebhookProjectsV2ItemEditedChangesOneOf2X549ee227(
        body = body,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectsV2ItemEditedChangesOneOf2X549ee227) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookProjectsV2ItemEditedChangesOneOf2X549ee227")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("body", json.encodeToJsonElement(value.body))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookProjectsV2ItemEditedChangesOneOf2X549ee227(block: InlineWebhookProjectsV2ItemEditedChangesOneOf2X549ee227.Builder.() -> Unit): InlineWebhookProjectsV2ItemEditedChangesOneOf2X549ee227 = InlineWebhookProjectsV2ItemEditedChangesOneOf2X549ee227.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookProjectsV2ItemEditedChangesOneOf2X549ee227 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
