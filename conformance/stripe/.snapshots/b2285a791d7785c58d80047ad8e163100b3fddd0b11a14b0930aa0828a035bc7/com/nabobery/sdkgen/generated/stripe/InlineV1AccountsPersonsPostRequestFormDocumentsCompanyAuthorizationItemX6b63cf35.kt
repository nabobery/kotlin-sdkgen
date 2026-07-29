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

public enum class InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemX6b63cf35Branch {
  Branch1,
  InlineV1AccountsPersonsPostRequestFormDocumentsAnyOf2Xdc664011,
}

public sealed class InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemX6b63cf35DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemX6b63cf35NoMatchException(
  message: String,
) : InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemX6b63cf35DecodingException(message)

internal data class InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemX6b63cf35Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1AccountsPersonsPostRequestFormDocumentsAnyOf2Xdc664011: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1AccountsPersonsPostRequestFormDocumentsAnyOf2Xdc664011).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/documents/properties/company_authorization/properties/files/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/documents/properties/company_authorization/properties/files/items
 */
@Serializable(with = InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemX6b63cf35.Serializer::class)
public class InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemX6b63cf35 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemX6b63cf35Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1AccountsPersonsPostRequestFormDocumentsAnyOf2Xdc664011:
      InlineV1AccountsPersonsPostRequestFormDocumentsAnyOf2Xdc664011? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1AccountsPersonsPostRequestFormDocumentsAnyOf2Xdc664011) json.decodeFromJsonElement<InlineV1AccountsPersonsPostRequestFormDocumentsAnyOf2Xdc664011>(raw) else null }

  public val matchedBranches:
      Set<InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemX6b63cf35Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemX6b63cf35Branch.Branch1)
      if (inspection.matchesInlineV1AccountsPersonsPostRequestFormDocumentsAnyOf2Xdc664011) add(InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemX6b63cf35Branch.InlineV1AccountsPersonsPostRequestFormDocumentsAnyOf2Xdc664011)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemX6b63cf35 {
      val inspection = inspectInlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemX6b63cf35(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemX6b63cf35NoMatchException("InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemX6b63cf35 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemX6b63cf35(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemX6b63cf35> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemX6b63cf35 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemX6b63cf35")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemX6b63cf35) {
      encoder.requireJsonEncoder("InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemX6b63cf35").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemX6b63cf35(element: JsonElement): InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemX6b63cf35Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1AccountsPersonsPostRequestFormDocumentsAnyOf2Xdc664011 = element.isJsonDecodable<InlineV1AccountsPersonsPostRequestFormDocumentsAnyOf2Xdc664011>()
  return InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemX6b63cf35Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1AccountsPersonsPostRequestFormDocumentsAnyOf2Xdc664011 = matchesInlineV1AccountsPersonsPostRequestFormDocumentsAnyOf2Xdc664011,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1AccountsPersonsPostRequestFormDocumentsAnyOf2Xdc664011) add("InlineV1AccountsPersonsPostRequestFormDocumentsAnyOf2Xdc664011: value does not match InlineV1AccountsPersonsPostRequestFormDocumentsAnyOf2Xdc664011")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
