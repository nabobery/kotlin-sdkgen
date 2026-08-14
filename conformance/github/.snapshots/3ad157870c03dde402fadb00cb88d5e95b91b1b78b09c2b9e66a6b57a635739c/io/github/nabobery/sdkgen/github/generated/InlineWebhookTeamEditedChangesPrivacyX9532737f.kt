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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-team-edited/properties/changes/properties/privacy.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-team-edited/properties/changes/properties/privacy
 */
@Serializable(with = InlineWebhookTeamEditedChangesPrivacyX9532737f.Serializer::class)
public class InlineWebhookTeamEditedChangesPrivacyX9532737f(
  /**
   * The previous version of the team's privacy if the action was `edited`.
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

    public fun build(): InlineWebhookTeamEditedChangesPrivacyX9532737f {
      check(fromValue != null) { "from is required" }
      return InlineWebhookTeamEditedChangesPrivacyX9532737f(
        from = from,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookTeamEditedChangesPrivacyX9532737f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookTeamEditedChangesPrivacyX9532737f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookTeamEditedChangesPrivacyX9532737f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookTeamEditedChangesPrivacyX9532737f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookTeamEditedChangesPrivacyX9532737f must be a JSON object")
      val from = json.decodeRequired<String>(rawObject, "from")
      return InlineWebhookTeamEditedChangesPrivacyX9532737f(
        from = from,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookTeamEditedChangesPrivacyX9532737f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookTeamEditedChangesPrivacyX9532737f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("from", value.from)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookTeamEditedChangesPrivacyX9532737f(block: InlineWebhookTeamEditedChangesPrivacyX9532737f.Builder.() -> Unit): InlineWebhookTeamEditedChangesPrivacyX9532737f = InlineWebhookTeamEditedChangesPrivacyX9532737f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookTeamEditedChangesPrivacyX9532737f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
