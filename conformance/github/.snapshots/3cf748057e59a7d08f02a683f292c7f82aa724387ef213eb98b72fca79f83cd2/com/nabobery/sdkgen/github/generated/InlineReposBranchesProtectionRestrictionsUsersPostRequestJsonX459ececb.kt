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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1branches~1{branch}~1protection~1restrictions~1users/pos
 * t/requestBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1branches~1{branch}~1protection~1restrictions~1users/pos
 * t/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineReposBranchesProtectionRestrictionsUsersPostRequestJsonX459ececb.Serializer::class)
public class InlineReposBranchesProtectionRestrictionsUsersPostRequestJsonX459ececb(
  users: List<String>,
) {
  /**
   * The username for users
   */
  public val users: List<String> = users.toList()

  public class Builder {
    private var usersValue: List<String>? = null

    public var users: List<String>
      get() = requireNotNull(usersValue) { "users is required" }
      set(`value`) {
        usersValue = value
      }

    public fun build(): InlineReposBranchesProtectionRestrictionsUsersPostRequestJsonX459ececb {
      check(usersValue != null) { "users is required" }
      return InlineReposBranchesProtectionRestrictionsUsersPostRequestJsonX459ececb(
        users = users,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposBranchesProtectionRestrictionsUsersPostRequestJsonX459ececb = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposBranchesProtectionRestrictionsUsersPostRequestJsonX459ececb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposBranchesProtectionRestrictionsUsersPostRequestJsonX459ececb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposBranchesProtectionRestrictionsUsersPostRequestJsonX459ececb")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposBranchesProtectionRestrictionsUsersPostRequestJsonX459ececb must be a JSON object")
      val users = json.decodeRequired<List<String>>(rawObject, "users")
      return InlineReposBranchesProtectionRestrictionsUsersPostRequestJsonX459ececb(
        users = users,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposBranchesProtectionRestrictionsUsersPostRequestJsonX459ececb) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposBranchesProtectionRestrictionsUsersPostRequestJsonX459ececb")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("users", json.encodeToJsonElement(value.users))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposBranchesProtectionRestrictionsUsersPostRequestJsonX459ececb(block: InlineReposBranchesProtectionRestrictionsUsersPostRequestJsonX459ececb.Builder.() -> Unit): InlineReposBranchesProtectionRestrictionsUsersPostRequestJsonX459ececb = InlineReposBranchesProtectionRestrictionsUsersPostRequestJsonX459ececb.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposBranchesProtectionRestrictionsUsersPostRequestJsonX459ececb is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
