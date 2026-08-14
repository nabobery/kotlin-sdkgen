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

public enum class InlineV1FinancialConnectionsTransactionsGetParameterX2ce9f0efBranch {
  InlineV1FinancialConnectionsTransactionsGetParameterAnyOf1X3a34dfc8,
  Branch2,
}

public sealed class InlineV1FinancialConnectionsTransactionsGetParameterX2ce9f0efDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1FinancialConnectionsTransactionsGetParameterX2ce9f0efNoMatchException(
  message: String,
) : InlineV1FinancialConnectionsTransactionsGetParameterX2ce9f0efDecodingException(message)

internal data class InlineV1FinancialConnectionsTransactionsGetParameterX2ce9f0efInspection(
  public val matchesInlineV1FinancialConnectionsTransactionsGetParameterAnyOf1X3a34dfc8: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1FinancialConnectionsTransactionsGetParameterAnyOf1X3a34dfc8, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1financial_connections~1transactions/get/parameters/5/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1financial_connections~1transactions/get/parameters/5/schema
 */
@Serializable(with = InlineV1FinancialConnectionsTransactionsGetParameterX2ce9f0ef.Serializer::class)
public class InlineV1FinancialConnectionsTransactionsGetParameterX2ce9f0ef internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1FinancialConnectionsTransactionsGetParameterX2ce9f0efInspection,
) {
  public val inlineV1FinancialConnectionsTransactionsGetParameterAnyOf1X3a34dfc8:
      InlineV1FinancialConnectionsTransactionsGetParameterAnyOf1X3a34dfc8? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1FinancialConnectionsTransactionsGetParameterAnyOf1X3a34dfc8) json.decodeFromJsonElement<InlineV1FinancialConnectionsTransactionsGetParameterAnyOf1X3a34dfc8>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches:
      Set<InlineV1FinancialConnectionsTransactionsGetParameterX2ce9f0efBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1FinancialConnectionsTransactionsGetParameterAnyOf1X3a34dfc8) add(InlineV1FinancialConnectionsTransactionsGetParameterX2ce9f0efBranch.InlineV1FinancialConnectionsTransactionsGetParameterAnyOf1X3a34dfc8)
      if (inspection.matchesBranch2) add(InlineV1FinancialConnectionsTransactionsGetParameterX2ce9f0efBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1FinancialConnectionsTransactionsGetParameterX2ce9f0ef {
      val inspection = inspectInlineV1FinancialConnectionsTransactionsGetParameterX2ce9f0ef(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1FinancialConnectionsTransactionsGetParameterX2ce9f0efNoMatchException("InlineV1FinancialConnectionsTransactionsGetParameterX2ce9f0ef matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1FinancialConnectionsTransactionsGetParameterX2ce9f0ef(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1FinancialConnectionsTransactionsGetParameterX2ce9f0ef> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1FinancialConnectionsTransactionsGetParameterX2ce9f0ef {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1FinancialConnectionsTransactionsGetParameterX2ce9f0ef")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1FinancialConnectionsTransactionsGetParameterX2ce9f0ef) {
      encoder.requireJsonEncoder("InlineV1FinancialConnectionsTransactionsGetParameterX2ce9f0ef").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1FinancialConnectionsTransactionsGetParameterX2ce9f0ef(element: JsonElement): InlineV1FinancialConnectionsTransactionsGetParameterX2ce9f0efInspection {
  val matchesInlineV1FinancialConnectionsTransactionsGetParameterAnyOf1X3a34dfc8 = element.isJsonDecodable<InlineV1FinancialConnectionsTransactionsGetParameterAnyOf1X3a34dfc8>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1FinancialConnectionsTransactionsGetParameterX2ce9f0efInspection(
    matchesInlineV1FinancialConnectionsTransactionsGetParameterAnyOf1X3a34dfc8 = matchesInlineV1FinancialConnectionsTransactionsGetParameterAnyOf1X3a34dfc8,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1FinancialConnectionsTransactionsGetParameterAnyOf1X3a34dfc8) add("InlineV1FinancialConnectionsTransactionsGetParameterAnyOf1X3a34dfc8: value does not match InlineV1FinancialConnectionsTransactionsGetParameterAnyOf1X3a34dfc8")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
