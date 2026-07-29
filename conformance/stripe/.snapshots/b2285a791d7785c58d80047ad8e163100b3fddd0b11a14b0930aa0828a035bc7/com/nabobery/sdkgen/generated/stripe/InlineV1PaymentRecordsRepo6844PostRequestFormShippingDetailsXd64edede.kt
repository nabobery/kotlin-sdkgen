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

public enum class InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsXd64ededeBranch {
  InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf1X1d075e21,
  InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf2Xa0992089,
}

public sealed class InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsXd64ededeDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsXd64ededeNoMatchException(
  message: String,
) : InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsXd64ededeDecodingException(message)

internal data class InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsXd64ededeInspection(
  public val matchesInlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf1X1d075e21:
      Boolean,
  public val matchesInlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf2Xa0992089:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf1X1d075e21, matchesInlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf2Xa0992089).count { it }
}

/**
 * Shipping information for this payment.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1{id}~1report_payment_attempt_informational/post/requestBod
 * y/content/application~1x-www-form-urlencoded/schema/properties/shipping_details
 */
@Serializable(with = InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsXd64edede.Serializer::class)
public class InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsXd64edede internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsXd64ededeInspection,
) {
  public val inlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf1X1d075e21:
      InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf1X1d075e21? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf1X1d075e21) json.decodeFromJsonElement<InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf1X1d075e21>(raw) else null }

  public val inlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf2Xa0992089:
      InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf2Xa0992089? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf2Xa0992089) json.decodeFromJsonElement<InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf2Xa0992089>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsXd64ededeBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf1X1d075e21) add(InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsXd64ededeBranch.InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf1X1d075e21)
      if (inspection.matchesInlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf2Xa0992089) add(InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsXd64ededeBranch.InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf2Xa0992089)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsXd64edede {
      val inspection = inspectInlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsXd64edede(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsXd64ededeNoMatchException("InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsXd64edede matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsXd64edede(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsXd64edede> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsXd64edede {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsXd64edede")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsXd64edede) {
      encoder.requireJsonEncoder("InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsXd64edede").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsXd64edede(element: JsonElement): InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsXd64ededeInspection {
  val matchesInlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf1X1d075e21 = element.isJsonDecodable<InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf1X1d075e21>()
  val matchesInlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf2Xa0992089 = element.isJsonDecodable<InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf2Xa0992089>()
  return InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsXd64ededeInspection(
    matchesInlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf1X1d075e21 = matchesInlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf1X1d075e21,
    matchesInlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf2Xa0992089 = matchesInlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf2Xa0992089,
    failures = buildList {
      if (!matchesInlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf1X1d075e21) add("InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf1X1d075e21: value does not match InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf1X1d075e21")
      if (!matchesInlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf2Xa0992089) add("InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf2Xa0992089: value does not match InlineV1PaymentRecordsRepo6844PostRequestFormShippingDetailsAnyOf2Xa0992089")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
