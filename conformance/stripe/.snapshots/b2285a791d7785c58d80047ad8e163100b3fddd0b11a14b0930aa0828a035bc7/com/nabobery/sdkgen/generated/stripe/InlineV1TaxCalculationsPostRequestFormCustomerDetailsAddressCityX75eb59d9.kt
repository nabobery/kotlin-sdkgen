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

public enum class InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressCityX75eb59d9Branch {
  Branch1,
  InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressCityAnyOf2X1b3863a9,
}

public sealed class InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressCityX75eb59d9DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressCityX75eb59d9NoMatchException(
  message: String,
) : InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressCityX75eb59d9DecodingException(message)

internal data class InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressCityX75eb59d9Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressCityAnyOf2X1b3863a9:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressCityAnyOf2X1b3863a9).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/customer_details/properties/address/properties/city.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/customer_details/properties/address/properties/city
 */
@Serializable(with = InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressCityX75eb59d9.Serializer::class)
public class InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressCityX75eb59d9 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressCityX75eb59d9Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressCityAnyOf2X1b3863a9:
      InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressCityAnyOf2X1b3863a9? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressCityAnyOf2X1b3863a9) json.decodeFromJsonElement<InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressCityAnyOf2X1b3863a9>(raw) else null }

  public val matchedBranches:
      Set<InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressCityX75eb59d9Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressCityX75eb59d9Branch.Branch1)
      if (inspection.matchesInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressCityAnyOf2X1b3863a9) add(InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressCityX75eb59d9Branch.InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressCityAnyOf2X1b3863a9)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressCityX75eb59d9 {
      val inspection = inspectInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressCityX75eb59d9(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressCityX75eb59d9NoMatchException("InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressCityX75eb59d9 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressCityX75eb59d9(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressCityX75eb59d9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressCityX75eb59d9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressCityX75eb59d9")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressCityX75eb59d9) {
      encoder.requireJsonEncoder("InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressCityX75eb59d9").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressCityX75eb59d9(element: JsonElement): InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressCityX75eb59d9Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressCityAnyOf2X1b3863a9 = element.isJsonDecodable<InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressCityAnyOf2X1b3863a9>()
  return InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressCityX75eb59d9Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressCityAnyOf2X1b3863a9 = matchesInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressCityAnyOf2X1b3863a9,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressCityAnyOf2X1b3863a9) add("InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressCityAnyOf2X1b3863a9: value does not match InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressCityAnyOf2X1b3863a9")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
