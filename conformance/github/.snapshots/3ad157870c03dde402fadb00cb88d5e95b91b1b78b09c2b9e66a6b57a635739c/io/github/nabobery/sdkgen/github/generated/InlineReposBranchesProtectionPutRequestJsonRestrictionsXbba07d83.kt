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
 * Restrict who can push to the protected branch. User, app, and team `restrictions` are only available for
 * organization-owned repositories. Set to `null` to disable.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1branches~1{branch}~1protection/put/requestBody/content/
 * application~1json/schema/properties/restrictions
 */
@Serializable(with = InlineReposBranchesProtectionPutRequestJsonRestrictionsXbba07d83.Serializer::class)
public class InlineReposBranchesProtectionPutRequestJsonRestrictionsXbba07d83(
  teams: List<String>,
  users: List<String>,
  apps: List<String>? = null,
) {
  /**
   * The list of team `slug`s with push access
   */
  public val teams: List<String> = teams.toList()

  /**
   * The list of user `login`s with push access
   */
  public val users: List<String> = users.toList()

  /**
   * The list of app `slug`s with push access
   */
  public val apps: List<String>? = apps?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var teamsValue: List<String>? = null

    public var teams: List<String>
      get() = requireNotNull(teamsValue) { "teams is required" }.toList()
      set(`value`) {
        teamsValue = value.toList()
      }

    private var usersValue: List<String>? = null

    public var users: List<String>
      get() = requireNotNull(usersValue) { "users is required" }.toList()
      set(`value`) {
        usersValue = value.toList()
      }

    private var appsValue: List<String>? = null

    /**
     * The list of app `slug`s with push access
     */
    public var apps: List<String>?
      get() = appsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        appsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineReposBranchesProtectionPutRequestJsonRestrictionsXbba07d83 {
      check(teamsValue != null) { "teams is required" }
      check(usersValue != null) { "users is required" }
      return InlineReposBranchesProtectionPutRequestJsonRestrictionsXbba07d83(
        teams = teams,
        users = users,
        apps = apps,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposBranchesProtectionPutRequestJsonRestrictionsXbba07d83 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposBranchesProtectionPutRequestJsonRestrictionsXbba07d83> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposBranchesProtectionPutRequestJsonRestrictionsXbba07d83 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposBranchesProtectionPutRequestJsonRestrictionsXbba07d83")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposBranchesProtectionPutRequestJsonRestrictionsXbba07d83 must be a JSON object")
      val teams = json.decodeRequired<List<String>>(rawObject, "teams")
      val users = json.decodeRequired<List<String>>(rawObject, "users")
      return InlineReposBranchesProtectionPutRequestJsonRestrictionsXbba07d83(
        teams = teams,
        users = users,
        apps = rawObject["apps"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposBranchesProtectionPutRequestJsonRestrictionsXbba07d83) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposBranchesProtectionPutRequestJsonRestrictionsXbba07d83")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("teams", json.encodeToJsonElement(value.teams))
        put("users", json.encodeToJsonElement(value.users))
        value.apps?.let { put("apps", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposBranchesProtectionPutRequestJsonRestrictionsXbba07d83(block: InlineReposBranchesProtectionPutRequestJsonRestrictionsXbba07d83.Builder.() -> Unit): InlineReposBranchesProtectionPutRequestJsonRestrictionsXbba07d83 = InlineReposBranchesProtectionPutRequestJsonRestrictionsXbba07d83.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposBranchesProtectionPutRequestJsonRestrictionsXbba07d83 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
