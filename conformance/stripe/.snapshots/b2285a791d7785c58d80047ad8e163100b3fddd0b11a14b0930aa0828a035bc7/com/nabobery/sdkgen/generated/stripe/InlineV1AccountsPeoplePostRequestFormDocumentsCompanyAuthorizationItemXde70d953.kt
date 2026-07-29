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

public enum class InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXde70d953Branch {
  Branch1,
  InlineV1AccountsPeoplePostRequestFormDocumentsAnyOf2X5ad1f544,
}

public sealed class InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXde70d953DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXde70d953NoMatchException(
  message: String,
) : InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXde70d953DecodingException(message)

internal data class InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXde70d953Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1AccountsPeoplePostRequestFormDocumentsAnyOf2X5ad1f544: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1AccountsPeoplePostRequestFormDocumentsAnyOf2X5ad1f544).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people~1{person}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/documents/properties/company_authorization/properties/files/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people~1{person}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/documents/properties/company_authorization/properties/files/items
 */
@Serializable(with = InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXde70d953.Serializer::class)
public class InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXde70d953 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXde70d953Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1AccountsPeoplePostRequestFormDocumentsAnyOf2X5ad1f544:
      InlineV1AccountsPeoplePostRequestFormDocumentsAnyOf2X5ad1f544? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1AccountsPeoplePostRequestFormDocumentsAnyOf2X5ad1f544) json.decodeFromJsonElement<InlineV1AccountsPeoplePostRequestFormDocumentsAnyOf2X5ad1f544>(raw) else null }

  public val matchedBranches:
      Set<InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXde70d953Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXde70d953Branch.Branch1)
      if (inspection.matchesInlineV1AccountsPeoplePostRequestFormDocumentsAnyOf2X5ad1f544) add(InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXde70d953Branch.InlineV1AccountsPeoplePostRequestFormDocumentsAnyOf2X5ad1f544)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXde70d953 {
      val inspection = inspectInlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXde70d953(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXde70d953NoMatchException("InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXde70d953 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXde70d953(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXde70d953> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXde70d953 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXde70d953")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXde70d953) {
      encoder.requireJsonEncoder("InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXde70d953").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXde70d953(element: JsonElement): InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXde70d953Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1AccountsPeoplePostRequestFormDocumentsAnyOf2X5ad1f544 = element.isJsonDecodable<InlineV1AccountsPeoplePostRequestFormDocumentsAnyOf2X5ad1f544>()
  return InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXde70d953Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1AccountsPeoplePostRequestFormDocumentsAnyOf2X5ad1f544 = matchesInlineV1AccountsPeoplePostRequestFormDocumentsAnyOf2X5ad1f544,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1AccountsPeoplePostRequestFormDocumentsAnyOf2X5ad1f544) add("InlineV1AccountsPeoplePostRequestFormDocumentsAnyOf2X5ad1f544: value does not match InlineV1AccountsPeoplePostRequestFormDocumentsAnyOf2X5ad1f544")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
