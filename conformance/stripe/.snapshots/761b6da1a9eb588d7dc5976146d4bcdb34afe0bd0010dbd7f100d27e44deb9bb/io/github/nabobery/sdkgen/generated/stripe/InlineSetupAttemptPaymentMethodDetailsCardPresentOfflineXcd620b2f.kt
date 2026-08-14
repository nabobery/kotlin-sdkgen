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

public enum class InlineSetupAttemptPaymentMethodDetailsCardPresentOfflineXcd620b2fBranch {
  PaymentMethodDetailsCardPresentOffline,
}

public sealed class InlineSetupAttemptPaymentMethodDetailsCardPresentOfflineXcd620b2fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineSetupAttemptPaymentMethodDetailsCardPresentOfflineXcd620b2fNoMatchException(
  message: String,
) : InlineSetupAttemptPaymentMethodDetailsCardPresentOfflineXcd620b2fDecodingException(message)

internal data class InlineSetupAttemptPaymentMethodDetailsCardPresentOfflineXcd620b2fInspection(
  public val matchesPaymentMethodDetailsCardPresentOffline: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentMethodDetailsCardPresentOffline).count { it }
}

/**
 * Details about payments collected offline.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/setup_attempt_payment_method_details_card_present/properties/offline
 */
@Serializable(with = InlineSetupAttemptPaymentMethodDetailsCardPresentOfflineXcd620b2f.Serializer::class)
public class InlineSetupAttemptPaymentMethodDetailsCardPresentOfflineXcd620b2f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineSetupAttemptPaymentMethodDetailsCardPresentOfflineXcd620b2fInspection,
) {
  public val paymentMethodDetailsCardPresentOffline: PaymentMethodDetailsCardPresentOfflineView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentMethodDetailsCardPresentOffline) json.decodeFromJsonElement<PaymentMethodDetailsCardPresentOfflineView>(raw) else null }

  public val matchedBranches:
      Set<InlineSetupAttemptPaymentMethodDetailsCardPresentOfflineXcd620b2fBranch>
    get() = buildSet {
      if (inspection.matchesPaymentMethodDetailsCardPresentOffline) add(InlineSetupAttemptPaymentMethodDetailsCardPresentOfflineXcd620b2fBranch.PaymentMethodDetailsCardPresentOffline)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSetupAttemptPaymentMethodDetailsCardPresentOfflineXcd620b2f {
      val inspection = inspectInlineSetupAttemptPaymentMethodDetailsCardPresentOfflineXcd620b2f(raw)
      if (inspection.matchCount == 0) {
        throw InlineSetupAttemptPaymentMethodDetailsCardPresentOfflineXcd620b2fNoMatchException("InlineSetupAttemptPaymentMethodDetailsCardPresentOfflineXcd620b2f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSetupAttemptPaymentMethodDetailsCardPresentOfflineXcd620b2f(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineSetupAttemptPaymentMethodDetailsCardPresentOfflineXcd620b2f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSetupAttemptPaymentMethodDetailsCardPresentOfflineXcd620b2f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSetupAttemptPaymentMethodDetailsCardPresentOfflineXcd620b2f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSetupAttemptPaymentMethodDetailsCardPresentOfflineXcd620b2f) {
      encoder.requireJsonEncoder("InlineSetupAttemptPaymentMethodDetailsCardPresentOfflineXcd620b2f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSetupAttemptPaymentMethodDetailsCardPresentOfflineXcd620b2f(element: JsonElement): InlineSetupAttemptPaymentMethodDetailsCardPresentOfflineXcd620b2fInspection {
  val raw = element as? JsonObject ?: return InlineSetupAttemptPaymentMethodDetailsCardPresentOfflineXcd620b2fInspection(
    matchesPaymentMethodDetailsCardPresentOffline = false,
    failures = listOf("PaymentMethodDetailsCardPresentOffline: expected JSON object"),
  )
  val matchesPaymentMethodDetailsCardPresentOffline = true
  return InlineSetupAttemptPaymentMethodDetailsCardPresentOfflineXcd620b2fInspection(
    matchesPaymentMethodDetailsCardPresentOffline = matchesPaymentMethodDetailsCardPresentOffline,
    failures = buildList {
      if (!matchesPaymentMethodDetailsCardPresentOffline) add("PaymentMethodDetailsCardPresentOffline: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
