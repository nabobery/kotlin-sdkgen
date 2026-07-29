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
 * sdkgen://source/openapi.yaml#/paths/~1teams~1{team_id}~1memberships~1{username}/put/requestBody/content/application~1
 * json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1teams~1{team_id}~1memberships~1{username}/put/requestBody/content/application~1
 * json/schema
 */
@Serializable(with = InlineTeamsMembershipsPutRequestJsonX1968695f.Serializer::class)
public class InlineTeamsMembershipsPutRequestJsonX1968695f(
  /**
   * The role that this user should have in the team.
   */
  public val role: InlineTeamsMembershipsPutRequestJsonRoleXf176fad0? = null,
) {
  public class Builder {
    /**
     * The role that this user should have in the team.
     */
    public var role: InlineTeamsMembershipsPutRequestJsonRoleXf176fad0? = null

    public fun build(): InlineTeamsMembershipsPutRequestJsonX1968695f = InlineTeamsMembershipsPutRequestJsonX1968695f(
      role = role,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineTeamsMembershipsPutRequestJsonX1968695f = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineTeamsMembershipsPutRequestJsonX1968695f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTeamsMembershipsPutRequestJsonX1968695f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTeamsMembershipsPutRequestJsonX1968695f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineTeamsMembershipsPutRequestJsonX1968695f must be a JSON object")
      return InlineTeamsMembershipsPutRequestJsonX1968695f(
        role = rawObject["role"]?.let { json.decodeFromJsonElement<InlineTeamsMembershipsPutRequestJsonRoleXf176fad0>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineTeamsMembershipsPutRequestJsonX1968695f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineTeamsMembershipsPutRequestJsonX1968695f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.role?.let { put("role", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineTeamsMembershipsPutRequestJsonX1968695f(block: InlineTeamsMembershipsPutRequestJsonX1968695f.Builder.() -> Unit): InlineTeamsMembershipsPutRequestJsonX1968695f = InlineTeamsMembershipsPutRequestJsonX1968695f.build(block)
