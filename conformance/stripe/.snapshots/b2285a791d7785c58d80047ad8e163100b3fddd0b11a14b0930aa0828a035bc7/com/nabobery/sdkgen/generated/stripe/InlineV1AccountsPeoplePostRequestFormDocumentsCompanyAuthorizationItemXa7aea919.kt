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

public enum class InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXa7aea919Branch {
  Branch1,
  InlineV1AccountsPeoplePostRequestFormDocumentsAnyOf2X2a9aa74d,
}

public sealed class InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXa7aea919DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXa7aea919NoMatchException(
  message: String,
) : InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXa7aea919DecodingException(message)

internal data class InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXa7aea919Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1AccountsPeoplePostRequestFormDocumentsAnyOf2X2a9aa74d: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1AccountsPeoplePostRequestFormDocumentsAnyOf2X2a9aa74d).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/documents/properties/company_authorization/properties/files/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/documents/properties/company_authorization/properties/files/items
 */
@Serializable(with = InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXa7aea919.Serializer::class)
public class InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXa7aea919 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXa7aea919Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1AccountsPeoplePostRequestFormDocumentsAnyOf2X2a9aa74d:
      InlineV1AccountsPeoplePostRequestFormDocumentsAnyOf2X2a9aa74d? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1AccountsPeoplePostRequestFormDocumentsAnyOf2X2a9aa74d) json.decodeFromJsonElement<InlineV1AccountsPeoplePostRequestFormDocumentsAnyOf2X2a9aa74d>(raw) else null }

  public val matchedBranches:
      Set<InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXa7aea919Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXa7aea919Branch.Branch1)
      if (inspection.matchesInlineV1AccountsPeoplePostRequestFormDocumentsAnyOf2X2a9aa74d) add(InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXa7aea919Branch.InlineV1AccountsPeoplePostRequestFormDocumentsAnyOf2X2a9aa74d)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXa7aea919 {
      val inspection = inspectInlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXa7aea919(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXa7aea919NoMatchException("InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXa7aea919 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXa7aea919(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXa7aea919> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXa7aea919 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXa7aea919")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXa7aea919) {
      encoder.requireJsonEncoder("InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXa7aea919").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXa7aea919(element: JsonElement): InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXa7aea919Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1AccountsPeoplePostRequestFormDocumentsAnyOf2X2a9aa74d = element.isJsonDecodable<InlineV1AccountsPeoplePostRequestFormDocumentsAnyOf2X2a9aa74d>()
  return InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXa7aea919Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1AccountsPeoplePostRequestFormDocumentsAnyOf2X2a9aa74d = matchesInlineV1AccountsPeoplePostRequestFormDocumentsAnyOf2X2a9aa74d,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1AccountsPeoplePostRequestFormDocumentsAnyOf2X2a9aa74d) add("InlineV1AccountsPeoplePostRequestFormDocumentsAnyOf2X2a9aa74d: value does not match InlineV1AccountsPeoplePostRequestFormDocumentsAnyOf2X2a9aa74d")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
