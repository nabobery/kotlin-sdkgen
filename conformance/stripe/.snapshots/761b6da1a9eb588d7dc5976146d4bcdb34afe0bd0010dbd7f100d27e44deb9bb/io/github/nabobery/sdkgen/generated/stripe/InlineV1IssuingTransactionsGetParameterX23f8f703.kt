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

public enum class InlineV1IssuingTransactionsGetParameterX23f8f703Branch {
  InlineV1IssuingTransactionsGetParameterAnyOf1Xd7ffb325,
  Branch2,
}

public sealed class InlineV1IssuingTransactionsGetParameterX23f8f703DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingTransactionsGetParameterX23f8f703NoMatchException(
  message: String,
) : InlineV1IssuingTransactionsGetParameterX23f8f703DecodingException(message)

internal data class InlineV1IssuingTransactionsGetParameterX23f8f703Inspection(
  public val matchesInlineV1IssuingTransactionsGetParameterAnyOf1Xd7ffb325: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1IssuingTransactionsGetParameterAnyOf1Xd7ffb325, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/paths/~1v1~1issuing~1transactions/get/parameters/2/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1issuing~1transactions/get/parameters/2/schema
 */
@Serializable(with = InlineV1IssuingTransactionsGetParameterX23f8f703.Serializer::class)
public class InlineV1IssuingTransactionsGetParameterX23f8f703 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1IssuingTransactionsGetParameterX23f8f703Inspection,
) {
  public val inlineV1IssuingTransactionsGetParameterAnyOf1Xd7ffb325:
      InlineV1IssuingTransactionsGetParameterAnyOf1Xd7ffb325? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingTransactionsGetParameterAnyOf1Xd7ffb325) json.decodeFromJsonElement<InlineV1IssuingTransactionsGetParameterAnyOf1Xd7ffb325>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1IssuingTransactionsGetParameterX23f8f703Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1IssuingTransactionsGetParameterAnyOf1Xd7ffb325) add(InlineV1IssuingTransactionsGetParameterX23f8f703Branch.InlineV1IssuingTransactionsGetParameterAnyOf1Xd7ffb325)
      if (inspection.matchesBranch2) add(InlineV1IssuingTransactionsGetParameterX23f8f703Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingTransactionsGetParameterX23f8f703 {
      val inspection = inspectInlineV1IssuingTransactionsGetParameterX23f8f703(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingTransactionsGetParameterX23f8f703NoMatchException("InlineV1IssuingTransactionsGetParameterX23f8f703 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingTransactionsGetParameterX23f8f703(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingTransactionsGetParameterX23f8f703> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingTransactionsGetParameterX23f8f703 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingTransactionsGetParameterX23f8f703")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingTransactionsGetParameterX23f8f703) {
      encoder.requireJsonEncoder("InlineV1IssuingTransactionsGetParameterX23f8f703").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingTransactionsGetParameterX23f8f703(element: JsonElement): InlineV1IssuingTransactionsGetParameterX23f8f703Inspection {
  val matchesInlineV1IssuingTransactionsGetParameterAnyOf1Xd7ffb325 = element.isJsonDecodable<InlineV1IssuingTransactionsGetParameterAnyOf1Xd7ffb325>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1IssuingTransactionsGetParameterX23f8f703Inspection(
    matchesInlineV1IssuingTransactionsGetParameterAnyOf1Xd7ffb325 = matchesInlineV1IssuingTransactionsGetParameterAnyOf1Xd7ffb325,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1IssuingTransactionsGetParameterAnyOf1Xd7ffb325) add("InlineV1IssuingTransactionsGetParameterAnyOf1Xd7ffb325: value does not match InlineV1IssuingTransactionsGetParameterAnyOf1Xd7ffb325")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
