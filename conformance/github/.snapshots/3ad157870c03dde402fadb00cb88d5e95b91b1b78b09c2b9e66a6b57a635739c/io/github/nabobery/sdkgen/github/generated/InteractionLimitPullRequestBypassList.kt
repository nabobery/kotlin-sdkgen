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
 * A list of user logins to add or remove from the pull request creation cap bypass list.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/interaction-limit-pull-request-bypass-list
 */
@Serializable(with = InteractionLimitPullRequestBypassList.Serializer::class)
public class InteractionLimitPullRequestBypassList(
  users: List<String>,
) {
  /**
   * A list of user logins to add or remove from the bypass list.
   */
  public val users: List<String> = users.toList()

  public class Builder {
    private var usersValue: List<String>? = null

    public var users: List<String>
      get() = requireNotNull(usersValue) { "users is required" }.toList()
      set(`value`) {
        usersValue = value.toList()
      }

    public fun build(): InteractionLimitPullRequestBypassList {
      check(usersValue != null) { "users is required" }
      return InteractionLimitPullRequestBypassList(
        users = users,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InteractionLimitPullRequestBypassList = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InteractionLimitPullRequestBypassList> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InteractionLimitPullRequestBypassList {
      val jsonDecoder = decoder.requireJsonDecoder("InteractionLimitPullRequestBypassList")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InteractionLimitPullRequestBypassList must be a JSON object")
      val users = json.decodeRequired<List<String>>(rawObject, "users")
      return InteractionLimitPullRequestBypassList(
        users = users,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InteractionLimitPullRequestBypassList) {
      val jsonEncoder = encoder.requireJsonEncoder("InteractionLimitPullRequestBypassList")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("users", json.encodeToJsonElement(value.users))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun interactionLimitPullRequestBypassList(block: InteractionLimitPullRequestBypassList.Builder.() -> Unit): InteractionLimitPullRequestBypassList = InteractionLimitPullRequestBypassList.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InteractionLimitPullRequestBypassList is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
