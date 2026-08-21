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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1memberships~1{username}/put/requestBody/content/application~1json/
 * schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1memberships~1{username}/put/requestBody/content/application~1json/
 * schema
 */
@Serializable(with = InlineOrgsMembershipsPutRequestJsonX3e8c175b.Serializer::class)
public class InlineOrgsMembershipsPutRequestJsonX3e8c175b(
  /**
   * The role to give the user in the organization. Can be one of:
   * * `admin` - The user will become an owner of the organization.
   * * `member` - The user will become a non-owner member of the organization.
   */
  public val role: InlineOrgsMembershipsPutRequestJsonRoleX84714bc0? = null,
) {
  public class Builder {
    /**
     * The role to give the user in the organization. Can be one of:
     * * `admin` - The user will become an owner of the organization.
     * * `member` - The user will become a non-owner member of the organization.
     */
    public var role: InlineOrgsMembershipsPutRequestJsonRoleX84714bc0? = null

    public fun build(): InlineOrgsMembershipsPutRequestJsonX3e8c175b = InlineOrgsMembershipsPutRequestJsonX3e8c175b(
      role = role,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsMembershipsPutRequestJsonX3e8c175b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsMembershipsPutRequestJsonX3e8c175b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsMembershipsPutRequestJsonX3e8c175b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsMembershipsPutRequestJsonX3e8c175b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsMembershipsPutRequestJsonX3e8c175b must be a JSON object")
      return InlineOrgsMembershipsPutRequestJsonX3e8c175b(
        role = rawObject["role"]?.let { json.decodeFromJsonElement<InlineOrgsMembershipsPutRequestJsonRoleX84714bc0>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsMembershipsPutRequestJsonX3e8c175b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsMembershipsPutRequestJsonX3e8c175b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.role?.let { put("role", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsMembershipsPutRequestJsonX3e8c175b(block: InlineOrgsMembershipsPutRequestJsonX3e8c175b.Builder.() -> Unit): InlineOrgsMembershipsPutRequestJsonX3e8c175b = InlineOrgsMembershipsPutRequestJsonX3e8c175b.build(block)
