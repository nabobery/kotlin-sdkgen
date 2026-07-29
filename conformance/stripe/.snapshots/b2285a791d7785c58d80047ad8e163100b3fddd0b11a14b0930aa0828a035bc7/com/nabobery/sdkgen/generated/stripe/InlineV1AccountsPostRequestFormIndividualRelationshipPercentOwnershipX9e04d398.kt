package com.nabobery.sdkgen.generated.stripe

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

public enum class InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipX9e04d398Branch {
  Branch1,
  InlineV1AccountsPostRequestFormIndividualRelationshipAnyOf2X6916a03f,
}

public sealed class InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipX9e04d398DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipX9e04d398NoMatchException(
  message: String,
) : InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipX9e04d398DecodingException(message)

internal data class InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipX9e04d398Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1AccountsPostRequestFormIndividualRelationshipAnyOf2X6916a03f: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1AccountsPostRequestFormIndividualRelationshipAnyOf2X6916a03f).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/individual/properties/relationship/properties/percent_ownership.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/individual/properties/relationship/properties/percent_ownership
 */
@Serializable(with = InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipX9e04d398.Serializer::class)
public class InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipX9e04d398 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipX9e04d398Inspection,
) {
  public val branch1: Double? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Double>(raw) else null }

  public val inlineV1AccountsPostRequestFormIndividualRelationshipAnyOf2X6916a03f:
      InlineV1AccountsPostRequestFormIndividualRelationshipAnyOf2X6916a03f? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1AccountsPostRequestFormIndividualRelationshipAnyOf2X6916a03f) json.decodeFromJsonElement<InlineV1AccountsPostRequestFormIndividualRelationshipAnyOf2X6916a03f>(raw) else null }

  public val matchedBranches:
      Set<InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipX9e04d398Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipX9e04d398Branch.Branch1)
      if (inspection.matchesInlineV1AccountsPostRequestFormIndividualRelationshipAnyOf2X6916a03f) add(InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipX9e04d398Branch.InlineV1AccountsPostRequestFormIndividualRelationshipAnyOf2X6916a03f)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipX9e04d398 {
      val inspection = inspectInlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipX9e04d398(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipX9e04d398NoMatchException("InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipX9e04d398 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipX9e04d398(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipX9e04d398> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipX9e04d398 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipX9e04d398")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipX9e04d398) {
      encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipX9e04d398").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipX9e04d398(element: JsonElement): InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipX9e04d398Inspection {
  val matchesBranch1 = element.isJsonDecodable<Double>()
  val matchesInlineV1AccountsPostRequestFormIndividualRelationshipAnyOf2X6916a03f = element.isJsonDecodable<InlineV1AccountsPostRequestFormIndividualRelationshipAnyOf2X6916a03f>()
  return InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipX9e04d398Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1AccountsPostRequestFormIndividualRelationshipAnyOf2X6916a03f = matchesInlineV1AccountsPostRequestFormIndividualRelationshipAnyOf2X6916a03f,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Double")
      if (!matchesInlineV1AccountsPostRequestFormIndividualRelationshipAnyOf2X6916a03f) add("InlineV1AccountsPostRequestFormIndividualRelationshipAnyOf2X6916a03f: value does not match InlineV1AccountsPostRequestFormIndividualRelationshipAnyOf2X6916a03f")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
