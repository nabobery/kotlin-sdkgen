package com.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
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
 * Pull request number for this codespace
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1user~1codespaces/post/requestBody/content/application~1json/schema/oneOf/1/prop
 * erties/pull_request
 */
@Serializable(with = InlineUserCodespacesPostRequestJsonOneOf2PullRequestXf52f7811.Serializer::class)
public class InlineUserCodespacesPostRequestJsonOneOf2PullRequestXf52f7811(
  /**
   * Pull request number
   */
  public val pullRequestNumber: Int,
  /**
   * Repository id for this codespace
   */
  public val repositoryId: Int,
) {
  public class Builder {
    private var pullRequestNumberValue: Int? = null

    public var pullRequestNumber: Int
      get() = requireNotNull(pullRequestNumberValue) { "pullRequestNumber is required" }
      set(`value`) {
        pullRequestNumberValue = value
      }

    private var repositoryIdValue: Int? = null

    public var repositoryId: Int
      get() = requireNotNull(repositoryIdValue) { "repositoryId is required" }
      set(`value`) {
        repositoryIdValue = value
      }

    public fun build(): InlineUserCodespacesPostRequestJsonOneOf2PullRequestXf52f7811 {
      check(pullRequestNumberValue != null) { "pullRequestNumber is required" }
      check(repositoryIdValue != null) { "repositoryId is required" }
      return InlineUserCodespacesPostRequestJsonOneOf2PullRequestXf52f7811(
        pullRequestNumber = pullRequestNumber,
        repositoryId = repositoryId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUserCodespacesPostRequestJsonOneOf2PullRequestXf52f7811 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineUserCodespacesPostRequestJsonOneOf2PullRequestXf52f7811> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUserCodespacesPostRequestJsonOneOf2PullRequestXf52f7811 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUserCodespacesPostRequestJsonOneOf2PullRequestXf52f7811")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUserCodespacesPostRequestJsonOneOf2PullRequestXf52f7811 must be a JSON object")
      val pullRequestNumber = json.decodeRequired<Int>(rawObject, "pull_request_number")
      val repositoryId = json.decodeRequired<Int>(rawObject, "repository_id")
      return InlineUserCodespacesPostRequestJsonOneOf2PullRequestXf52f7811(
        pullRequestNumber = pullRequestNumber,
        repositoryId = repositoryId,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUserCodespacesPostRequestJsonOneOf2PullRequestXf52f7811) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUserCodespacesPostRequestJsonOneOf2PullRequestXf52f7811")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("pull_request_number", json.encodeToJsonElement(value.pullRequestNumber))
        put("repository_id", json.encodeToJsonElement(value.repositoryId))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUserCodespacesPostRequestJsonOneOf2PullRequestXf52f7811(block: InlineUserCodespacesPostRequestJsonOneOf2PullRequestXf52f7811.Builder.() -> Unit): InlineUserCodespacesPostRequestJsonOneOf2PullRequestXf52f7811 = InlineUserCodespacesPostRequestJsonOneOf2PullRequestXf52f7811.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineUserCodespacesPostRequestJsonOneOf2PullRequestXf52f7811 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
