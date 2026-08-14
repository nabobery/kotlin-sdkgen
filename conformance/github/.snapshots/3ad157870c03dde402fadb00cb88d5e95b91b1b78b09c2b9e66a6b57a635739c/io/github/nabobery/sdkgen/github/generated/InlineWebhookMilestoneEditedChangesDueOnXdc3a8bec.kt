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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-milestone-edited/properties/changes/properties/due_on.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-milestone-edited/properties/changes/properties/due_on
 */
@Serializable(with = InlineWebhookMilestoneEditedChangesDueOnXdc3a8bec.Serializer::class)
public class InlineWebhookMilestoneEditedChangesDueOnXdc3a8bec(
  /**
   * The previous version of the due date if the action was `edited`.
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

    public fun build(): InlineWebhookMilestoneEditedChangesDueOnXdc3a8bec {
      check(fromValue != null) { "from is required" }
      return InlineWebhookMilestoneEditedChangesDueOnXdc3a8bec(
        from = from,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookMilestoneEditedChangesDueOnXdc3a8bec = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookMilestoneEditedChangesDueOnXdc3a8bec> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookMilestoneEditedChangesDueOnXdc3a8bec {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookMilestoneEditedChangesDueOnXdc3a8bec")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookMilestoneEditedChangesDueOnXdc3a8bec must be a JSON object")
      val from = json.decodeRequired<String>(rawObject, "from")
      return InlineWebhookMilestoneEditedChangesDueOnXdc3a8bec(
        from = from,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookMilestoneEditedChangesDueOnXdc3a8bec) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookMilestoneEditedChangesDueOnXdc3a8bec")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("from", value.from)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookMilestoneEditedChangesDueOnXdc3a8bec(block: InlineWebhookMilestoneEditedChangesDueOnXdc3a8bec.Builder.() -> Unit): InlineWebhookMilestoneEditedChangesDueOnXdc3a8bec = InlineWebhookMilestoneEditedChangesDueOnXdc3a8bec.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookMilestoneEditedChangesDueOnXdc3a8bec is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
