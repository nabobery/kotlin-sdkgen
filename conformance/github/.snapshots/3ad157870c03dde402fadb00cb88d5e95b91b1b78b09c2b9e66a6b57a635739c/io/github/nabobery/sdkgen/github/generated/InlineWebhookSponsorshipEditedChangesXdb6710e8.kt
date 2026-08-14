package io.github.nabobery.sdkgen.github.generated

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-sponsorship-edited/properties/changes.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-sponsorship-edited/properties/changes
 */
@Serializable(with = InlineWebhookSponsorshipEditedChangesXdb6710e8.Serializer::class)
public class InlineWebhookSponsorshipEditedChangesXdb6710e8(
  public val privacyLevel: InlineWebhookSponsorshipEditedChangesPrivacyLevelX6ad479af? = null,
) {
  public class Builder {
    public var privacyLevel: InlineWebhookSponsorshipEditedChangesPrivacyLevelX6ad479af? = null

    public fun build(): InlineWebhookSponsorshipEditedChangesXdb6710e8 = InlineWebhookSponsorshipEditedChangesXdb6710e8(
      privacyLevel = privacyLevel,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookSponsorshipEditedChangesXdb6710e8 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookSponsorshipEditedChangesXdb6710e8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookSponsorshipEditedChangesXdb6710e8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookSponsorshipEditedChangesXdb6710e8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookSponsorshipEditedChangesXdb6710e8 must be a JSON object")
      return InlineWebhookSponsorshipEditedChangesXdb6710e8(
        privacyLevel = rawObject["privacy_level"]?.let { json.decodeFromJsonElement<InlineWebhookSponsorshipEditedChangesPrivacyLevelX6ad479af>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookSponsorshipEditedChangesXdb6710e8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookSponsorshipEditedChangesXdb6710e8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.privacyLevel?.let { put("privacy_level", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookSponsorshipEditedChangesXdb6710e8(block: InlineWebhookSponsorshipEditedChangesXdb6710e8.Builder.() -> Unit): InlineWebhookSponsorshipEditedChangesXdb6710e8 = InlineWebhookSponsorshipEditedChangesXdb6710e8.build(block)
