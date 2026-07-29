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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-team-edited/properties/changes/properties/repository/propert
 * ies/permissions.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-team-edited/properties/changes/properties/repository/propert
 * ies/permissions
 */
@Serializable(with = InlineWebhookTeamEditedChangesRepositoryPermissionsX511346a8.Serializer::class)
public class InlineWebhookTeamEditedChangesRepositoryPermissionsX511346a8(
  public val from: InlineWebhookTeamEditedChangesRepositoryPermissionsFromX2bece614,
) {
  public class Builder {
    private var fromValue: InlineWebhookTeamEditedChangesRepositoryPermissionsFromX2bece614? = null

    public var from: InlineWebhookTeamEditedChangesRepositoryPermissionsFromX2bece614
      get() = requireNotNull(fromValue) { "from is required" }
      set(`value`) {
        fromValue = value
      }

    public fun build(): InlineWebhookTeamEditedChangesRepositoryPermissionsX511346a8 {
      check(fromValue != null) { "from is required" }
      return InlineWebhookTeamEditedChangesRepositoryPermissionsX511346a8(
        from = from,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookTeamEditedChangesRepositoryPermissionsX511346a8 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookTeamEditedChangesRepositoryPermissionsX511346a8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookTeamEditedChangesRepositoryPermissionsX511346a8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookTeamEditedChangesRepositoryPermissionsX511346a8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookTeamEditedChangesRepositoryPermissionsX511346a8 must be a JSON object")
      val from = json.decodeRequired<InlineWebhookTeamEditedChangesRepositoryPermissionsFromX2bece614>(rawObject, "from")
      return InlineWebhookTeamEditedChangesRepositoryPermissionsX511346a8(
        from = from,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookTeamEditedChangesRepositoryPermissionsX511346a8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookTeamEditedChangesRepositoryPermissionsX511346a8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("from", json.encodeToJsonElement(value.from))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookTeamEditedChangesRepositoryPermissionsX511346a8(block: InlineWebhookTeamEditedChangesRepositoryPermissionsX511346a8.Builder.() -> Unit): InlineWebhookTeamEditedChangesRepositoryPermissionsX511346a8 = InlineWebhookTeamEditedChangesRepositoryPermissionsX511346a8.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookTeamEditedChangesRepositoryPermissionsX511346a8 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
