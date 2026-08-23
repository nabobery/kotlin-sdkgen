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

public enum class InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipX718103ceBranch {
  Branch1,
  InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipAnyOf2X9e433f0f,
}

public sealed class InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipX718103ceDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipX718103ceNoMatchException(
  message: String,
) : InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipX718103ceDecodingException(message)

internal data class InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipX718103ceInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipAnyOf2X9e433f0f:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipAnyOf2X9e433f0f).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people~1{person}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/relationship/properties/percent_ownership.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people~1{person}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/relationship/properties/percent_ownership
 */
@Serializable(with = InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipX718103ce.Serializer::class)
public class InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipX718103ce internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipX718103ceInspection,
) {
  public val branch1: Double? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Double>(raw) else null }

  public val inlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipAnyOf2X9e433f0f:
      InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipAnyOf2X9e433f0f? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipAnyOf2X9e433f0f) json.decodeFromJsonElement<InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipAnyOf2X9e433f0f>(raw) else null }

  public val matchedBranches:
      Set<InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipX718103ceBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipX718103ceBranch.Branch1)
      if (inspection.matchesInlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipAnyOf2X9e433f0f) add(InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipX718103ceBranch.InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipAnyOf2X9e433f0f)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipX718103ce {
      val inspection = inspectInlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipX718103ce(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipX718103ceNoMatchException("InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipX718103ce matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipX718103ce(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipX718103ce> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipX718103ce {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipX718103ce")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipX718103ce) {
      encoder.requireJsonEncoder("InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipX718103ce").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipX718103ce(element: JsonElement): InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipX718103ceInspection {
  val matchesBranch1 = element.isJsonDecodable<Double>()
  val matchesInlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipAnyOf2X9e433f0f = element.isJsonDecodable<InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipAnyOf2X9e433f0f>()
  return InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipX718103ceInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipAnyOf2X9e433f0f = matchesInlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipAnyOf2X9e433f0f,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Double")
      if (!matchesInlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipAnyOf2X9e433f0f) add("InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipAnyOf2X9e433f0f: value does not match InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipAnyOf2X9e433f0f")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
