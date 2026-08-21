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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-member-added/properties/changes.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-member-added/properties/changes
 */
@Serializable(with = InlineWebhookMemberAddedChangesX625a99c9.Serializer::class)
public class InlineWebhookMemberAddedChangesX625a99c9(
  /**
   * This field is included for legacy purposes; use the `role_name` field instead. The `maintain`
   * role is mapped to `write` and the `triage` role is mapped to `read`. To determine the role
   * assigned to the collaborator, use the `role_name` field instead, which will provide the full
   * role name, including custom roles.
   */
  public val permission: InlineWebhookMemberAddedChangesPermissionX6e1c26ff? = null,
  /**
   * The role assigned to the collaborator.
   */
  public val roleName: InlineWebhookMemberAddedChangesRoleNameXaee7a1ee? = null,
) {
  public class Builder {
    /**
     * This field is included for legacy purposes; use the `role_name` field instead. The `maintain`
     * role is mapped to `write` and the `triage` role is mapped to `read`. To determine the role
     * assigned to the collaborator, use the `role_name` field instead, which will provide the full
     * role name, including custom roles.
     */
    public var permission: InlineWebhookMemberAddedChangesPermissionX6e1c26ff? = null

    /**
     * The role assigned to the collaborator.
     */
    public var roleName: InlineWebhookMemberAddedChangesRoleNameXaee7a1ee? = null

    public fun build(): InlineWebhookMemberAddedChangesX625a99c9 = InlineWebhookMemberAddedChangesX625a99c9(
      permission = permission,
      roleName = roleName,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookMemberAddedChangesX625a99c9 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookMemberAddedChangesX625a99c9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookMemberAddedChangesX625a99c9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookMemberAddedChangesX625a99c9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookMemberAddedChangesX625a99c9 must be a JSON object")
      return InlineWebhookMemberAddedChangesX625a99c9(
        permission = rawObject["permission"]?.let { json.decodeFromJsonElement<InlineWebhookMemberAddedChangesPermissionX6e1c26ff>(it) },
        roleName = rawObject["role_name"]?.let { json.decodeFromJsonElement<InlineWebhookMemberAddedChangesRoleNameXaee7a1ee>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookMemberAddedChangesX625a99c9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookMemberAddedChangesX625a99c9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.permission?.let { put("permission", json.encodeToJsonElement(it)) }
        value.roleName?.let { put("role_name", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookMemberAddedChangesX625a99c9(block: InlineWebhookMemberAddedChangesX625a99c9.Builder.() -> Unit): InlineWebhookMemberAddedChangesX625a99c9 = InlineWebhookMemberAddedChangesX625a99c9.build(block)
