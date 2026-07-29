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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-sponsorship-edited/properties/changes/properties/privacy_lev
 * el.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-sponsorship-edited/properties/changes/properties/privacy_lev
 * el
 */
@Serializable(with = InlineWebhookSponsorshipEditedChangesPrivacyLevelX6ad479af.Serializer::class)
public class InlineWebhookSponsorshipEditedChangesPrivacyLevelX6ad479af(
  /**
   * The `edited` event types include the details about the change when someone edits a sponsorship to change the
   * privacy.
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

    public fun build(): InlineWebhookSponsorshipEditedChangesPrivacyLevelX6ad479af {
      check(fromValue != null) { "from is required" }
      return InlineWebhookSponsorshipEditedChangesPrivacyLevelX6ad479af(
        from = from,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookSponsorshipEditedChangesPrivacyLevelX6ad479af = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookSponsorshipEditedChangesPrivacyLevelX6ad479af> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookSponsorshipEditedChangesPrivacyLevelX6ad479af {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookSponsorshipEditedChangesPrivacyLevelX6ad479af")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookSponsorshipEditedChangesPrivacyLevelX6ad479af must be a JSON object")
      val from = json.decodeRequired<String>(rawObject, "from")
      return InlineWebhookSponsorshipEditedChangesPrivacyLevelX6ad479af(
        from = from,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookSponsorshipEditedChangesPrivacyLevelX6ad479af) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookSponsorshipEditedChangesPrivacyLevelX6ad479af")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("from", value.from)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookSponsorshipEditedChangesPrivacyLevelX6ad479af(block: InlineWebhookSponsorshipEditedChangesPrivacyLevelX6ad479af.Builder.() -> Unit): InlineWebhookSponsorshipEditedChangesPrivacyLevelX6ad479af = InlineWebhookSponsorshipEditedChangesPrivacyLevelX6ad479af.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookSponsorshipEditedChangesPrivacyLevelX6ad479af is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
