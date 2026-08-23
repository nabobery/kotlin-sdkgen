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

public enum class InlineStackableDiscountWithDiscountSettingsDiscountX14344739Branch {
  Branch1,
  Discount,
}

public sealed class InlineStackableDiscountWithDiscountSettingsDiscountX14344739DecodingException(
  message: String,
) : SerializationException(message)

public class InlineStackableDiscountWithDiscountSettingsDiscountX14344739NoMatchException(
  message: String,
) : InlineStackableDiscountWithDiscountSettingsDiscountX14344739DecodingException(message)

internal data class InlineStackableDiscountWithDiscountSettingsDiscountX14344739Inspection(
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
 * sdkgen://source/openapi.json#/components/schemas/stackable_discount_with_discount_settings/properties/discount
 */
@Serializable(with = InlineStackableDiscountWithDiscountSettingsDiscountX14344739.Serializer::class)
public class InlineStackableDiscountWithDiscountSettingsDiscountX14344739 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineStackableDiscountWithDiscountSettingsDiscountX14344739Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val discount: Discount? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDiscount) json.decodeFromJsonElement<Discount>(raw) else null }

  public val matchedBranches:
      Set<InlineStackableDiscountWithDiscountSettingsDiscountX14344739Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineStackableDiscountWithDiscountSettingsDiscountX14344739Branch.Branch1)
      if (inspection.matchesDiscount) add(InlineStackableDiscountWithDiscountSettingsDiscountX14344739Branch.Discount)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineStackableDiscountWithDiscountSettingsDiscountX14344739 {
      val inspection = inspectInlineStackableDiscountWithDiscountSettingsDiscountX14344739(raw)
      if (inspection.matchCount == 0) {
        throw InlineStackableDiscountWithDiscountSettingsDiscountX14344739NoMatchException("InlineStackableDiscountWithDiscountSettingsDiscountX14344739 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineStackableDiscountWithDiscountSettingsDiscountX14344739(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineStackableDiscountWithDiscountSettingsDiscountX14344739> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineStackableDiscountWithDiscountSettingsDiscountX14344739 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineStackableDiscountWithDiscountSettingsDiscountX14344739")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineStackableDiscountWithDiscountSettingsDiscountX14344739) {
      encoder.requireJsonEncoder("InlineStackableDiscountWithDiscountSettingsDiscountX14344739").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineStackableDiscountWithDiscountSettingsDiscountX14344739(element: JsonElement): InlineStackableDiscountWithDiscountSettingsDiscountX14344739Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesDiscount = element.isJsonDecodable<Discount>()
  return InlineStackableDiscountWithDiscountSettingsDiscountX14344739Inspection(
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
