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

public enum class InlinePaymentsPrimitivesPa0ad7NetworkTokenXf89594bbBranch {
  PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceNetworkToken,
}

public sealed class InlinePaymentsPrimitivesPa0ad7NetworkTokenXf89594bbDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentsPrimitivesPa0ad7NetworkTokenXf89594bbNoMatchException(
  message: String,
) : InlinePaymentsPrimitivesPa0ad7NetworkTokenXf89594bbDecodingException(message)

internal data class InlinePaymentsPrimitivesPa0ad7NetworkTokenXf89594bbInspection(
  public val matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceNetworkToken:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceNetworkToken).count { it }
}

/**
 * If this card has network token credentials, this contains the details of the network token credentials.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payments_primitives_payment_records_resource_payment_method_card_det
 * ails/properties/network_token
 */
@Serializable(with = InlinePaymentsPrimitivesPa0ad7NetworkTokenXf89594bb.Serializer::class)
public class InlinePaymentsPrimitivesPa0ad7NetworkTokenXf89594bb internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentsPrimitivesPa0ad7NetworkTokenXf89594bbInspection,
) {
  public val paymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceNetworkToken:
      PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceNetworkTokenView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceNetworkToken) json.decodeFromJsonElement<PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceNetworkTokenView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentsPrimitivesPa0ad7NetworkTokenXf89594bbBranch>
    get() = buildSet {
      if (inspection.matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceNetworkToken) add(InlinePaymentsPrimitivesPa0ad7NetworkTokenXf89594bbBranch.PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceNetworkToken)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentsPrimitivesPa0ad7NetworkTokenXf89594bb {
      val inspection = inspectInlinePaymentsPrimitivesPa0ad7NetworkTokenXf89594bb(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentsPrimitivesPa0ad7NetworkTokenXf89594bbNoMatchException("InlinePaymentsPrimitivesPa0ad7NetworkTokenXf89594bb matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentsPrimitivesPa0ad7NetworkTokenXf89594bb(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentsPrimitivesPa0ad7NetworkTokenXf89594bb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentsPrimitivesPa0ad7NetworkTokenXf89594bb {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentsPrimitivesPa0ad7NetworkTokenXf89594bb")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentsPrimitivesPa0ad7NetworkTokenXf89594bb) {
      encoder.requireJsonEncoder("InlinePaymentsPrimitivesPa0ad7NetworkTokenXf89594bb").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentsPrimitivesPa0ad7NetworkTokenXf89594bb(element: JsonElement): InlinePaymentsPrimitivesPa0ad7NetworkTokenXf89594bbInspection {
  val raw = element as? JsonObject ?: return InlinePaymentsPrimitivesPa0ad7NetworkTokenXf89594bbInspection(
    matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceNetworkToken = false,
    failures = listOf("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceNetworkToken: expected JSON object"),
  )
  val matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceNetworkToken = raw["used"] != null
  return InlinePaymentsPrimitivesPa0ad7NetworkTokenXf89594bbInspection(
    matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceNetworkToken = matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceNetworkToken,
    failures = buildList {
      if (!matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceNetworkToken) add("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceNetworkToken: required properties 'used' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
