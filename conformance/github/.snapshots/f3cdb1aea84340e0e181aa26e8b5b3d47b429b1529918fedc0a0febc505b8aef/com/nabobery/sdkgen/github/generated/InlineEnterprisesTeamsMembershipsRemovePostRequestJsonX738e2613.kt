package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1teams~1{enterprise-team}~1memberships~1remove/post/r
 * equestBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1teams~1{enterprise-team}~1memberships~1remove/post/r
 * equestBody/content/application~1json/schema
 */
@Serializable(with = InlineEnterprisesTeamsMembershipsRemovePostRequestJsonX738e2613.Serializer::class)
public class InlineEnterprisesTeamsMembershipsRemovePostRequestJsonX738e2613(
  usernames: List<String>,
) {
  /**
   * The GitHub user handles to be removed from the team.
   */
  public val usernames: List<String> = usernames.toList()

  public class Builder {
    private var usernamesValue: List<String>? = null

    public var usernames: List<String>
      get() = requireNotNull(usernamesValue) { "usernames is required" }.toList()
      set(`value`) {
        usernamesValue = value.toList()
      }

    public fun build(): InlineEnterprisesTeamsMembershipsRemovePostRequestJsonX738e2613 {
      check(usernamesValue != null) { "usernames is required" }
      return InlineEnterprisesTeamsMembershipsRemovePostRequestJsonX738e2613(
        usernames = usernames,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineEnterprisesTeamsMembershipsRemovePostRequestJsonX738e2613 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineEnterprisesTeamsMembershipsRemovePostRequestJsonX738e2613> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineEnterprisesTeamsMembershipsRemovePostRequestJsonX738e2613 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineEnterprisesTeamsMembershipsRemovePostRequestJsonX738e2613")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineEnterprisesTeamsMembershipsRemovePostRequestJsonX738e2613 must be a JSON object")
      val usernames = json.decodeRequired<List<String>>(rawObject, "usernames")
      return InlineEnterprisesTeamsMembershipsRemovePostRequestJsonX738e2613(
        usernames = usernames,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineEnterprisesTeamsMembershipsRemovePostRequestJsonX738e2613) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineEnterprisesTeamsMembershipsRemovePostRequestJsonX738e2613")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("usernames", json.encodeToJsonElement(value.usernames))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineEnterprisesTeamsMembershipsRemovePostRequestJsonX738e2613(block: InlineEnterprisesTeamsMembershipsRemovePostRequestJsonX738e2613.Builder.() -> Unit): InlineEnterprisesTeamsMembershipsRemovePostRequestJsonX738e2613 = InlineEnterprisesTeamsMembershipsRemovePostRequestJsonX738e2613.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineEnterprisesTeamsMembershipsRemovePostRequestJsonX738e2613 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
