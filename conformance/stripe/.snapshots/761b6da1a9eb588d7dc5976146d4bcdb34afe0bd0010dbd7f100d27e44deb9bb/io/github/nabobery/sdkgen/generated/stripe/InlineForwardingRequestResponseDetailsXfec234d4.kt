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

public enum class InlineForwardingRequestResponseDetailsXfec234d4Branch {
  ForwardedResponseDetails,
}

public sealed class InlineForwardingRequestResponseDetailsXfec234d4DecodingException(
  message: String,
) : SerializationException(message)

public class InlineForwardingRequestResponseDetailsXfec234d4NoMatchException(
  message: String,
) : InlineForwardingRequestResponseDetailsXfec234d4DecodingException(message)

internal data class InlineForwardingRequestResponseDetailsXfec234d4Inspection(
  public val matchesForwardedResponseDetails: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesForwardedResponseDetails).count { it }
}

/**
 * The response that the destination endpoint returned to us. We redact any sensitive fields.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/forwarding.request/properties/response_details
 */
@Serializable(with = InlineForwardingRequestResponseDetailsXfec234d4.Serializer::class)
public class InlineForwardingRequestResponseDetailsXfec234d4 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineForwardingRequestResponseDetailsXfec234d4Inspection,
) {
  public val forwardedResponseDetails: ForwardedResponseDetailsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesForwardedResponseDetails) json.decodeFromJsonElement<ForwardedResponseDetailsView>(raw) else null }

  public val matchedBranches: Set<InlineForwardingRequestResponseDetailsXfec234d4Branch>
    get() = buildSet {
      if (inspection.matchesForwardedResponseDetails) add(InlineForwardingRequestResponseDetailsXfec234d4Branch.ForwardedResponseDetails)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineForwardingRequestResponseDetailsXfec234d4 {
      val inspection = inspectInlineForwardingRequestResponseDetailsXfec234d4(raw)
      if (inspection.matchCount == 0) {
        throw InlineForwardingRequestResponseDetailsXfec234d4NoMatchException("InlineForwardingRequestResponseDetailsXfec234d4 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineForwardingRequestResponseDetailsXfec234d4(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineForwardingRequestResponseDetailsXfec234d4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineForwardingRequestResponseDetailsXfec234d4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineForwardingRequestResponseDetailsXfec234d4")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineForwardingRequestResponseDetailsXfec234d4) {
      encoder.requireJsonEncoder("InlineForwardingRequestResponseDetailsXfec234d4").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineForwardingRequestResponseDetailsXfec234d4(element: JsonElement): InlineForwardingRequestResponseDetailsXfec234d4Inspection {
  val raw = element as? JsonObject ?: return InlineForwardingRequestResponseDetailsXfec234d4Inspection(
    matchesForwardedResponseDetails = false,
    failures = listOf("ForwardedResponseDetails: expected JSON object"),
  )
  val matchesForwardedResponseDetails = raw["body"].isString() && raw["headers"] != null && raw["status"] != null
  return InlineForwardingRequestResponseDetailsXfec234d4Inspection(
    matchesForwardedResponseDetails = matchesForwardedResponseDetails,
    failures = buildList {
      if (!matchesForwardedResponseDetails) add("ForwardedResponseDetails: required properties 'body', 'headers', 'status' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
