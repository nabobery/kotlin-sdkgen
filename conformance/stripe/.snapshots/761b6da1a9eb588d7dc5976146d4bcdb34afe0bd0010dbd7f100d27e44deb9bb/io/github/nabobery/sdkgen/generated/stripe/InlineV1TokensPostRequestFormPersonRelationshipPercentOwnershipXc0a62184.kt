package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Double
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

public enum class InlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipXc0a62184Branch {
  Branch1,
  InlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipAnyOf2X98a5a11d,
}

public sealed class InlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipXc0a62184DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipXc0a62184NoMatchException(
  message: String,
) : InlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipXc0a62184DecodingException(message)

internal data class InlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipXc0a62184Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipAnyOf2X98a5a11d:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipAnyOf2X98a5a11d).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person/properties/relationship/properties/percent_ownership.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person/properties/relationship/properties/percent_ownership
 */
@Serializable(with = InlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipXc0a62184.Serializer::class)
public class InlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipXc0a62184 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipXc0a62184Inspection,
) {
  public val branch1: Double? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Double>(raw) else null }

  public val inlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipAnyOf2X98a5a11d:
      InlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipAnyOf2X98a5a11d? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipAnyOf2X98a5a11d) json.decodeFromJsonElement<InlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipAnyOf2X98a5a11d>(raw) else null }

  public val matchedBranches:
      Set<InlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipXc0a62184Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipXc0a62184Branch.Branch1)
      if (inspection.matchesInlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipAnyOf2X98a5a11d) add(InlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipXc0a62184Branch.InlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipAnyOf2X98a5a11d)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipXc0a62184 {
      val inspection = inspectInlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipXc0a62184(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipXc0a62184NoMatchException("InlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipXc0a62184 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipXc0a62184(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipXc0a62184> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipXc0a62184 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipXc0a62184")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipXc0a62184) {
      encoder.requireJsonEncoder("InlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipXc0a62184").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipXc0a62184(element: JsonElement): InlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipXc0a62184Inspection {
  val matchesBranch1 = element.isJsonDecodable<Double>()
  val matchesInlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipAnyOf2X98a5a11d = element.isJsonDecodable<InlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipAnyOf2X98a5a11d>()
  return InlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipXc0a62184Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipAnyOf2X98a5a11d = matchesInlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipAnyOf2X98a5a11d,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Double")
      if (!matchesInlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipAnyOf2X98a5a11d) add("InlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipAnyOf2X98a5a11d: value does not match InlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipAnyOf2X98a5a11d")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
