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

public enum class InlineV1TreasuryFinancialAccountsGetParameterXebac99baBranch {
  InlineV1TreasuryFinancialAccountsGetParameterAnyOf1X2c4f5a13,
  Branch2,
}

public sealed class InlineV1TreasuryFinancialAccountsGetParameterXebac99baDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TreasuryFinancialAccountsGetParameterXebac99baNoMatchException(
  message: String,
) : InlineV1TreasuryFinancialAccountsGetParameterXebac99baDecodingException(message)

internal data class InlineV1TreasuryFinancialAccountsGetParameterXebac99baInspection(
  public val matchesInlineV1TreasuryFinancialAccountsGetParameterAnyOf1X2c4f5a13: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1TreasuryFinancialAccountsGetParameterAnyOf1X2c4f5a13, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts/get/parameters/0/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts/get/parameters/0/schema
 */
@Serializable(with = InlineV1TreasuryFinancialAccountsGetParameterXebac99ba.Serializer::class)
public class InlineV1TreasuryFinancialAccountsGetParameterXebac99ba internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1TreasuryFinancialAccountsGetParameterXebac99baInspection,
) {
  public val inlineV1TreasuryFinancialAccountsGetParameterAnyOf1X2c4f5a13:
      InlineV1TreasuryFinancialAccountsGetParameterAnyOf1X2c4f5a13? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TreasuryFinancialAccountsGetParameterAnyOf1X2c4f5a13) json.decodeFromJsonElement<InlineV1TreasuryFinancialAccountsGetParameterAnyOf1X2c4f5a13>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1TreasuryFinancialAccountsGetParameterXebac99baBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1TreasuryFinancialAccountsGetParameterAnyOf1X2c4f5a13) add(InlineV1TreasuryFinancialAccountsGetParameterXebac99baBranch.InlineV1TreasuryFinancialAccountsGetParameterAnyOf1X2c4f5a13)
      if (inspection.matchesBranch2) add(InlineV1TreasuryFinancialAccountsGetParameterXebac99baBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TreasuryFinancialAccountsGetParameterXebac99ba {
      val inspection = inspectInlineV1TreasuryFinancialAccountsGetParameterXebac99ba(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TreasuryFinancialAccountsGetParameterXebac99baNoMatchException("InlineV1TreasuryFinancialAccountsGetParameterXebac99ba matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TreasuryFinancialAccountsGetParameterXebac99ba(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1TreasuryFinancialAccountsGetParameterXebac99ba> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TreasuryFinancialAccountsGetParameterXebac99ba {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TreasuryFinancialAccountsGetParameterXebac99ba")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryFinancialAccountsGetParameterXebac99ba) {
      encoder.requireJsonEncoder("InlineV1TreasuryFinancialAccountsGetParameterXebac99ba").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TreasuryFinancialAccountsGetParameterXebac99ba(element: JsonElement): InlineV1TreasuryFinancialAccountsGetParameterXebac99baInspection {
  val matchesInlineV1TreasuryFinancialAccountsGetParameterAnyOf1X2c4f5a13 = element.isJsonDecodable<InlineV1TreasuryFinancialAccountsGetParameterAnyOf1X2c4f5a13>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1TreasuryFinancialAccountsGetParameterXebac99baInspection(
    matchesInlineV1TreasuryFinancialAccountsGetParameterAnyOf1X2c4f5a13 = matchesInlineV1TreasuryFinancialAccountsGetParameterAnyOf1X2c4f5a13,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1TreasuryFinancialAccountsGetParameterAnyOf1X2c4f5a13) add("InlineV1TreasuryFinancialAccountsGetParameterAnyOf1X2c4f5a13: value does not match InlineV1TreasuryFinancialAccountsGetParameterAnyOf1X2c4f5a13")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
