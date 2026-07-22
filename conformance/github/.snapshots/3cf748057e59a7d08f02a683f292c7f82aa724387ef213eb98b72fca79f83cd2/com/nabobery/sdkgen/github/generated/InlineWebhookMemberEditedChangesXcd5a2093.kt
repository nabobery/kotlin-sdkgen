package com.nabobery.sdkgen.github.generated

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
 * The changes to the collaborator permissions
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-member-edited/properties/changes
 */
@Serializable(with = InlineWebhookMemberEditedChangesXcd5a2093.Serializer::class)
public class InlineWebhookMemberEditedChangesXcd5a2093(
  public val oldPermission: InlineWebhookMemberEditedChangesOldPermissionXf6bc1b47? = null,
  public val permission: InlineWebhookMemberEditedChangesPermissionX58922c1b? = null,
) {
  public class Builder {
    public var oldPermission: InlineWebhookMemberEditedChangesOldPermissionXf6bc1b47? = null

    public var permission: InlineWebhookMemberEditedChangesPermissionX58922c1b? = null

    public fun build(): InlineWebhookMemberEditedChangesXcd5a2093 = InlineWebhookMemberEditedChangesXcd5a2093(
      oldPermission = oldPermission,
      permission = permission,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookMemberEditedChangesXcd5a2093 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookMemberEditedChangesXcd5a2093> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookMemberEditedChangesXcd5a2093 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookMemberEditedChangesXcd5a2093")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookMemberEditedChangesXcd5a2093 must be a JSON object")
      return InlineWebhookMemberEditedChangesXcd5a2093(
        oldPermission = rawObject["old_permission"]?.let { json.decodeFromJsonElement<InlineWebhookMemberEditedChangesOldPermissionXf6bc1b47>(it) },
        permission = rawObject["permission"]?.let { json.decodeFromJsonElement<InlineWebhookMemberEditedChangesPermissionX58922c1b>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookMemberEditedChangesXcd5a2093) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookMemberEditedChangesXcd5a2093")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.oldPermission?.let { put("old_permission", json.encodeToJsonElement(it)) }
        value.permission?.let { put("permission", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookMemberEditedChangesXcd5a2093(block: InlineWebhookMemberEditedChangesXcd5a2093.Builder.() -> Unit): InlineWebhookMemberEditedChangesXcd5a2093 = InlineWebhookMemberEditedChangesXcd5a2093.build(block)
