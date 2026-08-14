package io.github.nabobery.sdkgen.generated.stripe

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

public enum class InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemXea4b3fc7Branch {
  Branch1,
  InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemAnyOf2X1884c8ce,
}

public sealed class InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemXea4b3fc7DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemXea4b3fc7NoMatchException(
  message: String,
) : InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemXea4b3fc7DecodingException(message)

internal data class InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemXea4b3fc7Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemAnyOf2X1884c8ce:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemAnyOf2X1884c8ce).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/documents/properties/passport/properties/files/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/documents/properties/passport/properties/files/items
 */
@Serializable(with = InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemXea4b3fc7.Serializer::class)
public class InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemXea4b3fc7 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemXea4b3fc7Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemAnyOf2X1884c8ce:
      InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemAnyOf2X1884c8ce? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemAnyOf2X1884c8ce) json.decodeFromJsonElement<InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemAnyOf2X1884c8ce>(raw) else null }

  public val matchedBranches:
      Set<InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemXea4b3fc7Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemXea4b3fc7Branch.Branch1)
      if (inspection.matchesInlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemAnyOf2X1884c8ce) add(InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemXea4b3fc7Branch.InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemAnyOf2X1884c8ce)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemXea4b3fc7 {
      val inspection = inspectInlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemXea4b3fc7(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemXea4b3fc7NoMatchException("InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemXea4b3fc7 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemXea4b3fc7(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemXea4b3fc7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemXea4b3fc7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemXea4b3fc7")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemXea4b3fc7) {
      encoder.requireJsonEncoder("InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemXea4b3fc7").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemXea4b3fc7(element: JsonElement): InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemXea4b3fc7Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemAnyOf2X1884c8ce = element.isJsonDecodable<InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemAnyOf2X1884c8ce>()
  return InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemXea4b3fc7Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemAnyOf2X1884c8ce = matchesInlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemAnyOf2X1884c8ce,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemAnyOf2X1884c8ce) add("InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemAnyOf2X1884c8ce: value does not match InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemAnyOf2X1884c8ce")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
