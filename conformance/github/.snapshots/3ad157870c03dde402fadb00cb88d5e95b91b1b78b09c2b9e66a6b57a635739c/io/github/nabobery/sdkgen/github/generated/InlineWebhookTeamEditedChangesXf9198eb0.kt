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
 * The changes to the team if the action was `edited`.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-team-edited/properties/changes
 */
@Serializable(with = InlineWebhookTeamEditedChangesXf9198eb0.Serializer::class)
public class InlineWebhookTeamEditedChangesXf9198eb0(
  public val description: InlineWebhookTeamEditedChangesDescriptionX4de36715? = null,
  public val name: InlineWebhookTeamEditedChangesNameXfdbd837c? = null,
  public val notificationSetting:
      InlineWebhookTeamEditedChangesNotificationSettingX057a90f7? = null,
  public val privacy: InlineWebhookTeamEditedChangesPrivacyX9532737f? = null,
  public val repository: InlineWebhookTeamEditedChangesRepositoryX2218ee7b? = null,
) {
  public class Builder {
    public var description: InlineWebhookTeamEditedChangesDescriptionX4de36715? = null

    public var name: InlineWebhookTeamEditedChangesNameXfdbd837c? = null

    public var notificationSetting: InlineWebhookTeamEditedChangesNotificationSettingX057a90f7? =
        null

    public var privacy: InlineWebhookTeamEditedChangesPrivacyX9532737f? = null

    public var repository: InlineWebhookTeamEditedChangesRepositoryX2218ee7b? = null

    public fun build(): InlineWebhookTeamEditedChangesXf9198eb0 = InlineWebhookTeamEditedChangesXf9198eb0(
      description = description,
      name = name,
      notificationSetting = notificationSetting,
      privacy = privacy,
      repository = repository,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookTeamEditedChangesXf9198eb0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookTeamEditedChangesXf9198eb0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookTeamEditedChangesXf9198eb0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookTeamEditedChangesXf9198eb0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookTeamEditedChangesXf9198eb0 must be a JSON object")
      return InlineWebhookTeamEditedChangesXf9198eb0(
        description = rawObject["description"]?.let { json.decodeFromJsonElement<InlineWebhookTeamEditedChangesDescriptionX4de36715>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<InlineWebhookTeamEditedChangesNameXfdbd837c>(it) },
        notificationSetting = rawObject["notification_setting"]?.let { json.decodeFromJsonElement<InlineWebhookTeamEditedChangesNotificationSettingX057a90f7>(it) },
        privacy = rawObject["privacy"]?.let { json.decodeFromJsonElement<InlineWebhookTeamEditedChangesPrivacyX9532737f>(it) },
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<InlineWebhookTeamEditedChangesRepositoryX2218ee7b>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookTeamEditedChangesXf9198eb0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookTeamEditedChangesXf9198eb0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.description?.let { put("description", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", json.encodeToJsonElement(it)) }
        value.notificationSetting?.let { put("notification_setting", json.encodeToJsonElement(it)) }
        value.privacy?.let { put("privacy", json.encodeToJsonElement(it)) }
        value.repository?.let { put("repository", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookTeamEditedChangesXf9198eb0(block: InlineWebhookTeamEditedChangesXf9198eb0.Builder.() -> Unit): InlineWebhookTeamEditedChangesXf9198eb0 = InlineWebhookTeamEditedChangesXf9198eb0.build(block)
