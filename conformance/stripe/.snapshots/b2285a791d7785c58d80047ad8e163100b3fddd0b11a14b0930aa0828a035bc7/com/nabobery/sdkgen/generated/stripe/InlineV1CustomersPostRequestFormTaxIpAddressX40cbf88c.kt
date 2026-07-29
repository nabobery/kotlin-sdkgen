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

public enum class InlineV1CustomersPostRequestFormTaxIpAddressX40cbf88cBranch {
  Branch1,
  InlineV1CustomersPostRequestFormTaxIpAddressAnyOf2X49c68947,
}

public sealed class InlineV1CustomersPostRequestFormTaxIpAddressX40cbf88cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersPostRequestFormTaxIpAddressX40cbf88cNoMatchException(
  message: String,
) : InlineV1CustomersPostRequestFormTaxIpAddressX40cbf88cDecodingException(message)

internal data class InlineV1CustomersPostRequestFormTaxIpAddressX40cbf88cInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1CustomersPostRequestFormTaxIpAddressAnyOf2X49c68947: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1CustomersPostRequestFormTaxIpAddressAnyOf2X49c68947).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers/post/requestBody/content/application~1x-www-form-urlencoded/schem
 * a/properties/tax/properties/ip_address.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers/post/requestBody/content/application~1x-www-form-urlencoded/schem
 * a/properties/tax/properties/ip_address
 */
@Serializable(with = InlineV1CustomersPostRequestFormTaxIpAddressX40cbf88c.Serializer::class)
public class InlineV1CustomersPostRequestFormTaxIpAddressX40cbf88c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1CustomersPostRequestFormTaxIpAddressX40cbf88cInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1CustomersPostRequestFormTaxIpAddressAnyOf2X49c68947:
      InlineV1CustomersPostRequestFormTaxIpAddressAnyOf2X49c68947? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersPostRequestFormTaxIpAddressAnyOf2X49c68947) json.decodeFromJsonElement<InlineV1CustomersPostRequestFormTaxIpAddressAnyOf2X49c68947>(raw) else null }

  public val matchedBranches: Set<InlineV1CustomersPostRequestFormTaxIpAddressX40cbf88cBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1CustomersPostRequestFormTaxIpAddressX40cbf88cBranch.Branch1)
      if (inspection.matchesInlineV1CustomersPostRequestFormTaxIpAddressAnyOf2X49c68947) add(InlineV1CustomersPostRequestFormTaxIpAddressX40cbf88cBranch.InlineV1CustomersPostRequestFormTaxIpAddressAnyOf2X49c68947)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersPostRequestFormTaxIpAddressX40cbf88c {
      val inspection = inspectInlineV1CustomersPostRequestFormTaxIpAddressX40cbf88c(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersPostRequestFormTaxIpAddressX40cbf88cNoMatchException("InlineV1CustomersPostRequestFormTaxIpAddressX40cbf88c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersPostRequestFormTaxIpAddressX40cbf88c(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1CustomersPostRequestFormTaxIpAddressX40cbf88c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersPostRequestFormTaxIpAddressX40cbf88c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersPostRequestFormTaxIpAddressX40cbf88c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersPostRequestFormTaxIpAddressX40cbf88c) {
      encoder.requireJsonEncoder("InlineV1CustomersPostRequestFormTaxIpAddressX40cbf88c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersPostRequestFormTaxIpAddressX40cbf88c(element: JsonElement): InlineV1CustomersPostRequestFormTaxIpAddressX40cbf88cInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1CustomersPostRequestFormTaxIpAddressAnyOf2X49c68947 = element.isJsonDecodable<InlineV1CustomersPostRequestFormTaxIpAddressAnyOf2X49c68947>()
  return InlineV1CustomersPostRequestFormTaxIpAddressX40cbf88cInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1CustomersPostRequestFormTaxIpAddressAnyOf2X49c68947 = matchesInlineV1CustomersPostRequestFormTaxIpAddressAnyOf2X49c68947,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1CustomersPostRequestFormTaxIpAddressAnyOf2X49c68947) add("InlineV1CustomersPostRequestFormTaxIpAddressAnyOf2X49c68947: value does not match InlineV1CustomersPostRequestFormTaxIpAddressAnyOf2X49c68947")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
