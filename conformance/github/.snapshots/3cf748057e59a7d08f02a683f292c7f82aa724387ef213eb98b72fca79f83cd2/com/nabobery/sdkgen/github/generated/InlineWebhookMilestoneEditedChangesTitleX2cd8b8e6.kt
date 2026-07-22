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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-milestone-edited/properties/changes/properties/title.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-milestone-edited/properties/changes/properties/title
 */
@Serializable(with = InlineWebhookMilestoneEditedChangesTitleX2cd8b8e6.Serializer::class)
public class InlineWebhookMilestoneEditedChangesTitleX2cd8b8e6(
  /**
   * The previous version of the title if the action was `edited`.
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

    public fun build(): InlineWebhookMilestoneEditedChangesTitleX2cd8b8e6 {
      check(fromValue != null) { "from is required" }
      return InlineWebhookMilestoneEditedChangesTitleX2cd8b8e6(
        from = from,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookMilestoneEditedChangesTitleX2cd8b8e6 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookMilestoneEditedChangesTitleX2cd8b8e6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookMilestoneEditedChangesTitleX2cd8b8e6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookMilestoneEditedChangesTitleX2cd8b8e6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookMilestoneEditedChangesTitleX2cd8b8e6 must be a JSON object")
      val from = json.decodeRequired<String>(rawObject, "from")
      return InlineWebhookMilestoneEditedChangesTitleX2cd8b8e6(
        from = from,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookMilestoneEditedChangesTitleX2cd8b8e6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookMilestoneEditedChangesTitleX2cd8b8e6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("from", value.from)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookMilestoneEditedChangesTitleX2cd8b8e6(block: InlineWebhookMilestoneEditedChangesTitleX2cd8b8e6.Builder.() -> Unit): InlineWebhookMilestoneEditedChangesTitleX2cd8b8e6 = InlineWebhookMilestoneEditedChangesTitleX2cd8b8e6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookMilestoneEditedChangesTitleX2cd8b8e6 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
