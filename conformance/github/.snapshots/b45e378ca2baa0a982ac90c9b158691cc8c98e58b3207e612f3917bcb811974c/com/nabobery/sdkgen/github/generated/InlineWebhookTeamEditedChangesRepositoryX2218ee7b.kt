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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-team-edited/properties/changes/properties/repository.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-team-edited/properties/changes/properties/repository
 */
@Serializable(with = InlineWebhookTeamEditedChangesRepositoryX2218ee7b.Serializer::class)
public class InlineWebhookTeamEditedChangesRepositoryX2218ee7b(
  public val permissions: InlineWebhookTeamEditedChangesRepositoryPermissionsX511346a8,
) {
  public class Builder {
    private var permissionsValue: InlineWebhookTeamEditedChangesRepositoryPermissionsX511346a8? =
        null

    public var permissions: InlineWebhookTeamEditedChangesRepositoryPermissionsX511346a8
      get() = requireNotNull(permissionsValue) { "permissions is required" }
      set(`value`) {
        permissionsValue = value
      }

    public fun build(): InlineWebhookTeamEditedChangesRepositoryX2218ee7b {
      check(permissionsValue != null) { "permissions is required" }
      return InlineWebhookTeamEditedChangesRepositoryX2218ee7b(
        permissions = permissions,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookTeamEditedChangesRepositoryX2218ee7b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookTeamEditedChangesRepositoryX2218ee7b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookTeamEditedChangesRepositoryX2218ee7b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookTeamEditedChangesRepositoryX2218ee7b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookTeamEditedChangesRepositoryX2218ee7b must be a JSON object")
      val permissions = json.decodeRequired<InlineWebhookTeamEditedChangesRepositoryPermissionsX511346a8>(rawObject, "permissions")
      return InlineWebhookTeamEditedChangesRepositoryX2218ee7b(
        permissions = permissions,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookTeamEditedChangesRepositoryX2218ee7b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookTeamEditedChangesRepositoryX2218ee7b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("permissions", json.encodeToJsonElement(value.permissions))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookTeamEditedChangesRepositoryX2218ee7b(block: InlineWebhookTeamEditedChangesRepositoryX2218ee7b.Builder.() -> Unit): InlineWebhookTeamEditedChangesRepositoryX2218ee7b = InlineWebhookTeamEditedChangesRepositoryX2218ee7b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookTeamEditedChangesRepositoryX2218ee7b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
