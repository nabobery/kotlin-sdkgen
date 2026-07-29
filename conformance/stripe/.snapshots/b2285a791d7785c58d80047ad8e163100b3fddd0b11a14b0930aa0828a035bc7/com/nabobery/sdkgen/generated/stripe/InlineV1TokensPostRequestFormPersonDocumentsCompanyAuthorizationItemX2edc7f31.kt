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

public enum class InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationItemX2edc7f31Branch {
  Branch1,
  InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationAnyOf2Xcf354dc7,
}

public sealed class InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationItemX2edc7f31DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationItemX2edc7f31NoMatchException(
  message: String,
) : InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationItemX2edc7f31DecodingException(message)

internal data class InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationItemX2edc7f31Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationAnyOf2Xcf354dc7:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationAnyOf2Xcf354dc7).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person/properties/documents/properties/company_authorization/properties/files/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person/properties/documents/properties/company_authorization/properties/files/items
 */
@Serializable(with = InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationItemX2edc7f31.Serializer::class)
public class InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationItemX2edc7f31 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationItemX2edc7f31Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationAnyOf2Xcf354dc7:
      InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationAnyOf2Xcf354dc7? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationAnyOf2Xcf354dc7) json.decodeFromJsonElement<InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationAnyOf2Xcf354dc7>(raw) else null }

  public val matchedBranches:
      Set<InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationItemX2edc7f31Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationItemX2edc7f31Branch.Branch1)
      if (inspection.matchesInlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationAnyOf2Xcf354dc7) add(InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationItemX2edc7f31Branch.InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationAnyOf2Xcf354dc7)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationItemX2edc7f31 {
      val inspection = inspectInlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationItemX2edc7f31(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationItemX2edc7f31NoMatchException("InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationItemX2edc7f31 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationItemX2edc7f31(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationItemX2edc7f31> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationItemX2edc7f31 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationItemX2edc7f31")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationItemX2edc7f31) {
      encoder.requireJsonEncoder("InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationItemX2edc7f31").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationItemX2edc7f31(element: JsonElement): InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationItemX2edc7f31Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationAnyOf2Xcf354dc7 = element.isJsonDecodable<InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationAnyOf2Xcf354dc7>()
  return InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationItemX2edc7f31Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationAnyOf2Xcf354dc7 = matchesInlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationAnyOf2Xcf354dc7,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationAnyOf2Xcf354dc7) add("InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationAnyOf2Xcf354dc7: value does not match InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationAnyOf2Xcf354dc7")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
