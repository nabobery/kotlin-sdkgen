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

public enum class InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressPostalCodeX463e79f7Branch {
  Branch1,
  InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressAnyOf2X08ad1d4f,
}

public sealed class InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressPostalCodeX463e79f7DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressPostalCodeX463e79f7NoMatchException(
  message: String,
) : InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressPostalCodeX463e79f7DecodingException(message)

internal data class InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressPostalCodeX463e79f7Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressAnyOf2X08ad1d4f:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressAnyOf2X08ad1d4f).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/ship_from_details/properties/address/properties/postal_code.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/ship_from_details/properties/address/properties/postal_code
 */
@Serializable(with = InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressPostalCodeX463e79f7.Serializer::class)
public class InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressPostalCodeX463e79f7 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressPostalCodeX463e79f7Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressAnyOf2X08ad1d4f:
      InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressAnyOf2X08ad1d4f? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressAnyOf2X08ad1d4f) json.decodeFromJsonElement<InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressAnyOf2X08ad1d4f>(raw) else null }

  public val matchedBranches:
      Set<InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressPostalCodeX463e79f7Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressPostalCodeX463e79f7Branch.Branch1)
      if (inspection.matchesInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressAnyOf2X08ad1d4f) add(InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressPostalCodeX463e79f7Branch.InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressAnyOf2X08ad1d4f)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressPostalCodeX463e79f7 {
      val inspection = inspectInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressPostalCodeX463e79f7(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressPostalCodeX463e79f7NoMatchException("InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressPostalCodeX463e79f7 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressPostalCodeX463e79f7(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressPostalCodeX463e79f7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressPostalCodeX463e79f7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressPostalCodeX463e79f7")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressPostalCodeX463e79f7) {
      encoder.requireJsonEncoder("InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressPostalCodeX463e79f7").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressPostalCodeX463e79f7(element: JsonElement): InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressPostalCodeX463e79f7Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressAnyOf2X08ad1d4f = element.isJsonDecodable<InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressAnyOf2X08ad1d4f>()
  return InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressPostalCodeX463e79f7Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressAnyOf2X08ad1d4f = matchesInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressAnyOf2X08ad1d4f,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressAnyOf2X08ad1d4f) add("InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressAnyOf2X08ad1d4f: value does not match InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressAnyOf2X08ad1d4f")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
