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

public enum class InlineV1CustomersBalanceTransactionsGetParameterX2d624a4aBranch {
  InlineV1CustomersBalanceTransactionsGetParameterAnyOf1X255bd763,
  Branch2,
}

public sealed class InlineV1CustomersBalanceTransactionsGetParameterX2d624a4aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersBalanceTransactionsGetParameterX2d624a4aNoMatchException(
  message: String,
) : InlineV1CustomersBalanceTransactionsGetParameterX2d624a4aDecodingException(message)

internal data class InlineV1CustomersBalanceTransactionsGetParameterX2d624a4aInspection(
  public val matchesInlineV1CustomersBalanceTransactionsGetParameterAnyOf1X255bd763: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1CustomersBalanceTransactionsGetParameterAnyOf1X255bd763, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1balance_transactions/get/parameters/0/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1balance_transactions/get/parameters/0/schema
 */
@Serializable(with = InlineV1CustomersBalanceTransactionsGetParameterX2d624a4a.Serializer::class)
public class InlineV1CustomersBalanceTransactionsGetParameterX2d624a4a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1CustomersBalanceTransactionsGetParameterX2d624a4aInspection,
) {
  public val inlineV1CustomersBalanceTransactionsGetParameterAnyOf1X255bd763:
      InlineV1CustomersBalanceTransactionsGetParameterAnyOf1X255bd763? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersBalanceTransactionsGetParameterAnyOf1X255bd763) json.decodeFromJsonElement<InlineV1CustomersBalanceTransactionsGetParameterAnyOf1X255bd763>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1CustomersBalanceTransactionsGetParameterX2d624a4aBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1CustomersBalanceTransactionsGetParameterAnyOf1X255bd763) add(InlineV1CustomersBalanceTransactionsGetParameterX2d624a4aBranch.InlineV1CustomersBalanceTransactionsGetParameterAnyOf1X255bd763)
      if (inspection.matchesBranch2) add(InlineV1CustomersBalanceTransactionsGetParameterX2d624a4aBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersBalanceTransactionsGetParameterX2d624a4a {
      val inspection = inspectInlineV1CustomersBalanceTransactionsGetParameterX2d624a4a(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersBalanceTransactionsGetParameterX2d624a4aNoMatchException("InlineV1CustomersBalanceTransactionsGetParameterX2d624a4a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersBalanceTransactionsGetParameterX2d624a4a(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersBalanceTransactionsGetParameterX2d624a4a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersBalanceTransactionsGetParameterX2d624a4a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersBalanceTransactionsGetParameterX2d624a4a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersBalanceTransactionsGetParameterX2d624a4a) {
      encoder.requireJsonEncoder("InlineV1CustomersBalanceTransactionsGetParameterX2d624a4a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersBalanceTransactionsGetParameterX2d624a4a(element: JsonElement): InlineV1CustomersBalanceTransactionsGetParameterX2d624a4aInspection {
  val matchesInlineV1CustomersBalanceTransactionsGetParameterAnyOf1X255bd763 = element.isJsonDecodable<InlineV1CustomersBalanceTransactionsGetParameterAnyOf1X255bd763>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1CustomersBalanceTransactionsGetParameterX2d624a4aInspection(
    matchesInlineV1CustomersBalanceTransactionsGetParameterAnyOf1X255bd763 = matchesInlineV1CustomersBalanceTransactionsGetParameterAnyOf1X255bd763,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1CustomersBalanceTransactionsGetParameterAnyOf1X255bd763) add("InlineV1CustomersBalanceTransactionsGetParameterAnyOf1X255bd763: value does not match InlineV1CustomersBalanceTransactionsGetParameterAnyOf1X255bd763")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
