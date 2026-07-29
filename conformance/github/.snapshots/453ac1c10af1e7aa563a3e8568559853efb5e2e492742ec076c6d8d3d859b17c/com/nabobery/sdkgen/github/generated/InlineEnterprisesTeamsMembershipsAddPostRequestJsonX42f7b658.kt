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
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1teams~1{enterprise-team}~1memberships~1add/post/requ
 * estBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1teams~1{enterprise-team}~1memberships~1add/post/requ
 * estBody/content/application~1json/schema
 */
@Serializable(with = InlineEnterprisesTeamsMembershipsAddPostRequestJsonX42f7b658.Serializer::class)
public class InlineEnterprisesTeamsMembershipsAddPostRequestJsonX42f7b658(
  usernames: List<String>,
) {
  /**
   * The GitHub user handles to add to the team.
   */
  public val usernames: List<String> = usernames.toList()

  public class Builder {
    private var usernamesValue: List<String>? = null

    public var usernames: List<String>
      get() = requireNotNull(usernamesValue) { "usernames is required" }.toList()
      set(`value`) {
        usernamesValue = value.toList()
      }

    public fun build(): InlineEnterprisesTeamsMembershipsAddPostRequestJsonX42f7b658 {
      check(usernamesValue != null) { "usernames is required" }
      return InlineEnterprisesTeamsMembershipsAddPostRequestJsonX42f7b658(
        usernames = usernames,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineEnterprisesTeamsMembershipsAddPostRequestJsonX42f7b658 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineEnterprisesTeamsMembershipsAddPostRequestJsonX42f7b658> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineEnterprisesTeamsMembershipsAddPostRequestJsonX42f7b658 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineEnterprisesTeamsMembershipsAddPostRequestJsonX42f7b658")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineEnterprisesTeamsMembershipsAddPostRequestJsonX42f7b658 must be a JSON object")
      val usernames = json.decodeRequired<List<String>>(rawObject, "usernames")
      return InlineEnterprisesTeamsMembershipsAddPostRequestJsonX42f7b658(
        usernames = usernames,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineEnterprisesTeamsMembershipsAddPostRequestJsonX42f7b658) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineEnterprisesTeamsMembershipsAddPostRequestJsonX42f7b658")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("usernames", json.encodeToJsonElement(value.usernames))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineEnterprisesTeamsMembershipsAddPostRequestJsonX42f7b658(block: InlineEnterprisesTeamsMembershipsAddPostRequestJsonX42f7b658.Builder.() -> Unit): InlineEnterprisesTeamsMembershipsAddPostRequestJsonX42f7b658 = InlineEnterprisesTeamsMembershipsAddPostRequestJsonX42f7b658.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineEnterprisesTeamsMembershipsAddPostRequestJsonX42f7b658 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
