package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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
import kotlinx.serialization.json.put

@Serializable
public data class ReviewCustomGatesCommentRequiredView(
  public val comment: String,
  @SerialName("environment_name")
  public val environmentName: String,
)

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/review-custom-gates-comment-required.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/review-custom-gates-comment-required
 */
@Serializable(with = ReviewCustomGatesCommentRequired.Serializer::class)
public class ReviewCustomGatesCommentRequired(
  /**
   * Comment associated with the pending deployment protection rule. **Required when state is not provided.**
   */
  public val comment: String,
  /**
   * The name of the environment to approve or reject.
   */
  public val environmentName: String,
) {
  public class Builder {
    private var commentValue: String? = null

    public var comment: String
      get() = requireNotNull(commentValue) { "comment is required" }
      set(`value`) {
        commentValue = value
      }

    private var environmentNameValue: String? = null

    public var environmentName: String
      get() = requireNotNull(environmentNameValue) { "environmentName is required" }
      set(`value`) {
        environmentNameValue = value
      }

    public fun build(): ReviewCustomGatesCommentRequired {
      check(commentValue != null) { "comment is required" }
      check(environmentNameValue != null) { "environmentName is required" }
      return ReviewCustomGatesCommentRequired(
        comment = comment,
        environmentName = environmentName,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ReviewCustomGatesCommentRequired = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ReviewCustomGatesCommentRequired> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ReviewCustomGatesCommentRequired {
      val jsonDecoder = decoder.requireJsonDecoder("ReviewCustomGatesCommentRequired")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ReviewCustomGatesCommentRequired must be a JSON object")
      val comment = json.decodeRequired<String>(rawObject, "comment")
      val environmentName = json.decodeRequired<String>(rawObject, "environment_name")
      return ReviewCustomGatesCommentRequired(
        comment = comment,
        environmentName = environmentName,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ReviewCustomGatesCommentRequired) {
      val jsonEncoder = encoder.requireJsonEncoder("ReviewCustomGatesCommentRequired")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("comment", value.comment)
        put("environment_name", value.environmentName)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun reviewCustomGatesCommentRequired(block: ReviewCustomGatesCommentRequired.Builder.() -> Unit): ReviewCustomGatesCommentRequired = ReviewCustomGatesCommentRequired.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ReviewCustomGatesCommentRequired is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
