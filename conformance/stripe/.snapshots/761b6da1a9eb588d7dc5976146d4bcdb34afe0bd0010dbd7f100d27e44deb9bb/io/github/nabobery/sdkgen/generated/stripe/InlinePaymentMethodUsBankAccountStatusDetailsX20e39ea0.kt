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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlinePaymentMethodUsBankAccountStatusDetailsX20e39ea0Branch {
  PaymentMethodUsBankAccountStatusDetails,
}

public sealed class InlinePaymentMethodUsBankAccountStatusDetailsX20e39ea0DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentMethodUsBankAccountStatusDetailsX20e39ea0NoMatchException(
  message: String,
) : InlinePaymentMethodUsBankAccountStatusDetailsX20e39ea0DecodingException(message)

internal data class InlinePaymentMethodUsBankAccountStatusDetailsX20e39ea0Inspection(
  public val matchesPaymentMethodUsBankAccountStatusDetails: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentMethodUsBankAccountStatusDetails).count { it }
}

/**
 * Contains information about the future reusability of this PaymentMethod.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_us_bank_account/properties/status_details
 */
@Serializable(with = InlinePaymentMethodUsBankAccountStatusDetailsX20e39ea0.Serializer::class)
public class InlinePaymentMethodUsBankAccountStatusDetailsX20e39ea0 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentMethodUsBankAccountStatusDetailsX20e39ea0Inspection,
) {
  public val paymentMethodUsBankAccountStatusDetails: PaymentMethodUsBankAccountStatusDetailsView?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentMethodUsBankAccountStatusDetails) json.decodeFromJsonElement<PaymentMethodUsBankAccountStatusDetailsView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentMethodUsBankAccountStatusDetailsX20e39ea0Branch>
    get() = buildSet {
      if (inspection.matchesPaymentMethodUsBankAccountStatusDetails) add(InlinePaymentMethodUsBankAccountStatusDetailsX20e39ea0Branch.PaymentMethodUsBankAccountStatusDetails)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentMethodUsBankAccountStatusDetailsX20e39ea0 {
      val inspection = inspectInlinePaymentMethodUsBankAccountStatusDetailsX20e39ea0(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentMethodUsBankAccountStatusDetailsX20e39ea0NoMatchException("InlinePaymentMethodUsBankAccountStatusDetailsX20e39ea0 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentMethodUsBankAccountStatusDetailsX20e39ea0(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodUsBankAccountStatusDetailsX20e39ea0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentMethodUsBankAccountStatusDetailsX20e39ea0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentMethodUsBankAccountStatusDetailsX20e39ea0")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodUsBankAccountStatusDetailsX20e39ea0) {
      encoder.requireJsonEncoder("InlinePaymentMethodUsBankAccountStatusDetailsX20e39ea0").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentMethodUsBankAccountStatusDetailsX20e39ea0(element: JsonElement): InlinePaymentMethodUsBankAccountStatusDetailsX20e39ea0Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentMethodUsBankAccountStatusDetailsX20e39ea0Inspection(
    matchesPaymentMethodUsBankAccountStatusDetails = false,
    failures = listOf("PaymentMethodUsBankAccountStatusDetails: expected JSON object"),
  )
  val matchesPaymentMethodUsBankAccountStatusDetails = true
  return InlinePaymentMethodUsBankAccountStatusDetailsX20e39ea0Inspection(
    matchesPaymentMethodUsBankAccountStatusDetails = matchesPaymentMethodUsBankAccountStatusDetails,
    failures = buildList {
      if (!matchesPaymentMethodUsBankAccountStatusDetails) add("PaymentMethodUsBankAccountStatusDetails: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
