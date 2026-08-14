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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineAccountBusinessProfileAnnualRevenueX7589bbd6Branch {
  AccountAnnualRevenue,
}

public sealed class InlineAccountBusinessProfileAnnualRevenueX7589bbd6DecodingException(
  message: String,
) : SerializationException(message)

public class InlineAccountBusinessProfileAnnualRevenueX7589bbd6NoMatchException(
  message: String,
) : InlineAccountBusinessProfileAnnualRevenueX7589bbd6DecodingException(message)

internal data class InlineAccountBusinessProfileAnnualRevenueX7589bbd6Inspection(
  public val matchesAccountAnnualRevenue: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesAccountAnnualRevenue).count { it }
}

/**
 * The applicant's gross annual revenue for its preceding fiscal year.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_business_profile/properties/annual_revenue
 */
@Serializable(with = InlineAccountBusinessProfileAnnualRevenueX7589bbd6.Serializer::class)
public class InlineAccountBusinessProfileAnnualRevenueX7589bbd6 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineAccountBusinessProfileAnnualRevenueX7589bbd6Inspection,
) {
  public val accountAnnualRevenue: AccountAnnualRevenueView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAccountAnnualRevenue) json.decodeFromJsonElement<AccountAnnualRevenueView>(raw) else null }

  public val matchedBranches: Set<InlineAccountBusinessProfileAnnualRevenueX7589bbd6Branch>
    get() = buildSet {
      if (inspection.matchesAccountAnnualRevenue) add(InlineAccountBusinessProfileAnnualRevenueX7589bbd6Branch.AccountAnnualRevenue)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineAccountBusinessProfileAnnualRevenueX7589bbd6 {
      val inspection = inspectInlineAccountBusinessProfileAnnualRevenueX7589bbd6(raw)
      if (inspection.matchCount == 0) {
        throw InlineAccountBusinessProfileAnnualRevenueX7589bbd6NoMatchException("InlineAccountBusinessProfileAnnualRevenueX7589bbd6 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineAccountBusinessProfileAnnualRevenueX7589bbd6(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineAccountBusinessProfileAnnualRevenueX7589bbd6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAccountBusinessProfileAnnualRevenueX7589bbd6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAccountBusinessProfileAnnualRevenueX7589bbd6")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineAccountBusinessProfileAnnualRevenueX7589bbd6) {
      encoder.requireJsonEncoder("InlineAccountBusinessProfileAnnualRevenueX7589bbd6").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineAccountBusinessProfileAnnualRevenueX7589bbd6(element: JsonElement): InlineAccountBusinessProfileAnnualRevenueX7589bbd6Inspection {
  val raw = element as? JsonObject ?: return InlineAccountBusinessProfileAnnualRevenueX7589bbd6Inspection(
    matchesAccountAnnualRevenue = false,
    failures = listOf("AccountAnnualRevenue: expected JSON object"),
  )
  val matchesAccountAnnualRevenue = true
  return InlineAccountBusinessProfileAnnualRevenueX7589bbd6Inspection(
    matchesAccountAnnualRevenue = matchesAccountAnnualRevenue,
    failures = buildList {
      if (!matchesAccountAnnualRevenue) add("AccountAnnualRevenue: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
