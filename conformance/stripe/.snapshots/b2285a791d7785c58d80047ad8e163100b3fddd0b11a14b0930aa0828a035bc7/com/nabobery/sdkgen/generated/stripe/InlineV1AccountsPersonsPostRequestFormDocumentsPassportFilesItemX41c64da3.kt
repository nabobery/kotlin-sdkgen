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

public enum class InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX41c64da3Branch {
  Branch1,
  InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemAnyOf2X7ed74d80,
}

public sealed class InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX41c64da3DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX41c64da3NoMatchException(
  message: String,
) : InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX41c64da3DecodingException(message)

internal data class InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX41c64da3Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemAnyOf2X7ed74d80:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemAnyOf2X7ed74d80).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons~1{person}/post/requestBody/content/application
 * ~1x-www-form-urlencoded/schema/properties/documents/properties/passport/properties/files/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons~1{person}/post/requestBody/content/application
 * ~1x-www-form-urlencoded/schema/properties/documents/properties/passport/properties/files/items
 */
@Serializable(with = InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX41c64da3.Serializer::class)
public class InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX41c64da3 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX41c64da3Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemAnyOf2X7ed74d80:
      InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemAnyOf2X7ed74d80? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemAnyOf2X7ed74d80) json.decodeFromJsonElement<InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemAnyOf2X7ed74d80>(raw) else null }

  public val matchedBranches:
      Set<InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX41c64da3Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX41c64da3Branch.Branch1)
      if (inspection.matchesInlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemAnyOf2X7ed74d80) add(InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX41c64da3Branch.InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemAnyOf2X7ed74d80)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX41c64da3 {
      val inspection = inspectInlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX41c64da3(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX41c64da3NoMatchException("InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX41c64da3 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX41c64da3(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX41c64da3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX41c64da3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX41c64da3")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX41c64da3) {
      encoder.requireJsonEncoder("InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX41c64da3").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX41c64da3(element: JsonElement): InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX41c64da3Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemAnyOf2X7ed74d80 = element.isJsonDecodable<InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemAnyOf2X7ed74d80>()
  return InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX41c64da3Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemAnyOf2X7ed74d80 = matchesInlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemAnyOf2X7ed74d80,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemAnyOf2X7ed74d80) add("InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemAnyOf2X7ed74d80: value does not match InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemAnyOf2X7ed74d80")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
