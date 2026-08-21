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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1teams~1{team_slug}~1memberships~1{username}/put/requestBody/conten
 * t/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1teams~1{team_slug}~1memberships~1{username}/put/requestBody/conten
 * t/application~1json/schema
 */
@Serializable(with = InlineOrgsTeamsMembershipsPutRequestJsonXfb20306e.Serializer::class)
public class InlineOrgsTeamsMembershipsPutRequestJsonXfb20306e(
  /**
   * The role that this user should have in the team.
   */
  public val role: InlineOrgsTeamsMembershipsPutRequestJsonRoleX5bc86578? = null,
) {
  public class Builder {
    /**
     * The role that this user should have in the team.
     */
    public var role: InlineOrgsTeamsMembershipsPutRequestJsonRoleX5bc86578? = null

    public fun build(): InlineOrgsTeamsMembershipsPutRequestJsonXfb20306e = InlineOrgsTeamsMembershipsPutRequestJsonXfb20306e(
      role = role,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsTeamsMembershipsPutRequestJsonXfb20306e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsTeamsMembershipsPutRequestJsonXfb20306e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsTeamsMembershipsPutRequestJsonXfb20306e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsTeamsMembershipsPutRequestJsonXfb20306e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsTeamsMembershipsPutRequestJsonXfb20306e must be a JSON object")
      return InlineOrgsTeamsMembershipsPutRequestJsonXfb20306e(
        role = rawObject["role"]?.let { json.decodeFromJsonElement<InlineOrgsTeamsMembershipsPutRequestJsonRoleX5bc86578>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsTeamsMembershipsPutRequestJsonXfb20306e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsTeamsMembershipsPutRequestJsonXfb20306e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.role?.let { put("role", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsTeamsMembershipsPutRequestJsonXfb20306e(block: InlineOrgsTeamsMembershipsPutRequestJsonXfb20306e.Builder.() -> Unit): InlineOrgsTeamsMembershipsPutRequestJsonXfb20306e = InlineOrgsTeamsMembershipsPutRequestJsonXfb20306e.build(block)
