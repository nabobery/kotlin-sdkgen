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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-project-edited/properties/changes/properties/body.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-project-edited/properties/changes/properties/body
 */
@Serializable(with = InlineWebhookProjectEditedChangesBodyX75165026.Serializer::class)
public class InlineWebhookProjectEditedChangesBodyX75165026(
  /**
   * The previous version of the body if the action was `edited`.
   */
  public val from: String,
) {
  public class Builder {
    private var fromValue: String? = null

    public var from: String
      get() = requireNotNull(fromValue) { "from is required" }
      set(`value`) {
        fromValue = value
      }

    public fun build(): InlineWebhookProjectEditedChangesBodyX75165026 {
      check(fromValue != null) { "from is required" }
      return InlineWebhookProjectEditedChangesBodyX75165026(
        from = from,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookProjectEditedChangesBodyX75165026 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookProjectEditedChangesBodyX75165026> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookProjectEditedChangesBodyX75165026 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookProjectEditedChangesBodyX75165026")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookProjectEditedChangesBodyX75165026 must be a JSON object")
      val from = json.decodeRequired<String>(rawObject, "from")
      return InlineWebhookProjectEditedChangesBodyX75165026(
        from = from,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectEditedChangesBodyX75165026) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookProjectEditedChangesBodyX75165026")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("from", value.from)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookProjectEditedChangesBodyX75165026(block: InlineWebhookProjectEditedChangesBodyX75165026.Builder.() -> Unit): InlineWebhookProjectEditedChangesBodyX75165026 = InlineWebhookProjectEditedChangesBodyX75165026.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookProjectEditedChangesBodyX75165026 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
