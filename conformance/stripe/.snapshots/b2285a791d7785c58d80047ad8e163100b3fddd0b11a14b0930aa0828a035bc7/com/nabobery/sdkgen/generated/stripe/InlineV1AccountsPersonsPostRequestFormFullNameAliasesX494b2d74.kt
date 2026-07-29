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

public enum class InlineV1AccountsPersonsPostRequestFormFullNameAliasesX494b2d74Branch {
  Branch1,
  InlineV1AccountsPersonsPostRequestFormFullNameAliasesAnyOf2X01642f7f,
}

public sealed class InlineV1AccountsPersonsPostRequestFormFullNameAliasesX494b2d74DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1AccountsPersonsPostRequestFormFullNameAliasesX494b2d74NoMatchException(
  message: String,
) : InlineV1AccountsPersonsPostRequestFormFullNameAliasesX494b2d74DecodingException(message)

internal data class InlineV1AccountsPersonsPostRequestFormFullNameAliasesX494b2d74Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1AccountsPersonsPostRequestFormFullNameAliasesAnyOf2X01642f7f: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1AccountsPersonsPostRequestFormFullNameAliasesAnyOf2X01642f7f).count { it }
}

/**
 * A list of alternate names or aliases that the person is known by.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/full_name_aliases
 */
@Serializable(with = InlineV1AccountsPersonsPostRequestFormFullNameAliasesX494b2d74.Serializer::class)
public class InlineV1AccountsPersonsPostRequestFormFullNameAliasesX494b2d74 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1AccountsPersonsPostRequestFormFullNameAliasesX494b2d74Inspection,
) {
  public val branch1: List<String>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null }

  public val inlineV1AccountsPersonsPostRequestFormFullNameAliasesAnyOf2X01642f7f:
      InlineV1AccountsPersonsPostRequestFormFullNameAliasesAnyOf2X01642f7f? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1AccountsPersonsPostRequestFormFullNameAliasesAnyOf2X01642f7f) json.decodeFromJsonElement<InlineV1AccountsPersonsPostRequestFormFullNameAliasesAnyOf2X01642f7f>(raw) else null }

  public val matchedBranches:
      Set<InlineV1AccountsPersonsPostRequestFormFullNameAliasesX494b2d74Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1AccountsPersonsPostRequestFormFullNameAliasesX494b2d74Branch.Branch1)
      if (inspection.matchesInlineV1AccountsPersonsPostRequestFormFullNameAliasesAnyOf2X01642f7f) add(InlineV1AccountsPersonsPostRequestFormFullNameAliasesX494b2d74Branch.InlineV1AccountsPersonsPostRequestFormFullNameAliasesAnyOf2X01642f7f)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1AccountsPersonsPostRequestFormFullNameAliasesX494b2d74 {
      val inspection = inspectInlineV1AccountsPersonsPostRequestFormFullNameAliasesX494b2d74(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1AccountsPersonsPostRequestFormFullNameAliasesX494b2d74NoMatchException("InlineV1AccountsPersonsPostRequestFormFullNameAliasesX494b2d74 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1AccountsPersonsPostRequestFormFullNameAliasesX494b2d74(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1AccountsPersonsPostRequestFormFullNameAliasesX494b2d74> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPersonsPostRequestFormFullNameAliasesX494b2d74 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPersonsPostRequestFormFullNameAliasesX494b2d74")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPersonsPostRequestFormFullNameAliasesX494b2d74) {
      encoder.requireJsonEncoder("InlineV1AccountsPersonsPostRequestFormFullNameAliasesX494b2d74").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1AccountsPersonsPostRequestFormFullNameAliasesX494b2d74(element: JsonElement): InlineV1AccountsPersonsPostRequestFormFullNameAliasesX494b2d74Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1AccountsPersonsPostRequestFormFullNameAliasesAnyOf2X01642f7f = element.isJsonDecodable<InlineV1AccountsPersonsPostRequestFormFullNameAliasesAnyOf2X01642f7f>()
  return InlineV1AccountsPersonsPostRequestFormFullNameAliasesX494b2d74Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1AccountsPersonsPostRequestFormFullNameAliasesAnyOf2X01642f7f = matchesInlineV1AccountsPersonsPostRequestFormFullNameAliasesAnyOf2X01642f7f,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1AccountsPersonsPostRequestFormFullNameAliasesAnyOf2X01642f7f) add("InlineV1AccountsPersonsPostRequestFormFullNameAliasesAnyOf2X01642f7f: value does not match InlineV1AccountsPersonsPostRequestFormFullNameAliasesAnyOf2X01642f7f")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
