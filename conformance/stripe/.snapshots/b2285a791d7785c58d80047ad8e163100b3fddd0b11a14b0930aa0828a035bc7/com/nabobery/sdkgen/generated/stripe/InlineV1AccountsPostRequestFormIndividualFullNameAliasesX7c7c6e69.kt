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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1AccountsPostRequestFormIndividualFullNameAliasesX7c7c6e69Branch {
  Branch1,
  InlineV1AccountsPostRequestFormIndividualFullNameAliasesAnyOf2X9006818d,
}

public sealed class InlineV1AccountsPostRequestFormIndividualFullNameAliasesX7c7c6e69DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1AccountsPostRequestFormIndividualFullNameAliasesX7c7c6e69NoMatchException(
  message: String,
) : InlineV1AccountsPostRequestFormIndividualFullNameAliasesX7c7c6e69DecodingException(message)

internal data class InlineV1AccountsPostRequestFormIndividualFullNameAliasesX7c7c6e69Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1AccountsPostRequestFormIndividualFullNameAliasesAnyOf2X9006818d:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1AccountsPostRequestFormIndividualFullNameAliasesAnyOf2X9006818d).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/individual/properties/full_name_aliases.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/individual/properties/full_name_aliases
 */
@Serializable(with = InlineV1AccountsPostRequestFormIndividualFullNameAliasesX7c7c6e69.Serializer::class)
public class InlineV1AccountsPostRequestFormIndividualFullNameAliasesX7c7c6e69 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1AccountsPostRequestFormIndividualFullNameAliasesX7c7c6e69Inspection,
) {
  public val branch1: List<String>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null }

  public val inlineV1AccountsPostRequestFormIndividualFullNameAliasesAnyOf2X9006818d:
      InlineV1AccountsPostRequestFormIndividualFullNameAliasesAnyOf2X9006818d? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1AccountsPostRequestFormIndividualFullNameAliasesAnyOf2X9006818d) json.decodeFromJsonElement<InlineV1AccountsPostRequestFormIndividualFullNameAliasesAnyOf2X9006818d>(raw) else null }

  public val matchedBranches:
      Set<InlineV1AccountsPostRequestFormIndividualFullNameAliasesX7c7c6e69Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1AccountsPostRequestFormIndividualFullNameAliasesX7c7c6e69Branch.Branch1)
      if (inspection.matchesInlineV1AccountsPostRequestFormIndividualFullNameAliasesAnyOf2X9006818d) add(InlineV1AccountsPostRequestFormIndividualFullNameAliasesX7c7c6e69Branch.InlineV1AccountsPostRequestFormIndividualFullNameAliasesAnyOf2X9006818d)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1AccountsPostRequestFormIndividualFullNameAliasesX7c7c6e69 {
      val inspection = inspectInlineV1AccountsPostRequestFormIndividualFullNameAliasesX7c7c6e69(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1AccountsPostRequestFormIndividualFullNameAliasesX7c7c6e69NoMatchException("InlineV1AccountsPostRequestFormIndividualFullNameAliasesX7c7c6e69 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1AccountsPostRequestFormIndividualFullNameAliasesX7c7c6e69(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1AccountsPostRequestFormIndividualFullNameAliasesX7c7c6e69> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormIndividualFullNameAliasesX7c7c6e69 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormIndividualFullNameAliasesX7c7c6e69")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormIndividualFullNameAliasesX7c7c6e69) {
      encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormIndividualFullNameAliasesX7c7c6e69").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1AccountsPostRequestFormIndividualFullNameAliasesX7c7c6e69(element: JsonElement): InlineV1AccountsPostRequestFormIndividualFullNameAliasesX7c7c6e69Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1AccountsPostRequestFormIndividualFullNameAliasesAnyOf2X9006818d = element.isJsonDecodable<InlineV1AccountsPostRequestFormIndividualFullNameAliasesAnyOf2X9006818d>()
  return InlineV1AccountsPostRequestFormIndividualFullNameAliasesX7c7c6e69Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1AccountsPostRequestFormIndividualFullNameAliasesAnyOf2X9006818d = matchesInlineV1AccountsPostRequestFormIndividualFullNameAliasesAnyOf2X9006818d,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1AccountsPostRequestFormIndividualFullNameAliasesAnyOf2X9006818d) add("InlineV1AccountsPostRequestFormIndividualFullNameAliasesAnyOf2X9006818d: value does not match InlineV1AccountsPostRequestFormIndividualFullNameAliasesAnyOf2X9006818d")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
