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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-team-edited/properties/changes/properties/description.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-team-edited/properties/changes/properties/description
 */
@Serializable(with = InlineWebhookTeamEditedChangesDescriptionX4de36715.Serializer::class)
public class InlineWebhookTeamEditedChangesDescriptionX4de36715(
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

    public fun build(): InlineWebhookTeamEditedChangesDescriptionX4de36715 {
      check(fromValue != null) { "from is required" }
      return InlineWebhookTeamEditedChangesDescriptionX4de36715(
        from = from,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookTeamEditedChangesDescriptionX4de36715 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookTeamEditedChangesDescriptionX4de36715> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookTeamEditedChangesDescriptionX4de36715 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookTeamEditedChangesDescriptionX4de36715")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookTeamEditedChangesDescriptionX4de36715 must be a JSON object")
      val from = json.decodeRequired<String>(rawObject, "from")
      return InlineWebhookTeamEditedChangesDescriptionX4de36715(
        from = from,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookTeamEditedChangesDescriptionX4de36715) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookTeamEditedChangesDescriptionX4de36715")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("from", value.from)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookTeamEditedChangesDescriptionX4de36715(block: InlineWebhookTeamEditedChangesDescriptionX4de36715.Builder.() -> Unit): InlineWebhookTeamEditedChangesDescriptionX4de36715 = InlineWebhookTeamEditedChangesDescriptionX4de36715.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookTeamEditedChangesDescriptionX4de36715 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
