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

public enum class InlineV1BalanceTransactionsGetParameterX9b5f3353Branch {
  InlineV1BalanceTransactionsGetParameterAnyOf1X58908c72,
  Branch2,
}

public sealed class InlineV1BalanceTransactionsGetParameterX9b5f3353DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1BalanceTransactionsGetParameterX9b5f3353NoMatchException(
  message: String,
) : InlineV1BalanceTransactionsGetParameterX9b5f3353DecodingException(message)

internal data class InlineV1BalanceTransactionsGetParameterX9b5f3353Inspection(
  public val matchesInlineV1BalanceTransactionsGetParameterAnyOf1X58908c72: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1BalanceTransactionsGetParameterAnyOf1X58908c72, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/paths/~1v1~1balance_transactions/get/parameters/0/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1balance_transactions/get/parameters/0/schema
 */
@Serializable(with = InlineV1BalanceTransactionsGetParameterX9b5f3353.Serializer::class)
public class InlineV1BalanceTransactionsGetParameterX9b5f3353 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1BalanceTransactionsGetParameterX9b5f3353Inspection,
) {
  public val inlineV1BalanceTransactionsGetParameterAnyOf1X58908c72:
      InlineV1BalanceTransactionsGetParameterAnyOf1X58908c72? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1BalanceTransactionsGetParameterAnyOf1X58908c72) json.decodeFromJsonElement<InlineV1BalanceTransactionsGetParameterAnyOf1X58908c72>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1BalanceTransactionsGetParameterX9b5f3353Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1BalanceTransactionsGetParameterAnyOf1X58908c72) add(InlineV1BalanceTransactionsGetParameterX9b5f3353Branch.InlineV1BalanceTransactionsGetParameterAnyOf1X58908c72)
      if (inspection.matchesBranch2) add(InlineV1BalanceTransactionsGetParameterX9b5f3353Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1BalanceTransactionsGetParameterX9b5f3353 {
      val inspection = inspectInlineV1BalanceTransactionsGetParameterX9b5f3353(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1BalanceTransactionsGetParameterX9b5f3353NoMatchException("InlineV1BalanceTransactionsGetParameterX9b5f3353 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1BalanceTransactionsGetParameterX9b5f3353(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1BalanceTransactionsGetParameterX9b5f3353> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BalanceTransactionsGetParameterX9b5f3353 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BalanceTransactionsGetParameterX9b5f3353")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BalanceTransactionsGetParameterX9b5f3353) {
      encoder.requireJsonEncoder("InlineV1BalanceTransactionsGetParameterX9b5f3353").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1BalanceTransactionsGetParameterX9b5f3353(element: JsonElement): InlineV1BalanceTransactionsGetParameterX9b5f3353Inspection {
  val matchesInlineV1BalanceTransactionsGetParameterAnyOf1X58908c72 = element.isJsonDecodable<InlineV1BalanceTransactionsGetParameterAnyOf1X58908c72>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1BalanceTransactionsGetParameterX9b5f3353Inspection(
    matchesInlineV1BalanceTransactionsGetParameterAnyOf1X58908c72 = matchesInlineV1BalanceTransactionsGetParameterAnyOf1X58908c72,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1BalanceTransactionsGetParameterAnyOf1X58908c72) add("InlineV1BalanceTransactionsGetParameterAnyOf1X58908c72: value does not match InlineV1BalanceTransactionsGetParameterAnyOf1X58908c72")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
