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

public enum class InlineStackableDiscountWithDiscountSettingsPromotionCodeXc717165fBranch {
  Branch1,
  PromotionCode,
}

public sealed class InlineStackableDiscountWithDiscountSettingsPromotionCodeXc717165fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineStackableDiscountWithDiscountSettingsPromotionCodeXc717165fNoMatchException(
  message: String,
) : InlineStackableDiscountWithDiscountSettingsPromotionCodeXc717165fDecodingException(message)

internal data class InlineStackableDiscountWithDiscountSettingsPromotionCodeXc717165fInspection(
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
 * sdkgen://source/openapi.json#/components/schemas/stackable_discount_with_discount_settings/properties/promotion_code
 */
@Serializable(with = InlineStackableDiscountWithDiscountSettingsPromotionCodeXc717165f.Serializer::class)
public class InlineStackableDiscountWithDiscountSettingsPromotionCodeXc717165f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineStackableDiscountWithDiscountSettingsPromotionCodeXc717165fInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val promotionCode: PromotionCode? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPromotionCode) json.decodeFromJsonElement<PromotionCode>(raw) else null }

  public val matchedBranches:
      Set<InlineStackableDiscountWithDiscountSettingsPromotionCodeXc717165fBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineStackableDiscountWithDiscountSettingsPromotionCodeXc717165fBranch.Branch1)
      if (inspection.matchesPromotionCode) add(InlineStackableDiscountWithDiscountSettingsPromotionCodeXc717165fBranch.PromotionCode)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineStackableDiscountWithDiscountSettingsPromotionCodeXc717165f {
      val inspection = inspectInlineStackableDiscountWithDiscountSettingsPromotionCodeXc717165f(raw)
      if (inspection.matchCount == 0) {
        throw InlineStackableDiscountWithDiscountSettingsPromotionCodeXc717165fNoMatchException("InlineStackableDiscountWithDiscountSettingsPromotionCodeXc717165f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineStackableDiscountWithDiscountSettingsPromotionCodeXc717165f(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineStackableDiscountWithDiscountSettingsPromotionCodeXc717165f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineStackableDiscountWithDiscountSettingsPromotionCodeXc717165f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineStackableDiscountWithDiscountSettingsPromotionCodeXc717165f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineStackableDiscountWithDiscountSettingsPromotionCodeXc717165f) {
      encoder.requireJsonEncoder("InlineStackableDiscountWithDiscountSettingsPromotionCodeXc717165f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineStackableDiscountWithDiscountSettingsPromotionCodeXc717165f(element: JsonElement): InlineStackableDiscountWithDiscountSettingsPromotionCodeXc717165fInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesPromotionCode = element.isJsonDecodable<PromotionCode>()
  return InlineStackableDiscountWithDiscountSettingsPromotionCodeXc717165fInspection(
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
