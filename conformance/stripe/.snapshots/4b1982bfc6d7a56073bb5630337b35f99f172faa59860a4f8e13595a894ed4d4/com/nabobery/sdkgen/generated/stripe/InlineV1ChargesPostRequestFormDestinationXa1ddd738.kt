package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1ChargesPostRequestFormDestinationXa1ddd738Branch {
  InlineV1ChargesPostRequestFormDestinationAnyOf1Xb2aedead,
  Branch2,
}

public sealed class InlineV1ChargesPostRequestFormDestinationXa1ddd738DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1ChargesPostRequestFormDestinationXa1ddd738NoMatchException(
  message: String,
) : InlineV1ChargesPostRequestFormDestinationXa1ddd738DecodingException(message)

internal data class InlineV1ChargesPostRequestFormDestinationXa1ddd738Inspection(
  public val matchesInlineV1ChargesPostRequestFormDestinationAnyOf1Xb2aedead: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1ChargesPostRequestFormDestinationAnyOf1Xb2aedead, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1charges/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/destination.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/destination
 */
@Serializable(with = InlineV1ChargesPostRequestFormDestinationXa1ddd738.Serializer::class)
public class InlineV1ChargesPostRequestFormDestinationXa1ddd738 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1ChargesPostRequestFormDestinationXa1ddd738Inspection,
) {
  public val inlineV1ChargesPostRequestFormDestinationAnyOf1Xb2aedead:
      InlineV1ChargesPostRequestFormDestinationAnyOf1Xb2aedead? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1ChargesPostRequestFormDestinationAnyOf1Xb2aedead) json.decodeFromJsonElement<InlineV1ChargesPostRequestFormDestinationAnyOf1Xb2aedead>(raw) else null }

  public val branch2: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<String>(raw) else null }

  public val matchedBranches: Set<InlineV1ChargesPostRequestFormDestinationXa1ddd738Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1ChargesPostRequestFormDestinationAnyOf1Xb2aedead) add(InlineV1ChargesPostRequestFormDestinationXa1ddd738Branch.InlineV1ChargesPostRequestFormDestinationAnyOf1Xb2aedead)
      if (inspection.matchesBranch2) add(InlineV1ChargesPostRequestFormDestinationXa1ddd738Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1ChargesPostRequestFormDestinationXa1ddd738 {
      val inspection = inspectInlineV1ChargesPostRequestFormDestinationXa1ddd738(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1ChargesPostRequestFormDestinationXa1ddd738NoMatchException("InlineV1ChargesPostRequestFormDestinationXa1ddd738 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1ChargesPostRequestFormDestinationXa1ddd738(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1ChargesPostRequestFormDestinationXa1ddd738> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ChargesPostRequestFormDestinationXa1ddd738 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ChargesPostRequestFormDestinationXa1ddd738")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ChargesPostRequestFormDestinationXa1ddd738) {
      encoder.requireJsonEncoder("InlineV1ChargesPostRequestFormDestinationXa1ddd738").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1ChargesPostRequestFormDestinationXa1ddd738(element: JsonElement): InlineV1ChargesPostRequestFormDestinationXa1ddd738Inspection {
  val matchesInlineV1ChargesPostRequestFormDestinationAnyOf1Xb2aedead = element.isJsonDecodable<InlineV1ChargesPostRequestFormDestinationAnyOf1Xb2aedead>()
  val matchesBranch2 = element.isJsonDecodable<String>()
  return InlineV1ChargesPostRequestFormDestinationXa1ddd738Inspection(
    matchesInlineV1ChargesPostRequestFormDestinationAnyOf1Xb2aedead = matchesInlineV1ChargesPostRequestFormDestinationAnyOf1Xb2aedead,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1ChargesPostRequestFormDestinationAnyOf1Xb2aedead) add("InlineV1ChargesPostRequestFormDestinationAnyOf1Xb2aedead: value does not match InlineV1ChargesPostRequestFormDestinationAnyOf1Xb2aedead")
      if (!matchesBranch2) add("Branch2: value does not match String")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
