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

public enum class InlineV1PaymentLinksPostRequestFormStatementDescriptorS6a4aX32e05953Branch {
  Branch1,
  InlineV1PaymentLinksPostRequestFormPaymentIntentDataAnyOf2Xe7076a00,
}

public sealed class InlineV1PaymentLinksPostRequestFormStatementDescriptorS6a4aX32e05953DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentLinksPostRequestFormStatementDescriptorS6a4aX32e05953NoMatchException(
  message: String,
) : InlineV1PaymentLinksPostRequestFormStatementDescriptorS6a4aX32e05953DecodingException(message)

internal data class InlineV1PaymentLinksPostRequestFormStatementDescriptorS6a4aX32e05953Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentLinksPostRequestFormPaymentIntentDataAnyOf2Xe7076a00: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentLinksPostRequestFormPaymentIntentDataAnyOf2Xe7076a00).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/payment_intent_data/properties/statement_descriptor_suffix.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/payment_intent_data/properties/statement_descriptor_suffix
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormStatementDescriptorS6a4aX32e05953.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormStatementDescriptorS6a4aX32e05953 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentLinksPostRequestFormStatementDescriptorS6a4aX32e05953Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1PaymentLinksPostRequestFormPaymentIntentDataAnyOf2Xe7076a00:
      InlineV1PaymentLinksPostRequestFormPaymentIntentDataAnyOf2Xe7076a00? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentLinksPostRequestFormPaymentIntentDataAnyOf2Xe7076a00) json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormPaymentIntentDataAnyOf2Xe7076a00>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentLinksPostRequestFormStatementDescriptorS6a4aX32e05953Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentLinksPostRequestFormStatementDescriptorS6a4aX32e05953Branch.Branch1)
      if (inspection.matchesInlineV1PaymentLinksPostRequestFormPaymentIntentDataAnyOf2Xe7076a00) add(InlineV1PaymentLinksPostRequestFormStatementDescriptorS6a4aX32e05953Branch.InlineV1PaymentLinksPostRequestFormPaymentIntentDataAnyOf2Xe7076a00)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentLinksPostRequestFormStatementDescriptorS6a4aX32e05953 {
      val inspection = inspectInlineV1PaymentLinksPostRequestFormStatementDescriptorS6a4aX32e05953(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentLinksPostRequestFormStatementDescriptorS6a4aX32e05953NoMatchException("InlineV1PaymentLinksPostRequestFormStatementDescriptorS6a4aX32e05953 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentLinksPostRequestFormStatementDescriptorS6a4aX32e05953(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormStatementDescriptorS6a4aX32e05953> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormStatementDescriptorS6a4aX32e05953 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormStatementDescriptorS6a4aX32e05953")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormStatementDescriptorS6a4aX32e05953) {
      encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormStatementDescriptorS6a4aX32e05953").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentLinksPostRequestFormStatementDescriptorS6a4aX32e05953(element: JsonElement): InlineV1PaymentLinksPostRequestFormStatementDescriptorS6a4aX32e05953Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1PaymentLinksPostRequestFormPaymentIntentDataAnyOf2Xe7076a00 = element.isJsonDecodable<InlineV1PaymentLinksPostRequestFormPaymentIntentDataAnyOf2Xe7076a00>()
  return InlineV1PaymentLinksPostRequestFormStatementDescriptorS6a4aX32e05953Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentLinksPostRequestFormPaymentIntentDataAnyOf2Xe7076a00 = matchesInlineV1PaymentLinksPostRequestFormPaymentIntentDataAnyOf2Xe7076a00,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1PaymentLinksPostRequestFormPaymentIntentDataAnyOf2Xe7076a00) add("InlineV1PaymentLinksPostRequestFormPaymentIntentDataAnyOf2Xe7076a00: value does not match InlineV1PaymentLinksPostRequestFormPaymentIntentDataAnyOf2Xe7076a00")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
