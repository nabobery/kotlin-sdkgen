package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1branches~1{branch}~1protection~1restrictions~1teams/put
 * /requestBody/content/application~1json/schema/oneOf/0.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1branches~1{branch}~1protection~1restrictions~1teams/put
 * /requestBody/content/application~1json/schema/oneOf/0
 */
@Serializable(with = InlineReposBranchesProtectionRestrictionsTeamsPutRequestJsonOneOf1X6862037a.Serializer::class)
public class InlineReposBranchesProtectionRestrictionsTeamsPutRequestJsonOneOf1X6862037a(
  teams: List<String>,
) {
  /**
   * The slug values for teams
   */
  public val teams: List<String> = teams.toList()

  public class Builder {
    private var teamsValue: List<String>? = null

    public var teams: List<String>
      get() = requireNotNull(teamsValue) { "teams is required" }.toList()
      set(`value`) {
        teamsValue = value.toList()
      }

    public fun build(): InlineReposBranchesProtectionRestrictionsTeamsPutRequestJsonOneOf1X6862037a {
      check(teamsValue != null) { "teams is required" }
      return InlineReposBranchesProtectionRestrictionsTeamsPutRequestJsonOneOf1X6862037a(
        teams = teams,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposBranchesProtectionRestrictionsTeamsPutRequestJsonOneOf1X6862037a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposBranchesProtectionRestrictionsTeamsPutRequestJsonOneOf1X6862037a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposBranchesProtectionRestrictionsTeamsPutRequestJsonOneOf1X6862037a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposBranchesProtectionRestrictionsTeamsPutRequestJsonOneOf1X6862037a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposBranchesProtectionRestrictionsTeamsPutRequestJsonOneOf1X6862037a must be a JSON object")
      val teams = json.decodeRequired<List<String>>(rawObject, "teams")
      return InlineReposBranchesProtectionRestrictionsTeamsPutRequestJsonOneOf1X6862037a(
        teams = teams,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposBranchesProtectionRestrictionsTeamsPutRequestJsonOneOf1X6862037a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposBranchesProtectionRestrictionsTeamsPutRequestJsonOneOf1X6862037a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("teams", json.encodeToJsonElement(value.teams))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposBranchesProtectionRestrictionsTeamsPutRequestJsonOneOf1X6862037a(block: InlineReposBranchesProtectionRestrictionsTeamsPutRequestJsonOneOf1X6862037a.Builder.() -> Unit): InlineReposBranchesProtectionRestrictionsTeamsPutRequestJsonOneOf1X6862037a = InlineReposBranchesProtectionRestrictionsTeamsPutRequestJsonOneOf1X6862037a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposBranchesProtectionRestrictionsTeamsPutRequestJsonOneOf1X6862037a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
