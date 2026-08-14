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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1branches~1{branch}~1protection~1restrictions~1users/del
 * ete/requestBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1branches~1{branch}~1protection~1restrictions~1users/del
 * ete/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineReposBranchesProtectionRestrictionsUsersDeleteRequestJsonXdd9795b6.Serializer::class)
public class InlineReposBranchesProtectionRestrictionsUsersDeleteRequestJsonXdd9795b6(
  users: List<String>,
) {
  /**
   * The username for users
   */
  public val users: List<String> = users.toList()

  public class Builder {
    private var usersValue: List<String>? = null

    public var users: List<String>
      get() = requireNotNull(usersValue) { "users is required" }.toList()
      set(`value`) {
        usersValue = value.toList()
      }

    public fun build(): InlineReposBranchesProtectionRestrictionsUsersDeleteRequestJsonXdd9795b6 {
      check(usersValue != null) { "users is required" }
      return InlineReposBranchesProtectionRestrictionsUsersDeleteRequestJsonXdd9795b6(
        users = users,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposBranchesProtectionRestrictionsUsersDeleteRequestJsonXdd9795b6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposBranchesProtectionRestrictionsUsersDeleteRequestJsonXdd9795b6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposBranchesProtectionRestrictionsUsersDeleteRequestJsonXdd9795b6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposBranchesProtectionRestrictionsUsersDeleteRequestJsonXdd9795b6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposBranchesProtectionRestrictionsUsersDeleteRequestJsonXdd9795b6 must be a JSON object")
      val users = json.decodeRequired<List<String>>(rawObject, "users")
      return InlineReposBranchesProtectionRestrictionsUsersDeleteRequestJsonXdd9795b6(
        users = users,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposBranchesProtectionRestrictionsUsersDeleteRequestJsonXdd9795b6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposBranchesProtectionRestrictionsUsersDeleteRequestJsonXdd9795b6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("users", json.encodeToJsonElement(value.users))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposBranchesProtectionRestrictionsUsersDeleteRequestJsonXdd9795b6(block: InlineReposBranchesProtectionRestrictionsUsersDeleteRequestJsonXdd9795b6.Builder.() -> Unit): InlineReposBranchesProtectionRestrictionsUsersDeleteRequestJsonXdd9795b6 = InlineReposBranchesProtectionRestrictionsUsersDeleteRequestJsonXdd9795b6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposBranchesProtectionRestrictionsUsersDeleteRequestJsonXdd9795b6 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
