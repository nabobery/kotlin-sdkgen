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

public enum class InlinePaymentIntentNextActionKonbiniStoresMinistopX9893f31aBranch {
  PaymentIntentNextActionKonbiniMinistop,
}

public sealed class InlinePaymentIntentNextActionKonbiniStoresMinistopX9893f31aDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentIntentNextActionKonbiniStoresMinistopX9893f31aNoMatchException(
  message: String,
) : InlinePaymentIntentNextActionKonbiniStoresMinistopX9893f31aDecodingException(message)

internal data class InlinePaymentIntentNextActionKonbiniStoresMinistopX9893f31aInspection(
  public val matchesPaymentIntentNextActionKonbiniMinistop: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentIntentNextActionKonbiniMinistop).count { it }
}

/**
 * Ministop instruction details.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_next_action_konbini_stores/properties/ministop
 */
@Serializable(with = InlinePaymentIntentNextActionKonbiniStoresMinistopX9893f31a.Serializer::class)
public class InlinePaymentIntentNextActionKonbiniStoresMinistopX9893f31a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentIntentNextActionKonbiniStoresMinistopX9893f31aInspection,
) {
  public val paymentIntentNextActionKonbiniMinistop: PaymentIntentNextActionKonbiniMinistopView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentIntentNextActionKonbiniMinistop) json.decodeFromJsonElement<PaymentIntentNextActionKonbiniMinistopView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentIntentNextActionKonbiniStoresMinistopX9893f31aBranch>
    get() = buildSet {
      if (inspection.matchesPaymentIntentNextActionKonbiniMinistop) add(InlinePaymentIntentNextActionKonbiniStoresMinistopX9893f31aBranch.PaymentIntentNextActionKonbiniMinistop)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentIntentNextActionKonbiniStoresMinistopX9893f31a {
      val inspection = inspectInlinePaymentIntentNextActionKonbiniStoresMinistopX9893f31a(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentIntentNextActionKonbiniStoresMinistopX9893f31aNoMatchException("InlinePaymentIntentNextActionKonbiniStoresMinistopX9893f31a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentIntentNextActionKonbiniStoresMinistopX9893f31a(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentIntentNextActionKonbiniStoresMinistopX9893f31a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentIntentNextActionKonbiniStoresMinistopX9893f31a {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentNextActionKonbiniStoresMinistopX9893f31a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentNextActionKonbiniStoresMinistopX9893f31a) {
      encoder.requireJsonEncoder("InlinePaymentIntentNextActionKonbiniStoresMinistopX9893f31a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentIntentNextActionKonbiniStoresMinistopX9893f31a(element: JsonElement): InlinePaymentIntentNextActionKonbiniStoresMinistopX9893f31aInspection {
  val raw = element as? JsonObject ?: return InlinePaymentIntentNextActionKonbiniStoresMinistopX9893f31aInspection(
    matchesPaymentIntentNextActionKonbiniMinistop = false,
    failures = listOf("PaymentIntentNextActionKonbiniMinistop: expected JSON object"),
  )
  val matchesPaymentIntentNextActionKonbiniMinistop = raw["payment_code"].isString()
  return InlinePaymentIntentNextActionKonbiniStoresMinistopX9893f31aInspection(
    matchesPaymentIntentNextActionKonbiniMinistop = matchesPaymentIntentNextActionKonbiniMinistop,
    failures = buildList {
      if (!matchesPaymentIntentNextActionKonbiniMinistop) add("PaymentIntentNextActionKonbiniMinistop: required properties 'payment_code' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
