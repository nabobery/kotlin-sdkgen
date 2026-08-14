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

public enum class InlineCustomerSessionResourceComponentsResourcePaymentElementFeaturesXbc5f19a8Branch {
  CustomerSessionResourceComponentsResourcePaymentElementResourceFeatures,
}

public sealed class InlineCustomerSessionResourceComponentsResourcePaymentElementFeaturesXbc5f19a8DecodingException(
  message: String,
) : SerializationException(message)

public class InlineCustomerSessionResourceComponentsResourcePaymentElementFeaturesXbc5f19a8NoMatchException(
  message: String,
) : InlineCustomerSessionResourceComponentsResourcePaymentElementFeaturesXbc5f19a8DecodingException(message)

internal data class InlineCustomerSessionResourceComponentsResourcePaymentElementFeaturesXbc5f19a8Inspection(
  public val matchesCustomerSessionResourceComponentsResourcePaymentElementResourceFeatures:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesCustomerSessionResourceComponentsResourcePaymentElementResourceFeatures).count { it }
}

/**
 * This hash defines whether the Payment Element supports certain features.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/customer_session_resource_components_resource_payment_element/proper
 * ties/features
 */
@Serializable(with = InlineCustomerSessionResourceComponentsResourcePaymentElementFeaturesXbc5f19a8.Serializer::class)
public class InlineCustomerSessionResourceComponentsResourcePaymentElementFeaturesXbc5f19a8 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineCustomerSessionResourceComponentsResourcePaymentElementFeaturesXbc5f19a8Inspection,
) {
  public val customerSessionResourceComponentsResourcePaymentElementResourceFeatures:
      CustomerSessionResourceComponentsResourcePaymentElementResourceFeaturesView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCustomerSessionResourceComponentsResourcePaymentElementResourceFeatures) json.decodeFromJsonElement<CustomerSessionResourceComponentsResourcePaymentElementResourceFeaturesView>(raw) else null }

  public val matchedBranches:
      Set<InlineCustomerSessionResourceComponentsResourcePaymentElementFeaturesXbc5f19a8Branch>
    get() = buildSet {
      if (inspection.matchesCustomerSessionResourceComponentsResourcePaymentElementResourceFeatures) add(InlineCustomerSessionResourceComponentsResourcePaymentElementFeaturesXbc5f19a8Branch.CustomerSessionResourceComponentsResourcePaymentElementResourceFeatures)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCustomerSessionResourceComponentsResourcePaymentElementFeaturesXbc5f19a8 {
      val inspection = inspectInlineCustomerSessionResourceComponentsResourcePaymentElementFeaturesXbc5f19a8(raw)
      if (inspection.matchCount == 0) {
        throw InlineCustomerSessionResourceComponentsResourcePaymentElementFeaturesXbc5f19a8NoMatchException("InlineCustomerSessionResourceComponentsResourcePaymentElementFeaturesXbc5f19a8 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCustomerSessionResourceComponentsResourcePaymentElementFeaturesXbc5f19a8(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineCustomerSessionResourceComponentsResourcePaymentElementFeaturesXbc5f19a8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCustomerSessionResourceComponentsResourcePaymentElementFeaturesXbc5f19a8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCustomerSessionResourceComponentsResourcePaymentElementFeaturesXbc5f19a8")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCustomerSessionResourceComponentsResourcePaymentElementFeaturesXbc5f19a8) {
      encoder.requireJsonEncoder("InlineCustomerSessionResourceComponentsResourcePaymentElementFeaturesXbc5f19a8").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCustomerSessionResourceComponentsResourcePaymentElementFeaturesXbc5f19a8(element: JsonElement): InlineCustomerSessionResourceComponentsResourcePaymentElementFeaturesXbc5f19a8Inspection {
  val raw = element as? JsonObject ?: return InlineCustomerSessionResourceComponentsResourcePaymentElementFeaturesXbc5f19a8Inspection(
    matchesCustomerSessionResourceComponentsResourcePaymentElementResourceFeatures = false,
    failures = listOf("CustomerSessionResourceComponentsResourcePaymentElementResourceFeatures: expected JSON object"),
  )
  val matchesCustomerSessionResourceComponentsResourcePaymentElementResourceFeatures = raw["payment_method_allow_redisplay_filters"] != null && raw["payment_method_redisplay"] != null && raw["payment_method_remove"] != null && raw["payment_method_save"] != null
  return InlineCustomerSessionResourceComponentsResourcePaymentElementFeaturesXbc5f19a8Inspection(
    matchesCustomerSessionResourceComponentsResourcePaymentElementResourceFeatures = matchesCustomerSessionResourceComponentsResourcePaymentElementResourceFeatures,
    failures = buildList {
      if (!matchesCustomerSessionResourceComponentsResourcePaymentElementResourceFeatures) add("CustomerSessionResourceComponentsResourcePaymentElementResourceFeatures: required properties 'payment_method_allow_redisplay_filters', 'payment_method_redisplay', 'payment_method_remove', 'payment_method_save' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
