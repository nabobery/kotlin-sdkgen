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

public enum class InlineV1QuotesPostRequestFormTransferDataXa5f9394fBranch {
  InlineV1QuotesPostRequestFormTransferDataAnyOf1Xaf14f9ba,
  InlineV1QuotesPostRequestFormTransferDataAnyOf2Xd7044e71,
}

public sealed class InlineV1QuotesPostRequestFormTransferDataXa5f9394fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1QuotesPostRequestFormTransferDataXa5f9394fNoMatchException(
  message: String,
) : InlineV1QuotesPostRequestFormTransferDataXa5f9394fDecodingException(message)

internal data class InlineV1QuotesPostRequestFormTransferDataXa5f9394fInspection(
  public val matchesInlineV1QuotesPostRequestFormTransferDataAnyOf1Xaf14f9ba: Boolean,
  public val matchesInlineV1QuotesPostRequestFormTransferDataAnyOf2Xd7044e71: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1QuotesPostRequestFormTransferDataAnyOf1Xaf14f9ba, matchesInlineV1QuotesPostRequestFormTransferDataAnyOf2Xd7044e71).count { it }
}

/**
 * The data with which to automatically create a Transfer for each of the invoices.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/transfer_data
 */
@Serializable(with = InlineV1QuotesPostRequestFormTransferDataXa5f9394f.Serializer::class)
public class InlineV1QuotesPostRequestFormTransferDataXa5f9394f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1QuotesPostRequestFormTransferDataXa5f9394fInspection,
) {
  public val inlineV1QuotesPostRequestFormTransferDataAnyOf1Xaf14f9ba:
      InlineV1QuotesPostRequestFormTransferDataAnyOf1Xaf14f9ba? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1QuotesPostRequestFormTransferDataAnyOf1Xaf14f9ba) json.decodeFromJsonElement<InlineV1QuotesPostRequestFormTransferDataAnyOf1Xaf14f9ba>(raw) else null }

  public val inlineV1QuotesPostRequestFormTransferDataAnyOf2Xd7044e71:
      InlineV1QuotesPostRequestFormTransferDataAnyOf2Xd7044e71? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1QuotesPostRequestFormTransferDataAnyOf2Xd7044e71) json.decodeFromJsonElement<InlineV1QuotesPostRequestFormTransferDataAnyOf2Xd7044e71>(raw) else null }

  public val matchedBranches: Set<InlineV1QuotesPostRequestFormTransferDataXa5f9394fBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1QuotesPostRequestFormTransferDataAnyOf1Xaf14f9ba) add(InlineV1QuotesPostRequestFormTransferDataXa5f9394fBranch.InlineV1QuotesPostRequestFormTransferDataAnyOf1Xaf14f9ba)
      if (inspection.matchesInlineV1QuotesPostRequestFormTransferDataAnyOf2Xd7044e71) add(InlineV1QuotesPostRequestFormTransferDataXa5f9394fBranch.InlineV1QuotesPostRequestFormTransferDataAnyOf2Xd7044e71)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1QuotesPostRequestFormTransferDataXa5f9394f {
      val inspection = inspectInlineV1QuotesPostRequestFormTransferDataXa5f9394f(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1QuotesPostRequestFormTransferDataXa5f9394fNoMatchException("InlineV1QuotesPostRequestFormTransferDataXa5f9394f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1QuotesPostRequestFormTransferDataXa5f9394f(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1QuotesPostRequestFormTransferDataXa5f9394f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormTransferDataXa5f9394f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1QuotesPostRequestFormTransferDataXa5f9394f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesPostRequestFormTransferDataXa5f9394f) {
      encoder.requireJsonEncoder("InlineV1QuotesPostRequestFormTransferDataXa5f9394f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1QuotesPostRequestFormTransferDataXa5f9394f(element: JsonElement): InlineV1QuotesPostRequestFormTransferDataXa5f9394fInspection {
  val matchesInlineV1QuotesPostRequestFormTransferDataAnyOf1Xaf14f9ba = element.isJsonDecodable<InlineV1QuotesPostRequestFormTransferDataAnyOf1Xaf14f9ba>()
  val matchesInlineV1QuotesPostRequestFormTransferDataAnyOf2Xd7044e71 = element.isJsonDecodable<InlineV1QuotesPostRequestFormTransferDataAnyOf2Xd7044e71>()
  return InlineV1QuotesPostRequestFormTransferDataXa5f9394fInspection(
    matchesInlineV1QuotesPostRequestFormTransferDataAnyOf1Xaf14f9ba = matchesInlineV1QuotesPostRequestFormTransferDataAnyOf1Xaf14f9ba,
    matchesInlineV1QuotesPostRequestFormTransferDataAnyOf2Xd7044e71 = matchesInlineV1QuotesPostRequestFormTransferDataAnyOf2Xd7044e71,
    failures = buildList {
      if (!matchesInlineV1QuotesPostRequestFormTransferDataAnyOf1Xaf14f9ba) add("InlineV1QuotesPostRequestFormTransferDataAnyOf1Xaf14f9ba: value does not match InlineV1QuotesPostRequestFormTransferDataAnyOf1Xaf14f9ba")
      if (!matchesInlineV1QuotesPostRequestFormTransferDataAnyOf2Xd7044e71) add("InlineV1QuotesPostRequestFormTransferDataAnyOf2Xd7044e71: value does not match InlineV1QuotesPostRequestFormTransferDataAnyOf2Xd7044e71")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
