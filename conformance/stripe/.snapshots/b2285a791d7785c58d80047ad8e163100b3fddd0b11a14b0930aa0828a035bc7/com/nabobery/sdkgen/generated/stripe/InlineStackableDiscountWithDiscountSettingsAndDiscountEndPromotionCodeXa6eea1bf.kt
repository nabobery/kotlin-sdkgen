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

public enum class InlineStackableDiscountWithDiscountSettingsAndDiscountEndPromotionCodeXa6eea1bfBranch {
  Branch1,
  PromotionCode,
}

public sealed class InlineStackableDiscountWithDiscountSettingsAndDiscountEndPromotionCodeXa6eea1bfDecodingException(
  message: String,
) : SerializationException(message)

public class InlineStackableDiscountWithDiscountSettingsAndDiscountEndPromotionCodeXa6eea1bfNoMatchException(
  message: String,
) : InlineStackableDiscountWithDiscountSettingsAndDiscountEndPromotionCodeXa6eea1bfDecodingException(message)

internal data class InlineStackableDiscountWithDiscountSettingsAndDiscountEndPromotionCodeXa6eea1bfInspection(
  public val matchesBranch1: Boolean,
  public val matchesPromotionCode: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesPromotionCode).count { it }
}

/**
 * ID of the promotion code to create a new discount for.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/stackable_discount_with_discount_settings_and_discount_end/propertie
 * s/promotion_code
 */
@Serializable(with = InlineStackableDiscountWithDiscountSettingsAndDiscountEndPromotionCodeXa6eea1bf.Serializer::class)
public class InlineStackableDiscountWithDiscountSettingsAndDiscountEndPromotionCodeXa6eea1bf internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineStackableDiscountWithDiscountSettingsAndDiscountEndPromotionCodeXa6eea1bfInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val promotionCode: PromotionCode? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPromotionCode) json.decodeFromJsonElement<PromotionCode>(raw) else null }

  public val matchedBranches:
      Set<InlineStackableDiscountWithDiscountSettingsAndDiscountEndPromotionCodeXa6eea1bfBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineStackableDiscountWithDiscountSettingsAndDiscountEndPromotionCodeXa6eea1bfBranch.Branch1)
      if (inspection.matchesPromotionCode) add(InlineStackableDiscountWithDiscountSettingsAndDiscountEndPromotionCodeXa6eea1bfBranch.PromotionCode)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineStackableDiscountWithDiscountSettingsAndDiscountEndPromotionCodeXa6eea1bf {
      val inspection = inspectInlineStackableDiscountWithDiscountSettingsAndDiscountEndPromotionCodeXa6eea1bf(raw)
      if (inspection.matchCount == 0) {
        throw InlineStackableDiscountWithDiscountSettingsAndDiscountEndPromotionCodeXa6eea1bfNoMatchException("InlineStackableDiscountWithDiscountSettingsAndDiscountEndPromotionCodeXa6eea1bf matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineStackableDiscountWithDiscountSettingsAndDiscountEndPromotionCodeXa6eea1bf(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineStackableDiscountWithDiscountSettingsAndDiscountEndPromotionCodeXa6eea1bf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineStackableDiscountWithDiscountSettingsAndDiscountEndPromotionCodeXa6eea1bf {
      val jsonDecoder = decoder.requireJsonDecoder("InlineStackableDiscountWithDiscountSettingsAndDiscountEndPromotionCodeXa6eea1bf")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineStackableDiscountWithDiscountSettingsAndDiscountEndPromotionCodeXa6eea1bf) {
      encoder.requireJsonEncoder("InlineStackableDiscountWithDiscountSettingsAndDiscountEndPromotionCodeXa6eea1bf").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineStackableDiscountWithDiscountSettingsAndDiscountEndPromotionCodeXa6eea1bf(element: JsonElement): InlineStackableDiscountWithDiscountSettingsAndDiscountEndPromotionCodeXa6eea1bfInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesPromotionCode = element.isJsonDecodable<PromotionCode>()
  return InlineStackableDiscountWithDiscountSettingsAndDiscountEndPromotionCodeXa6eea1bfInspection(
    matchesBranch1 = matchesBranch1,
    matchesPromotionCode = matchesPromotionCode,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesPromotionCode) add("PromotionCode: value does not match PromotionCode")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
