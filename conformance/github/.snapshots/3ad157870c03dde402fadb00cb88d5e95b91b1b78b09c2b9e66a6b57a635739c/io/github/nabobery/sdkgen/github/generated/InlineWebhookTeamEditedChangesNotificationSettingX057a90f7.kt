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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-team-edited/properties/changes/properties/notification_setti
 * ng.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-team-edited/properties/changes/properties/notification_setti
 * ng
 */
@Serializable(with = InlineWebhookTeamEditedChangesNotificationSettingX057a90f7.Serializer::class)
public class InlineWebhookTeamEditedChangesNotificationSettingX057a90f7(
  /**
   * The previous version of the team's notification setting if the action was `edited`.
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

    public fun build(): InlineWebhookTeamEditedChangesNotificationSettingX057a90f7 {
      check(fromValue != null) { "from is required" }
      return InlineWebhookTeamEditedChangesNotificationSettingX057a90f7(
        from = from,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookTeamEditedChangesNotificationSettingX057a90f7 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookTeamEditedChangesNotificationSettingX057a90f7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookTeamEditedChangesNotificationSettingX057a90f7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookTeamEditedChangesNotificationSettingX057a90f7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookTeamEditedChangesNotificationSettingX057a90f7 must be a JSON object")
      val from = json.decodeRequired<String>(rawObject, "from")
      return InlineWebhookTeamEditedChangesNotificationSettingX057a90f7(
        from = from,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookTeamEditedChangesNotificationSettingX057a90f7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookTeamEditedChangesNotificationSettingX057a90f7")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("from", value.from)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookTeamEditedChangesNotificationSettingX057a90f7(block: InlineWebhookTeamEditedChangesNotificationSettingX057a90f7.Builder.() -> Unit): InlineWebhookTeamEditedChangesNotificationSettingX057a90f7 = InlineWebhookTeamEditedChangesNotificationSettingX057a90f7.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookTeamEditedChangesNotificationSettingX057a90f7 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
