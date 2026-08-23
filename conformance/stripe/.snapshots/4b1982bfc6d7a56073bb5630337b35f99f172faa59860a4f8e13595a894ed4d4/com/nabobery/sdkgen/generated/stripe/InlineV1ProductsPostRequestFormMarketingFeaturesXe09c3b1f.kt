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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1ProductsPostRequestFormMarketingFeaturesXe09c3b1fBranch {
  Branch1,
  InlineV1ProductsPostRequestFormMarketingFeaturesAnyOf2X8a799335,
}

public sealed class InlineV1ProductsPostRequestFormMarketingFeaturesXe09c3b1fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1ProductsPostRequestFormMarketingFeaturesXe09c3b1fNoMatchException(
  message: String,
) : InlineV1ProductsPostRequestFormMarketingFeaturesXe09c3b1fDecodingException(message)

internal data class InlineV1ProductsPostRequestFormMarketingFeaturesXe09c3b1fInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1ProductsPostRequestFormMarketingFeaturesAnyOf2X8a799335: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1ProductsPostRequestFormMarketingFeaturesAnyOf2X8a799335).count { it }
}

/**
 * A list of up to 15 marketing features for this product. These are displayed in [pricing
 * tables](https://docs.stripe.com/payments/checkout/pricing-table).
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1products~1{id}/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema/properties/marketing_features
 */
@Serializable(with = InlineV1ProductsPostRequestFormMarketingFeaturesXe09c3b1f.Serializer::class)
public class InlineV1ProductsPostRequestFormMarketingFeaturesXe09c3b1f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1ProductsPostRequestFormMarketingFeaturesXe09c3b1fInspection,
) {
  public val branch1: List<InlineV1ProductsPostRequestFormMarketingFeaturesAnyOf1ItemX09be7fb6>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1ProductsPostRequestFormMarketingFeaturesAnyOf1ItemX09be7fb6>>(raw) else null }

  public val inlineV1ProductsPostRequestFormMarketingFeaturesAnyOf2X8a799335:
      InlineV1ProductsPostRequestFormMarketingFeaturesAnyOf2X8a799335? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1ProductsPostRequestFormMarketingFeaturesAnyOf2X8a799335) json.decodeFromJsonElement<InlineV1ProductsPostRequestFormMarketingFeaturesAnyOf2X8a799335>(raw) else null }

  public val matchedBranches: Set<InlineV1ProductsPostRequestFormMarketingFeaturesXe09c3b1fBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1ProductsPostRequestFormMarketingFeaturesXe09c3b1fBranch.Branch1)
      if (inspection.matchesInlineV1ProductsPostRequestFormMarketingFeaturesAnyOf2X8a799335) add(InlineV1ProductsPostRequestFormMarketingFeaturesXe09c3b1fBranch.InlineV1ProductsPostRequestFormMarketingFeaturesAnyOf2X8a799335)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1ProductsPostRequestFormMarketingFeaturesXe09c3b1f {
      val inspection = inspectInlineV1ProductsPostRequestFormMarketingFeaturesXe09c3b1f(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1ProductsPostRequestFormMarketingFeaturesXe09c3b1fNoMatchException("InlineV1ProductsPostRequestFormMarketingFeaturesXe09c3b1f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1ProductsPostRequestFormMarketingFeaturesXe09c3b1f(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1ProductsPostRequestFormMarketingFeaturesXe09c3b1f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ProductsPostRequestFormMarketingFeaturesXe09c3b1f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ProductsPostRequestFormMarketingFeaturesXe09c3b1f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ProductsPostRequestFormMarketingFeaturesXe09c3b1f) {
      encoder.requireJsonEncoder("InlineV1ProductsPostRequestFormMarketingFeaturesXe09c3b1f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1ProductsPostRequestFormMarketingFeaturesXe09c3b1f(element: JsonElement): InlineV1ProductsPostRequestFormMarketingFeaturesXe09c3b1fInspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1ProductsPostRequestFormMarketingFeaturesAnyOf1ItemX09be7fb6>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1ProductsPostRequestFormMarketingFeaturesAnyOf2X8a799335 = element.isJsonDecodable<InlineV1ProductsPostRequestFormMarketingFeaturesAnyOf2X8a799335>()
  return InlineV1ProductsPostRequestFormMarketingFeaturesXe09c3b1fInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1ProductsPostRequestFormMarketingFeaturesAnyOf2X8a799335 = matchesInlineV1ProductsPostRequestFormMarketingFeaturesAnyOf2X8a799335,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1ProductsPostRequestFormMarketingFeaturesAnyOf2X8a799335) add("InlineV1ProductsPostRequestFormMarketingFeaturesAnyOf2X8a799335: value does not match InlineV1ProductsPostRequestFormMarketingFeaturesAnyOf2X8a799335")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
