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
 * Pull Request Review Request
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/pull-request-review-request
 */
@Serializable(with = PullRequestReviewRequest.Serializer::class)
public class PullRequestReviewRequest(
  teams: List<Team>,
  users: List<SimpleUser>,
) {
  public val teams: List<Team> = teams.toList()

  public val users: List<SimpleUser> = users.toList()

  public class Builder {
    private var teamsValue: List<Team>? = null

    public var teams: List<Team>
      get() = requireNotNull(teamsValue) { "teams is required" }
      set(`value`) {
        teamsValue = value
      }

    private var usersValue: List<SimpleUser>? = null

    public var users: List<SimpleUser>
      get() = requireNotNull(usersValue) { "users is required" }
      set(`value`) {
        usersValue = value
      }

    public fun build(): PullRequestReviewRequest {
      check(teamsValue != null) { "teams is required" }
      check(usersValue != null) { "users is required" }
      return PullRequestReviewRequest(
        teams = teams,
        users = users,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PullRequestReviewRequest = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PullRequestReviewRequest> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PullRequestReviewRequest {
      val jsonDecoder = decoder.requireJsonDecoder("PullRequestReviewRequest")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PullRequestReviewRequest must be a JSON object")
      val teams = json.decodeRequired<List<Team>>(rawObject, "teams")
      val users = json.decodeRequired<List<SimpleUser>>(rawObject, "users")
      return PullRequestReviewRequest(
        teams = teams,
        users = users,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PullRequestReviewRequest) {
      val jsonEncoder = encoder.requireJsonEncoder("PullRequestReviewRequest")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("teams", json.encodeToJsonElement(value.teams))
        put("users", json.encodeToJsonElement(value.users))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun pullRequestReviewRequest(block: PullRequestReviewRequest.Builder.() -> Unit): PullRequestReviewRequest = PullRequestReviewRequest.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PullRequestReviewRequest is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
