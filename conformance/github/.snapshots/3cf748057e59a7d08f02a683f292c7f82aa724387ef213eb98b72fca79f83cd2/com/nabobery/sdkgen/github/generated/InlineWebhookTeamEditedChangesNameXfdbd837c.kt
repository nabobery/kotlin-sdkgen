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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-team-edited/properties/changes/properties/name.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-team-edited/properties/changes/properties/name
 */
@Serializable(with = InlineWebhookTeamEditedChangesNameXfdbd837c.Serializer::class)
public class InlineWebhookTeamEditedChangesNameXfdbd837c(
  /**
   * The previous version of the name if the action was `edited`.
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

    public fun build(): InlineWebhookTeamEditedChangesNameXfdbd837c {
      check(fromValue != null) { "from is required" }
      return InlineWebhookTeamEditedChangesNameXfdbd837c(
        from = from,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookTeamEditedChangesNameXfdbd837c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookTeamEditedChangesNameXfdbd837c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookTeamEditedChangesNameXfdbd837c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookTeamEditedChangesNameXfdbd837c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookTeamEditedChangesNameXfdbd837c must be a JSON object")
      val from = json.decodeRequired<String>(rawObject, "from")
      return InlineWebhookTeamEditedChangesNameXfdbd837c(
        from = from,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookTeamEditedChangesNameXfdbd837c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookTeamEditedChangesNameXfdbd837c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("from", value.from)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookTeamEditedChangesNameXfdbd837c(block: InlineWebhookTeamEditedChangesNameXfdbd837c.Builder.() -> Unit): InlineWebhookTeamEditedChangesNameXfdbd837c = InlineWebhookTeamEditedChangesNameXfdbd837c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookTeamEditedChangesNameXfdbd837c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
