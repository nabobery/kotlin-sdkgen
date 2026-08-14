package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineReviewSessionXb92996b5Branch {
  RadarReviewResourceSession,
}

public sealed class InlineReviewSessionXb92996b5DecodingException(
  message: String,
) : SerializationException(message)

public class InlineReviewSessionXb92996b5NoMatchException(
  message: String,
) : InlineReviewSessionXb92996b5DecodingException(message)

internal data class InlineReviewSessionXb92996b5Inspection(
  public val matchesRadarReviewResourceSession: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesRadarReviewResourceSession).count { it }
}

/**
 * Information related to the browsing session of the user who initiated the payment.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/review/properties/session
 */
@Serializable(with = InlineReviewSessionXb92996b5.Serializer::class)
public class InlineReviewSessionXb92996b5 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineReviewSessionXb92996b5Inspection,
) {
  public val radarReviewResourceSession: RadarReviewResourceSessionView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesRadarReviewResourceSession) json.decodeFromJsonElement<RadarReviewResourceSessionView>(raw) else null }

  public val matchedBranches: Set<InlineReviewSessionXb92996b5Branch>
    get() = buildSet {
      if (inspection.matchesRadarReviewResourceSession) add(InlineReviewSessionXb92996b5Branch.RadarReviewResourceSession)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineReviewSessionXb92996b5 {
      val inspection = inspectInlineReviewSessionXb92996b5(raw)
      if (inspection.matchCount == 0) {
        throw InlineReviewSessionXb92996b5NoMatchException("InlineReviewSessionXb92996b5 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineReviewSessionXb92996b5(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineReviewSessionXb92996b5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReviewSessionXb92996b5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReviewSessionXb92996b5")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineReviewSessionXb92996b5) {
      encoder.requireJsonEncoder("InlineReviewSessionXb92996b5").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineReviewSessionXb92996b5(element: JsonElement): InlineReviewSessionXb92996b5Inspection {
  val raw = element as? JsonObject ?: return InlineReviewSessionXb92996b5Inspection(
    matchesRadarReviewResourceSession = false,
    failures = listOf("RadarReviewResourceSession: expected JSON object"),
  )
  val matchesRadarReviewResourceSession = true
  return InlineReviewSessionXb92996b5Inspection(
    matchesRadarReviewResourceSession = matchesRadarReviewResourceSession,
    failures = buildList {
      if (!matchesRadarReviewResourceSession) add("RadarReviewResourceSession: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
