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

public enum class InlinePaymentIntentNextActionKonbiniStoresFamilymartXdf5edf2fBranch {
  PaymentIntentNextActionKonbiniFamilymart,
}

public sealed class InlinePaymentIntentNextActionKonbiniStoresFamilymartXdf5edf2fDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentIntentNextActionKonbiniStoresFamilymartXdf5edf2fNoMatchException(
  message: String,
) : InlinePaymentIntentNextActionKonbiniStoresFamilymartXdf5edf2fDecodingException(message)

internal data class InlinePaymentIntentNextActionKonbiniStoresFamilymartXdf5edf2fInspection(
  public val matchesPaymentIntentNextActionKonbiniFamilymart: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentIntentNextActionKonbiniFamilymart).count { it }
}

/**
 * FamilyMart instruction details.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_next_action_konbini_stores/properties/familymart
 */
@Serializable(with = InlinePaymentIntentNextActionKonbiniStoresFamilymartXdf5edf2f.Serializer::class)
public class InlinePaymentIntentNextActionKonbiniStoresFamilymartXdf5edf2f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentIntentNextActionKonbiniStoresFamilymartXdf5edf2fInspection,
) {
  public val paymentIntentNextActionKonbiniFamilymart: PaymentIntentNextActionKonbiniFamilymartView?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentIntentNextActionKonbiniFamilymart) json.decodeFromJsonElement<PaymentIntentNextActionKonbiniFamilymartView>(raw) else null }

  public val matchedBranches:
      Set<InlinePaymentIntentNextActionKonbiniStoresFamilymartXdf5edf2fBranch>
    get() = buildSet {
      if (inspection.matchesPaymentIntentNextActionKonbiniFamilymart) add(InlinePaymentIntentNextActionKonbiniStoresFamilymartXdf5edf2fBranch.PaymentIntentNextActionKonbiniFamilymart)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentIntentNextActionKonbiniStoresFamilymartXdf5edf2f {
      val inspection = inspectInlinePaymentIntentNextActionKonbiniStoresFamilymartXdf5edf2f(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentIntentNextActionKonbiniStoresFamilymartXdf5edf2fNoMatchException("InlinePaymentIntentNextActionKonbiniStoresFamilymartXdf5edf2f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentIntentNextActionKonbiniStoresFamilymartXdf5edf2f(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentIntentNextActionKonbiniStoresFamilymartXdf5edf2f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentIntentNextActionKonbiniStoresFamilymartXdf5edf2f {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentNextActionKonbiniStoresFamilymartXdf5edf2f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentNextActionKonbiniStoresFamilymartXdf5edf2f) {
      encoder.requireJsonEncoder("InlinePaymentIntentNextActionKonbiniStoresFamilymartXdf5edf2f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentIntentNextActionKonbiniStoresFamilymartXdf5edf2f(element: JsonElement): InlinePaymentIntentNextActionKonbiniStoresFamilymartXdf5edf2fInspection {
  val raw = element as? JsonObject ?: return InlinePaymentIntentNextActionKonbiniStoresFamilymartXdf5edf2fInspection(
    matchesPaymentIntentNextActionKonbiniFamilymart = false,
    failures = listOf("PaymentIntentNextActionKonbiniFamilymart: expected JSON object"),
  )
  val matchesPaymentIntentNextActionKonbiniFamilymart = raw["payment_code"].isString()
  return InlinePaymentIntentNextActionKonbiniStoresFamilymartXdf5edf2fInspection(
    matchesPaymentIntentNextActionKonbiniFamilymart = matchesPaymentIntentNextActionKonbiniFamilymart,
    failures = buildList {
      if (!matchesPaymentIntentNextActionKonbiniFamilymart) add("PaymentIntentNextActionKonbiniFamilymart: required properties 'payment_code' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
