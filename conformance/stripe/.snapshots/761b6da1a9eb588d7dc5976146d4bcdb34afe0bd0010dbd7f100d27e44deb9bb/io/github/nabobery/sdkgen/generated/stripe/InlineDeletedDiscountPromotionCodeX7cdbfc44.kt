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

public enum class InlineDeletedDiscountPromotionCodeX7cdbfc44Branch {
  Branch1,
  PromotionCode,
}

public sealed class InlineDeletedDiscountPromotionCodeX7cdbfc44DecodingException(
  message: String,
) : SerializationException(message)

public class InlineDeletedDiscountPromotionCodeX7cdbfc44NoMatchException(
  message: String,
) : InlineDeletedDiscountPromotionCodeX7cdbfc44DecodingException(message)

internal data class InlineDeletedDiscountPromotionCodeX7cdbfc44Inspection(
  public val matchesBranch1: Boolean,
  public val matchesPromotionCode: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesPromotionCode).count { it }
}

/**
 * The promotion code applied to create this discount.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/deleted_discount/properties/promotion_code
 */
@Serializable(with = InlineDeletedDiscountPromotionCodeX7cdbfc44.Serializer::class)
public class InlineDeletedDiscountPromotionCodeX7cdbfc44 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineDeletedDiscountPromotionCodeX7cdbfc44Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val promotionCode: PromotionCode? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPromotionCode) json.decodeFromJsonElement<PromotionCode>(raw) else null }

  public val matchedBranches: Set<InlineDeletedDiscountPromotionCodeX7cdbfc44Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineDeletedDiscountPromotionCodeX7cdbfc44Branch.Branch1)
      if (inspection.matchesPromotionCode) add(InlineDeletedDiscountPromotionCodeX7cdbfc44Branch.PromotionCode)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineDeletedDiscountPromotionCodeX7cdbfc44 {
      val inspection = inspectInlineDeletedDiscountPromotionCodeX7cdbfc44(raw)
      if (inspection.matchCount == 0) {
        throw InlineDeletedDiscountPromotionCodeX7cdbfc44NoMatchException("InlineDeletedDiscountPromotionCodeX7cdbfc44 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineDeletedDiscountPromotionCodeX7cdbfc44(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineDeletedDiscountPromotionCodeX7cdbfc44> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineDeletedDiscountPromotionCodeX7cdbfc44 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineDeletedDiscountPromotionCodeX7cdbfc44")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineDeletedDiscountPromotionCodeX7cdbfc44) {
      encoder.requireJsonEncoder("InlineDeletedDiscountPromotionCodeX7cdbfc44").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineDeletedDiscountPromotionCodeX7cdbfc44(element: JsonElement): InlineDeletedDiscountPromotionCodeX7cdbfc44Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesPromotionCode = element.isJsonDecodable<PromotionCode>()
  return InlineDeletedDiscountPromotionCodeX7cdbfc44Inspection(
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
