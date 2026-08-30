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

public enum class InlineV1CustomersPostRequestFormAddressXea1a2b6fBranch {
  InlineV1CustomersPostRequestFormAddressAnyOf1X4193daf3,
  InlineV1CustomersPostRequestFormAddressAnyOf2X9272aed1,
}

public sealed class InlineV1CustomersPostRequestFormAddressXea1a2b6fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersPostRequestFormAddressXea1a2b6fNoMatchException(
  message: String,
) : InlineV1CustomersPostRequestFormAddressXea1a2b6fDecodingException(message)

internal data class InlineV1CustomersPostRequestFormAddressXea1a2b6fInspection(
  public val matchesInlineV1CustomersPostRequestFormAddressAnyOf1X4193daf3: Boolean,
  public val matchesInlineV1CustomersPostRequestFormAddressAnyOf2X9272aed1: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1CustomersPostRequestFormAddressAnyOf1X4193daf3, matchesInlineV1CustomersPostRequestFormAddressAnyOf2X9272aed1).count { it }
}

/**
 * The customer's address. Learn about [country-specific requirements for calculating
 * tax](https://docs.stripe.com/invoicing/taxes?dashboard-or-api=dashboard#set-up-customer).
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/address
 */
@Serializable(with = InlineV1CustomersPostRequestFormAddressXea1a2b6f.Serializer::class)
public class InlineV1CustomersPostRequestFormAddressXea1a2b6f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1CustomersPostRequestFormAddressXea1a2b6fInspection,
) {
  public val inlineV1CustomersPostRequestFormAddressAnyOf1X4193daf3:
      InlineV1CustomersPostRequestFormAddressAnyOf1X4193daf3? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersPostRequestFormAddressAnyOf1X4193daf3) json.decodeFromJsonElement<InlineV1CustomersPostRequestFormAddressAnyOf1X4193daf3>(raw) else null }

  public val inlineV1CustomersPostRequestFormAddressAnyOf2X9272aed1:
      InlineV1CustomersPostRequestFormAddressAnyOf2X9272aed1? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersPostRequestFormAddressAnyOf2X9272aed1) json.decodeFromJsonElement<InlineV1CustomersPostRequestFormAddressAnyOf2X9272aed1>(raw) else null }

  public val matchedBranches: Set<InlineV1CustomersPostRequestFormAddressXea1a2b6fBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1CustomersPostRequestFormAddressAnyOf1X4193daf3) add(InlineV1CustomersPostRequestFormAddressXea1a2b6fBranch.InlineV1CustomersPostRequestFormAddressAnyOf1X4193daf3)
      if (inspection.matchesInlineV1CustomersPostRequestFormAddressAnyOf2X9272aed1) add(InlineV1CustomersPostRequestFormAddressXea1a2b6fBranch.InlineV1CustomersPostRequestFormAddressAnyOf2X9272aed1)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersPostRequestFormAddressXea1a2b6f {
      val inspection = inspectInlineV1CustomersPostRequestFormAddressXea1a2b6f(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersPostRequestFormAddressXea1a2b6fNoMatchException("InlineV1CustomersPostRequestFormAddressXea1a2b6f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersPostRequestFormAddressXea1a2b6f(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersPostRequestFormAddressXea1a2b6f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersPostRequestFormAddressXea1a2b6f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersPostRequestFormAddressXea1a2b6f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersPostRequestFormAddressXea1a2b6f) {
      encoder.requireJsonEncoder("InlineV1CustomersPostRequestFormAddressXea1a2b6f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersPostRequestFormAddressXea1a2b6f(element: JsonElement): InlineV1CustomersPostRequestFormAddressXea1a2b6fInspection {
  val matchesInlineV1CustomersPostRequestFormAddressAnyOf1X4193daf3 = element.isJsonDecodable<InlineV1CustomersPostRequestFormAddressAnyOf1X4193daf3>()
  val matchesInlineV1CustomersPostRequestFormAddressAnyOf2X9272aed1 = element.isJsonDecodable<InlineV1CustomersPostRequestFormAddressAnyOf2X9272aed1>()
  return InlineV1CustomersPostRequestFormAddressXea1a2b6fInspection(
    matchesInlineV1CustomersPostRequestFormAddressAnyOf1X4193daf3 = matchesInlineV1CustomersPostRequestFormAddressAnyOf1X4193daf3,
    matchesInlineV1CustomersPostRequestFormAddressAnyOf2X9272aed1 = matchesInlineV1CustomersPostRequestFormAddressAnyOf2X9272aed1,
    failures = buildList {
      if (!matchesInlineV1CustomersPostRequestFormAddressAnyOf1X4193daf3) add("InlineV1CustomersPostRequestFormAddressAnyOf1X4193daf3: value does not match InlineV1CustomersPostRequestFormAddressAnyOf1X4193daf3")
      if (!matchesInlineV1CustomersPostRequestFormAddressAnyOf2X9272aed1) add("InlineV1CustomersPostRequestFormAddressAnyOf2X9272aed1: value does not match InlineV1CustomersPostRequestFormAddressAnyOf2X9272aed1")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
