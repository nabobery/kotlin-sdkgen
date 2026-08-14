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

public enum class InlineForwardingRequestRequestDetailsX8d6ec125Branch {
  ForwardedRequestDetails,
}

public sealed class InlineForwardingRequestRequestDetailsX8d6ec125DecodingException(
  message: String,
) : SerializationException(message)

public class InlineForwardingRequestRequestDetailsX8d6ec125NoMatchException(
  message: String,
) : InlineForwardingRequestRequestDetailsX8d6ec125DecodingException(message)

internal data class InlineForwardingRequestRequestDetailsX8d6ec125Inspection(
  public val matchesForwardedRequestDetails: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesForwardedRequestDetails).count { it }
}

/**
 * The request that was sent to the destination endpoint. We redact any sensitive fields.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/forwarding.request/properties/request_details
 */
@Serializable(with = InlineForwardingRequestRequestDetailsX8d6ec125.Serializer::class)
public class InlineForwardingRequestRequestDetailsX8d6ec125 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineForwardingRequestRequestDetailsX8d6ec125Inspection,
) {
  public val forwardedRequestDetails: ForwardedRequestDetailsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesForwardedRequestDetails) json.decodeFromJsonElement<ForwardedRequestDetailsView>(raw) else null }

  public val matchedBranches: Set<InlineForwardingRequestRequestDetailsX8d6ec125Branch>
    get() = buildSet {
      if (inspection.matchesForwardedRequestDetails) add(InlineForwardingRequestRequestDetailsX8d6ec125Branch.ForwardedRequestDetails)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineForwardingRequestRequestDetailsX8d6ec125 {
      val inspection = inspectInlineForwardingRequestRequestDetailsX8d6ec125(raw)
      if (inspection.matchCount == 0) {
        throw InlineForwardingRequestRequestDetailsX8d6ec125NoMatchException("InlineForwardingRequestRequestDetailsX8d6ec125 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineForwardingRequestRequestDetailsX8d6ec125(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineForwardingRequestRequestDetailsX8d6ec125> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineForwardingRequestRequestDetailsX8d6ec125 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineForwardingRequestRequestDetailsX8d6ec125")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineForwardingRequestRequestDetailsX8d6ec125) {
      encoder.requireJsonEncoder("InlineForwardingRequestRequestDetailsX8d6ec125").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineForwardingRequestRequestDetailsX8d6ec125(element: JsonElement): InlineForwardingRequestRequestDetailsX8d6ec125Inspection {
  val raw = element as? JsonObject ?: return InlineForwardingRequestRequestDetailsX8d6ec125Inspection(
    matchesForwardedRequestDetails = false,
    failures = listOf("ForwardedRequestDetails: expected JSON object"),
  )
  val matchesForwardedRequestDetails = raw["body"].isString() && raw["headers"] != null && raw["http_method"] != null
  return InlineForwardingRequestRequestDetailsX8d6ec125Inspection(
    matchesForwardedRequestDetails = matchesForwardedRequestDetails,
    failures = buildList {
      if (!matchesForwardedRequestDetails) add("ForwardedRequestDetails: required properties 'body', 'headers', 'http_method' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
