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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1branches~1{branch}~1protection~1restrictions~1teams/del
 * ete/requestBody/content/application~1json/schema/oneOf/0.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1branches~1{branch}~1protection~1restrictions~1teams/del
 * ete/requestBody/content/application~1json/schema/oneOf/0
 */
@Serializable(with = InlineReposBranchesProtectionRestrictionsTeamsDeleteRequestJsonOneOf1X0ce45a8c.Serializer::class)
public class InlineReposBranchesProtectionRestrictionsTeamsDeleteRequestJsonOneOf1X0ce45a8c(
  teams: List<String>,
) {
  /**
   * The slug values for teams
   */
  public val teams: List<String> = teams.toList()

  public class Builder {
    private var teamsValue: List<String>? = null

    public var teams: List<String>
      get() = requireNotNull(teamsValue) { "teams is required" }
      set(`value`) {
        teamsValue = value
      }

    public fun build(): InlineReposBranchesProtectionRestrictionsTeamsDeleteRequestJsonOneOf1X0ce45a8c {
      check(teamsValue != null) { "teams is required" }
      return InlineReposBranchesProtectionRestrictionsTeamsDeleteRequestJsonOneOf1X0ce45a8c(
        teams = teams,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposBranchesProtectionRestrictionsTeamsDeleteRequestJsonOneOf1X0ce45a8c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposBranchesProtectionRestrictionsTeamsDeleteRequestJsonOneOf1X0ce45a8c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposBranchesProtectionRestrictionsTeamsDeleteRequestJsonOneOf1X0ce45a8c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposBranchesProtectionRestrictionsTeamsDeleteRequestJsonOneOf1X0ce45a8c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposBranchesProtectionRestrictionsTeamsDeleteRequestJsonOneOf1X0ce45a8c must be a JSON object")
      val teams = json.decodeRequired<List<String>>(rawObject, "teams")
      return InlineReposBranchesProtectionRestrictionsTeamsDeleteRequestJsonOneOf1X0ce45a8c(
        teams = teams,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposBranchesProtectionRestrictionsTeamsDeleteRequestJsonOneOf1X0ce45a8c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposBranchesProtectionRestrictionsTeamsDeleteRequestJsonOneOf1X0ce45a8c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("teams", json.encodeToJsonElement(value.teams))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposBranchesProtectionRestrictionsTeamsDeleteRequestJsonOneOf1X0ce45a8c(block: InlineReposBranchesProtectionRestrictionsTeamsDeleteRequestJsonOneOf1X0ce45a8c.Builder.() -> Unit): InlineReposBranchesProtectionRestrictionsTeamsDeleteRequestJsonOneOf1X0ce45a8c = InlineReposBranchesProtectionRestrictionsTeamsDeleteRequestJsonOneOf1X0ce45a8c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposBranchesProtectionRestrictionsTeamsDeleteRequestJsonOneOf1X0ce45a8c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
