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

public enum class InlinePaymentIntentNextActionKonbiniStoresSeicomartX058fdecfBranch {
  PaymentIntentNextActionKonbiniSeicomart,
}

public sealed class InlinePaymentIntentNextActionKonbiniStoresSeicomartX058fdecfDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentIntentNextActionKonbiniStoresSeicomartX058fdecfNoMatchException(
  message: String,
) : InlinePaymentIntentNextActionKonbiniStoresSeicomartX058fdecfDecodingException(message)

internal data class InlinePaymentIntentNextActionKonbiniStoresSeicomartX058fdecfInspection(
  public val matchesPaymentIntentNextActionKonbiniSeicomart: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentIntentNextActionKonbiniSeicomart).count { it }
}

/**
 * Seicomart instruction details.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_next_action_konbini_stores/properties/seicomart
 */
@Serializable(with = InlinePaymentIntentNextActionKonbiniStoresSeicomartX058fdecf.Serializer::class)
public class InlinePaymentIntentNextActionKonbiniStoresSeicomartX058fdecf internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentIntentNextActionKonbiniStoresSeicomartX058fdecfInspection,
) {
  public val paymentIntentNextActionKonbiniSeicomart: PaymentIntentNextActionKonbiniSeicomartView?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentIntentNextActionKonbiniSeicomart) json.decodeFromJsonElement<PaymentIntentNextActionKonbiniSeicomartView>(raw) else null }

  public val matchedBranches:
      Set<InlinePaymentIntentNextActionKonbiniStoresSeicomartX058fdecfBranch>
    get() = buildSet {
      if (inspection.matchesPaymentIntentNextActionKonbiniSeicomart) add(InlinePaymentIntentNextActionKonbiniStoresSeicomartX058fdecfBranch.PaymentIntentNextActionKonbiniSeicomart)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentIntentNextActionKonbiniStoresSeicomartX058fdecf {
      val inspection = inspectInlinePaymentIntentNextActionKonbiniStoresSeicomartX058fdecf(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentIntentNextActionKonbiniStoresSeicomartX058fdecfNoMatchException("InlinePaymentIntentNextActionKonbiniStoresSeicomartX058fdecf matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentIntentNextActionKonbiniStoresSeicomartX058fdecf(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentIntentNextActionKonbiniStoresSeicomartX058fdecf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentIntentNextActionKonbiniStoresSeicomartX058fdecf {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentNextActionKonbiniStoresSeicomartX058fdecf")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentNextActionKonbiniStoresSeicomartX058fdecf) {
      encoder.requireJsonEncoder("InlinePaymentIntentNextActionKonbiniStoresSeicomartX058fdecf").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentIntentNextActionKonbiniStoresSeicomartX058fdecf(element: JsonElement): InlinePaymentIntentNextActionKonbiniStoresSeicomartX058fdecfInspection {
  val raw = element as? JsonObject ?: return InlinePaymentIntentNextActionKonbiniStoresSeicomartX058fdecfInspection(
    matchesPaymentIntentNextActionKonbiniSeicomart = false,
    failures = listOf("PaymentIntentNextActionKonbiniSeicomart: expected JSON object"),
  )
  val matchesPaymentIntentNextActionKonbiniSeicomart = raw["payment_code"].isString()
  return InlinePaymentIntentNextActionKonbiniStoresSeicomartX058fdecfInspection(
    matchesPaymentIntentNextActionKonbiniSeicomart = matchesPaymentIntentNextActionKonbiniSeicomart,
    failures = buildList {
      if (!matchesPaymentIntentNextActionKonbiniSeicomart) add("PaymentIntentNextActionKonbiniSeicomart: required properties 'payment_code' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
