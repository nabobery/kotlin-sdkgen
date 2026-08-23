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

public enum class InlineV1TokensPostRequestFormAccountIndividualFullNameAliasesX310f21f8Branch {
  Branch1,
  InlineV1TokensPostRequestFormAccountIndividualFullNameAliasesAnyOf2X455c7131,
}

public sealed class InlineV1TokensPostRequestFormAccountIndividualFullNameAliasesX310f21f8DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TokensPostRequestFormAccountIndividualFullNameAliasesX310f21f8NoMatchException(
  message: String,
) : InlineV1TokensPostRequestFormAccountIndividualFullNameAliasesX310f21f8DecodingException(message)

internal data class InlineV1TokensPostRequestFormAccountIndividualFullNameAliasesX310f21f8Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1TokensPostRequestFormAccountIndividualFullNameAliasesAnyOf2X455c7131:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1TokensPostRequestFormAccountIndividualFullNameAliasesAnyOf2X455c7131).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/account/properties/individual/properties/full_name_aliases.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/account/properties/individual/properties/full_name_aliases
 */
@Serializable(with = InlineV1TokensPostRequestFormAccountIndividualFullNameAliasesX310f21f8.Serializer::class)
public class InlineV1TokensPostRequestFormAccountIndividualFullNameAliasesX310f21f8 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1TokensPostRequestFormAccountIndividualFullNameAliasesX310f21f8Inspection,
) {
  public val branch1: List<String>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null }

  public val inlineV1TokensPostRequestFormAccountIndividualFullNameAliasesAnyOf2X455c7131:
      InlineV1TokensPostRequestFormAccountIndividualFullNameAliasesAnyOf2X455c7131? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TokensPostRequestFormAccountIndividualFullNameAliasesAnyOf2X455c7131) json.decodeFromJsonElement<InlineV1TokensPostRequestFormAccountIndividualFullNameAliasesAnyOf2X455c7131>(raw) else null }

  public val matchedBranches:
      Set<InlineV1TokensPostRequestFormAccountIndividualFullNameAliasesX310f21f8Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1TokensPostRequestFormAccountIndividualFullNameAliasesX310f21f8Branch.Branch1)
      if (inspection.matchesInlineV1TokensPostRequestFormAccountIndividualFullNameAliasesAnyOf2X455c7131) add(InlineV1TokensPostRequestFormAccountIndividualFullNameAliasesX310f21f8Branch.InlineV1TokensPostRequestFormAccountIndividualFullNameAliasesAnyOf2X455c7131)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TokensPostRequestFormAccountIndividualFullNameAliasesX310f21f8 {
      val inspection = inspectInlineV1TokensPostRequestFormAccountIndividualFullNameAliasesX310f21f8(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TokensPostRequestFormAccountIndividualFullNameAliasesX310f21f8NoMatchException("InlineV1TokensPostRequestFormAccountIndividualFullNameAliasesX310f21f8 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TokensPostRequestFormAccountIndividualFullNameAliasesX310f21f8(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1TokensPostRequestFormAccountIndividualFullNameAliasesX310f21f8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormAccountIndividualFullNameAliasesX310f21f8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TokensPostRequestFormAccountIndividualFullNameAliasesX310f21f8")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TokensPostRequestFormAccountIndividualFullNameAliasesX310f21f8) {
      encoder.requireJsonEncoder("InlineV1TokensPostRequestFormAccountIndividualFullNameAliasesX310f21f8").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TokensPostRequestFormAccountIndividualFullNameAliasesX310f21f8(element: JsonElement): InlineV1TokensPostRequestFormAccountIndividualFullNameAliasesX310f21f8Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1TokensPostRequestFormAccountIndividualFullNameAliasesAnyOf2X455c7131 = element.isJsonDecodable<InlineV1TokensPostRequestFormAccountIndividualFullNameAliasesAnyOf2X455c7131>()
  return InlineV1TokensPostRequestFormAccountIndividualFullNameAliasesX310f21f8Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1TokensPostRequestFormAccountIndividualFullNameAliasesAnyOf2X455c7131 = matchesInlineV1TokensPostRequestFormAccountIndividualFullNameAliasesAnyOf2X455c7131,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1TokensPostRequestFormAccountIndividualFullNameAliasesAnyOf2X455c7131) add("InlineV1TokensPostRequestFormAccountIndividualFullNameAliasesAnyOf2X455c7131: value does not match InlineV1TokensPostRequestFormAccountIndividualFullNameAliasesAnyOf2X455c7131")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
