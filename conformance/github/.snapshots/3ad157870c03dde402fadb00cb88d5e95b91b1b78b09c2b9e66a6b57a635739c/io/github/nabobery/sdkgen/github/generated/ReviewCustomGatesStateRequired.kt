package io.github.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class ReviewCustomGatesStateRequiredView(
  public val comment: String? = null,
  @SerialName("environment_name")
  public val environmentName: String,
  public val state: InlineReviewCustomGatesStateRequiredStateX9c9e267f,
)

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/review-custom-gates-state-required.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/review-custom-gates-state-required
 */
@Serializable(with = ReviewCustomGatesStateRequired.Serializer::class)
public class ReviewCustomGatesStateRequired(
  /**
   * The name of the environment to approve or reject.
   */
  public val environmentName: String,
  /**
   * Whether to approve or reject deployment to the specified environments.
   */
  public val state: InlineReviewCustomGatesStateRequiredStateX9c9e267f,
  /**
   * Optional comment to include with the review.
   */
  public val comment: String? = null,
) {
  public class Builder {
    private var environmentNameValue: String? = null

    public var environmentName: String
      get() = requireNotNull(environmentNameValue) { "environmentName is required" }
      set(`value`) {
        environmentNameValue = value
      }

    private var stateValue: InlineReviewCustomGatesStateRequiredStateX9c9e267f? = null

    public var state: InlineReviewCustomGatesStateRequiredStateX9c9e267f
      get() = requireNotNull(stateValue) { "state is required" }
      set(`value`) {
        stateValue = value
      }

    /**
     * Optional comment to include with the review.
     */
    public var comment: String? = null

    public fun build(): ReviewCustomGatesStateRequired {
      check(environmentNameValue != null) { "environmentName is required" }
      check(stateValue != null) { "state is required" }
      return ReviewCustomGatesStateRequired(
        environmentName = environmentName,
        state = state,
        comment = comment,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ReviewCustomGatesStateRequired = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ReviewCustomGatesStateRequired> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ReviewCustomGatesStateRequired {
      val jsonDecoder = decoder.requireJsonDecoder("ReviewCustomGatesStateRequired")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ReviewCustomGatesStateRequired must be a JSON object")
      val environmentName = json.decodeRequired<String>(rawObject, "environment_name")
      val state = json.decodeRequired<InlineReviewCustomGatesStateRequiredStateX9c9e267f>(rawObject, "state")
      return ReviewCustomGatesStateRequired(
        environmentName = environmentName,
        state = state,
        comment = rawObject["comment"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ReviewCustomGatesStateRequired) {
      val jsonEncoder = encoder.requireJsonEncoder("ReviewCustomGatesStateRequired")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("environment_name", value.environmentName)
        put("state", json.encodeToJsonElement(value.state))
        value.comment?.let { put("comment", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun reviewCustomGatesStateRequired(block: ReviewCustomGatesStateRequired.Builder.() -> Unit): ReviewCustomGatesStateRequired = ReviewCustomGatesStateRequired.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ReviewCustomGatesStateRequired is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
