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
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesX999dcfcfBranch {
  Branch1,
  InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X6eb0dbd6,
}

public sealed class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesX999dcfcfDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesX999dcfcfNoMatchException(
  message: String,
) : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesX999dcfcfDecodingException(message)

internal data class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesX999dcfcfInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X6eb0dbd6: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X6eb0dbd6).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/phases/items/properties/default_tax_rates.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/phases/items/properties/default_tax_rates
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesX999dcfcf.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesX999dcfcf internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesX999dcfcfInspection,
) {
  public val branch1: List<String>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null }

  public val inlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X6eb0dbd6:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X6eb0dbd6? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X6eb0dbd6) json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X6eb0dbd6>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesX999dcfcfBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesX999dcfcfBranch.Branch1)
      if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X6eb0dbd6) add(InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesX999dcfcfBranch.InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X6eb0dbd6)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesX999dcfcf {
      val inspection = inspectInlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesX999dcfcf(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesX999dcfcfNoMatchException("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesX999dcfcf matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesX999dcfcf(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesX999dcfcf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesX999dcfcf {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesX999dcfcf")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesX999dcfcf) {
      encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesX999dcfcf").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesX999dcfcf(element: JsonElement): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesX999dcfcfInspection {
  val matchesBranch1 = element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X6eb0dbd6 = element.isJsonDecodable<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X6eb0dbd6>()
  return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesX999dcfcfInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X6eb0dbd6 = matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X6eb0dbd6,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X6eb0dbd6) add("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X6eb0dbd6: value does not match InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X6eb0dbd6")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
