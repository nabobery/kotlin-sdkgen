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

public enum class InlineStackableDiscountWithDiscountSettingsAndDiscountEndDiscountX1c59d240Branch {
  Branch1,
  Discount,
}

public sealed class InlineStackableDiscountWithDiscountSettingsAndDiscountEndDiscountX1c59d240DecodingException(
  message: String,
) : SerializationException(message)

public class InlineStackableDiscountWithDiscountSettingsAndDiscountEndDiscountX1c59d240NoMatchException(
  message: String,
) : InlineStackableDiscountWithDiscountSettingsAndDiscountEndDiscountX1c59d240DecodingException(message)

internal data class InlineStackableDiscountWithDiscountSettingsAndDiscountEndDiscountX1c59d240Inspection(
  public val matchesBranch1: Boolean,
  public val matchesDiscount: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesDiscount).count { it }
}

/**
 * ID of an existing discount on the object (or one of its ancestors) to reuse.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/stackable_discount_with_discount_settings_and_discount_end/propertie
 * s/discount
 */
@Serializable(with = InlineStackableDiscountWithDiscountSettingsAndDiscountEndDiscountX1c59d240.Serializer::class)
public class InlineStackableDiscountWithDiscountSettingsAndDiscountEndDiscountX1c59d240 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineStackableDiscountWithDiscountSettingsAndDiscountEndDiscountX1c59d240Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val discount: Discount? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDiscount) json.decodeFromJsonElement<Discount>(raw) else null }

  public val matchedBranches:
      Set<InlineStackableDiscountWithDiscountSettingsAndDiscountEndDiscountX1c59d240Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineStackableDiscountWithDiscountSettingsAndDiscountEndDiscountX1c59d240Branch.Branch1)
      if (inspection.matchesDiscount) add(InlineStackableDiscountWithDiscountSettingsAndDiscountEndDiscountX1c59d240Branch.Discount)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineStackableDiscountWithDiscountSettingsAndDiscountEndDiscountX1c59d240 {
      val inspection = inspectInlineStackableDiscountWithDiscountSettingsAndDiscountEndDiscountX1c59d240(raw)
      if (inspection.matchCount == 0) {
        throw InlineStackableDiscountWithDiscountSettingsAndDiscountEndDiscountX1c59d240NoMatchException("InlineStackableDiscountWithDiscountSettingsAndDiscountEndDiscountX1c59d240 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineStackableDiscountWithDiscountSettingsAndDiscountEndDiscountX1c59d240(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineStackableDiscountWithDiscountSettingsAndDiscountEndDiscountX1c59d240> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineStackableDiscountWithDiscountSettingsAndDiscountEndDiscountX1c59d240 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineStackableDiscountWithDiscountSettingsAndDiscountEndDiscountX1c59d240")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineStackableDiscountWithDiscountSettingsAndDiscountEndDiscountX1c59d240) {
      encoder.requireJsonEncoder("InlineStackableDiscountWithDiscountSettingsAndDiscountEndDiscountX1c59d240").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineStackableDiscountWithDiscountSettingsAndDiscountEndDiscountX1c59d240(element: JsonElement): InlineStackableDiscountWithDiscountSettingsAndDiscountEndDiscountX1c59d240Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesDiscount = element.isJsonDecodable<Discount>()
  return InlineStackableDiscountWithDiscountSettingsAndDiscountEndDiscountX1c59d240Inspection(
    matchesBranch1 = matchesBranch1,
    matchesDiscount = matchesDiscount,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesDiscount) add("Discount: value does not match Discount")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
