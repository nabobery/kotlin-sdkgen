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

public enum class InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemX4549fd31Branch {
  Branch1,
  InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemAnyOf2X7e67feb8,
}

public sealed class InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemX4549fd31DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemX4549fd31NoMatchException(
  message: String,
) : InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemX4549fd31DecodingException(message)

internal data class InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemX4549fd31Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemAnyOf2X7e67feb8:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemAnyOf2X7e67feb8).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people~1{person}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/documents/properties/passport/properties/files/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people~1{person}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/documents/properties/passport/properties/files/items
 */
@Serializable(with = InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemX4549fd31.Serializer::class)
public class InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemX4549fd31 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemX4549fd31Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemAnyOf2X7e67feb8:
      InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemAnyOf2X7e67feb8? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemAnyOf2X7e67feb8) json.decodeFromJsonElement<InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemAnyOf2X7e67feb8>(raw) else null }

  public val matchedBranches:
      Set<InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemX4549fd31Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemX4549fd31Branch.Branch1)
      if (inspection.matchesInlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemAnyOf2X7e67feb8) add(InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemX4549fd31Branch.InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemAnyOf2X7e67feb8)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemX4549fd31 {
      val inspection = inspectInlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemX4549fd31(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemX4549fd31NoMatchException("InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemX4549fd31 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemX4549fd31(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemX4549fd31> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemX4549fd31 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemX4549fd31")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemX4549fd31) {
      encoder.requireJsonEncoder("InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemX4549fd31").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemX4549fd31(element: JsonElement): InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemX4549fd31Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemAnyOf2X7e67feb8 = element.isJsonDecodable<InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemAnyOf2X7e67feb8>()
  return InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemX4549fd31Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemAnyOf2X7e67feb8 = matchesInlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemAnyOf2X7e67feb8,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemAnyOf2X7e67feb8) add("InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemAnyOf2X7e67feb8: value does not match InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemAnyOf2X7e67feb8")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
