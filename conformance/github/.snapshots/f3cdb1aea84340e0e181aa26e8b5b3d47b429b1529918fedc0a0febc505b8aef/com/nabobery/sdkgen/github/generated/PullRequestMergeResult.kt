package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * Pull Request Merge Result
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/pull-request-merge-result
 */
@Serializable(with = PullRequestMergeResult.Serializer::class)
public class PullRequestMergeResult(
  public val merged: Boolean,
  public val message: String,
  public val sha: String,
) {
  public class Builder {
    private var mergedValue: Boolean? = null

    public var merged: Boolean
      get() = requireNotNull(mergedValue) { "merged is required" }
      set(`value`) {
        mergedValue = value
      }

    private var messageValue: String? = null

    public var message: String
      get() = requireNotNull(messageValue) { "message is required" }
      set(`value`) {
        messageValue = value
      }

    private var shaValue: String? = null

    public var sha: String
      get() = requireNotNull(shaValue) { "sha is required" }
      set(`value`) {
        shaValue = value
      }

    public fun build(): PullRequestMergeResult {
      check(mergedValue != null) { "merged is required" }
      check(messageValue != null) { "message is required" }
      check(shaValue != null) { "sha is required" }
      return PullRequestMergeResult(
        merged = merged,
        message = message,
        sha = sha,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PullRequestMergeResult = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PullRequestMergeResult> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PullRequestMergeResult {
      val jsonDecoder = decoder.requireJsonDecoder("PullRequestMergeResult")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PullRequestMergeResult must be a JSON object")
      val merged = json.decodeRequired<Boolean>(rawObject, "merged")
      val message = json.decodeRequired<String>(rawObject, "message")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      return PullRequestMergeResult(
        merged = merged,
        message = message,
        sha = sha,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PullRequestMergeResult) {
      val jsonEncoder = encoder.requireJsonEncoder("PullRequestMergeResult")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("merged", json.encodeToJsonElement(value.merged))
        put("message", value.message)
        put("sha", value.sha)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun pullRequestMergeResult(block: PullRequestMergeResult.Builder.() -> Unit): PullRequestMergeResult = PullRequestMergeResult.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PullRequestMergeResult is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
