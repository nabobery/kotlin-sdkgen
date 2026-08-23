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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlinePaymentIntentPaymentMethodOptionsCardMandateOptionsX0b4df26fBranch {
  PaymentMethodOptionsCardMandateOptions,
}

public sealed class InlinePaymentIntentPaymentMethodOptionsCardMandateOptionsX0b4df26fDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentIntentPaymentMethodOptionsCardMandateOptionsX0b4df26fNoMatchException(
  message: String,
) : InlinePaymentIntentPaymentMethodOptionsCardMandateOptionsX0b4df26fDecodingException(message)

internal data class InlinePaymentIntentPaymentMethodOptionsCardMandateOptionsX0b4df26fInspection(
  public val matchesPaymentMethodOptionsCardMandateOptions: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentMethodOptionsCardMandateOptions).count { it }
}

/**
 * Configuration options for setting up an eMandate for cards issued in India.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options_card/properties/mandate_option
 * s
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsCardMandateOptionsX0b4df26f.Serializer::class)
public class InlinePaymentIntentPaymentMethodOptionsCardMandateOptionsX0b4df26f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlinePaymentIntentPaymentMethodOptionsCardMandateOptionsX0b4df26fInspection,
) {
  public val paymentMethodOptionsCardMandateOptions: PaymentMethodOptionsCardMandateOptionsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentMethodOptionsCardMandateOptions) json.decodeFromJsonElement<PaymentMethodOptionsCardMandateOptionsView>(raw) else null }

  public val matchedBranches:
      Set<InlinePaymentIntentPaymentMethodOptionsCardMandateOptionsX0b4df26fBranch>
    get() = buildSet {
      if (inspection.matchesPaymentMethodOptionsCardMandateOptions) add(InlinePaymentIntentPaymentMethodOptionsCardMandateOptionsX0b4df26fBranch.PaymentMethodOptionsCardMandateOptions)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentIntentPaymentMethodOptionsCardMandateOptionsX0b4df26f {
      val inspection = inspectInlinePaymentIntentPaymentMethodOptionsCardMandateOptionsX0b4df26f(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentIntentPaymentMethodOptionsCardMandateOptionsX0b4df26fNoMatchException("InlinePaymentIntentPaymentMethodOptionsCardMandateOptionsX0b4df26f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentIntentPaymentMethodOptionsCardMandateOptionsX0b4df26f(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsCardMandateOptionsX0b4df26f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentIntentPaymentMethodOptionsCardMandateOptionsX0b4df26f {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentPaymentMethodOptionsCardMandateOptionsX0b4df26f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentPaymentMethodOptionsCardMandateOptionsX0b4df26f) {
      encoder.requireJsonEncoder("InlinePaymentIntentPaymentMethodOptionsCardMandateOptionsX0b4df26f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentIntentPaymentMethodOptionsCardMandateOptionsX0b4df26f(element: JsonElement): InlinePaymentIntentPaymentMethodOptionsCardMandateOptionsX0b4df26fInspection {
  val raw = element as? JsonObject ?: return InlinePaymentIntentPaymentMethodOptionsCardMandateOptionsX0b4df26fInspection(
    matchesPaymentMethodOptionsCardMandateOptions = false,
    failures = listOf("PaymentMethodOptionsCardMandateOptions: expected JSON object"),
  )
  val matchesPaymentMethodOptionsCardMandateOptions = raw["amount"] != null && raw["amount_type"] != null && raw["interval"] != null && raw["reference"].isString() && raw["start_date"] != null
  return InlinePaymentIntentPaymentMethodOptionsCardMandateOptionsX0b4df26fInspection(
    matchesPaymentMethodOptionsCardMandateOptions = matchesPaymentMethodOptionsCardMandateOptions,
    failures = buildList {
      if (!matchesPaymentMethodOptionsCardMandateOptions) add("PaymentMethodOptionsCardMandateOptions: required properties 'amount', 'amount_type', 'interval', 'reference', 'start_date' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
