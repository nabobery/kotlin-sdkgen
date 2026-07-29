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

public enum class InlinePaymentMethodDetailsPaymentRecordKonbiniStoreX1a54041bBranch {
  PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKonbiniDetailsResourceStore,
}

public sealed class InlinePaymentMethodDetailsPaymentRecordKonbiniStoreX1a54041bDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentMethodDetailsPaymentRecordKonbiniStoreX1a54041bNoMatchException(
  message: String,
) : InlinePaymentMethodDetailsPaymentRecordKonbiniStoreX1a54041bDecodingException(message)

internal data class InlinePaymentMethodDetailsPaymentRecordKonbiniStoreX1a54041bInspection(
  public val matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodKonbiniDetailsResourceStore:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodKonbiniDetailsResourceStore).count { it }
}

/**
 * If the payment succeeded, this contains the details of the convenience store where the payment was completed.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_method_details_payment_record_konbini/properties/store
 */
@Serializable(with = InlinePaymentMethodDetailsPaymentRecordKonbiniStoreX1a54041b.Serializer::class)
public class InlinePaymentMethodDetailsPaymentRecordKonbiniStoreX1a54041b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentMethodDetailsPaymentRecordKonbiniStoreX1a54041bInspection,
) {
  public val paymentsPrimitivesPaymentRecordsResourcePaymentMethodKonbiniDetailsResourceStore:
      PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKonbiniDetailsResourceStoreView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodKonbiniDetailsResourceStore) json.decodeFromJsonElement<PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKonbiniDetailsResourceStoreView>(raw) else null }

  public val matchedBranches:
      Set<InlinePaymentMethodDetailsPaymentRecordKonbiniStoreX1a54041bBranch>
    get() = buildSet {
      if (inspection.matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodKonbiniDetailsResourceStore) add(InlinePaymentMethodDetailsPaymentRecordKonbiniStoreX1a54041bBranch.PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKonbiniDetailsResourceStore)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentMethodDetailsPaymentRecordKonbiniStoreX1a54041b {
      val inspection = inspectInlinePaymentMethodDetailsPaymentRecordKonbiniStoreX1a54041b(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentMethodDetailsPaymentRecordKonbiniStoreX1a54041bNoMatchException("InlinePaymentMethodDetailsPaymentRecordKonbiniStoreX1a54041b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentMethodDetailsPaymentRecordKonbiniStoreX1a54041b(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlinePaymentMethodDetailsPaymentRecordKonbiniStoreX1a54041b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentMethodDetailsPaymentRecordKonbiniStoreX1a54041b {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentMethodDetailsPaymentRecordKonbiniStoreX1a54041b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodDetailsPaymentRecordKonbiniStoreX1a54041b) {
      encoder.requireJsonEncoder("InlinePaymentMethodDetailsPaymentRecordKonbiniStoreX1a54041b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentMethodDetailsPaymentRecordKonbiniStoreX1a54041b(element: JsonElement): InlinePaymentMethodDetailsPaymentRecordKonbiniStoreX1a54041bInspection {
  val raw = element as? JsonObject ?: return InlinePaymentMethodDetailsPaymentRecordKonbiniStoreX1a54041bInspection(
    matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodKonbiniDetailsResourceStore = false,
    failures = listOf("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKonbiniDetailsResourceStore: expected JSON object"),
  )
  val matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodKonbiniDetailsResourceStore = true
  return InlinePaymentMethodDetailsPaymentRecordKonbiniStoreX1a54041bInspection(
    matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodKonbiniDetailsResourceStore = matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodKonbiniDetailsResourceStore,
    failures = buildList {
      if (!matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodKonbiniDetailsResourceStore) add("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKonbiniDetailsResourceStore: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
