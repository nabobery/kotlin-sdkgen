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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-label-edited/properties/changes/properties/color.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-label-edited/properties/changes/properties/color
 */
@Serializable(with = InlineWebhookLabelEditedChangesColorX66e802fa.Serializer::class)
public class InlineWebhookLabelEditedChangesColorX66e802fa(
  /**
   * The previous version of the color if the action was `edited`.
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

    public fun build(): InlineWebhookLabelEditedChangesColorX66e802fa {
      check(fromValue != null) { "from is required" }
      return InlineWebhookLabelEditedChangesColorX66e802fa(
        from = from,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookLabelEditedChangesColorX66e802fa = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookLabelEditedChangesColorX66e802fa> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookLabelEditedChangesColorX66e802fa {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookLabelEditedChangesColorX66e802fa")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookLabelEditedChangesColorX66e802fa must be a JSON object")
      val from = json.decodeRequired<String>(rawObject, "from")
      return InlineWebhookLabelEditedChangesColorX66e802fa(
        from = from,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookLabelEditedChangesColorX66e802fa) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookLabelEditedChangesColorX66e802fa")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("from", value.from)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookLabelEditedChangesColorX66e802fa(block: InlineWebhookLabelEditedChangesColorX66e802fa.Builder.() -> Unit): InlineWebhookLabelEditedChangesColorX66e802fa = InlineWebhookLabelEditedChangesColorX66e802fa.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookLabelEditedChangesColorX66e802fa is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
