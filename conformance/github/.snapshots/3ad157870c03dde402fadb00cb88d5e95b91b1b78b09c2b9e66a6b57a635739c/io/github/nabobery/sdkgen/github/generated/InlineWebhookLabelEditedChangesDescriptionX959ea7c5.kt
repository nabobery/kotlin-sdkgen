package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-label-edited/properties/changes/properties/description.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-label-edited/properties/changes/properties/description
 */
@Serializable(with = InlineWebhookLabelEditedChangesDescriptionX959ea7c5.Serializer::class)
public class InlineWebhookLabelEditedChangesDescriptionX959ea7c5(
  /**
   * The previous version of the description if the action was `edited`.
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

    public fun build(): InlineWebhookLabelEditedChangesDescriptionX959ea7c5 {
      check(fromValue != null) { "from is required" }
      return InlineWebhookLabelEditedChangesDescriptionX959ea7c5(
        from = from,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookLabelEditedChangesDescriptionX959ea7c5 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookLabelEditedChangesDescriptionX959ea7c5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookLabelEditedChangesDescriptionX959ea7c5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookLabelEditedChangesDescriptionX959ea7c5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookLabelEditedChangesDescriptionX959ea7c5 must be a JSON object")
      val from = json.decodeRequired<String>(rawObject, "from")
      return InlineWebhookLabelEditedChangesDescriptionX959ea7c5(
        from = from,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookLabelEditedChangesDescriptionX959ea7c5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookLabelEditedChangesDescriptionX959ea7c5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("from", value.from)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookLabelEditedChangesDescriptionX959ea7c5(block: InlineWebhookLabelEditedChangesDescriptionX959ea7c5.Builder.() -> Unit): InlineWebhookLabelEditedChangesDescriptionX959ea7c5 = InlineWebhookLabelEditedChangesDescriptionX959ea7c5.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookLabelEditedChangesDescriptionX959ea7c5 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
