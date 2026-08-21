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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1branches~1{branch}~1protection~1restrictions~1users/put
 * /requestBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1branches~1{branch}~1protection~1restrictions~1users/put
 * /requestBody/content/application~1json/schema
 */
@Serializable(with = InlineReposBranchesProtectionRestrictionsUsersPutRequestJsonX6a190cca.Serializer::class)
public class InlineReposBranchesProtectionRestrictionsUsersPutRequestJsonX6a190cca(
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

    public fun build(): InlineReposBranchesProtectionRestrictionsUsersPutRequestJsonX6a190cca {
      check(usersValue != null) { "users is required" }
      return InlineReposBranchesProtectionRestrictionsUsersPutRequestJsonX6a190cca(
        users = users,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposBranchesProtectionRestrictionsUsersPutRequestJsonX6a190cca = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposBranchesProtectionRestrictionsUsersPutRequestJsonX6a190cca> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposBranchesProtectionRestrictionsUsersPutRequestJsonX6a190cca {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposBranchesProtectionRestrictionsUsersPutRequestJsonX6a190cca")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposBranchesProtectionRestrictionsUsersPutRequestJsonX6a190cca must be a JSON object")
      val users = json.decodeRequired<List<String>>(rawObject, "users")
      return InlineReposBranchesProtectionRestrictionsUsersPutRequestJsonX6a190cca(
        users = users,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposBranchesProtectionRestrictionsUsersPutRequestJsonX6a190cca) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposBranchesProtectionRestrictionsUsersPutRequestJsonX6a190cca")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("users", json.encodeToJsonElement(value.users))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposBranchesProtectionRestrictionsUsersPutRequestJsonX6a190cca(block: InlineReposBranchesProtectionRestrictionsUsersPutRequestJsonX6a190cca.Builder.() -> Unit): InlineReposBranchesProtectionRestrictionsUsersPutRequestJsonX6a190cca = InlineReposBranchesProtectionRestrictionsUsersPutRequestJsonX6a190cca.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposBranchesProtectionRestrictionsUsersPutRequestJsonX6a190cca is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
